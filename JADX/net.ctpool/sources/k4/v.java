package k4;

import k4.F;

/* JADX INFO: loaded from: classes.dex */
final class v extends F.e.d.AbstractC0291d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f20946a;

    static final class b extends F.e.d.AbstractC0291d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f20947a;

        b() {
        }

        @Override // k4.F.e.d.AbstractC0291d.a
        public F.e.d.AbstractC0291d a() {
            String str = this.f20947a;
            if (str != null) {
                return new v(str);
            }
            throw new IllegalStateException("Missing required properties: content");
        }

        @Override // k4.F.e.d.AbstractC0291d.a
        public F.e.d.AbstractC0291d.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null content");
            }
            this.f20947a = str;
            return this;
        }
    }

    private v(String str) {
        this.f20946a = str;
    }

    @Override // k4.F.e.d.AbstractC0291d
    public String b() {
        return this.f20946a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.d.AbstractC0291d) {
            return this.f20946a.equals(((F.e.d.AbstractC0291d) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f20946a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Log{content=" + this.f20946a + "}";
    }
}
