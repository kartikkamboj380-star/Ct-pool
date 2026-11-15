package z3;

/* JADX INFO: loaded from: classes.dex */
final class v implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final /* synthetic */ AbstractC2272l f23301m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ w f23302n;

    v(w wVar, AbstractC2272l abstractC2272l) {
        this.f23302n = wVar;
        this.f23301m = abstractC2272l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f23301m.n()) {
            this.f23302n.f23305c.u();
            return;
        }
        try {
            this.f23302n.f23305c.t(this.f23302n.f23304b.a(this.f23301m));
        } catch (C2270j e7) {
            if (e7.getCause() instanceof Exception) {
                this.f23302n.f23305c.s((Exception) e7.getCause());
            } else {
                this.f23302n.f23305c.s(e7);
            }
        } catch (Exception e8) {
            this.f23302n.f23305c.s(e8);
        }
    }
}
