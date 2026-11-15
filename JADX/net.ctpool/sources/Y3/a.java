package Y3;

/* JADX INFO: loaded from: classes.dex */
final class a extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f4429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f4430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f4431c;

    a(long j7, long j8, long j9) {
        this.f4429a = j7;
        this.f4430b = j8;
        this.f4431c = j9;
    }

    @Override // Y3.o
    public long b() {
        return this.f4430b;
    }

    @Override // Y3.o
    public long c() {
        return this.f4429a;
    }

    @Override // Y3.o
    public long d() {
        return this.f4431c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f4429a == oVar.c() && this.f4430b == oVar.b() && this.f4431c == oVar.d();
    }

    public int hashCode() {
        long j7 = this.f4429a;
        long j8 = this.f4430b;
        int i7 = (((((int) (j7 ^ (j7 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        long j9 = this.f4431c;
        return i7 ^ ((int) ((j9 >>> 32) ^ j9));
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.f4429a + ", elapsedRealtime=" + this.f4430b + ", uptimeMillis=" + this.f4431c + "}";
    }
}
