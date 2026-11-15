package androidx.core.content.res;

/* JADX INFO: loaded from: classes.dex */
class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f7067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f7068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f7069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f7070d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f7071e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f7072f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f7073g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f7074h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float f7075i;

    a(float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f7067a = f7;
        this.f7068b = f8;
        this.f7069c = f9;
        this.f7070d = f10;
        this.f7071e = f11;
        this.f7072f = f12;
        this.f7073g = f13;
        this.f7074h = f14;
        this.f7075i = f15;
    }

    private static a b(float f7, float f8, float f9) {
        float f10 = 100.0f;
        float f11 = 1000.0f;
        float f12 = 0.0f;
        a aVar = null;
        float f13 = 1000.0f;
        while (Math.abs(f12 - f10) > 0.01f) {
            float f14 = ((f10 - f12) / 2.0f) + f12;
            int iP = e(f14, f8, f7).p();
            float fB = b.b(iP);
            float fAbs = Math.abs(f9 - fB);
            if (fAbs < 0.2f) {
                a aVarC = c(iP);
                float fA = aVarC.a(e(aVarC.k(), aVarC.i(), f7));
                if (fA <= 1.0f) {
                    aVar = aVarC;
                    f11 = fAbs;
                    f13 = fA;
                }
            }
            if (f11 == 0.0f && f13 == 0.0f) {
                break;
            }
            if (fB < f9) {
                f12 = f14;
            } else {
                f10 = f14;
            }
        }
        return aVar;
    }

    static a c(int i7) {
        return d(i7, i.f7107k);
    }

    static a d(int i7, i iVar) {
        float[] fArrF = b.f(i7);
        float[][] fArr = b.f7076a;
        float f7 = fArrF[0];
        float[] fArr2 = fArr[0];
        float f8 = fArr2[0] * f7;
        float f9 = fArrF[1];
        float f10 = f8 + (fArr2[1] * f9);
        float f11 = fArrF[2];
        float f12 = f10 + (fArr2[2] * f11);
        float[] fArr3 = fArr[1];
        float f13 = (fArr3[0] * f7) + (fArr3[1] * f9) + (fArr3[2] * f11);
        float[] fArr4 = fArr[2];
        float f14 = (f7 * fArr4[0]) + (f9 * fArr4[1]) + (f11 * fArr4[2]);
        float f15 = iVar.i()[0] * f12;
        float f16 = iVar.i()[1] * f13;
        float f17 = iVar.i()[2] * f14;
        float fPow = (float) Math.pow(((double) (iVar.c() * Math.abs(f15))) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (iVar.c() * Math.abs(f16))) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (iVar.c() * Math.abs(f17))) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f15) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f16) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f17) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d7 = fSignum3;
        float f18 = ((float) (((((double) fSignum) * 11.0d) + (((double) fSignum2) * (-12.0d))) + d7)) / 11.0f;
        float f19 = ((float) (((double) (fSignum + fSignum2)) - (d7 * 2.0d))) / 9.0f;
        float f20 = fSignum2 * 20.0f;
        float f21 = (((fSignum * 20.0f) + f20) + (21.0f * fSignum3)) / 20.0f;
        float f22 = (((fSignum * 40.0f) + f20) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f19, f18)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f23 = fAtan2;
        float f24 = (3.1415927f * f23) / 180.0f;
        float fPow4 = ((float) Math.pow((f22 * iVar.f()) / iVar.a(), iVar.b() * iVar.j())) * 100.0f;
        float fD = iVar.d() * (4.0f / iVar.b()) * ((float) Math.sqrt(fPow4 / 100.0f)) * (iVar.a() + 4.0f);
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, iVar.e()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) (((double) f23) < 20.14d ? 360.0f + f23 : f23)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * iVar.g()) * iVar.h()) * ((float) Math.sqrt((f18 * f18) + (f19 * f19)))) / (f21 + 0.305f), 0.9d)) * ((float) Math.sqrt(((double) fPow4) / 100.0d));
        float fD2 = fPow5 * iVar.d();
        float fSqrt = ((float) Math.sqrt((r3 * iVar.b()) / (iVar.a() + 4.0f))) * 50.0f;
        float f25 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((0.0228f * fD2) + 1.0f)) * 43.85965f;
        double d8 = f24;
        return new a(f23, fPow5, fPow4, fD, fD2, fSqrt, f25, fLog * ((float) Math.cos(d8)), fLog * ((float) Math.sin(d8)));
    }

    private static a e(float f7, float f8, float f9) {
        return f(f7, f8, f9, i.f7107k);
    }

    private static a f(float f7, float f8, float f9, i iVar) {
        float fB = (4.0f / iVar.b()) * ((float) Math.sqrt(((double) f7) / 100.0d)) * (iVar.a() + 4.0f) * iVar.d();
        float fD = f8 * iVar.d();
        float fSqrt = ((float) Math.sqrt(((f8 / ((float) Math.sqrt(r4))) * iVar.b()) / (iVar.a() + 4.0f))) * 50.0f;
        float f10 = (1.7f * f7) / ((0.007f * f7) + 1.0f);
        float fLog = ((float) Math.log((((double) fD) * 0.0228d) + 1.0d)) * 43.85965f;
        double d7 = (3.1415927f * f9) / 180.0f;
        return new a(f9, f8, f7, fB, fD, fSqrt, f10, fLog * ((float) Math.cos(d7)), fLog * ((float) Math.sin(d7)));
    }

    static int m(float f7, float f8, float f9) {
        return n(f7, f8, f9, i.f7107k);
    }

    static int n(float f7, float f8, float f9, i iVar) {
        if (f8 < 1.0d || Math.round(f9) <= 0.0d || Math.round(f9) >= 100.0d) {
            return b.a(f9);
        }
        float fMin = f7 < 0.0f ? 0.0f : Math.min(360.0f, f7);
        a aVar = null;
        boolean z6 = true;
        float f10 = 0.0f;
        float f11 = f8;
        while (Math.abs(f10 - f8) >= 0.4f) {
            a aVarB = b(fMin, f11, f9);
            if (!z6) {
                if (aVarB == null) {
                    f8 = f11;
                } else {
                    f10 = f11;
                    aVar = aVarB;
                }
                f11 = ((f8 - f10) / 2.0f) + f10;
            } else {
                if (aVarB != null) {
                    return aVarB.o(iVar);
                }
                f11 = ((f8 - f10) / 2.0f) + f10;
                z6 = false;
            }
        }
        return aVar == null ? b.a(f9) : aVar.o(iVar);
    }

    float a(a aVar) {
        float fL = l() - aVar.l();
        float fG = g() - aVar.g();
        float fH = h() - aVar.h();
        return (float) (Math.pow(Math.sqrt((fL * fL) + (fG * fG) + (fH * fH)), 0.63d) * 1.41d);
    }

    float g() {
        return this.f7074h;
    }

    float h() {
        return this.f7075i;
    }

    float i() {
        return this.f7068b;
    }

    float j() {
        return this.f7067a;
    }

    float k() {
        return this.f7069c;
    }

    float l() {
        return this.f7073g;
    }

    int o(i iVar) {
        float fPow = (float) Math.pow(((double) ((((double) i()) == 0.0d || ((double) k()) == 0.0d) ? 0.0f : i() / ((float) Math.sqrt(((double) k()) / 100.0d)))) / Math.pow(1.64d - Math.pow(0.29d, iVar.e()), 0.73d), 1.1111111111111112d);
        double dJ = (j() * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + dJ) + 3.8d)) * 0.25f;
        float fA = iVar.a() * ((float) Math.pow(((double) k()) / 100.0d, (1.0d / ((double) iVar.b())) / ((double) iVar.j())));
        float fG = fCos * 3846.1538f * iVar.g() * iVar.h();
        float f7 = fA / iVar.f();
        float fSin = (float) Math.sin(dJ);
        float fCos2 = (float) Math.cos(dJ);
        float f8 = (((0.305f + f7) * 23.0f) * fPow) / (((fG * 23.0f) + ((11.0f * fPow) * fCos2)) + ((fPow * 108.0f) * fSin));
        float f9 = fCos2 * f8;
        float f10 = f8 * fSin;
        float f11 = f7 * 460.0f;
        float f12 = (((451.0f * f9) + f11) + (288.0f * f10)) / 1403.0f;
        float f13 = ((f11 - (891.0f * f9)) - (261.0f * f10)) / 1403.0f;
        float fSignum = Math.signum(f12) * (100.0f / iVar.c()) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f12)) * 27.13d) / (400.0d - ((double) Math.abs(f12)))), 2.380952380952381d));
        float fSignum2 = Math.signum(f13) * (100.0f / iVar.c()) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f13)) * 27.13d) / (400.0d - ((double) Math.abs(f13)))), 2.380952380952381d));
        float fSignum3 = Math.signum(((f11 - (f9 * 220.0f)) - (f10 * 6300.0f)) / 1403.0f) * (100.0f / iVar.c()) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(r8)) * 27.13d) / (400.0d - ((double) Math.abs(r8)))), 2.380952380952381d));
        float f14 = fSignum / iVar.i()[0];
        float f15 = fSignum2 / iVar.i()[1];
        float f16 = fSignum3 / iVar.i()[2];
        float[][] fArr = b.f7077b;
        float[] fArr2 = fArr[0];
        float f17 = (fArr2[0] * f14) + (fArr2[1] * f15) + (fArr2[2] * f16);
        float[] fArr3 = fArr[1];
        float f18 = (fArr3[0] * f14) + (fArr3[1] * f15) + (fArr3[2] * f16);
        float[] fArr4 = fArr[2];
        return androidx.core.graphics.a.b(f17, f18, (f14 * fArr4[0]) + (f15 * fArr4[1]) + (f16 * fArr4[2]));
    }

    int p() {
        return o(i.f7107k);
    }
}
