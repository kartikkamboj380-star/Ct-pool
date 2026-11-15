package Q3;

import z3.C2273m;

/* JADX INFO: loaded from: classes.dex */
public abstract class q implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final C2273m f2778m;

    q() {
        this.f2778m = null;
    }

    protected abstract void a();

    final C2273m b() {
        return this.f2778m;
    }

    public final void c(Exception exc) {
        C2273m c2273m = this.f2778m;
        if (c2273m != null) {
            c2273m.d(exc);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e7) {
            c(e7);
        }
    }

    public q(C2273m c2273m) {
        this.f2778m = c2273m;
    }
}
