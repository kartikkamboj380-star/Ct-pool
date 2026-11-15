package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.q0;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0615j extends AbstractC0611f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Logger f7644c = Logger.getLogger(AbstractC0615j.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean f7645d = p0.C();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    C0616k f7646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f7647b;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.j$b */
    private static abstract class b extends AbstractC0615j {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final byte[] f7648e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final int f7649f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f7650g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f7651h;

        b(int i7) {
            super();
            if (i7 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i7, 20)];
            this.f7648e = bArr;
            this.f7649f = bArr.length;
        }

        final void S0(byte b7) {
            byte[] bArr = this.f7648e;
            int i7 = this.f7650g;
            this.f7650g = i7 + 1;
            bArr[i7] = b7;
            this.f7651h++;
        }

        final void T0(int i7) {
            byte[] bArr = this.f7648e;
            int i8 = this.f7650g;
            bArr[i8] = (byte) (i7 & 255);
            bArr[i8 + 1] = (byte) ((i7 >> 8) & 255);
            bArr[i8 + 2] = (byte) ((i7 >> 16) & 255);
            this.f7650g = i8 + 4;
            bArr[i8 + 3] = (byte) ((i7 >> 24) & 255);
            this.f7651h += 4;
        }

        final void U0(long j7) {
            byte[] bArr = this.f7648e;
            int i7 = this.f7650g;
            bArr[i7] = (byte) (j7 & 255);
            bArr[i7 + 1] = (byte) ((j7 >> 8) & 255);
            bArr[i7 + 2] = (byte) ((j7 >> 16) & 255);
            bArr[i7 + 3] = (byte) (255 & (j7 >> 24));
            bArr[i7 + 4] = (byte) (((int) (j7 >> 32)) & 255);
            bArr[i7 + 5] = (byte) (((int) (j7 >> 40)) & 255);
            bArr[i7 + 6] = (byte) (((int) (j7 >> 48)) & 255);
            this.f7650g = i7 + 8;
            bArr[i7 + 7] = (byte) (((int) (j7 >> 56)) & 255);
            this.f7651h += 8;
        }

        final void V0(int i7) {
            if (i7 >= 0) {
                X0(i7);
            } else {
                Y0(i7);
            }
        }

        final void W0(int i7, int i8) {
            X0(r0.c(i7, i8));
        }

        final void X0(int i7) {
            if (!AbstractC0615j.f7645d) {
                while ((i7 & (-128)) != 0) {
                    byte[] bArr = this.f7648e;
                    int i8 = this.f7650g;
                    this.f7650g = i8 + 1;
                    bArr[i8] = (byte) ((i7 & ModuleDescriptor.MODULE_VERSION) | 128);
                    this.f7651h++;
                    i7 >>>= 7;
                }
                byte[] bArr2 = this.f7648e;
                int i9 = this.f7650g;
                this.f7650g = i9 + 1;
                bArr2[i9] = (byte) i7;
                this.f7651h++;
                return;
            }
            long j7 = this.f7650g;
            while ((i7 & (-128)) != 0) {
                byte[] bArr3 = this.f7648e;
                int i10 = this.f7650g;
                this.f7650g = i10 + 1;
                p0.H(bArr3, i10, (byte) ((i7 & ModuleDescriptor.MODULE_VERSION) | 128));
                i7 >>>= 7;
            }
            byte[] bArr4 = this.f7648e;
            int i11 = this.f7650g;
            this.f7650g = i11 + 1;
            p0.H(bArr4, i11, (byte) i7);
            this.f7651h += (int) (((long) this.f7650g) - j7);
        }

        final void Y0(long j7) {
            if (!AbstractC0615j.f7645d) {
                while ((j7 & (-128)) != 0) {
                    byte[] bArr = this.f7648e;
                    int i7 = this.f7650g;
                    this.f7650g = i7 + 1;
                    bArr[i7] = (byte) ((((int) j7) & ModuleDescriptor.MODULE_VERSION) | 128);
                    this.f7651h++;
                    j7 >>>= 7;
                }
                byte[] bArr2 = this.f7648e;
                int i8 = this.f7650g;
                this.f7650g = i8 + 1;
                bArr2[i8] = (byte) j7;
                this.f7651h++;
                return;
            }
            long j8 = this.f7650g;
            while ((j7 & (-128)) != 0) {
                byte[] bArr3 = this.f7648e;
                int i9 = this.f7650g;
                this.f7650g = i9 + 1;
                p0.H(bArr3, i9, (byte) ((((int) j7) & ModuleDescriptor.MODULE_VERSION) | 128));
                j7 >>>= 7;
            }
            byte[] bArr4 = this.f7648e;
            int i10 = this.f7650g;
            this.f7650g = i10 + 1;
            p0.H(bArr4, i10, (byte) j7);
            this.f7651h += (int) (((long) this.f7650g) - j8);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.j$c */
    public static class c extends IOException {
        c(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.j$d */
    private static final class d extends b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final OutputStream f7652i;

        d(OutputStream outputStream, int i7) {
            super(i7);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.f7652i = outputStream;
        }

        private void Z0() throws IOException {
            this.f7652i.write(this.f7648e, 0, this.f7650g);
            this.f7650g = 0;
        }

        private void a1(int i7) throws IOException {
            if (this.f7649f - this.f7650g < i7) {
                Z0();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0615j
        public void A0(O o6) throws IOException {
            P0(o6.c());
            o6.d(this);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0615j
        public void B0(int i7, O o6) throws IOException {
            N0(1, 3);
            O0(2, i7);
            c1(3, o6);
            N0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0615j
        public void C0(int i7, AbstractC0612g abstractC0612g) throws IOException {
            N0(1, 3);
            O0(2, i7);
            f0(3, abstractC0612g);
            N0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0615j
        public void L0(int i7, String str) throws IOException {
            N0(i7, 2);
            M0(str);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0615j
        public void M0(String str) throws IOException {
            int iG;
            try {
                int length = str.length() * 3;
                int iR = AbstractC0615j.R(length);
                int i7 = iR + length;
                int i8 = this.f7649f;
                if (i7 > i8) {
                    byte[] bArr = new byte[length];
                    int iF = q0.f(str, bArr, 0, length);
                    P0(iF);
                    a(bArr, 0, iF);
                    return;
                }
                if (i7 > i8 - this.f7650g) {
                    Z0();
                }
                int iR2 = AbstractC0615j.R(str.length());
                int i9 = this.f7650g;
                try {
                    if (iR2 == iR) {
                        int i10 = i9 + iR2;
                        this.f7650g = i10;
                        int iF2 = q0.f(str, this.f7648e, i10, this.f7649f - i10);
                        this.f7650g = i9;
                        iG = (iF2 - i9) - iR2;
                        X0(iG);
                        this.f7650g = iF2;
                    } else {
                        iG = q0.g(str);
                        X0(iG);
                        this.f7650g = q0.f(str, this.f7648e, this.f7650g, iG);
                    }
                    this.f7651h += iG;
                } catch (q0.d e7) {
                    this.f7651h -= this.f7650g - i9;
                    this.f7650g = i9;
                    throw e7;
                } catch (ArrayIndexOutOfBoundsException e8) {
                    throw new c(e8);
                }
            } catch (q0.d e9) {
                X(str, e9);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0615j
        public void N0(int i7, int i8) throws IOException {
            P0(r0.c(i7, i8));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0615j
        public void O0(int i7, int i8) throws IOException {
            a1(20);
            W0(i7, 0);
            X0(i8);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0615j
        public void P0(int i7) throws IOException {
            a1(5);
            X0(i7);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0615j
        public void Q0(int i7, long j7) throws IOException {
            a1(20);
            W0(i7, 0);
            Y0(j7);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0615j
        public void R0(long j7) throws IOException {
            a1(10);
            Y0(j7);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0615j
        public void W() throws IOException {
            if (this.f7650g > 0) {
                Z0();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0615j, androidx.datastore.preferences.protobuf.AbstractC0611f
        public void a(byte[] bArr, int i7, int i8) throws IOException {
            b1(bArr, i7, i8);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0615j
        public void a0(byte b7) throws IOException {
            if (this.f7650g == this.f7649f) {
                Z0();
            }
            S0(b7);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0615j
        public void b0(int i7, boolean z6) throws IOException {
            a1(11);
            W0(i7, 0);
            S0(z6 ? (byte) 1 : (byte) 0);
        }

        public void b1(byte[] bArr, int i7, int i8) throws IOException {
            int i9 = this.f7649f;
            int i10 = this.f7650g;
            if (i9 - i10 >= i8) {
                System.arraycopy(bArr, i7, this.f7648e, i10, i8);
                this.f7650g += i8;
            } else {
                int i11 = i9 - i10;
                System.arraycopy(bArr, i7, this.f7648e, i10, i11);
                int i12 = i7 + i11;
                i8 -= i11;
                this.f7650g = this.f7649f;
                this.f7651h += i11;
                Z0();
                if (i8 <= this.f7649f) {
                    System.arraycopy(bArr, i12, this.f7648e, 0, i8);
                    this.f7650g = i8;
                } else {
                    this.f7652i.write(bArr, i12, i8);
                }
            }
            this.f7651h += i8;
        }

        public void c1(int i7, O o6) throws IOException {
            N0(i7, 2);
            A0(o6);
        }

        void d1(O o6, e0 e0Var) throws IOException {
            P0(((AbstractC0606a) o6).h(e0Var));
            e0Var.e(o6, this.f7646a);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0615j
        public void e0(byte[] bArr, int i7, int i8) throws IOException {
            P0(i8);
            b1(bArr, i7, i8);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0615j
        public void f0(int i7, AbstractC0612g abstractC0612g) throws IOException {
            N0(i7, 2);
            g0(abstractC0612g);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0615j
        public void g0(AbstractC0612g abstractC0612g) throws IOException {
            P0(abstractC0612g.size());
            abstractC0612g.C(this);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0615j
        public void l0(int i7, int i8) throws IOException {
            a1(14);
            W0(i7, 5);
            T0(i8);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0615j
        public void m0(int i7) throws IOException {
            a1(4);
            T0(i7);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0615j
        public void n0(int i7, long j7) throws IOException {
            a1(18);
            W0(i7, 1);
            U0(j7);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0615j
        public void o0(long j7) throws IOException {
            a1(8);
            U0(j7);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0615j
        public void v0(int i7, int i8) throws IOException {
            a1(20);
            W0(i7, 0);
            V0(i8);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0615j
        public void w0(int i7) throws IOException {
            if (i7 >= 0) {
                P0(i7);
            } else {
                R0(i7);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0615j
        void z0(int i7, O o6, e0 e0Var) throws IOException {
            N0(i7, 2);
            d1(o6, e0Var);
        }
    }

    private AbstractC0615j() {
    }

    public static int A(O o6) {
        return y(o6.c());
    }

    static int B(O o6, e0 e0Var) {
        return y(((AbstractC0606a) o6).h(e0Var));
    }

    static int C(int i7) {
        if (i7 > 4096) {
            return 4096;
        }
        return i7;
    }

    public static int D(int i7, AbstractC0612g abstractC0612g) {
        return (P(1) * 2) + Q(2, i7) + f(3, abstractC0612g);
    }

    public static int E(int i7) {
        return R(i7);
    }

    public static int F(int i7, int i8) {
        return P(i7) + G(i8);
    }

    public static int G(int i7) {
        return 4;
    }

    public static int H(int i7, long j7) {
        return P(i7) + I(j7);
    }

    public static int I(long j7) {
        return 8;
    }

    public static int J(int i7, int i8) {
        return P(i7) + K(i8);
    }

    public static int K(int i7) {
        return R(U(i7));
    }

    public static int L(int i7, long j7) {
        return P(i7) + M(j7);
    }

    public static int M(long j7) {
        return T(V(j7));
    }

    public static int N(int i7, String str) {
        return P(i7) + O(str);
    }

    public static int O(String str) {
        int length;
        try {
            length = q0.g(str);
        } catch (q0.d unused) {
            length = str.getBytes(AbstractC0629y.f7830a).length;
        }
        return y(length);
    }

    public static int P(int i7) {
        return R(r0.c(i7, 0));
    }

    public static int Q(int i7, int i8) {
        return P(i7) + R(i8);
    }

    public static int R(int i7) {
        if ((i7 & (-128)) == 0) {
            return 1;
        }
        if ((i7 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i7) == 0) {
            return 3;
        }
        return (i7 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int S(int i7, long j7) {
        return P(i7) + T(j7);
    }

    public static int T(long j7) {
        int i7;
        if (((-128) & j7) == 0) {
            return 1;
        }
        if (j7 < 0) {
            return 10;
        }
        if (((-34359738368L) & j7) != 0) {
            j7 >>>= 28;
            i7 = 6;
        } else {
            i7 = 2;
        }
        if (((-2097152) & j7) != 0) {
            i7 += 2;
            j7 >>>= 14;
        }
        return (j7 & (-16384)) != 0 ? i7 + 1 : i7;
    }

    public static int U(int i7) {
        return (i7 >> 31) ^ (i7 << 1);
    }

    public static long V(long j7) {
        return (j7 >> 63) ^ (j7 << 1);
    }

    public static AbstractC0615j Z(OutputStream outputStream, int i7) {
        return new d(outputStream, i7);
    }

    public static int c(int i7, boolean z6) {
        return P(i7) + d(z6);
    }

    public static int d(boolean z6) {
        return 1;
    }

    public static int e(byte[] bArr) {
        return y(bArr.length);
    }

    public static int f(int i7, AbstractC0612g abstractC0612g) {
        return P(i7) + g(abstractC0612g);
    }

    public static int g(AbstractC0612g abstractC0612g) {
        return y(abstractC0612g.size());
    }

    public static int h(int i7, double d7) {
        return P(i7) + i(d7);
    }

    public static int i(double d7) {
        return 8;
    }

    public static int j(int i7, int i8) {
        return P(i7) + k(i8);
    }

    public static int k(int i7) {
        return v(i7);
    }

    public static int l(int i7, int i8) {
        return P(i7) + m(i8);
    }

    public static int m(int i7) {
        return 4;
    }

    public static int n(int i7, long j7) {
        return P(i7) + o(j7);
    }

    public static int o(long j7) {
        return 8;
    }

    public static int p(int i7, float f7) {
        return P(i7) + q(f7);
    }

    public static int q(float f7) {
        return 4;
    }

    static int r(int i7, O o6, e0 e0Var) {
        return (P(i7) * 2) + t(o6, e0Var);
    }

    public static int s(O o6) {
        return o6.c();
    }

    static int t(O o6, e0 e0Var) {
        return ((AbstractC0606a) o6).h(e0Var);
    }

    public static int u(int i7, int i8) {
        return P(i7) + v(i8);
    }

    public static int v(int i7) {
        if (i7 >= 0) {
            return R(i7);
        }
        return 10;
    }

    public static int w(int i7, long j7) {
        return P(i7) + x(j7);
    }

    public static int x(long j7) {
        return T(j7);
    }

    static int y(int i7) {
        return R(i7) + i7;
    }

    static int z(int i7, O o6, e0 e0Var) {
        return P(i7) + B(o6, e0Var);
    }

    public abstract void A0(O o6);

    public abstract void B0(int i7, O o6);

    public abstract void C0(int i7, AbstractC0612g abstractC0612g);

    public final void D0(int i7, int i8) {
        l0(i7, i8);
    }

    public final void E0(int i7) {
        m0(i7);
    }

    public final void F0(int i7, long j7) {
        n0(i7, j7);
    }

    public final void G0(long j7) {
        o0(j7);
    }

    public final void H0(int i7, int i8) {
        O0(i7, U(i8));
    }

    public final void I0(int i7) {
        P0(U(i7));
    }

    public final void J0(int i7, long j7) {
        Q0(i7, V(j7));
    }

    public final void K0(long j7) {
        R0(V(j7));
    }

    public abstract void L0(int i7, String str);

    public abstract void M0(String str);

    public abstract void N0(int i7, int i8);

    public abstract void O0(int i7, int i8);

    public abstract void P0(int i7);

    public abstract void Q0(int i7, long j7);

    public abstract void R0(long j7);

    public abstract void W();

    final void X(String str, q0.d dVar) throws c {
        f7644c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(AbstractC0629y.f7830a);
        try {
            P0(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (c e7) {
            throw e7;
        } catch (IndexOutOfBoundsException e8) {
            throw new c(e8);
        }
    }

    boolean Y() {
        return this.f7647b;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0611f
    public abstract void a(byte[] bArr, int i7, int i8);

    public abstract void a0(byte b7);

    public abstract void b0(int i7, boolean z6);

    public final void c0(boolean z6) {
        a0(z6 ? (byte) 1 : (byte) 0);
    }

    public final void d0(byte[] bArr) {
        e0(bArr, 0, bArr.length);
    }

    abstract void e0(byte[] bArr, int i7, int i8);

    public abstract void f0(int i7, AbstractC0612g abstractC0612g);

    public abstract void g0(AbstractC0612g abstractC0612g);

    public final void h0(int i7, double d7) {
        n0(i7, Double.doubleToRawLongBits(d7));
    }

    public final void i0(double d7) {
        o0(Double.doubleToRawLongBits(d7));
    }

    public final void j0(int i7, int i8) {
        v0(i7, i8);
    }

    public final void k0(int i7) {
        w0(i7);
    }

    public abstract void l0(int i7, int i8);

    public abstract void m0(int i7);

    public abstract void n0(int i7, long j7);

    public abstract void o0(long j7);

    public final void p0(int i7, float f7) {
        l0(i7, Float.floatToRawIntBits(f7));
    }

    public final void q0(float f7) {
        m0(Float.floatToRawIntBits(f7));
    }

    public final void r0(int i7, O o6) {
        N0(i7, 3);
        t0(o6);
        N0(i7, 4);
    }

    final void s0(int i7, O o6, e0 e0Var) {
        N0(i7, 3);
        u0(o6, e0Var);
        N0(i7, 4);
    }

    public final void t0(O o6) {
        o6.d(this);
    }

    final void u0(O o6, e0 e0Var) {
        e0Var.e(o6, this.f7646a);
    }

    public abstract void v0(int i7, int i8);

    public abstract void w0(int i7);

    public final void x0(int i7, long j7) {
        Q0(i7, j7);
    }

    public final void y0(long j7) {
        R0(j7);
    }

    abstract void z0(int i7, O o6, e0 e0Var);
}
