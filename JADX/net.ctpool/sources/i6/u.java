package i6;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
final class u implements A {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final OutputStream f20044m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final D f20045n;

    public u(OutputStream outputStream, D d7) {
        w5.k.f(outputStream, "out");
        w5.k.f(d7, "timeout");
        this.f20044m = outputStream;
        this.f20045n = d7;
    }

    @Override // i6.A, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f20044m.close();
    }

    @Override // i6.A, java.io.Flushable
    public void flush() throws IOException {
        this.f20044m.flush();
    }

    @Override // i6.A
    public D i() {
        return this.f20045n;
    }

    public String toString() {
        return "sink(" + this.f20044m + ')';
    }

    @Override // i6.A
    public void w0(f fVar, long j7) throws IOException {
        w5.k.f(fVar, "source");
        AbstractC1751c.b(fVar.m1(), 0L, j7);
        while (j7 > 0) {
            this.f20045n.f();
            x xVar = fVar.f20007m;
            w5.k.c(xVar);
            int iMin = (int) Math.min(j7, xVar.f20057c - xVar.f20056b);
            this.f20044m.write(xVar.f20055a, xVar.f20056b, iMin);
            xVar.f20056b += iMin;
            long j8 = iMin;
            j7 -= j8;
            fVar.l1(fVar.m1() - j8);
            if (xVar.f20056b == xVar.f20057c) {
                fVar.f20007m = xVar.b();
                y.b(xVar);
            }
        }
    }
}
