package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.n7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1160n7 implements InterfaceC1133k7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AbstractC1183q3 f14751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AbstractC1183q3 f14752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AbstractC1183q3 f14753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AbstractC1183q3 f14754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AbstractC1183q3 f14755e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final AbstractC1183q3 f14756f;

    static {
        C1251y3 c1251y3E = new C1251y3(AbstractC1191r3.a("com.google.android.gms.measurement")).f().e();
        f14751a = c1251y3E.d("measurement.test.boolean_flag", false);
        f14752b = c1251y3E.b("measurement.test.cached_long_flag", -1L);
        f14753c = c1251y3E.a("measurement.test.double_flag", -3.0d);
        f14754d = c1251y3E.b("measurement.test.int_flag", -2L);
        f14755e = c1251y3E.b("measurement.test.long_flag", -1L);
        f14756f = c1251y3E.c("measurement.test.string_flag", "---");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1133k7
    public final double a() {
        return ((Double) f14753c.f()).doubleValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1133k7
    public final String b() {
        return (String) f14756f.f();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1133k7
    public final boolean c() {
        return ((Boolean) f14751a.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1133k7
    public final long zzb() {
        return ((Long) f14752b.f()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1133k7
    public final long zzc() {
        return ((Long) f14754d.f()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1133k7
    public final long zzd() {
        return ((Long) f14755e.f()).longValue();
    }
}
