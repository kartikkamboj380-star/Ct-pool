package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.q6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1186q6 implements InterfaceC1194r6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AbstractC1183q3 f14797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AbstractC1183q3 f14798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AbstractC1183q3 f14799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AbstractC1183q3 f14800d;

    static {
        C1251y3 c1251y3E = new C1251y3(AbstractC1191r3.a("com.google.android.gms.measurement")).f().e();
        f14797a = c1251y3E.d("measurement.consent.stop_reset_on_storage_denied.client", true);
        f14798b = c1251y3E.d("measurement.consent.stop_reset_on_storage_denied.service", true);
        f14799c = c1251y3E.d("measurement.consent.scrub_audience_data_analytics_consent", true);
        f14800d = c1251y3E.d("measurement.consent.fix_first_open_count_from_snapshot", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1194r6
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1194r6
    public final boolean b() {
        return ((Boolean) f14800d.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1194r6
    public final boolean zzb() {
        return ((Boolean) f14797a.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1194r6
    public final boolean zzc() {
        return ((Boolean) f14798b.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1194r6
    public final boolean zzd() {
        return ((Boolean) f14799c.f()).booleanValue();
    }
}
