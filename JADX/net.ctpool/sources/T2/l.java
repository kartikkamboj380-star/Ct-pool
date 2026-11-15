package T2;

/* JADX INFO: loaded from: classes.dex */
final class l extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f3137a;

    l(long j7) {
        this.f3137a = j7;
    }

    @Override // T2.v
    public long c() {
        return this.f3137a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof v) && this.f3137a == ((v) obj).c();
    }

    public int hashCode() {
        long j7 = this.f3137a;
        return ((int) (j7 ^ (j7 >>> 32))) ^ 1000003;
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f3137a + "}";
    }
}
