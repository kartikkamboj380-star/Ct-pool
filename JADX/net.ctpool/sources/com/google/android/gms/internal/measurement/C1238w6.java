package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.w6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1238w6 implements InterfaceC1246x6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AbstractC1183q3 f14956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AbstractC1183q3 f14957b;

    static {
        C1251y3 c1251y3E = new C1251y3(AbstractC1191r3.a("com.google.android.gms.measurement")).f().e();
        f14956a = c1251y3E.d("measurement.set_default_event_parameters_propagate_clear.client.dev", false);
        f14957b = c1251y3E.d("measurement.set_default_event_parameters_propagate_clear.service", false);
        c1251y3E.b("measurement.id.set_default_event_parameters_propagate_clear.experiment_id", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1246x6
    public final boolean a() {
        return ((Boolean) f14956a.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1246x6
    public final boolean zzb() {
        return ((Boolean) f14957b.f()).booleanValue();
    }
}
