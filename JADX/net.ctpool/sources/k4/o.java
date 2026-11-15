package k4;

import k4.F;

/* JADX INFO: loaded from: classes.dex */
final class o extends F.e.d.a.b.AbstractC0280a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f20879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f20880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f20881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f20882d;

    static final class b extends F.e.d.a.b.AbstractC0280a.AbstractC0281a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f20883a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f20884b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f20885c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f20886d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private byte f20887e;

        b() {
        }

        @Override // k4.F.e.d.a.b.AbstractC0280a.AbstractC0281a
        public F.e.d.a.b.AbstractC0280a a() {
            String str;
            if (this.f20887e == 3 && (str = this.f20885c) != null) {
                return new o(this.f20883a, this.f20884b, str, this.f20886d);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f20887e & 1) == 0) {
                sb.append(" baseAddress");
            }
            if ((this.f20887e & 2) == 0) {
                sb.append(" size");
            }
            if (this.f20885c == null) {
                sb.append(" name");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // k4.F.e.d.a.b.AbstractC0280a.AbstractC0281a
        public F.e.d.a.b.AbstractC0280a.AbstractC0281a b(long j7) {
            this.f20883a = j7;
            this.f20887e = (byte) (this.f20887e | 1);
            return this;
        }

        @Override // k4.F.e.d.a.b.AbstractC0280a.AbstractC0281a
        public F.e.d.a.b.AbstractC0280a.AbstractC0281a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f20885c = str;
            return this;
        }

        @Override // k4.F.e.d.a.b.AbstractC0280a.AbstractC0281a
        public F.e.d.a.b.AbstractC0280a.AbstractC0281a d(long j7) {
            this.f20884b = j7;
            this.f20887e = (byte) (this.f20887e | 2);
            return this;
        }

        @Override // k4.F.e.d.a.b.AbstractC0280a.AbstractC0281a
        public F.e.d.a.b.AbstractC0280a.AbstractC0281a e(String str) {
            this.f20886d = str;
            return this;
        }
    }

    private o(long j7, long j8, String str, String str2) {
        this.f20879a = j7;
        this.f20880b = j8;
        this.f20881c = str;
        this.f20882d = str2;
    }

    @Override // k4.F.e.d.a.b.AbstractC0280a
    public long b() {
        return this.f20879a;
    }

    @Override // k4.F.e.d.a.b.AbstractC0280a
    public String c() {
        return this.f20881c;
    }

    @Override // k4.F.e.d.a.b.AbstractC0280a
    public long d() {
        return this.f20880b;
    }

    @Override // k4.F.e.d.a.b.AbstractC0280a
    public String e() {
        return this.f20882d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d.a.b.AbstractC0280a)) {
            return false;
        }
        F.e.d.a.b.AbstractC0280a abstractC0280a = (F.e.d.a.b.AbstractC0280a) obj;
        if (this.f20879a == abstractC0280a.b() && this.f20880b == abstractC0280a.d() && this.f20881c.equals(abstractC0280a.c())) {
            String str = this.f20882d;
            String strE = abstractC0280a.e();
            if (str == null) {
                if (strE == null) {
                    return true;
                }
            } else if (str.equals(strE)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j7 = this.f20879a;
        long j8 = this.f20880b;
        int iHashCode = (((((((int) (j7 ^ (j7 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j8 >>> 32) ^ j8))) * 1000003) ^ this.f20881c.hashCode()) * 1000003;
        String str = this.f20882d;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "BinaryImage{baseAddress=" + this.f20879a + ", size=" + this.f20880b + ", name=" + this.f20881c + ", uuid=" + this.f20882d + "}";
    }
}
