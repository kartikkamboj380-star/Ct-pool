package k4;

import k4.F;

/* JADX INFO: renamed from: k4.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1830d extends F.a.AbstractC0276a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f20767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f20768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f20769c;

    /* JADX INFO: renamed from: k4.d$b */
    static final class b extends F.a.AbstractC0276a.AbstractC0277a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f20770a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f20771b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f20772c;

        b() {
        }

        @Override // k4.F.a.AbstractC0276a.AbstractC0277a
        public F.a.AbstractC0276a a() {
            String str;
            String str2;
            String str3 = this.f20770a;
            if (str3 != null && (str = this.f20771b) != null && (str2 = this.f20772c) != null) {
                return new C1830d(str3, str, str2);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f20770a == null) {
                sb.append(" arch");
            }
            if (this.f20771b == null) {
                sb.append(" libraryName");
            }
            if (this.f20772c == null) {
                sb.append(" buildId");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // k4.F.a.AbstractC0276a.AbstractC0277a
        public F.a.AbstractC0276a.AbstractC0277a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null arch");
            }
            this.f20770a = str;
            return this;
        }

        @Override // k4.F.a.AbstractC0276a.AbstractC0277a
        public F.a.AbstractC0276a.AbstractC0277a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildId");
            }
            this.f20772c = str;
            return this;
        }

        @Override // k4.F.a.AbstractC0276a.AbstractC0277a
        public F.a.AbstractC0276a.AbstractC0277a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null libraryName");
            }
            this.f20771b = str;
            return this;
        }
    }

    private C1830d(String str, String str2, String str3) {
        this.f20767a = str;
        this.f20768b = str2;
        this.f20769c = str3;
    }

    @Override // k4.F.a.AbstractC0276a
    public String b() {
        return this.f20767a;
    }

    @Override // k4.F.a.AbstractC0276a
    public String c() {
        return this.f20769c;
    }

    @Override // k4.F.a.AbstractC0276a
    public String d() {
        return this.f20768b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.a.AbstractC0276a)) {
            return false;
        }
        F.a.AbstractC0276a abstractC0276a = (F.a.AbstractC0276a) obj;
        return this.f20767a.equals(abstractC0276a.b()) && this.f20768b.equals(abstractC0276a.d()) && this.f20769c.equals(abstractC0276a.c());
    }

    public int hashCode() {
        return ((((this.f20767a.hashCode() ^ 1000003) * 1000003) ^ this.f20768b.hashCode()) * 1000003) ^ this.f20769c.hashCode();
    }

    public String toString() {
        return "BuildIdMappingForArch{arch=" + this.f20767a + ", libraryName=" + this.f20768b + ", buildId=" + this.f20769c + "}";
    }
}
