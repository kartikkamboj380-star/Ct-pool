package H5;

import H5.InterfaceC0415q0;
import M5.C0433j;
import i5.C1747d;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m5.InterfaceC1885d;
import m5.InterfaceC1888g;
import n5.AbstractC1930b;
import o5.InterfaceC1950e;

/* JADX INFO: renamed from: H5.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C0406m extends U implements InterfaceC0404l, InterfaceC1950e, P0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f1431r = AtomicIntegerFieldUpdater.newUpdater(C0406m.class, "_decisionAndIndex");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f1432s = AtomicReferenceFieldUpdater.newUpdater(C0406m.class, Object.class, "_state");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f1433t = AtomicReferenceFieldUpdater.newUpdater(C0406m.class, Object.class, "_parentHandle");
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final InterfaceC1885d f1434p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final InterfaceC1888g f1435q;

    public C0406m(InterfaceC1885d interfaceC1885d, int i7) {
        super(i7);
        this.f1434p = interfaceC1885d;
        this.f1435q = interfaceC1885d.a();
        this._decisionAndIndex = 536870911;
        this._state = C0388d.f1420m;
    }

    private final String B() {
        Object objA = A();
        return objA instanceof E0 ? "Active" : objA instanceof C0412p ? "Cancelled" : "Completed";
    }

    private final X D() {
        InterfaceC0415q0 interfaceC0415q0 = (InterfaceC0415q0) a().b(InterfaceC0415q0.f1444b);
        if (interfaceC0415q0 == null) {
            return null;
        }
        X xC = InterfaceC0415q0.a.c(interfaceC0415q0, true, false, new C0414q(this), 2, null);
        androidx.concurrent.futures.b.a(f1433t, this, null, xC);
        return xC;
    }

    private final void E(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1432s;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof C0388d)) {
                if (obj2 instanceof AbstractC0400j ? true : obj2 instanceof M5.C) {
                    I(obj, obj2);
                } else {
                    if (obj2 instanceof C0423z) {
                        C0423z c0423z = (C0423z) obj2;
                        if (!c0423z.b()) {
                            I(obj, obj2);
                        }
                        if (obj2 instanceof C0412p) {
                            if (!(obj2 instanceof C0423z)) {
                                c0423z = null;
                            }
                            Throwable th = c0423z != null ? c0423z.f1476a : null;
                            if (obj instanceof AbstractC0400j) {
                                n((AbstractC0400j) obj, th);
                                return;
                            } else {
                                w5.k.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                                s((M5.C) obj, th);
                                return;
                            }
                        }
                        return;
                    }
                    if (obj2 instanceof C0422y) {
                        C0422y c0422y = (C0422y) obj2;
                        if (c0422y.f1464b != null) {
                            I(obj, obj2);
                        }
                        if (obj instanceof M5.C) {
                            return;
                        }
                        w5.k.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        AbstractC0400j abstractC0400j = (AbstractC0400j) obj;
                        if (c0422y.c()) {
                            n(abstractC0400j, c0422y.f1467e);
                            return;
                        } else {
                            if (androidx.concurrent.futures.b.a(f1432s, this, obj2, C0422y.b(c0422y, null, abstractC0400j, null, null, null, 29, null))) {
                                return;
                            }
                        }
                    } else {
                        if (obj instanceof M5.C) {
                            return;
                        }
                        w5.k.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        if (androidx.concurrent.futures.b.a(f1432s, this, obj2, new C0422y(obj2, (AbstractC0400j) obj, null, null, null, 28, null))) {
                            return;
                        }
                    }
                }
            } else if (androidx.concurrent.futures.b.a(f1432s, this, obj2, obj)) {
                return;
            }
        }
    }

    private final boolean G() {
        if (V.c(this.f1406o)) {
            InterfaceC1885d interfaceC1885d = this.f1434p;
            w5.k.d(interfaceC1885d, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (((C0433j) interfaceC1885d).s()) {
                return true;
            }
        }
        return false;
    }

    private final AbstractC0400j H(v5.l lVar) {
        return lVar instanceof AbstractC0400j ? (AbstractC0400j) lVar : new C0409n0(lVar);
    }

    private final void I(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    private final void N(Object obj, int i7, v5.l lVar) {
        Object obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1432s;
        do {
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof E0)) {
                if (obj2 instanceof C0412p) {
                    C0412p c0412p = (C0412p) obj2;
                    if (c0412p.c()) {
                        if (lVar != null) {
                            o(lVar, c0412p.f1476a);
                            return;
                        }
                        return;
                    }
                }
                m(obj);
                throw new C1747d();
            }
        } while (!androidx.concurrent.futures.b.a(f1432s, this, obj2, P((E0) obj2, obj, i7, lVar, null)));
        v();
        w(i7);
    }

    static /* synthetic */ void O(C0406m c0406m, Object obj, int i7, v5.l lVar, int i8, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i8 & 4) != 0) {
            lVar = null;
        }
        c0406m.N(obj, i7, lVar);
    }

    private final Object P(E0 e02, Object obj, int i7, v5.l lVar, Object obj2) {
        if (obj instanceof C0423z) {
            return obj;
        }
        if (!V.b(i7) && obj2 == null) {
            return obj;
        }
        if (lVar == null && !(e02 instanceof AbstractC0400j) && obj2 == null) {
            return obj;
        }
        return new C0422y(obj, e02 instanceof AbstractC0400j ? (AbstractC0400j) e02 : null, lVar, obj2, null, 16, null);
    }

    private final boolean Q() {
        int i7;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1431r;
        do {
            i7 = atomicIntegerFieldUpdater.get(this);
            int i8 = i7 >> 29;
            if (i8 != 0) {
                if (i8 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f1431r.compareAndSet(this, i7, 1073741824 + (536870911 & i7)));
        return true;
    }

    private final M5.F R(Object obj, Object obj2, v5.l lVar) {
        Object obj3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1432s;
        do {
            obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof E0)) {
                if ((obj3 instanceof C0422y) && obj2 != null && ((C0422y) obj3).f1466d == obj2) {
                    return AbstractC0408n.f1437a;
                }
                return null;
            }
        } while (!androidx.concurrent.futures.b.a(f1432s, this, obj3, P((E0) obj3, obj, this.f1406o, lVar, obj2)));
        v();
        return AbstractC0408n.f1437a;
    }

    private final boolean S() {
        int i7;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1431r;
        do {
            i7 = atomicIntegerFieldUpdater.get(this);
            int i8 = i7 >> 29;
            if (i8 != 0) {
                if (i8 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f1431r.compareAndSet(this, i7, 536870912 + (536870911 & i7)));
        return true;
    }

    private final Void m(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    private final void s(M5.C c7, Throwable th) {
        int i7 = f1431r.get(this) & 536870911;
        if (i7 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken".toString());
        }
        try {
            c7.o(i7, th, a());
        } catch (Throwable th2) {
            H.a(a(), new C("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    private final boolean t(Throwable th) {
        if (!G()) {
            return false;
        }
        InterfaceC1885d interfaceC1885d = this.f1434p;
        w5.k.d(interfaceC1885d, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((C0433j) interfaceC1885d).t(th);
    }

    private final void v() {
        if (G()) {
            return;
        }
        u();
    }

    private final void w(int i7) {
        if (Q()) {
            return;
        }
        V.a(this, i7);
    }

    private final X y() {
        return (X) f1433t.get(this);
    }

    public final Object A() {
        return f1432s.get(this);
    }

    public void C() {
        X xD = D();
        if (xD != null && F()) {
            xD.c();
            f1433t.set(this, D0.f1379m);
        }
    }

    public boolean F() {
        return !(A() instanceof E0);
    }

    protected String J() {
        return "CancellableContinuation";
    }

    public final void K(Throwable th) {
        if (t(th)) {
            return;
        }
        p(th);
        v();
    }

    public final void L() {
        Throwable thV;
        InterfaceC1885d interfaceC1885d = this.f1434p;
        C0433j c0433j = interfaceC1885d instanceof C0433j ? (C0433j) interfaceC1885d : null;
        if (c0433j == null || (thV = c0433j.v(this)) == null) {
            return;
        }
        u();
        p(thV);
    }

    public final boolean M() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1432s;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if ((obj instanceof C0422y) && ((C0422y) obj).f1466d != null) {
            u();
            return false;
        }
        f1431r.set(this, 536870911);
        atomicReferenceFieldUpdater.set(this, C0388d.f1420m);
        return true;
    }

    @Override // m5.InterfaceC1885d
    public InterfaceC1888g a() {
        return this.f1435q;
    }

    @Override // H5.P0
    public void b(M5.C c7, int i7) {
        int i8;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1431r;
        do {
            i8 = atomicIntegerFieldUpdater.get(this);
            if ((i8 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i8, ((i8 >> 29) << 29) + i7));
        E(c7);
    }

    @Override // H5.InterfaceC0404l
    public void c(Object obj, v5.l lVar) {
        N(obj, this.f1406o, lVar);
    }

    @Override // H5.U
    public void d(Object obj, Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1432s;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof E0) {
                throw new IllegalStateException("Not completed".toString());
            }
            if (obj2 instanceof C0423z) {
                return;
            }
            if (obj2 instanceof C0422y) {
                C0422y c0422y = (C0422y) obj2;
                if (!(!c0422y.c())) {
                    throw new IllegalStateException("Must be called at most once".toString());
                }
                if (androidx.concurrent.futures.b.a(f1432s, this, obj2, C0422y.b(c0422y, null, null, null, null, th, 15, null))) {
                    c0422y.d(this, th);
                    return;
                }
            } else if (androidx.concurrent.futures.b.a(f1432s, this, obj2, new C0422y(obj2, null, null, null, th, 14, null))) {
                return;
            }
        }
    }

    @Override // H5.U
    public final InterfaceC1885d e() {
        return this.f1434p;
    }

    @Override // H5.U
    public Throwable f(Object obj) {
        Throwable thF = super.f(obj);
        if (thF != null) {
            return thF;
        }
        return null;
    }

    @Override // o5.InterfaceC1950e
    public InterfaceC1950e g() {
        InterfaceC1885d interfaceC1885d = this.f1434p;
        if (interfaceC1885d instanceof InterfaceC1950e) {
            return (InterfaceC1950e) interfaceC1885d;
        }
        return null;
    }

    @Override // m5.InterfaceC1885d
    public void h(Object obj) {
        O(this, D.b(obj, this), this.f1406o, null, 4, null);
    }

    @Override // H5.U
    public Object i(Object obj) {
        return obj instanceof C0422y ? ((C0422y) obj).f1463a : obj;
    }

    @Override // H5.InterfaceC0404l
    public void k(v5.l lVar) {
        E(H(lVar));
    }

    @Override // H5.U
    public Object l() {
        return A();
    }

    public final void n(AbstractC0400j abstractC0400j, Throwable th) {
        try {
            abstractC0400j.a(th);
        } catch (Throwable th2) {
            H.a(a(), new C("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void o(v5.l lVar, Throwable th) {
        try {
            lVar.i(th);
        } catch (Throwable th2) {
            H.a(a(), new C("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    @Override // H5.InterfaceC0404l
    public boolean p(Throwable th) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1432s;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof E0)) {
                return false;
            }
        } while (!androidx.concurrent.futures.b.a(f1432s, this, obj, new C0412p(this, th, (obj instanceof AbstractC0400j) || (obj instanceof M5.C))));
        E0 e02 = (E0) obj;
        if (e02 instanceof AbstractC0400j) {
            n((AbstractC0400j) obj, th);
        } else if (e02 instanceof M5.C) {
            s((M5.C) obj, th);
        }
        v();
        w(this.f1406o);
        return true;
    }

    @Override // H5.InterfaceC0404l
    public Object q(Object obj, Object obj2, v5.l lVar) {
        return R(obj, obj2, lVar);
    }

    @Override // H5.InterfaceC0404l
    public void r(Object obj) {
        w(this.f1406o);
    }

    public String toString() {
        return J() + '(' + M.c(this.f1434p) + "){" + B() + "}@" + M.b(this);
    }

    public final void u() {
        X xY = y();
        if (xY == null) {
            return;
        }
        xY.c();
        f1433t.set(this, D0.f1379m);
    }

    public Throwable x(InterfaceC0415q0 interfaceC0415q0) {
        return interfaceC0415q0.w();
    }

    public final Object z() {
        InterfaceC0415q0 interfaceC0415q0;
        boolean zG = G();
        if (S()) {
            if (y() == null) {
                D();
            }
            if (zG) {
                L();
            }
            return AbstractC1930b.c();
        }
        if (zG) {
            L();
        }
        Object objA = A();
        if (objA instanceof C0423z) {
            throw ((C0423z) objA).f1476a;
        }
        if (!V.b(this.f1406o) || (interfaceC0415q0 = (InterfaceC0415q0) a().b(InterfaceC0415q0.f1444b)) == null || interfaceC0415q0.d()) {
            return i(objA);
        }
        CancellationException cancellationExceptionW = interfaceC0415q0.w();
        d(objA, cancellationExceptionW);
        throw cancellationExceptionW;
    }
}
