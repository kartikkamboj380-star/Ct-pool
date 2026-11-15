package T2;

import T2.w;

/* JADX INFO: loaded from: classes.dex */
final class m extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w.c f3138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w.b f3139b;

    static final class b extends w.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private w.c f3140a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private w.b f3141b;

        b() {
        }

        @Override // T2.w.a
        public w a() {
            return new m(this.f3140a, this.f3141b);
        }

        @Override // T2.w.a
        public w.a b(w.b bVar) {
            this.f3141b = bVar;
            return this;
        }

        @Override // T2.w.a
        public w.a c(w.c cVar) {
            this.f3140a = cVar;
            return this;
        }
    }

    private m(w.c cVar, w.b bVar) {
        this.f3138a = cVar;
        this.f3139b = bVar;
    }

    @Override // T2.w
    public w.b b() {
        return this.f3139b;
    }

    @Override // T2.w
    public w.c c() {
        return this.f3138a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        w.c cVar = this.f3138a;
        if (cVar != null ? cVar.equals(wVar.c()) : wVar.c() == null) {
            w.b bVar = this.f3139b;
            w.b bVarB = wVar.b();
            if (bVar == null) {
                if (bVarB == null) {
                    return true;
                }
            } else if (bVar.equals(bVarB)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        w.c cVar = this.f3138a;
        int iHashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        w.b bVar = this.f3139b;
        return iHashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f3138a + ", mobileSubtype=" + this.f3139b + "}";
    }
}
