package z3;

/* JADX INFO: renamed from: z3.B, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC2258B implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final /* synthetic */ AbstractC2272l f23253m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ C2259C f23254n;

    RunnableC2258B(C2259C c2259c, AbstractC2272l abstractC2272l) {
        this.f23254n = c2259c;
        this.f23253m = abstractC2272l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f23254n.f23256b) {
            try {
                C2259C c2259c = this.f23254n;
                if (c2259c.f23257c != null) {
                    c2259c.f23257c.a(this.f23253m);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
