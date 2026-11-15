package T2;

import T2.o;

/* JADX INFO: loaded from: classes.dex */
final class e extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o.b f3089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T2.a f3090b;

    static final class b extends o.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private o.b f3091a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private T2.a f3092b;

        b() {
        }

        @Override // T2.o.a
        public o a() {
            return new e(this.f3091a, this.f3092b);
        }

        @Override // T2.o.a
        public o.a b(T2.a aVar) {
            this.f3092b = aVar;
            return this;
        }

        @Override // T2.o.a
        public o.a c(o.b bVar) {
            this.f3091a = bVar;
            return this;
        }
    }

    private e(o.b bVar, T2.a aVar) {
        this.f3089a = bVar;
        this.f3090b = aVar;
    }

    @Override // T2.o
    public T2.a b() {
        return this.f3090b;
    }

    @Override // T2.o
    public o.b c() {
        return this.f3089a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        o.b bVar = this.f3089a;
        if (bVar != null ? bVar.equals(oVar.c()) : oVar.c() == null) {
            T2.a aVar = this.f3090b;
            T2.a aVarB = oVar.b();
            if (aVar == null) {
                if (aVarB == null) {
                    return true;
                }
            } else if (aVar.equals(aVarB)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        o.b bVar = this.f3089a;
        int iHashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        T2.a aVar = this.f3090b;
        return iHashCode ^ (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f3089a + ", androidClientInfo=" + this.f3090b + "}";
    }
}
