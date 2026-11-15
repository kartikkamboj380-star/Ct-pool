package z3;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class O extends AbstractC2272l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f23278a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final K f23279b = new K();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f23280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile boolean f23281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Object f23282e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Exception f23283f;

    O() {
    }

    private final void A() {
        synchronized (this.f23278a) {
            try {
                if (this.f23280c) {
                    this.f23279b.b(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void x() {
        Preconditions.checkState(this.f23280c, "Task is not yet complete");
    }

    private final void y() {
        if (this.f23281d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    private final void z() {
        if (this.f23280c) {
            throw C2264d.a(this);
        }
    }

    @Override // z3.AbstractC2272l
    public final AbstractC2272l a(Executor executor, InterfaceC2265e interfaceC2265e) {
        this.f23279b.a(new C2257A(executor, interfaceC2265e));
        A();
        return this;
    }

    @Override // z3.AbstractC2272l
    public final AbstractC2272l b(Executor executor, InterfaceC2266f interfaceC2266f) {
        this.f23279b.a(new C2259C(executor, interfaceC2266f));
        A();
        return this;
    }

    @Override // z3.AbstractC2272l
    public final AbstractC2272l c(InterfaceC2266f interfaceC2266f) {
        this.f23279b.a(new C2259C(AbstractC2274n.f23288a, interfaceC2266f));
        A();
        return this;
    }

    @Override // z3.AbstractC2272l
    public final AbstractC2272l d(Executor executor, InterfaceC2267g interfaceC2267g) {
        this.f23279b.a(new E(executor, interfaceC2267g));
        A();
        return this;
    }

    @Override // z3.AbstractC2272l
    public final AbstractC2272l e(InterfaceC2267g interfaceC2267g) {
        d(AbstractC2274n.f23288a, interfaceC2267g);
        return this;
    }

    @Override // z3.AbstractC2272l
    public final AbstractC2272l f(Executor executor, InterfaceC2268h interfaceC2268h) {
        this.f23279b.a(new G(executor, interfaceC2268h));
        A();
        return this;
    }

    @Override // z3.AbstractC2272l
    public final AbstractC2272l g(InterfaceC2268h interfaceC2268h) {
        f(AbstractC2274n.f23288a, interfaceC2268h);
        return this;
    }

    @Override // z3.AbstractC2272l
    public final AbstractC2272l h(Executor executor, InterfaceC2263c interfaceC2263c) {
        O o6 = new O();
        this.f23279b.a(new w(executor, interfaceC2263c, o6));
        A();
        return o6;
    }

    @Override // z3.AbstractC2272l
    public final AbstractC2272l i(InterfaceC2263c interfaceC2263c) {
        return h(AbstractC2274n.f23288a, interfaceC2263c);
    }

    @Override // z3.AbstractC2272l
    public final AbstractC2272l j(Executor executor, InterfaceC2263c interfaceC2263c) {
        O o6 = new O();
        this.f23279b.a(new y(executor, interfaceC2263c, o6));
        A();
        return o6;
    }

    @Override // z3.AbstractC2272l
    public final Exception k() {
        Exception exc;
        synchronized (this.f23278a) {
            exc = this.f23283f;
        }
        return exc;
    }

    @Override // z3.AbstractC2272l
    public final Object l() {
        Object obj;
        synchronized (this.f23278a) {
            try {
                x();
                y();
                Exception exc = this.f23283f;
                if (exc != null) {
                    throw new C2270j(exc);
                }
                obj = this.f23282e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // z3.AbstractC2272l
    public final Object m(Class cls) {
        Object obj;
        synchronized (this.f23278a) {
            try {
                x();
                y();
                if (cls.isInstance(this.f23283f)) {
                    throw ((Throwable) cls.cast(this.f23283f));
                }
                Exception exc = this.f23283f;
                if (exc != null) {
                    throw new C2270j(exc);
                }
                obj = this.f23282e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // z3.AbstractC2272l
    public final boolean n() {
        return this.f23281d;
    }

    @Override // z3.AbstractC2272l
    public final boolean o() {
        boolean z6;
        synchronized (this.f23278a) {
            z6 = this.f23280c;
        }
        return z6;
    }

    @Override // z3.AbstractC2272l
    public final boolean p() {
        boolean z6;
        synchronized (this.f23278a) {
            try {
                z6 = false;
                if (this.f23280c && !this.f23281d && this.f23283f == null) {
                    z6 = true;
                }
            } finally {
            }
        }
        return z6;
    }

    @Override // z3.AbstractC2272l
    public final AbstractC2272l q(Executor executor, InterfaceC2271k interfaceC2271k) {
        O o6 = new O();
        this.f23279b.a(new I(executor, interfaceC2271k, o6));
        A();
        return o6;
    }

    @Override // z3.AbstractC2272l
    public final AbstractC2272l r(InterfaceC2271k interfaceC2271k) {
        Executor executor = AbstractC2274n.f23288a;
        O o6 = new O();
        this.f23279b.a(new I(executor, interfaceC2271k, o6));
        A();
        return o6;
    }

    public final void s(Exception exc) {
        Preconditions.checkNotNull(exc, "Exception must not be null");
        synchronized (this.f23278a) {
            z();
            this.f23280c = true;
            this.f23283f = exc;
        }
        this.f23279b.b(this);
    }

    public final void t(Object obj) {
        synchronized (this.f23278a) {
            z();
            this.f23280c = true;
            this.f23282e = obj;
        }
        this.f23279b.b(this);
    }

    public final boolean u() {
        synchronized (this.f23278a) {
            try {
                if (this.f23280c) {
                    return false;
                }
                this.f23280c = true;
                this.f23281d = true;
                this.f23279b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean v(Exception exc) {
        Preconditions.checkNotNull(exc, "Exception must not be null");
        synchronized (this.f23278a) {
            try {
                if (this.f23280c) {
                    return false;
                }
                this.f23280c = true;
                this.f23283f = exc;
                this.f23279b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean w(Object obj) {
        synchronized (this.f23278a) {
            try {
                if (this.f23280c) {
                    return false;
                }
                this.f23280c = true;
                this.f23282e = obj;
                this.f23279b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
