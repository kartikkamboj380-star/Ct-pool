package k4;

import java.util.List;
import k4.F;

/* JADX INFO: renamed from: k4.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1829c extends F.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f20748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f20749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f20750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f20751d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f20752e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f20753f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f20754g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f20755h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f20756i;

    /* JADX INFO: renamed from: k4.c$b */
    static final class b extends F.a.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f20757a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f20758b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f20759c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f20760d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f20761e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f20762f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f20763g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f20764h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private List f20765i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private byte f20766j;

        b() {
        }

        @Override // k4.F.a.b
        public F.a a() {
            String str;
            if (this.f20766j == 63 && (str = this.f20758b) != null) {
                return new C1829c(this.f20757a, str, this.f20759c, this.f20760d, this.f20761e, this.f20762f, this.f20763g, this.f20764h, this.f20765i);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f20766j & 1) == 0) {
                sb.append(" pid");
            }
            if (this.f20758b == null) {
                sb.append(" processName");
            }
            if ((this.f20766j & 2) == 0) {
                sb.append(" reasonCode");
            }
            if ((this.f20766j & 4) == 0) {
                sb.append(" importance");
            }
            if ((this.f20766j & 8) == 0) {
                sb.append(" pss");
            }
            if ((this.f20766j & 16) == 0) {
                sb.append(" rss");
            }
            if ((this.f20766j & 32) == 0) {
                sb.append(" timestamp");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // k4.F.a.b
        public F.a.b b(List list) {
            this.f20765i = list;
            return this;
        }

        @Override // k4.F.a.b
        public F.a.b c(int i7) {
            this.f20760d = i7;
            this.f20766j = (byte) (this.f20766j | 4);
            return this;
        }

        @Override // k4.F.a.b
        public F.a.b d(int i7) {
            this.f20757a = i7;
            this.f20766j = (byte) (this.f20766j | 1);
            return this;
        }

        @Override // k4.F.a.b
        public F.a.b e(String str) {
            if (str == null) {
                throw new NullPointerException("Null processName");
            }
            this.f20758b = str;
            return this;
        }

        @Override // k4.F.a.b
        public F.a.b f(long j7) {
            this.f20761e = j7;
            this.f20766j = (byte) (this.f20766j | 8);
            return this;
        }

        @Override // k4.F.a.b
        public F.a.b g(int i7) {
            this.f20759c = i7;
            this.f20766j = (byte) (this.f20766j | 2);
            return this;
        }

        @Override // k4.F.a.b
        public F.a.b h(long j7) {
            this.f20762f = j7;
            this.f20766j = (byte) (this.f20766j | 16);
            return this;
        }

        @Override // k4.F.a.b
        public F.a.b i(long j7) {
            this.f20763g = j7;
            this.f20766j = (byte) (this.f20766j | 32);
            return this;
        }

        @Override // k4.F.a.b
        public F.a.b j(String str) {
            this.f20764h = str;
            return this;
        }
    }

    private C1829c(int i7, String str, int i8, int i9, long j7, long j8, long j9, String str2, List list) {
        this.f20748a = i7;
        this.f20749b = str;
        this.f20750c = i8;
        this.f20751d = i9;
        this.f20752e = j7;
        this.f20753f = j8;
        this.f20754g = j9;
        this.f20755h = str2;
        this.f20756i = list;
    }

    @Override // k4.F.a
    public List b() {
        return this.f20756i;
    }

    @Override // k4.F.a
    public int c() {
        return this.f20751d;
    }

    @Override // k4.F.a
    public int d() {
        return this.f20748a;
    }

    @Override // k4.F.a
    public String e() {
        return this.f20749b;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.a)) {
            return false;
        }
        F.a aVar = (F.a) obj;
        if (this.f20748a == aVar.d() && this.f20749b.equals(aVar.e()) && this.f20750c == aVar.g() && this.f20751d == aVar.c() && this.f20752e == aVar.f() && this.f20753f == aVar.h() && this.f20754g == aVar.i() && ((str = this.f20755h) != null ? str.equals(aVar.j()) : aVar.j() == null)) {
            List list = this.f20756i;
            List listB = aVar.b();
            if (list == null) {
                if (listB == null) {
                    return true;
                }
            } else if (list.equals(listB)) {
                return true;
            }
        }
        return false;
    }

    @Override // k4.F.a
    public long f() {
        return this.f20752e;
    }

    @Override // k4.F.a
    public int g() {
        return this.f20750c;
    }

    @Override // k4.F.a
    public long h() {
        return this.f20753f;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f20748a ^ 1000003) * 1000003) ^ this.f20749b.hashCode()) * 1000003) ^ this.f20750c) * 1000003) ^ this.f20751d) * 1000003;
        long j7 = this.f20752e;
        int i7 = (iHashCode ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003;
        long j8 = this.f20753f;
        int i8 = (i7 ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        long j9 = this.f20754g;
        int i9 = (i8 ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        String str = this.f20755h;
        int iHashCode2 = (i9 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f20756i;
        return iHashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    @Override // k4.F.a
    public long i() {
        return this.f20754g;
    }

    @Override // k4.F.a
    public String j() {
        return this.f20755h;
    }

    public String toString() {
        return "ApplicationExitInfo{pid=" + this.f20748a + ", processName=" + this.f20749b + ", reasonCode=" + this.f20750c + ", importance=" + this.f20751d + ", pss=" + this.f20752e + ", rss=" + this.f20753f + ", timestamp=" + this.f20754g + ", traceFile=" + this.f20755h + ", buildIdMappingForArch=" + this.f20756i + "}";
    }
}
