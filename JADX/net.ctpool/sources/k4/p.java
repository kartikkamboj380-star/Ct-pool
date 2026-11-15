package k4;

import java.util.List;
import k4.F;

/* JADX INFO: loaded from: classes.dex */
final class p extends F.e.d.a.b.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f20888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f20889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f20890c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final F.e.d.a.b.c f20891d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f20892e;

    static final class b extends F.e.d.a.b.c.AbstractC0283a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f20893a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f20894b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List f20895c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private F.e.d.a.b.c f20896d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f20897e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private byte f20898f;

        b() {
        }

        @Override // k4.F.e.d.a.b.c.AbstractC0283a
        public F.e.d.a.b.c a() {
            String str;
            List list;
            if (this.f20898f == 1 && (str = this.f20893a) != null && (list = this.f20895c) != null) {
                return new p(str, this.f20894b, list, this.f20896d, this.f20897e);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f20893a == null) {
                sb.append(" type");
            }
            if (this.f20895c == null) {
                sb.append(" frames");
            }
            if ((1 & this.f20898f) == 0) {
                sb.append(" overflowCount");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // k4.F.e.d.a.b.c.AbstractC0283a
        public F.e.d.a.b.c.AbstractC0283a b(F.e.d.a.b.c cVar) {
            this.f20896d = cVar;
            return this;
        }

        @Override // k4.F.e.d.a.b.c.AbstractC0283a
        public F.e.d.a.b.c.AbstractC0283a c(List list) {
            if (list == null) {
                throw new NullPointerException("Null frames");
            }
            this.f20895c = list;
            return this;
        }

        @Override // k4.F.e.d.a.b.c.AbstractC0283a
        public F.e.d.a.b.c.AbstractC0283a d(int i7) {
            this.f20897e = i7;
            this.f20898f = (byte) (this.f20898f | 1);
            return this;
        }

        @Override // k4.F.e.d.a.b.c.AbstractC0283a
        public F.e.d.a.b.c.AbstractC0283a e(String str) {
            this.f20894b = str;
            return this;
        }

        @Override // k4.F.e.d.a.b.c.AbstractC0283a
        public F.e.d.a.b.c.AbstractC0283a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null type");
            }
            this.f20893a = str;
            return this;
        }
    }

    private p(String str, String str2, List list, F.e.d.a.b.c cVar, int i7) {
        this.f20888a = str;
        this.f20889b = str2;
        this.f20890c = list;
        this.f20891d = cVar;
        this.f20892e = i7;
    }

    @Override // k4.F.e.d.a.b.c
    public F.e.d.a.b.c b() {
        return this.f20891d;
    }

    @Override // k4.F.e.d.a.b.c
    public List c() {
        return this.f20890c;
    }

    @Override // k4.F.e.d.a.b.c
    public int d() {
        return this.f20892e;
    }

    @Override // k4.F.e.d.a.b.c
    public String e() {
        return this.f20889b;
    }

    public boolean equals(Object obj) {
        String str;
        F.e.d.a.b.c cVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d.a.b.c)) {
            return false;
        }
        F.e.d.a.b.c cVar2 = (F.e.d.a.b.c) obj;
        return this.f20888a.equals(cVar2.f()) && ((str = this.f20889b) != null ? str.equals(cVar2.e()) : cVar2.e() == null) && this.f20890c.equals(cVar2.c()) && ((cVar = this.f20891d) != null ? cVar.equals(cVar2.b()) : cVar2.b() == null) && this.f20892e == cVar2.d();
    }

    @Override // k4.F.e.d.a.b.c
    public String f() {
        return this.f20888a;
    }

    public int hashCode() {
        int iHashCode = (this.f20888a.hashCode() ^ 1000003) * 1000003;
        String str = this.f20889b;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f20890c.hashCode()) * 1000003;
        F.e.d.a.b.c cVar = this.f20891d;
        return ((iHashCode2 ^ (cVar != null ? cVar.hashCode() : 0)) * 1000003) ^ this.f20892e;
    }

    public String toString() {
        return "Exception{type=" + this.f20888a + ", reason=" + this.f20889b + ", frames=" + this.f20890c + ", causedBy=" + this.f20891d + ", overflowCount=" + this.f20892e + "}";
    }
}
