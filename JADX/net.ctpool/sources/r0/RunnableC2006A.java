package r0;

import android.content.Context;
import android.os.Build;
import s0.InterfaceC2034b;

/* JADX INFO: renamed from: r0.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC2006A implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static final String f22052s = l0.i.i("WorkForegroundRunnable");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final androidx.work.impl.utils.futures.c f22053m = androidx.work.impl.utils.futures.c.t();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final Context f22054n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final q0.u f22055o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final androidx.work.c f22056p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final l0.f f22057q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final InterfaceC2034b f22058r;

    /* JADX INFO: renamed from: r0.A$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f22059m;

        a(androidx.work.impl.utils.futures.c cVar) {
            this.f22059m = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (RunnableC2006A.this.f22053m.isCancelled()) {
                return;
            }
            try {
                l0.e eVar = (l0.e) this.f22059m.get();
                if (eVar == null) {
                    throw new IllegalStateException("Worker was marked important (" + RunnableC2006A.this.f22055o.f21797c + ") but did not provide ForegroundInfo");
                }
                l0.i.e().a(RunnableC2006A.f22052s, "Updating notification for " + RunnableC2006A.this.f22055o.f21797c);
                RunnableC2006A runnableC2006A = RunnableC2006A.this;
                runnableC2006A.f22053m.r(runnableC2006A.f22057q.a(runnableC2006A.f22054n, runnableC2006A.f22056p.e(), eVar));
            } catch (Throwable th) {
                RunnableC2006A.this.f22053m.q(th);
            }
        }
    }

    public RunnableC2006A(Context context, q0.u uVar, androidx.work.c cVar, l0.f fVar, InterfaceC2034b interfaceC2034b) {
        this.f22054n = context;
        this.f22055o = uVar;
        this.f22056p = cVar;
        this.f22057q = fVar;
        this.f22058r = interfaceC2034b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(androidx.work.impl.utils.futures.c cVar) {
        if (this.f22053m.isCancelled()) {
            cVar.cancel(true);
        } else {
            cVar.r(this.f22056p.d());
        }
    }

    public X3.d b() {
        return this.f22053m;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!this.f22055o.f21811q || Build.VERSION.SDK_INT >= 31) {
            this.f22053m.p(null);
            return;
        }
        final androidx.work.impl.utils.futures.c cVarT = androidx.work.impl.utils.futures.c.t();
        this.f22058r.a().execute(new Runnable() { // from class: r0.z
            @Override // java.lang.Runnable
            public final void run() {
                this.f22118m.c(cVarT);
            }
        });
        cVarT.e(new a(cVarT), this.f22058r.a());
    }
}
