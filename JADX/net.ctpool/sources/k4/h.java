package k4;

import java.util.List;
import k4.F;

/* JADX INFO: loaded from: classes.dex */
final class h extends F.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f20785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f20786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f20787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f20788d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Long f20789e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f20790f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final F.e.a f20791g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final F.e.f f20792h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final F.e.AbstractC0293e f20793i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final F.e.c f20794j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List f20795k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f20796l;

    static final class b extends F.e.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f20797a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f20798b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f20799c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f20800d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Long f20801e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f20802f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private F.e.a f20803g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private F.e.f f20804h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private F.e.AbstractC0293e f20805i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private F.e.c f20806j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private List f20807k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f20808l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private byte f20809m;

        b() {
        }

        @Override // k4.F.e.b
        public F.e a() {
            String str;
            String str2;
            F.e.a aVar;
            if (this.f20809m == 7 && (str = this.f20797a) != null && (str2 = this.f20798b) != null && (aVar = this.f20803g) != null) {
                return new h(str, str2, this.f20799c, this.f20800d, this.f20801e, this.f20802f, aVar, this.f20804h, this.f20805i, this.f20806j, this.f20807k, this.f20808l);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f20797a == null) {
                sb.append(" generator");
            }
            if (this.f20798b == null) {
                sb.append(" identifier");
            }
            if ((this.f20809m & 1) == 0) {
                sb.append(" startedAt");
            }
            if ((this.f20809m & 2) == 0) {
                sb.append(" crashed");
            }
            if (this.f20803g == null) {
                sb.append(" app");
            }
            if ((this.f20809m & 4) == 0) {
                sb.append(" generatorType");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // k4.F.e.b
        public F.e.b b(F.e.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null app");
            }
            this.f20803g = aVar;
            return this;
        }

        @Override // k4.F.e.b
        public F.e.b c(String str) {
            this.f20799c = str;
            return this;
        }

        @Override // k4.F.e.b
        public F.e.b d(boolean z6) {
            this.f20802f = z6;
            this.f20809m = (byte) (this.f20809m | 2);
            return this;
        }

        @Override // k4.F.e.b
        public F.e.b e(F.e.c cVar) {
            this.f20806j = cVar;
            return this;
        }

        @Override // k4.F.e.b
        public F.e.b f(Long l7) {
            this.f20801e = l7;
            return this;
        }

        @Override // k4.F.e.b
        public F.e.b g(List list) {
            this.f20807k = list;
            return this;
        }

        @Override // k4.F.e.b
        public F.e.b h(String str) {
            if (str == null) {
                throw new NullPointerException("Null generator");
            }
            this.f20797a = str;
            return this;
        }

        @Override // k4.F.e.b
        public F.e.b i(int i7) {
            this.f20808l = i7;
            this.f20809m = (byte) (this.f20809m | 4);
            return this;
        }

        @Override // k4.F.e.b
        public F.e.b j(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f20798b = str;
            return this;
        }

        @Override // k4.F.e.b
        public F.e.b l(F.e.AbstractC0293e abstractC0293e) {
            this.f20805i = abstractC0293e;
            return this;
        }

        @Override // k4.F.e.b
        public F.e.b m(long j7) {
            this.f20800d = j7;
            this.f20809m = (byte) (this.f20809m | 1);
            return this;
        }

        @Override // k4.F.e.b
        public F.e.b n(F.e.f fVar) {
            this.f20804h = fVar;
            return this;
        }

        private b(F.e eVar) {
            this.f20797a = eVar.g();
            this.f20798b = eVar.i();
            this.f20799c = eVar.c();
            this.f20800d = eVar.l();
            this.f20801e = eVar.e();
            this.f20802f = eVar.n();
            this.f20803g = eVar.b();
            this.f20804h = eVar.m();
            this.f20805i = eVar.k();
            this.f20806j = eVar.d();
            this.f20807k = eVar.f();
            this.f20808l = eVar.h();
            this.f20809m = (byte) 7;
        }
    }

    private h(String str, String str2, String str3, long j7, Long l7, boolean z6, F.e.a aVar, F.e.f fVar, F.e.AbstractC0293e abstractC0293e, F.e.c cVar, List list, int i7) {
        this.f20785a = str;
        this.f20786b = str2;
        this.f20787c = str3;
        this.f20788d = j7;
        this.f20789e = l7;
        this.f20790f = z6;
        this.f20791g = aVar;
        this.f20792h = fVar;
        this.f20793i = abstractC0293e;
        this.f20794j = cVar;
        this.f20795k = list;
        this.f20796l = i7;
    }

    @Override // k4.F.e
    public F.e.a b() {
        return this.f20791g;
    }

    @Override // k4.F.e
    public String c() {
        return this.f20787c;
    }

    @Override // k4.F.e
    public F.e.c d() {
        return this.f20794j;
    }

    @Override // k4.F.e
    public Long e() {
        return this.f20789e;
    }

    public boolean equals(Object obj) {
        String str;
        Long l7;
        F.e.f fVar;
        F.e.AbstractC0293e abstractC0293e;
        F.e.c cVar;
        List list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e)) {
            return false;
        }
        F.e eVar = (F.e) obj;
        return this.f20785a.equals(eVar.g()) && this.f20786b.equals(eVar.i()) && ((str = this.f20787c) != null ? str.equals(eVar.c()) : eVar.c() == null) && this.f20788d == eVar.l() && ((l7 = this.f20789e) != null ? l7.equals(eVar.e()) : eVar.e() == null) && this.f20790f == eVar.n() && this.f20791g.equals(eVar.b()) && ((fVar = this.f20792h) != null ? fVar.equals(eVar.m()) : eVar.m() == null) && ((abstractC0293e = this.f20793i) != null ? abstractC0293e.equals(eVar.k()) : eVar.k() == null) && ((cVar = this.f20794j) != null ? cVar.equals(eVar.d()) : eVar.d() == null) && ((list = this.f20795k) != null ? list.equals(eVar.f()) : eVar.f() == null) && this.f20796l == eVar.h();
    }

    @Override // k4.F.e
    public List f() {
        return this.f20795k;
    }

    @Override // k4.F.e
    public String g() {
        return this.f20785a;
    }

    @Override // k4.F.e
    public int h() {
        return this.f20796l;
    }

    public int hashCode() {
        int iHashCode = (((this.f20785a.hashCode() ^ 1000003) * 1000003) ^ this.f20786b.hashCode()) * 1000003;
        String str = this.f20787c;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j7 = this.f20788d;
        int i7 = (((iHashCode ^ iHashCode2) * 1000003) ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003;
        Long l7 = this.f20789e;
        int iHashCode3 = (((((i7 ^ (l7 == null ? 0 : l7.hashCode())) * 1000003) ^ (this.f20790f ? 1231 : 1237)) * 1000003) ^ this.f20791g.hashCode()) * 1000003;
        F.e.f fVar = this.f20792h;
        int iHashCode4 = (iHashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        F.e.AbstractC0293e abstractC0293e = this.f20793i;
        int iHashCode5 = (iHashCode4 ^ (abstractC0293e == null ? 0 : abstractC0293e.hashCode())) * 1000003;
        F.e.c cVar = this.f20794j;
        int iHashCode6 = (iHashCode5 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        List list = this.f20795k;
        return ((iHashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003) ^ this.f20796l;
    }

    @Override // k4.F.e
    public String i() {
        return this.f20786b;
    }

    @Override // k4.F.e
    public F.e.AbstractC0293e k() {
        return this.f20793i;
    }

    @Override // k4.F.e
    public long l() {
        return this.f20788d;
    }

    @Override // k4.F.e
    public F.e.f m() {
        return this.f20792h;
    }

    @Override // k4.F.e
    public boolean n() {
        return this.f20790f;
    }

    @Override // k4.F.e
    public F.e.b o() {
        return new b(this);
    }

    public String toString() {
        return "Session{generator=" + this.f20785a + ", identifier=" + this.f20786b + ", appQualitySessionId=" + this.f20787c + ", startedAt=" + this.f20788d + ", endedAt=" + this.f20789e + ", crashed=" + this.f20790f + ", app=" + this.f20791g + ", user=" + this.f20792h + ", os=" + this.f20793i + ", device=" + this.f20794j + ", events=" + this.f20795k + ", generatorType=" + this.f20796l + "}";
    }
}
