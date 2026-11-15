package i6;

import com.google.android.gms.common.api.Api;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public final class w implements h {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f f20050m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f20051n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C f20052o;

    public static final class a extends InputStream {
        a() {
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            w wVar = w.this;
            if (wVar.f20051n) {
                throw new IOException("closed");
            }
            return (int) Math.min(wVar.f20050m.m1(), Api.BaseClientBuilder.API_PRIORITY_OTHER);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws EOFException {
            w.this.close();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            w wVar = w.this;
            if (wVar.f20051n) {
                throw new IOException("closed");
            }
            if (wVar.f20050m.m1() == 0) {
                w wVar2 = w.this;
                if (wVar2.f20052o.L0(wVar2.f20050m, 8192) == -1) {
                    return -1;
                }
            }
            return w.this.f20050m.q0() & 255;
        }

        public String toString() {
            return w.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i7, int i8) throws IOException {
            w5.k.f(bArr, "data");
            if (w.this.f20051n) {
                throw new IOException("closed");
            }
            AbstractC1751c.b(bArr.length, i7, i8);
            if (w.this.f20050m.m1() == 0) {
                w wVar = w.this;
                if (wVar.f20052o.L0(wVar.f20050m, 8192) == -1) {
                    return -1;
                }
            }
            return w.this.f20050m.M0(bArr, i7, i8);
        }
    }

    public w(C c7) {
        w5.k.f(c7, "source");
        this.f20052o = c7;
        this.f20050m = new f();
    }

    @Override // i6.h
    public String C0() {
        return Z(Long.MAX_VALUE);
    }

    @Override // i6.h
    public int F() throws EOFException {
        W0(4L);
        return this.f20050m.F();
    }

    @Override // i6.h
    public byte[] G0(long j7) throws EOFException {
        W0(j7);
        return this.f20050m.G0(j7);
    }

    @Override // i6.h
    public String J0() {
        this.f20050m.x(this.f20052o);
        return this.f20050m.J0();
    }

    @Override // i6.h
    public long K() throws EOFException {
        W0(8L);
        return this.f20050m.K();
    }

    @Override // i6.C
    public long L0(f fVar, long j7) {
        w5.k.f(fVar, "sink");
        if (!(j7 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j7).toString());
        }
        if (!(!this.f20051n)) {
            throw new IllegalStateException("closed".toString());
        }
        if (this.f20050m.m1() == 0 && this.f20052o.L0(this.f20050m, 8192) == -1) {
            return -1L;
        }
        return this.f20050m.L0(fVar, Math.min(j7, this.f20050m.m1()));
    }

    @Override // i6.h
    public byte[] M() {
        this.f20050m.x(this.f20052o);
        return this.f20050m.M();
    }

    @Override // i6.h
    public boolean O() {
        if (!this.f20051n) {
            return this.f20050m.O() && this.f20052o.L0(this.f20050m, (long) 8192) == -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // i6.h
    public short O0() throws EOFException {
        W0(2L);
        return this.f20050m.O0();
    }

    @Override // i6.h
    public int R(t tVar) throws EOFException {
        w5.k.f(tVar, "options");
        if (!(!this.f20051n)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            int iD = j6.a.d(this.f20050m, tVar, true);
            if (iD != -2) {
                if (iD != -1) {
                    this.f20050m.y0(tVar.k()[iD].C());
                    return iD;
                }
            } else if (this.f20052o.L0(this.f20050m, 8192) == -1) {
                break;
            }
        }
        return -1;
    }

    @Override // i6.h
    public void W0(long j7) throws EOFException {
        if (!f(j7)) {
            throw new EOFException();
        }
    }

    @Override // i6.h
    public long Y() throws EOFException {
        byte bZ;
        W0(1L);
        long j7 = 0;
        while (true) {
            long j8 = j7 + 1;
            if (!f(j8)) {
                break;
            }
            bZ = this.f20050m.z(j7);
            if ((bZ < ((byte) 48) || bZ > ((byte) 57)) && !(j7 == 0 && bZ == ((byte) 45))) {
                break;
            }
            j7 = j8;
        }
        if (j7 == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected leading [0-9] or '-' character but was 0x");
            String string = Integer.toString(bZ, F5.a.a(F5.a.a(16)));
            w5.k.e(string, "java.lang.Integer.toStri…(this, checkRadix(radix))");
            sb.append(string);
            throw new NumberFormatException(sb.toString());
        }
        return this.f20050m.Y();
    }

    @Override // i6.h
    public String Z(long j7) throws EOFException {
        if (!(j7 >= 0)) {
            throw new IllegalArgumentException(("limit < 0: " + j7).toString());
        }
        long j8 = j7 == Long.MAX_VALUE ? Long.MAX_VALUE : j7 + 1;
        byte b7 = (byte) 10;
        long jB = b(b7, 0L, j8);
        if (jB != -1) {
            return j6.a.c(this.f20050m, jB);
        }
        if (j8 < Long.MAX_VALUE && f(j8) && this.f20050m.z(j8 - 1) == ((byte) 13) && f(1 + j8) && this.f20050m.z(j8) == b7) {
            return j6.a.c(this.f20050m, j8);
        }
        f fVar = new f();
        f fVar2 = this.f20050m;
        fVar2.g(fVar, 0L, Math.min(32, fVar2.m1()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f20050m.m1(), j7) + " content=" + fVar.f1().r() + "…");
    }

    public long a(byte b7) {
        return b(b7, 0L, Long.MAX_VALUE);
    }

    public long b(byte b7, long j7, long j8) {
        if (!(!this.f20051n)) {
            throw new IllegalStateException("closed".toString());
        }
        if (!(0 <= j7 && j8 >= j7)) {
            throw new IllegalArgumentException(("fromIndex=" + j7 + " toIndex=" + j8).toString());
        }
        while (j7 < j8) {
            long jB = this.f20050m.B(b7, j7, j8);
            if (jB != -1) {
                return jB;
            }
            long jM1 = this.f20050m.m1();
            if (jM1 >= j8 || this.f20052o.L0(this.f20050m, 8192) == -1) {
                return -1L;
            }
            j7 = Math.max(j7, jM1);
        }
        return -1L;
    }

    @Override // i6.h
    public long c1() throws EOFException {
        byte bZ;
        W0(1L);
        int i7 = 0;
        while (true) {
            int i8 = i7 + 1;
            if (!f(i8)) {
                break;
            }
            bZ = this.f20050m.z(i7);
            if ((bZ < ((byte) 48) || bZ > ((byte) 57)) && ((bZ < ((byte) 97) || bZ > ((byte) 102)) && (bZ < ((byte) 65) || bZ > ((byte) 70)))) {
                break;
            }
            i7 = i8;
        }
        if (i7 == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected leading [0-9a-fA-F] character but was 0x");
            String string = Integer.toString(bZ, F5.a.a(F5.a.a(16)));
            w5.k.e(string, "java.lang.Integer.toStri…(this, checkRadix(radix))");
            sb.append(string);
            throw new NumberFormatException(sb.toString());
        }
        return this.f20050m.c1();
    }

    @Override // i6.C, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws EOFException {
        if (this.f20051n) {
            return;
        }
        this.f20051n = true;
        this.f20052o.close();
        this.f20050m.a();
    }

    public int d() throws EOFException {
        W0(4L);
        return this.f20050m.h1();
    }

    @Override // i6.h
    public long d1(A a7) {
        w5.k.f(a7, "sink");
        long j7 = 0;
        while (this.f20052o.L0(this.f20050m, 8192) != -1) {
            long jD = this.f20050m.d();
            if (jD > 0) {
                j7 += jD;
                a7.w0(this.f20050m, jD);
            }
        }
        if (this.f20050m.m1() <= 0) {
            return j7;
        }
        long jM1 = j7 + this.f20050m.m1();
        f fVar = this.f20050m;
        a7.w0(fVar, fVar.m1());
        return jM1;
    }

    public short e() throws EOFException {
        W0(2L);
        return this.f20050m.i1();
    }

    @Override // i6.h
    public InputStream e1() {
        return new a();
    }

    public boolean f(long j7) {
        if (!(j7 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j7).toString());
        }
        if (!(!this.f20051n)) {
            throw new IllegalStateException("closed".toString());
        }
        while (this.f20050m.m1() < j7) {
            if (this.f20052o.L0(this.f20050m, 8192) == -1) {
                return false;
            }
        }
        return true;
    }

    @Override // i6.h, i6.g
    public f h() {
        return this.f20050m;
    }

    @Override // i6.C
    public D i() {
        return this.f20052o.i();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f20051n;
    }

    @Override // i6.h
    public void m0(f fVar, long j7) throws EOFException {
        w5.k.f(fVar, "sink");
        try {
            W0(j7);
            this.f20050m.m0(fVar, j7);
        } catch (EOFException e7) {
            fVar.x(this.f20050m);
            throw e7;
        }
    }

    @Override // i6.h
    public String p0(Charset charset) {
        w5.k.f(charset, "charset");
        this.f20050m.x(this.f20052o);
        return this.f20050m.p0(charset);
    }

    @Override // i6.h
    public byte q0() throws EOFException {
        W0(1L);
        return this.f20050m.q0();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        w5.k.f(byteBuffer, "sink");
        if (this.f20050m.m1() == 0 && this.f20052o.L0(this.f20050m, 8192) == -1) {
            return -1;
        }
        return this.f20050m.read(byteBuffer);
    }

    @Override // i6.h
    public i t(long j7) throws EOFException {
        W0(j7);
        return this.f20050m.t(j7);
    }

    public String toString() {
        return "buffer(" + this.f20052o + ')';
    }

    @Override // i6.h
    public void u0(byte[] bArr) throws EOFException {
        w5.k.f(bArr, "sink");
        try {
            W0(bArr.length);
            this.f20050m.u0(bArr);
        } catch (EOFException e7) {
            int i7 = 0;
            while (this.f20050m.m1() > 0) {
                f fVar = this.f20050m;
                int iM0 = fVar.M0(bArr, i7, (int) fVar.m1());
                if (iM0 == -1) {
                    throw new AssertionError();
                }
                i7 += iM0;
            }
            throw e7;
        }
    }

    @Override // i6.h
    public void y0(long j7) throws EOFException {
        if (!(!this.f20051n)) {
            throw new IllegalStateException("closed".toString());
        }
        while (j7 > 0) {
            if (this.f20050m.m1() == 0 && this.f20052o.L0(this.f20050m, 8192) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j7, this.f20050m.m1());
            this.f20050m.y0(jMin);
            j7 -= jMin;
        }
    }
}
