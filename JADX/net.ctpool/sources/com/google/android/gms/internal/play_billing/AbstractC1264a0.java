package com.google.android.gms.internal.play_billing;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1264a0 extends G {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f15155b = Logger.getLogger(AbstractC1264a0.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f15156c = H1.C();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    C1268b0 f15157a;

    /* synthetic */ AbstractC1264a0(Z z6) {
    }

    static int t(int i7, W0 w02, InterfaceC1293h1 interfaceC1293h1) {
        int iW = w(i7 << 3);
        return iW + iW + ((AbstractC1352z) w02).d(interfaceC1293h1);
    }

    static int u(W0 w02, InterfaceC1293h1 interfaceC1293h1) {
        int iD = ((AbstractC1352z) w02).d(interfaceC1293h1);
        return w(iD) + iD;
    }

    public static int v(String str) {
        int length;
        try {
            length = M1.c(str);
        } catch (L1 unused) {
            length = str.getBytes(AbstractC1353z0.f15322b).length;
        }
        return w(length) + length;
    }

    public static int w(int i7) {
        return (352 - (Integer.numberOfLeadingZeros(i7) * 9)) >>> 6;
    }

    public static int x(long j7) {
        return (640 - (Long.numberOfLeadingZeros(j7) * 9)) >>> 6;
    }

    public static AbstractC1264a0 y(byte[] bArr, int i7, int i8) {
        return new X(bArr, 0, i8);
    }

    final void a(String str, L1 l12) throws Y {
        f15155b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) l12);
        byte[] bytes = str.getBytes(AbstractC1353z0.f15322b);
        try {
            int length = bytes.length;
            q(length);
            m(bytes, 0, length);
        } catch (IndexOutOfBoundsException e7) {
            throw new Y(e7);
        }
    }

    public abstract int c();

    public abstract void d(byte b7);

    public abstract void e(int i7, boolean z6);

    public abstract void f(int i7, S s6);

    public abstract void g(int i7, int i8);

    public abstract void h(int i7);

    public abstract void i(int i7, long j7);

    public abstract void j(long j7);

    public abstract void k(int i7, int i8);

    public abstract void l(int i7);

    public abstract void m(byte[] bArr, int i7, int i8);

    public abstract void n(int i7, String str);

    public abstract void o(int i7, int i8);

    public abstract void p(int i7, int i8);

    public abstract void q(int i7);

    public abstract void r(int i7, long j7);

    public abstract void s(long j7);

    public final void z() {
        if (c() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }
}
