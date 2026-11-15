package T2;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class d extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f3088a;

    d(List list) {
        if (list == null) {
            throw new NullPointerException("Null logRequests");
        }
        this.f3088a = list;
    }

    @Override // T2.n
    public List c() {
        return this.f3088a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            return this.f3088a.equals(((n) obj).c());
        }
        return false;
    }

    public int hashCode() {
        return this.f3088a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f3088a + "}";
    }
}
