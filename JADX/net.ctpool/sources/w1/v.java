package w1;

/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    class a implements z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f22657a;

        a(t tVar) {
            this.f22657a = tVar;
        }

        @Override // w1.z
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(I0.d dVar) {
            this.f22657a.g(dVar);
        }

        @Override // w1.z
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(I0.d dVar) {
            this.f22657a.i(dVar);
        }

        @Override // w1.z
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void c(I0.d dVar) {
            this.f22657a.a(dVar);
        }
    }

    public static u a(x xVar, t tVar) {
        tVar.e(xVar);
        return new u(xVar, new a(tVar));
    }
}
