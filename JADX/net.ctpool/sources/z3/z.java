package z3;

/* JADX INFO: loaded from: classes.dex */
final class z implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final /* synthetic */ C2257A f23311m;

    z(C2257A c2257a) {
        this.f23311m = c2257a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f23311m.f23251b) {
            try {
                C2257A c2257a = this.f23311m;
                if (c2257a.f23252c != null) {
                    c2257a.f23252c.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
