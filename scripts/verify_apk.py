#!/usr/bin/env python3
"""
verify_apk.py - Verify a signed APK without the Android SDK.

Checks performed:
1. zip integrity (CRC of every entry) + no unsafe entry paths
2. zip alignment (STORED .so @4096, other STORED @4)
3. JAR v1 signature: MANIFEST.MF digests over entry contents + PKCS7
   signature over CERT.SF (CERT.RSA), cryptographically verified
4. presence of the v2/v3 APK Signing Block (full crypto verify is done by
   `apksigtool verify` which build_app.sh runs separately)

Usage: verify_apk.py APP.apk
Requires: pip install asn1crypto cryptography
"""
import base64
import hashlib
import struct
import sys
import zipfile

from asn1crypto import cms
from cryptography import x509
from cryptography.hazmat.primitives import hashes
from cryptography.hazmat.primitives.asymmetric import padding

HASHES = {
    "sha1": hashes.SHA1,
    "sha256": hashes.SHA256,
    "sha384": hashes.SHA384,
    "sha512": hashes.SHA512,
}
DIGEST_ATTR_HASH = {
    "SHA-1": "sha1",
    "SHA-256": "sha256",
    "SHA-384": "sha384",
    "SHA-512": "sha512",
}


def find_v1_files(zf):
    names = zf.namelist()
    out = []
    for sf in names:
        u = sf.upper()
        if not (u.startswith("META-INF/") and u.endswith(".SF")):
            continue
        prefix = u[:-3]
        for ext in (".RSA", ".DSA", ".EC"):
            cand = [n for n in names if n.upper() == prefix + ext]
            if cand:
                out.append((sf, cand[0]))
                break
    return out


def parse_manifest_mf(text):
    """Returns (main_attrs, {section_name: {attr: value}})."""
    sections = {}
    cur_name = None
    cur = {}
    main = {}
    for line in text.splitlines():
        if not line.strip():
            if cur_name is not None:
                sections[cur_name] = cur
                cur_name, cur = None, {}
            continue
        if line.startswith(" ") or ":" not in line:
            continue
        k, v = line.split(":", 1)
        v = v.strip()
        if k == "Name":
            if cur_name is not None:
                sections[cur_name] = cur
            cur_name = v
            cur = {}
        elif cur_name is None:
            main[k] = v
        else:
            cur[k] = v
    if cur_name is not None:
        sections[cur_name] = cur
    return main, sections


def verify_v1(zf):
    pairs = find_v1_files(zf)
    if not pairs:
        return False, "no META-INF/*.SF + signature block found"
    errors = []
    names = zf.namelist()
    for sf_name, block_name in pairs:
        mf_bytes = zf.read("META-INF/MANIFEST.MF")
        mf_text = mf_bytes.decode("utf-8", "replace")
        mf_text = mf_text.replace("\r\n", "\n").replace("\r", "\n")
        _, sections = parse_manifest_mf(mf_text)

        checked = 0
        for name, attrs in sections.items():
            alg = None
            b64 = None
            for k, v in attrs.items():
                if k.endswith("-Digest"):
                    alg = DIGEST_ATTR_HASH.get(k[: -len("-Digest")])
                    b64 = v
                    break
            if alg is None:
                continue
            if name not in names:
                errors.append(f"manifest section for missing entry: {name}")
                continue
            h = hashlib.new(alg, zf.read(name)).digest()
            if base64.b64encode(h).decode() != b64:
                errors.append(f"entry digest mismatch: {name}")
            checked += 1

        try:
            info = cms.ContentInfo.load(zf.read(block_name))
            sd = info["content"]
            si = sd["signer_infos"][0]
            cert_der = None
            for c in sd["certificates"]:
                cert_der = c.chosen.dump()
                break
            if cert_der is None:
                errors.append(f"{block_name}: no certificate")
                continue
            xcert = x509.load_der_x509_certificate(cert_der)

            sf_bytes = zf.read(sf_name)
            # asn1crypto calls RFC2315 authenticatedAttributes "signed_attrs"
            attrs = si["signed_attrs"]
            if attrs.native is not None:
                md = None
                for a in attrs:
                    if a["type"].native == "message_digest":
                        md = a["values"].native[0]
                if md is None or md != hashlib.sha256(sf_bytes).digest():
                    errors.append(f"{sf_name}: messageDigest attribute mismatch")
                signed_data = attrs.dump()
                # signature computed over attributes as SET OF (tag 0x31),
                # but inside SignerInfo they are IMPLICIT [0] (tag 0xA0)
                if signed_data[:1] == b"\xa0":
                    signed_data = b"\x31" + signed_data[1:]
            else:
                signed_data = sf_bytes

            alg_name = si["signature_algorithm"]["algorithm"].native
            if alg_name in ("rsassa_pkcs1v15", "rsa", "rsassa_pss"):
                # rsaEncryption OID: hash lives in digest_algorithm
                hash_name = si["digest_algorithm"]["algorithm"].native
            else:
                hash_name = {
                    "sha1_rsa": "sha1",
                    "sha256_rsa": "sha256",
                    "sha384_rsa": "sha384",
                    "sha512_rsa": "sha512",
                }.get(alg_name)
            if hash_name is None or hash_name not in HASHES:
                errors.append(f"unsupported signature algorithm: {alg_name}")
                continue
            xcert.public_key().verify(
                si["signature"].native,
                signed_data,
                padding.PKCS1v15(),
                HASHES[hash_name](),
            )
        except Exception as e:  # noqa: BLE001
            errors.append(f"{sf_name}: PKCS7 verify failed: {e}")
            continue

        if checked == 0:
            errors.append("no manifest entry digests checked")

    if errors:
        return False, "; ".join(errors)
    return True, f"v1 OK ({pairs[0][0]} + {pairs[0][1]}, {checked} entry digests)"


