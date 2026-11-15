package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class B6 implements InterfaceC1254y6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AbstractC1183q3 f14141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AbstractC1183q3 f14142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AbstractC1183q3 f14143c;

    static {
        C1251y3 c1251y3E = new C1251y3(AbstractC1191r3.a("com.google.android.gms.measurement")).f().e();
        c1251y3E.d("measurement.dma_consent.client", true);
        c1251y3E.d("measurement.dma_consent.client_bow_check2", true);
        c1251y3E.d("measurement.dma_consent.separate_service_calls_fix", true);
        c1251y3E.d("measurement.dma_consent.service", true);
        f14141a = c1251y3E.d("measurement.dma_consent.service_database_update_fix", true);
        c1251y3E.d("measurement.dma_consent.service_dcu_event", true);
        f14142b = c1251y3E.d("measurement.dma_consent.service_dcu_event2", true);
        c1251y3E.d("measurement.dma_consent.service_npa_remote_default", true);
        c1251y3E.d("measurement.dma_consent.service_split_batch_on_consent", true);
        c1251y3E.d("measurement.dma_consent.set_consent_inline_on_worker", true);
        f14143c = c1251y3E.d("measurement.dma_consent.setting_npa_inline_fix", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1254y6
    public final boolean a() {
        return ((Boolean) f14141a.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1254y6
    public final boolean zzb() {
        return ((Boolean) f14142b.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1254y6
    public final boolean zzc() {
        return ((Boolean) f14143c.f()).booleanValue();
    }
}
