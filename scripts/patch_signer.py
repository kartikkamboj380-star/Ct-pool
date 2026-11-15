#!/usr/bin/env python3
"""
patch_signer.py - Patch the installed apk_sign_ts package.

apk_sign_ts v1.0.1 has a bug: `ApkSigner.sanitizeApk` and `V1Signer.sign`
skip EVERY entry whose name starts with `META-INF/`. That is meant to strip
old signature files, but it also deletes legitimate content entries such as
`META-INF/services/*` (Java ServiceLoader registrations), `META-INF/*.version`
metadata and gradle/tenjin property files — entries the original APK contains
and the app may depend on at runtime.

This patch narrows the filter to actual JAR signature files only:
  META-INF/MANIFEST.MF, META-INF/<name>.{SF,RSA,DSA,EC}, META-INF/SIG-*

Usage: patch_signer.py <path-to-apk_sign_ts-package-dir>
Exits non-zero if the expected patterns are not found (so builds fail loudly
if a future version changes the code).
"""
import os
import re
import sys

MARKER = "/* CTPool-patch: signature-only META-INF filter */"

SIG_TEST = (
    "/^META-INF\\/(?:MANIFEST\\.MF|[^\\/]+\\.(?:SF|RSA|DSA|EC)|SIG-.+)$/i"
    ".test(entry.name)"
)


def die(msg):
    print(f"ERROR: {msg}", file=sys.stderr)
    sys.exit(1)


def patch_file(path, patterns):
    src = open(path, encoding="utf-8").read()
    if MARKER in src:
        print(f"  already patched: {os.path.basename(path)}")
        return
    applied = 0
    for old, new in patterns:
        if old in src:
            src = src.replace(old, new, 1)
            applied += 1
    if applied == 0:
        die(f"{path}: none of the expected patterns found — apk_sign_ts "
            "version changed; update scripts/patch_signer.py")
    open(path, "w", encoding="utf-8").write(src)
    print(f"  patched {os.path.basename(path)} ({applied} replacement(s))")


def main():
    if len(sys.argv) != 2:
        print(__doc__)
        sys.exit(2)
    pkg = sys.argv[1]
    dist = os.path.join(pkg, "dist")
    if not os.path.isdir(dist):
        die(f"not an apk_sign_ts package dir: {pkg}")

    # ApkSigner.sanitizeApk: multi-line block form
    patch_file(os.path.join(dist, "ApkSigner.js"), [(
        "if (entry.name.startsWith('META-INF/')) {\n"
        "                continue;\n"
        "            }",
        f"{MARKER}\n"
        "            if (entry.name.endsWith('/')) {\n"
        "                continue;\n"
        "            }\n"
        f"            if ({SIG_TEST}) {{\n"
        "                continue;\n"
        "            }",
    )])

    # V1Signer.sign: single-line form (an endsWith('/') skip already follows)
    patch_file(os.path.join(dist, "V1Signer.js"), [(
        "if (entry.name.startsWith('META-INF/'))\n"
        "                continue;",
        f"{MARKER}\n"
        f"            if ({SIG_TEST})\n"
        "                continue;",
    )])

    print("apk_sign_ts patched: META-INF content entries are now preserved "
          "and covered by the v1 manifest.")


if __name__ == "__main__":
    main()
