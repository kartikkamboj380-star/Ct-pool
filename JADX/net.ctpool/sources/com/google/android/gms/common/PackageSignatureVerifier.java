package com.google.android.gms.common;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.errorprone.annotations.RestrictedInheritance;

/* JADX INFO: loaded from: classes.dex */
@ShowFirstParty
@KeepForSdk
@RestrictedInheritance(allowedOnPath = ".*javatests.*/com/google/android/gms/common/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
public class PackageSignatureVerifier {
    static volatile e zza;
    private static f zzb;

    private static f zza(Context context) {
        f fVar;
        synchronized (PackageSignatureVerifier.class) {
            try {
                if (zzb == null) {
                    zzb = new f(context);
                }
                fVar = zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }

    @ShowFirstParty
    @KeepForSdk
    public PackageVerificationResult queryPackageSignatureVerified(Context context, String str) {
        boolean zHonorsDebugCertificates = GooglePlayServicesUtilLight.honorsDebugCertificates(context);
        zza(context);
        if (!o.f()) {
            throw new zzae();
        }
        String strConcat = String.valueOf(str).concat(true != zHonorsDebugCertificates ? "-0" : "-1");
        if (zza == null || !zza.f13667a.equals(strConcat)) {
            zza(context);
            q qVarC = o.c(str, zHonorsDebugCertificates, false, false);
            if (!qVarC.f13743a) {
                Preconditions.checkNotNull(qVarC.f13744b);
                return PackageVerificationResult.zza(str, qVarC.f13744b, qVarC.f13745c);
            }
            zza = new e(strConcat, PackageVerificationResult.zzd(str, qVarC.f13746d));
        }
        return zza.f13668b;
    }

    @ShowFirstParty
    @KeepForSdk
    public PackageVerificationResult queryPackageSignatureVerifiedWithRetry(Context context, String str) {
        try {
            PackageVerificationResult packageVerificationResultQueryPackageSignatureVerified = queryPackageSignatureVerified(context, str);
            packageVerificationResultQueryPackageSignatureVerified.zzb();
            return packageVerificationResultQueryPackageSignatureVerified;
        } catch (SecurityException e7) {
            PackageVerificationResult packageVerificationResultQueryPackageSignatureVerified2 = queryPackageSignatureVerified(context, str);
            if (!packageVerificationResultQueryPackageSignatureVerified2.zzc()) {
                return packageVerificationResultQueryPackageSignatureVerified2;
            }
            Log.e("PkgSignatureVerifier", "Got flaky result during package signature verification", e7);
            return packageVerificationResultQueryPackageSignatureVerified2;
        }
    }
}
