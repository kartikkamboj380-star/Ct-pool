package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
final class P0 implements InterfaceC1297i1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final U0 f15101b = new N0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final U0 f15102a;

    public P0() {
        U0 u02;
        C1320o0 c1320o0A = C1320o0.a();
        try {
            u02 = (U0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            u02 = f15101b;
        }
        O0 o02 = new O0(c1320o0A, u02);
        byte[] bArr = AbstractC1353z0.f15324d;
        this.f15102a = o02;
    }

    private static boolean b(T0 t02) {
        return t02.zzc() + (-1) != 1;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1297i1
    public final InterfaceC1293h1 a(Class cls) {
        C1269b1 c1269b1A;
        L0 l0C;
        AbstractC1348x1 abstractC1348x1T;
        AbstractC1288g0 abstractC1288g0A;
        R0 r0A;
        AbstractC1348x1 abstractC1348x1T2;
        AbstractC1288g0 abstractC1288g0A2;
        AbstractC1301j1.y(cls);
        T0 t0B = this.f15102a.b(cls);
        if (t0B.zzb()) {
            if (AbstractC1329r0.class.isAssignableFrom(cls)) {
                abstractC1348x1T2 = AbstractC1301j1.u();
                abstractC1288g0A2 = AbstractC1296i0.b();
            } else {
                abstractC1348x1T2 = AbstractC1301j1.t();
                abstractC1288g0A2 = AbstractC1296i0.a();
            }
            return C1265a1.j(abstractC1348x1T2, abstractC1288g0A2, t0B.a());
        }
        if (AbstractC1329r0.class.isAssignableFrom(cls)) {
            boolean zB = b(t0B);
            c1269b1A = AbstractC1273c1.b();
            l0C = L0.d();
            abstractC1348x1T = AbstractC1301j1.u();
            abstractC1288g0A = zB ? AbstractC1296i0.b() : null;
            r0A = S0.b();
        } else {
            boolean zB2 = b(t0B);
            c1269b1A = AbstractC1273c1.a();
            l0C = L0.c();
            abstractC1348x1T = AbstractC1301j1.t();
            abstractC1288g0A = zB2 ? AbstractC1296i0.a() : null;
            r0A = S0.a();
        }
        return Z0.A(cls, t0B, c1269b1A, l0C, abstractC1348x1T, abstractC1288g0A, r0A);
    }
}
