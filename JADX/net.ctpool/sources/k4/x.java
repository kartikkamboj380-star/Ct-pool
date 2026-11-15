package k4;

import k4.F;

/* JADX INFO: loaded from: classes.dex */
final class x extends F.e.d.AbstractC0292e.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f20957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f20958b;

    static final class b extends F.e.d.AbstractC0292e.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f20959a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f20960b;

        b() {
        }

        @Override // k4.F.e.d.AbstractC0292e.b.a
        public F.e.d.AbstractC0292e.b a() {
            String str;
            String str2 = this.f20959a;
            if (str2 != null && (str = this.f20960b) != null) {
                return new x(str2, str);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f20959a == null) {
                sb.append(" rolloutId");
            }
            if (this.f20960b == null) {
                sb.append(" variantId");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // k4.F.e.d.AbstractC0292e.b.a
        public F.e.d.AbstractC0292e.b.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null rolloutId");
            }
            this.f20959a = str;
            return this;
        }

        @Override // k4.F.e.d.AbstractC0292e.b.a
        public F.e.d.AbstractC0292e.b.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            this.f20960b = str;
            return this;
        }
    }

    private x(String str, String str2) {
        this.f20957a = str;
        this.f20958b = str2;
    }

    @Override // k4.F.e.d.AbstractC0292e.b
    public String b() {
        return this.f20957a;
    }

    @Override // k4.F.e.d.AbstractC0292e.b
    public String c() {
        return this.f20958b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d.AbstractC0292e.b)) {
            return false;
        }
        F.e.d.AbstractC0292e.b bVar = (F.e.d.AbstractC0292e.b) obj;
        return this.f20957a.equals(bVar.b()) && this.f20958b.equals(bVar.c());
    }

    public int hashCode() {
        return ((this.f20957a.hashCode() ^ 1000003) * 1000003) ^ this.f20958b.hashCode();
    }

    public String toString() {
        return "RolloutVariant{rolloutId=" + this.f20957a + ", variantId=" + this.f20958b + "}";
    }
}
