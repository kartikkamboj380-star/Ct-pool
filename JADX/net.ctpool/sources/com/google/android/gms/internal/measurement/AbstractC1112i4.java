package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.i4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1112i4 extends S3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f14618b = Logger.getLogger(AbstractC1112i4.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f14619c = M5.w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    C1139l4 f14620a;

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.i4$a */
    private static class a extends AbstractC1112i4 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final byte[] f14621d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f14622e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f14623f;

        a(byte[] bArr, int i7, int i8) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            if (((bArr.length - i8) | i8) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i8)));
            }
            this.f14621d = bArr;
            this.f14623f = 0;
            this.f14622e = i8;
        }

        private final void A0(byte[] bArr, int i7, int i8) throws b {
            try {
                System.arraycopy(bArr, i7, this.f14621d, this.f14623f, i8);
                this.f14623f += i8;
            } catch (IndexOutOfBoundsException e7) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f14623f), Integer.valueOf(this.f14622e), Integer.valueOf(i8)), e7);
            }
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC1112i4
        public final void H(int i7) {
            if (i7 >= 0) {
                U(i7);
            } else {
                N(i7);
            }
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC1112i4
        public final void K(int i7, int i8) {
            V(i7, 0);
            H(i8);
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC1112i4
        public final void L(int i7, long j7) {
            V(i7, 0);
            N(j7);
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC1112i4
        public final void M(int i7, R3 r32) {
            V(1, 3);
            b0(2, i7);
            n(3, r32);
            V(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC1112i4
        public final void N(long j7) throws b {
            if (AbstractC1112i4.f14619c && b() >= 10) {
                while ((j7 & (-128)) != 0) {
                    byte[] bArr = this.f14621d;
                    int i7 = this.f14623f;
                    this.f14623f = i7 + 1;
                    M5.m(bArr, i7, (byte) (((int) j7) | 128));
                    j7 >>>= 7;
                }
                byte[] bArr2 = this.f14621d;
                int i8 = this.f14623f;
                this.f14623f = i8 + 1;
                M5.m(bArr2, i8, (byte) j7);
                return;
            }
            while ((j7 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f14621d;
                    int i9 = this.f14623f;
                    this.f14623f = i9 + 1;
                    bArr3[i9] = (byte) (((int) j7) | 128);
                    j7 >>>= 7;
                } catch (IndexOutOfBoundsException e7) {
                    throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f14623f), Integer.valueOf(this.f14622e), 1), e7);
                }
            }
            byte[] bArr4 = this.f14621d;
            int i10 = this.f14623f;
            this.f14623f = i10 + 1;
            bArr4[i10] = (byte) j7;
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC1112i4
        public final void U(int i7) throws b {
            while ((i7 & (-128)) != 0) {
                try {
                    byte[] bArr = this.f14621d;
                    int i8 = this.f14623f;
                    this.f14623f = i8 + 1;
                    bArr[i8] = (byte) (i7 | 128);
                    i7 >>>= 7;
                } catch (IndexOutOfBoundsException e7) {
                    throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f14623f), Integer.valueOf(this.f14622e), 1), e7);
                }
            }
            byte[] bArr2 = this.f14621d;
            int i9 = this.f14623f;
            this.f14623f = i9 + 1;
            bArr2[i9] = (byte) i7;
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC1112i4
        public final void V(int i7, int i8) {
            U((i7 << 3) | i8);
        }

        @Override // com.google.android.gms.internal.measurement.S3
        public final void a(byte[] bArr, int i7, int i8) throws b {
            A0(bArr, i7, i8);
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC1112i4
        public final int b() {
            return this.f14622e - this.f14623f;
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC1112i4
        public final void b0(int i7, int i8) {
            V(i7, 0);
            U(i8);
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC1112i4
        public final void j(byte b7) throws b {
            int i7 = this.f14623f;
            try {
                int i8 = i7 + 1;
                try {
                    this.f14621d[i7] = b7;
                    this.f14623f = i8;
                } catch (IndexOutOfBoundsException e7) {
                    e = e7;
                    i7 = i8;
                    throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(i7), Integer.valueOf(this.f14622e), 1), e);
                }
            } catch (IndexOutOfBoundsException e8) {
                e = e8;
            }
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC1112i4
        public final void k(int i7) throws b {
            try {
                byte[] bArr = this.f14621d;
                int i8 = this.f14623f;
                bArr[i8] = (byte) i7;
                bArr[i8 + 1] = (byte) (i7 >> 8);
                bArr[i8 + 2] = (byte) (i7 >> 16);
                this.f14623f = i8 + 4;
                bArr[i8 + 3] = (byte) (i7 >>> 24);
            } catch (IndexOutOfBoundsException e7) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f14623f), Integer.valueOf(this.f14622e), 1), e7);
            }
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC1112i4
        public final void l(int i7, int i8) {
            V(i7, 5);
            k(i8);
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC1112i4
        public final void m(int i7, long j7) {
            V(i7, 1);
            s(j7);
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC1112i4
        public final void n(int i7, R3 r32) {
            V(i7, 2);
            t(r32);
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC1112i4
        public final void o(int i7, InterfaceC1095g5 interfaceC1095g5) {
            V(1, 3);
            b0(2, i7);
            V(3, 2);
            u(interfaceC1095g5);
            V(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC1112i4
        final void p(int i7, InterfaceC1095g5 interfaceC1095g5, InterfaceC1229v5 interfaceC1229v5) {
            V(i7, 2);
            U(((J3) interfaceC1095g5).e(interfaceC1229v5));
            interfaceC1229v5.b(interfaceC1095g5, this.f14620a);
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC1112i4
        public final void q(int i7, String str) {
            V(i7, 2);
            v(str);
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC1112i4
        public final void r(int i7, boolean z6) {
            V(i7, 0);
            j(z6 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC1112i4
        public final void s(long j7) throws b {
            try {
                byte[] bArr = this.f14621d;
                int i7 = this.f14623f;
                bArr[i7] = (byte) j7;
                bArr[i7 + 1] = (byte) (j7 >> 8);
                bArr[i7 + 2] = (byte) (j7 >> 16);
                bArr[i7 + 3] = (byte) (j7 >> 24);
                bArr[i7 + 4] = (byte) (j7 >> 32);
                bArr[i7 + 5] = (byte) (j7 >> 40);
                bArr[i7 + 6] = (byte) (j7 >> 48);
                this.f14623f = i7 + 8;
                bArr[i7 + 7] = (byte) (j7 >> 56);
            } catch (IndexOutOfBoundsException e7) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f14623f), Integer.valueOf(this.f14622e), 1), e7);
            }
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC1112i4
        public final void t(R3 r32) {
            U(r32.r());
            r32.p(this);
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC1112i4
        public final void u(InterfaceC1095g5 interfaceC1095g5) {
            U(interfaceC1095g5.d());
            interfaceC1095g5.a(this);
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC1112i4
        public final void v(String str) throws b {
            int i7 = this.f14623f;
            try {
                int iV0 = AbstractC1112i4.v0(str.length() * 3);
                int iV02 = AbstractC1112i4.v0(str.length());
                if (iV02 != iV0) {
                    U(Q5.a(str));
                    this.f14623f = Q5.b(str, this.f14621d, this.f14623f, b());
                    return;
                }
                int i8 = i7 + iV02;
                this.f14623f = i8;
                int iB = Q5.b(str, this.f14621d, i8, b());
                this.f14623f = i7;
                U((iB - i7) - iV02);
                this.f14623f = iB;
            } catch (U5 e7) {
                this.f14623f = i7;
                w(str, e7);
            } catch (IndexOutOfBoundsException e8) {
                throw new b(e8);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.i4$b */
    public static class b extends IOException {
        b(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }

        b(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    private AbstractC1112i4() {
    }

    public static int A(R3 r32) {
        int iR = r32.r();
        return v0(iR) + iR;
    }

    public static int B(InterfaceC1095g5 interfaceC1095g5) {
        return interfaceC1095g5.d();
    }

    public static int C(String str) {
        int length;
        try {
            length = Q5.a(str);
        } catch (U5 unused) {
            length = str.getBytes(B4.f14139a).length;
        }
        return v0(length) + length;
    }

    public static AbstractC1112i4 D(byte[] bArr) {
        return new a(bArr, 0, bArr.length);
    }

    public static int P(int i7, long j7) {
        return v0(i7 << 3) + 8;
    }

    public static int Q(int i7, R3 r32) {
        int iV0 = v0(i7 << 3);
        int iR = r32.r();
        return iV0 + v0(iR) + iR;
    }

    static int R(int i7, InterfaceC1095g5 interfaceC1095g5, InterfaceC1229v5 interfaceC1229v5) {
        return v0(i7 << 3) + g(interfaceC1095g5, interfaceC1229v5);
    }

    public static int S(long j7) {
        return 8;
    }

    public static int T(InterfaceC1095g5 interfaceC1095g5) {
        int iD = interfaceC1095g5.d();
        return v0(iD) + iD;
    }

    public static int X(int i7) {
        return n0(i7);
    }

    public static int Y(int i7, long j7) {
        return v0(i7 << 3) + n0(j7);
    }

    public static int Z(int i7, R3 r32) {
        return (v0(8) << 1) + w0(2, i7) + Q(3, r32);
    }

    public static int a0(long j7) {
        return n0(j7);
    }

    public static int c(double d7) {
        return 8;
    }

    public static int c0(int i7) {
        return 4;
    }

    public static int d(float f7) {
        return 4;
    }

    public static int d0(int i7, int i8) {
        return v0(i7 << 3) + n0(i8);
    }

    public static int e(int i7, double d7) {
        return v0(i7 << 3) + 8;
    }

    public static int e0(int i7, long j7) {
        return v0(i7 << 3) + 8;
    }

    public static int f(int i7, float f7) {
        return v0(i7 << 3) + 4;
    }

    public static int f0(long j7) {
        return 8;
    }

    static int g(InterfaceC1095g5 interfaceC1095g5, InterfaceC1229v5 interfaceC1229v5) {
        int iE = ((J3) interfaceC1095g5).e(interfaceC1229v5);
        return v0(iE) + iE;
    }

    public static int g0(int i7) {
        return n0(i7);
    }

    public static int h(boolean z6) {
        return 1;
    }

    public static int h0(int i7, int i8) {
        return v0(i7 << 3) + 4;
    }

    public static int i(byte[] bArr) {
        int length = bArr.length;
        return v0(length) + length;
    }

    public static int i0(int i7, long j7) {
        return v0(i7 << 3) + n0(u0(j7));
    }

    public static int j0(long j7) {
        return n0(u0(j7));
    }

    public static int k0(int i7) {
        return 4;
    }

    public static int l0(int i7, int i8) {
        return v0(i7 << 3) + n0(i8);
    }

    public static int m0(int i7, long j7) {
        return v0(i7 << 3) + n0(j7);
    }

    public static int n0(long j7) {
        return (640 - (Long.numberOfLeadingZeros(j7) * 9)) >>> 6;
    }

    public static int o0(int i7) {
        return v0(z0(i7));
    }

    public static int p0(int i7, int i8) {
        return v0(i7 << 3) + 4;
    }

    public static int s0(int i7) {
        return v0(i7 << 3);
    }

    public static int t0(int i7, int i8) {
        return v0(i7 << 3) + v0(z0(i8));
    }

    private static long u0(long j7) {
        return (j7 >> 63) ^ (j7 << 1);
    }

    public static int v0(int i7) {
        return (352 - (Integer.numberOfLeadingZeros(i7) * 9)) >>> 6;
    }

    public static int w0(int i7, int i8) {
        return v0(i7 << 3) + v0(i8);
    }

    static int x(int i7, InterfaceC1095g5 interfaceC1095g5, InterfaceC1229v5 interfaceC1229v5) {
        return (v0(i7 << 3) << 1) + ((J3) interfaceC1095g5).e(interfaceC1229v5);
    }

    public static int y(int i7, String str) {
        return v0(i7 << 3) + C(str);
    }

    public static int z(int i7, boolean z6) {
        return v0(i7 << 3) + 1;
    }

    private static int z0(int i7) {
        return (i7 >> 31) ^ (i7 << 1);
    }

    public final void E() {
        if (b() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void F(double d7) {
        s(Double.doubleToRawLongBits(d7));
    }

    public final void G(float f7) {
        k(Float.floatToRawIntBits(f7));
    }

    public abstract void H(int i7);

    public final void I(int i7, double d7) {
        m(i7, Double.doubleToRawLongBits(d7));
    }

    public final void J(int i7, float f7) {
        l(i7, Float.floatToRawIntBits(f7));
    }

    public abstract void K(int i7, int i8);

    public abstract void L(int i7, long j7);

    public abstract void M(int i7, R3 r32);

    public abstract void N(long j7);

    public final void O(boolean z6) {
        j(z6 ? (byte) 1 : (byte) 0);
    }

    public abstract void U(int i7);

    public abstract void V(int i7, int i8);

    public abstract int b();

    public abstract void b0(int i7, int i8);

    public abstract void j(byte b7);

    public abstract void k(int i7);

    public abstract void l(int i7, int i8);

    public abstract void m(int i7, long j7);

    public abstract void n(int i7, R3 r32);

    public abstract void o(int i7, InterfaceC1095g5 interfaceC1095g5);

    abstract void p(int i7, InterfaceC1095g5 interfaceC1095g5, InterfaceC1229v5 interfaceC1229v5);

    public abstract void q(int i7, String str);

    public final void q0(int i7, long j7) {
        L(i7, u0(j7));
    }

    public abstract void r(int i7, boolean z6);

    public final void r0(long j7) {
        N(u0(j7));
    }

    public abstract void s(long j7);

    public abstract void t(R3 r32);

    public abstract void u(InterfaceC1095g5 interfaceC1095g5);

    public abstract void v(String str);

    final void w(String str, U5 u52) throws b {
        f14618b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) u52);
        byte[] bytes = str.getBytes(B4.f14139a);
        try {
            U(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e7) {
            throw new b(e7);
        }
    }

    public final void x0(int i7) {
        U(z0(i7));
    }

    public final void y0(int i7, int i8) {
        b0(i7, z0(i8));
    }
}
