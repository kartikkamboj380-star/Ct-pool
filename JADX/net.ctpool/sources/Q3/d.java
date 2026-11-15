package Q3;

/* JADX INFO: loaded from: classes.dex */
public final class d implements f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f2764c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile f f2765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f2766b = f2764c;

    private d(f fVar) {
        this.f2765a = fVar;
    }

    public static f b(f fVar) {
        fVar.getClass();
        return fVar instanceof d ? fVar : new d(fVar);
    }

    @Override // Q3.f
    public final Object a() {
        Object objA = this.f2766b;
        Object obj = f2764c;
        if (objA == obj) {
            synchronized (this) {
                try {
                    objA = this.f2766b;
                    if (objA == obj) {
                        objA = this.f2765a.a();
                        Object obj2 = this.f2766b;
                        if (obj2 != obj && obj2 != objA) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + objA + ". This is likely due to a circular dependency.");
                        }
                        this.f2766b = objA;
                        this.f2765a = null;
                    }
                } finally {
                }
            }
        }
        return objA;
    }
}
