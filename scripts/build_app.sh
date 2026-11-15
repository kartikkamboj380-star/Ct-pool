#!/usr/bin/env bash
# build_app.sh - Build the CTPool app from the decompiled sources in APKTOOL/FULL.
#
# Pipeline:  apktool build (5 splits)  ->  universal APK assembly (arm64)
#            ->  zipalign + stamp-cert  ->  v1+v2+v3 signing  ->  verify
#            ->  pack XAPK + dist artifacts
#
# Requirements:
#   - java (11+), on PATH or via JAVA_HOME
#   - node (18+) with apk_sign_ts installed, or set APK_SIGN_TS_DIR to the
#     apk_sign_ts package dir (build script npm-installs it into the work dir
#     automatically when not provided)
#   - python3 with:  pip install apksigtool asn1crypto cryptography
#     (apksigtool optional but recommended - full v2/v3 verification)
#   - openssl (for self-signed build certificate generation)
#
# All intermediate files live in a work dir (default /tmp/ctpool-build);
# the repository sources are never modified.
set -euo pipefail

REPO="$(cd "$(dirname "$0")/.." && pwd)"
WORK="${WORK:-/tmp/ctpool-build}"
DIST="$REPO/dist"
SRC="$REPO/APKTOOL/FULL"
SIGN_DIR="$REPO/signing"
APKTOOL_JAR="$REPO/TOOLS/apktool.jar"
SCRIPTS="$REPO/scripts"

JAVA_BIN="${JAVA_HOME:+$JAVA_HOME/bin/}java"
command -v "${JAVA_BIN%/}" >/dev/null 2>&1 || { echo "ERROR: java not found (set JAVA_HOME)"; exit 1; }
command -v node >/dev/null 2>&1 || { echo "ERROR: node not found"; exit 1; }
command -v python3 >/dev/null 2>&1 || { echo "ERROR: python3 not found"; exit 1; }
command -v openssl >/dev/null 2>&1 || { echo "ERROR: openssl not found"; exit 1; }

echo "==> [1/7] work dir + signing certificate"
rm -rf "$WORK"
mkdir -p "$WORK/unsigned" "$WORK/aligned" "$WORK/signed" "$DIST"
mkdir -p "$SIGN_DIR"
if [ ! -f "$SIGN_DIR/cert.pem" ] || [ ! -f "$SIGN_DIR/key.pem" ]; then
  echo "    generating self-signed build certificate (signing/*.pem, gitignored)"
  openssl req -x509 -newkey rsa:2048 -sha256 -days 7300 -nodes \
    -keyout "$SIGN_DIR/key.pem" -out "$SIGN_DIR/cert.pem" \
    -subj "/CN=CTPool Rebuild/O=CTPool" 2>/dev/null
fi

echo "==> [2/7] stage decoded sources to work dir (fixing missing usesFramework)"
SPLITS=(net.ctpool config.arm64_v8a config.en config.fr config.mdpi)
for s in "${SPLITS[@]}"; do
  cp -a "$SRC/$s" "$WORK/$s"
  rm -f "$WORK/$s/AndroidManifest.xml.orig"
  if ! grep -q "usesFramework" "$WORK/$s/apktool.yml"; then
    sed -i "s|^apkFileName: $s.apk|apkFileName: $s.apk\nusesFramework:\n  ids:\n  - 1|" "$WORK/$s/apktool.yml"
    echo "    $s: added usesFramework ids [1] to apktool.yml"
  fi
done
# universal variant = base decode with split requirements removed
cp -a "$SRC/net.ctpool" "$WORK/universal"
sed -i 's/ android:requiredSplitTypes="base__abi,base__density"//' "$WORK/universal/AndroidManifest.xml"
grep -q "requiredSplitTypes" "$WORK/universal/AndroidManifest.xml" \
  && { echo "ERROR: failed to strip requiredSplitTypes"; exit 1; }

echo "==> [3/7] apktool build (5 splits + universal)"
TARGETS=("${SPLITS[@]}" universal)
for t in "${TARGETS[@]}"; do
  echo "    building $t ..."
  "$JAVA_BIN" -jar "$APKTOOL_JAR" b "$WORK/$t" -o "$WORK/unsigned/$t.apk" >/dev/null
