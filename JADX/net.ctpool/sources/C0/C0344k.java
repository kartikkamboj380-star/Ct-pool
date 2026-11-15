package C0;

/* JADX INFO: renamed from: C0.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0344k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f912a;

    /* JADX INFO: renamed from: C0.k$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f913a;

        /* synthetic */ a(K k7) {
        }

        public C0344k a() {
            if (this.f913a != null) {
                return new C0344k(this, null);
            }
            throw new IllegalArgumentException("Product type must be set");
        }

        public a b(String str) {
            this.f913a = str;
            return this;
        }
    }

    /* synthetic */ C0344k(a aVar, L l7) {
        this.f912a = aVar.f913a;
    }

    public static a a() {
        return new a(null);
    }

    public final String b() {
        return this.f912a;
    }
}
