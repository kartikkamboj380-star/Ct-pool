package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.p6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1177p6 implements InterfaceC1150m6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AbstractC1183q3 f14784a;

    static {
        C1251y3 c1251y3E = new C1251y3(AbstractC1191r3.a("com.google.android.gms.measurement")).f().e();
        c1251y3E.d("measurement.client.consent_state_v1", true);
        c1251y3E.d("measurement.client.3p_consent_state_v1", true);
        c1251y3E.d("measurement.service.consent_state_v1_W36", true);
        f14784a = c1251y3E.b("measurement.service.storage_consent_support_version", 203600L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1150m6
    public final long a() {
        return ((Long) f14784a.f()).longValue();
    }
}
