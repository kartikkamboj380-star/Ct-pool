package k4;

import k4.F;

/* JADX INFO: loaded from: classes.dex */
final class u extends F.e.d.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Double f20933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f20934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f20935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f20936d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f20937e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f20938f;

    static final class b extends F.e.d.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Double f20939a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f20940b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f20941c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f20942d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f20943e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f20944f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private byte f20945g;

        b() {
        }

        @Override // k4.F.e.d.c.a
        public F.e.d.c a() {
            if (this.f20945g == 31) {
                return new u(this.f20939a, this.f20940b, this.f20941c, this.f20942d, this.f20943e, this.f20944f);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f20945g & 1) == 0) {
                sb.append(" batteryVelocity");
            }
            if ((this.f20945g & 2) == 0) {
                sb.append(" proximityOn");
            }
            if ((this.f20945g & 4) == 0) {
                sb.append(" orientation");
            }
            if ((this.f20945g & 8) == 0) {
                sb.append(" ramUsed");
            }
            if ((this.f20945g & 16) == 0) {
                sb.append(" diskUsed");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // k4.F.e.d.c.a
        public F.e.d.c.a b(Double d7) {
            this.f20939a = d7;
            return this;
        }

        @Override // k4.F.e.d.c.a
        public F.e.d.c.a c(int i7) {
            this.f20940b = i7;
            this.f20945g = (byte) (this.f20945g | 1);
            return this;
        }

        @Override // k4.F.e.d.c.a
        public F.e.d.c.a d(long j7) {
            this.f20944f = j7;
            this.f20945g = (byte) (this.f20945g | 16);
            return this;
        }

        @Override // k4.F.e.d.c.a
        public F.e.d.c.a e(int i7) {
            this.f20942d = i7;
            this.f20945g = (byte) (this.f20945g | 4);
            return this;
        }

        @Override // k4.F.e.d.c.a
        public F.e.d.c.a f(boolean z6) {
            this.f20941c = z6;
            this.f20945g = (byte) (this.f20945g | 2);
            return this;
        }

        @Override // k4.F.e.d.c.a
        public F.e.d.c.a g(long j7) {
            this.f20943e = j7;
            this.f20945g = (byte) (this.f20945g | 8);
            return this;
        }
    }

    private u(Double d7, int i7, boolean z6, int i8, long j7, long j8) {
        this.f20933a = d7;
        this.f20934b = i7;
        this.f20935c = z6;
        this.f20936d = i8;
        this.f20937e = j7;
        this.f20938f = j8;
    }

    @Override // k4.F.e.d.c
    public Double b() {
        return this.f20933a;
    }

    @Override // k4.F.e.d.c
    public int c() {
        return this.f20934b;
    }

    @Override // k4.F.e.d.c
    public long d() {
        return this.f20938f;
    }

    @Override // k4.F.e.d.c
    public int e() {
        return this.f20936d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d.c)) {
            return false;
        }
        F.e.d.c cVar = (F.e.d.c) obj;
        Double d7 = this.f20933a;
        if (d7 != null ? d7.equals(cVar.b()) : cVar.b() == null) {
            if (this.f20934b == cVar.c() && this.f20935c == cVar.g() && this.f20936d == cVar.e() && this.f20937e == cVar.f() && this.f20938f == cVar.d()) {
                return true;
            }
        }
        return false;
    }

    @Override // k4.F.e.d.c
    public long f() {
        return this.f20937e;
    }

    @Override // k4.F.e.d.c
    public boolean g() {
        return this.f20935c;
    }

    public int hashCode() {
        Double d7 = this.f20933a;
        int iHashCode = ((((((((d7 == null ? 0 : d7.hashCode()) ^ 1000003) * 1000003) ^ this.f20934b) * 1000003) ^ (this.f20935c ? 1231 : 1237)) * 1000003) ^ this.f20936d) * 1000003;
        long j7 = this.f20937e;
        long j8 = this.f20938f;
        return ((iHashCode ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003) ^ ((int) (j8 ^ (j8 >>> 32)));
    }

    public String toString() {
        return "Device{batteryLevel=" + this.f20933a + ", batteryVelocity=" + this.f20934b + ", proximityOn=" + this.f20935c + ", orientation=" + this.f20936d + ", ramUsed=" + this.f20937e + ", diskUsed=" + this.f20938f + "}";
    }
}
