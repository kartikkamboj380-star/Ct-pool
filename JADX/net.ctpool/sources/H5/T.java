package H5;

import M5.AbstractC0434k;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import m5.InterfaceC1885d;
import m5.InterfaceC1888g;
import n5.AbstractC1930b;

/* JADX INFO: loaded from: classes2.dex */
public final class T extends M5.B {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f1405q = AtomicIntegerFieldUpdater.newUpdater(T.class, "_decision");
    private volatile int _decision;

    public T(InterfaceC1888g interfaceC1888g, InterfaceC1885d interfaceC1885d) {
        super(interfaceC1888g, interfaceC1885d);
    }

    private final boolean O0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1405q;
        do {
            int i7 = atomicIntegerFieldUpdater.get(this);
            if (i7 != 0) {
                if (i7 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f1405q.compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean P0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1405q;
        do {
            int i7 = atomicIntegerFieldUpdater.get(this);
            if (i7 != 0) {
                if (i7 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f1405q.compareAndSet(this, 0, 1));
        return true;
    }

    @Override // M5.B, H5.AbstractC0382a
    protected void I0(Object obj) {
        if (O0()) {
            return;
        }
        AbstractC0434k.c(AbstractC1930b.b(this.f2060p), D.a(obj, this.f2060p), null, 2, null);
    }

    public final Object N0() {
        if (P0()) {
            return AbstractC1930b.c();
        }
        Object objH = y0.h(V());
        if (objH instanceof C0423z) {
            throw ((C0423z) objH).f1476a;
        }
        return objH;
    }

    @Override // M5.B, H5.x0
    protected void v(Object obj) {
        I0(obj);
    }
}
