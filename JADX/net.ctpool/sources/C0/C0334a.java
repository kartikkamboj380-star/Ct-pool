package C0;

/* JADX INFO: renamed from: C0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0334a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f906a;

    /* JADX INFO: renamed from: C0.a$a, reason: collision with other inner class name */
    public static final class C0011a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f907a;

        /* synthetic */ C0011a(AbstractC0346m abstractC0346m) {
        }

        public C0334a a() {
            String str = this.f907a;
            if (str == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            C0334a c0334a = new C0334a(null);
            c0334a.f906a = str;
            return c0334a;
        }

        public C0011a b(String str) {
            this.f907a = str;
            return this;
        }
    }

    /* synthetic */ C0334a(AbstractC0347n abstractC0347n) {
    }

    public static C0011a b() {
        return new C0011a(null);
    }

    public String a() {
        return this.f906a;
    }
}
