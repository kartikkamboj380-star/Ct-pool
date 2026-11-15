package z3;

/* JADX INFO: loaded from: classes.dex */
final class F implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final /* synthetic */ AbstractC2272l f23263m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ G f23264n;

    F(G g7, AbstractC2272l abstractC2272l) {
        this.f23264n = g7;
        this.f23263m = abstractC2272l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f23264n.f23266b) {
            try {
                G g7 = this.f23264n;
                if (g7.f23267c != null) {
                    g7.f23267c.b(this.f23263m.l());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
