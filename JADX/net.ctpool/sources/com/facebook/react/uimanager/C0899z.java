package com.facebook.react.uimanager;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.facebook.react.uimanager.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0899z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0899z f12747a = new C0899z();

    /* JADX INFO: renamed from: com.facebook.react.uimanager.z$a */
    public static class a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final C0218a f12748f = new C0218a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public double[] f12749a = new double[4];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public double[] f12750b = new double[3];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public double[] f12751c = new double[3];

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public double[] f12752d = new double[3];

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public double[] f12753e = new double[3];

        /* JADX INFO: renamed from: com.facebook.react.uimanager.z$a$a, reason: collision with other inner class name */
        private static final class C0218a {
            private C0218a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void b(double[] dArr) {
                int length = dArr.length;
                for (int i7 = 0; i7 < length; i7++) {
                    dArr[i7] = 0.0d;
                }
            }

            public /* synthetic */ C0218a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final void a() {
            C0218a c0218a = f12748f;
            c0218a.b(this.f12749a);
            c0218a.b(this.f12750b);
            c0218a.b(this.f12751c);
            c0218a.b(this.f12752d);
            c0218a.b(this.f12753e);
        }
    }

    private C0899z() {
    }

    public static final void a(double[] dArr, double d7) {
        w5.k.f(dArr, "m");
        dArr[11] = ((double) (-1)) / d7;
    }

    public static final void b(double[] dArr, double d7) {
        w5.k.f(dArr, "m");
        dArr[5] = Math.cos(d7);
        dArr[6] = Math.sin(d7);
        dArr[9] = -Math.sin(d7);
        dArr[10] = Math.cos(d7);
    }

    public static final void c(double[] dArr, double d7) {
        w5.k.f(dArr, "m");
        dArr[0] = Math.cos(d7);
        dArr[2] = -Math.sin(d7);
        dArr[8] = Math.sin(d7);
        dArr[10] = Math.cos(d7);
    }

    public static final void d(double[] dArr, double d7) {
        w5.k.f(dArr, "m");
        dArr[0] = Math.cos(d7);
        dArr[1] = Math.sin(d7);
        dArr[4] = -Math.sin(d7);
        dArr[5] = Math.cos(d7);
    }

    public static final void e(double[] dArr, double d7) {
        w5.k.f(dArr, "m");
        dArr[0] = d7;
    }

    public static final void f(double[] dArr, double d7) {
        w5.k.f(dArr, "m");
        dArr[5] = d7;
    }

    public static final void g(double[] dArr, double d7) {
        w5.k.f(dArr, "m");
        dArr[4] = Math.tan(d7);
    }

    public static final void h(double[] dArr, double d7) {
        w5.k.f(dArr, "m");
        dArr[1] = Math.tan(d7);
    }

    public static final void i(double[] dArr, double d7, double d8) {
        w5.k.f(dArr, "m");
        dArr[12] = d7;
        dArr[13] = d8;
    }

    public static final void j(double[] dArr, double d7, double d8, double d9) {
        w5.k.f(dArr, "m");
        dArr[12] = d7;
        dArr[13] = d8;
        dArr[14] = d9;
    }

    public static final void k(double[] dArr, a aVar) {
        w5.k.f(dArr, "transformMatrix");
        w5.k.f(aVar, "ctx");
        O1.a.a(dArr.length == 16);
        double[] dArr2 = aVar.f12749a;
        double[] dArr3 = aVar.f12750b;
        double[] dArr4 = aVar.f12751c;
        double[] dArr5 = aVar.f12752d;
        double[] dArr6 = aVar.f12753e;
        if (f12747a.o(dArr[15])) {
            return;
        }
        double[][] dArr7 = new double[4][];
        for (int i7 = 0; i7 < 4; i7++) {
            dArr7[i7] = new double[4];
        }
        double[] dArr8 = new double[16];
        for (int i8 = 0; i8 < 4; i8++) {
            for (int i9 = 0; i9 < 4; i9++) {
                int i10 = (i8 * 4) + i9;
                double d7 = dArr[i10] / dArr[15];
                dArr7[i8][i9] = d7;
                if (i9 == 3) {
                    d7 = 0.0d;
                }
                dArr8[i10] = d7;
            }
        }
        dArr8[15] = 1.0d;
        C0899z c0899z = f12747a;
        if (c0899z.o(m(dArr8))) {
            return;
        }
        if (c0899z.o(dArr7[0][3]) && c0899z.o(dArr7[1][3]) && c0899z.o(dArr7[2][3])) {
            dArr2[2] = 0.0d;
            dArr2[1] = 0.0d;
            dArr2[0] = 0.0d;
            dArr2[3] = 1.0d;
        } else {
            q(new double[]{dArr7[0][3], dArr7[1][3], dArr7[2][3], dArr7[3][3]}, t(n(dArr8)), dArr2);
        }
        for (int i11 = 0; i11 < 3; i11++) {
            dArr5[i11] = dArr7[3][i11];
        }
        double[][] dArr9 = new double[3][];
        for (int i12 = 0; i12 < 3; i12++) {
            dArr9[i12] = new double[3];
        }
        for (int i13 = 0; i13 < 3; i13++) {
            double[] dArr10 = dArr9[i13];
            double[] dArr11 = dArr7[i13];
            dArr10[0] = dArr11[0];
            dArr10[1] = dArr11[1];
            dArr10[2] = dArr11[2];
        }
        double dX = x(dArr9[0]);
        dArr3[0] = dX;
        double[] dArrY = y(dArr9[0], dX);
        dArr9[0] = dArrY;
        double dW = w(dArrY, dArr9[1]);
        dArr4[0] = dW;
        double[] dArrU = u(dArr9[1], dArr9[0], 1.0d, -dW);
        dArr9[1] = dArrU;
        double dX2 = x(dArrU);
        dArr3[1] = dX2;
        dArr9[1] = y(dArr9[1], dX2);
        dArr4[0] = dArr4[0] / dArr3[1];
        double dW2 = w(dArr9[0], dArr9[2]);
        dArr4[1] = dW2;
        double[] dArrU2 = u(dArr9[2], dArr9[0], 1.0d, -dW2);
        dArr9[2] = dArrU2;
        double dW3 = w(dArr9[1], dArrU2);
        dArr4[2] = dW3;
        double[] dArrU3 = u(dArr9[2], dArr9[1], 1.0d, -dW3);
        dArr9[2] = dArrU3;
        double dX3 = x(dArrU3);
        dArr3[2] = dX3;
        double[] dArrY2 = y(dArr9[2], dX3);
        dArr9[2] = dArrY2;
        double d8 = dArr4[1];
        double d9 = dArr3[2];
        dArr4[1] = d8 / d9;
        dArr4[2] = dArr4[2] / d9;
        if (w(dArr9[0], v(dArr9[1], dArrY2)) < 0.0d) {
            for (int i14 = 0; i14 < 3; i14++) {
                dArr3[i14] = dArr3[i14] * (-1.0d);
                double[] dArr12 = dArr9[i14];
                dArr12[0] = dArr12[0] * (-1.0d);
                dArr12[1] = dArr12[1] * (-1.0d);
                dArr12[2] = dArr12[2] * (-1.0d);
            }
        }
        double[] dArr13 = dArr9[2];
        dArr6[0] = s((-Math.atan2(dArr13[1], dArr13[2])) * 57.29577951308232d);
        double[] dArr14 = dArr9[2];
        double d10 = -dArr14[0];
        double d11 = dArr14[1];
        double d12 = dArr14[2];
        dArr6[1] = s((-Math.atan2(d10, Math.sqrt((d11 * d11) + (d12 * d12)))) * 57.29577951308232d);
        dArr6[2] = s((-Math.atan2(dArr9[1][0], dArr9[0][0])) * 57.29577951308232d);
    }

    public static final double l(double d7) {
        return (d7 * 3.141592653589793d) / ((double) 180);
    }

    public static final double m(double[] dArr) {
        w5.k.f(dArr, "matrix");
        double d7 = dArr[0];
        double d8 = dArr[1];
        double d9 = dArr[2];
        double d10 = dArr[3];
        double d11 = dArr[4];
        double d12 = dArr[5];
        double d13 = dArr[6];
        double d14 = dArr[7];
        double d15 = dArr[8];
        double d16 = dArr[9];
        double d17 = dArr[10];
        double d18 = dArr[11];
        double d19 = dArr[12];
        double d20 = dArr[13];
        double d21 = dArr[14];
        double d22 = dArr[15];
        double d23 = d10 * d13;
        double d24 = d9 * d14;
        double d25 = d10 * d12;
        double d26 = d8 * d14;
        double d27 = d9 * d12;
        double d28 = d8 * d13;
        double d29 = d10 * d11;
        double d30 = d14 * d7;
        double d31 = d9 * d11;
        double d32 = d13 * d7;
        double d33 = d8 * d11;
        double d34 = d7 * d12;
        return ((((((((((((((((((((((((d23 * d16) * d19) - ((d24 * d16) * d19)) - ((d25 * d17) * d19)) + ((d26 * d17) * d19)) + ((d27 * d18) * d19)) - ((d28 * d18) * d19)) - ((d23 * d15) * d20)) + ((d24 * d15) * d20)) + ((d29 * d17) * d20)) - ((d30 * d17) * d20)) - ((d31 * d18) * d20)) + ((d32 * d18) * d20)) + ((d25 * d15) * d21)) - ((d26 * d15) * d21)) - ((d29 * d16) * d21)) + ((d30 * d16) * d21)) + ((d33 * d18) * d21)) - ((d18 * d34) * d21)) - ((d27 * d15) * d22)) + ((d28 * d15) * d22)) + ((d31 * d16) * d22)) - ((d32 * d16) * d22)) - ((d33 * d17) * d22)) + (d34 * d17 * d22);
    }

    public static final double[] n(double[] dArr) {
        w5.k.f(dArr, "matrix");
        double dM = m(dArr);
        if (f12747a.o(dM)) {
            return dArr;
        }
        double d7 = dArr[0];
        double d8 = dArr[1];
        double d9 = dArr[2];
        double d10 = dArr[3];
        double d11 = dArr[4];
        double d12 = dArr[5];
        double d13 = dArr[6];
        double d14 = dArr[7];
        double d15 = dArr[8];
        double d16 = dArr[9];
        double d17 = dArr[10];
        double d18 = dArr[11];
        double d19 = dArr[12];
        double d20 = dArr[13];
        double d21 = dArr[14];
        double d22 = dArr[15];
        double d23 = d13 * d18;
        double d24 = d14 * d17;
        double d25 = d14 * d16;
        double d26 = d12 * d18;
        double d27 = d13 * d16;
        double d28 = d12 * d17;
        double d29 = d10 * d17;
        double d30 = d9 * d18;
        double d31 = d10 * d16;
        double d32 = d8 * d18;
        double d33 = d9 * d16;
        double d34 = d8 * d17;
        double d35 = d9 * d14;
        double d36 = d10 * d13;
        double d37 = d10 * d12;
        double d38 = d8 * d14;
        double d39 = d9 * d12;
        double d40 = d8 * d13;
        double d41 = (d24 * d19) - (d23 * d19);
        double d42 = d14 * d15;
        double d43 = d11 * d18;
        double d44 = d13 * d15;
        double d45 = d11 * d17;
        double d46 = (d30 * d19) - (d29 * d19);
        double d47 = d10 * d15;
        double d48 = d7 * d18;
        double d49 = d9 * d15;
        double d50 = d7 * d17;
        double d51 = d10 * d11;
        double d52 = d14 * d7;
        double d53 = d9 * d11;
        double d54 = d13 * d7;
        double d55 = (((d26 * d19) - (d25 * d19)) + (d42 * d20)) - (d43 * d20);
        double d56 = d12 * d15;
        double d57 = d11 * d16;
        double d58 = (((d31 * d19) - (d32 * d19)) - (d47 * d20)) + (d48 * d20);
        double d59 = d8 * d15;
        double d60 = d7 * d16;
        double d61 = d8 * d11;
        double d62 = d7 * d12;
        return new double[]{((((((d23 * d20) - (d24 * d20)) + (d25 * d21)) - (d26 * d21)) - (d27 * d22)) + (d28 * d22)) / dM, ((((((d29 * d20) - (d30 * d20)) - (d31 * d21)) + (d32 * d21)) + (d33 * d22)) - (d34 * d22)) / dM, ((((((d35 * d20) - (d36 * d20)) + (d37 * d21)) - (d38 * d21)) - (d39 * d22)) + (d40 * d22)) / dM, ((((((d36 * d16) - (d35 * d16)) - (d37 * d17)) + (d38 * d17)) + (d39 * d18)) - (d40 * d18)) / dM, ((((d41 - (d42 * d21)) + (d43 * d21)) + (d44 * d22)) - (d45 * d22)) / dM, ((((d46 + (d47 * d21)) - (d48 * d21)) - (d49 * d22)) + (d50 * d22)) / dM, ((((((d36 * d19) - (d35 * d19)) - (d51 * d21)) + (d52 * d21)) + (d53 * d22)) - (d54 * d22)) / dM, ((((((d35 * d15) - (d36 * d15)) + (d51 * d17)) - (d52 * d17)) - (d53 * d18)) + (d54 * d18)) / dM, ((d55 - (d56 * d22)) + (d57 * d22)) / dM, ((d58 + (d59 * d22)) - (d60 * d22)) / dM, ((((((d38 * d19) - (d37 * d19)) + (d51 * d20)) - (d52 * d20)) - (d61 * d22)) + (d22 * d62)) / dM, ((((((d37 * d15) - (d38 * d15)) - (d51 * d16)) + (d52 * d16)) + (d61 * d18)) - (d18 * d62)) / dM, ((((((d27 * d19) - (d28 * d19)) - (d44 * d20)) + (d45 * d20)) + (d56 * d21)) - (d57 * d21)) / dM, ((((((d34 * d19) - (d33 * d19)) + (d49 * d20)) - (d50 * d20)) - (d59 * d21)) + (d60 * d21)) / dM, ((((((d39 * d19) - (d19 * d40)) - (d53 * d20)) + (d20 * d54)) + (d61 * d21)) - (d21 * d62)) / dM, ((((((d40 * d15) - (d39 * d15)) + (d53 * d16)) - (d54 * d16)) - (d61 * d17)) + (d62 * d17)) / dM};
    }

    private final boolean o(double d7) {
        return !Double.isNaN(d7) && Math.abs(d7) < 1.0E-5d;
    }

    public static final void p(double[] dArr, double[] dArr2, double[] dArr3) {
        w5.k.f(dArr, "out");
        w5.k.f(dArr2, "a");
        w5.k.f(dArr3, "b");
        double d7 = dArr2[0];
        double d8 = dArr2[1];
        double d9 = dArr2[2];
        double d10 = dArr2[3];
        double d11 = dArr2[4];
        double d12 = dArr2[5];
        double d13 = dArr2[6];
        double d14 = dArr2[7];
        double d15 = dArr2[8];
        double d16 = dArr2[9];
        double d17 = dArr2[10];
        double d18 = dArr2[11];
        double d19 = dArr2[12];
        double d20 = dArr2[13];
        double d21 = dArr2[14];
        double d22 = dArr2[15];
        double d23 = dArr3[0];
        double d24 = dArr3[1];
        double d25 = dArr3[2];
        double d26 = dArr3[3];
        dArr[0] = (d23 * d7) + (d24 * d11) + (d25 * d15) + (d26 * d19);
        dArr[1] = (d23 * d8) + (d24 * d12) + (d25 * d16) + (d26 * d20);
        dArr[2] = (d23 * d9) + (d24 * d13) + (d25 * d17) + (d26 * d21);
        dArr[3] = (d23 * d10) + (d24 * d14) + (d25 * d18) + (d26 * d22);
        double d27 = dArr3[4];
        double d28 = dArr3[5];
        double d29 = dArr3[6];
        double d30 = dArr3[7];
        dArr[4] = (d27 * d7) + (d28 * d11) + (d29 * d15) + (d30 * d19);
        dArr[5] = (d27 * d8) + (d28 * d12) + (d29 * d16) + (d30 * d20);
        dArr[6] = (d27 * d9) + (d28 * d13) + (d29 * d17) + (d30 * d21);
        dArr[7] = (d27 * d10) + (d28 * d14) + (d29 * d18) + (d30 * d22);
        double d31 = dArr3[8];
        double d32 = dArr3[9];
        double d33 = dArr3[10];
        double d34 = dArr3[11];
        dArr[8] = (d31 * d7) + (d32 * d11) + (d33 * d15) + (d34 * d19);
        dArr[9] = (d31 * d8) + (d32 * d12) + (d33 * d16) + (d34 * d20);
        dArr[10] = (d31 * d9) + (d32 * d13) + (d33 * d17) + (d34 * d21);
        dArr[11] = (d31 * d10) + (d32 * d14) + (d33 * d18) + (d34 * d22);
        double d35 = dArr3[12];
        double d36 = dArr3[13];
        double d37 = dArr3[14];
        double d38 = dArr3[15];
        dArr[12] = (d7 * d35) + (d11 * d36) + (d15 * d37) + (d19 * d38);
        dArr[13] = (d8 * d35) + (d12 * d36) + (d16 * d37) + (d20 * d38);
        dArr[14] = (d9 * d35) + (d13 * d36) + (d17 * d37) + (d21 * d38);
        dArr[15] = (d35 * d10) + (d36 * d14) + (d37 * d18) + (d38 * d22);
    }

    public static final void q(double[] dArr, double[] dArr2, double[] dArr3) {
        w5.k.f(dArr, "v");
        w5.k.f(dArr2, "m");
        w5.k.f(dArr3, "result");
        double d7 = dArr[0];
        double d8 = dArr[1];
        double d9 = dArr[2];
        double d10 = dArr[3];
        dArr3[0] = (dArr2[0] * d7) + (dArr2[4] * d8) + (dArr2[8] * d9) + (dArr2[12] * d10);
        dArr3[1] = (dArr2[1] * d7) + (dArr2[5] * d8) + (dArr2[9] * d9) + (dArr2[13] * d10);
        dArr3[2] = (dArr2[2] * d7) + (dArr2[6] * d8) + (dArr2[10] * d9) + (dArr2[14] * d10);
        dArr3[3] = (d7 * dArr2[3]) + (d8 * dArr2[7]) + (d9 * dArr2[11]) + (d10 * dArr2[15]);
    }

    public static final void r(double[] dArr) {
        w5.k.f(dArr, "matrix");
        dArr[14] = 0.0d;
        dArr[13] = 0.0d;
        dArr[12] = 0.0d;
        dArr[11] = 0.0d;
        dArr[9] = 0.0d;
        dArr[8] = 0.0d;
        dArr[7] = 0.0d;
        dArr[6] = 0.0d;
        dArr[4] = 0.0d;
        dArr[3] = 0.0d;
        dArr[2] = 0.0d;
        dArr[1] = 0.0d;
        dArr[15] = 1.0d;
        dArr[10] = 1.0d;
        dArr[5] = 1.0d;
        dArr[0] = 1.0d;
    }

    public static final double s(double d7) {
        return Math.round(d7 * 1000.0d) * 0.001d;
    }

    public static final double[] t(double[] dArr) {
        w5.k.f(dArr, "m");
        return new double[]{dArr[0], dArr[4], dArr[8], dArr[12], dArr[1], dArr[5], dArr[9], dArr[13], dArr[2], dArr[6], dArr[10], dArr[14], dArr[3], dArr[7], dArr[11], dArr[15]};
    }

    public static final double[] u(double[] dArr, double[] dArr2, double d7, double d8) {
        w5.k.f(dArr, "a");
        w5.k.f(dArr2, "b");
        return new double[]{(dArr[0] * d7) + (dArr2[0] * d8), (dArr[1] * d7) + (dArr2[1] * d8), (d7 * dArr[2]) + (d8 * dArr2[2])};
    }

    public static final double[] v(double[] dArr, double[] dArr2) {
        w5.k.f(dArr, "a");
        w5.k.f(dArr2, "b");
        double d7 = dArr[1];
        double d8 = dArr2[2];
        double d9 = dArr[2];
        double d10 = dArr2[1];
        double d11 = dArr2[0];
        double d12 = dArr[0];
        return new double[]{(d7 * d8) - (d9 * d10), (d9 * d11) - (d8 * d12), (d12 * d10) - (d7 * d11)};
    }

    public static final double w(double[] dArr, double[] dArr2) {
        w5.k.f(dArr, "a");
        w5.k.f(dArr2, "b");
        return (dArr[0] * dArr2[0]) + (dArr[1] * dArr2[1]) + (dArr[2] * dArr2[2]);
    }

    public static final double x(double[] dArr) {
        w5.k.f(dArr, "a");
        double d7 = dArr[0];
        double d8 = dArr[1];
        double d9 = (d7 * d7) + (d8 * d8);
        double d10 = dArr[2];
        return Math.sqrt(d9 + (d10 * d10));
    }

    public static final double[] y(double[] dArr, double d7) {
        w5.k.f(dArr, "vector");
        double d8 = 1;
        if (f12747a.o(d7)) {
            d7 = x(dArr);
        }
        double d9 = d8 / d7;
        return new double[]{dArr[0] * d9, dArr[1] * d9, dArr[2] * d9};
    }
}
