package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class J6 implements K6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AbstractC1183q3 f14227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AbstractC1183q3 f14228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AbstractC1183q3 f14229c;

    static {
        C1251y3 c1251y3E = new C1251y3(AbstractC1191r3.a("com.google.android.gms.measurement")).f().e();
        c1251y3E.d("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f14227a = c1251y3E.d("measurement.audience.refresh_event_count_filters_timestamp", false);
        f14228b = c1251y3E.d("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f14229c = c1251y3E.d("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // com.google.android.gms.internal.measurement.K6
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.K6
    public final boolean zzb() {
        return ((Boolean) f14227a.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.K6
    public final boolean zzc() {
        return ((Boolean) f14228b.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.K6
    public final boolean zzd() {
        return ((Boolean) f14229c.f()).booleanValue();
    }
}
