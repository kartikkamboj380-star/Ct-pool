package Q3;

import z3.C2273m;

/* JADX INFO: loaded from: classes.dex */
final class t extends q {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ C2273m f2782n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ q f2783o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final /* synthetic */ A f2784p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t(A a7, C2273m c2273m, C2273m c2273m2, q qVar) {
        super(c2273m);
        this.f2784p = a7;
        this.f2782n = c2273m2;
        this.f2783o = qVar;
    }

    @Override // Q3.q
    public final void a() {
        synchronized (this.f2784p.f2752f) {
            try {
                A.n(this.f2784p, this.f2782n);
                if (this.f2784p.f2757k.getAndIncrement() > 0) {
                    this.f2784p.f2748b.c("Already connected to the service.", new Object[0]);
                }
                A.p(this.f2784p, this.f2783o);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
