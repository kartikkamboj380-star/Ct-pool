package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class A7 implements B7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AbstractC1183q3 f14130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AbstractC1183q3 f14131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AbstractC1183q3 f14132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AbstractC1183q3 f14133d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AbstractC1183q3 f14134e;

    static {
        C1251y3 c1251y3E = new C1251y3(AbstractC1191r3.a("com.google.android.gms.measurement")).f().e();
        f14130a = c1251y3E.d("measurement.sgtm.google_signal.enable", false);
        f14131b = c1251y3E.d("measurement.sgtm.preview_mode_enabled", true);
        f14132c = c1251y3E.d("measurement.sgtm.rollout_percentage_fix", false);
        f14133d = c1251y3E.d("measurement.sgtm.service", true);
        f14134e = c1251y3E.d("measurement.sgtm.upload_queue", false);
        c1251y3E.b("measurement.id.sgtm", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.B7
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.B7
    public final boolean b() {
        return ((Boolean) f14133d.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.B7
    public final boolean c() {
        return ((Boolean) f14134e.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.B7
    public final boolean zzb() {
        return ((Boolean) f14130a.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.B7
    public final boolean zzc() {
        return ((Boolean) f14131b.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.B7
    public final boolean zzd() {
        return ((Boolean) f14132c.f()).booleanValue();
    }
}
