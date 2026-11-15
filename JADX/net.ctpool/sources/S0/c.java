package S0;

import S0.a;

/* JADX INFO: loaded from: classes.dex */
public class c extends a {
    c(Object obj, g gVar, a.c cVar, Throwable th) {
        super(obj, gVar, cVar, th, true);
    }

    protected void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (this.f2914m) {
                    return;
                }
                Object objF = this.f2915n.f();
                P0.a.I("FinalizerCloseableReference", "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.f2915n)), objF == null ? null : objF.getClass().getName());
                this.f2915n.d();
            }
        } finally {
            super.finalize();
        }
    }

    @Override // S0.a
    /* JADX INFO: renamed from: b */
    public a clone() {
        return this;
    }

    @Override // S0.a, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
