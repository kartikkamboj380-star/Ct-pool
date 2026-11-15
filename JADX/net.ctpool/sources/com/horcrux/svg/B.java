package com.horcrux.svg;

import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
abstract class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static float f17744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f17745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f17746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f17747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Path f17748e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static ArrayList f17749f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static float f17750g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static float f17751h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static float f17752i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static float f17753j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static float f17754k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static float f17755l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static boolean f17756m;

    private static void A(float f7, float f8, float f9, float f10) {
        float f11 = (f17750g * 2.0f) - f17752i;
        float f12 = (f17751h * 2.0f) - f17753j;
        f17752i = f7;
        f17753j = f8;
        e(f11, f12, f7, f8, f9, f10);
    }

    private static void B(float f7, float f8) {
        C(f7 + f17750g, f8 + f17751h);
    }

    private static void C(float f7, float f8) {
        u((f17750g * 2.0f) - f17752i, (f17751h * 2.0f) - f17753j, f7, f8);
    }

    private static void a(float f7, float f8, float f9, boolean z6, boolean z7, float f10, float f11) {
        b(f7, f8, f9, z6, z7, f10 + f17750g, f11 + f17751h);
    }

    private static void b(float f7, float f8, float f9, boolean z6, boolean z7, float f10, float f11) {
        float f12;
        float f13;
        float f14;
        float f15 = f17750g;
        float f16 = f17751h;
        float fAbs = Math.abs(f8 == 0.0f ? f7 == 0.0f ? f11 - f16 : f7 : f8);
        float fAbs2 = Math.abs(f7 == 0.0f ? f10 - f15 : f7);
        if (fAbs2 == 0.0f || fAbs == 0.0f || (f10 == f15 && f11 == f16)) {
            l(f10, f11);
            return;
        }
        float radians = (float) Math.toRadians(f9);
        double d7 = radians;
        float fCos = (float) Math.cos(d7);
        float fSin = (float) Math.sin(d7);
        float f17 = f10 - f15;
        float f18 = f11 - f16;
        float f19 = ((fCos * f17) / 2.0f) + ((fSin * f18) / 2.0f);
        float f20 = -fSin;
        float f21 = ((f20 * f17) / 2.0f) + ((fCos * f18) / 2.0f);
        float f22 = fAbs2 * fAbs2;
        float f23 = f22 * fAbs * fAbs;
        float f24 = (f23 - ((f22 * f21) * f21)) - (((fAbs * fAbs) * f19) * f19);
        if (f24 < 0.0f) {
            float f25 = 1.0f - (f24 / f23);
            f12 = f20;
            float fSqrt = (float) Math.sqrt(f25);
            fAbs2 *= fSqrt;
            fAbs *= fSqrt;
            f13 = f17 / 2.0f;
            f14 = f18 / 2.0f;
        } else {
            f12 = f20;
            float fSqrt2 = (float) Math.sqrt(f24 / (r16 + r18));
            if (z6 == z7) {
                fSqrt2 = -fSqrt2;
            }
            float f26 = (((-fSqrt2) * f21) * fAbs2) / fAbs;
            float f27 = ((fSqrt2 * f19) * fAbs) / fAbs2;
            float f28 = ((fCos * f26) - (fSin * f27)) + (f17 / 2.0f);
            float f29 = (f18 / 2.0f) + (f26 * fSin) + (f27 * fCos);
            f13 = f28;
            f14 = f29;
        }
        float f30 = fCos / fAbs2;
        float f31 = fSin / fAbs2;
        float f32 = f12 / fAbs;
        float f33 = fCos / fAbs;
        float f34 = -f13;
        float f35 = -f14;
        float f36 = fAbs;
        float f37 = fAbs2;
        float fAtan2 = (float) Math.atan2((f32 * f34) + (f33 * f35), (f34 * f30) + (f35 * f31));
        float f38 = f17 - f13;
        float f39 = f18 - f14;
        float fAtan22 = (float) Math.atan2((f32 * f38) + (f33 * f39), (f30 * f38) + (f31 * f39));
        float f40 = f13 + f15;
        float f41 = f14 + f16;
        float f42 = f17 + f15;
        float f43 = f18 + f16;
        w();
        f17752i = f42;
        f17750g = f42;
        f17753j = f43;
        f17751h = f43;
        if (f37 != f36 || radians != 0.0f) {
            c(f40, f41, f37, f36, fAtan2, fAtan22, z7, radians);
            return;
        }
        float degrees = (float) Math.toDegrees(fAtan2);
        float fAbs3 = Math.abs((degrees - ((float) Math.toDegrees(fAtan22))) % 360.0f);
        if (!z6 ? fAbs3 > 180.0f : fAbs3 < 180.0f) {
            fAbs3 = 360.0f - fAbs3;
        }
        if (!z7) {
            fAbs3 = -fAbs3;
        }
        float f44 = f17744a;
        f17748e.arcTo(new RectF((f40 - f37) * f44, (f41 - f37) * f44, (f40 + f37) * f44, (f41 + f37) * f44), degrees, fAbs3);
        f17749f.add(new A(EnumC1567f.kCGPathElementAddCurveToPoint, new E[]{new E(f42, f43)}));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0067 A[LOOP:0: B:12:0x0065->B:13:0x0067, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(float f7, float f8, float f9, float f10, float f11, float f12, boolean z6, float f13) {
        double d7;
        int iCeil;
        int i7;
        float f14 = f11;
        double d8 = f13;
        float fCos = (float) Math.cos(d8);
        float fSin = (float) Math.sin(d8);
        float f15 = fCos * f9;
        float f16 = (-fSin) * f10;
        float f17 = fSin * f9;
        float f18 = fCos * f10;
        float f19 = f12 - f14;
        if (f19 >= 0.0f || !z6) {
            if (f19 > 0.0f && !z6) {
                d7 = ((double) f19) - 6.283185307179586d;
            }
            iCeil = (int) Math.ceil(Math.abs(v(((double) f19) / 1.5707963267948966d)));
            float f20 = f19 / iCeil;
            float fTan = (float) (Math.tan(f20 / 4.0f) * 1.3333333333333333d);
            double d9 = f14;
            float fCos2 = (float) Math.cos(d9);
            float fSin2 = (float) Math.sin(d9);
            i7 = 0;
            while (i7 < iCeil) {
                float f21 = fCos2 - (fTan * fSin2);
                float f22 = fSin2 + (fCos2 * fTan);
                float f23 = f14 + f20;
                double d10 = f23;
                float fCos3 = (float) Math.cos(d10);
                float fSin3 = (float) Math.sin(d10);
                float f24 = (fTan * fSin3) + fCos3;
                float f25 = fSin3 - (fTan * fCos3);
                float f26 = f7 + (f15 * f21) + (f16 * f22);
                float f27 = f8 + (f21 * f17) + (f22 * f18);
                float f28 = f7 + (f15 * f24) + (f16 * f25);
                float f29 = f8 + (f24 * f17) + (f25 * f18);
                float f30 = f7 + (f15 * fCos3) + (f16 * fSin3);
                float f31 = f8 + (f17 * fCos3) + (f18 * fSin3);
                Path path = f17748e;
                float f32 = f17744a;
                path.cubicTo(f26 * f32, f27 * f32, f28 * f32, f29 * f32, f30 * f32, f31 * f32);
                f17749f.add(new A(EnumC1567f.kCGPathElementAddCurveToPoint, new E[]{new E(f26, f27), new E(f28, f29), new E(f30, f31)}));
                i7++;
                f14 = f23;
                f18 = f18;
                f20 = f20;
                f17 = f17;
                fTan = fTan;
                fSin2 = fSin3;
                fCos2 = fCos3;
                f15 = f15;
                f16 = f16;
                iCeil = iCeil;
            }
        }
        d7 = ((double) f19) + 6.283185307179586d;
        f19 = (float) d7;
        iCeil = (int) Math.ceil(Math.abs(v(((double) f19) / 1.5707963267948966d)));
        float f202 = f19 / iCeil;
        float fTan2 = (float) (Math.tan(f202 / 4.0f) * 1.3333333333333333d);
        double d92 = f14;
        float fCos22 = (float) Math.cos(d92);
        float fSin22 = (float) Math.sin(d92);
        i7 = 0;
        while (i7 < iCeil) {
        }
    }

    private static void d() {
        if (f17756m) {
            f17750g = f17754k;
            f17751h = f17755l;
            f17756m = false;
            f17748e.close();
            f17749f.add(new A(EnumC1567f.kCGPathElementCloseSubpath, new E[]{new E(f17750g, f17751h)}));
        }
    }

    private static void e(float f7, float f8, float f9, float f10, float f11, float f12) {
        w();
        f17750g = f11;
        f17751h = f12;
        Path path = f17748e;
        float f13 = f17744a;
        path.cubicTo(f7 * f13, f8 * f13, f9 * f13, f10 * f13, f11 * f13, f12 * f13);
        f17749f.add(new A(EnumC1567f.kCGPathElementAddCurveToPoint, new E[]{new E(f7, f8), new E(f9, f10), new E(f11, f12)}));
    }

    private static void f(float f7, float f8, float f9, float f10, float f11, float f12) {
        float f13 = f17750g;
        float f14 = f17751h;
        g(f7 + f13, f8 + f14, f9 + f13, f10 + f14, f11 + f13, f12 + f14);
    }

    private static void g(float f7, float f8, float f9, float f10, float f11, float f12) {
        f17752i = f9;
        f17753j = f10;
        e(f7, f8, f9, f10, f11, f12);
    }

    private static boolean h(char c7) {
        return Character.isUpperCase(c7);
    }

    private static boolean i(char c7) {
        switch (c7) {
            case 'A':
            case 'C':
            case 'H':
            case 'L':
            case 'M':
            case 'Q':
            case 'S':
            case 'T':
            case 'V':
            case 'Z':
            case 'a':
            case 'c':
            case 'h':
            case 'l':
            case 'm':
            case 'q':
            case 's':
            case 't':
            case 'v':
            case 'z':
                return true;
            default:
                return false;
        }
    }

    private static boolean j(char c7) {
        return (c7 >= '0' && c7 <= '9') || c7 == '.' || c7 == '-' || c7 == '+';
    }

    private static void k(float f7, float f8) {
        l(f7 + f17750g, f8 + f17751h);
    }

    private static void l(float f7, float f8) {
        w();
        f17750g = f7;
        f17752i = f7;
        f17751h = f8;
        f17753j = f8;
        Path path = f17748e;
        float f9 = f17744a;
        path.lineTo(f7 * f9, f9 * f8);
        f17749f.add(new A(EnumC1567f.kCGPathElementAddLineToPoint, new E[]{new E(f7, f8)}));
    }

    private static void m(float f7, float f8) {
        n(f7 + f17750g, f8 + f17751h);
    }

    private static void n(float f7, float f8) {
        f17750g = f7;
        f17752i = f7;
        f17754k = f7;
        f17751h = f8;
        f17753j = f8;
        f17755l = f8;
        Path path = f17748e;
        float f9 = f17744a;
        path.moveTo(f7 * f9, f9 * f8);
        f17749f.add(new A(EnumC1567f.kCGPathElementMoveToPoint, new E[]{new E(f7, f8)}));
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x01fa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x002e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static Path o(String str) {
        float fQ;
        float fQ2;
        f17749f = new ArrayList();
        Path path = new Path();
        f17748e = path;
        if (str == null) {
            return path;
        }
        f17746c = str.length();
        f17747d = str;
        f17745b = 0;
        f17750g = 0.0f;
        f17751h = 0.0f;
        f17752i = 0.0f;
        f17753j = 0.0f;
        f17754k = 0.0f;
        f17755l = 0.0f;
        f17756m = false;
        char c7 = ' ';
        while (f17745b < f17746c) {
            y();
            int i7 = f17745b;
            if (i7 >= f17746c) {
                return f17748e;
            }
            boolean z6 = true;
            boolean z7 = c7 != ' ';
            char cCharAt = f17747d.charAt(i7);
            if (!z7 && cCharAt != 'M' && cCharAt != 'm') {
                throw new IllegalArgumentException(String.format("Unexpected character '%c' (i=%d, s=%s)", Character.valueOf(cCharAt), Integer.valueOf(f17745b), f17747d));
            }
            if (i(cCharAt)) {
                f17745b++;
                z6 = false;
                c7 = cCharAt;
            } else {
                if (!j(cCharAt) || !z7) {
                    throw new IllegalArgumentException(String.format("Unexpected character '%c' (i=%d, s=%s)", Character.valueOf(cCharAt), Integer.valueOf(f17745b), f17747d));
                }
                if (c7 == 'Z' || c7 == 'z') {
                    throw new IllegalArgumentException(String.format("Unexpected number after 'z' (s=%s)", f17747d));
                }
                if (c7 == 'M' || c7 == 'm') {
                    c7 = h(c7) ? 'L' : 'l';
                } else {
                    z6 = false;
                }
            }
            boolean zH = h(c7);
            switch (c7) {
                case 'A':
                    b(q(), q(), q(), p(), p(), q(), q());
                    if (z6) {
                        c7 = zH ? 'M' : 'm';
                    }
                    break;
                case 'C':
                    g(q(), q(), q(), q(), q(), q());
                    if (z6) {
                    }
                    break;
                case 'H':
                    fQ = q();
                    fQ2 = f17751h;
                    l(fQ, fQ2);
                    if (z6) {
                    }
                    break;
                case 'L':
                    fQ = q();
                    fQ2 = q();
                    l(fQ, fQ2);
                    if (z6) {
                    }
                    break;
                case 'M':
                    n(q(), q());
                    if (z6) {
                    }
                    break;
                case 'Q':
                    u(q(), q(), q(), q());
                    if (z6) {
                    }
                    break;
                case 'S':
                    A(q(), q(), q(), q());
                    if (z6) {
                    }
                    break;
                case 'T':
                    C(q(), q());
                    if (z6) {
                    }
                    break;
                case 'V':
                    fQ = f17750g;
                    fQ2 = q();
                    l(fQ, fQ2);
                    if (z6) {
                    }
                    break;
                case 'Z':
                case 'z':
                    d();
                    if (z6) {
                    }
                    break;
                case 'a':
                    a(q(), q(), q(), p(), p(), q(), q());
                    if (z6) {
                    }
                    break;
                case 'c':
                    f(q(), q(), q(), q(), q(), q());
                    if (z6) {
                    }
                    break;
                case 'h':
                    k(q(), 0.0f);
                    if (z6) {
                    }
                    break;
                case 'l':
                    k(q(), q());
                    if (z6) {
                    }
                    break;
                case 'm':
                    m(q(), q());
                    if (z6) {
                    }
                    break;
                case 'q':
                    t(q(), q(), q(), q());
                    if (z6) {
                    }
                    break;
                case 's':
                    z(q(), q(), q(), q());
                    if (z6) {
                    }
                    break;
                case 't':
                    B(q(), q());
                    if (z6) {
                    }
                    break;
                case 'v':
                    k(0.0f, q());
                    if (z6) {
                    }
                    break;
                default:
                    throw new IllegalArgumentException(String.format("Unexpected comand '%c' (s=%s)", Character.valueOf(c7), f17747d));
            }
        }
        return f17748e;
    }

    private static boolean p() {
        y();
        char cCharAt = f17747d.charAt(f17745b);
        if (cCharAt != '0' && cCharAt != '1') {
            throw new Error(String.format("Unexpected flag '%c' (i=%d, s=%s)", Character.valueOf(cCharAt), Integer.valueOf(f17745b), f17747d));
        }
        int i7 = f17745b + 1;
        f17745b = i7;
        if (i7 < f17746c && f17747d.charAt(i7) == ',') {
            f17745b++;
        }
        y();
        return cCharAt == '1';
    }

    private static float q() {
        if (f17745b == f17746c) {
            throw new Error(String.format("Unexpected end (s=%s)", f17747d));
        }
        float fS = s();
        y();
        r();
        return fS;
    }

    private static void r() {
        int i7 = f17745b;
        if (i7 >= f17746c || f17747d.charAt(i7) != ',') {
            return;
        }
        f17745b++;
    }

    private static float s() {
        char cCharAt;
        y();
        int i7 = f17745b;
        if (i7 == f17746c) {
            throw new Error(String.format("Unexpected end (s=%s)", f17747d));
        }
        char cCharAt2 = f17747d.charAt(i7);
        if (cCharAt2 == '-' || cCharAt2 == '+') {
            int i8 = f17745b + 1;
            f17745b = i8;
            cCharAt2 = f17747d.charAt(i8);
        }
        if (cCharAt2 >= '0' && cCharAt2 <= '9') {
            x();
            int i9 = f17745b;
            if (i9 < f17746c) {
                cCharAt2 = f17747d.charAt(i9);
            }
        } else if (cCharAt2 != '.') {
            throw new IllegalArgumentException(String.format("Invalid number formating character '%c' (i=%d, s=%s)", Character.valueOf(cCharAt2), Integer.valueOf(f17745b), f17747d));
        }
        if (cCharAt2 == '.') {
            f17745b++;
            x();
            int i10 = f17745b;
            if (i10 < f17746c) {
                cCharAt2 = f17747d.charAt(i10);
            }
        }
        if (cCharAt2 == 'e' || cCharAt2 == 'E') {
            int i11 = f17745b;
            if (i11 + 1 < f17746c && (cCharAt = f17747d.charAt(i11 + 1)) != 'm' && cCharAt != 'x') {
                int i12 = f17745b + 1;
                f17745b = i12;
                char cCharAt3 = f17747d.charAt(i12);
                if (cCharAt3 == '+' || cCharAt3 == '-') {
                    f17745b++;
                } else if (cCharAt3 < '0' || cCharAt3 > '9') {
                    throw new IllegalArgumentException(String.format("Invalid number formating character '%c' (i=%d, s=%s)", Character.valueOf(cCharAt3), Integer.valueOf(f17745b), f17747d));
                }
                x();
            }
        }
        String strSubstring = f17747d.substring(i7, f17745b);
        float f7 = Float.parseFloat(strSubstring);
        if (Float.isInfinite(f7) || Float.isNaN(f7)) {
            throw new IllegalArgumentException(String.format("Invalid number '%s' (start=%d, i=%d, s=%s)", strSubstring, Integer.valueOf(i7), Integer.valueOf(f17745b), f17747d));
        }
        return f7;
    }

    private static void t(float f7, float f8, float f9, float f10) {
        float f11 = f17750g;
        float f12 = f17751h;
        u(f7 + f11, f8 + f12, f9 + f11, f10 + f12);
    }

    private static void u(float f7, float f8, float f9, float f10) {
        f17752i = f7;
        f17753j = f8;
        float f11 = f7 * 2.0f;
        float f12 = f8 * 2.0f;
        e((f17750g + f11) / 3.0f, (f17751h + f12) / 3.0f, (f9 + f11) / 3.0f, (f10 + f12) / 3.0f, f9, f10);
    }

    private static double v(double d7) {
        return Math.round(d7 * r0) / Math.pow(10.0d, 4.0d);
    }

    private static void w() {
        if (f17756m) {
            return;
        }
        f17754k = f17750g;
        f17755l = f17751h;
        f17756m = true;
    }

    private static void x() {
        while (true) {
            int i7 = f17745b;
            if (i7 >= f17746c || !Character.isDigit(f17747d.charAt(i7))) {
                return;
            } else {
                f17745b++;
            }
        }
    }

    private static void y() {
        while (true) {
            int i7 = f17745b;
            if (i7 >= f17746c || !Character.isWhitespace(f17747d.charAt(i7))) {
                return;
            } else {
                f17745b++;
            }
        }
    }

    private static void z(float f7, float f8, float f9, float f10) {
        float f11 = f17750g;
        float f12 = f17751h;
        A(f7 + f11, f8 + f12, f9 + f11, f10 + f12);
    }
}