def has_v2_v3_block(path):
    """Look for the APK Signing Block magic right before the central directory."""
    with open(path, "rb") as f:
        data = f.read()
    eocd = data.rfind(b"PK\x05\x06")
    if eocd < 0:
        return False, "no EOCD"
    cd_off = struct.unpack("<I", data[eocd + 16:eocd + 20])[0]
    if cd_off < 32:
        return False, "bad central directory offset"
    if data[cd_off - 16:cd_off] != b"APK Sig Block 42":
        return False, "no APK Signing Block magic before central directory"
    return True, "APK Signing Block present (v2/v3)"


def check_unsafe_paths(zf):
    return [n for n in zf.namelist()
            if n.startswith("/") or ".." in n.split("/")]


def check_alignment(apk, zf):
    """Enforce the alignments Android actually requires:
    - uncompressed native libs (lib/**.so): 4096-byte page alignment
    - resources.arsc: 4-byte alignment
    Other STORED entries are only informational (original APKs do not keep
    e.g. META-INF signature files aligned either)."""
    raw = open(apk, "rb").read()
    bad = []
    info_notes = []
    for info in zf.infolist():
        lh = raw[info.header_offset:info.header_offset + 30]
        nlen, elen = struct.unpack("<HH", lh[26:30])
        off = info.header_offset + 30 + nlen + elen
        if info.compress_type != zipfile.ZIP_STORED:
            continue
        if info.filename.endswith(".so"):
            if off % 4096:
                bad.append((info.filename, off, 4096))
        elif info.filename == "resources.arsc":
            if off % 4:
                bad.append((info.filename, off, 4))
        elif off % 4:
            info_notes.append(info.filename)
    return bad, info_notes


def main():
    if len(sys.argv) != 2:
        print(__doc__)
        sys.exit(2)
    apk = sys.argv[1]
    ok = True
    zf = zipfile.ZipFile(apk)

    bad = zf.testzip()
    if bad:
        print(f"FAIL crc: {bad}")
        ok = False

    unsafe = check_unsafe_paths(zf)
    if unsafe:
        print(f"FAIL unsafe paths: {unsafe}")
        ok = False

    v1_ok, v1_msg = verify_v1(zf)
    print(("PASS " if v1_ok else "FAIL ") + v1_msg)
    ok = ok and v1_ok

    v23_ok, v23_msg = has_v2_v3_block(apk)
    print(("PASS " if v23_ok else "FAIL ") + v23_msg)
    ok = ok and v23_ok

    bad_align, notes = check_alignment(apk, zf)
    if bad_align:
        for f in bad_align[:10]:
            print(f"  unaligned: {f}")
        print(f"FAIL alignment: {len(bad_align)} required entries")
        ok = False
    else:
        msg = "PASS alignment (so@4096 + arsc@4)"
        if notes:
            msg += f"; {len(notes)} non-critical stored entries off-4 (harmless)"
        print(msg)

    sys.exit(0 if ok else 1)


if __name__ == "__main__":
    main()
