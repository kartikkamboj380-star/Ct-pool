package r0;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import s0.InterfaceExecutorC2033a;

/* JADX INFO: loaded from: classes.dex */
public class t implements InterfaceExecutorC2033a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Executor f22103n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Runnable f22104o;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ArrayDeque f22102m = new ArrayDeque();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final Object f22105p = new Object();

    static class a implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final t f22106m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final Runnable f22107n;

        a(t tVar, Runnable runnable) {
            this.f22106m = tVar;
            this.f22107n = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f22107n.run();
                synchronized (this.f22106m.f22105p) {
                    this.f22106m.a();
                }
            } catch (Throwable th) {
                synchronized (this.f22106m.f22105p) {
                    this.f22106m.a();
                    throw th;
                }
            }
        }
    }

    public t(Executor executor) {
        this.f22103n = executor;
    }

    @Override // s0.InterfaceExecutorC2033a
    public boolean U() {
        boolean z6;
        synchronized (this.f22105p) {
            z6 = !this.f22102m.isEmpty();
        }
        return z6;
    }

    void a() {
        Runnable runnable = (Runnable) this.f22102m.poll();
        this.f22104o = runnable;
        if (runnable != null) {
            this.f22103n.execute(runnable);
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        synchronized (this.f22105p) {
            try {
                this.f22102m.add(new a(this, runnable));
                if (this.f22104o == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
