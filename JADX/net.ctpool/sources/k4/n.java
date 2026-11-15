package k4;

import java.util.List;
import k4.F;

/* JADX INFO: loaded from: classes.dex */
final class n extends F.e.d.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f20869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final F.e.d.a.b.c f20870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final F.a f20871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final F.e.d.a.b.AbstractC0284d f20872d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f20873e;

    static final class b extends F.e.d.a.b.AbstractC0282b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List f20874a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private F.e.d.a.b.c f20875b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private F.a f20876c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private F.e.d.a.b.AbstractC0284d f20877d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private List f20878e;

        b() {
        }

        @Override // k4.F.e.d.a.b.AbstractC0282b
        public F.e.d.a.b a() {
            List list;
            F.e.d.a.b.AbstractC0284d abstractC0284d = this.f20877d;
            if (abstractC0284d != null && (list = this.f20878e) != null) {
                return new n(this.f20874a, this.f20875b, this.f20876c, abstractC0284d, list);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f20877d == null) {
                sb.append(" signal");
            }
            if (this.f20878e == null) {
                sb.append(" binaries");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // k4.F.e.d.a.b.AbstractC0282b
        public F.e.d.a.b.AbstractC0282b b(F.a aVar) {
            this.f20876c = aVar;
            return this;
        }

        @Override // k4.F.e.d.a.b.AbstractC0282b
        public F.e.d.a.b.AbstractC0282b c(List list) {
            if (list == null) {
                throw new NullPointerException("Null binaries");
            }
            this.f20878e = list;
            return this;
        }

        @Override // k4.F.e.d.a.b.AbstractC0282b
        public F.e.d.a.b.AbstractC0282b d(F.e.d.a.b.c cVar) {
            this.f20875b = cVar;
            return this;
        }

        @Override // k4.F.e.d.a.b.AbstractC0282b
        public F.e.d.a.b.AbstractC0282b e(F.e.d.a.b.AbstractC0284d abstractC0284d) {
            if (abstractC0284d == null) {
                throw new NullPointerException("Null signal");
            }
            this.f20877d = abstractC0284d;
            return this;
        }

        @Override // k4.F.e.d.a.b.AbstractC0282b
        public F.e.d.a.b.AbstractC0282b f(List list) {
            this.f20874a = list;
            return this;
        }
    }

    private n(List list, F.e.d.a.b.c cVar, F.a aVar, F.e.d.a.b.AbstractC0284d abstractC0284d, List list2) {
        this.f20869a = list;
        this.f20870b = cVar;
        this.f20871c = aVar;
        this.f20872d = abstractC0284d;
        this.f20873e = list2;
    }

    @Override // k4.F.e.d.a.b
    public F.a b() {
        return this.f20871c;
    }

    @Override // k4.F.e.d.a.b
    public List c() {
        return this.f20873e;
    }

    @Override // k4.F.e.d.a.b
    public F.e.d.a.b.c d() {
        return this.f20870b;
    }

    @Override // k4.F.e.d.a.b
    public F.e.d.a.b.AbstractC0284d e() {
        return this.f20872d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d.a.b)) {
            return false;
        }
        F.e.d.a.b bVar = (F.e.d.a.b) obj;
        List list = this.f20869a;
        if (list != null ? list.equals(bVar.f()) : bVar.f() == null) {
            F.e.d.a.b.c cVar = this.f20870b;
            if (cVar != null ? cVar.equals(bVar.d()) : bVar.d() == null) {
                F.a aVar = this.f20871c;
                if (aVar != null ? aVar.equals(bVar.b()) : bVar.b() == null) {
                    if (this.f20872d.equals(bVar.e()) && this.f20873e.equals(bVar.c())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // k4.F.e.d.a.b
    public List f() {
        return this.f20869a;
    }

    public int hashCode() {
        List list = this.f20869a;
        int iHashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        F.e.d.a.b.c cVar = this.f20870b;
        int iHashCode2 = (iHashCode ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        F.a aVar = this.f20871c;
        return ((((iHashCode2 ^ (aVar != null ? aVar.hashCode() : 0)) * 1000003) ^ this.f20872d.hashCode()) * 1000003) ^ this.f20873e.hashCode();
    }

    public String toString() {
        return "Execution{threads=" + this.f20869a + ", exception=" + this.f20870b + ", appExitInfo=" + this.f20871c + ", signal=" + this.f20872d + ", binaries=" + this.f20873e + "}";
    }
}
