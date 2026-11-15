package k4;

import k4.F;

/* JADX INFO: loaded from: classes.dex */
final class i extends F.e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f20810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f20811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f20812c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f20813d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f20814e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f20815f;

    static final class b extends F.e.a.AbstractC0278a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f20816a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f20817b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f20818c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f20819d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f20820e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f20821f;

        b() {
        }

        @Override // k4.F.e.a.AbstractC0278a
        public F.e.a a() {
            String str;
            String str2 = this.f20816a;
            if (str2 != null && (str = this.f20817b) != null) {
                return new i(str2, str, this.f20818c, null, this.f20819d, this.f20820e, this.f20821f);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f20816a == null) {
                sb.append(" identifier");
            }
            if (this.f20817b == null) {
                sb.append(" version");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // k4.F.e.a.AbstractC0278a
        public F.e.a.AbstractC0278a b(String str) {
            this.f20820e = str;
            return this;
        }

        @Override // k4.F.e.a.AbstractC0278a
        public F.e.a.AbstractC0278a c(String str) {
            this.f20821f = str;
            return this;
        }

        @Override // k4.F.e.a.AbstractC0278a
        public F.e.a.AbstractC0278a d(String str) {
            this.f20818c = str;
            return this;
        }

        @Override // k4.F.e.a.AbstractC0278a
        public F.e.a.AbstractC0278a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f20816a = str;
            return this;
        }

        @Override // k4.F.e.a.AbstractC0278a
        public F.e.a.AbstractC0278a f(String str) {
            this.f20819d = str;
            return this;
        }

        @Override // k4.F.e.a.AbstractC0278a
        public F.e.a.AbstractC0278a g(String str) {
            if (str == null) {
                throw new NullPointerException("Null version");
            }
            this.f20817b = str;
            return this;
        }
    }

    private i(String str, String str2, String str3, F.e.a.b bVar, String str4, String str5, String str6) {
        this.f20810a = str;
        this.f20811b = str2;
        this.f20812c = str3;
        this.f20813d = str4;
        this.f20814e = str5;
        this.f20815f = str6;
    }

    @Override // k4.F.e.a
    public String b() {
        return this.f20814e;
    }

    @Override // k4.F.e.a
    public String c() {
        return this.f20815f;
    }

    @Override // k4.F.e.a
    public String d() {
        return this.f20812c;
    }

    @Override // k4.F.e.a
    public String e() {
        return this.f20810a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.a)) {
            return false;
        }
        F.e.a aVar = (F.e.a) obj;
        if (this.f20810a.equals(aVar.e()) && this.f20811b.equals(aVar.h()) && ((str = this.f20812c) != null ? str.equals(aVar.d()) : aVar.d() == null)) {
            aVar.g();
            String str2 = this.f20813d;
            if (str2 != null ? str2.equals(aVar.f()) : aVar.f() == null) {
                String str3 = this.f20814e;
                if (str3 != null ? str3.equals(aVar.b()) : aVar.b() == null) {
                    String str4 = this.f20815f;
                    String strC = aVar.c();
                    if (str4 == null) {
                        if (strC == null) {
                            return true;
                        }
                    } else if (str4.equals(strC)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // k4.F.e.a
    public String f() {
        return this.f20813d;
    }

    @Override // k4.F.e.a
    public F.e.a.b g() {
        return null;
    }

    @Override // k4.F.e.a
    public String h() {
        return this.f20811b;
    }

    public int hashCode() {
        int iHashCode = (((this.f20810a.hashCode() ^ 1000003) * 1000003) ^ this.f20811b.hashCode()) * 1000003;
        String str = this.f20812c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * (-721379959);
        String str2 = this.f20813d;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f20814e;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f20815f;
        return iHashCode4 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "Application{identifier=" + this.f20810a + ", version=" + this.f20811b + ", displayVersion=" + this.f20812c + ", organization=" + ((Object) null) + ", installationUuid=" + this.f20813d + ", developmentPlatform=" + this.f20814e + ", developmentPlatformVersion=" + this.f20815f + "}";
    }
}
