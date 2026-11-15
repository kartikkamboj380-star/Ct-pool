package k4;

import k4.F;

/* JADX INFO: loaded from: classes.dex */
final class k extends F.e.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f20822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f20823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f20824c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f20825d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f20826e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f20827f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f20828g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f20829h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f20830i;

    static final class b extends F.e.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f20831a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f20832b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f20833c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f20834d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f20835e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f20836f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f20837g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f20838h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f20839i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private byte f20840j;

        b() {
        }

        @Override // k4.F.e.c.a
        public F.e.c a() {
            String str;
            String str2;
            String str3;
            if (this.f20840j == 63 && (str = this.f20832b) != null && (str2 = this.f20838h) != null && (str3 = this.f20839i) != null) {
                return new k(this.f20831a, str, this.f20833c, this.f20834d, this.f20835e, this.f20836f, this.f20837g, str2, str3);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f20840j & 1) == 0) {
                sb.append(" arch");
            }
            if (this.f20832b == null) {
                sb.append(" model");
            }
            if ((this.f20840j & 2) == 0) {
                sb.append(" cores");
            }
            if ((this.f20840j & 4) == 0) {
                sb.append(" ram");
            }
            if ((this.f20840j & 8) == 0) {
                sb.append(" diskSpace");
            }
            if ((this.f20840j & 16) == 0) {
                sb.append(" simulator");
            }
            if ((this.f20840j & 32) == 0) {
                sb.append(" state");
            }
            if (this.f20838h == null) {
                sb.append(" manufacturer");
            }
            if (this.f20839i == null) {
                sb.append(" modelClass");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // k4.F.e.c.a
        public F.e.c.a b(int i7) {
            this.f20831a = i7;
            this.f20840j = (byte) (this.f20840j | 1);
            return this;
        }

        @Override // k4.F.e.c.a
        public F.e.c.a c(int i7) {
            this.f20833c = i7;
            this.f20840j = (byte) (this.f20840j | 2);
            return this;
        }

        @Override // k4.F.e.c.a
        public F.e.c.a d(long j7) {
            this.f20835e = j7;
            this.f20840j = (byte) (this.f20840j | 8);
            return this;
        }

        @Override // k4.F.e.c.a
        public F.e.c.a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null manufacturer");
            }
            this.f20838h = str;
            return this;
        }

        @Override // k4.F.e.c.a
        public F.e.c.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null model");
            }
            this.f20832b = str;
            return this;
        }

        @Override // k4.F.e.c.a
        public F.e.c.a g(String str) {
            if (str == null) {
                throw new NullPointerException("Null modelClass");
            }
            this.f20839i = str;
            return this;
        }

        @Override // k4.F.e.c.a
        public F.e.c.a h(long j7) {
            this.f20834d = j7;
            this.f20840j = (byte) (this.f20840j | 4);
            return this;
        }

        @Override // k4.F.e.c.a
        public F.e.c.a i(boolean z6) {
            this.f20836f = z6;
            this.f20840j = (byte) (this.f20840j | 16);
            return this;
        }

        @Override // k4.F.e.c.a
        public F.e.c.a j(int i7) {
            this.f20837g = i7;
            this.f20840j = (byte) (this.f20840j | 32);
            return this;
        }
    }

    private k(int i7, String str, int i8, long j7, long j8, boolean z6, int i9, String str2, String str3) {
        this.f20822a = i7;
        this.f20823b = str;
        this.f20824c = i8;
        this.f20825d = j7;
        this.f20826e = j8;
        this.f20827f = z6;
        this.f20828g = i9;
        this.f20829h = str2;
        this.f20830i = str3;
    }

    @Override // k4.F.e.c
    public int b() {
        return this.f20822a;
    }

    @Override // k4.F.e.c
    public int c() {
        return this.f20824c;
    }

    @Override // k4.F.e.c
    public long d() {
        return this.f20826e;
    }

    @Override // k4.F.e.c
    public String e() {
        return this.f20829h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.c)) {
            return false;
        }
        F.e.c cVar = (F.e.c) obj;
        return this.f20822a == cVar.b() && this.f20823b.equals(cVar.f()) && this.f20824c == cVar.c() && this.f20825d == cVar.h() && this.f20826e == cVar.d() && this.f20827f == cVar.j() && this.f20828g == cVar.i() && this.f20829h.equals(cVar.e()) && this.f20830i.equals(cVar.g());
    }

    @Override // k4.F.e.c
    public String f() {
        return this.f20823b;
    }

    @Override // k4.F.e.c
    public String g() {
        return this.f20830i;
    }

    @Override // k4.F.e.c
    public long h() {
        return this.f20825d;
    }

    public int hashCode() {
        int iHashCode = (((((this.f20822a ^ 1000003) * 1000003) ^ this.f20823b.hashCode()) * 1000003) ^ this.f20824c) * 1000003;
        long j7 = this.f20825d;
        int i7 = (iHashCode ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003;
        long j8 = this.f20826e;
        return ((((((((i7 ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003) ^ (this.f20827f ? 1231 : 1237)) * 1000003) ^ this.f20828g) * 1000003) ^ this.f20829h.hashCode()) * 1000003) ^ this.f20830i.hashCode();
    }

    @Override // k4.F.e.c
    public int i() {
        return this.f20828g;
    }

    @Override // k4.F.e.c
    public boolean j() {
        return this.f20827f;
    }

    public String toString() {
        return "Device{arch=" + this.f20822a + ", model=" + this.f20823b + ", cores=" + this.f20824c + ", ram=" + this.f20825d + ", diskSpace=" + this.f20826e + ", simulator=" + this.f20827f + ", state=" + this.f20828g + ", manufacturer=" + this.f20829h + ", modelClass=" + this.f20830i + "}";
    }
}
