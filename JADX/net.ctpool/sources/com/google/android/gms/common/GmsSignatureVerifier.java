package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.common.AbstractC1031h;
import com.google.errorprone.annotations.RestrictedInheritance;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
@ShowFirstParty
@KeepForSdk
@RestrictedInheritance(allowedOnPath = ".*javatests/com/google/android/gmscore/integ/client/common/robolectric/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
public class GmsSignatureVerifier {
    private static final d zza;
    private static final d zzb;
    private static final HashMap zzc;

    static {
        s sVar = new s();
        sVar.d("com.google.android.gms");
        sVar.a(204200000L);
        m mVar = o.f13737d;
        sVar.c(AbstractC1031h.t(mVar.j0(), o.f13735b.j0()));
        m mVar2 = o.f13736c;
        sVar.b(AbstractC1031h.t(mVar2.j0(), o.f13734a.j0()));
        zza = sVar.e();
        s sVar2 = new s();
        sVar2.d("com.android.vending");
        sVar2.a(82240000L);
        sVar2.c(AbstractC1031h.s(mVar.j0()));
        sVar2.b(AbstractC1031h.s(mVar2.j0()));
        zzb = sVar2.e();
        zzc = new HashMap();
    }
}
