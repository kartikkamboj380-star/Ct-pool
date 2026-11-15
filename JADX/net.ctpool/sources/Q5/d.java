package Q5;

import H5.InterfaceC0404l;
import H5.P0;
import J5.g;
import M5.AbstractC0427d;
import M5.C;
import M5.D;
import i5.u;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import v5.l;
import v5.p;
import w5.i;
import w5.k;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f2806c = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "head");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AtomicLongFieldUpdater f2807d = AtomicLongFieldUpdater.newUpdater(d.class, "deqIdx");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f2808e = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "tail");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final AtomicLongFieldUpdater f2809f = AtomicLongFieldUpdater.newUpdater(d.class, "enqIdx");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f2810g = AtomicIntegerFieldUpdater.newUpdater(d.class, "_availablePermits");
    private volatile int _availablePermits;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f2811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f2812b;
    private volatile long deqIdx;
    private volatile long enqIdx;
    private volatile Object head;
    private volatile Object tail;

    /* synthetic */ class a extends i implements p {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final a f2813v = new a();

        a() {
            super(2, e.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        public final f l(long j7, f fVar) {
            return e.h(j7, fVar);
        }

        @Override // v5.p
        public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
            return l(((Number) obj).longValue(), (f) obj2);
        }
    }

    static final class b extends w5.l implements l {
        b() {
            super(1);
        }

        public final void a(Throwable th) {
            d.this.i();
        }

        @Override // v5.l
        public /* bridge */ /* synthetic */ Object i(Object obj) {
            a((Throwable) obj);
            return u.f19985a;
        }
    }

    /* synthetic */ class c extends i implements p {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final c f2815v = new c();

        c() {
            super(2, e.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        public final f l(long j7, f fVar) {
            return e.h(j7, fVar);
        }

        @Override // v5.p
        public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
            return l(((Number) obj).longValue(), (f) obj2);
        }
    }

    public d(int i7, int i8) {
        this.f2811a = i7;
        if (i7 <= 0) {
            throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i7).toString());
        }
        if (i8 < 0 || i8 > i7) {
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i7).toString());
        }
        f fVar = new f(0L, null, 2);
        this.head = fVar;
        this.tail = fVar;
        this._availablePermits = i7 - i8;
        this.f2812b = new b();
    }

    private final boolean e(P0 p02) {
        Object objC;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2808e;
        f fVar = (f) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f2809f.getAndIncrement(this);
        a aVar = a.f2813v;
        long j7 = andIncrement / ((long) e.f2821f);
        loop0: while (true) {
            objC = AbstractC0427d.c(fVar, j7, aVar);
            if (!D.c(objC)) {
                C cB = D.b(objC);
                while (true) {
                    C c7 = (C) atomicReferenceFieldUpdater.get(this);
                    if (c7.f2062o >= cB.f2062o) {
                        break loop0;
                    }
                    if (!cB.q()) {
                        break;
                    }
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, c7, cB)) {
                        if (c7.m()) {
                            c7.k();
                        }
                    } else if (cB.m()) {
                        cB.k();
                    }
                }
            } else {
                break;
            }
        }
        f fVar2 = (f) D.b(objC);
        int i7 = (int) (andIncrement % ((long) e.f2821f));
        if (g.a(fVar2.r(), i7, null, p02)) {
            p02.b(fVar2, i7);
            return true;
        }
        if (!g.a(fVar2.r(), i7, e.f2817b, e.f2818c)) {
            return false;
        }
        if (p02 instanceof InterfaceC0404l) {
            k.d(p02, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            ((InterfaceC0404l) p02).c(u.f19985a, this.f2812b);
            return true;
        }
        throw new IllegalStateException(("unexpected: " + p02).toString());
    }

    private final void f() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i7;
        int i8;
        do {
            atomicIntegerFieldUpdater = f2810g;
            i7 = atomicIntegerFieldUpdater.get(this);
            i8 = this.f2811a;
            if (i7 <= i8) {
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i7, i8));
    }

    private final int g() {
        int andDecrement;
        do {
            andDecrement = f2810g.getAndDecrement(this);
        } while (andDecrement > this.f2811a);
        return andDecrement;
    }

    private final boolean k(Object obj) {
        if (!(obj instanceof InterfaceC0404l)) {
            throw new IllegalStateException(("unexpected: " + obj).toString());
        }
        k.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        InterfaceC0404l interfaceC0404l = (InterfaceC0404l) obj;
        Object objQ = interfaceC0404l.q(u.f19985a, null, this.f2812b);
        if (objQ == null) {
            return false;
        }
        interfaceC0404l.r(objQ);
        return true;
    }

    private final boolean l() {
        Object objC;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2806c;
        f fVar = (f) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f2807d.getAndIncrement(this);
        long j7 = andIncrement / ((long) e.f2821f);
        c cVar = c.f2815v;
        loop0: while (true) {
            objC = AbstractC0427d.c(fVar, j7, cVar);
            if (D.c(objC)) {
                break;
            }
            C cB = D.b(objC);
            while (true) {
                C c7 = (C) atomicReferenceFieldUpdater.get(this);
                if (c7.f2062o >= cB.f2062o) {
                    break loop0;
                }
                if (!cB.q()) {
                    break;
                }
                if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, c7, cB)) {
                    if (c7.m()) {
                        c7.k();
                    }
                } else if (cB.m()) {
                    cB.k();
                }
            }
        }
        f fVar2 = (f) D.b(objC);
        fVar2.b();
        if (fVar2.f2062o > j7) {
            return false;
        }
        int i7 = (int) (andIncrement % ((long) e.f2821f));
        Object andSet = fVar2.r().getAndSet(i7, e.f2817b);
        if (andSet != null) {
            if (andSet == e.f2820e) {
                return false;
            }
            return k(andSet);
        }
        int i8 = e.f2816a;
        for (int i9 = 0; i9 < i8; i9++) {
            if (fVar2.r().get(i7) == e.f2818c) {
                return true;
            }
        }
        return !g.a(fVar2.r(), i7, e.f2817b, e.f2819d);
    }

    protected final void d(InterfaceC0404l interfaceC0404l) {
        while (g() <= 0) {
            k.d(interfaceC0404l, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (e((P0) interfaceC0404l)) {
                return;
            }
        }
        interfaceC0404l.c(u.f19985a, this.f2812b);
    }

    public int h() {
        return Math.max(f2810g.get(this), 0);
    }

    public void i() {
        do {
            int andIncrement = f2810g.getAndIncrement(this);
            if (andIncrement >= this.f2811a) {
                f();
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.f2811a).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!l());
    }

    public boolean j() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f2810g;
            int i7 = atomicIntegerFieldUpdater.get(this);
            if (i7 > this.f2811a) {
                f();
            } else {
                if (i7 <= 0) {
                    return false;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i7, i7 - 1)) {
                    return true;
                }
            }
        }
    }
}
