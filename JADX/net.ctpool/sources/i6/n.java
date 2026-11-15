package i6;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes2.dex */
public final class n implements C {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private byte f20029m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final w f20030n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Inflater f20031o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final o f20032p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final CRC32 f20033q;

    public n(C c7) {
        w5.k.f(c7, "source");
        w wVar = new w(c7);
        this.f20030n = wVar;
        Inflater inflater = new Inflater(true);
        this.f20031o = inflater;
        this.f20032p = new o((h) wVar, inflater);
        this.f20033q = new CRC32();
    }

    private final void a(String str, int i7, int i8) throws IOException {
        if (i8 == i7) {
            return;
        }
        String str2 = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i8), Integer.valueOf(i7)}, 3));
        w5.k.e(str2, "java.lang.String.format(this, *args)");
        throw new IOException(str2);
    }

    private final void b() throws IOException {
        this.f20030n.W0(10L);
        byte bZ = this.f20030n.f20050m.z(3L);
        boolean z6 = ((bZ >> 1) & 1) == 1;
        if (z6) {
            e(this.f20030n.f20050m, 0L, 10L);
        }
        a("ID1ID2", 8075, this.f20030n.O0());
        this.f20030n.y0(8L);
        if (((bZ >> 2) & 1) == 1) {
            this.f20030n.W0(2L);
            if (z6) {
                e(this.f20030n.f20050m, 0L, 2L);
            }
            long jI1 = this.f20030n.f20050m.i1();
            this.f20030n.W0(jI1);
            if (z6) {
                e(this.f20030n.f20050m, 0L, jI1);
            }
            this.f20030n.y0(jI1);
        }
        if (((bZ >> 3) & 1) == 1) {
            long jA = this.f20030n.a((byte) 0);
            if (jA == -1) {
                throw new EOFException();
            }
            if (z6) {
                e(this.f20030n.f20050m, 0L, jA + 1);
            }
            this.f20030n.y0(jA + 1);
        }
        if (((bZ >> 4) & 1) == 1) {
            long jA2 = this.f20030n.a((byte) 0);
            if (jA2 == -1) {
                throw new EOFException();
            }
            if (z6) {
                e(this.f20030n.f20050m, 0L, jA2 + 1);
            }
            this.f20030n.y0(jA2 + 1);
        }
        if (z6) {
            a("FHCRC", this.f20030n.e(), (short) this.f20033q.getValue());
            this.f20033q.reset();
        }
    }

    private final void d() throws IOException {
        a("CRC", this.f20030n.d(), (int) this.f20033q.getValue());
        a("ISIZE", this.f20030n.d(), (int) this.f20031o.getBytesWritten());
    }

    private final void e(f fVar, long j7, long j8) {
        x xVar = fVar.f20007m;
        while (true) {
            w5.k.c(xVar);
            int i7 = xVar.f20057c;
            int i8 = xVar.f20056b;
            if (j7 < i7 - i8) {
                break;
            }
            j7 -= (long) (i7 - i8);
            xVar = xVar.f20060f;
        }
        while (j8 > 0) {
            int i9 = (int) (((long) xVar.f20056b) + j7);
            int iMin = (int) Math.min(xVar.f20057c - i9, j8);
            this.f20033q.update(xVar.f20055a, i9, iMin);
            j8 -= (long) iMin;
            xVar = xVar.f20060f;
            w5.k.c(xVar);
            j7 = 0;
        }
    }

    @Override // i6.C
    public long L0(f fVar, long j7) throws IOException {
        w5.k.f(fVar, "sink");
        if (!(j7 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j7).toString());
        }
        if (j7 == 0) {
            return 0L;
        }
        if (this.f20029m == 0) {
            b();
            this.f20029m = (byte) 1;
        }
        if (this.f20029m == 1) {
            long jM1 = fVar.m1();
            long jL0 = this.f20032p.L0(fVar, j7);
            if (jL0 != -1) {
                e(fVar, jM1, jL0);
                return jL0;
            }
            this.f20029m = (byte) 2;
        }
        if (this.f20029m == 2) {
            d();
            this.f20029m = (byte) 3;
            if (!this.f20030n.O()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // i6.C, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f20032p.close();
    }

    @Override // i6.C
    public D i() {
        return this.f20030n.i();
    }
}
