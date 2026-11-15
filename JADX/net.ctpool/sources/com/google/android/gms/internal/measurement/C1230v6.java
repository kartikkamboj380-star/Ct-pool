package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.v6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1230v6 implements InterfaceC1203s6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AbstractC1183q3 f14938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AbstractC1183q3 f14939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AbstractC1183q3 f14940c;

    static {
        C1251y3 c1251y3E = new C1251y3(AbstractC1191r3.a("com.google.android.gms.measurement")).f().e();
        f14938a = c1251y3E.d("measurement.set_default_event_parameters_with_backfill.client.dev", false);
        f14939b = c1251y3E.d("measurement.defensively_copy_bundles_validate_default_params", true);
        f14940c = c1251y3E.d("measurement.set_default_event_parameters_with_backfill.service", false);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1203s6
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1203s6
    public final boolean zzb() {
        return ((Boolean) f14938a.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1203s6
    public final boolean zzc() {
        return ((Boolean) f14939b.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1203s6
    public final boolean zzd() {
        return ((Boolean) f14940c.f()).booleanValue();
    }
}
