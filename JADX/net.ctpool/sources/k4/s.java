package k4;

import k4.F;

/* JADX INFO: loaded from: classes.dex */
final class s extends F.e.d.a.b.AbstractC0286e.AbstractC0288b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f20913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f20914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f20915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f20916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f20917e;

    static final class b extends F.e.d.a.b.AbstractC0286e.AbstractC0288b.AbstractC0289a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f20918a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f20919b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f20920c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f20921d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f20922e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private byte f20923f;

        b() {
        }

        @Override // k4.F.e.d.a.b.AbstractC0286e.AbstractC0288b.AbstractC0289a
        public F.e.d.a.b.AbstractC0286e.AbstractC0288b a() {
            String str;
            if (this.f20923f == 7 && (str = this.f20919b) != null) {
                return new s(this.f20918a, str, this.f20920c, this.f20921d, this.f20922e);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f20923f & 1) == 0) {
                sb.append(" pc");
            }
            if (this.f20919b == null) {
                sb.append(" symbol");
            }
            if ((this.f20923f & 2) == 0) {
                sb.append(" offset");
            }
            if ((this.f20923f & 4) == 0) {
                sb.append(" importance");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // k4.F.e.d.a.b.AbstractC0286e.AbstractC0288b.AbstractC0289a
        public F.e.d.a.b.AbstractC0286e.AbstractC0288b.AbstractC0289a b(String str) {
            this.f20920c = str;
            return this;
        }

        @Override // k4.F.e.d.a.b.AbstractC0286e.AbstractC0288b.AbstractC0289a
        public F.e.d.a.b.AbstractC0286e.AbstractC0288b.AbstractC0289a c(int i7) {
            this.f20922e = i7;
            this.f20923f = (byte) (this.f20923f | 4);
            return this;
        }

        @Override // k4.F.e.d.a.b.AbstractC0286e.AbstractC0288b.AbstractC0289a
        public F.e.d.a.b.AbstractC0286e.AbstractC0288b.AbstractC0289a d(long j7) {
            this.f20921d = j7;
            this.f20923f = (byte) (this.f20923f | 2);
            return this;
        }

        @Override // k4.F.e.d.a.b.AbstractC0286e.AbstractC0288b.AbstractC0289a
        public F.e.d.a.b.AbstractC0286e.AbstractC0288b.AbstractC0289a e(long j7) {
            this.f20918a = j7;
            this.f20923f = (byte) (this.f20923f | 1);
            return this;
        }

        @Override // k4.F.e.d.a.b.AbstractC0286e.AbstractC0288b.AbstractC0289a
        public F.e.d.a.b.AbstractC0286e.AbstractC0288b.AbstractC0289a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            this.f20919b = str;
            return this;
        }
    }

    private s(long j7, String str, String str2, long j8, int i7) {
        this.f20913a = j7;
        this.f20914b = str;
        this.f20915c = str2;
        this.f20916d = j8;
        this.f20917e = i7;
    }

    @Override // k4.F.e.d.a.b.AbstractC0286e.AbstractC0288b
    public String b() {
        return this.f20915c;
    }

    @Override // k4.F.e.d.a.b.AbstractC0286e.AbstractC0288b
    public int c() {
        return this.f20917e;
    }

    @Override // k4.F.e.d.a.b.AbstractC0286e.AbstractC0288b
    public long d() {
        return this.f20916d;
    }

    @Override // k4.F.e.d.a.b.AbstractC0286e.AbstractC0288b
    public long e() {
        return this.f20913a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d.a.b.AbstractC0286e.AbstractC0288b)) {
            return false;
        }
        F.e.d.a.b.AbstractC0286e.AbstractC0288b abstractC0288b = (F.e.d.a.b.AbstractC0286e.AbstractC0288b) obj;
        return this.f20913a == abstractC0288b.e() && this.f20914b.equals(abstractC0288b.f()) && ((str = this.f20915c) != null ? str.equals(abstractC0288b.b()) : abstractC0288b.b() == null) && this.f20916d == abstractC0288b.d() && this.f20917e == abstractC0288b.c();
    }

    @Override // k4.F.e.d.a.b.AbstractC0286e.AbstractC0288b
    public String f() {
        return this.f20914b;
    }

    public int hashCode() {
        long j7 = this.f20913a;
        int iHashCode = (((((int) (j7 ^ (j7 >>> 32))) ^ 1000003) * 1000003) ^ this.f20914b.hashCode()) * 1000003;
        String str = this.f20915c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j8 = this.f20916d;
        return ((iHashCode2 ^ ((int) ((j8 >>> 32) ^ j8))) * 1000003) ^ this.f20917e;
    }

    public String toString() {
        return "Frame{pc=" + this.f20913a + ", symbol=" + this.f20914b + ", file=" + this.f20915c + ", offset=" + this.f20916d + ", importance=" + this.f20917e + "}";
    }
}
