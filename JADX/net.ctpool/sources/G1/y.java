package G1;

import R0.h;

/* JADX INFO: loaded from: classes.dex */
public class y implements R0.h {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f1230m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    S0.a f1231n;

    public y(S0.a aVar, int i7) {
        O0.l.g(aVar);
        O0.l.b(Boolean.valueOf(i7 >= 0 && i7 <= ((w) aVar.j()).n()));
        this.f1231n = aVar.clone();
        this.f1230m = i7;
    }

    synchronized void a() {
        if (isClosed()) {
            throw new h.a();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        S0.a.g(this.f1231n);
        this.f1231n = null;
    }

    @Override // R0.h
    public synchronized boolean isClosed() {
        return !S0.a.B(this.f1231n);
    }

    @Override // R0.h
    public synchronized byte k(int i7) {
        a();
        O0.l.b(Boolean.valueOf(i7 >= 0));
        O0.l.b(Boolean.valueOf(i7 < this.f1230m));
        O0.l.g(this.f1231n);
        return ((w) this.f1231n.j()).k(i7);
    }

    @Override // R0.h
    public synchronized int m(int i7, byte[] bArr, int i8, int i9) {
        a();
        O0.l.b(Boolean.valueOf(i7 + i9 <= this.f1230m));
        O0.l.g(this.f1231n);
        return ((w) this.f1231n.j()).m(i7, bArr, i8, i9);
    }

    @Override // R0.h
    public synchronized int size() {
        a();
        return this.f1230m;
    }
}
