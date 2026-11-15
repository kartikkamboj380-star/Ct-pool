package l6;

import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
final class b implements Runnable, l {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final k f21122m = new k();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final c f21123n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private volatile boolean f21124o;

    b(c cVar) {
        this.f21123n = cVar;
    }

    @Override // l6.l
    public void a(q qVar, Object obj) {
        j jVarA = j.a(qVar, obj);
        synchronized (this) {
            try {
                this.f21122m.a(jVarA);
                if (!this.f21124o) {
                    this.f21124o = true;
                    this.f21123n.d().execute(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        j jVarC;
        while (true) {
            try {
                try {
                    jVarC = this.f21122m.c(1000);
                } catch (InterruptedException e7) {
                    this.f21123n.e().b(Level.WARNING, Thread.currentThread().getName() + " was interruppted", e7);
                    this.f21124o = false;
                    return;
                }
            } catch (Throwable th) {
                this.f21124o = false;
                throw th;
            }
            if (jVarC == null) {
                synchronized (this) {
                    jVarC = this.f21122m.b();
                    if (jVarC == null) {
                        this.f21124o = false;
                        this.f21124o = false;
                        return;
                    }
                    this.f21124o = false;
                    throw th;
                }
            }
            this.f21123n.g(jVarC);
        }
    }
}
