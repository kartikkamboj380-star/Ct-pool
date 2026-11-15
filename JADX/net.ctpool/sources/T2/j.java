package T2;

import T2.t;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class j extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f3105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f3106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p f3107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f3108d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f3109e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f3110f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f3111g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final w f3112h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final q f3113i;

    static final class b extends t.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f3114a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f3115b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private p f3116c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Long f3117d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private byte[] f3118e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f3119f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Long f3120g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private w f3121h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private q f3122i;

        b() {
        }

        @Override // T2.t.a
        public t a() {
            String str = "";
            if (this.f3114a == null) {
                str = " eventTimeMs";
            }
            if (this.f3117d == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f3120g == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new j(this.f3114a.longValue(), this.f3115b, this.f3116c, this.f3117d.longValue(), this.f3118e, this.f3119f, this.f3120g.longValue(), this.f3121h, this.f3122i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // T2.t.a
        public t.a b(p pVar) {
            this.f3116c = pVar;
            return this;
        }

        @Override // T2.t.a
        public t.a c(Integer num) {
            this.f3115b = num;
            return this;
        }

        @Override // T2.t.a
        public t.a d(long j7) {
            this.f3114a = Long.valueOf(j7);
            return this;
        }

        @Override // T2.t.a
        public t.a e(long j7) {
            this.f3117d = Long.valueOf(j7);
            return this;
        }

        @Override // T2.t.a
        public t.a f(q qVar) {
            this.f3122i = qVar;
            return this;
        }

        @Override // T2.t.a
        public t.a g(w wVar) {
            this.f3121h = wVar;
            return this;
        }

        @Override // T2.t.a
        t.a h(byte[] bArr) {
            this.f3118e = bArr;
            return this;
        }

        @Override // T2.t.a
        t.a i(String str) {
            this.f3119f = str;
            return this;
        }

        @Override // T2.t.a
        public t.a j(long j7) {
            this.f3120g = Long.valueOf(j7);
            return this;
        }
    }

    private j(long j7, Integer num, p pVar, long j8, byte[] bArr, String str, long j9, w wVar, q qVar) {
        this.f3105a = j7;
        this.f3106b = num;
        this.f3107c = pVar;
        this.f3108d = j8;
        this.f3109e = bArr;
        this.f3110f = str;
        this.f3111g = j9;
        this.f3112h = wVar;
        this.f3113i = qVar;
    }

    @Override // T2.t
    public p b() {
        return this.f3107c;
    }

    @Override // T2.t
    public Integer c() {
        return this.f3106b;
    }

    @Override // T2.t
    public long d() {
        return this.f3105a;
    }

    @Override // T2.t
    public long e() {
        return this.f3108d;
    }

    public boolean equals(Object obj) {
        Integer num;
        p pVar;
        String str;
        w wVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (this.f3105a == tVar.d() && ((num = this.f3106b) != null ? num.equals(tVar.c()) : tVar.c() == null) && ((pVar = this.f3107c) != null ? pVar.equals(tVar.b()) : tVar.b() == null) && this.f3108d == tVar.e()) {
            if (Arrays.equals(this.f3109e, tVar instanceof j ? ((j) tVar).f3109e : tVar.h()) && ((str = this.f3110f) != null ? str.equals(tVar.i()) : tVar.i() == null) && this.f3111g == tVar.j() && ((wVar = this.f3112h) != null ? wVar.equals(tVar.g()) : tVar.g() == null)) {
                q qVar = this.f3113i;
                q qVarF = tVar.f();
                if (qVar == null) {
                    if (qVarF == null) {
                        return true;
                    }
                } else if (qVar.equals(qVarF)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // T2.t
    public q f() {
        return this.f3113i;
    }

    @Override // T2.t
    public w g() {
        return this.f3112h;
    }

    @Override // T2.t
    public byte[] h() {
        return this.f3109e;
    }

    public int hashCode() {
        long j7 = this.f3105a;
        int i7 = (((int) (j7 ^ (j7 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f3106b;
        int iHashCode = (i7 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        p pVar = this.f3107c;
        int iHashCode2 = pVar == null ? 0 : pVar.hashCode();
        long j8 = this.f3108d;
        int iHashCode3 = (((((iHashCode ^ iHashCode2) * 1000003) ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f3109e)) * 1000003;
        String str = this.f3110f;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        long j9 = this.f3111g;
        int i8 = (((iHashCode3 ^ iHashCode4) * 1000003) ^ ((int) ((j9 >>> 32) ^ j9))) * 1000003;
        w wVar = this.f3112h;
        int iHashCode5 = (i8 ^ (wVar == null ? 0 : wVar.hashCode())) * 1000003;
        q qVar = this.f3113i;
        return iHashCode5 ^ (qVar != null ? qVar.hashCode() : 0);
    }

    @Override // T2.t
    public String i() {
        return this.f3110f;
    }

    @Override // T2.t
    public long j() {
        return this.f3111g;
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f3105a + ", eventCode=" + this.f3106b + ", complianceData=" + this.f3107c + ", eventUptimeMs=" + this.f3108d + ", sourceExtension=" + Arrays.toString(this.f3109e) + ", sourceExtensionJsonProto3=" + this.f3110f + ", timezoneOffsetSeconds=" + this.f3111g + ", networkConnectionInfo=" + this.f3112h + ", experimentIds=" + this.f3113i + "}";
    }
}
