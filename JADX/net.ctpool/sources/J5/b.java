package J5;

import H5.AbstractC0410o;
import H5.C0406m;
import H5.InterfaceC0404l;
import H5.P0;
import M5.AbstractC0427d;
import M5.AbstractC0428e;
import M5.AbstractC0435l;
import M5.C;
import M5.D;
import M5.E;
import M5.F;
import M5.O;
import M5.x;
import androidx.appcompat.app.y;
import i5.m;
import i5.u;
import j5.AbstractC1809n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m5.InterfaceC1885d;
import n5.AbstractC1930b;
import o5.AbstractC1953h;
import v5.p;
import v5.q;

/* JADX INFO: loaded from: classes2.dex */
public class b implements d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AtomicLongFieldUpdater f1779e = AtomicLongFieldUpdater.newUpdater(b.class, "sendersAndCloseStatus");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final AtomicLongFieldUpdater f1780f = AtomicLongFieldUpdater.newUpdater(b.class, "receivers");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final AtomicLongFieldUpdater f1781g = AtomicLongFieldUpdater.newUpdater(b.class, "bufferEnd");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final AtomicLongFieldUpdater f1782h = AtomicLongFieldUpdater.newUpdater(b.class, "completedExpandBuffersAndPauseFlag");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f1783i = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "sendSegment");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f1784j = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "receiveSegment");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f1785k = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "bufferEndSegment");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f1786l = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_closeCause");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f1787m = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "closeHandler");
    private volatile Object _closeCause;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f1788b;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v5.l f1789c;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final q f1790d;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;

    static final class a extends w5.l implements q {

        /* JADX INFO: renamed from: J5.b$a$a, reason: collision with other inner class name */
        static final class C0033a extends w5.l implements v5.l {

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ Object f1792m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ b f1793n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0033a(Object obj, b bVar, P5.a aVar) {
                super(1);
                this.f1792m = obj;
                this.f1793n = bVar;
            }

            public final void a(Throwable th) {
                if (this.f1792m == c.y()) {
                    return;
                }
                v5.l lVar = this.f1793n.f1789c;
                throw null;
            }

            @Override // v5.l
            public /* bridge */ /* synthetic */ Object i(Object obj) {
                a((Throwable) obj);
                return u.f19985a;
            }
        }

        a() {
            super(3);
        }

        public final v5.l a(P5.a aVar, Object obj, Object obj2) {
            return new C0033a(obj2, b.this, aVar);
        }

        @Override // v5.q
        public /* bridge */ /* synthetic */ Object e(Object obj, Object obj2, Object obj3) {
            y.a(obj);
            return a(null, obj2, obj3);
        }
    }

    public b(int i7, v5.l lVar) {
        this.f1788b = i7;
        this.f1789c = lVar;
        if (i7 < 0) {
            throw new IllegalArgumentException(("Invalid channel capacity: " + i7 + ", should be >=0").toString());
        }
        this.bufferEnd = c.z(i7);
        this.completedExpandBuffersAndPauseFlag = C();
        h hVar = new h(0L, null, this, 3);
        this.sendSegment = hVar;
        this.receiveSegment = hVar;
        if (T()) {
            hVar = c.f1794a;
            w5.k.d(hVar, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment = hVar;
        this.f1790d = lVar != null ? new a() : null;
        this._closeCause = c.f1812s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h A(long j7, h hVar) {
        Object objC;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1784j;
        p pVar = (p) c.x();
        loop0: while (true) {
            objC = AbstractC0427d.c(hVar, j7, pVar);
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
        if (D.c(objC)) {
            w();
            if (hVar.f2062o * ((long) c.f1795b) >= H()) {
                return null;
            }
        } else {
            hVar = (h) D.b(objC);
            if (!T() && j7 <= C() / ((long) c.f1795b)) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f1785k;
                while (true) {
                    C c8 = (C) atomicReferenceFieldUpdater2.get(this);
                    if (c8.f2062o >= hVar.f2062o || !hVar.q()) {
                        break;
                    }
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater2, this, c8, hVar)) {
                        if (c8.m()) {
                            c8.k();
                        }
                    } else if (hVar.m()) {
                        hVar.k();
                    }
                }
            }
            long j8 = hVar.f2062o;
            if (j8 <= j7) {
                return hVar;
            }
            int i7 = c.f1795b;
            u0(j8 * ((long) i7));
            if (hVar.f2062o * ((long) i7) >= H()) {
                return null;
            }
        }
        hVar.b();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h B(long j7, h hVar) {
        Object objC;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1783i;
        p pVar = (p) c.x();
        loop0: while (true) {
            objC = AbstractC0427d.c(hVar, j7, pVar);
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
        if (D.c(objC)) {
            w();
            if (hVar.f2062o * ((long) c.f1795b) >= F()) {
                return null;
            }
        } else {
            hVar = (h) D.b(objC);
            long j8 = hVar.f2062o;
            if (j8 <= j7) {
                return hVar;
            }
            int i7 = c.f1795b;
            v0(j8 * ((long) i7));
            if (hVar.f2062o * ((long) i7) >= F()) {
                return null;
            }
        }
        hVar.b();
        return null;
    }

    private final long C() {
        return f1781g.get(this);
    }

    private final Throwable E() {
        Throwable thD = D();
        return thD == null ? new i("Channel was closed") : thD;
    }

    private final void J(long j7) {
        if ((f1782h.addAndGet(this, j7) & 4611686018427387904L) != 0) {
            while ((f1782h.get(this) & 4611686018427387904L) != 0) {
            }
        }
    }

    static /* synthetic */ void K(b bVar, long j7, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
        }
        if ((i7 & 1) != 0) {
            j7 = 1;
        }
        bVar.J(j7);
    }

    private final void L() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1787m;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
        } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj, obj == null ? c.f1810q : c.f1811r));
        if (obj == null) {
            return;
        }
        ((v5.l) obj).i(D());
    }

    private final boolean M(h hVar, int i7, long j7) {
        Object objW;
        do {
            objW = hVar.w(i7);
            if (objW != null && objW != c.f1798e) {
                if (objW == c.f1797d) {
                    return true;
                }
                if (objW == c.f1803j || objW == c.y() || objW == c.f1802i || objW == c.f1801h) {
                    return false;
                }
                if (objW == c.f1800g) {
                    return true;
                }
                return objW != c.f1799f && j7 == F();
            }
        } while (!hVar.r(i7, objW, c.f1801h));
        y();
        return false;
    }

    private final boolean N(long j7, boolean z6) {
        int i7 = (int) (j7 >> 60);
        if (i7 == 0 || i7 == 1) {
            return false;
        }
        if (i7 == 2) {
            v(j7 & 1152921504606846975L);
            if (z6 && I()) {
                return false;
            }
        } else {
            if (i7 != 3) {
                throw new IllegalStateException(("unexpected close status: " + i7).toString());
            }
            u(j7 & 1152921504606846975L);
        }
        return true;
    }

    private final boolean P(long j7) {
        return N(j7, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean R(long j7) {
        return N(j7, false);
    }

    private final boolean T() {
        long jC = C();
        return jC == 0 || jC == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        r8 = (J5.h) r8.g();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final long U(h hVar) {
        do {
            int i7 = c.f1795b;
            while (true) {
                i7--;
                if (-1 >= i7) {
                    break;
                }
                long j7 = (hVar.f2062o * ((long) c.f1795b)) + ((long) i7);
                if (j7 < F()) {
                    return -1L;
                }
                while (true) {
                    Object objW = hVar.w(i7);
                    if (objW == null || objW == c.f1798e) {
                        if (hVar.r(i7, objW, c.y())) {
                            hVar.p();
                            break;
                        }
                    } else if (objW == c.f1797d) {
                        return j7;
                    }
                }
            }
        } while (hVar != null);
        return -1L;
    }

    private final void V() {
        long j7;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1779e;
        do {
            j7 = atomicLongFieldUpdater.get(this);
            if (((int) (j7 >> 60)) != 0) {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j7, c.v(1152921504606846975L & j7, 1)));
    }

    private final void W() {
        long j7;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1779e;
        do {
            j7 = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j7, c.v(1152921504606846975L & j7, 3)));
    }

    private final void X() {
        long j7;
        long j8;
        int i7;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1779e;
        do {
            j7 = atomicLongFieldUpdater.get(this);
            int i8 = (int) (j7 >> 60);
            if (i8 == 0) {
                j8 = j7 & 1152921504606846975L;
                i7 = 2;
            } else {
                if (i8 != 1) {
                    return;
                }
                j8 = j7 & 1152921504606846975L;
                i7 = 3;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j7, c.v(j8, i7)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void Y(long j7, h hVar) {
        h hVar2;
        h hVar3;
        while (hVar.f2062o < j7 && (hVar3 = (h) hVar.e()) != null) {
            hVar = hVar3;
        }
        while (true) {
            if (!hVar.h() || (hVar2 = (h) hVar.e()) == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1785k;
                while (true) {
                    C c7 = (C) atomicReferenceFieldUpdater.get(this);
                    if (c7.f2062o >= hVar.f2062o) {
                        return;
                    }
                    if (!hVar.q()) {
                        break;
                    }
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, c7, hVar)) {
                        if (c7.m()) {
                            c7.k();
                            return;
                        }
                        return;
                    } else if (hVar.m()) {
                        hVar.k();
                    }
                }
            } else {
                hVar = hVar2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a0(InterfaceC0404l interfaceC0404l) {
        m.a aVar = i5.m.f19973m;
        interfaceC0404l.h(i5.m.a(i5.n.a(E())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d0(P0 p02, h hVar, int i7) {
        c0();
        p02.b(hVar, i7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e0(P0 p02, h hVar, int i7) {
        p02.b(hVar, i7 + c.f1795b);
    }

    static /* synthetic */ Object f0(b bVar, InterfaceC1885d interfaceC1885d) throws Throwable {
        h hVar = (h) f1784j.get(bVar);
        while (!bVar.O()) {
            long andIncrement = f1780f.getAndIncrement(bVar);
            int i7 = c.f1795b;
            long j7 = andIncrement / ((long) i7);
            int i8 = (int) (andIncrement % ((long) i7));
            if (hVar.f2062o != j7) {
                h hVarA = bVar.A(j7, hVar);
                if (hVarA == null) {
                    continue;
                } else {
                    hVar = hVarA;
                }
            }
            Object objQ0 = bVar.q0(hVar, i8, andIncrement, null);
            if (objQ0 == c.f1806m) {
                throw new IllegalStateException("unexpected".toString());
            }
            if (objQ0 != c.f1808o) {
                if (objQ0 == c.f1807n) {
                    return bVar.g0(hVar, i8, andIncrement, interfaceC1885d);
                }
                hVar.b();
                return objQ0;
            }
            if (andIncrement < bVar.H()) {
                hVar.b();
            }
        }
        throw E.a(bVar.E());
    }

    private final Object g0(h hVar, int i7, long j7, InterfaceC1885d interfaceC1885d) {
        C0406m c0406mB = AbstractC0410o.b(AbstractC1930b.b(interfaceC1885d));
        try {
            Object objQ0 = q0(hVar, i7, j7, c0406mB);
            if (objQ0 == c.f1806m) {
                d0(c0406mB, hVar, i7);
            } else {
                v5.l lVarA = null;
                lVarA = null;
                if (objQ0 == c.f1808o) {
                    if (j7 < H()) {
                        hVar.b();
                    }
                    h hVar2 = (h) f1784j.get(this);
                    while (true) {
                        if (O()) {
                            a0(c0406mB);
                            break;
                        }
                        long andIncrement = f1780f.getAndIncrement(this);
                        int i8 = c.f1795b;
                        long j8 = andIncrement / ((long) i8);
                        int i9 = (int) (andIncrement % ((long) i8));
                        if (hVar2.f2062o != j8) {
                            h hVarA = A(j8, hVar2);
                            if (hVarA != null) {
                                hVar2 = hVarA;
                            }
                        }
                        objQ0 = q0(hVar2, i9, andIncrement, c0406mB);
                        if (objQ0 == c.f1806m) {
                            C0406m c0406m = c0406mB instanceof P0 ? c0406mB : null;
                            if (c0406m != null) {
                                d0(c0406m, hVar2, i9);
                            }
                        } else if (objQ0 == c.f1808o) {
                            if (andIncrement < H()) {
                                hVar2.b();
                            }
                        } else {
                            if (objQ0 == c.f1807n) {
                                throw new IllegalStateException("unexpected".toString());
                            }
                            hVar2.b();
                            v5.l lVar = this.f1789c;
                            if (lVar != null) {
                                lVarA = x.a(lVar, objQ0, c0406mB.a());
                            }
                        }
                    }
                } else {
                    hVar.b();
                    v5.l lVar2 = this.f1789c;
                    if (lVar2 != null) {
                        lVarA = x.a(lVar2, objQ0, c0406mB.a());
                    }
                }
                c0406mB.c(objQ0, lVarA);
            }
            Object objZ = c0406mB.z();
            if (objZ == AbstractC1930b.c()) {
                AbstractC1953h.c(interfaceC1885d);
            }
            return objZ;
        } catch (Throwable th) {
            c0406mB.L();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        r12.s(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00aa, code lost:
    
        r12 = (J5.h) r12.g();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void h0(h hVar) {
        v5.l lVar = this.f1789c;
        O oC = null;
        Object objB = AbstractC0435l.b(null, 1, null);
        loop0: do {
            int i7 = c.f1795b - 1;
            while (true) {
                if (-1 >= i7) {
                    break;
                }
                long j7 = (hVar.f2062o * ((long) c.f1795b)) + ((long) i7);
                while (true) {
                    Object objW = hVar.w(i7);
                    if (objW == c.f1802i) {
                        break loop0;
                    }
                    if (objW != c.f1797d) {
                        if (objW != c.f1798e && objW != null) {
                            if (!(objW instanceof P0) && !(objW instanceof n)) {
                                if (objW != c.f1800g && objW != c.f1799f) {
                                    if (objW != c.f1800g) {
                                        break;
                                    }
                                } else {
                                    break loop0;
                                }
                            } else {
                                if (j7 < F()) {
                                    break loop0;
                                }
                                P0 p02 = objW instanceof n ? ((n) objW).f1824a : (P0) objW;
                                if (hVar.r(i7, objW, c.y())) {
                                    if (lVar != null) {
                                        oC = x.c(lVar, hVar.v(i7), oC);
                                    }
                                    objB = AbstractC0435l.c(objB, p02);
                                }
                            }
                        } else {
                            if (hVar.r(i7, objW, c.y())) {
                                break;
                            }
                        }
                    } else if (j7 < F()) {
                        break loop0;
                    } else if (hVar.r(i7, objW, c.y())) {
                        if (lVar != null) {
                            oC = x.c(lVar, hVar.v(i7), oC);
                        }
                    }
                }
                hVar.p();
                i7--;
            }
        } while (hVar != null);
        if (objB != null) {
            if (objB instanceof ArrayList) {
                w5.k.d(objB, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
                ArrayList arrayList = (ArrayList) objB;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    j0((P0) arrayList.get(size));
                }
            } else {
                j0((P0) objB);
            }
        }
        if (oC != null) {
            throw oC;
        }
    }

    private final void i0(P0 p02) {
        k0(p02, true);
    }

    private final void j0(P0 p02) {
        k0(p02, false);
    }

    private final void k0(P0 p02, boolean z6) {
        if (p02 instanceof InterfaceC0404l) {
            InterfaceC1885d interfaceC1885d = (InterfaceC1885d) p02;
            m.a aVar = i5.m.f19973m;
            interfaceC1885d.h(i5.m.a(i5.n.a(z6 ? E() : G())));
        } else {
            throw new IllegalStateException(("Unexpected waiter: " + p02).toString());
        }
    }

    private final boolean l0(long j7) {
        if (R(j7)) {
            return false;
        }
        return !q(j7 & 1152921504606846975L);
    }

    private final boolean m0(Object obj, Object obj2) {
        if (obj instanceof InterfaceC0404l) {
            w5.k.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            InterfaceC0404l interfaceC0404l = (InterfaceC0404l) obj;
            v5.l lVar = this.f1789c;
            return c.A(interfaceC0404l, obj2, lVar != null ? x.a(lVar, obj2, interfaceC0404l.a()) : null);
        }
        throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
    }

    private final boolean n0(Object obj, h hVar, int i7) {
        if (obj instanceof InterfaceC0404l) {
            w5.k.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return c.B((InterfaceC0404l) obj, u.f19985a, null, 2, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    private final boolean o0(h hVar, int i7, long j7) {
        Object objW = hVar.w(i7);
        if (!(objW instanceof P0) || j7 < f1780f.get(this) || !hVar.r(i7, objW, c.f1800g)) {
            return p0(hVar, i7, j7);
        }
        if (n0(objW, hVar, i7)) {
            hVar.A(i7, c.f1797d);
            return true;
        }
        hVar.A(i7, c.f1803j);
        hVar.x(i7, false);
        return false;
    }

    private final boolean p0(h hVar, int i7, long j7) {
        while (true) {
            Object objW = hVar.w(i7);
            if (objW instanceof P0) {
                if (j7 < f1780f.get(this)) {
                    if (hVar.r(i7, objW, new n((P0) objW))) {
                        return true;
                    }
                } else if (hVar.r(i7, objW, c.f1800g)) {
                    if (n0(objW, hVar, i7)) {
                        hVar.A(i7, c.f1797d);
                        return true;
                    }
                    hVar.A(i7, c.f1803j);
                    hVar.x(i7, false);
                    return false;
                }
            } else {
                if (objW == c.f1803j) {
                    return false;
                }
                if (objW == null) {
                    if (hVar.r(i7, objW, c.f1798e)) {
                        return true;
                    }
                } else {
                    if (objW == c.f1797d || objW == c.f1801h || objW == c.f1802i || objW == c.f1804k || objW == c.y()) {
                        return true;
                    }
                    if (objW != c.f1799f) {
                        throw new IllegalStateException(("Unexpected cell state: " + objW).toString());
                    }
                }
            }
        }
    }

    private final boolean q(long j7) {
        return j7 < C() || j7 < F() + ((long) this.f1788b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object q0(h hVar, int i7, long j7, Object obj) {
        Object objW = hVar.w(i7);
        if (objW == null) {
            if (j7 >= (f1779e.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return c.f1807n;
                }
                if (hVar.r(i7, objW, obj)) {
                    y();
                    return c.f1806m;
                }
            }
        } else if (objW == c.f1797d && hVar.r(i7, objW, c.f1802i)) {
            y();
            return hVar.y(i7);
        }
        return r0(hVar, i7, j7, obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        r0 = M5.AbstractC0435l.c(r0, r4);
        r9.x(r3, true);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void r(h hVar, long j7) {
        Object objB = AbstractC0435l.b(null, 1, null);
        loop0: while (hVar != null) {
            int i7 = c.f1795b - 1;
            while (-1 < i7) {
                if ((hVar.f2062o * ((long) c.f1795b)) + ((long) i7) < j7) {
                    break loop0;
                }
                while (true) {
                    Object objW = hVar.w(i7);
                    if (objW != null && objW != c.f1798e) {
                        if (!(objW instanceof n)) {
                            if (objW instanceof P0) {
                                if (hVar.r(i7, objW, c.y())) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            if (hVar.r(i7, objW, c.y())) {
                                objW = ((n) objW).f1824a;
                                break;
                            }
                        }
                    } else {
                        if (hVar.r(i7, objW, c.y())) {
                            hVar.p();
                            break;
                        }
                    }
                }
                i7--;
            }
            hVar = (h) hVar.g();
        }
        if (objB != null) {
            if (!(objB instanceof ArrayList)) {
                i0((P0) objB);
                return;
            }
            w5.k.d(objB, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
            ArrayList arrayList = (ArrayList) objB;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                i0((P0) arrayList.get(size));
            }
        }
    }

    private final Object r0(h hVar, int i7, long j7, Object obj) {
        while (true) {
            Object objW = hVar.w(i7);
            if (objW == null || objW == c.f1798e) {
                if (j7 < (f1779e.get(this) & 1152921504606846975L)) {
                    if (hVar.r(i7, objW, c.f1801h)) {
                        y();
                        return c.f1808o;
                    }
                } else {
                    if (obj == null) {
                        return c.f1807n;
                    }
                    if (hVar.r(i7, objW, obj)) {
                        y();
                        return c.f1806m;
                    }
                }
            } else {
                if (objW != c.f1797d) {
                    if (objW != c.f1803j && objW != c.f1801h) {
                        if (objW == c.y()) {
                            y();
                            return c.f1808o;
                        }
                        if (objW != c.f1800g && hVar.r(i7, objW, c.f1799f)) {
                            boolean z6 = objW instanceof n;
                            if (z6) {
                                objW = ((n) objW).f1824a;
                            }
                            if (n0(objW, hVar, i7)) {
                                hVar.A(i7, c.f1802i);
                                y();
                                return hVar.y(i7);
                            }
                            hVar.A(i7, c.f1803j);
                            hVar.x(i7, false);
                            if (z6) {
                                y();
                            }
                            return c.f1808o;
                        }
                    }
                    return c.f1808o;
                }
                if (hVar.r(i7, objW, c.f1802i)) {
                    y();
                    return hVar.y(i7);
                }
            }
        }
    }

    private final h s() {
        Object obj = f1785k.get(this);
        h hVar = (h) f1783i.get(this);
        if (hVar.f2062o > ((h) obj).f2062o) {
            obj = hVar;
        }
        h hVar2 = (h) f1784j.get(this);
        if (hVar2.f2062o > ((h) obj).f2062o) {
            obj = hVar2;
        }
        return (h) AbstractC0427d.b((AbstractC0428e) obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int s0(h hVar, int i7, Object obj, long j7, Object obj2, boolean z6) {
        hVar.B(i7, obj);
        if (z6) {
            return t0(hVar, i7, obj, j7, obj2, z6);
        }
        Object objW = hVar.w(i7);
        if (objW == null) {
            if (q(j7)) {
                if (hVar.r(i7, null, c.f1797d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (hVar.r(i7, null, obj2)) {
                    return 2;
                }
            }
        } else if (objW instanceof P0) {
            hVar.s(i7);
            if (m0(objW, obj)) {
                hVar.A(i7, c.f1802i);
                b0();
                return 0;
            }
            if (hVar.t(i7, c.f1804k) != c.f1804k) {
                hVar.x(i7, true);
            }
            return 5;
        }
        return t0(hVar, i7, obj, j7, obj2, z6);
    }

    private final int t0(h hVar, int i7, Object obj, long j7, Object obj2, boolean z6) {
        while (true) {
            Object objW = hVar.w(i7);
            if (objW == null) {
                if (!q(j7) || z6) {
                    if (z6) {
                        if (hVar.r(i7, null, c.f1803j)) {
                            hVar.x(i7, false);
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (hVar.r(i7, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (hVar.r(i7, null, c.f1797d)) {
                    return 1;
                }
            } else {
                if (objW != c.f1798e) {
                    if (objW == c.f1804k) {
                        hVar.s(i7);
                        return 5;
                    }
                    if (objW == c.f1801h) {
                        hVar.s(i7);
                        return 5;
                    }
                    F fY = c.y();
                    hVar.s(i7);
                    if (objW == fY) {
                        w();
                        return 4;
                    }
                    if (objW instanceof n) {
                        objW = ((n) objW).f1824a;
                    }
                    if (m0(objW, obj)) {
                        hVar.A(i7, c.f1802i);
                        b0();
                        return 0;
                    }
                    if (hVar.t(i7, c.f1804k) != c.f1804k) {
                        hVar.x(i7, true);
                    }
                    return 5;
                }
                if (hVar.r(i7, objW, c.f1797d)) {
                    return 1;
                }
            }
        }
    }

    private final void u(long j7) {
        h0(v(j7));
    }

    private final void u0(long j7) {
        long j8;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1780f;
        do {
            j8 = atomicLongFieldUpdater.get(this);
            if (j8 >= j7) {
                return;
            }
        } while (!f1780f.compareAndSet(this, j8, j7));
    }

    private final h v(long j7) {
        h hVarS = s();
        if (S()) {
            long jU = U(hVarS);
            if (jU != -1) {
                x(jU);
            }
        }
        r(hVarS, j7);
        return hVarS;
    }

    private final void v0(long j7) {
        long j8;
        long j9;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1779e;
        do {
            j8 = atomicLongFieldUpdater.get(this);
            j9 = 1152921504606846975L & j8;
            if (j9 >= j7) {
                return;
            }
        } while (!f1779e.compareAndSet(this, j8, c.v(j9, (int) (j8 >> 60))));
    }

    private final void w() {
        Q();
    }

    private final void y() {
        if (T()) {
            return;
        }
        h hVar = (h) f1785k.get(this);
        while (true) {
            long andIncrement = f1781g.getAndIncrement(this);
            int i7 = c.f1795b;
            long j7 = andIncrement / ((long) i7);
            long jH = H();
            long j8 = hVar.f2062o;
            if (jH <= andIncrement) {
                if (j8 < j7 && hVar.e() != null) {
                    Y(j7, hVar);
                }
                K(this, 0L, 1, null);
                return;
            }
            if (j8 != j7) {
                h hVarZ = z(j7, hVar, andIncrement);
                if (hVarZ == null) {
                    continue;
                } else {
                    hVar = hVarZ;
                }
            }
            boolean zO0 = o0(hVar, (int) (andIncrement % ((long) i7)), andIncrement);
            K(this, 0L, 1, null);
            if (zO0) {
                return;
            }
        }
    }

    private final h z(long j7, h hVar, long j8) {
        Object objC;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1785k;
        p pVar = (p) c.x();
        loop0: while (true) {
            objC = AbstractC0427d.c(hVar, j7, pVar);
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
        if (D.c(objC)) {
            w();
            Y(j7, hVar);
        } else {
            h hVar2 = (h) D.b(objC);
            long j9 = hVar2.f2062o;
            if (j9 <= j7) {
                return hVar2;
            }
            int i7 = c.f1795b;
            if (f1781g.compareAndSet(this, j8 + 1, ((long) i7) * j9)) {
                J((hVar2.f2062o * ((long) i7)) - j8);
                return null;
            }
        }
        K(this, 0L, 1, null);
        return null;
    }

    protected final Throwable D() {
        return (Throwable) f1786l.get(this);
    }

    public final long F() {
        return f1780f.get(this);
    }

    protected final Throwable G() {
        Throwable thD = D();
        return thD == null ? new j("Channel was closed") : thD;
    }

    public final long H() {
        return f1779e.get(this) & 1152921504606846975L;
    }

    public final boolean I() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1784j;
            h hVarA = (h) atomicReferenceFieldUpdater.get(this);
            long jF = F();
            if (H() <= jF) {
                return false;
            }
            int i7 = c.f1795b;
            long j7 = jF / ((long) i7);
            if (hVarA.f2062o == j7 || (hVarA = A(j7, hVarA)) != null) {
                hVarA.b();
                if (M(hVarA, (int) (jF % ((long) i7)), jF)) {
                    return true;
                }
                f1780f.compareAndSet(this, jF, jF + 1);
            } else if (((h) atomicReferenceFieldUpdater.get(this)).f2062o < j7) {
                return false;
            }
        }
    }

    public boolean O() {
        return P(f1779e.get(this));
    }

    public boolean Q() {
        return R(f1779e.get(this));
    }

    protected boolean S() {
        return false;
    }

    @Override // J5.l
    public Object a() {
        h hVar;
        long j7 = f1780f.get(this);
        long j8 = f1779e.get(this);
        if (P(j8)) {
            return f.f1817a.a(D());
        }
        if (j7 >= (j8 & 1152921504606846975L)) {
            return f.f1817a.b();
        }
        Object obj = c.f1804k;
        h hVar2 = (h) f1784j.get(this);
        while (!O()) {
            long andIncrement = f1780f.getAndIncrement(this);
            int i7 = c.f1795b;
            long j9 = andIncrement / ((long) i7);
            int i8 = (int) (andIncrement % ((long) i7));
            if (hVar2.f2062o != j9) {
                h hVarA = A(j9, hVar2);
                if (hVarA == null) {
                    continue;
                } else {
                    hVar = hVarA;
                }
            } else {
                hVar = hVar2;
            }
            Object objQ0 = q0(hVar, i8, andIncrement, obj);
            if (objQ0 == c.f1806m) {
                P0 p02 = obj instanceof P0 ? (P0) obj : null;
                if (p02 != null) {
                    d0(p02, hVar, i8);
                }
                w0(andIncrement);
                hVar.p();
                return f.f1817a.b();
            }
            if (objQ0 != c.f1808o) {
                if (objQ0 == c.f1807n) {
                    throw new IllegalStateException("unexpected".toString());
                }
                hVar.b();
                return f.f1817a.c(objQ0);
            }
            if (andIncrement < H()) {
                hVar.b();
            }
            hVar2 = hVar;
        }
        return f.f1817a.a(D());
    }

    @Override // J5.m
    public boolean b(Throwable th) {
        return t(th, false);
    }

    @Override // J5.l
    public Object c(InterfaceC1885d interfaceC1885d) {
        return f0(this, interfaceC1885d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return J5.f.f1817a.c(i5.u.f19985a);
     */
    @Override // J5.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object d(Object obj) {
        h hVar;
        if (l0(f1779e.get(this))) {
            return f.f1817a.b();
        }
        Object obj2 = c.f1803j;
        h hVar2 = (h) f1783i.get(this);
        while (true) {
            long andIncrement = f1779e.getAndIncrement(this);
            long j7 = andIncrement & 1152921504606846975L;
            boolean zR = R(andIncrement);
            int i7 = c.f1795b;
            long j8 = j7 / ((long) i7);
            int i8 = (int) (j7 % ((long) i7));
            if (hVar2.f2062o != j8) {
                h hVarB = B(j8, hVar2);
                if (hVarB != null) {
                    hVar = hVarB;
                } else if (zR) {
                    break;
                }
            } else {
                hVar = hVar2;
            }
            int iS0 = s0(hVar, i8, obj, j7, obj2, zR);
            if (iS0 == 0) {
                hVar.b();
                break;
            }
            if (iS0 == 1) {
                break;
            }
            if (iS0 != 2) {
                if (iS0 == 3) {
                    throw new IllegalStateException("unexpected".toString());
                }
                if (iS0 != 4) {
                    if (iS0 == 5) {
                        hVar.b();
                    }
                    hVar2 = hVar;
                } else if (j7 < F()) {
                    hVar.b();
                }
            } else {
                if (!zR) {
                    P0 p02 = obj2 instanceof P0 ? (P0) obj2 : null;
                    if (p02 != null) {
                        e0(p02, hVar, i8);
                    }
                    hVar.p();
                    return f.f1817a.b();
                }
                hVar.p();
            }
        }
        return f.f1817a.a(G());
    }

    protected boolean t(Throwable th, boolean z6) {
        if (z6) {
            V();
        }
        boolean zA = androidx.concurrent.futures.b.a(f1786l, this, c.f1812s, th);
        if (z6) {
            W();
        } else {
            X();
        }
        w();
        Z();
        if (zA) {
            L();
        }
        return zA;
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x01ae, code lost:
    
        r3 = (J5.h) r3.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01b5, code lost:
    
        if (r3 != null) goto L84;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        Iterator it;
        String string;
        String str;
        StringBuilder sb = new StringBuilder();
        int i7 = (int) (f1779e.get(this) >> 60);
        if (i7 != 2) {
            str = i7 == 3 ? "cancelled," : "closed,";
            sb.append("capacity=" + this.f1788b + ',');
            sb.append("data=[");
            int i8 = 0;
            List listK = AbstractC1809n.k(f1784j.get(this), f1783i.get(this), f1785k.get(this));
            ArrayList arrayList = new ArrayList();
            for (Object obj : listK) {
                if (((h) obj) != c.f1794a) {
                    arrayList.add(obj);
                }
            }
            it = arrayList.iterator();
            if (it.hasNext()) {
                throw new NoSuchElementException();
            }
            Object next = it.next();
            if (it.hasNext()) {
                long j7 = ((h) next).f2062o;
                do {
                    Object next2 = it.next();
                    long j8 = ((h) next2).f2062o;
                    if (j7 > j8) {
                        next = next2;
                        j7 = j8;
                    }
                } while (it.hasNext());
            }
            h hVar = (h) next;
            long jF = F();
            long jH = H();
            loop2: while (true) {
                int i9 = c.f1795b;
                int i10 = i8;
                while (true) {
                    if (i10 >= i9) {
                        break;
                    }
                    long j9 = (hVar.f2062o * ((long) c.f1795b)) + ((long) i10);
                    if (j9 >= jH && j9 >= jF) {
                        break loop2;
                    }
                    Object objW = hVar.w(i10);
                    Object objV = hVar.v(i10);
                    if (objW instanceof InterfaceC0404l) {
                        string = (j9 >= jF || j9 < jH) ? (j9 >= jH || j9 < jF) ? "cont" : "send" : "receive";
                    } else if (objW instanceof n) {
                        string = "EB(" + objW + ')';
                    } else if (w5.k.b(objW, c.f1799f) ? true : w5.k.b(objW, c.f1800g)) {
                        string = "resuming_sender";
                    } else if (objW == null ? true : w5.k.b(objW, c.f1798e) ? true : w5.k.b(objW, c.f1802i) ? true : w5.k.b(objW, c.f1801h) ? true : w5.k.b(objW, c.f1804k) ? true : w5.k.b(objW, c.f1803j) ? true : w5.k.b(objW, c.y())) {
                        i10++;
                    } else {
                        string = objW.toString();
                    }
                    sb.append(objV != null ? '(' + string + ',' + objV + ")," : string + ',');
                    i10++;
                }
                i8 = 0;
            }
            if (F5.g.E0(sb) == ',') {
                w5.k.e(sb.deleteCharAt(sb.length() - 1), "this.deleteCharAt(index)");
            }
            sb.append("]");
            return sb.toString();
        }
        sb.append(str);
        sb.append("capacity=" + this.f1788b + ',');
        sb.append("data=[");
        int i82 = 0;
        List listK2 = AbstractC1809n.k(f1784j.get(this), f1783i.get(this), f1785k.get(this));
        ArrayList arrayList2 = new ArrayList();
        while (r2.hasNext()) {
        }
        it = arrayList2.iterator();
        if (it.hasNext()) {
        }
    }

    public final void w0(long j7) {
        long j8;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j9;
        if (T()) {
            return;
        }
        while (C() <= j7) {
        }
        int i7 = c.f1796c;
        for (int i8 = 0; i8 < i7; i8++) {
            long jC = C();
            if (jC == (4611686018427387903L & f1782h.get(this)) && jC == C()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f1782h;
        do {
            j8 = atomicLongFieldUpdater2.get(this);
        } while (!atomicLongFieldUpdater2.compareAndSet(this, j8, c.u(j8 & 4611686018427387903L, true)));
        while (true) {
            long jC2 = C();
            atomicLongFieldUpdater = f1782h;
            long j10 = atomicLongFieldUpdater.get(this);
            long j11 = j10 & 4611686018427387903L;
            boolean z6 = (4611686018427387904L & j10) != 0;
            if (jC2 == j11 && jC2 == C()) {
                break;
            } else if (!z6) {
                atomicLongFieldUpdater.compareAndSet(this, j10, c.u(j11, true));
            }
        }
        do {
            j9 = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j9, c.u(j9 & 4611686018427387903L, false)));
    }

    protected final void x(long j7) {
        O oD;
        h hVar = (h) f1784j.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f1780f;
            long j8 = atomicLongFieldUpdater.get(this);
            if (j7 < Math.max(((long) this.f1788b) + j8, C())) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j8, j8 + 1)) {
                int i7 = c.f1795b;
                long j9 = j8 / ((long) i7);
                int i8 = (int) (j8 % ((long) i7));
                if (hVar.f2062o != j9) {
                    h hVarA = A(j9, hVar);
                    if (hVarA == null) {
                        continue;
                    } else {
                        hVar = hVarA;
                    }
                }
                Object objQ0 = q0(hVar, i8, j8, null);
                if (objQ0 != c.f1808o) {
                    hVar.b();
                    v5.l lVar = this.f1789c;
                    if (lVar != null && (oD = x.d(lVar, objQ0, null, 2, null)) != null) {
                        throw oD;
                    }
                } else if (j8 < H()) {
                    hVar.b();
                }
            }
        }
    }

    protected void Z() {
    }

    protected void b0() {
    }

    protected void c0() {
    }
}
