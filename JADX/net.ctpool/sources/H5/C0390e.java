package H5;

import java.util.concurrent.locks.LockSupport;
import m5.InterfaceC1888g;

/* JADX INFO: renamed from: H5.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0390e extends AbstractC0382a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Thread f1421p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final AbstractC0383a0 f1422q;

    public C0390e(InterfaceC1888g interfaceC1888g, Thread thread, AbstractC0383a0 abstractC0383a0) {
        super(interfaceC1888g, true, true);
        this.f1421p = thread;
        this.f1422q = abstractC0383a0;
    }

    public final Object N0() throws Throwable {
        AbstractC0386c.a();
        try {
            AbstractC0383a0 abstractC0383a0 = this.f1422q;
            if (abstractC0383a0 != null) {
                AbstractC0383a0.k1(abstractC0383a0, false, 1, null);
            }
            while (!Thread.interrupted()) {
                try {
                    AbstractC0383a0 abstractC0383a02 = this.f1422q;
                    long jN1 = abstractC0383a02 != null ? abstractC0383a02.n1() : Long.MAX_VALUE;
                    if (b0()) {
                        AbstractC0383a0 abstractC0383a03 = this.f1422q;
                        if (abstractC0383a03 != null) {
                            AbstractC0383a0.b1(abstractC0383a03, false, 1, null);
                        }
                        AbstractC0386c.a();
                        Object objH = y0.h(V());
                        C0423z c0423z = objH instanceof C0423z ? (C0423z) objH : null;
                        if (c0423z == null) {
                            return objH;
                        }
                        throw c0423z.f1476a;
                    }
                    AbstractC0386c.a();
                    LockSupport.parkNanos(this, jN1);
                } catch (Throwable th) {
                    AbstractC0383a0 abstractC0383a04 = this.f1422q;
                    if (abstractC0383a04 != null) {
                        AbstractC0383a0.b1(abstractC0383a04, false, 1, null);
                    }
                    throw th;
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            A(interruptedException);
            throw interruptedException;
        } catch (Throwable th2) {
            AbstractC0386c.a();
            throw th2;
        }
    }

    @Override // H5.x0
    protected boolean c0() {
        return true;
    }

    @Override // H5.x0
    protected void v(Object obj) {
        if (w5.k.b(Thread.currentThread(), this.f1421p)) {
            return;
        }
        Thread thread = this.f1421p;
        AbstractC0386c.a();
        LockSupport.unpark(thread);
    }
}
