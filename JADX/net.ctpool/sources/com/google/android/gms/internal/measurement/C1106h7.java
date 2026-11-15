package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.h7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1106h7 implements InterfaceC1079e7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AbstractC1183q3 f14606a;

    static {
        C1251y3 c1251y3E = new C1251y3(AbstractC1191r3.a("com.google.android.gms.measurement")).f().e();
        f14606a = c1251y3E.d("measurement.gmscore_network_migration", false);
        c1251y3E.b("measurement.id.gmscore_network_migration", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1079e7
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1079e7
    public final boolean zzb() {
        return ((Boolean) f14606a.f()).booleanValue();
    }
}
