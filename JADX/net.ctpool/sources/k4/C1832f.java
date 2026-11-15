package k4;

import java.util.List;
import k4.F;

/* JADX INFO: renamed from: k4.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1832f extends F.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f20777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f20778b;

    /* JADX INFO: renamed from: k4.f$b */
    static final class b extends F.d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List f20779a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f20780b;

        b() {
        }

        @Override // k4.F.d.a
        public F.d a() {
            List list = this.f20779a;
            if (list != null) {
                return new C1832f(list, this.f20780b);
            }
            throw new IllegalStateException("Missing required properties: files");
        }

        @Override // k4.F.d.a
        public F.d.a b(List list) {
            if (list == null) {
                throw new NullPointerException("Null files");
            }
            this.f20779a = list;
            return this;
        }

        @Override // k4.F.d.a
        public F.d.a c(String str) {
            this.f20780b = str;
            return this;
        }
    }

    private C1832f(List list, String str) {
        this.f20777a = list;
        this.f20778b = str;
    }

    @Override // k4.F.d
    public List b() {
        return this.f20777a;
    }

    @Override // k4.F.d
    public String c() {
        return this.f20778b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.d)) {
            return false;
        }
        F.d dVar = (F.d) obj;
        if (this.f20777a.equals(dVar.b())) {
            String str = this.f20778b;
            String strC = dVar.c();
            if (str == null) {
                if (strC == null) {
                    return true;
                }
            } else if (str.equals(strC)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f20777a.hashCode() ^ 1000003) * 1000003;
        String str = this.f20778b;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "FilesPayload{files=" + this.f20777a + ", orgId=" + this.f20778b + "}";
    }
}
