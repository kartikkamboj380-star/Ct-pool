package i6;

import java.util.zip.Deflater;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements A {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f20023m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final g f20024n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Deflater f20025o;

    public j(g gVar, Deflater deflater) {
        w5.k.f(gVar, "sink");
        w5.k.f(deflater, "deflater");
        this.f20024n = gVar;
        this.f20025o = deflater;
    }

    private final void a(boolean z6) {
        x xVarP1;
        f fVarH = this.f20024n.h();
        while (true) {
            xVarP1 = fVarH.p1(1);
            Deflater deflater = this.f20025o;
            byte[] bArr = xVarP1.f20055a;
            int i7 = xVarP1.f20057c;
            int i8 = 8192 - i7;
            int iDeflate = z6 ? deflater.deflate(bArr, i7, i8, 2) : deflater.deflate(bArr, i7, i8);
            if (iDeflate > 0) {
                xVarP1.f20057c += iDeflate;
                fVarH.l1(fVarH.m1() + ((long) iDeflate));
                this.f20024n.X();
            } else if (this.f20025o.needsInput()) {
                break;
            }
        }
        if (xVarP1.f20056b == xVarP1.f20057c) {
            fVarH.f20007m = xVarP1.b();
            y.b(xVarP1);
        }
    }

    public final void b() {
        this.f20025o.finish();
        a(false);
    }

    @Override // i6.A, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f20023m) {
            return;
        }
        try {
            b();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.f20025o.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.f20024n.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f20023m = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // i6.A, java.io.Flushable
    public void flush() {
        a(true);
        this.f20024n.flush();
    }

    @Override // i6.A
    public D i() {
        return this.f20024n.i();
    }

    public String toString() {
        return "DeflaterSink(" + this.f20024n + ')';
    }

    @Override // i6.A
    public void w0(f fVar, long j7) {
        w5.k.f(fVar, "source");
        AbstractC1751c.b(fVar.m1(), 0L, j7);
        while (j7 > 0) {
            x xVar = fVar.f20007m;
            w5.k.c(xVar);
            int iMin = (int) Math.min(j7, xVar.f20057c - xVar.f20056b);
            this.f20025o.setInput(xVar.f20055a, xVar.f20056b, iMin);
            a(false);
            long j8 = iMin;
            fVar.l1(fVar.m1() - j8);
            int i7 = xVar.f20056b + iMin;
            xVar.f20056b = i7;
            if (i7 == xVar.f20057c) {
                fVar.f20007m = xVar.b();
                y.b(xVar);
            }
            j7 -= j8;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(A a7, Deflater deflater) {
        this(q.c(a7), deflater);
        w5.k.f(a7, "sink");
        w5.k.f(deflater, "deflater");
    }
}
