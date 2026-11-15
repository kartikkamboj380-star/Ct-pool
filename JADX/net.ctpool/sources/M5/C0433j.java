package M5;

import H5.AbstractC0383a0;
import H5.C0406m;
import H5.InterfaceC0404l;
import H5.L0;
import H5.U;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m5.InterfaceC1885d;
import m5.InterfaceC1888g;
import o5.InterfaceC1950e;

/* JADX INFO: renamed from: M5.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0433j extends U implements InterfaceC1950e, InterfaceC1885d {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f2088t = AtomicReferenceFieldUpdater.newUpdater(C0433j.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final H5.F f2089p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final InterfaceC1885d f2090q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f2091r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f2092s;

    public C0433j(H5.F f7, InterfaceC1885d interfaceC1885d) {
        super(-1);
        this.f2089p = f7;
        this.f2090q = interfaceC1885d;
        this.f2091r = AbstractC0434k.f2093a;
        this.f2092s = J.b(a());
    }

    private final C0406m o() {
        Object obj = f2088t.get(this);
        if (obj instanceof C0406m) {
            return (C0406m) obj;
        }
        return null;
    }

    @Override // m5.InterfaceC1885d
    public InterfaceC1888g a() {
        return this.f2090q.a();
    }

    @Override // H5.U
    public void d(Object obj, Throwable th) {
        if (obj instanceof H5.A) {
            ((H5.A) obj).f1377b.i(th);
        }
    }

    @Override // o5.InterfaceC1950e
    public InterfaceC1950e g() {
        InterfaceC1885d interfaceC1885d = this.f2090q;
        if (interfaceC1885d instanceof InterfaceC1950e) {
            return (InterfaceC1950e) interfaceC1885d;
        }
        return null;
    }

    @Override // m5.InterfaceC1885d
    public void h(Object obj) {
        InterfaceC1888g interfaceC1888gA = this.f2090q.a();
        Object objD = H5.D.d(obj, null, 1, null);
        if (this.f2089p.g(interfaceC1888gA)) {
            this.f2091r = objD;
            this.f1406o = 0;
            this.f2089p.a(interfaceC1888gA, this);
            return;
        }
        AbstractC0383a0 abstractC0383a0B = L0.f1395a.b();
        if (abstractC0383a0B.l1()) {
            this.f2091r = objD;
            this.f1406o = 0;
            abstractC0383a0B.h1(this);
            return;
        }
        abstractC0383a0B.j1(true);
        try {
            InterfaceC1888g interfaceC1888gA2 = a();
            Object objC = J.c(interfaceC1888gA2, this.f2092s);
            try {
                this.f2090q.h(obj);
                i5.u uVar = i5.u.f19985a;
                while (abstractC0383a0B.o1()) {
                }
            } finally {
                J.a(interfaceC1888gA2, objC);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // H5.U
    public Object l() {
        Object obj = this.f2091r;
        this.f2091r = AbstractC0434k.f2093a;
        return obj;
    }

    public final void m() {
        while (f2088t.get(this) == AbstractC0434k.f2094b) {
        }
    }

    public final C0406m n() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2088t;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                f2088t.set(this, AbstractC0434k.f2094b);
                return null;
            }
            if (obj instanceof C0406m) {
                if (androidx.concurrent.futures.b.a(f2088t, this, obj, AbstractC0434k.f2094b)) {
                    return (C0406m) obj;
                }
            } else if (obj != AbstractC0434k.f2094b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final boolean s() {
        return f2088t.get(this) != null;
    }

    public final boolean t(Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2088t;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            F f7 = AbstractC0434k.f2094b;
            if (w5.k.b(obj, f7)) {
                if (androidx.concurrent.futures.b.a(f2088t, this, f7, th)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (androidx.concurrent.futures.b.a(f2088t, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f2089p + ", " + H5.M.c(this.f2090q) + ']';
    }

    public final void u() {
        m();
        C0406m c0406mO = o();
        if (c0406mO != null) {
            c0406mO.u();
        }
    }

    public final Throwable v(InterfaceC0404l interfaceC0404l) {
        F f7;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2088t;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            f7 = AbstractC0434k.f2094b;
            if (obj != f7) {
                if (obj instanceof Throwable) {
                    if (androidx.concurrent.futures.b.a(f2088t, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!androidx.concurrent.futures.b.a(f2088t, this, f7, interfaceC0404l));
        return null;
    }

    @Override // H5.U
    public InterfaceC1885d e() {
        return this;
    }
}
