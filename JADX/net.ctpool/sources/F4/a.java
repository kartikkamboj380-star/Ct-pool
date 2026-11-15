package F4;

import F4.c;
import F4.d;

/* JADX INFO: loaded from: classes.dex */
final class a extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f1077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c.a f1078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f1079d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f1080e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f1081f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f1082g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f1083h;

    static final class b extends d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f1084a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private c.a f1085b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f1086c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f1087d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Long f1088e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Long f1089f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f1090g;

        b() {
        }

        @Override // F4.d.a
        public d a() {
            String str = "";
            if (this.f1085b == null) {
                str = " registrationStatus";
            }
            if (this.f1088e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f1089f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new a(this.f1084a, this.f1085b, this.f1086c, this.f1087d, this.f1088e.longValue(), this.f1089f.longValue(), this.f1090g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // F4.d.a
        public d.a b(String str) {
            this.f1086c = str;
            return this;
        }

        @Override // F4.d.a
        public d.a c(long j7) {
            this.f1088e = Long.valueOf(j7);
            return this;
        }

        @Override // F4.d.a
        public d.a d(String str) {
            this.f1084a = str;
            return this;
        }

        @Override // F4.d.a
        public d.a e(String str) {
            this.f1090g = str;
            return this;
        }

        @Override // F4.d.a
        public d.a f(String str) {
            this.f1087d = str;
            return this;
        }

        @Override // F4.d.a
        public d.a g(c.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null registrationStatus");
            }
            this.f1085b = aVar;
            return this;
        }

        @Override // F4.d.a
        public d.a h(long j7) {
            this.f1089f = Long.valueOf(j7);
            return this;
        }

        private b(d dVar) {
            this.f1084a = dVar.d();
            this.f1085b = dVar.g();
            this.f1086c = dVar.b();
            this.f1087d = dVar.f();
            this.f1088e = Long.valueOf(dVar.c());
            this.f1089f = Long.valueOf(dVar.h());
            this.f1090g = dVar.e();
        }
    }

    private a(String str, c.a aVar, String str2, String str3, long j7, long j8, String str4) {
        this.f1077b = str;
        this.f1078c = aVar;
        this.f1079d = str2;
        this.f1080e = str3;
        this.f1081f = j7;
        this.f1082g = j8;
        this.f1083h = str4;
    }

    @Override // F4.d
    public String b() {
        return this.f1079d;
    }

    @Override // F4.d
    public long c() {
        return this.f1081f;
    }

    @Override // F4.d
    public String d() {
        return this.f1077b;
    }

    @Override // F4.d
    public String e() {
        return this.f1083h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str3 = this.f1077b;
        if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
            if (this.f1078c.equals(dVar.g()) && ((str = this.f1079d) != null ? str.equals(dVar.b()) : dVar.b() == null) && ((str2 = this.f1080e) != null ? str2.equals(dVar.f()) : dVar.f() == null) && this.f1081f == dVar.c() && this.f1082g == dVar.h()) {
                String str4 = this.f1083h;
                String strE = dVar.e();
                if (str4 == null) {
                    if (strE == null) {
                        return true;
                    }
                } else if (str4.equals(strE)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // F4.d
    public String f() {
        return this.f1080e;
    }

    @Override // F4.d
    public c.a g() {
        return this.f1078c;
    }

    @Override // F4.d
    public long h() {
        return this.f1082g;
    }

    public int hashCode() {
        String str = this.f1077b;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f1078c.hashCode()) * 1000003;
        String str2 = this.f1079d;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f1080e;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j7 = this.f1081f;
        int i7 = (iHashCode3 ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003;
        long j8 = this.f1082g;
        int i8 = (i7 ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        String str4 = this.f1083h;
        return i8 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // F4.d
    public d.a n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f1077b + ", registrationStatus=" + this.f1078c + ", authToken=" + this.f1079d + ", refreshToken=" + this.f1080e + ", expiresInSecs=" + this.f1081f + ", tokenCreationEpochInSecs=" + this.f1082g + ", fisError=" + this.f1083h + "}";
    }
}
