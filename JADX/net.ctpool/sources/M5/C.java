package M5;

import H5.E0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import m5.InterfaceC1888g;

/* JADX INFO: loaded from: classes2.dex */
public abstract class C extends AbstractC0428e implements E0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f2061p = AtomicIntegerFieldUpdater.newUpdater(C.class, "cleanedAndPointers");
    private volatile int cleanedAndPointers;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f2062o;

    public C(long j7, C c7, int i7) {
        super(c7);
        this.f2062o = j7;
        this.cleanedAndPointers = i7 << 16;
    }

    @Override // M5.AbstractC0428e
    public boolean h() {
        return f2061p.get(this) == n() && !i();
    }

    public final boolean m() {
        return f2061p.addAndGet(this, -65536) == n() && !i();
    }

    public abstract int n();

    public abstract void o(int i7, Throwable th, InterfaceC1888g interfaceC1888g);

    public final void p() {
        if (f2061p.incrementAndGet(this) == n()) {
            k();
        }
    }

    public final boolean q() {
        int i7;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f2061p;
        do {
            i7 = atomicIntegerFieldUpdater.get(this);
            if (i7 == n() && !i()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i7, 65536 + i7));
        return true;
    }
}
