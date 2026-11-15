package H5;

import H5.InterfaceC0415q0;
import M5.q;
import i5.AbstractC1744a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m5.InterfaceC1885d;
import m5.InterfaceC1888g;
import n5.AbstractC1930b;
import o5.AbstractC1953h;

/* JADX INFO: loaded from: classes2.dex */
public class x0 implements InterfaceC0415q0, InterfaceC0417t, F0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f1450m = AtomicReferenceFieldUpdater.newUpdater(x0.class, Object.class, "_state");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f1451n = AtomicReferenceFieldUpdater.newUpdater(x0.class, Object.class, "_parentHandle");
    private volatile Object _parentHandle;
    private volatile Object _state;

    private static final class a extends C0406m {

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private final x0 f1452u;

        public a(InterfaceC1885d interfaceC1885d, x0 x0Var) {
            super(interfaceC1885d, 1);
            this.f1452u = x0Var;
        }

        @Override // H5.C0406m
        protected String J() {
            return "AwaitContinuation";
        }

        @Override // H5.C0406m
        public Throwable x(InterfaceC0415q0 interfaceC0415q0) {
            Throwable thE;
            Object objV = this.f1452u.V();
            return (!(objV instanceof c) || (thE = ((c) objV).e()) == null) ? objV instanceof C0423z ? ((C0423z) objV).f1476a : interfaceC0415q0.w() : thE;
        }
    }

    private static final class b extends w0 {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final x0 f1453q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final c f1454r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final C0416s f1455s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Object f1456t;

        public b(x0 x0Var, c cVar, C0416s c0416s, Object obj) {
            this.f1453q = x0Var;
            this.f1454r = cVar;
            this.f1455s = c0416s;
            this.f1456t = obj;
        }

        @Override // v5.l
        public /* bridge */ /* synthetic */ Object i(Object obj) {
            y((Throwable) obj);
            return i5.u.f19985a;
        }

        @Override // H5.B
        public void y(Throwable th) {
            this.f1453q.K(this.f1454r, this.f1455s, this.f1456t);
        }
    }

    private static final class c implements InterfaceC0405l0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final AtomicIntegerFieldUpdater f1457n = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isCompleting");

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final AtomicReferenceFieldUpdater f1458o = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_rootCause");

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final AtomicReferenceFieldUpdater f1459p = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_exceptionsHolder");
        private volatile Object _exceptionsHolder;
        private volatile int _isCompleting;
        private volatile Object _rootCause;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final C0 f1460m;

        public c(C0 c02, boolean z6, Throwable th) {
            this.f1460m = c02;
            this._isCompleting = z6 ? 1 : 0;
            this._rootCause = th;
        }

        private final ArrayList b() {
            return new ArrayList(4);
        }

        private final Object c() {
            return f1459p.get(this);
        }

        private final void l(Object obj) {
            f1459p.set(this, obj);
        }

        public final void a(Throwable th) {
            Throwable thE = e();
            if (thE == null) {
                m(th);
                return;
            }
            if (th == thE) {
                return;
            }
            Object objC = c();
            if (objC == null) {
                l(th);
                return;
            }
            if (objC instanceof Throwable) {
                if (th == objC) {
                    return;
                }
                ArrayList arrayListB = b();
                arrayListB.add(objC);
                arrayListB.add(th);
                l(arrayListB);
                return;
            }
            if (objC instanceof ArrayList) {
                ((ArrayList) objC).add(th);
                return;
            }
            throw new IllegalStateException(("State is " + objC).toString());
        }

        @Override // H5.InterfaceC0405l0
        public boolean d() {
            return e() == null;
        }

        public final Throwable e() {
            return (Throwable) f1458o.get(this);
        }

        public final boolean f() {
            return e() != null;
        }

        @Override // H5.InterfaceC0405l0
        public C0 g() {
            return this.f1460m;
        }

        public final boolean h() {
            return f1457n.get(this) != 0;
        }

        public final boolean i() {
            return c() == y0.f1472e;
        }

        public final List j(Throwable th) {
            ArrayList arrayListB;
            Object objC = c();
            if (objC == null) {
                arrayListB = b();
            } else if (objC instanceof Throwable) {
                ArrayList arrayListB2 = b();
                arrayListB2.add(objC);
                arrayListB = arrayListB2;
            } else {
                if (!(objC instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + objC).toString());
                }
                arrayListB = (ArrayList) objC;
            }
            Throwable thE = e();
            if (thE != null) {
                arrayListB.add(0, thE);
            }
            if (th != null && !w5.k.b(th, thE)) {
                arrayListB.add(th);
            }
            l(y0.f1472e);
            return arrayListB;
        }

        public final void k(boolean z6) {
            f1457n.set(this, z6 ? 1 : 0);
        }

        public final void m(Throwable th) {
            f1458o.set(this, th);
        }

        public String toString() {
            return "Finishing[cancelling=" + f() + ", completing=" + h() + ", rootCause=" + e() + ", exceptions=" + c() + ", list=" + g() + ']';
        }
    }

    public static final class d extends q.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ x0 f1461d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f1462e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(M5.q qVar, x0 x0Var, Object obj) {
            super(qVar);
            this.f1461d = x0Var;
            this.f1462e = obj;
        }

        @Override // M5.AbstractC0425b
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Object d(M5.q qVar) {
            if (this.f1461d.V() == this.f1462e) {
                return null;
            }
            return M5.p.a();
        }
    }

    public x0(boolean z6) {
        this._state = z6 ? y0.f1474g : y0.f1473f;
    }

    private final boolean A0(InterfaceC0405l0 interfaceC0405l0, Object obj) throws Throwable {
        if (!androidx.concurrent.futures.b.a(f1450m, this, interfaceC0405l0, y0.g(obj))) {
            return false;
        }
        o0(null);
        p0(obj);
        I(interfaceC0405l0, obj);
        return true;
    }

    private final boolean C0(InterfaceC0405l0 interfaceC0405l0, Throwable th) throws Throwable {
        C0 c0T = T(interfaceC0405l0);
        if (c0T == null) {
            return false;
        }
        if (!androidx.concurrent.futures.b.a(f1450m, this, interfaceC0405l0, new c(c0T, false, th))) {
            return false;
        }
        l0(c0T, th);
        return true;
    }

    private final Object E(Object obj) {
        Object objE0;
        do {
            Object objV = V();
            if (!(objV instanceof InterfaceC0405l0) || ((objV instanceof c) && ((c) objV).h())) {
                return y0.f1468a;
            }
            objE0 = E0(objV, new C0423z(L(obj), false, 2, null));
        } while (objE0 == y0.f1470c);
        return objE0;
    }

    private final Object E0(Object obj, Object obj2) {
        return !(obj instanceof InterfaceC0405l0) ? y0.f1468a : ((!(obj instanceof Z) && !(obj instanceof w0)) || (obj instanceof C0416s) || (obj2 instanceof C0423z)) ? F0((InterfaceC0405l0) obj, obj2) : A0((InterfaceC0405l0) obj, obj2) ? obj2 : y0.f1470c;
    }

    private final boolean F(Throwable th) {
        if (c0()) {
            return true;
        }
        boolean z6 = th instanceof CancellationException;
        r rVarU = U();
        return (rVarU == null || rVarU == D0.f1379m) ? z6 : rVarU.a(th) || z6;
    }

    private final Object F0(InterfaceC0405l0 interfaceC0405l0, Object obj) throws Throwable {
        C0 c0T = T(interfaceC0405l0);
        if (c0T == null) {
            return y0.f1470c;
        }
        c cVar = interfaceC0405l0 instanceof c ? (c) interfaceC0405l0 : null;
        if (cVar == null) {
            cVar = new c(c0T, false, null);
        }
        w5.v vVar = new w5.v();
        synchronized (cVar) {
            if (cVar.h()) {
                return y0.f1468a;
            }
            cVar.k(true);
            if (cVar != interfaceC0405l0 && !androidx.concurrent.futures.b.a(f1450m, this, interfaceC0405l0, cVar)) {
                return y0.f1470c;
            }
            boolean zF = cVar.f();
            C0423z c0423z = obj instanceof C0423z ? (C0423z) obj : null;
            if (c0423z != null) {
                cVar.a(c0423z.f1476a);
            }
            Throwable thE = true ^ zF ? cVar.e() : null;
            vVar.f22740m = thE;
            i5.u uVar = i5.u.f19985a;
            if (thE != null) {
                l0(c0T, thE);
            }
            C0416s c0416sN = N(interfaceC0405l0);
            return (c0416sN == null || !G0(cVar, c0416sN, obj)) ? M(cVar, obj) : y0.f1469b;
        }
    }

    private final boolean G0(c cVar, C0416s c0416s, Object obj) {
        while (InterfaceC0415q0.a.c(c0416s.f1447q, false, false, new b(this, cVar, c0416s, obj), 1, null) == D0.f1379m) {
            c0416s = k0(c0416s);
            if (c0416s == null) {
                return false;
            }
        }
        return true;
    }

    private final void I(InterfaceC0405l0 interfaceC0405l0, Object obj) throws Throwable {
        r rVarU = U();
        if (rVarU != null) {
            rVarU.c();
            u0(D0.f1379m);
        }
        C0423z c0423z = obj instanceof C0423z ? (C0423z) obj : null;
        Throwable th = c0423z != null ? c0423z.f1476a : null;
        if (!(interfaceC0405l0 instanceof w0)) {
            C0 c0G = interfaceC0405l0.g();
            if (c0G != null) {
                m0(c0G, th);
                return;
            }
            return;
        }
        try {
            ((w0) interfaceC0405l0).y(th);
        } catch (Throwable th2) {
            Y(new C("Exception in completion handler " + interfaceC0405l0 + " for " + this, th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(c cVar, C0416s c0416s, Object obj) {
        C0416s c0416sK0 = k0(c0416s);
        if (c0416sK0 == null || !G0(cVar, c0416sK0, obj)) {
            v(M(cVar, obj));
        }
    }

    private final Throwable L(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new r0(G(), null, this) : th;
        }
        w5.k.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((F0) obj).B0();
    }

    private final Object M(c cVar, Object obj) throws Throwable {
        boolean zF;
        Throwable thQ;
        C0423z c0423z = obj instanceof C0423z ? (C0423z) obj : null;
        Throwable th = c0423z != null ? c0423z.f1476a : null;
        synchronized (cVar) {
            zF = cVar.f();
            List listJ = cVar.j(th);
            thQ = Q(cVar, listJ);
            if (thQ != null) {
                u(thQ, listJ);
            }
        }
        if (thQ != null && thQ != th) {
            obj = new C0423z(thQ, false, 2, null);
        }
        if (thQ != null && (F(thQ) || X(thQ))) {
            w5.k.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            ((C0423z) obj).b();
        }
        if (!zF) {
            o0(thQ);
        }
        p0(obj);
        androidx.concurrent.futures.b.a(f1450m, this, cVar, y0.g(obj));
        I(cVar, obj);
        return obj;
    }

    private final C0416s N(InterfaceC0405l0 interfaceC0405l0) {
        C0416s c0416s = interfaceC0405l0 instanceof C0416s ? (C0416s) interfaceC0405l0 : null;
        if (c0416s != null) {
            return c0416s;
        }
        C0 c0G = interfaceC0405l0.g();
        if (c0G != null) {
            return k0(c0G);
        }
        return null;
    }

    private final Throwable P(Object obj) {
        C0423z c0423z = obj instanceof C0423z ? (C0423z) obj : null;
        if (c0423z != null) {
            return c0423z.f1476a;
        }
        return null;
    }

    private final Throwable Q(c cVar, List list) {
        Object obj = null;
        if (list.isEmpty()) {
            if (cVar.f()) {
                return new r0(G(), null, this);
            }
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (!(((Throwable) next) instanceof CancellationException)) {
                obj = next;
                break;
            }
        }
        Throwable th = (Throwable) obj;
        return th != null ? th : (Throwable) list.get(0);
    }

    private final C0 T(InterfaceC0405l0 interfaceC0405l0) {
        C0 c0G = interfaceC0405l0.g();
        if (c0G != null) {
            return c0G;
        }
        if (interfaceC0405l0 instanceof Z) {
            return new C0();
        }
        if (interfaceC0405l0 instanceof w0) {
            s0((w0) interfaceC0405l0);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + interfaceC0405l0).toString());
    }

    private final Object d0(Object obj) throws Throwable {
        Throwable thL = null;
        while (true) {
            Object objV = V();
            if (objV instanceof c) {
                synchronized (objV) {
                    if (((c) objV).i()) {
                        return y0.f1471d;
                    }
                    boolean zF = ((c) objV).f();
                    if (obj != null || !zF) {
                        if (thL == null) {
                            thL = L(obj);
                        }
                        ((c) objV).a(thL);
                    }
                    Throwable thE = zF ^ true ? ((c) objV).e() : null;
                    if (thE != null) {
                        l0(((c) objV).g(), thE);
                    }
                    return y0.f1468a;
                }
            }
            if (!(objV instanceof InterfaceC0405l0)) {
                return y0.f1471d;
            }
            if (thL == null) {
                thL = L(obj);
            }
            InterfaceC0405l0 interfaceC0405l0 = (InterfaceC0405l0) objV;
            if (!interfaceC0405l0.d()) {
                Object objE0 = E0(objV, new C0423z(thL, false, 2, null));
                if (objE0 == y0.f1468a) {
                    throw new IllegalStateException(("Cannot happen in " + objV).toString());
                }
                if (objE0 != y0.f1470c) {
                    return objE0;
                }
            } else if (C0(interfaceC0405l0, thL)) {
                return y0.f1468a;
            }
        }
    }

    private final w0 g0(v5.l lVar, boolean z6) {
        w0 c0413p0;
        if (z6) {
            c0413p0 = lVar instanceof s0 ? (s0) lVar : null;
            if (c0413p0 == null) {
                c0413p0 = new C0411o0(lVar);
            }
        } else {
            c0413p0 = lVar instanceof w0 ? (w0) lVar : null;
            if (c0413p0 == null) {
                c0413p0 = new C0413p0(lVar);
            }
        }
        c0413p0.A(this);
        return c0413p0;
    }

    private final C0416s k0(M5.q qVar) {
        while (qVar.t()) {
            qVar = qVar.s();
        }
        while (true) {
            qVar = qVar.r();
            if (!qVar.t()) {
                if (qVar instanceof C0416s) {
                    return (C0416s) qVar;
                }
                if (qVar instanceof C0) {
                    return null;
                }
            }
        }
    }

    private final void l0(C0 c02, Throwable th) throws Throwable {
        o0(th);
        Object objQ = c02.q();
        w5.k.d(objQ, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        C c7 = null;
        for (M5.q qVarR = (M5.q) objQ; !w5.k.b(qVarR, c02); qVarR = qVarR.r()) {
            if (qVarR instanceof s0) {
                w0 w0Var = (w0) qVarR;
                try {
                    w0Var.y(th);
                } catch (Throwable th2) {
                    if (c7 != null) {
                        AbstractC1744a.a(c7, th2);
                    } else {
                        c7 = new C("Exception in completion handler " + w0Var + " for " + this, th2);
                        i5.u uVar = i5.u.f19985a;
                    }
                }
            }
        }
        if (c7 != null) {
            Y(c7);
        }
        F(th);
    }

    private final void m0(C0 c02, Throwable th) throws Throwable {
        Object objQ = c02.q();
        w5.k.d(objQ, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        C c7 = null;
        for (M5.q qVarR = (M5.q) objQ; !w5.k.b(qVarR, c02); qVarR = qVarR.r()) {
            if (qVarR instanceof w0) {
                w0 w0Var = (w0) qVarR;
                try {
                    w0Var.y(th);
                } catch (Throwable th2) {
                    if (c7 != null) {
                        AbstractC1744a.a(c7, th2);
                    } else {
                        c7 = new C("Exception in completion handler " + w0Var + " for " + this, th2);
                        i5.u uVar = i5.u.f19985a;
                    }
                }
            }
        }
        if (c7 != null) {
            Y(c7);
        }
    }

    private final void r0(Z z6) {
        C0 c02 = new C0();
        Object c0403k0 = c02;
        if (!z6.d()) {
            c0403k0 = new C0403k0(c02);
        }
        androidx.concurrent.futures.b.a(f1450m, this, z6, c0403k0);
    }

    private final void s0(w0 w0Var) {
        w0Var.k(new C0());
        androidx.concurrent.futures.b.a(f1450m, this, w0Var, w0Var.r());
    }

    private final boolean t(Object obj, C0 c02, w0 w0Var) {
        int iX;
        d dVar = new d(w0Var, this, obj);
        do {
            iX = c02.s().x(w0Var, c02, dVar);
            if (iX == 1) {
                return true;
            }
        } while (iX != 2);
        return false;
    }

    private final void u(Throwable th, List list) {
        if (list.size() <= 1) {
            return;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Throwable th2 = (Throwable) it.next();
            if (th2 != th && th2 != th && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                AbstractC1744a.a(th, th2);
            }
        }
    }

    private final int v0(Object obj) {
        if (obj instanceof Z) {
            if (((Z) obj).d()) {
                return 0;
            }
            if (!androidx.concurrent.futures.b.a(f1450m, this, obj, y0.f1474g)) {
                return -1;
            }
            q0();
            return 1;
        }
        if (!(obj instanceof C0403k0)) {
            return 0;
        }
        if (!androidx.concurrent.futures.b.a(f1450m, this, obj, ((C0403k0) obj).g())) {
            return -1;
        }
        q0();
        return 1;
    }

    private final String w0(Object obj) {
        if (!(obj instanceof c)) {
            return obj instanceof InterfaceC0405l0 ? ((InterfaceC0405l0) obj).d() ? "Active" : "New" : obj instanceof C0423z ? "Cancelled" : "Completed";
        }
        c cVar = (c) obj;
        return cVar.f() ? "Cancelling" : cVar.h() ? "Completing" : "Active";
    }

    private final Object y(InterfaceC1885d interfaceC1885d) {
        a aVar = new a(AbstractC1930b.b(interfaceC1885d), this);
        aVar.C();
        AbstractC0410o.a(aVar, D0(new G0(aVar)));
        Object objZ = aVar.z();
        if (objZ == AbstractC1930b.c()) {
            AbstractC1953h.c(interfaceC1885d);
        }
        return objZ;
    }

    public static /* synthetic */ CancellationException y0(x0 x0Var, Throwable th, String str, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i7 & 1) != 0) {
            str = null;
        }
        return x0Var.x0(th, str);
    }

    public final boolean A(Throwable th) {
        return C(th);
    }

    @Override // H5.F0
    public CancellationException B0() {
        Throwable thE;
        Object objV = V();
        if (objV instanceof c) {
            thE = ((c) objV).e();
        } else if (objV instanceof C0423z) {
            thE = ((C0423z) objV).f1476a;
        } else {
            if (objV instanceof InterfaceC0405l0) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + objV).toString());
            }
            thE = null;
        }
        CancellationException cancellationException = thE instanceof CancellationException ? (CancellationException) thE : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        return new r0("Parent job is " + w0(objV), thE, this);
    }

    public final boolean C(Object obj) throws Throwable {
        Object objD0 = y0.f1468a;
        if (S() && (objD0 = E(obj)) == y0.f1469b) {
            return true;
        }
        if (objD0 == y0.f1468a) {
            objD0 = d0(obj);
        }
        if (objD0 == y0.f1468a || objD0 == y0.f1469b) {
            return true;
        }
        if (objD0 == y0.f1471d) {
            return false;
        }
        v(objD0);
        return true;
    }

    public void D(Throwable th) throws Throwable {
        C(th);
    }

    @Override // H5.InterfaceC0415q0
    public final X D0(v5.l lVar) {
        return W(false, true, lVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String G() {
        return "Job was cancelled";
    }

    public boolean H(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return C(th) && R();
    }

    @Override // H5.InterfaceC0415q0
    public void M0(CancellationException cancellationException) throws Throwable {
        if (cancellationException == null) {
            cancellationException = new r0(G(), null, this);
        }
        D(cancellationException);
    }

    public final Object O() throws Throwable {
        Object objV = V();
        if (!(!(objV instanceof InterfaceC0405l0))) {
            throw new IllegalStateException("This job has not completed yet".toString());
        }
        if (objV instanceof C0423z) {
            throw ((C0423z) objV).f1476a;
        }
        return y0.h(objV);
    }

    public boolean R() {
        return true;
    }

    public boolean S() {
        return false;
    }

    public final r U() {
        return (r) f1451n.get(this);
    }

    public final Object V() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1450m;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof M5.y)) {
                return obj;
            }
            ((M5.y) obj).a(this);
        }
    }

    @Override // H5.InterfaceC0415q0
    public final X W(boolean z6, boolean z7, v5.l lVar) {
        w0 w0VarG0 = g0(lVar, z6);
        while (true) {
            Object objV = V();
            if (objV instanceof Z) {
                Z z8 = (Z) objV;
                if (!z8.d()) {
                    r0(z8);
                } else if (androidx.concurrent.futures.b.a(f1450m, this, objV, w0VarG0)) {
                    return w0VarG0;
                }
            } else {
                if (!(objV instanceof InterfaceC0405l0)) {
                    if (z7) {
                        C0423z c0423z = objV instanceof C0423z ? (C0423z) objV : null;
                        lVar.i(c0423z != null ? c0423z.f1476a : null);
                    }
                    return D0.f1379m;
                }
                C0 c0G = ((InterfaceC0405l0) objV).g();
                if (c0G == null) {
                    w5.k.d(objV, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    s0((w0) objV);
                } else {
                    X x6 = D0.f1379m;
                    if (z6 && (objV instanceof c)) {
                        synchronized (objV) {
                            try {
                                thE = ((c) objV).e();
                                if (thE == null || ((lVar instanceof C0416s) && !((c) objV).h())) {
                                    if (t(objV, c0G, w0VarG0)) {
                                        if (thE == null) {
                                            return w0VarG0;
                                        }
                                        x6 = w0VarG0;
                                    }
                                }
                                i5.u uVar = i5.u.f19985a;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    if (thE != null) {
                        if (z7) {
                            lVar.i(thE);
                        }
                        return x6;
                    }
                    if (t(objV, c0G, w0VarG0)) {
                        return w0VarG0;
                    }
                }
            }
        }
    }

    protected boolean X(Throwable th) {
        return false;
    }

    protected final void Z(InterfaceC0415q0 interfaceC0415q0) {
        if (interfaceC0415q0 == null) {
            u0(D0.f1379m);
            return;
        }
        interfaceC0415q0.start();
        r rVarL = interfaceC0415q0.l(this);
        u0(rVarL);
        if (b0()) {
            rVarL.c();
            u0(D0.f1379m);
        }
    }

    @Override // m5.InterfaceC1888g.b, m5.InterfaceC1888g
    public InterfaceC1888g.b b(InterfaceC1888g.c cVar) {
        return InterfaceC0415q0.a.b(this, cVar);
    }

    public final boolean b0() {
        return !(V() instanceof InterfaceC0405l0);
    }

    protected boolean c0() {
        return false;
    }

    @Override // H5.InterfaceC0415q0
    public boolean d() {
        Object objV = V();
        return (objV instanceof InterfaceC0405l0) && ((InterfaceC0405l0) objV).d();
    }

    public final boolean e0(Object obj) {
        Object objE0;
        do {
            objE0 = E0(V(), obj);
            if (objE0 == y0.f1468a) {
                return false;
            }
            if (objE0 == y0.f1469b) {
                return true;
            }
        } while (objE0 == y0.f1470c);
        v(objE0);
        return true;
    }

    public final Object f0(Object obj) {
        Object objE0;
        do {
            objE0 = E0(V(), obj);
            if (objE0 == y0.f1468a) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, P(obj));
            }
        } while (objE0 == y0.f1470c);
        return objE0;
    }

    @Override // m5.InterfaceC1888g.b
    public final InterfaceC1888g.c getKey() {
        return InterfaceC0415q0.f1444b;
    }

    @Override // H5.InterfaceC0415q0
    public InterfaceC0415q0 getParent() {
        r rVarU = U();
        if (rVarU != null) {
            return rVarU.getParent();
        }
        return null;
    }

    @Override // m5.InterfaceC1888g
    public InterfaceC1888g h0(InterfaceC1888g.c cVar) {
        return InterfaceC0415q0.a.d(this, cVar);
    }

    public String i0() {
        return M.a(this);
    }

    @Override // H5.InterfaceC0415q0
    public final boolean isCancelled() {
        Object objV = V();
        return (objV instanceof C0423z) || ((objV instanceof c) && ((c) objV).f());
    }

    @Override // m5.InterfaceC1888g
    public Object j(Object obj, v5.p pVar) {
        return InterfaceC0415q0.a.a(this, obj, pVar);
    }

    @Override // H5.InterfaceC0415q0
    public final r l(InterfaceC0417t interfaceC0417t) {
        X xC = InterfaceC0415q0.a.c(this, true, false, new C0416s(interfaceC0417t), 2, null);
        w5.k.d(xC, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (r) xC;
    }

    @Override // H5.InterfaceC0417t
    public final void n0(F0 f02) throws Throwable {
        C(f02);
    }

    @Override // m5.InterfaceC1888g
    public InterfaceC1888g o(InterfaceC1888g interfaceC1888g) {
        return InterfaceC0415q0.a.e(this, interfaceC1888g);
    }

    @Override // H5.InterfaceC0415q0
    public final boolean start() {
        int iV0;
        do {
            iV0 = v0(V());
            if (iV0 == 0) {
                return false;
            }
        } while (iV0 != 1);
        return true;
    }

    public final void t0(w0 w0Var) {
        Object objV;
        do {
            objV = V();
            if (!(objV instanceof w0)) {
                if (!(objV instanceof InterfaceC0405l0) || ((InterfaceC0405l0) objV).g() == null) {
                    return;
                }
                w0Var.u();
                return;
            }
            if (objV != w0Var) {
                return;
            }
        } while (!androidx.concurrent.futures.b.a(f1450m, this, objV, y0.f1474g));
    }

    public String toString() {
        return z0() + '@' + M.b(this);
    }

    public final void u0(r rVar) {
        f1451n.set(this, rVar);
    }

    @Override // H5.InterfaceC0415q0
    public final CancellationException w() {
        Object objV = V();
        if (!(objV instanceof c)) {
            if (objV instanceof InterfaceC0405l0) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (objV instanceof C0423z) {
                return y0(this, ((C0423z) objV).f1476a, null, 1, null);
            }
            return new r0(M.a(this) + " has completed normally", null, this);
        }
        Throwable thE = ((c) objV).e();
        if (thE != null) {
            CancellationException cancellationExceptionX0 = x0(thE, M.a(this) + " is cancelling");
            if (cancellationExceptionX0 != null) {
                return cancellationExceptionX0;
            }
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    protected final Object x(InterfaceC1885d interfaceC1885d) throws Throwable {
        Object objV;
        do {
            objV = V();
            if (!(objV instanceof InterfaceC0405l0)) {
                if (objV instanceof C0423z) {
                    throw ((C0423z) objV).f1476a;
                }
                return y0.h(objV);
            }
        } while (v0(objV) < 0);
        return y(interfaceC1885d);
    }

    protected final CancellationException x0(Throwable th, String str) {
        CancellationException r0Var = th instanceof CancellationException ? (CancellationException) th : null;
        if (r0Var == null) {
            if (str == null) {
                str = G();
            }
            r0Var = new r0(str, th, this);
        }
        return r0Var;
    }

    public final String z0() {
        return i0() + '{' + w0(V()) + '}';
    }

    protected void q0() {
    }

    public void Y(Throwable th) throws Throwable {
        throw th;
    }

    protected void o0(Throwable th) {
    }

    protected void p0(Object obj) {
    }

    protected void v(Object obj) {
    }
}
