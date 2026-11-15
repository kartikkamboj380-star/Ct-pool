package X2;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final b f4308b = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f4309a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private e f4310a = null;

        a() {
        }

        public b a() {
            return new b(this.f4310a);
        }

        public a b(e eVar) {
            this.f4310a = eVar;
            return this;
        }
    }

    b(e eVar) {
        this.f4309a = eVar;
    }

    public static a b() {
        return new a();
    }

    public e a() {
        return this.f4309a;
    }
}
