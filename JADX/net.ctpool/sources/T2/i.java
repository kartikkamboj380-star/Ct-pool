package T2;

import T2.s;

/* JADX INFO: loaded from: classes.dex */
final class i extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r f3103a;

    static final class b extends s.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private r f3104a;

        b() {
        }

        @Override // T2.s.a
        public s a() {
            return new i(this.f3104a);
        }

        @Override // T2.s.a
        public s.a b(r rVar) {
            this.f3104a = rVar;
            return this;
        }
    }

    private i(r rVar) {
        this.f3103a = rVar;
    }

    @Override // T2.s
    public r b() {
        return this.f3103a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        r rVar = this.f3103a;
        r rVarB = ((s) obj).b();
        return rVar == null ? rVarB == null : rVar.equals(rVarB);
    }

    public int hashCode() {
        r rVar = this.f3103a;
        return (rVar == null ? 0 : rVar.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ExternalPrivacyContext{prequest=" + this.f3103a + "}";
    }
}
