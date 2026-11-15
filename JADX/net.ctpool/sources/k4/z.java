package k4;

import k4.F;

/* JADX INFO: loaded from: classes.dex */
final class z extends F.e.AbstractC0293e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f20963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f20964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f20965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f20966d;

    static final class b extends F.e.AbstractC0293e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f20967a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f20968b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f20969c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f20970d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private byte f20971e;

        b() {
        }

        @Override // k4.F.e.AbstractC0293e.a
        public F.e.AbstractC0293e a() {
            String str;
            String str2;
            if (this.f20971e == 3 && (str = this.f20968b) != null && (str2 = this.f20969c) != null) {
                return new z(this.f20967a, str, str2, this.f20970d);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f20971e & 1) == 0) {
                sb.append(" platform");
            }
            if (this.f20968b == null) {
                sb.append(" version");
            }
            if (this.f20969c == null) {
                sb.append(" buildVersion");
            }
            if ((this.f20971e & 2) == 0) {
                sb.append(" jailbroken");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // k4.F.e.AbstractC0293e.a
        public F.e.AbstractC0293e.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildVersion");
            }
            this.f20969c = str;
            return this;
        }

        @Override // k4.F.e.AbstractC0293e.a
        public F.e.AbstractC0293e.a c(boolean z6) {
            this.f20970d = z6;
            this.f20971e = (byte) (this.f20971e | 2);
            return this;
        }

        @Override // k4.F.e.AbstractC0293e.a
        public F.e.AbstractC0293e.a d(int i7) {
            this.f20967a = i7;
            this.f20971e = (byte) (this.f20971e | 1);
            return this;
        }

        @Override // k4.F.e.AbstractC0293e.a
        public F.e.AbstractC0293e.a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null version");
            }
            this.f20968b = str;
            return this;
        }
    }

    private z(int i7, String str, String str2, boolean z6) {
        this.f20963a = i7;
        this.f20964b = str;
        this.f20965c = str2;
        this.f20966d = z6;
    }

    @Override // k4.F.e.AbstractC0293e
    public String b() {
        return this.f20965c;
    }

    @Override // k4.F.e.AbstractC0293e
    public int c() {
        return this.f20963a;
    }

    @Override // k4.F.e.AbstractC0293e
    public String d() {
        return this.f20964b;
    }

    @Override // k4.F.e.AbstractC0293e
    public boolean e() {
        return this.f20966d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.AbstractC0293e)) {
            return false;
        }
        F.e.AbstractC0293e abstractC0293e = (F.e.AbstractC0293e) obj;
        return this.f20963a == abstractC0293e.c() && this.f20964b.equals(abstractC0293e.d()) && this.f20965c.equals(abstractC0293e.b()) && this.f20966d == abstractC0293e.e();
    }

    public int hashCode() {
        return ((((((this.f20963a ^ 1000003) * 1000003) ^ this.f20964b.hashCode()) * 1000003) ^ this.f20965c.hashCode()) * 1000003) ^ (this.f20966d ? 1231 : 1237);
    }

    public String toString() {
        return "OperatingSystem{platform=" + this.f20963a + ", version=" + this.f20964b + ", buildVersion=" + this.f20965c + ", jailbroken=" + this.f20966d + "}";
    }
}
