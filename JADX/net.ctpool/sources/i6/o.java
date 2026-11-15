package i6;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes2.dex */
public final class o implements C {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f20034m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f20035n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final h f20036o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Inflater f20037p;

    public o(h hVar, Inflater inflater) {
        w5.k.f(hVar, "source");
        w5.k.f(inflater, "inflater");
        this.f20036o = hVar;
        this.f20037p = inflater;
    }

    private final void d() {
        int i7 = this.f20034m;
        if (i7 == 0) {
            return;
        }
        int remaining = i7 - this.f20037p.getRemaining();
        this.f20034m -= remaining;
        this.f20036o.y0(remaining);
    }

    @Override // i6.C
    public long L0(f fVar, long j7) throws IOException {
        w5.k.f(fVar, "sink");
        do {
            long jA = a(fVar, j7);
            if (jA > 0) {
                return jA;
            }
            if (this.f20037p.finished() || this.f20037p.needsDictionary()) {
                return -1L;
            }
        } while (!this.f20036o.O());
        throw new EOFException("source exhausted prematurely");
    }

    public final long a(f fVar, long j7) throws IOException {
        w5.k.f(fVar, "sink");
        if (!(j7 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j7).toString());
        }
        if (!(!this.f20035n)) {
            throw new IllegalStateException("closed".toString());
        }
        if (j7 == 0) {
            return 0L;
        }
        try {
            x xVarP1 = fVar.p1(1);
            int iMin = (int) Math.min(j7, 8192 - xVarP1.f20057c);
            b();
            int iInflate = this.f20037p.inflate(xVarP1.f20055a, xVarP1.f20057c, iMin);
            d();
            if (iInflate > 0) {
                xVarP1.f20057c += iInflate;
                long j8 = iInflate;
                fVar.l1(fVar.m1() + j8);
                return j8;
            }
            if (xVarP1.f20056b == xVarP1.f20057c) {
                fVar.f20007m = xVarP1.b();
                y.b(xVarP1);
            }
            return 0L;
        } catch (DataFormatException e7) {
            throw new IOException(e7);
        }
    }

    public final boolean b() {
        if (!this.f20037p.needsInput()) {
            return false;
        }
        if (this.f20036o.O()) {
            return true;
        }
        x xVar = this.f20036o.h().f20007m;
        w5.k.c(xVar);
        int i7 = xVar.f20057c;
        int i8 = xVar.f20056b;
        int i9 = i7 - i8;
        this.f20034m = i9;
        this.f20037p.setInput(xVar.f20055a, i8, i9);
        return false;
    }

    @Override // i6.C, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f20035n) {
            return;
        }
        this.f20037p.end();
        this.f20035n = true;
        this.f20036o.close();
    }

    @Override // i6.C
    public D i() {
        return this.f20036o.i();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o(C c7, Inflater inflater) {
        this(q.d(c7), inflater);
        w5.k.f(c7, "source");
        w5.k.f(inflater, "inflater");
    }
}
