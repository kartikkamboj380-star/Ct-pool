package i6;

/* JADX INFO: loaded from: classes2.dex */
public abstract class k implements A {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final A f20026m;

    public k(A a7) {
        w5.k.f(a7, "delegate");
        this.f20026m = a7;
    }

    @Override // i6.A, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f20026m.close();
    }

    @Override // i6.A, java.io.Flushable
    public void flush() {
        this.f20026m.flush();
    }

    @Override // i6.A
    public D i() {
        return this.f20026m.i();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f20026m + ')';
    }

    @Override // i6.A
    public void w0(f fVar, long j7) {
        w5.k.f(fVar, "source");
        this.f20026m.w0(fVar, j7);
    }
}
