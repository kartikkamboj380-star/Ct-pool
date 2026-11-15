package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class z7 implements w7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AbstractC1183q3 f15012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AbstractC1183q3 f15013b;

    static {
        C1251y3 c1251y3E = new C1251y3(AbstractC1191r3.a("com.google.android.gms.measurement")).f().e();
        c1251y3E.d("measurement.client.sessions.background_sessions_enabled", true);
        f15012a = c1251y3E.d("measurement.client.sessions.enable_fix_background_engagement", false);
        c1251y3E.d("measurement.client.sessions.immediate_start_enabled_foreground", true);
        f15013b = c1251y3E.d("measurement.client.sessions.enable_pause_engagement_in_background", true);
        c1251y3E.d("measurement.client.sessions.remove_expired_session_properties_enabled", true);
        c1251y3E.d("measurement.client.sessions.session_id_enabled", true);
        c1251y3E.b("measurement.id.client.sessions.enable_fix_background_engagement", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.w7
    public final boolean a() {
        return ((Boolean) f15012a.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.w7
    public final boolean zzb() {
        return ((Boolean) f15013b.f()).booleanValue();
    }
}
