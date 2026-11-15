package k4;

import java.util.List;
import k4.F;

/* JADX INFO: loaded from: classes.dex */
final class m extends F.e.d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F.e.d.a.b f20854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f20855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f20856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Boolean f20857d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final F.e.d.a.c f20858e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f20859f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f20860g;

    static final class b extends F.e.d.a.AbstractC0279a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private F.e.d.a.b f20861a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List f20862b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List f20863c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Boolean f20864d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private F.e.d.a.c f20865e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List f20866f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f20867g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private byte f20868h;

        b() {
        }

        @Override // k4.F.e.d.a.AbstractC0279a
        public F.e.d.a a() {
            F.e.d.a.b bVar;
            if (this.f20868h == 1 && (bVar = this.f20861a) != null) {
                return new m(bVar, this.f20862b, this.f20863c, this.f20864d, this.f20865e, this.f20866f, this.f20867g);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f20861a == null) {
                sb.append(" execution");
            }
            if ((1 & this.f20868h) == 0) {
                sb.append(" uiOrientation");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // k4.F.e.d.a.AbstractC0279a
        public F.e.d.a.AbstractC0279a b(List list) {
            this.f20866f = list;
            return this;
        }

        @Override // k4.F.e.d.a.AbstractC0279a
        public F.e.d.a.AbstractC0279a c(Boolean bool) {
            this.f20864d = bool;
            return this;
        }

        @Override // k4.F.e.d.a.AbstractC0279a
        public F.e.d.a.AbstractC0279a d(F.e.d.a.c cVar) {
            this.f20865e = cVar;
            return this;
        }

        @Override // k4.F.e.d.a.AbstractC0279a
        public F.e.d.a.AbstractC0279a e(List list) {
            this.f20862b = list;
            return this;
        }

        @Override // k4.F.e.d.a.AbstractC0279a
        public F.e.d.a.AbstractC0279a f(F.e.d.a.b bVar) {
            if (bVar == null) {
                throw new NullPointerException("Null execution");
            }
            this.f20861a = bVar;
            return this;
        }

        @Override // k4.F.e.d.a.AbstractC0279a
        public F.e.d.a.AbstractC0279a g(List list) {
            this.f20863c = list;
            return this;
        }

        @Override // k4.F.e.d.a.AbstractC0279a
        public F.e.d.a.AbstractC0279a h(int i7) {
            this.f20867g = i7;
            this.f20868h = (byte) (this.f20868h | 1);
            return this;
        }

        private b(F.e.d.a aVar) {
            this.f20861a = aVar.f();
            this.f20862b = aVar.e();
            this.f20863c = aVar.g();
            this.f20864d = aVar.c();
            this.f20865e = aVar.d();
            this.f20866f = aVar.b();
            this.f20867g = aVar.h();
            this.f20868h = (byte) 1;
        }
    }

    private m(F.e.d.a.b bVar, List list, List list2, Boolean bool, F.e.d.a.c cVar, List list3, int i7) {
        this.f20854a = bVar;
        this.f20855b = list;
        this.f20856c = list2;
        this.f20857d = bool;
        this.f20858e = cVar;
        this.f20859f = list3;
        this.f20860g = i7;
    }

    @Override // k4.F.e.d.a
    public List b() {
        return this.f20859f;
    }

    @Override // k4.F.e.d.a
    public Boolean c() {
        return this.f20857d;
    }

    @Override // k4.F.e.d.a
    public F.e.d.a.c d() {
        return this.f20858e;
    }

    @Override // k4.F.e.d.a
    public List e() {
        return this.f20855b;
    }

    public boolean equals(Object obj) {
        List list;
        List list2;
        Boolean bool;
        F.e.d.a.c cVar;
        List list3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d.a)) {
            return false;
        }
        F.e.d.a aVar = (F.e.d.a) obj;
        return this.f20854a.equals(aVar.f()) && ((list = this.f20855b) != null ? list.equals(aVar.e()) : aVar.e() == null) && ((list2 = this.f20856c) != null ? list2.equals(aVar.g()) : aVar.g() == null) && ((bool = this.f20857d) != null ? bool.equals(aVar.c()) : aVar.c() == null) && ((cVar = this.f20858e) != null ? cVar.equals(aVar.d()) : aVar.d() == null) && ((list3 = this.f20859f) != null ? list3.equals(aVar.b()) : aVar.b() == null) && this.f20860g == aVar.h();
    }

    @Override // k4.F.e.d.a
    public F.e.d.a.b f() {
        return this.f20854a;
    }

    @Override // k4.F.e.d.a
    public List g() {
        return this.f20856c;
    }

    @Override // k4.F.e.d.a
    public int h() {
        return this.f20860g;
    }

    public int hashCode() {
        int iHashCode = (this.f20854a.hashCode() ^ 1000003) * 1000003;
        List list = this.f20855b;
        int iHashCode2 = (iHashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.f20856c;
        int iHashCode3 = (iHashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.f20857d;
        int iHashCode4 = (iHashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        F.e.d.a.c cVar = this.f20858e;
        int iHashCode5 = (iHashCode4 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        List list3 = this.f20859f;
        return ((iHashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003) ^ this.f20860g;
    }

    @Override // k4.F.e.d.a
    public F.e.d.a.AbstractC0279a i() {
        return new b(this);
    }

    public String toString() {
        return "Application{execution=" + this.f20854a + ", customAttributes=" + this.f20855b + ", internalKeys=" + this.f20856c + ", background=" + this.f20857d + ", currentProcessDetails=" + this.f20858e + ", appProcessDetails=" + this.f20859f + ", uiOrientation=" + this.f20860g + "}";
    }
}
