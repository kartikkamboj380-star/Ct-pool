package O5;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import w5.v;

/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f2544b = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "lastScheduledTask");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f2545c = AtomicIntegerFieldUpdater.newUpdater(n.class, "producerIndex");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f2546d = AtomicIntegerFieldUpdater.newUpdater(n.class, "consumerIndex");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f2547e = AtomicIntegerFieldUpdater.newUpdater(n.class, "blockingTasksInBuffer");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReferenceArray f2548a = new AtomicReferenceArray(128);
    private volatile int blockingTasksInBuffer;
    private volatile int consumerIndex;
    private volatile Object lastScheduledTask;
    private volatile int producerIndex;

    private final h b(h hVar) {
        if (d() == 127) {
            return hVar;
        }
        if (hVar.f2532n.b() == 1) {
            f2547e.incrementAndGet(this);
        }
        int i7 = f2545c.get(this) & ModuleDescriptor.MODULE_VERSION;
        while (this.f2548a.get(i7) != null) {
            Thread.yield();
        }
        this.f2548a.lazySet(i7, hVar);
        f2545c.incrementAndGet(this);
        return null;
    }

    private final void c(h hVar) {
        if (hVar == null || hVar.f2532n.b() != 1) {
            return;
        }
        f2547e.decrementAndGet(this);
    }

    private final int d() {
        return f2545c.get(this) - f2546d.get(this);
    }

    private final h i() {
        h hVar;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f2546d;
            int i7 = atomicIntegerFieldUpdater.get(this);
            if (i7 - f2545c.get(this) == 0) {
                return null;
            }
            int i8 = i7 & ModuleDescriptor.MODULE_VERSION;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i7, i7 + 1) && (hVar = (h) this.f2548a.getAndSet(i8, null)) != null) {
                c(hVar);
                return hVar;
            }
        }
    }

    private final boolean j(d dVar) {
        h hVarI = i();
        if (hVarI == null) {
            return false;
        }
        dVar.a(hVarI);
        return true;
    }

    private final h k(boolean z6) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        h hVar;
        do {
            atomicReferenceFieldUpdater = f2544b;
            hVar = (h) atomicReferenceFieldUpdater.get(this);
            if (hVar != null) {
                if ((hVar.f2532n.b() == 1) == z6) {
                }
            }
            int i7 = f2546d.get(this);
            int i8 = f2545c.get(this);
            while (i7 != i8) {
                if (z6 && f2547e.get(this) == 0) {
                    return null;
                }
                i8--;
                h hVarM = m(i8, z6);
                if (hVarM != null) {
                    return hVarM;
                }
            }
            return null;
        } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, hVar, null));
        return hVar;
    }

    private final h l(int i7) {
        int i8 = f2546d.get(this);
        int i9 = f2545c.get(this);
        boolean z6 = i7 == 1;
        while (i8 != i9) {
            if (z6 && f2547e.get(this) == 0) {
                return null;
            }
            int i10 = i8 + 1;
            h hVarM = m(i8, z6);
            if (hVarM != null) {
                return hVarM;
            }
            i8 = i10;
        }
        return null;
    }

    private final h m(int i7, boolean z6) {
        int i8 = i7 & ModuleDescriptor.MODULE_VERSION;
        h hVar = (h) this.f2548a.get(i8);
        if (hVar != null) {
            if ((hVar.f2532n.b() == 1) == z6 && J5.g.a(this.f2548a, i8, hVar, null)) {
                if (z6) {
                    f2547e.decrementAndGet(this);
                }
                return hVar;
            }
        }
        return null;
    }

    private final long o(int i7, v vVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        h hVar;
        do {
            atomicReferenceFieldUpdater = f2544b;
            hVar = (h) atomicReferenceFieldUpdater.get(this);
            if (hVar == null) {
                return -2L;
            }
            if (((hVar.f2532n.b() != 1 ? 2 : 1) & i7) == 0) {
                return -2L;
            }
            long jA = l.f2540f.a() - hVar.f2531m;
            long j7 = l.f2536b;
            if (jA < j7) {
                return j7 - jA;
            }
        } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, hVar, null));
        vVar.f22740m = hVar;
        return -1L;
    }

    public final h a(h hVar, boolean z6) {
        if (z6) {
            return b(hVar);
        }
        h hVar2 = (h) f2544b.getAndSet(this, hVar);
        if (hVar2 == null) {
            return null;
        }
        return b(hVar2);
    }

    public final int e() {
        return f2544b.get(this) != null ? d() + 1 : d();
    }

    public final void f(d dVar) {
        h hVar = (h) f2544b.getAndSet(this, null);
        if (hVar != null) {
            dVar.a(hVar);
        }
        while (j(dVar)) {
        }
    }

    public final h g() {
        h hVar = (h) f2544b.getAndSet(this, null);
        return hVar == null ? i() : hVar;
    }

    public final h h() {
        return k(true);
    }

    public final long n(int i7, v vVar) {
        h hVarI = i7 == 3 ? i() : l(i7);
        if (hVarI == null) {
            return o(i7, vVar);
        }
        vVar.f22740m = hVarI;
        return -1L;
    }
}
