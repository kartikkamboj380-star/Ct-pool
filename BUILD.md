# Building the CTPool app from decompiled sources

This repo contains the full decompiled source of CTPool (`APKTOOL/FULL/` —
apktool smali + resources, `JADX/` — decompiled Java, `EXTRACTED/` — original
split APKs, `ORIGINAL/CTPool.xapk`). `scripts/build_app.sh` rebuilds a
**working, signed app** from those sources.

## Artifacts (in `dist/`)

| File | What it is |
|---|---|
| `CTPool_1.0.25_universal_arm64.apk` | Single-file APK: base + all 54 arm64 native libs merged in. `adb install` it directly. |
| `CTPool_1.0.25_REBUILT.xapk` | Original XAPK layout (base + 4 config splits + `manifest.json`), rebuilt and signed — install with any XAPK-aware installer (e.g. APKPure-style). |
| `SHA256SUMS.txt` | SHA-256 checksums of both. |

Install (single APK):

```bash
adb install dist/CTPool_1.0.25_universal_arm64.apk
```

> **Signature note:** the rebuilt APKs are signed with a fresh self-signed
> build certificate (`signing/*.pem`, auto-generated, gitignored). If the
> original CTPool is installed from Play/ApkPure, **uninstall it first** —
> Android will refuse to update an installed app with a different signature.

> **Universal APK scope:** the universal variant merges the `config.arm64_v8a`
> native libs into the base. The tiny `config.en` / `config.fr` / `config.mdpi`
> resource overlays are *not* merged (they are inside the XAPK); the app falls
> back to base resources, which is the normal Android resource behavior.

## Pipeline (`scripts/build_app.sh`)

1. Stage `APKTOOL/FULL/*` into a temp work dir (repo sources are never
   modified) — adds missing `usesFramework` metadata to `config.arm64_v8a`.
2. `apktool b` rebuilds the 5 split APKs, plus a *universal* variant of the
   base with `android:requiredSplitTypes` stripped so it installs standalone.
3. `scripts/prepare_apk.py` — zip-aligns (`.so` @ 4096, `resources.arsc` @ 4),
   injects `stamp-cert-sha256`, and merges the arm64 `lib/` into the universal
   APK (stored uncompressed).
4. `scripts/patch_signer.py` narrows apk_sign_ts's overly aggressive
   `META-INF/` strip (it used to delete `META-INF/services/*`, `*.version`
   metadata etc.) to actual signature files only, then
   `scripts/sign_apk.mjs` signs every APK with **JAR v1 + v2 + v3**
   (SHA-256) using [`apk_sign_ts`](https://www.npmjs.com/package/apk_sign_ts).
5. Verification of every APK:
   - `scripts/verify_apk.py` — CRCs, unsafe paths, required alignment, every
     v1 manifest digest, the PKCS7 signature over `CERT.SF` (crypto-level),
     and an **entry-set check**: every pre-sign entry must survive signing;
   - `apksigtool verify` — crypto verification of the v2/v3 signing block.
6. Packages `dist/` artifacts + checksums.

## Prerequisites

- Java 11+ (`JAVA_HOME` or on `PATH`)
- Node.js 18+ (the script npm-installs `apk_sign_ts` into the work dir if
  `APK_SIGN_TS_DIR` is not set)
- Python 3 with `pip install apksigtool asn1crypto cryptography`
- `openssl`, `unzip`

## Run

```bash
bash scripts/build_app.sh
```

All intermediates live in `/tmp/ctpool-build` (override with `WORK=...`);
outputs land in `dist/`.
