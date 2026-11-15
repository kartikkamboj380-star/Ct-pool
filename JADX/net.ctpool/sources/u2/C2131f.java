package u2;

import b2.InterfaceC0675a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: u2.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2131f implements InterfaceC0675a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Executor f22498i = AbstractC2129d.f22497b;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Executor f22499j = AbstractC2129d.f22496a;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static C2131f f22500k = new C2131f((Object) null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static C2131f f22501l = new C2131f(Boolean.TRUE);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static C2131f f22502m = new C2131f(Boolean.FALSE);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static C2131f f22503n = new C2131f(true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f22505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f22506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f22507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Exception f22508e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f22509f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private AbstractC2133h f22510g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f22504a = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List f22511h = new ArrayList();

    /* JADX INFO: renamed from: u2.f$a */
    class a implements InterfaceC2126a {
        a() {
        }

        @Override // u2.InterfaceC2126a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2131f a(C2131f c2131f) {
            return c2131f.q() ? C2131f.e() : c2131f.s() ? C2131f.l(c2131f.n()) : C2131f.m(null);
        }
    }

    /* JADX INFO: renamed from: u2.f$b */
    class b implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ C2132g f22513m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Callable f22514n;

        b(C2132g c2132g, Callable callable) {
            this.f22513m = c2132g;
            this.f22514n = callable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f22513m.d(this.f22514n.call());
            } catch (CancellationException unused) {
                this.f22513m.b();
            } catch (Exception e7) {
                this.f22513m.c(e7);
            }
        }
    }

    /* JADX INFO: renamed from: u2.f$c */
    class c implements InterfaceC2126a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C2132g f22515a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC2126a f22516b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Executor f22517c;

        c(C2132g c2132g, InterfaceC2126a interfaceC2126a, Executor executor) {
            this.f22515a = c2132g;
            this.f22516b = interfaceC2126a;
            this.f22517c = executor;
        }

        @Override // u2.InterfaceC2126a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(C2131f c2131f) {
            C2131f.g(this.f22515a, this.f22516b, c2131f, this.f22517c);
            return null;
        }
    }

    /* JADX INFO: renamed from: u2.f$d */
    class d implements InterfaceC2126a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C2132g f22519a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC2126a f22520b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Executor f22521c;

        d(C2132g c2132g, InterfaceC2126a interfaceC2126a, Executor executor) {
            this.f22519a = c2132g;
            this.f22520b = interfaceC2126a;
            this.f22521c = executor;
        }

        @Override // u2.InterfaceC2126a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(C2131f c2131f) {
            C2131f.f(this.f22519a, this.f22520b, c2131f, this.f22521c);
            return null;
        }
    }

    /* JADX INFO: renamed from: u2.f$e */
    class e implements InterfaceC2126a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2126a f22523a;

        e(InterfaceC2126a interfaceC2126a) {
            this.f22523a = interfaceC2126a;
        }

        @Override // u2.InterfaceC2126a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2131f a(C2131f c2131f) {
            return c2131f.s() ? C2131f.l(c2131f.n()) : c2131f.q() ? C2131f.e() : c2131f.h(this.f22523a);
        }
    }

    /* JADX INFO: renamed from: u2.f$f, reason: collision with other inner class name */
    class C0321f implements InterfaceC2126a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2126a f22525a;

        C0321f(InterfaceC2126a interfaceC2126a) {
            this.f22525a = interfaceC2126a;
        }

        @Override // u2.InterfaceC2126a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2131f a(C2131f c2131f) {
            return c2131f.s() ? C2131f.l(c2131f.n()) : c2131f.q() ? C2131f.e() : c2131f.j(this.f22525a);
        }
    }

    /* JADX INFO: renamed from: u2.f$g */
    class g implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ InterfaceC2126a f22527m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ C2131f f22528n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ C2132g f22529o;

        g(InterfaceC2126a interfaceC2126a, C2131f c2131f, C2132g c2132g) {
            this.f22527m = interfaceC2126a;
            this.f22528n = c2131f;
            this.f22529o = c2132g;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f22529o.d(this.f22527m.a(this.f22528n));
            } catch (CancellationException unused) {
                this.f22529o.b();
            } catch (Exception e7) {
                this.f22529o.c(e7);
            }
        }
    }

    /* JADX INFO: renamed from: u2.f$h */
    class h implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ InterfaceC2126a f22530m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ C2131f f22531n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ C2132g f22532o;

        /* JADX INFO: renamed from: u2.f$h$a */
        class a implements InterfaceC2126a {
            a() {
            }

            @Override // u2.InterfaceC2126a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Void a(C2131f c2131f) {
                if (c2131f.q()) {
                    h.this.f22532o.b();
                    return null;
                }
                if (c2131f.s()) {
                    h.this.f22532o.c(c2131f.n());
                    return null;
                }
                h.this.f22532o.d(c2131f.o());
                return null;
            }
        }

        h(InterfaceC2126a interfaceC2126a, C2131f c2131f, C2132g c2132g) {
            this.f22530m = interfaceC2126a;
            this.f22531n = c2131f;
            this.f22532o = c2132g;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C2131f c2131f = (C2131f) this.f22530m.a(this.f22531n);
                if (c2131f == null) {
                    this.f22532o.d(null);
                } else {
                    c2131f.h(new a());
                }
            } catch (CancellationException unused) {
                this.f22532o.b();
            } catch (Exception e7) {
                this.f22532o.c(e7);
            }
        }
    }

    /* JADX INFO: renamed from: u2.f$i */
    public interface i {
    }

    C2131f() {
    }

    public static C2131f c(Callable callable) {
        return d(callable, f22498i);
    }

    public static C2131f d(Callable callable, Executor executor) {
        C2132g c2132g = new C2132g();
        try {
            executor.execute(new b(c2132g, callable));
        } catch (Exception e7) {
            c2132g.c(new C2127b(e7));
        }
        return c2132g.a();
    }

    public static C2131f e() {
        return f22503n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f(C2132g c2132g, InterfaceC2126a interfaceC2126a, C2131f c2131f, Executor executor) {
        try {
            executor.execute(new h(interfaceC2126a, c2131f, c2132g));
        } catch (Exception e7) {
            c2132g.c(new C2127b(e7));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g(C2132g c2132g, InterfaceC2126a interfaceC2126a, C2131f c2131f, Executor executor) {
        try {
            executor.execute(new g(interfaceC2126a, c2131f, c2132g));
        } catch (Exception e7) {
            c2132g.c(new C2127b(e7));
        }
    }

    public static C2131f l(Exception exc) {
        C2132g c2132g = new C2132g();
        c2132g.c(exc);
        return c2132g.a();
    }

    public static C2131f m(Object obj) {
        if (obj == null) {
            return f22500k;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue() ? f22501l : f22502m;
        }
        C2132g c2132g = new C2132g();
        c2132g.d(obj);
        return c2132g.a();
    }

    public static i p() {
        return null;
    }

    private void w() {
        synchronized (this.f22504a) {
            Iterator it = this.f22511h.iterator();
            while (it.hasNext()) {
                try {
                    ((InterfaceC2126a) it.next()).a(this);
                } catch (RuntimeException e7) {
                    throw e7;
                } catch (Exception e8) {
                    throw new RuntimeException(e8);
                }
            }
            this.f22511h = null;
        }
    }

    public C2131f h(InterfaceC2126a interfaceC2126a) {
        return i(interfaceC2126a, f22498i);
    }

    public C2131f i(InterfaceC2126a interfaceC2126a, Executor executor) {
        boolean zR;
        C2132g c2132g = new C2132g();
        synchronized (this.f22504a) {
            try {
                zR = r();
                if (!zR) {
                    this.f22511h.add(new c(c2132g, interfaceC2126a, executor));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zR) {
            g(c2132g, interfaceC2126a, this, executor);
        }
        return c2132g.a();
    }

    public C2131f j(InterfaceC2126a interfaceC2126a) {
        return k(interfaceC2126a, f22498i);
    }

    public C2131f k(InterfaceC2126a interfaceC2126a, Executor executor) {
        boolean zR;
        C2132g c2132g = new C2132g();
        synchronized (this.f22504a) {
            try {
                zR = r();
                if (!zR) {
                    this.f22511h.add(new d(c2132g, interfaceC2126a, executor));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zR) {
            f(c2132g, interfaceC2126a, this, executor);
        }
        return c2132g.a();
    }

    public Exception n() {
        Exception exc;
        synchronized (this.f22504a) {
            try {
                if (this.f22508e != null) {
                    this.f22509f = true;
                }
                exc = this.f22508e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return exc;
    }

    public Object o() {
        Object obj;
        synchronized (this.f22504a) {
            obj = this.f22507d;
        }
        return obj;
    }

    public boolean q() {
        boolean z6;
        synchronized (this.f22504a) {
            z6 = this.f22506c;
        }
        return z6;
    }

    public boolean r() {
        boolean z6;
        synchronized (this.f22504a) {
            z6 = this.f22505b;
        }
        return z6;
    }

    public boolean s() {
        boolean z6;
        synchronized (this.f22504a) {
            z6 = n() != null;
        }
        return z6;
    }

    public C2131f t() {
        return j(new a());
    }

    public C2131f u(InterfaceC2126a interfaceC2126a, Executor executor) {
        return k(new e(interfaceC2126a), executor);
    }

    public C2131f v(InterfaceC2126a interfaceC2126a, Executor executor) {
        return k(new C0321f(interfaceC2126a), executor);
    }

    boolean x() {
        synchronized (this.f22504a) {
            try {
                if (this.f22505b) {
                    return false;
                }
                this.f22505b = true;
                this.f22506c = true;
                this.f22504a.notifyAll();
                w();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    boolean y(Exception exc) {
        synchronized (this.f22504a) {
            try {
                if (this.f22505b) {
                    return false;
                }
                this.f22505b = true;
                this.f22508e = exc;
                this.f22509f = false;
                this.f22504a.notifyAll();
                w();
                if (!this.f22509f) {
                    p();
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    boolean z(Object obj) {
        synchronized (this.f22504a) {
            try {
                if (this.f22505b) {
                    return false;
                }
                this.f22505b = true;
                this.f22507d = obj;
                this.f22504a.notifyAll();
                w();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private C2131f(Object obj) {
        z(obj);
    }

    private C2131f(boolean z6) {
        if (z6) {
            x();
        } else {
            z(null);
        }
    }
}
