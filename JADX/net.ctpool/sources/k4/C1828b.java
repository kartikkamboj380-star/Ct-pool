package k4;

import k4.F;

/* JADX INFO: renamed from: k4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1828b extends F {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f20723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f20724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f20725d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f20726e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f20727f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f20728g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f20729h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f20730i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f20731j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final F.e f20732k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final F.d f20733l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final F.a f20734m;

    /* JADX INFO: renamed from: k4.b$b, reason: collision with other inner class name */
    static final class C0295b extends F.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f20735a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f20736b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f20737c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f20738d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f20739e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f20740f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f20741g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f20742h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f20743i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private F.e f20744j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private F.d f20745k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private F.a f20746l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private byte f20747m;

        C0295b() {
        }

        @Override // k4.F.b
        public F a() {
            if (this.f20747m == 1 && this.f20735a != null && this.f20736b != null && this.f20738d != null && this.f20742h != null && this.f20743i != null) {
                return new C1828b(this.f20735a, this.f20736b, this.f20737c, this.f20738d, this.f20739e, this.f20740f, this.f20741g, this.f20742h, this.f20743i, this.f20744j, this.f20745k, this.f20746l);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f20735a == null) {
                sb.append(" sdkVersion");
            }
            if (this.f20736b == null) {
                sb.append(" gmpAppId");
            }
            if ((1 & this.f20747m) == 0) {
                sb.append(" platform");
            }
            if (this.f20738d == null) {
                sb.append(" installationUuid");
            }
            if (this.f20742h == null) {
                sb.append(" buildVersion");
            }
            if (this.f20743i == null) {
                sb.append(" displayVersion");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // k4.F.b
        public F.b b(F.a aVar) {
            this.f20746l = aVar;
            return this;
        }

        @Override // k4.F.b
        public F.b c(String str) {
            this.f20741g = str;
            return this;
        }

        @Override // k4.F.b
        public F.b d(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildVersion");
            }
            this.f20742h = str;
            return this;
        }

        @Override // k4.F.b
        public F.b e(String str) {
            if (str == null) {
                throw new NullPointerException("Null displayVersion");
            }
            this.f20743i = str;
            return this;
        }

        @Override // k4.F.b
        public F.b f(String str) {
            this.f20740f = str;
            return this;
        }

        @Override // k4.F.b
        public F.b g(String str) {
            this.f20739e = str;
            return this;
        }

        @Override // k4.F.b
        public F.b h(String str) {
            if (str == null) {
                throw new NullPointerException("Null gmpAppId");
            }
            this.f20736b = str;
            return this;
        }

        @Override // k4.F.b
        public F.b i(String str) {
            if (str == null) {
                throw new NullPointerException("Null installationUuid");
            }
            this.f20738d = str;
            return this;
        }

        @Override // k4.F.b
        public F.b j(F.d dVar) {
            this.f20745k = dVar;
            return this;
        }

        @Override // k4.F.b
        public F.b k(int i7) {
            this.f20737c = i7;
            this.f20747m = (byte) (this.f20747m | 1);
            return this;
        }

        @Override // k4.F.b
        public F.b l(String str) {
            if (str == null) {
                throw new NullPointerException("Null sdkVersion");
            }
            this.f20735a = str;
            return this;
        }

        @Override // k4.F.b
        public F.b m(F.e eVar) {
            this.f20744j = eVar;
            return this;
        }

        private C0295b(F f7) {
            this.f20735a = f7.m();
            this.f20736b = f7.i();
            this.f20737c = f7.l();
            this.f20738d = f7.j();
            this.f20739e = f7.h();
            this.f20740f = f7.g();
            this.f20741g = f7.d();
            this.f20742h = f7.e();
            this.f20743i = f7.f();
            this.f20744j = f7.n();
            this.f20745k = f7.k();
            this.f20746l = f7.c();
            this.f20747m = (byte) 1;
        }
    }

    private C1828b(String str, String str2, int i7, String str3, String str4, String str5, String str6, String str7, String str8, F.e eVar, F.d dVar, F.a aVar) {
        this.f20723b = str;
        this.f20724c = str2;
        this.f20725d = i7;
        this.f20726e = str3;
        this.f20727f = str4;
        this.f20728g = str5;
        this.f20729h = str6;
        this.f20730i = str7;
        this.f20731j = str8;
        this.f20732k = eVar;
        this.f20733l = dVar;
        this.f20734m = aVar;
    }

    @Override // k4.F
    public F.a c() {
        return this.f20734m;
    }

    @Override // k4.F
    public String d() {
        return this.f20729h;
    }

    @Override // k4.F
    public String e() {
        return this.f20730i;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        F.e eVar;
        F.d dVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f7 = (F) obj;
        if (this.f20723b.equals(f7.m()) && this.f20724c.equals(f7.i()) && this.f20725d == f7.l() && this.f20726e.equals(f7.j()) && ((str = this.f20727f) != null ? str.equals(f7.h()) : f7.h() == null) && ((str2 = this.f20728g) != null ? str2.equals(f7.g()) : f7.g() == null) && ((str3 = this.f20729h) != null ? str3.equals(f7.d()) : f7.d() == null) && this.f20730i.equals(f7.e()) && this.f20731j.equals(f7.f()) && ((eVar = this.f20732k) != null ? eVar.equals(f7.n()) : f7.n() == null) && ((dVar = this.f20733l) != null ? dVar.equals(f7.k()) : f7.k() == null)) {
            F.a aVar = this.f20734m;
            F.a aVarC = f7.c();
            if (aVar == null) {
                if (aVarC == null) {
                    return true;
                }
            } else if (aVar.equals(aVarC)) {
                return true;
            }
        }
        return false;
    }

    @Override // k4.F
    public String f() {
        return this.f20731j;
    }

    @Override // k4.F
    public String g() {
        return this.f20728g;
    }

    @Override // k4.F
    public String h() {
        return this.f20727f;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f20723b.hashCode() ^ 1000003) * 1000003) ^ this.f20724c.hashCode()) * 1000003) ^ this.f20725d) * 1000003) ^ this.f20726e.hashCode()) * 1000003;
        String str = this.f20727f;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f20728g;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f20729h;
        int iHashCode4 = (((((iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.f20730i.hashCode()) * 1000003) ^ this.f20731j.hashCode()) * 1000003;
        F.e eVar = this.f20732k;
        int iHashCode5 = (iHashCode4 ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        F.d dVar = this.f20733l;
        int iHashCode6 = (iHashCode5 ^ (dVar == null ? 0 : dVar.hashCode())) * 1000003;
        F.a aVar = this.f20734m;
        return iHashCode6 ^ (aVar != null ? aVar.hashCode() : 0);
    }

    @Override // k4.F
    public String i() {
        return this.f20724c;
    }

    @Override // k4.F
    public String j() {
        return this.f20726e;
    }

    @Override // k4.F
    public F.d k() {
        return this.f20733l;
    }

    @Override // k4.F
    public int l() {
        return this.f20725d;
    }

    @Override // k4.F
    public String m() {
        return this.f20723b;
    }

    @Override // k4.F
    public F.e n() {
        return this.f20732k;
    }

    @Override // k4.F
    protected F.b o() {
        return new C0295b(this);
    }

    public String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f20723b + ", gmpAppId=" + this.f20724c + ", platform=" + this.f20725d + ", installationUuid=" + this.f20726e + ", firebaseInstallationId=" + this.f20727f + ", firebaseAuthenticationToken=" + this.f20728g + ", appQualitySessionId=" + this.f20729h + ", buildVersion=" + this.f20730i + ", displayVersion=" + this.f20731j + ", session=" + this.f20732k + ", ndkPayload=" + this.f20733l + ", appExitInfo=" + this.f20734m + "}";
    }
}
