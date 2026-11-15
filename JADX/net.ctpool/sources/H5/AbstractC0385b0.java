package H5;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m5.InterfaceC1888g;

/* JADX INFO: renamed from: H5.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0385b0 extends AbstractC0387c0 implements S {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f1417r = AtomicReferenceFieldUpdater.newUpdater(AbstractC0385b0.class, Object.class, "_queue");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f1418s = AtomicReferenceFieldUpdater.newUpdater(AbstractC0385b0.class, Object.class, "_delayed");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f1419t = AtomicIntegerFieldUpdater.newUpdater(AbstractC0385b0.class, "_isCompleted");
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    /* JADX INFO: renamed from: H5.b0$a */
    public static final class a extends M5.L {
    }

    private final void A1(boolean z6) {
        f1419t.set(this, z6 ? 1 : 0);
    }

    private final void s1() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1417r;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                if (androidx.concurrent.futures.b.a(f1417r, this, null, AbstractC0391e0.f1424b)) {
                    return;
                }
            } else if (obj instanceof M5.s) {
                ((M5.s) obj).d();
                return;
            } else {
                if (obj == AbstractC0391e0.f1424b) {
                    return;
                }
                M5.s sVar = new M5.s(8, true);
                w5.k.d(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                sVar.a((Runnable) obj);
                if (androidx.concurrent.futures.b.a(f1417r, this, obj, sVar)) {
                    return;
                }
            }
        }
    }

    private final Runnable t1() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1417r;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof M5.s) {
                w5.k.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                M5.s sVar = (M5.s) obj;
                Object objJ = sVar.j();
                if (objJ != M5.s.f2113h) {
                    return (Runnable) objJ;
                }
                androidx.concurrent.futures.b.a(f1417r, this, obj, sVar.i());
            } else {
                if (obj == AbstractC0391e0.f1424b) {
                    return null;
                }
                if (androidx.concurrent.futures.b.a(f1417r, this, obj, null)) {
                    w5.k.d(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                    return (Runnable) obj;
                }
            }
        }
    }

    private final boolean v1(Runnable runnable) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1417r;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (w1()) {
                return false;
            }
            if (obj == null) {
                if (androidx.concurrent.futures.b.a(f1417r, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof M5.s) {
                w5.k.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                M5.s sVar = (M5.s) obj;
                int iA = sVar.a(runnable);
                if (iA == 0) {
                    return true;
                }
                if (iA == 1) {
                    androidx.concurrent.futures.b.a(f1417r, this, obj, sVar.i());
                } else if (iA == 2) {
                    return false;
                }
            } else {
                if (obj == AbstractC0391e0.f1424b) {
                    return false;
                }
                M5.s sVar2 = new M5.s(8, true);
                w5.k.d(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                sVar2.a((Runnable) obj);
                sVar2.a(runnable);
                if (androidx.concurrent.futures.b.a(f1417r, this, obj, sVar2)) {
                    return true;
                }
            }
        }
    }

    private final boolean w1() {
        return f1419t.get(this) != 0;
    }

    private final void y1() {
        AbstractC0386c.a();
        System.nanoTime();
    }

    @Override // H5.F
    public final void a(InterfaceC1888g interfaceC1888g, Runnable runnable) {
        u1(runnable);
    }

    @Override // H5.AbstractC0383a0
    protected long i1() {
        if (super.i1() == 0) {
            return 0L;
        }
        Object obj = f1417r.get(this);
        if (obj != null) {
            if (!(obj instanceof M5.s)) {
                return obj == AbstractC0391e0.f1424b ? Long.MAX_VALUE : 0L;
            }
            if (!((M5.s) obj).g()) {
                return 0L;
            }
        }
        return Long.MAX_VALUE;
    }

    @Override // H5.AbstractC0383a0
    public long n1() {
        if (o1()) {
            return 0L;
        }
        Runnable runnableT1 = t1();
        if (runnableT1 == null) {
            return i1();
        }
        runnableT1.run();
        return 0L;
    }

    @Override // H5.AbstractC0383a0
    public void shutdown() {
        L0.f1395a.c();
        A1(true);
        s1();
        while (n1() <= 0) {
        }
        y1();
    }

    public void u1(Runnable runnable) {
        if (v1(runnable)) {
            r1();
        } else {
            N.f1398u.u1(runnable);
        }
    }

    protected boolean x1() {
        if (!m1()) {
            return false;
        }
        Object obj = f1417r.get(this);
        if (obj != null) {
            if (obj instanceof M5.s) {
                return ((M5.s) obj).g();
            }
            if (obj != AbstractC0391e0.f1424b) {
                return false;
            }
        }
        return true;
    }

    protected final void z1() {
        f1417r.set(this, null);
        f1418s.set(this, null);
    }
}
