package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class D6 implements E6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AbstractC1183q3 f14168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AbstractC1183q3 f14169b;

    static {
        C1251y3 c1251y3E = new C1251y3(AbstractC1191r3.a("com.google.android.gms.measurement")).f().e();
        c1251y3E.d("measurement.collection.event_safelist", true);
        f14168a = c1251y3E.d("measurement.service.store_null_safelist", true);
        f14169b = c1251y3E.d("measurement.service.store_safelist", true);
    }

    @Override // com.google.android.gms.internal.measurement.E6
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.E6
    public final boolean zzb() {
        return ((Boolean) f14168a.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.E6
    public final boolean zzc() {
        return ((Boolean) f14169b.f()).booleanValue();
    }
}
