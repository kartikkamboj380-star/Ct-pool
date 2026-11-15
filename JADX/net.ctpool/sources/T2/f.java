package T2;

import T2.p;

/* JADX INFO: loaded from: classes.dex */
final class f extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f3093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p.b f3094b;

    static final class b extends p.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private s f3095a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private p.b f3096b;

        b() {
        }

        @Override // T2.p.a
        public p a() {
            return new f(this.f3095a, this.f3096b);
        }

        @Override // T2.p.a
        public p.a b(s sVar) {
            this.f3095a = sVar;
            return this;
        }

        @Override // T2.p.a
        public p.a c(p.b bVar) {
            this.f3096b = bVar;
            return this;
        }
    }

    private f(s sVar, p.b bVar) {
        this.f3093a = sVar;
        this.f3094b = bVar;
    }

    @Override // T2.p
    public s b() {
        return this.f3093a;
    }

    @Override // T2.p
    public p.b c() {
        return this.f3094b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        s sVar = this.f3093a;
        if (sVar != null ? sVar.equals(pVar.b()) : pVar.b() == null) {
            p.b bVar = this.f3094b;
            p.b bVarC = pVar.c();
            if (bVar == null) {
                if (bVarC == null) {
                    return true;
                }
            } else if (bVar.equals(bVarC)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        s sVar = this.f3093a;
        int iHashCode = ((sVar == null ? 0 : sVar.hashCode()) ^ 1000003) * 1000003;
        p.b bVar = this.f3094b;
        return iHashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "ComplianceData{privacyContext=" + this.f3093a + ", productIdOrigin=" + this.f3094b + "}";
    }
}
