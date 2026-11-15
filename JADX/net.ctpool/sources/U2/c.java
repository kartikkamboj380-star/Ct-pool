package U2;

import U2.o;

/* JADX INFO: loaded from: classes.dex */
final class c extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f3784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f3785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final S2.d f3786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final S2.h f3787d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final S2.c f3788e;

    static final class b extends o.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private p f3789a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f3790b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private S2.d f3791c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private S2.h f3792d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private S2.c f3793e;

        b() {
        }

        @Override // U2.o.a
        public o a() {
            String str = "";
            if (this.f3789a == null) {
                str = " transportContext";
            }
            if (this.f3790b == null) {
                str = str + " transportName";
            }
            if (this.f3791c == null) {
                str = str + " event";
            }
            if (this.f3792d == null) {
                str = str + " transformer";
            }
            if (this.f3793e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new c(this.f3789a, this.f3790b, this.f3791c, this.f3792d, this.f3793e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // U2.o.a
        o.a b(S2.c cVar) {
            if (cVar == null) {
                throw new NullPointerException("Null encoding");
            }
            this.f3793e = cVar;
            return this;
        }

        @Override // U2.o.a
        o.a c(S2.d dVar) {
            if (dVar == null) {
                throw new NullPointerException("Null event");
            }
            this.f3791c = dVar;
            return this;
        }

        @Override // U2.o.a
        o.a d(S2.h hVar) {
            if (hVar == null) {
                throw new NullPointerException("Null transformer");
            }
            this.f3792d = hVar;
            return this;
        }

        @Override // U2.o.a
        public o.a e(p pVar) {
            if (pVar == null) {
                throw new NullPointerException("Null transportContext");
            }
            this.f3789a = pVar;
            return this;
        }

        @Override // U2.o.a
        public o.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f3790b = str;
            return this;
        }
    }

    private c(p pVar, String str, S2.d dVar, S2.h hVar, S2.c cVar) {
        this.f3784a = pVar;
        this.f3785b = str;
        this.f3786c = dVar;
        this.f3787d = hVar;
        this.f3788e = cVar;
    }

    @Override // U2.o
    public S2.c b() {
        return this.f3788e;
    }

    @Override // U2.o
    S2.d c() {
        return this.f3786c;
    }

    @Override // U2.o
    S2.h e() {
        return this.f3787d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f3784a.equals(oVar.f()) && this.f3785b.equals(oVar.g()) && this.f3786c.equals(oVar.c()) && this.f3787d.equals(oVar.e()) && this.f3788e.equals(oVar.b());
    }

    @Override // U2.o
    public p f() {
        return this.f3784a;
    }

    @Override // U2.o
    public String g() {
        return this.f3785b;
    }

    public int hashCode() {
        return ((((((((this.f3784a.hashCode() ^ 1000003) * 1000003) ^ this.f3785b.hashCode()) * 1000003) ^ this.f3786c.hashCode()) * 1000003) ^ this.f3787d.hashCode()) * 1000003) ^ this.f3788e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f3784a + ", transportName=" + this.f3785b + ", event=" + this.f3786c + ", transformer=" + this.f3787d + ", encoding=" + this.f3788e + "}";
    }
}
