package androidx.core.content.res;

/* JADX INFO: loaded from: classes.dex */
final class i {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final i f7107k = k(b.f7078c, (float) ((((double) b.h(50.0f)) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f7108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f7109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f7110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f7111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f7112e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f7113f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float[] f7114g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f7115h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float f7116i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final float f7117j;

    private i(float f7, float f8, float f9, float f10, float f11, float f12, float[] fArr, float f13, float f14, float f15) {
        this.f7113f = f7;
        this.f7108a = f8;
        this.f7109b = f9;
        this.f7110c = f10;
        this.f7111d = f11;
        this.f7112e = f12;
        this.f7114g = fArr;
        this.f7115h = f13;
        this.f7116i = f14;
        this.f7117j = f15;
    }

    static i k(float[] fArr, float f7, float f8, float f9, boolean z6) {
        float[][] fArr2 = b.f7076a;
        float f10 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f11 = fArr3[0] * f10;
        float f12 = fArr[1];
        float f13 = f11 + (fArr3[1] * f12);
        float f14 = fArr[2];
        float f15 = f13 + (fArr3[2] * f14);
        float[] fArr4 = fArr2[1];
        float f16 = (fArr4[0] * f10) + (fArr4[1] * f12) + (fArr4[2] * f14);
        float[] fArr5 = fArr2[2];
        float f17 = (f10 * fArr5[0]) + (f12 * fArr5[1]) + (f14 * fArr5[2]);
        float f18 = (f9 / 10.0f) + 0.8f;
        float fD = ((double) f18) >= 0.9d ? b.d(0.59f, 0.69f, (f18 - 0.9f) * 10.0f) : b.d(0.525f, 0.59f, (f18 - 0.8f) * 10.0f);
        float fExp = z6 ? 1.0f : (1.0f - (((float) Math.exp(((-f7) - 42.0f) / 92.0f)) * 0.2777778f)) * f18;
        double d7 = fExp;
        if (d7 > 1.0d) {
            fExp = 1.0f;
        } else if (d7 < 0.0d) {
            fExp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f15) * fExp) + 1.0f) - fExp, (((100.0f / f16) * fExp) + 1.0f) - fExp, (((100.0f / f17) * fExp) + 1.0f) - fExp};
        float f19 = 1.0f / ((5.0f * f7) + 1.0f);
        float f20 = f19 * f19 * f19 * f19;
        float f21 = 1.0f - f20;
        float fCbrt = (f20 * f7) + (0.1f * f21 * f21 * ((float) Math.cbrt(((double) f7) * 5.0d)));
        float fH = b.h(f8) / fArr[1];
        double d8 = fH;
        float fSqrt = ((float) Math.sqrt(d8)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d8, 0.2d));
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * fCbrt) * f15)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * fCbrt) * f16)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[2] * fCbrt) * f17)) / 100.0d, 0.42d)};
        float f22 = fArr7[0];
        float f23 = (f22 * 400.0f) / (f22 + 27.13f);
        float f24 = fArr7[1];
        float f25 = (f24 * 400.0f) / (f24 + 27.13f);
        float f26 = fArr7[2];
        float[] fArr8 = {f23, f25, (400.0f * f26) / (f26 + 27.13f)};
        return new i(fH, ((fArr8[0] * 2.0f) + fArr8[1] + (fArr8[2] * 0.05f)) * fPow, fPow, fPow, fD, f18, fArr6, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    float a() {
        return this.f7108a;
    }

    float b() {
        return this.f7111d;
    }

    float c() {
        return this.f7115h;
    }

    float d() {
        return this.f7116i;
    }

    float e() {
        return this.f7113f;
    }

    float f() {
        return this.f7109b;
    }

    float g() {
        return this.f7112e;
    }

    float h() {
        return this.f7110c;
    }

    float[] i() {
        return this.f7114g;
    }

    float j() {
        return this.f7117j;
    }
}
