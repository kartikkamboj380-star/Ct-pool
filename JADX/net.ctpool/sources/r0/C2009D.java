package r0;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: r0.D, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2009D {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f22073e = l0.i.i("WorkTimer");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final l0.q f22074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Map f22075b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Map f22076c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Object f22077d = new Object();

    /* JADX INFO: renamed from: r0.D$a */
    public interface a {
        void a(q0.m mVar);
    }

    /* JADX INFO: renamed from: r0.D$b */
    public static class b implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final C2009D f22078m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final q0.m f22079n;

        b(C2009D c2009d, q0.m mVar) {
            this.f22078m = c2009d;
            this.f22079n = mVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f22078m.f22077d) {
                try {
                    if (((b) this.f22078m.f22075b.remove(this.f22079n)) != null) {
                        a aVar = (a) this.f22078m.f22076c.remove(this.f22079n);
                        if (aVar != null) {
                            aVar.a(this.f22079n);
                        }
                    } else {
                        l0.i.e().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.f22079n));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public C2009D(l0.q qVar) {
        this.f22074a = qVar;
    }

    public void a(q0.m mVar, long j7, a aVar) {
        synchronized (this.f22077d) {
            l0.i.e().a(f22073e, "Starting timer for " + mVar);
            b(mVar);
            b bVar = new b(this, mVar);
            this.f22075b.put(mVar, bVar);
            this.f22076c.put(mVar, aVar);
            this.f22074a.a(j7, bVar);
        }
    }

    public void b(q0.m mVar) {
        synchronized (this.f22077d) {
            try {
                if (((b) this.f22075b.remove(mVar)) != null) {
                    l0.i.e().a(f22073e, "Stopping timer for " + mVar);
                    this.f22076c.remove(mVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
