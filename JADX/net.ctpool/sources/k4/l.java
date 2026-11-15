package k4;

import k4.F;

/* JADX INFO: loaded from: classes.dex */
final class l extends F.e.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f20841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f20842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final F.e.d.a f20843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final F.e.d.c f20844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final F.e.d.AbstractC0291d f20845e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final F.e.d.f f20846f;

    static final class b extends F.e.d.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f20847a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f20848b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private F.e.d.a f20849c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private F.e.d.c f20850d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private F.e.d.AbstractC0291d f20851e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private F.e.d.f f20852f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private byte f20853g;

        b() {
        }

        @Override // k4.F.e.d.b
        public F.e.d a() {
            String str;
            F.e.d.a aVar;
            F.e.d.c cVar;
            if (this.f20853g == 1 && (str = this.f20848b) != null && (aVar = this.f20849c) != null && (cVar = this.f20850d) != null) {
                return new l(this.f20847a, str, aVar, cVar, this.f20851e, this.f20852f);
            }
            StringBuilder sb = new StringBuilder();
            if ((1 & this.f20853g) == 0) {
                sb.append(" timestamp");
            }
            if (this.f20848b == null) {
                sb.append(" type");
            }
            if (this.f20849c == null) {
                sb.append(" app");
            }
            if (this.f20850d == null) {
                sb.append(" device");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // k4.F.e.d.b
        public F.e.d.b b(F.e.d.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null app");
            }
            this.f20849c = aVar;
            return this;
        }

        @Override // k4.F.e.d.b
        public F.e.d.b c(F.e.d.c cVar) {
            if (cVar == null) {
                throw new NullPointerException("Null device");
            }
            this.f20850d = cVar;
            return this;
        }

        @Override // k4.F.e.d.b
        public F.e.d.b d(F.e.d.AbstractC0291d abstractC0291d) {
            this.f20851e = abstractC0291d;
            return this;
        }

        @Override // k4.F.e.d.b
        public F.e.d.b e(F.e.d.f fVar) {
            this.f20852f = fVar;
            return this;
        }

        @Override // k4.F.e.d.b
        public F.e.d.b f(long j7) {
            this.f20847a = j7;
            this.f20853g = (byte) (this.f20853g | 1);
            return this;
        }

        @Override // k4.F.e.d.b
        public F.e.d.b g(String str) {
            if (str == null) {
                throw new NullPointerException("Null type");
            }
            this.f20848b = str;
            return this;
        }

        private b(F.e.d dVar) {
            this.f20847a = dVar.f();
            this.f20848b = dVar.g();
            this.f20849c = dVar.b();
            this.f20850d = dVar.c();
            this.f20851e = dVar.d();
            this.f20852f = dVar.e();
            this.f20853g = (byte) 1;
        }
    }

    private l(long j7, String str, F.e.d.a aVar, F.e.d.c cVar, F.e.d.AbstractC0291d abstractC0291d, F.e.d.f fVar) {
        this.f20841a = j7;
        this.f20842b = str;
        this.f20843c = aVar;
        this.f20844d = cVar;
        this.f20845e = abstractC0291d;
        this.f20846f = fVar;
    }

    @Override // k4.F.e.d
    public F.e.d.a b() {
        return this.f20843c;
    }

    @Override // k4.F.e.d
    public F.e.d.c c() {
        return this.f20844d;
    }

    @Override // k4.F.e.d
    public F.e.d.AbstractC0291d d() {
        return this.f20845e;
    }

    @Override // k4.F.e.d
    public F.e.d.f e() {
        return this.f20846f;
    }

    public boolean equals(Object obj) {
        F.e.d.AbstractC0291d abstractC0291d;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d)) {
            return false;
        }
        F.e.d dVar = (F.e.d) obj;
        if (this.f20841a == dVar.f() && this.f20842b.equals(dVar.g()) && this.f20843c.equals(dVar.b()) && this.f20844d.equals(dVar.c()) && ((abstractC0291d = this.f20845e) != null ? abstractC0291d.equals(dVar.d()) : dVar.d() == null)) {
            F.e.d.f fVar = this.f20846f;
            F.e.d.f fVarE = dVar.e();
            if (fVar == null) {
                if (fVarE == null) {
                    return true;
                }
            } else if (fVar.equals(fVarE)) {
                return true;
            }
        }
        return false;
    }

    @Override // k4.F.e.d
    public long f() {
        return this.f20841a;
    }

    @Override // k4.F.e.d
    public String g() {
        return this.f20842b;
    }

    @Override // k4.F.e.d
    public F.e.d.b h() {
        return new b(this);
    }

    public int hashCode() {
        long j7 = this.f20841a;
        int iHashCode = (((((((((int) (j7 ^ (j7 >>> 32))) ^ 1000003) * 1000003) ^ this.f20842b.hashCode()) * 1000003) ^ this.f20843c.hashCode()) * 1000003) ^ this.f20844d.hashCode()) * 1000003;
        F.e.d.AbstractC0291d abstractC0291d = this.f20845e;
        int iHashCode2 = (iHashCode ^ (abstractC0291d == null ? 0 : abstractC0291d.hashCode())) * 1000003;
        F.e.d.f fVar = this.f20846f;
        return iHashCode2 ^ (fVar != null ? fVar.hashCode() : 0);
    }

    public String toString() {
        return "Event{timestamp=" + this.f20841a + ", type=" + this.f20842b + ", app=" + this.f20843c + ", device=" + this.f20844d + ", log=" + this.f20845e + ", rollouts=" + this.f20846f + "}";
    }
}
