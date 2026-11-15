package C0;

/* JADX INFO: renamed from: C0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0337d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f908a;

    /* JADX INFO: renamed from: C0.d$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f909a;

        /* synthetic */ a(x xVar) {
        }

        public C0337d a() {
            String str = this.f909a;
            if (str == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            C0337d c0337d = new C0337d(null);
            c0337d.f908a = str;
            return c0337d;
        }

        public a b(String str) {
            this.f909a = str;
            return this;
        }
    }

    /* synthetic */ C0337d(y yVar) {
    }

    public static a b() {
        return new a(null);
    }

    public String a() {
        return this.f908a;
    }
}
