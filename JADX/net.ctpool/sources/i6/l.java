package i6;

/* JADX INFO: loaded from: classes2.dex */
public abstract class l implements C {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final C f20027m;

    public l(C c7) {
        w5.k.f(c7, "delegate");
        this.f20027m = c7;
    }

    @Override // i6.C
    public long L0(f fVar, long j7) {
        w5.k.f(fVar, "sink");
        return this.f20027m.L0(fVar, j7);
    }

    public final C a() {
        return this.f20027m;
    }

    @Override // i6.C, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f20027m.close();
    }

    @Override // i6.C
    public D i() {
        return this.f20027m.i();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f20027m + ')';
    }
}
