package k4;

import k4.F;

/* JADX INFO: renamed from: k4.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1824A extends F.e.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f20552a;

    /* JADX INFO: renamed from: k4.A$b */
    static final class b extends F.e.f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f20553a;

        b() {
        }

        @Override // k4.F.e.f.a
        public F.e.f a() {
            String str = this.f20553a;
            if (str != null) {
                return new C1824A(str);
            }
            throw new IllegalStateException("Missing required properties: identifier");
        }

        @Override // k4.F.e.f.a
        public F.e.f.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f20553a = str;
            return this;
        }
    }

    private C1824A(String str) {
        this.f20552a = str;
    }

    @Override // k4.F.e.f
    public String b() {
        return this.f20552a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.f) {
            return this.f20552a.equals(((F.e.f) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f20552a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "User{identifier=" + this.f20552a + "}";
    }
}
