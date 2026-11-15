package S0;

import O0.l;
import S0.a;

/* JADX INFO: loaded from: classes.dex */
public class b extends a {
    private b(h hVar, a.c cVar, Throwable th) {
        super(hVar, cVar, th);
    }

    @Override // S0.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a clone() {
        l.i(z());
        return new b(this.f2915n, this.f2916o, this.f2917p != null ? new Throwable() : null);
    }

    protected void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (this.f2914m) {
                    super.finalize();
                    return;
                }
                Object objF = this.f2915n.f();
                P0.a.I("DefaultCloseableReference", "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.f2915n)), objF == null ? null : objF.getClass().getName());
                a.c cVar = this.f2916o;
                if (cVar != null) {
                    cVar.a(this.f2915n, this.f2917p);
                }
                close();
                super.finalize();
            }
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    b(Object obj, g gVar, a.c cVar, Throwable th) {
        super(obj, gVar, cVar, th, true);
    }
}
