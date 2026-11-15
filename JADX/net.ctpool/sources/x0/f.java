package x0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ExecutorService f22763i = C2209b.a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Executor f22764j = C2209b.b();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Executor f22765k = C2208a.c();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static f f22766l = new f((Object) null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static f f22767m = new f(Boolean.TRUE);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static f f22768n = new f(Boolean.FALSE);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static f f22769o = new f(true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f22771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f22772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f22773d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Exception f22774e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f22775f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private h f22776g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f22770a = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List f22777h = new ArrayList();

    class a implements x0.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f22778a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ x0.d f22779b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Executor f22780c;

        a(g gVar, x0.d dVar, Executor executor, x0.c cVar) {
            this.f22778a = gVar;
            this.f22779b = dVar;
            this.f22780c = executor;
        }

        @Override // x0.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(f fVar) {
            f.d(this.f22778a, this.f22779b, fVar, this.f22780c, null);
            return null;
        }
    }

    static class b implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ g f22782m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ x0.d f22783n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ f f22784o;

        b(x0.c cVar, g gVar, x0.d dVar, f fVar) {
            this.f22782m = gVar;
            this.f22783n = dVar;
            this.f22784o = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f22782m.d(this.f22783n.a(this.f22784o));
            } catch (CancellationException unused) {
                this.f22782m.b();
            } catch (Exception e7) {
                this.f22782m.c(e7);
            }
        }
    }

    static class c implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ g f22785m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Callable f22786n;

        c(x0.c cVar, g gVar, Callable callable) {
            this.f22785m = gVar;
            this.f22786n = callable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f22785m.d(this.f22786n.call());
            } catch (CancellationException unused) {
                this.f22785m.b();
            } catch (Exception e7) {
                this.f22785m.c(e7);
            }
        }
    }

    public interface d {
    }

    f() {
    }

    public static f b(Callable callable, Executor executor) {
        return c(callable, executor, null);
    }

    public static f c(Callable callable, Executor executor, x0.c cVar) {
        g gVar = new g();
        try {
            executor.execute(new c(cVar, gVar, callable));
        } catch (Exception e7) {
            gVar.c(new e(e7));
        }
        return gVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(g gVar, x0.d dVar, f fVar, Executor executor, x0.c cVar) {
        try {
            executor.execute(new b(cVar, gVar, dVar, fVar));
        } catch (Exception e7) {
            gVar.c(new e(e7));
        }
    }

    public static f g(Exception exc) {
        g gVar = new g();
        gVar.c(exc);
        return gVar.a();
    }

    public static f h(Object obj) {
        if (obj == null) {
            return f22766l;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue() ? f22767m : f22768n;
        }
        g gVar = new g();
        gVar.d(obj);
        return gVar.a();
    }

    public static d k() {
        return null;
    }

    private void o() {
        synchronized (this.f22770a) {
            Iterator it = this.f22777h.iterator();
            while (it.hasNext()) {
                try {
                    ((x0.d) it.next()).a(this);
                } catch (RuntimeException e7) {
                    throw e7;
                } catch (Exception e8) {
                    throw new RuntimeException(e8);
                }
            }
            this.f22777h = null;
        }
    }

    public f e(x0.d dVar) {
        return f(dVar, f22764j, null);
    }

    public f f(x0.d dVar, Executor executor, x0.c cVar) {
        boolean zM;
        g gVar = new g();
        synchronized (this.f22770a) {
            try {
                zM = m();
                if (!zM) {
                    this.f22777h.add(new a(gVar, dVar, executor, cVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zM) {
            d(gVar, dVar, this, executor, cVar);
        }
        return gVar.a();
    }

    public Exception i() {
        Exception exc;
        synchronized (this.f22770a) {
            try {
                if (this.f22774e != null) {
                    this.f22775f = true;
                }
                exc = this.f22774e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return exc;
    }

    public Object j() {
        Object obj;
        synchronized (this.f22770a) {
            obj = this.f22773d;
        }
        return obj;
    }

    public boolean l() {
        boolean z6;
        synchronized (this.f22770a) {
            z6 = this.f22772c;
        }
        return z6;
    }

    public boolean m() {
        boolean z6;
        synchronized (this.f22770a) {
            z6 = this.f22771b;
        }
        return z6;
    }

    public boolean n() {
        boolean z6;
        synchronized (this.f22770a) {
            z6 = i() != null;
        }
        return z6;
    }

    boolean p() {
        synchronized (this.f22770a) {
            try {
                if (this.f22771b) {
                    return false;
                }
                this.f22771b = true;
                this.f22772c = true;
                this.f22770a.notifyAll();
                o();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    boolean q(Exception exc) {
        synchronized (this.f22770a) {
            try {
                if (this.f22771b) {
                    return false;
                }
                this.f22771b = true;
                this.f22774e = exc;
                this.f22775f = false;
                this.f22770a.notifyAll();
                o();
                if (!this.f22775f) {
                    k();
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    boolean r(Object obj) {
        synchronized (this.f22770a) {
            try {
                if (this.f22771b) {
                    return false;
                }
                this.f22771b = true;
                this.f22773d = obj;
                this.f22770a.notifyAll();
                o();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private f(Object obj) {
        r(obj);
    }

    private f(boolean z6) {
        if (z6) {
            p();
        } else {
            r(null);
        }
    }
}
