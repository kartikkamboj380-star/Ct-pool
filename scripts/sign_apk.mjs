#!/usr/bin/env node
// sign_apk.mjs - Sign an APK (JAR v1 + APK Sig Scheme v2 + v3) using apk_sign_ts.
//
// Usage:
//   node sign_apk.mjs <apk_sign_ts/dist/index.js> <in.apk> <out.apk> <key.pem> <cert.pem>
import { readFileSync, writeFileSync } from "node:fs";
import { pathToFileURL } from "node:url";

const [libEntry, inApk, outApk, keyPem, certPem] = process.argv.slice(2);
if (!libEntry || !inApk || !outApk || !keyPem || !certPem) {
  console.error(
    "usage: node sign_apk.mjs <apk_sign_ts/dist/index.js> <in.apk> <out.apk> <key.pem> <cert.pem>"
  );
  process.exit(2);
}

const { ApkSigner, SigningKey } = await import(pathToFileURL(libEntry).href);

const apk = new Uint8Array(readFileSync(inApk));
const signingKey = SigningKey.fromPEM(
  readFileSync(keyPem, "utf8"),
  readFileSync(certPem, "utf8")
);

const signer = new ApkSigner({ signingKey, digestAlgorithm: "SHA-256" });
const { signedApk } = await signer.sign(apk);
writeFileSync(outApk, signedApk);
console.log(`signed: ${inApk} -> ${outApk} (${signedApk.length} bytes, v1+v2+v3)`);
