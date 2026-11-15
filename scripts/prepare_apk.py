#!/usr/bin/env python3
"""
prepare_apk.py - Pre-signing preparation for rebuilt APKs.

1. zip-aligns entries the same way Android's `zipalign -p 4` would:
   - STORED native libs (lib/**.so)  -> 4096-byte boundary (page alignment)
   - all other STORED entries        -> 4-byte boundary
2. optionally injects extra files before signing (--add-dir), e.g. native
   libraries for a universal APK, stored uncompressed.
3. optionally (re)generates `stamp-cert-sha256` from the signer certificate
   (bundletool-style: base64(sha256(cert DER))).

Compression, CRC and content of every existing entry are preserved byte-for-byte.

Usage:
  prepare_apk.py IN.apk OUT.apk [--stamp-cert CERT.pem] [--add-dir DIR]...
"""
import argparse
import base64
import hashlib
import os
import struct
import sys
import zipfile


def load_pem_cert_der(path):
    data = open(path, "rb").read()
    if b"-----BEGIN CERTIFICATE-----" in data:
        b64 = data.split(b"-----BEGIN CERTIFICATE-----", 1)[1]
        b64 = b64.split(b"-----END CERTIFICATE-----", 1)[0]
        return base64.b64decode(b64)
    return data  # assume raw DER


def collect_entries(apk_path, stamp_der=None, add_dirs=()):
    """Ordered dict: name -> dict(method, crc, usize, data, extra, date_time)."""
    entries = {}
    order = []
    with open(apk_path, "rb") as f:
        raw = f.read()
    zf = zipfile.ZipFile(apk_path)
    for info in zf.infolist():
        lh = raw[info.header_offset:info.header_offset + 30]
        if lh[:4] != b"PK\x03\x04":
            raise SystemExit(f"bad local header for {info.filename}")
        nlen, elen = struct.unpack("<HH", lh[26:30])
        data_start = info.header_offset + 30 + nlen + elen
        data = raw[data_start:data_start + info.compress_size]
        local_extra = raw[info.header_offset + 30 + nlen:data_start]
        if info.compress_type == zipfile.ZIP_STORED and len(data) != info.file_size:
            raise SystemExit(f"size mismatch for {info.filename}")
        entries[info.filename] = dict(
            method=info.compress_type, crc=info.CRC, usize=info.file_size,
            data=data, local_extra=bytes(local_extra),
            central_extra=bytes(info.extra), date_time=info.date_time,
        )
        order.append(info.filename)

    def inject(name, blob, store=True):
        nonlocal order
        e = dict(method=zipfile.ZIP_STORED if store else zipfile.ZIP_DEFLATED,
                 crc=zlib_crc32(blob), usize=len(blob), data=blob,
                 local_extra=b"", central_extra=b"",
                 date_time=(2020, 1, 1, 0, 0, 0))
        if name in entries:
            entries[name] = e
        else:
            entries[name] = e
            order.append(name)

    if add_dirs:
        for d in add_dirs:
            d = os.path.abspath(d)
            base = os.path.basename(d.rstrip("/"))
            for root, _, files in os.walk(d):
                for fn in sorted(files):
                    full = os.path.join(root, fn)
                    rel = os.path.relpath(full, os.path.dirname(d))
                    with open(full, "rb") as f:
                        inject(rel, f.read(), store=True)

    if stamp_der is not None:
        stamp = base64.b64encode(hashlib.sha256(stamp_der).digest())
        inject("stamp-cert-sha256", stamp, store=True)

    return entries, order


def zlib_crc32(data):
    import zlib
    return zlib.crc32(data) & 0xFFFFFFFF


def pad_extra_for_align(current_len, target):
    """
    Return extra bytes to append so that (current_len + len(pad)) % target == 0.
    Uses a benign unknown extra subfield (id 0xd935, as used by Android tooling)
    so parsers skip it safely. Returns b'' when already aligned.
    """
    r = current_len % target
    if r == 0:
        return b""
    total = target - r
    if total < 4:
        total += target  # need at least the 4-byte subfield header
    body = total - 4
    return struct.pack("<HH", 0xD935, body) + b"\x00" * body


def build_zip(entries, order, out_path):
    out = bytearray()
    cds = bytearray()
    count = 0
    for name in order:
        e = entries[name]
        name_b = name.encode("utf-8")
        flag = 0x0800
        extra = e["local_extra"]
        if e["method"] == zipfile.ZIP_STORED:
            target = 4096 if name.endswith(".so") else 4
            pad = pad_extra_for_align(len(out) + 30 + len(name_b) + len(extra), target)
            extra = extra + pad
        header_off = len(out)
        out += struct.pack("<IHHHHHIIIHH", 0x04034B50, 20, flag, e["method"],
                           0, 0, e["crc"], len(e["data"]), e["usize"],
                           len(name_b), len(extra))
        out += name_b + extra + e["data"]
        data_off = header_off  # central dir stores local-header offset
        # central header: sig, ver_made, ver_need, flag, method, time, date,
        # crc, csize, usize, nlen, elen, comment_len, disk, int_attr, ext_attr, offset
        cds += struct.pack("<IHHHHHHIIIHHHHHII",
                           0x02014B50, 0x0314, 20, flag, e["method"], 0, 0,
                           e["crc"], len(e["data"]), e["usize"],
                           len(name_b), len(e["central_extra"]), 0, 0, 0, 0,
                           data_off)
        cds += name_b + e["central_extra"]
        count += 1
    cd_off = len(out)
    out += cds
    eocd = struct.pack("<IHHHHIIH", 0x06054B50, 0, 0, count, count,
                       len(cds), cd_off, 0)
    out += eocd
    with open(out_path, "wb") as f:
        f.write(out)


def verify_alignment(path):
    ok = True
    zf = zipfile.ZipFile(path)
    with open(path, "rb") as f:
        raw = f.read()
    report = {"so_4096": 0, "stored_4": 0, "bad": []}
    for info in zf.infolist():
        lh = raw[info.header_offset:info.header_offset + 30]
        nlen, elen = struct.unpack("<HH", lh[26:30])
        off = info.header_offset + 30 + nlen + elen
        if info.filename.endswith(".so") and info.compress_type == zipfile.ZIP_STORED:
            report["so_4096"] += 1
            if off % 4096:
                report["bad"].append((info.filename, off))
                ok = False
        elif info.compress_type == zipfile.ZIP_STORED:
            report["stored_4"] += 1
            if off % 4:
                report["bad"].append((info.filename, off))
                ok = False
    # integrity
    bad = zf.testzip()
    if bad:
        report["bad"].append(("crc", bad))
        ok = False
    return ok, report


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("inp")
    ap.add_argument("out")
    ap.add_argument("--stamp-cert", help="PEM or DER signer certificate")
    ap.add_argument("--add-dir", action="append", default=[],
                    help="directory whose files are injected (paths relative "
                         "to the directory's parent), stored uncompressed")
    args = ap.parse_args()

    stamp_der = None
    if args.stamp_cert:
        stamp_der = load_pem_cert_der(args.stamp_cert)

    entries, order = collect_entries(args.inp, stamp_der, args.add_dir)
    build_zip(entries, order, args.out)

    ok, rep = verify_alignment(args.out)
    print(f"prepared {args.out}: {len(order)} entries, "
          f".so@4096={rep['so_4096']}, stored@4={rep['stored_4']}")
    if not ok:
        print("ALIGNMENT/CRC PROBLEMS:", rep["bad"], file=sys.stderr)
        sys.exit(1)


if __name__ == "__main__":
    main()
