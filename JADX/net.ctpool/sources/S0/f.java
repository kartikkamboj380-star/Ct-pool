package S0;

import O0.l;
import S0.a;

/* JADX INFO: loaded from: classes.dex */
public class f extends a {
    private f(h hVar, a.c cVar, Throwable th) {
        super(hVar, cVar, th);
    }

    @Override // S0.a
    /* JADX INFO: renamed from: b */
    public a clone() {
        l.i(z());
        return new f(this.f2915n, this.f2916o, this.f2917p);
    }

    f(Object obj, g gVar, a.c cVar, Throwable th) {
        super(obj, gVar, cVar, th, false);
    }
}
