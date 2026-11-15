package T2;

import T2.a;

/* JADX INFO: loaded from: classes.dex */
final class c extends T2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Integer f3064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f3065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f3066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f3067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f3068e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f3069f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f3070g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f3071h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f3072i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f3073j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f3074k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f3075l;

    static final class b extends a.AbstractC0070a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Integer f3076a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f3077b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f3078c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f3079d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f3080e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f3081f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f3082g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f3083h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f3084i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private String f3085j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private String f3086k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private String f3087l;

        b() {
        }

        @Override // T2.a.AbstractC0070a
        public T2.a a() {
            return new c(this.f3076a, this.f3077b, this.f3078c, this.f3079d, this.f3080e, this.f3081f, this.f3082g, this.f3083h, this.f3084i, this.f3085j, this.f3086k, this.f3087l);
        }

        @Override // T2.a.AbstractC0070a
        public a.AbstractC0070a b(String str) {
            this.f3087l = str;
            return this;
        }

        @Override // T2.a.AbstractC0070a
        public a.AbstractC0070a c(String str) {
            this.f3085j = str;
            return this;
        }

        @Override // T2.a.AbstractC0070a
        public a.AbstractC0070a d(String str) {
            this.f3079d = str;
            return this;
        }

        @Override // T2.a.AbstractC0070a
        public a.AbstractC0070a e(String str) {
            this.f3083h = str;
            return this;
        }

        @Override // T2.a.AbstractC0070a
        public a.AbstractC0070a f(String str) {
            this.f3078c = str;
            return this;
        }

        @Override // T2.a.AbstractC0070a
        public a.AbstractC0070a g(String str) {
            this.f3084i = str;
            return this;
        }

        @Override // T2.a.AbstractC0070a
        public a.AbstractC0070a h(String str) {
            this.f3082g = str;
            return this;
        }

        @Override // T2.a.AbstractC0070a
        public a.AbstractC0070a i(String str) {
            this.f3086k = str;
            return this;
        }

        @Override // T2.a.AbstractC0070a
        public a.AbstractC0070a j(String str) {
            this.f3077b = str;
            return this;
        }

        @Override // T2.a.AbstractC0070a
        public a.AbstractC0070a k(String str) {
            this.f3081f = str;
            return this;
        }

        @Override // T2.a.AbstractC0070a
        public a.AbstractC0070a l(String str) {
            this.f3080e = str;
            return this;
        }

        @Override // T2.a.AbstractC0070a
        public a.AbstractC0070a m(Integer num) {
            this.f3076a = num;
            return this;
        }
    }

    private c(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f3064a = num;
        this.f3065b = str;
        this.f3066c = str2;
        this.f3067d = str3;
        this.f3068e = str4;
        this.f3069f = str5;
        this.f3070g = str6;
        this.f3071h = str7;
        this.f3072i = str8;
        this.f3073j = str9;
        this.f3074k = str10;
        this.f3075l = str11;
    }

    @Override // T2.a
    public String b() {
        return this.f3075l;
    }

    @Override // T2.a
    public String c() {
        return this.f3073j;
    }

    @Override // T2.a
    public String d() {
        return this.f3067d;
    }

    @Override // T2.a
    public String e() {
        return this.f3071h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof T2.a)) {
            return false;
        }
        T2.a aVar = (T2.a) obj;
        Integer num = this.f3064a;
        if (num != null ? num.equals(aVar.m()) : aVar.m() == null) {
            String str = this.f3065b;
            if (str != null ? str.equals(aVar.j()) : aVar.j() == null) {
                String str2 = this.f3066c;
                if (str2 != null ? str2.equals(aVar.f()) : aVar.f() == null) {
                    String str3 = this.f3067d;
                    if (str3 != null ? str3.equals(aVar.d()) : aVar.d() == null) {
                        String str4 = this.f3068e;
                        if (str4 != null ? str4.equals(aVar.l()) : aVar.l() == null) {
                            String str5 = this.f3069f;
                            if (str5 != null ? str5.equals(aVar.k()) : aVar.k() == null) {
                                String str6 = this.f3070g;
                                if (str6 != null ? str6.equals(aVar.h()) : aVar.h() == null) {
                                    String str7 = this.f3071h;
                                    if (str7 != null ? str7.equals(aVar.e()) : aVar.e() == null) {
                                        String str8 = this.f3072i;
                                        if (str8 != null ? str8.equals(aVar.g()) : aVar.g() == null) {
                                            String str9 = this.f3073j;
                                            if (str9 != null ? str9.equals(aVar.c()) : aVar.c() == null) {
                                                String str10 = this.f3074k;
                                                if (str10 != null ? str10.equals(aVar.i()) : aVar.i() == null) {
                                                    String str11 = this.f3075l;
                                                    String strB = aVar.b();
                                                    if (str11 == null) {
                                                        if (strB == null) {
                                                            return true;
                                                        }
                                                    } else if (str11.equals(strB)) {
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // T2.a
    public String f() {
        return this.f3066c;
    }

    @Override // T2.a
    public String g() {
        return this.f3072i;
    }

    @Override // T2.a
    public String h() {
        return this.f3070g;
    }

    public int hashCode() {
        Integer num = this.f3064a;
        int iHashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f3065b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f3066c;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f3067d;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f3068e;
        int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f3069f;
        int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f3070g;
        int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f3071h;
        int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.f3072i;
        int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.f3073j;
        int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.f3074k;
        int iHashCode11 = (iHashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f3075l;
        return iHashCode11 ^ (str11 != null ? str11.hashCode() : 0);
    }

    @Override // T2.a
    public String i() {
        return this.f3074k;
    }

    @Override // T2.a
    public String j() {
        return this.f3065b;
    }

    @Override // T2.a
    public String k() {
        return this.f3069f;
    }

    @Override // T2.a
    public String l() {
        return this.f3068e;
    }

    @Override // T2.a
    public Integer m() {
        return this.f3064a;
    }

    public String toString() {
        return "AndroidClientInfo{sdkVersion=" + this.f3064a + ", model=" + this.f3065b + ", hardware=" + this.f3066c + ", device=" + this.f3067d + ", product=" + this.f3068e + ", osBuild=" + this.f3069f + ", manufacturer=" + this.f3070g + ", fingerprint=" + this.f3071h + ", locale=" + this.f3072i + ", country=" + this.f3073j + ", mccMnc=" + this.f3074k + ", applicationBuild=" + this.f3075l + "}";
    }
}
