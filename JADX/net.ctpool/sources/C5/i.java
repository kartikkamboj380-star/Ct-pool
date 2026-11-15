package C5;

import C5.a;
import w5.k;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public abstract class i extends h {
    public static float b(float f7, float f8) {
        return f7 < f8 ? f8 : f7;
    }

    public static int c(int i7, int i8) {
        return i7 < i8 ? i8 : i7;
    }

    public static long d(long j7, long j8) {
        return j7 < j8 ? j8 : j7;
    }

    public static float e(float f7, float f8) {
        return f7 > f8 ? f8 : f7;
    }

    public static int f(int i7, int i8) {
        return i7 > i8 ? i8 : i7;
    }

    public static long g(long j7, long j8) {
        return j7 > j8 ? j8 : j7;
    }

    public static int h(int i7, int i8, int i9) {
        if (i8 <= i9) {
            return i7 < i8 ? i8 : i7 > i9 ? i9 : i7;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i9 + " is less than minimum " + i8 + '.');
    }

    public static long i(long j7, long j8, long j9) {
        if (j8 <= j9) {
            return j7 < j8 ? j8 : j7 > j9 ? j9 : j7;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j9 + " is less than minimum " + j8 + '.');
    }

    public static a j(int i7, int i8) {
        return a.f947p.a(i7, i8, -1);
    }

    public static a k(a aVar, int i7) {
        k.f(aVar, "<this>");
        h.a(i7 > 0, Integer.valueOf(i7));
        a.C0013a c0013a = a.f947p;
        int iF = aVar.f();
        int iH = aVar.h();
        if (aVar.i() <= 0) {
            i7 = -i7;
        }
        return c0013a.a(iF, iH, i7);
    }

    public static c l(int i7, int i8) {
        return i8 <= Integer.MIN_VALUE ? c.f955q.a() : new c(i7, i8 - 1);
    }
}
