package Y0;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements e {
    @Override // Y0.e
    public void a(c cVar) {
        boolean zB = cVar.b();
        try {
            f(cVar);
        } finally {
            if (zB) {
                cVar.close();
            }
        }
    }

    @Override // Y0.e
    public void c(c cVar) {
        try {
            e(cVar);
        } finally {
            cVar.close();
        }
    }

    protected abstract void e(c cVar);

    protected abstract void f(c cVar);

    @Override // Y0.e
    public void b(c cVar) {
    }

    @Override // Y0.e
    public void d(c cVar) {
    }
}
