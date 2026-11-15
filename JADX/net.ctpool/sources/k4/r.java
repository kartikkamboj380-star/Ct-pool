package k4;

import java.util.List;
import k4.F;

/* JADX INFO: loaded from: classes.dex */
final class r extends F.e.d.a.b.AbstractC0286e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f20906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f20907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f20908c;

    static final class b extends F.e.d.a.b.AbstractC0286e.AbstractC0287a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f20909a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f20910b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List f20911c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte f20912d;

        b() {
        }

        @Override // k4.F.e.d.a.b.AbstractC0286e.AbstractC0287a
        public F.e.d.a.b.AbstractC0286e a() {
            String str;
            List list;
            if (this.f20912d == 1 && (str = this.f20909a) != null && (list = this.f20911c) != null) {
                return new r(str, this.f20910b, list);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f20909a == null) {
                sb.append(" name");
            }
            if ((1 & this.f20912d) == 0) {
                sb.append(" importance");
            }
            if (this.f20911c == null) {
                sb.append(" frames");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // k4.F.e.d.a.b.AbstractC0286e.AbstractC0287a
        public F.e.d.a.b.AbstractC0286e.AbstractC0287a b(List list) {
            if (list == null) {
                throw new NullPointerException("Null frames");
            }
            this.f20911c = list;
            return this;
        }

        @Override // k4.F.e.d.a.b.AbstractC0286e.AbstractC0287a
        public F.e.d.a.b.AbstractC0286e.AbstractC0287a c(int i7) {
            this.f20910b = i7;
            this.f20912d = (byte) (this.f20912d | 1);
            return this;
        }

        @Override // k4.F.e.d.a.b.AbstractC0286e.AbstractC0287a
        public F.e.d.a.b.AbstractC0286e.AbstractC0287a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f20909a = str;
            return this;
        }
    }

    private r(String str, int i7, List list) {
        this.f20906a = str;
        this.f20907b = i7;
        this.f20908c = list;
    }

    @Override // k4.F.e.d.a.b.AbstractC0286e
    public List b() {
        return this.f20908c;
    }

    @Override // k4.F.e.d.a.b.AbstractC0286e
    public int c() {
        return this.f20907b;
    }

    @Override // k4.F.e.d.a.b.AbstractC0286e
    public String d() {
        return this.f20906a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d.a.b.AbstractC0286e)) {
            return false;
        }
        F.e.d.a.b.AbstractC0286e abstractC0286e = (F.e.d.a.b.AbstractC0286e) obj;
        return this.f20906a.equals(abstractC0286e.d()) && this.f20907b == abstractC0286e.c() && this.f20908c.equals(abstractC0286e.b());
    }

    public int hashCode() {
        return ((((this.f20906a.hashCode() ^ 1000003) * 1000003) ^ this.f20907b) * 1000003) ^ this.f20908c.hashCode();
    }

    public String toString() {
        return "Thread{name=" + this.f20906a + ", importance=" + this.f20907b + ", frames=" + this.f20908c + "}";
    }
}
