package k4;

import k4.F;

/* JADX INFO: loaded from: classes.dex */
final class q extends F.e.d.a.b.AbstractC0284d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f20899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f20900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f20901c;

    static final class b extends F.e.d.a.b.AbstractC0284d.AbstractC0285a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f20902a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f20903b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f20904c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte f20905d;

        b() {
        }

        @Override // k4.F.e.d.a.b.AbstractC0284d.AbstractC0285a
        public F.e.d.a.b.AbstractC0284d a() {
            String str;
            String str2;
            if (this.f20905d == 1 && (str = this.f20902a) != null && (str2 = this.f20903b) != null) {
                return new q(str, str2, this.f20904c);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f20902a == null) {
                sb.append(" name");
            }
            if (this.f20903b == null) {
                sb.append(" code");
            }
            if ((1 & this.f20905d) == 0) {
                sb.append(" address");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // k4.F.e.d.a.b.AbstractC0284d.AbstractC0285a
        public F.e.d.a.b.AbstractC0284d.AbstractC0285a b(long j7) {
            this.f20904c = j7;
            this.f20905d = (byte) (this.f20905d | 1);
            return this;
        }

        @Override // k4.F.e.d.a.b.AbstractC0284d.AbstractC0285a
        public F.e.d.a.b.AbstractC0284d.AbstractC0285a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null code");
            }
            this.f20903b = str;
            return this;
        }

        @Override // k4.F.e.d.a.b.AbstractC0284d.AbstractC0285a
        public F.e.d.a.b.AbstractC0284d.AbstractC0285a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f20902a = str;
            return this;
        }
    }

    private q(String str, String str2, long j7) {
        this.f20899a = str;
        this.f20900b = str2;
        this.f20901c = j7;
    }

    @Override // k4.F.e.d.a.b.AbstractC0284d
    public long b() {
        return this.f20901c;
    }

    @Override // k4.F.e.d.a.b.AbstractC0284d
    public String c() {
        return this.f20900b;
    }

    @Override // k4.F.e.d.a.b.AbstractC0284d
    public String d() {
        return this.f20899a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d.a.b.AbstractC0284d)) {
            return false;
        }
        F.e.d.a.b.AbstractC0284d abstractC0284d = (F.e.d.a.b.AbstractC0284d) obj;
        return this.f20899a.equals(abstractC0284d.d()) && this.f20900b.equals(abstractC0284d.c()) && this.f20901c == abstractC0284d.b();
    }

    public int hashCode() {
        int iHashCode = (((this.f20899a.hashCode() ^ 1000003) * 1000003) ^ this.f20900b.hashCode()) * 1000003;
        long j7 = this.f20901c;
        return iHashCode ^ ((int) (j7 ^ (j7 >>> 32)));
    }

    public String toString() {
        return "Signal{name=" + this.f20899a + ", code=" + this.f20900b + ", address=" + this.f20901c + "}";
    }
}