done

echo "==> [4/7] zipalign + stamp-cert + (universal: inject native libs)"
for t in "${SPLITS[@]}"; do
  python3 "$SCRIPTS/prepare_apk.py" "$WORK/unsigned/$t.apk" "$WORK/aligned/$t.apk" \
    --stamp-cert "$SIGN_DIR/cert.pem"
done
python3 "$SCRIPTS/prepare_apk.py" "$WORK/unsigned/universal.apk" "$WORK/aligned/universal.apk" \
  --stamp-cert "$SIGN_DIR/cert.pem" --add-dir "$SRC/config.arm64_v8a/lib"

echo "==> [5/7] sign (JAR v1 + v2 + v3, SHA-256)"
if [ -z "${APK_SIGN_TS_DIR:-}" ]; then
  if [ -d "$WORK/node_modules/apk_sign_ts" ]; then
    APK_SIGN_TS_DIR="$WORK/node_modules/apk_sign_ts"
  elif [ -d "$SCRIPTS/node_modules/apk_sign_ts" ]; then
    APK_SIGN_TS_DIR="$SCRIPTS/node_modules/apk_sign_ts"
  else
    echo "    installing apk_sign_ts into work dir ..."
    (cd "$WORK" && npm init -y >/dev/null 2>&1 && npm install --silent apk_sign_ts)
    APK_SIGN_TS_DIR="$WORK/node_modules/apk_sign_ts"
  fi
fi
LIB_ENTRY="$APK_SIGN_TS_DIR/dist/index.js"
[ -f "$LIB_ENTRY" ] || { echo "ERROR: apk_sign_ts not found at $APK_SIGN_TS_DIR"; exit 1; }
for t in "${SPLITS[@]}" universal; do
  node "$SCRIPTS/sign_apk.mjs" "$LIB_ENTRY" "$WORK/aligned/$t.apk" \
    "$WORK/signed/$t.apk" "$SIGN_DIR/key.pem" "$SIGN_DIR/cert.pem"
done

echo "==> [6/7] verify signatures, alignment, integrity"
for t in "${SPLITS[@]}" universal; do
  echo "    -- $t"
  python3 "$SCRIPTS/verify_apk.py" "$WORK/signed/$t.apk"
  if command -v apksigtool >/dev/null 2>&1; then
    apksigtool verify "$WORK/signed/$t.apk" >/dev/null && echo "    PASS apksigtool verify ($t)"
  else
    echo "    WARN apksigtool not installed - v2/v3 crypto verify skipped"
  fi
done

echo "==> [7/7] package dist artifacts"
cp "$WORK/signed/universal.apk" "$DIST/CTPool_1.0.25_universal_arm64.apk"
python3 - "$WORK" "$DIST" "$REPO" <<'EOF'
import json, sys, zipfile, os
work, dist, repo = sys.argv[1], sys.argv[2], sys.argv[3]
splits = ["net.ctpool.apk", "config.mdpi.apk", "config.fr.apk",
          "config.en.apk", "config.arm64_v8a.apk"]
manifest = json.load(open(os.path.join(repo, "EXTRACTED", "manifest.json")))
total = sum(os.path.getsize(os.path.join(work, "signed", s)) for s in splits)
manifest["total_size"] = total
out = os.path.join(dist, "CTPool_1.0.25_REBUILT.xapk")
with zipfile.ZipFile(out, "w", zipfile.ZIP_STORED) as z:
    for s in splits:
        z.write(os.path.join(work, "signed", s), arcname=s)
    z.writestr("manifest.json", json.dumps(manifest, separators=(",", ":")))
print(f"xapk: {out} ({os.path.getsize(out)} bytes, total_size={total})")
EOF

(cd "$DIST" && sha256sum CTPool_1.0.25_universal_arm64.apk CTPool_1.0.25_REBUILT.xapk > SHA256SUMS.txt)
echo
echo "BUILD COMPLETE. Artifacts in dist/:"
ls -la "$DIST"
echo
echo "Install:"
echo "  adb install dist/CTPool_1.0.25_universal_arm64.apk        # single APK (arm64)"
echo "  # or XAPK with all splits (APKPure-compatible installer):"
echo "  dist/CTPool_1.0.25_REBUILT.xapk"
