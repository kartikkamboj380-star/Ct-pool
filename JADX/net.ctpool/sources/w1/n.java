package w1;

/* JADX INFO: loaded from: classes.dex */
public interface n extends x, R0.c {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f22644a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final S0.a f22645b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f22646c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f22647d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f22648e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f22649f;

        private a(Object obj, S0.a aVar, b bVar, int i7) {
            this.f22644a = O0.l.g(obj);
            this.f22645b = (S0.a) O0.l.g(S0.a.e(aVar));
            this.f22649f = i7;
        }

        public static a a(Object obj, S0.a aVar, int i7, b bVar) {
            return new a(obj, aVar, bVar, i7);
        }

        public static a b(Object obj, S0.a aVar, b bVar) {
            return a(obj, aVar, -1, bVar);
        }
    }

    public interface b {
    }
}
