package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.b7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1052b7 implements InterfaceC1061c7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AbstractC1183q3 f14526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AbstractC1183q3 f14527b;

    static {
        C1251y3 c1251y3E = new C1251y3(AbstractC1191r3.a("com.google.android.gms.measurement")).f().e();
        f14526a = c1251y3E.d("measurement.gmscore_feature_tracking", true);
        f14527b = c1251y3E.d("measurement.gmscore_client_telemetry", false);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1061c7
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1061c7
    public final boolean zzb() {
        return ((Boolean) f14526a.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1061c7
    public final boolean zzc() {
        return ((Boolean) f14527b.f()).booleanValue();
    }
}
