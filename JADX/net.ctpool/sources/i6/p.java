package i6;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
final class p implements C {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final InputStream f20038m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final D f20039n;

    public p(InputStream inputStream, D d7) {
        w5.k.f(inputStream, "input");
        w5.k.f(d7, "timeout");
        this.f20038m = inputStream;
        this.f20039n = d7;
    }

    @Override // i6.C
    public long L0(f fVar, long j7) throws IOException {
        w5.k.f(fVar, "sink");
        if (j7 == 0) {
            return 0L;
        }
        if (!(j7 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j7).toString());
        }
        try {
            this.f20039n.f();
            x xVarP1 = fVar.p1(1);
            int i7 = this.f20038m.read(xVarP1.f20055a, xVarP1.f20057c, (int) Math.min(j7, 8192 - xVarP1.f20057c));
            if (i7 != -1) {
                xVarP1.f20057c += i7;
                long j8 = i7;
                fVar.l1(fVar.m1() + j8);
                return j8;
            }
            if (xVarP1.f20056b != xVarP1.f20057c) {
                return -1L;
            }
            fVar.f20007m = xVarP1.b();
            y.b(xVarP1);
            return -1L;
        } catch (AssertionError e7) {
            if (q.e(e7)) {
                throw new IOException(e7);
            }
            throw e7;
        }
    }

    @Override // i6.C, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f20038m.close();
    }

    @Override // i6.C
    public D i() {
        return this.f20039n;
    }

    public String toString() {
        return "source(" + this.f20038m + ')';
    }
}
