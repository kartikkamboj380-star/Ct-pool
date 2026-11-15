package i6;

import java.io.EOFException;

/* JADX INFO: renamed from: i6.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1753e implements A {
    @Override // i6.A
    public D i() {
        return D.f19989d;
    }

    @Override // i6.A
    public void w0(f fVar, long j7) throws EOFException {
        w5.k.f(fVar, "source");
        fVar.y0(j7);
    }

    @Override // i6.A, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // i6.A, java.io.Flushable
    public void flush() {
    }
}
