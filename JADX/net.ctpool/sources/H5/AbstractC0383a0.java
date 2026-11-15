package H5;

import j5.C1802g;

/* JADX INFO: renamed from: H5.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0383a0 extends F {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f1414o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f1415p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private C1802g f1416q;

    public static /* synthetic */ void b1(AbstractC0383a0 abstractC0383a0, boolean z6, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i7 & 1) != 0) {
            z6 = false;
        }
        abstractC0383a0.S0(z6);
    }

    private final long f1(boolean z6) {
        return z6 ? 4294967296L : 1L;
    }

    public static /* synthetic */ void k1(AbstractC0383a0 abstractC0383a0, boolean z6, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i7 & 1) != 0) {
            z6 = false;
        }
        abstractC0383a0.j1(z6);
    }

    public final void S0(boolean z6) {
        long jF1 = this.f1414o - f1(z6);
        this.f1414o = jF1;
        if (jF1 <= 0 && this.f1415p) {
            shutdown();
        }
    }

    public final void h1(U u6) {
        C1802g c1802g = this.f1416q;
        if (c1802g == null) {
            c1802g = new C1802g();
            this.f1416q = c1802g;
        }
        c1802g.k(u6);
    }

    protected long i1() {
        C1802g c1802g = this.f1416q;
        return (c1802g == null || c1802g.isEmpty()) ? Long.MAX_VALUE : 0L;
    }

    public final void j1(boolean z6) {
        this.f1414o += f1(z6);
        if (z6) {
            return;
        }
        this.f1415p = true;
    }

    public final boolean l1() {
        return this.f1414o >= f1(true);
    }

    public final boolean m1() {
        C1802g c1802g = this.f1416q;
        if (c1802g != null) {
            return c1802g.isEmpty();
        }
        return true;
    }

    public abstract long n1();

    public final boolean o1() {
        U u6;
        C1802g c1802g = this.f1416q;
        if (c1802g == null || (u6 = (U) c1802g.u()) == null) {
            return false;
        }
        u6.run();
        return true;
    }

    public boolean p1() {
        return false;
    }

    public abstract void shutdown();
}
