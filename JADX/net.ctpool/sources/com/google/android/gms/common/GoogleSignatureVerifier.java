package com.google.android.gms.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.errorprone.annotations.RestrictedInheritance;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@ShowFirstParty
@KeepForSdk
@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms/common/testing/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
public class GoogleSignatureVerifier {
    private static GoogleSignatureVerifier zza;
    private static volatile Set zzb;
    private final Context zzc;
    private volatile String zzd;

    public GoogleSignatureVerifier(Context context) {
        this.zzc = context.getApplicationContext();
    }

    @KeepForSdk
    public static GoogleSignatureVerifier getInstance(Context context) {
        Preconditions.checkNotNull(context);
        synchronized (GoogleSignatureVerifier.class) {
            try {
                if (zza == null) {
                    o.e(context);
                    zza = new GoogleSignatureVerifier(context);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zza;
    }

    static final k zza(PackageInfo packageInfo, k... kVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            l lVar = new l(packageInfo.signatures[0].toByteArray());
            for (int i7 = 0; i7 < kVarArr.length; i7++) {
                if (kVarArr[i7].equals(lVar)) {
                    return kVarArr[i7];
                }
            }
        }
        return null;
    }

    public static final boolean zzb(PackageInfo packageInfo, boolean z6) {
        PackageInfo packageInfo2;
        if (!z6) {
            packageInfo2 = packageInfo;
        } else if (packageInfo != null) {
            if ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z6 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
            }
            packageInfo2 = packageInfo;
        } else {
            packageInfo2 = null;
        }
        if (packageInfo != null && packageInfo2.signatures != null) {
            k[] kVarArr = n.f13733a;
            if ((z6 ? zza(packageInfo2, kVarArr) : zza(packageInfo2, kVarArr[0])) != null) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    private final q zzc(String str, boolean z6, boolean z7) {
        q qVarC;
        ApplicationInfo applicationInfo;
        String str2 = "null pkg";
        if (str == null) {
            return q.c("null pkg");
        }
        if (str.equals(this.zzd)) {
            return q.b();
        }
        if (o.g()) {
            qVarC = o.b(str, GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzc), false, false);
        } else {
            try {
                PackageInfo packageInfo = this.zzc.getPackageManager().getPackageInfo(str, 64);
                boolean zHonorsDebugCertificates = GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzc);
                if (packageInfo != null) {
                    Signature[] signatureArr = packageInfo.signatures;
                    if (signatureArr == null || signatureArr.length != 1) {
                        str2 = "single cert required";
                    } else {
                        l lVar = new l(packageInfo.signatures[0].toByteArray());
                        String str3 = packageInfo.packageName;
                        q qVarA = o.a(str3, lVar, zHonorsDebugCertificates, false);
                        if (!qVarA.f13743a || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0 || !o.a(str3, lVar, false, true).f13743a) {
                            qVarC = qVarA;
                        } else {
                            str2 = "debuggable release cert app rejected";
                        }
                    }
                    qVarC = q.c(str2);
                } else {
                    qVarC = q.c(str2);
                }
            } catch (PackageManager.NameNotFoundException e7) {
                return q.d("no pkg ".concat(str), e7);
            }
        }
        if (qVarC.f13743a) {
            this.zzd = str;
        }
        return qVarC;
    }

    @KeepForSdk
    public boolean isGooglePublicSignedPackage(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (zzb(packageInfo, false)) {
            return true;
        }
        if (zzb(packageInfo, true)) {
            if (GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzc)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    @ShowFirstParty
    @KeepForSdk
    public boolean isPackageGoogleSigned(String str) {
        q qVarZzc = zzc(str, false, false);
        qVarZzc.e();
        return qVarZzc.f13743a;
    }

    @ShowFirstParty
    @KeepForSdk
    public boolean isUidGoogleSigned(int i7) {
        q qVarC;
        int length;
        String[] packagesForUid = this.zzc.getPackageManager().getPackagesForUid(i7);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            qVarC = null;
            int i8 = 0;
            while (true) {
                if (i8 >= length) {
                    Preconditions.checkNotNull(qVarC);
                    break;
                }
                qVarC = zzc(packagesForUid[i8], false, false);
                if (qVarC.f13743a) {
                    break;
                }
                i8++;
            }
        } else {
            qVarC = q.c("no pkgs");
        }
        qVarC.e();
        return qVarC.f13743a;
    }
}
