package V2;

import V2.g;

/* JADX INFO: loaded from: classes.dex */
final class b extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g.a f4022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f4023b;

    b(g.a aVar, long j7) {
        if (aVar == null) {
            throw new NullPointerException("Null status");
        }
        this.f4022a = aVar;
        this.f4023b = j7;
    }

    @Override // V2.g
    public long b() {
        return this.f4023b;
    }

    @Override // V2.g
    public g.a c() {
        return this.f4022a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f4022a.equals(gVar.c()) && this.f4023b == gVar.b();
    }

    public int hashCode() {
        int iHashCode = (this.f4022a.hashCode() ^ 1000003) * 1000003;
        long j7 = this.f4023b;
        return iHashCode ^ ((int) (j7 ^ (j7 >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f4022a + ", nextRequestWaitMillis=" + this.f4023b + "}";
    }
}
