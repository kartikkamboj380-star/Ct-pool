package i6;

import com.google.android.gms.common.api.Api;
import j5.AbstractC1803h;
import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements h, g, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public x f20007m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f20008n;

    public static final class a implements Closeable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public f f20009m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f20010n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private x f20011o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public byte[] f20013q;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public long f20012p = -1;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f20014r = -1;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f20015s = -1;

        public final int a() {
            long j7 = this.f20012p;
            f fVar = this.f20009m;
            w5.k.c(fVar);
            if (!(j7 != fVar.m1())) {
                throw new IllegalStateException("no more bytes".toString());
            }
            long j8 = this.f20012p;
            return d(j8 == -1 ? 0L : j8 + ((long) (this.f20015s - this.f20014r)));
        }

        public final long b(long j7) {
            f fVar = this.f20009m;
            if (fVar == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            if (!this.f20010n) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers".toString());
            }
            long jM1 = fVar.m1();
            int i7 = 1;
            if (j7 <= jM1) {
                if (!(j7 >= 0)) {
                    throw new IllegalArgumentException(("newSize < 0: " + j7).toString());
                }
                long j8 = jM1 - j7;
                while (true) {
                    if (j8 <= 0) {
                        break;
                    }
                    x xVar = fVar.f20007m;
                    w5.k.c(xVar);
                    x xVar2 = xVar.f20061g;
                    w5.k.c(xVar2);
                    int i8 = xVar2.f20057c;
                    long j9 = i8 - xVar2.f20056b;
                    if (j9 > j8) {
                        xVar2.f20057c = i8 - ((int) j8);
                        break;
                    }
                    fVar.f20007m = xVar2.b();
                    y.b(xVar2);
                    j8 -= j9;
                }
                this.f20011o = null;
                this.f20012p = j7;
                this.f20013q = null;
                this.f20014r = -1;
                this.f20015s = -1;
            } else if (j7 > jM1) {
                long j10 = j7 - jM1;
                boolean z6 = true;
                while (j10 > 0) {
                    x xVarP1 = fVar.p1(i7);
                    int iMin = (int) Math.min(j10, 8192 - xVarP1.f20057c);
                    int i9 = xVarP1.f20057c + iMin;
                    xVarP1.f20057c = i9;
                    j10 -= (long) iMin;
                    if (z6) {
                        this.f20011o = xVarP1;
                        this.f20012p = jM1;
                        this.f20013q = xVarP1.f20055a;
                        this.f20014r = i9 - iMin;
                        this.f20015s = i9;
                        z6 = false;
                    }
                    i7 = 1;
                }
            }
            fVar.l1(j7);
            return jM1;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!(this.f20009m != null)) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            this.f20009m = null;
            this.f20011o = null;
            this.f20012p = -1L;
            this.f20013q = null;
            this.f20014r = -1;
            this.f20015s = -1;
        }

        public final int d(long j7) {
            x xVarC;
            f fVar = this.f20009m;
            if (fVar == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            if (j7 < -1 || j7 > fVar.m1()) {
                w5.y yVar = w5.y.f22743a;
                String str = String.format("offset=%s > size=%s", Arrays.copyOf(new Object[]{Long.valueOf(j7), Long.valueOf(fVar.m1())}, 2));
                w5.k.e(str, "java.lang.String.format(format, *args)");
                throw new ArrayIndexOutOfBoundsException(str);
            }
            if (j7 == -1 || j7 == fVar.m1()) {
                this.f20011o = null;
                this.f20012p = j7;
                this.f20013q = null;
                this.f20014r = -1;
                this.f20015s = -1;
                return -1;
            }
            long jM1 = fVar.m1();
            x xVar = fVar.f20007m;
            x xVar2 = this.f20011o;
            long j8 = 0;
            if (xVar2 != null) {
                long j9 = this.f20012p;
                int i7 = this.f20014r;
                w5.k.c(xVar2);
                long j10 = j9 - ((long) (i7 - xVar2.f20056b));
                if (j10 > j7) {
                    xVarC = xVar;
                    xVar = this.f20011o;
                    jM1 = j10;
                } else {
                    xVarC = this.f20011o;
                    j8 = j10;
                }
            } else {
                xVarC = xVar;
            }
            if (jM1 - j7 > j7 - j8) {
                while (true) {
                    w5.k.c(xVarC);
                    int i8 = xVarC.f20057c;
                    int i9 = xVarC.f20056b;
                    if (j7 < ((long) (i8 - i9)) + j8) {
                        break;
                    }
                    j8 += (long) (i8 - i9);
                    xVarC = xVarC.f20060f;
                }
            } else {
                while (jM1 > j7) {
                    w5.k.c(xVar);
                    xVar = xVar.f20061g;
                    w5.k.c(xVar);
                    jM1 -= (long) (xVar.f20057c - xVar.f20056b);
                }
                j8 = jM1;
                xVarC = xVar;
            }
            if (this.f20010n) {
                w5.k.c(xVarC);
                if (xVarC.f20058d) {
                    x xVarF = xVarC.f();
                    if (fVar.f20007m == xVarC) {
                        fVar.f20007m = xVarF;
                    }
                    xVarC = xVarC.c(xVarF);
                    x xVar3 = xVarC.f20061g;
                    w5.k.c(xVar3);
                    xVar3.b();
                }
            }
            this.f20011o = xVarC;
            this.f20012p = j7;
            w5.k.c(xVarC);
            this.f20013q = xVarC.f20055a;
            int i10 = xVarC.f20056b + ((int) (j7 - j8));
            this.f20014r = i10;
            int i11 = xVarC.f20057c;
            this.f20015s = i11;
            return i11 - i10;
        }
    }

    public static final class b extends InputStream {
        b() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(f.this.m1(), Api.BaseClientBuilder.API_PRIORITY_OTHER);
        }

        @Override // java.io.InputStream
        public int read() {
            if (f.this.m1() > 0) {
                return f.this.q0() & 255;
            }
            return -1;
        }

        public String toString() {
            return f.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i7, int i8) {
            w5.k.f(bArr, "sink");
            return f.this.M0(bArr, i7, i8);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    public static final class c extends OutputStream {
        c() {
        }

        public String toString() {
            return f.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i7) {
            f.this.P(i7);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i7, int i8) {
            w5.k.f(bArr, "data");
            f.this.r0(bArr, i7, i8);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }
    }

    public static /* synthetic */ a b1(f fVar, a aVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            aVar = new a();
        }
        return fVar.R0(aVar);
    }

    @Override // i6.g
    /* JADX INFO: renamed from: A1, reason: merged with bridge method [inline-methods] */
    public f k0(String str) {
        w5.k.f(str, "string");
        return B1(str, 0, str.length());
    }

    public long B(byte b7, long j7, long j8) {
        x xVar;
        int i7;
        long jM1 = 0;
        if (!(0 <= j7 && j8 >= j7)) {
            throw new IllegalArgumentException(("size=" + m1() + " fromIndex=" + j7 + " toIndex=" + j8).toString());
        }
        if (j8 > m1()) {
            j8 = m1();
        }
        if (j7 == j8 || (xVar = this.f20007m) == null) {
            return -1L;
        }
        if (m1() - j7 < j7) {
            jM1 = m1();
            while (jM1 > j7) {
                xVar = xVar.f20061g;
                w5.k.c(xVar);
                jM1 -= (long) (xVar.f20057c - xVar.f20056b);
            }
            while (jM1 < j8) {
                byte[] bArr = xVar.f20055a;
                int iMin = (int) Math.min(xVar.f20057c, (((long) xVar.f20056b) + j8) - jM1);
                i7 = (int) ((((long) xVar.f20056b) + j7) - jM1);
                while (i7 < iMin) {
                    if (bArr[i7] != b7) {
                        i7++;
                    }
                }
                jM1 += (long) (xVar.f20057c - xVar.f20056b);
                xVar = xVar.f20060f;
                w5.k.c(xVar);
                j7 = jM1;
            }
            return -1L;
        }
        while (true) {
            long j9 = ((long) (xVar.f20057c - xVar.f20056b)) + jM1;
            if (j9 > j7) {
                break;
            }
            xVar = xVar.f20060f;
            w5.k.c(xVar);
            jM1 = j9;
        }
        while (jM1 < j8) {
            byte[] bArr2 = xVar.f20055a;
            int iMin2 = (int) Math.min(xVar.f20057c, (((long) xVar.f20056b) + j8) - jM1);
            i7 = (int) ((((long) xVar.f20056b) + j7) - jM1);
            while (i7 < iMin2) {
                if (bArr2[i7] != b7) {
                    i7++;
                }
            }
            jM1 += (long) (xVar.f20057c - xVar.f20056b);
            xVar = xVar.f20060f;
            w5.k.c(xVar);
            j7 = jM1;
        }
        return -1L;
        return ((long) (i7 - xVar.f20056b)) + jM1;
    }

    public f B1(String str, int i7, int i8) {
        long jM1;
        long j7;
        w5.k.f(str, "string");
        if (!(i7 >= 0)) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i7).toString());
        }
        if (!(i8 >= i7)) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i8 + " < " + i7).toString());
        }
        if (!(i8 <= str.length())) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i8 + " > " + str.length()).toString());
        }
        while (i7 < i8) {
            char cCharAt = str.charAt(i7);
            if (cCharAt < 128) {
                x xVarP1 = p1(1);
                byte[] bArr = xVarP1.f20055a;
                int i9 = xVarP1.f20057c - i7;
                int iMin = Math.min(i8, 8192 - i9);
                int i10 = i7 + 1;
                bArr[i7 + i9] = (byte) cCharAt;
                while (i10 < iMin) {
                    char cCharAt2 = str.charAt(i10);
                    if (cCharAt2 >= 128) {
                        break;
                    }
                    bArr[i10 + i9] = (byte) cCharAt2;
                    i10++;
                }
                int i11 = xVarP1.f20057c;
                int i12 = (i9 + i10) - i11;
                xVarP1.f20057c = i11 + i12;
                l1(m1() + ((long) i12));
                i7 = i10;
            } else {
                if (cCharAt < 2048) {
                    x xVarP12 = p1(2);
                    byte[] bArr2 = xVarP12.f20055a;
                    int i13 = xVarP12.f20057c;
                    bArr2[i13] = (byte) ((cCharAt >> 6) | 192);
                    bArr2[i13 + 1] = (byte) ((cCharAt & '?') | 128);
                    xVarP12.f20057c = i13 + 2;
                    jM1 = m1();
                    j7 = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    x xVarP13 = p1(3);
                    byte[] bArr3 = xVarP13.f20055a;
                    int i14 = xVarP13.f20057c;
                    bArr3[i14] = (byte) ((cCharAt >> '\f') | 224);
                    bArr3[i14 + 1] = (byte) ((63 & (cCharAt >> 6)) | 128);
                    bArr3[i14 + 2] = (byte) ((cCharAt & '?') | 128);
                    xVarP13.f20057c = i14 + 3;
                    jM1 = m1();
                    j7 = 3;
                } else {
                    int i15 = i7 + 1;
                    char cCharAt3 = i15 < i8 ? str.charAt(i15) : (char) 0;
                    if (cCharAt > 56319 || 56320 > cCharAt3 || 57343 < cCharAt3) {
                        P(63);
                        i7 = i15;
                    } else {
                        int i16 = (((cCharAt & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        x xVarP14 = p1(4);
                        byte[] bArr4 = xVarP14.f20055a;
                        int i17 = xVarP14.f20057c;
                        bArr4[i17] = (byte) ((i16 >> 18) | 240);
                        bArr4[i17 + 1] = (byte) (((i16 >> 12) & 63) | 128);
                        bArr4[i17 + 2] = (byte) (((i16 >> 6) & 63) | 128);
                        bArr4[i17 + 3] = (byte) ((i16 & 63) | 128);
                        xVarP14.f20057c = i17 + 4;
                        l1(m1() + 4);
                        i7 += 2;
                    }
                }
                l1(jM1 + j7);
                i7++;
            }
        }
        return this;
    }

    @Override // i6.h
    public String C0() {
        return Z(Long.MAX_VALUE);
    }

    public f C1(int i7) {
        long jM1;
        long j7;
        if (i7 < 128) {
            P(i7);
        } else {
            if (i7 < 2048) {
                x xVarP1 = p1(2);
                byte[] bArr = xVarP1.f20055a;
                int i8 = xVarP1.f20057c;
                bArr[i8] = (byte) ((i7 >> 6) | 192);
                bArr[i8 + 1] = (byte) ((i7 & 63) | 128);
                xVarP1.f20057c = i8 + 2;
                jM1 = m1();
                j7 = 2;
            } else if (55296 <= i7 && 57343 >= i7) {
                P(63);
            } else if (i7 < 65536) {
                x xVarP12 = p1(3);
                byte[] bArr2 = xVarP12.f20055a;
                int i9 = xVarP12.f20057c;
                bArr2[i9] = (byte) ((i7 >> 12) | 224);
                bArr2[i9 + 1] = (byte) (((i7 >> 6) & 63) | 128);
                bArr2[i9 + 2] = (byte) ((i7 & 63) | 128);
                xVarP12.f20057c = i9 + 3;
                jM1 = m1();
                j7 = 3;
            } else {
                if (i7 > 1114111) {
                    throw new IllegalArgumentException("Unexpected code point: 0x" + AbstractC1751c.f(i7));
                }
                x xVarP13 = p1(4);
                byte[] bArr3 = xVarP13.f20055a;
                int i10 = xVarP13.f20057c;
                bArr3[i10] = (byte) ((i7 >> 18) | 240);
                bArr3[i10 + 1] = (byte) (((i7 >> 12) & 63) | 128);
                bArr3[i10 + 2] = (byte) (((i7 >> 6) & 63) | 128);
                bArr3[i10 + 3] = (byte) ((i7 & 63) | 128);
                xVarP13.f20057c = i10 + 4;
                jM1 = m1();
                j7 = 4;
            }
            l1(jM1 + j7);
        }
        return this;
    }

    public boolean D0(long j7, i iVar, int i7, int i8) {
        w5.k.f(iVar, "bytes");
        if (j7 < 0 || i7 < 0 || i8 < 0 || m1() - j7 < i8 || iVar.C() - i7 < i8) {
            return false;
        }
        for (int i9 = 0; i9 < i8; i9++) {
            if (z(((long) i9) + j7) != iVar.m(i7 + i9)) {
                return false;
            }
        }
        return true;
    }

    @Override // i6.h
    public int F() throws EOFException {
        if (m1() < 4) {
            throw new EOFException();
        }
        x xVar = this.f20007m;
        w5.k.c(xVar);
        int i7 = xVar.f20056b;
        int i8 = xVar.f20057c;
        if (i8 - i7 < 4) {
            return ((q0() & 255) << 24) | ((q0() & 255) << 16) | ((q0() & 255) << 8) | (q0() & 255);
        }
        byte[] bArr = xVar.f20055a;
        int i9 = i7 + 3;
        int i10 = ((bArr[i7 + 1] & 255) << 16) | ((bArr[i7] & 255) << 24) | ((bArr[i7 + 2] & 255) << 8);
        int i11 = i7 + 4;
        int i12 = (bArr[i9] & 255) | i10;
        l1(m1() - 4);
        if (i11 == i8) {
            this.f20007m = xVar.b();
            y.b(xVar);
        } else {
            xVar.f20056b = i11;
        }
        return i12;
    }

    @Override // i6.h
    public byte[] G0(long j7) throws EOFException {
        if (!(j7 >= 0 && j7 <= ((long) Api.BaseClientBuilder.API_PRIORITY_OTHER))) {
            throw new IllegalArgumentException(("byteCount: " + j7).toString());
        }
        if (m1() < j7) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j7];
        u0(bArr);
        return bArr;
    }

    public long J(i iVar) {
        w5.k.f(iVar, "bytes");
        return U(iVar, 0L);
    }

    @Override // i6.h
    public String J0() {
        return j1(this.f20008n, F5.d.f1104b);
    }

    @Override // i6.h
    public long K() throws EOFException {
        if (m1() < 8) {
            throw new EOFException();
        }
        x xVar = this.f20007m;
        w5.k.c(xVar);
        int i7 = xVar.f20056b;
        int i8 = xVar.f20057c;
        if (i8 - i7 < 8) {
            return ((((long) F()) & 4294967295L) << 32) | (4294967295L & ((long) F()));
        }
        byte[] bArr = xVar.f20055a;
        int i9 = i7 + 7;
        long j7 = ((((long) bArr[i7]) & 255) << 56) | ((((long) bArr[i7 + 1]) & 255) << 48) | ((((long) bArr[i7 + 2]) & 255) << 40) | ((((long) bArr[i7 + 3]) & 255) << 32) | ((((long) bArr[i7 + 4]) & 255) << 24) | ((((long) bArr[i7 + 5]) & 255) << 16) | ((((long) bArr[i7 + 6]) & 255) << 8);
        int i10 = i7 + 8;
        long j8 = j7 | (((long) bArr[i9]) & 255);
        l1(m1() - 8);
        if (i10 == i8) {
            this.f20007m = xVar.b();
            y.b(xVar);
        } else {
            xVar.f20056b = i10;
        }
        return j8;
    }

    @Override // i6.C
    public long L0(f fVar, long j7) {
        w5.k.f(fVar, "sink");
        if (!(j7 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j7).toString());
        }
        if (m1() == 0) {
            return -1L;
        }
        if (j7 > m1()) {
            j7 = m1();
        }
        fVar.w0(this, j7);
        return j7;
    }

    @Override // i6.h
    public byte[] M() {
        return G0(m1());
    }

    public int M0(byte[] bArr, int i7, int i8) {
        w5.k.f(bArr, "sink");
        AbstractC1751c.b(bArr.length, i7, i8);
        x xVar = this.f20007m;
        if (xVar == null) {
            return -1;
        }
        int iMin = Math.min(i8, xVar.f20057c - xVar.f20056b);
        byte[] bArr2 = xVar.f20055a;
        int i9 = xVar.f20056b;
        AbstractC1803h.d(bArr2, bArr, i7, i9, i9 + iMin);
        xVar.f20056b += iMin;
        l1(m1() - ((long) iMin));
        if (xVar.f20056b != xVar.f20057c) {
            return iMin;
        }
        this.f20007m = xVar.b();
        y.b(xVar);
        return iMin;
    }

    @Override // i6.h
    public boolean O() {
        return this.f20008n == 0;
    }

    @Override // i6.h
    public short O0() throws EOFException {
        if (m1() < 2) {
            throw new EOFException();
        }
        x xVar = this.f20007m;
        w5.k.c(xVar);
        int i7 = xVar.f20056b;
        int i8 = xVar.f20057c;
        if (i8 - i7 < 2) {
            return (short) (((q0() & 255) << 8) | (q0() & 255));
        }
        byte[] bArr = xVar.f20055a;
        int i9 = i7 + 1;
        int i10 = (bArr[i7] & 255) << 8;
        int i11 = i7 + 2;
        int i12 = (bArr[i9] & 255) | i10;
        l1(m1() - 2);
        if (i11 == i8) {
            this.f20007m = xVar.b();
            y.b(xVar);
        } else {
            xVar.f20056b = i11;
        }
        return (short) i12;
    }

    @Override // i6.h
    public int R(t tVar) throws EOFException {
        w5.k.f(tVar, "options");
        int iE = j6.a.e(this, tVar, false, 2, null);
        if (iE == -1) {
            return -1;
        }
        y0(tVar.k()[iE].C());
        return iE;
    }

    public final a R0(a aVar) {
        w5.k.f(aVar, "unsafeCursor");
        if (!(aVar.f20009m == null)) {
            throw new IllegalStateException("already attached to a buffer".toString());
        }
        aVar.f20009m = this;
        aVar.f20010n = true;
        return aVar;
    }

    public long U(i iVar, long j7) {
        long j8 = j7;
        w5.k.f(iVar, "bytes");
        if (!(iVar.C() > 0)) {
            throw new IllegalArgumentException("bytes is empty".toString());
        }
        long j9 = 0;
        if (!(j8 >= 0)) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j8).toString());
        }
        x xVar = this.f20007m;
        if (xVar != null) {
            if (m1() - j8 < j8) {
                long jM1 = m1();
                while (jM1 > j8) {
                    xVar = xVar.f20061g;
                    w5.k.c(xVar);
                    jM1 -= (long) (xVar.f20057c - xVar.f20056b);
                }
                byte[] bArrS = iVar.s();
                byte b7 = bArrS[0];
                int iC = iVar.C();
                long jM12 = (m1() - ((long) iC)) + 1;
                while (jM1 < jM12) {
                    byte[] bArr = xVar.f20055a;
                    long j10 = jM1;
                    int iMin = (int) Math.min(xVar.f20057c, (((long) xVar.f20056b) + jM12) - jM1);
                    for (int i7 = (int) ((((long) xVar.f20056b) + j8) - j10); i7 < iMin; i7++) {
                        if (bArr[i7] == b7 && j6.a.b(xVar, i7 + 1, bArrS, 1, iC)) {
                            return ((long) (i7 - xVar.f20056b)) + j10;
                        }
                    }
                    jM1 = j10 + ((long) (xVar.f20057c - xVar.f20056b));
                    xVar = xVar.f20060f;
                    w5.k.c(xVar);
                    j8 = jM1;
                }
            } else {
                while (true) {
                    long j11 = ((long) (xVar.f20057c - xVar.f20056b)) + j9;
                    if (j11 > j8) {
                        break;
                    }
                    xVar = xVar.f20060f;
                    w5.k.c(xVar);
                    j9 = j11;
                }
                byte[] bArrS2 = iVar.s();
                byte b8 = bArrS2[0];
                int iC2 = iVar.C();
                long jM13 = (m1() - ((long) iC2)) + 1;
                while (j9 < jM13) {
                    byte[] bArr2 = xVar.f20055a;
                    long j12 = jM13;
                    int iMin2 = (int) Math.min(xVar.f20057c, (((long) xVar.f20056b) + jM13) - j9);
                    for (int i8 = (int) ((((long) xVar.f20056b) + j8) - j9); i8 < iMin2; i8++) {
                        if (bArr2[i8] == b8 && j6.a.b(xVar, i8 + 1, bArrS2, 1, iC2)) {
                            return ((long) (i8 - xVar.f20056b)) + j9;
                        }
                    }
                    j9 += (long) (xVar.f20057c - xVar.f20056b);
                    xVar = xVar.f20060f;
                    w5.k.c(xVar);
                    j8 = j9;
                    jM13 = j12;
                }
            }
        }
        return -1L;
    }

    public long W(i iVar) {
        w5.k.f(iVar, "targetBytes");
        return h0(iVar, 0L);
    }

    @Override // i6.h
    public void W0(long j7) throws EOFException {
        if (this.f20008n < j7) {
            throw new EOFException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b3 A[EDGE_INSN: B:48:0x00b3->B:38:0x00b3 BREAK  A[LOOP:0: B:5:0x0011->B:50:?], SYNTHETIC] */
    @Override // i6.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long Y() throws EOFException {
        if (m1() == 0) {
            throw new EOFException();
        }
        int i7 = 0;
        boolean z6 = false;
        long j7 = -7;
        long j8 = 0;
        boolean z7 = false;
        do {
            x xVar = this.f20007m;
            w5.k.c(xVar);
            byte[] bArr = xVar.f20055a;
            int i8 = xVar.f20056b;
            int i9 = xVar.f20057c;
            while (i8 < i9) {
                byte b7 = bArr[i8];
                byte b8 = (byte) 48;
                if (b7 >= b8 && b7 <= ((byte) 57)) {
                    int i10 = b8 - b7;
                    if (j8 < -922337203685477580L || (j8 == -922337203685477580L && i10 < j7)) {
                        f fVarP = new f().X0(j8).P(b7);
                        if (!z6) {
                            fVarP.q0();
                        }
                        throw new NumberFormatException("Number too large: " + fVarP.J0());
                    }
                    j8 = (j8 * 10) + ((long) i10);
                } else if (b7 == ((byte) 45) && i7 == 0) {
                    j7--;
                    z6 = true;
                } else {
                    if (i7 == 0) {
                        throw new NumberFormatException("Expected leading [0-9] or '-' character but was 0x" + AbstractC1751c.e(b7));
                    }
                    z7 = true;
                    if (i8 != i9) {
                        this.f20007m = xVar.b();
                        y.b(xVar);
                    } else {
                        xVar.f20056b = i8;
                    }
                    if (!z7) {
                        break;
                    }
                }
                i8++;
                i7++;
            }
            if (i8 != i9) {
            }
            if (!z7) {
            }
        } while (this.f20007m != null);
        l1(m1() - ((long) i7));
        return z6 ? j8 : -j8;
    }

    @Override // i6.h
    public String Z(long j7) throws EOFException {
        if (!(j7 >= 0)) {
            throw new IllegalArgumentException(("limit < 0: " + j7).toString());
        }
        long j8 = j7 != Long.MAX_VALUE ? j7 + 1 : Long.MAX_VALUE;
        byte b7 = (byte) 10;
        long jB = B(b7, 0L, j8);
        if (jB != -1) {
            return j6.a.c(this, jB);
        }
        if (j8 < m1() && z(j8 - 1) == ((byte) 13) && z(j8) == b7) {
            return j6.a.c(this, j8);
        }
        f fVar = new f();
        g(fVar, 0L, Math.min(32, m1()));
        throw new EOFException("\\n not found: limit=" + Math.min(m1(), j7) + " content=" + fVar.f1().r() + (char) 8230);
    }

    @Override // i6.g
    public OutputStream Z0() {
        return new c();
    }

    public final void a() throws EOFException {
        y0(m1());
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public f clone() {
        return e();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ae A[EDGE_INSN: B:43:0x00ae->B:37:0x00ae BREAK  A[LOOP:0: B:5:0x000d->B:45:?], SYNTHETIC] */
    @Override // i6.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long c1() throws EOFException {
        int i7;
        if (m1() == 0) {
            throw new EOFException();
        }
        int i8 = 0;
        boolean z6 = false;
        long j7 = 0;
        do {
            x xVar = this.f20007m;
            w5.k.c(xVar);
            byte[] bArr = xVar.f20055a;
            int i9 = xVar.f20056b;
            int i10 = xVar.f20057c;
            while (i9 < i10) {
                byte b7 = bArr[i9];
                byte b8 = (byte) 48;
                if (b7 < b8 || b7 > ((byte) 57)) {
                    byte b9 = (byte) 97;
                    if ((b7 >= b9 && b7 <= ((byte) 102)) || (b7 >= (b9 = (byte) 65) && b7 <= ((byte) 70))) {
                        i7 = (b7 - b9) + 10;
                    } else {
                        if (i8 == 0) {
                            throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x" + AbstractC1751c.e(b7));
                        }
                        z6 = true;
                        if (i9 != i10) {
                            this.f20007m = xVar.b();
                            y.b(xVar);
                        } else {
                            xVar.f20056b = i9;
                        }
                        if (!z6) {
                            break;
                        }
                    }
                } else {
                    i7 = b7 - b8;
                }
                if (((-1152921504606846976L) & j7) != 0) {
                    throw new NumberFormatException("Number too large: " + new f().v0(j7).P(b7).J0());
                }
                j7 = (j7 << 4) | ((long) i7);
                i9++;
                i8++;
            }
            if (i9 != i10) {
            }
            if (!z6) {
            }
        } while (this.f20007m != null);
        l1(m1() - ((long) i8));
        return j7;
    }

    public final long d() {
        long jM1 = m1();
        if (jM1 == 0) {
            return 0L;
        }
        x xVar = this.f20007m;
        w5.k.c(xVar);
        x xVar2 = xVar.f20061g;
        w5.k.c(xVar2);
        int i7 = xVar2.f20057c;
        if (i7 < 8192 && xVar2.f20059e) {
            jM1 -= (long) (i7 - xVar2.f20056b);
        }
        return jM1;
    }

    @Override // i6.h
    public long d1(A a7) {
        w5.k.f(a7, "sink");
        long jM1 = m1();
        if (jM1 > 0) {
            a7.w0(this, jM1);
        }
        return jM1;
    }

    public final f e() {
        f fVar = new f();
        if (m1() != 0) {
            x xVar = this.f20007m;
            w5.k.c(xVar);
            x xVarD = xVar.d();
            fVar.f20007m = xVarD;
            xVarD.f20061g = xVarD;
            xVarD.f20060f = xVarD;
            for (x xVar2 = xVar.f20060f; xVar2 != xVar; xVar2 = xVar2.f20060f) {
                x xVar3 = xVarD.f20061g;
                w5.k.c(xVar3);
                w5.k.c(xVar2);
                xVar3.c(xVar2.d());
            }
            fVar.l1(m1());
        }
        return fVar;
    }

    @Override // i6.h
    public InputStream e1() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (m1() == fVar.m1()) {
                if (m1() == 0) {
                    return true;
                }
                x xVar = this.f20007m;
                w5.k.c(xVar);
                x xVar2 = fVar.f20007m;
                w5.k.c(xVar2);
                int i7 = xVar.f20056b;
                int i8 = xVar2.f20056b;
                long j7 = 0;
                while (j7 < m1()) {
                    long jMin = Math.min(xVar.f20057c - i7, xVar2.f20057c - i8);
                    long j8 = 0;
                    while (j8 < jMin) {
                        int i9 = i7 + 1;
                        int i10 = i8 + 1;
                        if (xVar.f20055a[i7] == xVar2.f20055a[i8]) {
                            j8++;
                            i7 = i9;
                            i8 = i10;
                        }
                    }
                    if (i7 == xVar.f20057c) {
                        xVar = xVar.f20060f;
                        w5.k.c(xVar);
                        i7 = xVar.f20056b;
                    }
                    if (i8 == xVar2.f20057c) {
                        xVar2 = xVar2.f20060f;
                        w5.k.c(xVar2);
                        i8 = xVar2.f20056b;
                    }
                    j7 += jMin;
                }
                return true;
            }
        }
        return false;
    }

    public i f1() {
        return t(m1());
    }

    public final f g(f fVar, long j7, long j8) {
        w5.k.f(fVar, "out");
        AbstractC1751c.b(m1(), j7, j8);
        if (j8 != 0) {
            fVar.l1(fVar.m1() + j8);
            x xVar = this.f20007m;
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
                w5.k.c(xVar);
                x xVarD = xVar.d();
                int i9 = xVarD.f20056b + ((int) j7);
                xVarD.f20056b = i9;
                xVarD.f20057c = Math.min(i9 + ((int) j8), xVarD.f20057c);
                x xVar2 = fVar.f20007m;
                if (xVar2 == null) {
                    xVarD.f20061g = xVarD;
                    xVarD.f20060f = xVarD;
                    fVar.f20007m = xVarD;
                } else {
                    w5.k.c(xVar2);
                    x xVar3 = xVar2.f20061g;
                    w5.k.c(xVar3);
                    xVar3.c(xVarD);
                }
                j8 -= (long) (xVarD.f20057c - xVarD.f20056b);
                xVar = xVar.f20060f;
                j7 = 0;
            }
        }
        return this;
    }

    public long h0(i iVar, long j7) {
        int i7;
        w5.k.f(iVar, "targetBytes");
        long jM1 = 0;
        if (!(j7 >= 0)) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j7).toString());
        }
        x xVar = this.f20007m;
        if (xVar == null) {
            return -1L;
        }
        if (m1() - j7 < j7) {
            jM1 = m1();
            while (jM1 > j7) {
                xVar = xVar.f20061g;
                w5.k.c(xVar);
                jM1 -= (long) (xVar.f20057c - xVar.f20056b);
            }
            if (iVar.C() == 2) {
                byte bM = iVar.m(0);
                byte bM2 = iVar.m(1);
                while (jM1 < m1()) {
                    byte[] bArr = xVar.f20055a;
                    i7 = (int) ((((long) xVar.f20056b) + j7) - jM1);
                    int i8 = xVar.f20057c;
                    while (i7 < i8) {
                        byte b7 = bArr[i7];
                        if (b7 != bM && b7 != bM2) {
                            i7++;
                        }
                    }
                    jM1 += (long) (xVar.f20057c - xVar.f20056b);
                    xVar = xVar.f20060f;
                    w5.k.c(xVar);
                    j7 = jM1;
                }
                return -1L;
            }
            byte[] bArrS = iVar.s();
            while (jM1 < m1()) {
                byte[] bArr2 = xVar.f20055a;
                i7 = (int) ((((long) xVar.f20056b) + j7) - jM1);
                int i9 = xVar.f20057c;
                while (i7 < i9) {
                    byte b8 = bArr2[i7];
                    for (byte b9 : bArrS) {
                        if (b8 != b9) {
                        }
                    }
                    i7++;
                }
                jM1 += (long) (xVar.f20057c - xVar.f20056b);
                xVar = xVar.f20060f;
                w5.k.c(xVar);
                j7 = jM1;
            }
            return -1L;
        }
        while (true) {
            long j8 = ((long) (xVar.f20057c - xVar.f20056b)) + jM1;
            if (j8 > j7) {
                break;
            }
            xVar = xVar.f20060f;
            w5.k.c(xVar);
            jM1 = j8;
        }
        if (iVar.C() == 2) {
            byte bM3 = iVar.m(0);
            byte bM4 = iVar.m(1);
            while (jM1 < m1()) {
                byte[] bArr3 = xVar.f20055a;
                i7 = (int) ((((long) xVar.f20056b) + j7) - jM1);
                int i10 = xVar.f20057c;
                while (i7 < i10) {
                    byte b10 = bArr3[i7];
                    if (b10 != bM3 && b10 != bM4) {
                        i7++;
                    }
                }
                jM1 += (long) (xVar.f20057c - xVar.f20056b);
                xVar = xVar.f20060f;
                w5.k.c(xVar);
                j7 = jM1;
            }
            return -1L;
        }
        byte[] bArrS2 = iVar.s();
        while (jM1 < m1()) {
            byte[] bArr4 = xVar.f20055a;
            i7 = (int) ((((long) xVar.f20056b) + j7) - jM1);
            int i11 = xVar.f20057c;
            while (i7 < i11) {
                byte b11 = bArr4[i7];
                for (byte b12 : bArrS2) {
                    if (b11 != b12) {
                    }
                }
                i7++;
            }
            jM1 += (long) (xVar.f20057c - xVar.f20056b);
            xVar = xVar.f20060f;
            w5.k.c(xVar);
            j7 = jM1;
        }
        return -1L;
        return ((long) (i7 - xVar.f20056b)) + jM1;
    }

    public int h1() {
        return AbstractC1751c.c(F());
    }

    public int hashCode() {
        x xVar = this.f20007m;
        if (xVar == null) {
            return 0;
        }
        int i7 = 1;
        do {
            int i8 = xVar.f20057c;
            for (int i9 = xVar.f20056b; i9 < i8; i9++) {
                i7 = (i7 * 31) + xVar.f20055a[i9];
            }
            xVar = xVar.f20060f;
            w5.k.c(xVar);
        } while (xVar != this.f20007m);
        return i7;
    }

    @Override // i6.C
    public D i() {
        return D.f19989d;
    }

    public short i1() {
        return AbstractC1751c.d(O0());
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    public boolean j0(long j7, i iVar) {
        w5.k.f(iVar, "bytes");
        return D0(j7, iVar, 0, iVar.C());
    }

    public String j1(long j7, Charset charset) throws EOFException {
        w5.k.f(charset, "charset");
        if (!(j7 >= 0 && j7 <= ((long) Api.BaseClientBuilder.API_PRIORITY_OTHER))) {
            throw new IllegalArgumentException(("byteCount: " + j7).toString());
        }
        if (this.f20008n < j7) {
            throw new EOFException();
        }
        if (j7 == 0) {
            return "";
        }
        x xVar = this.f20007m;
        w5.k.c(xVar);
        int i7 = xVar.f20056b;
        if (((long) i7) + j7 > xVar.f20057c) {
            return new String(G0(j7), charset);
        }
        int i8 = (int) j7;
        String str = new String(xVar.f20055a, i7, i8, charset);
        int i9 = xVar.f20056b + i8;
        xVar.f20056b = i9;
        this.f20008n -= j7;
        if (i9 == xVar.f20057c) {
            this.f20007m = xVar.b();
            y.b(xVar);
        }
        return str;
    }

    public String k1(long j7) throws EOFException {
        return j1(j7, F5.d.f1104b);
    }

    public final void l1(long j7) {
        this.f20008n = j7;
    }

    @Override // i6.h
    public void m0(f fVar, long j7) throws EOFException {
        w5.k.f(fVar, "sink");
        if (m1() >= j7) {
            fVar.w0(this, j7);
        } else {
            fVar.w0(this, m1());
            throw new EOFException();
        }
    }

    public final long m1() {
        return this.f20008n;
    }

    public final i n1() {
        if (m1() <= ((long) Api.BaseClientBuilder.API_PRIORITY_OTHER)) {
            return o1((int) m1());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + m1()).toString());
    }

    public final i o1(int i7) {
        if (i7 == 0) {
            return i.f20018p;
        }
        AbstractC1751c.b(m1(), 0L, i7);
        x xVar = this.f20007m;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i9 < i7) {
            w5.k.c(xVar);
            int i11 = xVar.f20057c;
            int i12 = xVar.f20056b;
            if (i11 == i12) {
                throw new AssertionError("s.limit == s.pos");
            }
            i9 += i11 - i12;
            i10++;
            xVar = xVar.f20060f;
        }
        byte[][] bArr = new byte[i10][];
        int[] iArr = new int[i10 * 2];
        x xVar2 = this.f20007m;
        int i13 = 0;
        while (i8 < i7) {
            w5.k.c(xVar2);
            bArr[i13] = xVar2.f20055a;
            i8 += xVar2.f20057c - xVar2.f20056b;
            iArr[i13] = Math.min(i8, i7);
            iArr[i13 + i10] = xVar2.f20056b;
            xVar2.f20058d = true;
            i13++;
            xVar2 = xVar2.f20060f;
        }
        return new z(bArr, iArr);
    }

    @Override // i6.h
    public String p0(Charset charset) {
        w5.k.f(charset, "charset");
        return j1(this.f20008n, charset);
    }

    public final x p1(int i7) {
        if (!(i7 >= 1 && i7 <= 8192)) {
            throw new IllegalArgumentException("unexpected capacity".toString());
        }
        x xVar = this.f20007m;
        if (xVar != null) {
            w5.k.c(xVar);
            x xVar2 = xVar.f20061g;
            w5.k.c(xVar2);
            return (xVar2.f20057c + i7 > 8192 || !xVar2.f20059e) ? xVar2.c(y.c()) : xVar2;
        }
        x xVarC = y.c();
        this.f20007m = xVarC;
        xVarC.f20061g = xVarC;
        xVarC.f20060f = xVarC;
        return xVarC;
    }

    @Override // i6.h
    public byte q0() throws EOFException {
        if (m1() == 0) {
            throw new EOFException();
        }
        x xVar = this.f20007m;
        w5.k.c(xVar);
        int i7 = xVar.f20056b;
        int i8 = xVar.f20057c;
        int i9 = i7 + 1;
        byte b7 = xVar.f20055a[i7];
        l1(m1() - 1);
        if (i9 == i8) {
            this.f20007m = xVar.b();
            y.b(xVar);
        } else {
            xVar.f20056b = i9;
        }
        return b7;
    }

    @Override // i6.g
    /* JADX INFO: renamed from: q1, reason: merged with bridge method [inline-methods] */
    public f H(i iVar) {
        w5.k.f(iVar, "byteString");
        iVar.H(this, 0, iVar.C());
        return this;
    }

    @Override // i6.g
    /* JADX INFO: renamed from: r1, reason: merged with bridge method [inline-methods] */
    public f K0(byte[] bArr) {
        w5.k.f(bArr, "source");
        return r0(bArr, 0, bArr.length);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        w5.k.f(byteBuffer, "sink");
        x xVar = this.f20007m;
        if (xVar == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), xVar.f20057c - xVar.f20056b);
        byteBuffer.put(xVar.f20055a, xVar.f20056b, iMin);
        int i7 = xVar.f20056b + iMin;
        xVar.f20056b = i7;
        this.f20008n -= (long) iMin;
        if (i7 == xVar.f20057c) {
            this.f20007m = xVar.b();
            y.b(xVar);
        }
        return iMin;
    }

    @Override // i6.g
    /* JADX INFO: renamed from: s1, reason: merged with bridge method [inline-methods] */
    public f r0(byte[] bArr, int i7, int i8) {
        w5.k.f(bArr, "source");
        long j7 = i8;
        AbstractC1751c.b(bArr.length, i7, j7);
        int i9 = i8 + i7;
        while (i7 < i9) {
            x xVarP1 = p1(1);
            int iMin = Math.min(i9 - i7, 8192 - xVarP1.f20057c);
            int i10 = i7 + iMin;
            AbstractC1803h.d(bArr, xVarP1.f20055a, xVarP1.f20057c, i7, i10);
            xVarP1.f20057c += iMin;
            i7 = i10;
        }
        l1(m1() + j7);
        return this;
    }

    @Override // i6.h
    public i t(long j7) throws EOFException {
        if (!(j7 >= 0 && j7 <= ((long) Api.BaseClientBuilder.API_PRIORITY_OTHER))) {
            throw new IllegalArgumentException(("byteCount: " + j7).toString());
        }
        if (m1() < j7) {
            throw new EOFException();
        }
        if (j7 < 4096) {
            return new i(G0(j7));
        }
        i iVarO1 = o1((int) j7);
        y0(j7);
        return iVarO1;
    }

    @Override // i6.g
    /* JADX INFO: renamed from: t1, reason: merged with bridge method [inline-methods] */
    public f P(int i7) {
        x xVarP1 = p1(1);
        byte[] bArr = xVarP1.f20055a;
        int i8 = xVarP1.f20057c;
        xVarP1.f20057c = i8 + 1;
        bArr[i8] = (byte) i7;
        l1(m1() + 1);
        return this;
    }

    public String toString() {
        return n1().toString();
    }

    @Override // i6.h
    public void u0(byte[] bArr) throws EOFException {
        w5.k.f(bArr, "sink");
        int i7 = 0;
        while (i7 < bArr.length) {
            int iM0 = M0(bArr, i7, bArr.length - i7);
            if (iM0 == -1) {
                throw new EOFException();
            }
            i7 += iM0;
        }
    }

    @Override // i6.g
    /* JADX INFO: renamed from: u1, reason: merged with bridge method [inline-methods] */
    public f X0(long j7) {
        boolean z6;
        if (j7 == 0) {
            return P(48);
        }
        int i7 = 1;
        if (j7 < 0) {
            j7 = -j7;
            if (j7 < 0) {
                return k0("-9223372036854775808");
            }
            z6 = true;
        } else {
            z6 = false;
        }
        if (j7 >= 100000000) {
            i7 = j7 < 1000000000000L ? j7 < 10000000000L ? j7 < 1000000000 ? 9 : 10 : j7 < 100000000000L ? 11 : 12 : j7 < 1000000000000000L ? j7 < 10000000000000L ? 13 : j7 < 100000000000000L ? 14 : 15 : j7 < 100000000000000000L ? j7 < 10000000000000000L ? 16 : 17 : j7 < 1000000000000000000L ? 18 : 19;
        } else if (j7 >= 10000) {
            i7 = j7 < 1000000 ? j7 < 100000 ? 5 : 6 : j7 < 10000000 ? 7 : 8;
        } else if (j7 >= 100) {
            i7 = j7 < 1000 ? 3 : 4;
        } else if (j7 >= 10) {
            i7 = 2;
        }
        if (z6) {
            i7++;
        }
        x xVarP1 = p1(i7);
        byte[] bArr = xVarP1.f20055a;
        int i8 = xVarP1.f20057c + i7;
        while (j7 != 0) {
            long j8 = 10;
            i8--;
            bArr[i8] = j6.a.a()[(int) (j7 % j8)];
            j7 /= j8;
        }
        if (z6) {
            bArr[i8 - 1] = (byte) 45;
        }
        xVarP1.f20057c += i7;
        l1(m1() + ((long) i7));
        return this;
    }

    @Override // i6.g
    /* JADX INFO: renamed from: v1, reason: merged with bridge method [inline-methods] */
    public f v0(long j7) {
        if (j7 == 0) {
            return P(48);
        }
        long j8 = (j7 >>> 1) | j7;
        long j9 = j8 | (j8 >>> 2);
        long j10 = j9 | (j9 >>> 4);
        long j11 = j10 | (j10 >>> 8);
        long j12 = j11 | (j11 >>> 16);
        long j13 = j12 | (j12 >>> 32);
        long j14 = j13 - ((j13 >>> 1) & 6148914691236517205L);
        long j15 = ((j14 >>> 2) & 3689348814741910323L) + (j14 & 3689348814741910323L);
        long j16 = ((j15 >>> 4) + j15) & 1085102592571150095L;
        long j17 = j16 + (j16 >>> 8);
        long j18 = j17 + (j17 >>> 16);
        int i7 = (int) ((((j18 & 63) + ((j18 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        x xVarP1 = p1(i7);
        byte[] bArr = xVarP1.f20055a;
        int i8 = xVarP1.f20057c;
        for (int i9 = (i8 + i7) - 1; i9 >= i8; i9--) {
            bArr[i9] = j6.a.a()[(int) (15 & j7)];
            j7 >>>= 4;
        }
        xVarP1.f20057c += i7;
        l1(m1() + ((long) i7));
        return this;
    }

    @Override // i6.A
    public void w0(f fVar, long j7) {
        x xVar;
        w5.k.f(fVar, "source");
        if (!(fVar != this)) {
            throw new IllegalArgumentException("source == this".toString());
        }
        AbstractC1751c.b(fVar.m1(), 0L, j7);
        while (j7 > 0) {
            x xVar2 = fVar.f20007m;
            w5.k.c(xVar2);
            int i7 = xVar2.f20057c;
            w5.k.c(fVar.f20007m);
            if (j7 < i7 - r2.f20056b) {
                x xVar3 = this.f20007m;
                if (xVar3 != null) {
                    w5.k.c(xVar3);
                    xVar = xVar3.f20061g;
                } else {
                    xVar = null;
                }
                if (xVar != null && xVar.f20059e) {
                    if ((((long) xVar.f20057c) + j7) - ((long) (xVar.f20058d ? 0 : xVar.f20056b)) <= 8192) {
                        x xVar4 = fVar.f20007m;
                        w5.k.c(xVar4);
                        xVar4.g(xVar, (int) j7);
                        fVar.l1(fVar.m1() - j7);
                        l1(m1() + j7);
                        return;
                    }
                }
                x xVar5 = fVar.f20007m;
                w5.k.c(xVar5);
                fVar.f20007m = xVar5.e((int) j7);
            }
            x xVar6 = fVar.f20007m;
            w5.k.c(xVar6);
            long j8 = xVar6.f20057c - xVar6.f20056b;
            fVar.f20007m = xVar6.b();
            x xVar7 = this.f20007m;
            if (xVar7 == null) {
                this.f20007m = xVar6;
                xVar6.f20061g = xVar6;
                xVar6.f20060f = xVar6;
            } else {
                w5.k.c(xVar7);
                x xVar8 = xVar7.f20061g;
                w5.k.c(xVar8);
                xVar8.c(xVar6).a();
            }
            fVar.l1(fVar.m1() - j8);
            l1(m1() + j8);
            j7 -= j8;
        }
    }

    @Override // i6.g
    /* JADX INFO: renamed from: w1, reason: merged with bridge method [inline-methods] */
    public f G(int i7) {
        x xVarP1 = p1(4);
        byte[] bArr = xVarP1.f20055a;
        int i8 = xVarP1.f20057c;
        bArr[i8] = (byte) ((i7 >>> 24) & 255);
        bArr[i8 + 1] = (byte) ((i7 >>> 16) & 255);
        bArr[i8 + 2] = (byte) ((i7 >>> 8) & 255);
        bArr[i8 + 3] = (byte) (i7 & 255);
        xVarP1.f20057c = i8 + 4;
        l1(m1() + 4);
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        w5.k.f(byteBuffer, "source");
        int iRemaining = byteBuffer.remaining();
        int i7 = iRemaining;
        while (i7 > 0) {
            x xVarP1 = p1(1);
            int iMin = Math.min(i7, 8192 - xVarP1.f20057c);
            byteBuffer.get(xVarP1.f20055a, xVarP1.f20057c, iMin);
            i7 -= iMin;
            xVarP1.f20057c += iMin;
        }
        this.f20008n += (long) iRemaining;
        return iRemaining;
    }

    @Override // i6.g
    public long x(C c7) {
        w5.k.f(c7, "source");
        long j7 = 0;
        while (true) {
            long jL0 = c7.L0(this, 8192);
            if (jL0 == -1) {
                return j7;
            }
            j7 += jL0;
        }
    }

    public f x1(long j7) {
        x xVarP1 = p1(8);
        byte[] bArr = xVarP1.f20055a;
        int i7 = xVarP1.f20057c;
        bArr[i7] = (byte) ((j7 >>> 56) & 255);
        bArr[i7 + 1] = (byte) ((j7 >>> 48) & 255);
        bArr[i7 + 2] = (byte) ((j7 >>> 40) & 255);
        bArr[i7 + 3] = (byte) ((j7 >>> 32) & 255);
        bArr[i7 + 4] = (byte) ((j7 >>> 24) & 255);
        bArr[i7 + 5] = (byte) ((j7 >>> 16) & 255);
        bArr[i7 + 6] = (byte) ((j7 >>> 8) & 255);
        bArr[i7 + 7] = (byte) (j7 & 255);
        xVarP1.f20057c = i7 + 8;
        l1(m1() + 8);
        return this;
    }

    @Override // i6.h
    public void y0(long j7) throws EOFException {
        while (j7 > 0) {
            x xVar = this.f20007m;
            if (xVar == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j7, xVar.f20057c - xVar.f20056b);
            long j8 = iMin;
            l1(m1() - j8);
            j7 -= j8;
            int i7 = xVar.f20056b + iMin;
            xVar.f20056b = i7;
            if (i7 == xVar.f20057c) {
                this.f20007m = xVar.b();
                y.b(xVar);
            }
        }
    }

    @Override // i6.g
    /* JADX INFO: renamed from: y1, reason: merged with bridge method [inline-methods] */
    public f C(int i7) {
        x xVarP1 = p1(2);
        byte[] bArr = xVarP1.f20055a;
        int i8 = xVarP1.f20057c;
        bArr[i8] = (byte) ((i7 >>> 8) & 255);
        bArr[i8 + 1] = (byte) (i7 & 255);
        xVarP1.f20057c = i8 + 2;
        l1(m1() + 2);
        return this;
    }

    public final byte z(long j7) {
        AbstractC1751c.b(m1(), j7, 1L);
        x xVar = this.f20007m;
        if (xVar == null) {
            w5.k.c(null);
            throw null;
        }
        if (m1() - j7 < j7) {
            long jM1 = m1();
            while (jM1 > j7) {
                xVar = xVar.f20061g;
                w5.k.c(xVar);
                jM1 -= (long) (xVar.f20057c - xVar.f20056b);
            }
            w5.k.c(xVar);
            return xVar.f20055a[(int) ((((long) xVar.f20056b) + j7) - jM1)];
        }
        long j8 = 0;
        while (true) {
            long j9 = ((long) (xVar.f20057c - xVar.f20056b)) + j8;
            if (j9 > j7) {
                w5.k.c(xVar);
                return xVar.f20055a[(int) ((((long) xVar.f20056b) + j7) - j8)];
            }
            xVar = xVar.f20060f;
            w5.k.c(xVar);
            j8 = j9;
        }
    }

    public f z1(String str, int i7, int i8, Charset charset) {
        w5.k.f(str, "string");
        w5.k.f(charset, "charset");
        if (!(i7 >= 0)) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i7).toString());
        }
        if (!(i8 >= i7)) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i8 + " < " + i7).toString());
        }
        if (!(i8 <= str.length())) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i8 + " > " + str.length()).toString());
        }
        if (w5.k.b(charset, F5.d.f1104b)) {
            return B1(str, i7, i8);
        }
        String strSubstring = str.substring(i7, i8);
        w5.k.e(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        if (strSubstring == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        byte[] bytes = strSubstring.getBytes(charset);
        w5.k.e(bytes, "(this as java.lang.String).getBytes(charset)");
        return r0(bytes, 0, bytes.length);
    }

    @Override // i6.C, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // i6.g, i6.A, java.io.Flushable
    public void flush() {
    }

    @Override // i6.h, i6.g
    public f h() {
        return this;
    }

    @Override // i6.g
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public f A() {
        return this;
    }

    @Override // i6.g
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public f X() {
        return this;
    }
}
