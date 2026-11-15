package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes.dex */
final class S0 implements InterfaceC0986m1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final X0 f13850b = new Q0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final X0 f13851a;

    public S0() {
        X0 x02;
        A0 a0A = A0.a();
        try {
            x02 = (X0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            x02 = f13850b;
        }
        R0 r02 = new R0(a0A, x02);
        byte[] bArr = G0.f13797d;
        this.f13851a = r02;
    }

    private static boolean b(W0 w02) {
        return w02.zzc() + (-1) != 1;
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC0986m1
    public final InterfaceC0983l1 a(Class cls) {
        C0965f1 c0965f1A;
        P0 p0C;
        AbstractC0998q1 abstractC0998q1A;
        AbstractC1014w0 abstractC1014w0A;
        U0 u0A;
        AbstractC0998q1 abstractC0998q1A2;
        AbstractC1014w0 abstractC1014w0A2;
        AbstractC0989n1.d(cls);
        W0 w0B = this.f13851a.b(cls);
        if (w0B.zzb()) {
            if (C0.class.isAssignableFrom(cls)) {
                abstractC0998q1A2 = AbstractC0989n1.b();
                abstractC1014w0A2 = AbstractC1020y0.b();
            } else {
                abstractC0998q1A2 = AbstractC0989n1.a();
                abstractC1014w0A2 = AbstractC1020y0.a();
            }
            return C0962e1.a(abstractC0998q1A2, abstractC1014w0A2, w0B.a());
        }
        if (C0.class.isAssignableFrom(cls)) {
            boolean zB = b(w0B);
            c0965f1A = AbstractC0968g1.b();
            p0C = P0.d();
            abstractC0998q1A = AbstractC0989n1.b();
            abstractC1014w0A = zB ? AbstractC1020y0.b() : null;
            u0A = V0.b();
        } else {
            boolean zB2 = b(w0B);
            c0965f1A = AbstractC0968g1.a();
            p0C = P0.c();
            abstractC0998q1A = AbstractC0989n1.a();
            abstractC1014w0A = zB2 ? AbstractC1020y0.a() : null;
            u0A = V0.a();
        }
        return C0959d1.r(cls, w0B, c0965f1A, p0C, abstractC0998q1A, abstractC1014w0A, u0A);
    }
}
