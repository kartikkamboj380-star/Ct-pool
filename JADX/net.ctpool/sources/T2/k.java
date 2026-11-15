package T2;

import T2.u;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class k extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f3123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f3124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o f3125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Integer f3126d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f3127e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f3128f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final x f3129g;

    static final class b extends u.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f3130a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Long f3131b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private o f3132c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f3133d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f3134e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List f3135f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private x f3136g;

        b() {
        }

        @Override // T2.u.a
        public u a() {
            String str = "";
            if (this.f3130a == null) {
                str = " requestTimeMs";
            }
            if (this.f3131b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new k(this.f3130a.longValue(), this.f3131b.longValue(), this.f3132c, this.f3133d, this.f3134e, this.f3135f, this.f3136g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // T2.u.a
        public u.a b(o oVar) {
            this.f3132c = oVar;
            return this;
        }

        @Override // T2.u.a
        public u.a c(List list) {
            this.f3135f = list;
            return this;
        }

        @Override // T2.u.a
        u.a d(Integer num) {
            this.f3133d = num;
            return this;
        }

        @Override // T2.u.a
        u.a e(String str) {
            this.f3134e = str;
            return this;
        }

        @Override // T2.u.a
        public u.a f(x xVar) {
            this.f3136g = xVar;
            return this;
        }

        @Override // T2.u.a
        public u.a g(long j7) {
            this.f3130a = Long.valueOf(j7);
            return this;
        }

        @Override // T2.u.a
        public u.a h(long j7) {
            this.f3131b = Long.valueOf(j7);
            return this;
        }
    }

    private k(long j7, long j8, o oVar, Integer num, String str, List list, x xVar) {
        this.f3123a = j7;
        this.f3124b = j8;
        this.f3125c = oVar;
        this.f3126d = num;
        this.f3127e = str;
        this.f3128f = list;
        this.f3129g = xVar;
    }

    @Override // T2.u
    public o b() {
        return this.f3125c;
    }

    @Override // T2.u
    public List c() {
        return this.f3128f;
    }

    @Override // T2.u
    public Integer d() {
        return this.f3126d;
    }

    @Override // T2.u
    public String e() {
        return this.f3127e;
    }

    public boolean equals(Object obj) {
        o oVar;
        Integer num;
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f3123a == uVar.g() && this.f3124b == uVar.h() && ((oVar = this.f3125c) != null ? oVar.equals(uVar.b()) : uVar.b() == null) && ((num = this.f3126d) != null ? num.equals(uVar.d()) : uVar.d() == null) && ((str = this.f3127e) != null ? str.equals(uVar.e()) : uVar.e() == null) && ((list = this.f3128f) != null ? list.equals(uVar.c()) : uVar.c() == null)) {
            x xVar = this.f3129g;
            x xVarF = uVar.f();
            if (xVar == null) {
                if (xVarF == null) {
                    return true;
                }
            } else if (xVar.equals(xVarF)) {
                return true;
            }
        }
        return false;
    }

    @Override // T2.u
    public x f() {
        return this.f3129g;
    }

    @Override // T2.u
    public long g() {
        return this.f3123a;
    }

    @Override // T2.u
    public long h() {
        return this.f3124b;
    }

    public int hashCode() {
        long j7 = this.f3123a;
        long j8 = this.f3124b;
        int i7 = (((((int) (j7 ^ (j7 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j8 >>> 32) ^ j8))) * 1000003;
        o oVar = this.f3125c;
        int iHashCode = (i7 ^ (oVar == null ? 0 : oVar.hashCode())) * 1000003;
        Integer num = this.f3126d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f3127e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f3128f;
        int iHashCode4 = (iHashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        x xVar = this.f3129g;
        return iHashCode4 ^ (xVar != null ? xVar.hashCode() : 0);
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f3123a + ", requestUptimeMs=" + this.f3124b + ", clientInfo=" + this.f3125c + ", logSource=" + this.f3126d + ", logSourceName=" + this.f3127e + ", logEvents=" + this.f3128f + ", qosTier=" + this.f3129g + "}";
    }
}
