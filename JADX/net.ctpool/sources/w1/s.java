package w1;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    class a implements z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f22654a;

        a(t tVar) {
            this.f22654a = tVar;
        }

        @Override // w1.z
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(I0.d dVar) {
            this.f22654a.d(dVar);
        }

        @Override // w1.z
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(I0.d dVar) {
            this.f22654a.n(dVar);
        }

        @Override // w1.z
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void c(I0.d dVar) {
            this.f22654a.h(dVar);
        }
    }

    public static u a(x xVar, t tVar) {
        tVar.k(xVar);
        return new u(xVar, new a(tVar));
    }
}
