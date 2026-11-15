package androidx.lifecycle;

import androidx.lifecycle.AbstractC0651h;
import j.C1767a;
import java.util.Map;
import k.C1813b;

/* JADX INFO: loaded from: classes.dex */
public abstract class LiveData {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final Object f8312k = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object f8313a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C1813b f8314b = new C1813b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f8315c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f8316d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Object f8317e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    volatile Object f8318f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f8319g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f8320h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f8321i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Runnable f8322j;

    class LifecycleBoundObserver extends androidx.lifecycle.LiveData.c implements InterfaceC0653j {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final l f8323e;

        LifecycleBoundObserver(l lVar, r rVar) {
            super(rVar);
            this.f8323e = lVar;
        }

        @Override // androidx.lifecycle.InterfaceC0653j
        public void g(l lVar, AbstractC0651h.b bVar) {
            AbstractC0651h.c cVarB = this.f8323e.getLifecycle().b();
            if (cVarB == AbstractC0651h.c.DESTROYED) {
                LiveData.this.m(this.f8327a);
                return;
            }
            AbstractC0651h.c cVar = null;
            while (cVar != cVarB) {
                h(k());
                cVar = cVarB;
                cVarB = this.f8323e.getLifecycle().b();
            }
        }

        void i() {
            this.f8323e.getLifecycle().c(this);
        }

        boolean j(l lVar) {
            return this.f8323e == lVar;
        }

        boolean k() {
            return this.f8323e.getLifecycle().b().e(AbstractC0651h.c.STARTED);
        }
    }

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.f8313a) {
                obj = LiveData.this.f8318f;
                LiveData.this.f8318f = LiveData.f8312k;
            }
            LiveData.this.n(obj);
        }
    }

    private class b extends c {
        b(r rVar) {
            super(rVar);
        }

        @Override // androidx.lifecycle.LiveData.c
        boolean k() {
            return true;
        }
    }

    private abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final r f8327a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f8328b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f8329c = -1;

        c(r rVar) {
            this.f8327a = rVar;
        }

        void h(boolean z6) {
            if (z6 == this.f8328b) {
                return;
            }
            this.f8328b = z6;
            LiveData.this.c(z6 ? 1 : -1);
            if (this.f8328b) {
                LiveData.this.e(this);
            }
        }

        void i() {
        }

        boolean j(l lVar) {
            return false;
        }

        abstract boolean k();
    }

    public LiveData() {
        Object obj = f8312k;
        this.f8318f = obj;
        this.f8322j = new a();
        this.f8317e = obj;
        this.f8319g = -1;
    }

    static void b(String str) {
        if (C1767a.e().b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    private void d(c cVar) {
        if (cVar.f8328b) {
            if (!cVar.k()) {
                cVar.h(false);
                return;
            }
            int i7 = cVar.f8329c;
            int i8 = this.f8319g;
            if (i7 >= i8) {
                return;
            }
            cVar.f8329c = i8;
            cVar.f8327a.a(this.f8317e);
        }
    }

    void c(int i7) {
        int i8 = this.f8315c;
        this.f8315c = i7 + i8;
        if (this.f8316d) {
            return;
        }
        this.f8316d = true;
        while (true) {
            try {
                int i9 = this.f8315c;
                if (i8 == i9) {
                    this.f8316d = false;
                    return;
                }
                boolean z6 = i8 == 0 && i9 > 0;
                boolean z7 = i8 > 0 && i9 == 0;
                if (z6) {
                    j();
                } else if (z7) {
                    k();
                }
                i8 = i9;
            } catch (Throwable th) {
                this.f8316d = false;
                throw th;
            }
        }
    }

    void e(c cVar) {
        if (this.f8320h) {
            this.f8321i = true;
            return;
        }
        this.f8320h = true;
        do {
            this.f8321i = false;
            if (cVar != null) {
                d(cVar);
                cVar = null;
            } else {
                C1813b.d dVarH = this.f8314b.h();
                while (dVarH.hasNext()) {
                    d((c) ((Map.Entry) dVarH.next()).getValue());
                    if (this.f8321i) {
                        break;
                    }
                }
            }
        } while (this.f8321i);
        this.f8320h = false;
    }

    public Object f() {
        Object obj = this.f8317e;
        if (obj != f8312k) {
            return obj;
        }
        return null;
    }

    public boolean g() {
        return this.f8315c > 0;
    }

    public void h(l lVar, r rVar) {
        b("observe");
        if (lVar.getLifecycle().b() == AbstractC0651h.c.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(lVar, rVar);
        c cVar = (c) this.f8314b.m(rVar, lifecycleBoundObserver);
        if (cVar != null && !cVar.j(lVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (cVar != null) {
            return;
        }
        lVar.getLifecycle().a(lifecycleBoundObserver);
    }

    public void i(r rVar) {
        b("observeForever");
        b bVar = new b(rVar);
        c cVar = (c) this.f8314b.m(rVar, bVar);
        if (cVar instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (cVar != null) {
            return;
        }
        bVar.h(true);
    }

    protected void j() {
    }

    protected void k() {
    }

    protected void l(Object obj) {
        boolean z6;
        synchronized (this.f8313a) {
            z6 = this.f8318f == f8312k;
            this.f8318f = obj;
        }
        if (z6) {
            C1767a.e().c(this.f8322j);
        }
    }

    public void m(r rVar) {
        b("removeObserver");
        c cVar = (c) this.f8314b.n(rVar);
        if (cVar == null) {
            return;
        }
        cVar.i();
        cVar.h(false);
    }

    protected void n(Object obj) {
        b("setValue");
        this.f8319g++;
        this.f8317e = obj;
        e(null);
    }
}
