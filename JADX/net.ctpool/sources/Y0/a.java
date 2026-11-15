package Y0;

import O0.l;
import android.util.Pair;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements Y0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map f4392a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f4395d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Throwable f4396e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f4397f = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f4394c = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d f4393b = d.IN_PROGRESS;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ConcurrentLinkedQueue f4398g = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: Y0.a$a, reason: collision with other inner class name */
    class RunnableC0102a implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f4399m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ e f4400n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f4401o;

        RunnableC0102a(boolean z6, e eVar, boolean z7) {
            this.f4399m = z6;
            this.f4400n = eVar;
            this.f4401o = z7;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f4399m) {
                this.f4400n.c(a.this);
            } else if (this.f4401o) {
                this.f4400n.d(a.this);
            } else {
                this.f4400n.a(a.this);
            }
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ e f4403m;

        b(e eVar) {
            this.f4403m = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4403m.b(a.this);
        }
    }

    public interface c {
    }

    private enum d {
        IN_PROGRESS,
        SUCCESS,
        FAILURE
    }

    protected a() {
    }

    public static c i() {
        return null;
    }

    private void m() {
        boolean zJ = j();
        boolean zW = w();
        for (Pair pair : this.f4398g) {
            l((e) pair.first, (Executor) pair.second, zJ, zW);
        }
    }

    private synchronized boolean r(Throwable th, Map map) {
        if (!this.f4394c && this.f4393b == d.IN_PROGRESS) {
            this.f4393b = d.FAILURE;
            this.f4396e = th;
            this.f4392a = map;
            return true;
        }
        return false;
    }

    private synchronized boolean t(float f7) {
        if (!this.f4394c && this.f4393b == d.IN_PROGRESS) {
            if (f7 < this.f4397f) {
                return false;
            }
            this.f4397f = f7;
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x002c, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0033, code lost:
    
        if (r4 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0035, code lost:
    
        h(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0038, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
    
        return false;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0019 -> B:32:0x003a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean v(Object obj, boolean z6) {
        Object obj2;
        Object obj3 = null;
        try {
            synchronized (this) {
                try {
                    try {
                        if (!this.f4394c && this.f4393b == d.IN_PROGRESS) {
                            if (z6) {
                                this.f4393b = d.SUCCESS;
                                this.f4397f = 1.0f;
                            }
                            Object obj4 = this.f4395d;
                            if (obj4 != obj) {
                                try {
                                    this.f4395d = obj;
                                    obj2 = obj4;
                                } catch (Throwable th) {
                                    th = th;
                                    obj3 = obj4;
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                    } catch (Throwable th2) {
                        obj3 = obj;
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            throw th;
        } finally {
            if (obj3 != null) {
                h(obj3);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private synchronized boolean w() {
        boolean z6;
        if (k()) {
            z6 = !b();
        }
        return z6;
    }

    @Override // Y0.c
    public synchronized boolean a() {
        return this.f4395d != null;
    }

    @Override // Y0.c
    public synchronized boolean b() {
        return this.f4393b != d.IN_PROGRESS;
    }

    @Override // Y0.c
    public synchronized Throwable c() {
        return this.f4396e;
    }

    @Override // Y0.c
    public boolean close() {
        synchronized (this) {
            try {
                if (this.f4394c) {
                    return false;
                }
                this.f4394c = true;
                Object obj = this.f4395d;
                this.f4395d = null;
                if (obj != null) {
                    h(obj);
                }
                if (!b()) {
                    m();
                }
                synchronized (this) {
                    this.f4398g.clear();
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // Y0.c
    public synchronized float d() {
        return this.f4397f;
    }

    @Override // Y0.c
    public void e(e eVar, Executor executor) {
        l.g(eVar);
        l.g(executor);
        synchronized (this) {
            try {
                if (this.f4394c) {
                    return;
                }
                if (this.f4393b == d.IN_PROGRESS) {
                    this.f4398g.add(Pair.create(eVar, executor));
                }
                boolean z6 = a() || b() || w();
                if (z6) {
                    l(eVar, executor, j(), w());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // Y0.c
    public boolean f() {
        return false;
    }

    @Override // Y0.c
    public synchronized Object g() {
        return this.f4395d;
    }

    @Override // Y0.c
    public Map getExtras() {
        return this.f4392a;
    }

    public synchronized boolean j() {
        return this.f4393b == d.FAILURE;
    }

    public synchronized boolean k() {
        return this.f4394c;
    }

    protected void l(e eVar, Executor executor, boolean z6, boolean z7) {
        RunnableC0102a runnableC0102a = new RunnableC0102a(z6, eVar, z7);
        i();
        executor.execute(runnableC0102a);
    }

    protected void n() {
        for (Pair pair : this.f4398g) {
            ((Executor) pair.second).execute(new b((e) pair.first));
        }
    }

    protected void o(Map map) {
        this.f4392a = map;
    }

    protected boolean p(Throwable th) {
        return q(th, null);
    }

    protected boolean q(Throwable th, Map map) {
        boolean zR = r(th, map);
        if (zR) {
            m();
        }
        return zR;
    }

    protected boolean s(float f7) {
        boolean zT = t(f7);
        if (zT) {
            n();
        }
        return zT;
    }

    protected boolean u(Object obj, boolean z6, Map map) {
        o(map);
        boolean zV = v(obj, z6);
        if (zV) {
            m();
        }
        return zV;
    }

    protected void h(Object obj) {
    }
}
