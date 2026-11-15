package m0;

import java.util.HashMap;
import java.util.Map;
import l0.i;
import l0.q;
import q0.u;

/* JADX INFO: renamed from: m0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1866a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final String f21205d = i.i("DelayedWorkTracker");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final C1867b f21206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q f21207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f21208c = new HashMap();

    /* JADX INFO: renamed from: m0.a$a, reason: collision with other inner class name */
    class RunnableC0302a implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ u f21209m;

        RunnableC0302a(u uVar) {
            this.f21209m = uVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            i.e().a(C1866a.f21205d, "Scheduling work " + this.f21209m.f21795a);
            C1866a.this.f21206a.e(this.f21209m);
        }
    }

    public C1866a(C1867b c1867b, q qVar) {
        this.f21206a = c1867b;
        this.f21207b = qVar;
    }

    public void a(u uVar) {
        Runnable runnable = (Runnable) this.f21208c.remove(uVar.f21795a);
        if (runnable != null) {
            this.f21207b.b(runnable);
        }
        RunnableC0302a runnableC0302a = new RunnableC0302a(uVar);
        this.f21208c.put(uVar.f21795a, runnableC0302a);
        this.f21207b.a(uVar.c() - System.currentTimeMillis(), runnableC0302a);
    }

    public void b(String str) {
        Runnable runnable = (Runnable) this.f21208c.remove(str);
        if (runnable != null) {
            this.f21207b.b(runnable);
        }
    }
}
