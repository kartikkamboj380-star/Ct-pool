package k4;

import k4.F;

/* JADX INFO: renamed from: k4.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1831e extends F.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f20773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f20774b;

    /* JADX INFO: renamed from: k4.e$b */
    static final class b extends F.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f20775a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f20776b;

        b() {
        }

        @Override // k4.F.c.a
        public F.c a() {
            String str;
            String str2 = this.f20775a;
            if (str2 != null && (str = this.f20776b) != null) {
                return new C1831e(str2, str);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f20775a == null) {
                sb.append(" key");
            }
            if (this.f20776b == null) {
                sb.append(" value");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // k4.F.c.a
        public F.c.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null key");
            }
            this.f20775a = str;
            return this;
        }

        @Override // k4.F.c.a
        public F.c.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null value");
            }
            this.f20776b = str;
            return this;
        }
    }

    private C1831e(String str, String str2) {
        this.f20773a = str;
        this.f20774b = str2;
    }

    @Override // k4.F.c
    public String b() {
        return this.f20773a;
    }

    @Override // k4.F.c
    public String c() {
        return this.f20774b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.c)) {
            return false;
        }
        F.c cVar = (F.c) obj;
        return this.f20773a.equals(cVar.b()) && this.f20774b.equals(cVar.c());
    }

    public int hashCode() {
        return ((this.f20773a.hashCode() ^ 1000003) * 1000003) ^ this.f20774b.hashCode();
    }

    public String toString() {
        return "CustomAttribute{key=" + this.f20773a + ", value=" + this.f20774b + "}";
    }
}
