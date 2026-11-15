package C0;

/* JADX INFO: renamed from: C0.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0343j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f910a;

    /* JADX INFO: renamed from: C0.j$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f911a;

        /* synthetic */ a(I i7) {
        }

        public C0343j a() {
            if (this.f911a != null) {
                return new C0343j(this, null);
            }
            throw new IllegalArgumentException("Product type must be set");
        }

        public a b(String str) {
            this.f911a = str;
            return this;
        }
    }

    /* synthetic */ C0343j(a aVar, J j7) {
        this.f910a = aVar.f911a;
    }

    public static a a() {
        return new a(null);
    }

    public final String b() {
        return this.f910a;
    }
}
