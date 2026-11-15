package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class I6 implements F6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AbstractC1183q3 f14223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AbstractC1183q3 f14224b;

    static {
        C1251y3 c1251y3E = new C1251y3(AbstractC1191r3.a("com.google.android.gms.measurement")).f().e();
        c1251y3E.d("measurement.client.ad_id_consent_fix", true);
        c1251y3E.d("measurement.service.consent.aiid_reset_fix", false);
        c1251y3E.d("measurement.service.consent.aiid_reset_fix2", true);
        c1251y3E.d("measurement.service.consent.app_start_fix", true);
        f14223a = c1251y3E.d("measurement.service.consent.params_on_fx", true);
        f14224b = c1251y3E.d("measurement.service.consent.pfo_on_fx", true);
    }

    @Override // com.google.android.gms.internal.measurement.F6
    public final boolean a() {
        return ((Boolean) f14223a.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.F6
    public final boolean zzb() {
        return ((Boolean) f14224b.f()).booleanValue();
    }
}
