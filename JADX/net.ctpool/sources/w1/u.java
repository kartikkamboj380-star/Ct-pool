package w1;

/* JADX INFO: loaded from: classes.dex */
public class u implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x f22655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z f22656b;

    public u(x xVar, z zVar) {
        this.f22655a = xVar;
        this.f22656b = zVar;
    }

    @Override // w1.x
    public boolean b(O0.m mVar) {
        return this.f22655a.b(mVar);
    }

    @Override // w1.x
    public void c(Object obj) {
        this.f22655a.c(obj);
    }

    @Override // w1.x
    public S0.a d(Object obj, S0.a aVar) {
        this.f22656b.c(obj);
        return this.f22655a.d(obj, aVar);
    }

    @Override // w1.x
    public int e(O0.m mVar) {
        return this.f22655a.e(mVar);
    }

    @Override // w1.x
    public S0.a get(Object obj) {
        S0.a aVar = this.f22655a.get(obj);
        z zVar = this.f22656b;
        if (aVar == null) {
            zVar.b(obj);
        } else {
            zVar.a(obj);
        }
        return aVar;
    }
}
