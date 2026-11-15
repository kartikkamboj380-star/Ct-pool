package Q3;

/* JADX INFO: loaded from: classes.dex */
final class u extends q {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ A f2785n;

    u(A a7) {
        this.f2785n = a7;
    }

    @Override // Q3.q
    public final void a() {
        synchronized (this.f2785n.f2752f) {
            try {
                if (this.f2785n.f2757k.get() > 0 && this.f2785n.f2757k.decrementAndGet() > 0) {
                    this.f2785n.f2748b.c("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                A a7 = this.f2785n;
                if (a7.f2759m != null) {
                    a7.f2748b.c("Unbind from service.", new Object[0]);
                    A a8 = this.f2785n;
                    a8.f2747a.unbindService(a8.f2758l);
                    this.f2785n.f2753g = false;
                    this.f2785n.f2759m = null;
                    this.f2785n.f2758l = null;
                }
                this.f2785n.w();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
