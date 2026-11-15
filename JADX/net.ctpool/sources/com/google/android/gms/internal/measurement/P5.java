package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
abstract class P5 {
    static /* synthetic */ void a(byte b7, byte b8, byte b9, byte b10, char[] cArr, int i7) throws I4 {
        if (e(b8) || (((b7 << 28) + (b8 + 112)) >> 30) != 0 || e(b9) || e(b10)) {
            throw I4.c();
        }
        int i8 = ((b7 & 7) << 18) | ((b8 & 63) << 12) | ((b9 & 63) << 6) | (b10 & 63);
        cArr[i7] = (char) ((i8 >>> 10) + 55232);
        cArr[i7 + 1] = (char) ((i8 & 1023) + 56320);
    }

    static /* synthetic */ void b(byte b7, byte b8, byte b9, char[] cArr, int i7) throws I4 {
        if (e(b8) || ((b7 == -32 && b8 < -96) || ((b7 == -19 && b8 >= -96) || e(b9)))) {
            throw I4.c();
        }
        cArr[i7] = (char) (((b7 & 15) << 12) | ((b8 & 63) << 6) | (b9 & 63));
    }

    static /* synthetic */ void c(byte b7, byte b8, char[] cArr, int i7) throws I4 {
        if (b7 < -62 || e(b8)) {
            throw I4.c();
        }
        cArr[i7] = (char) (((b7 & 31) << 6) | (b8 & 63));
    }

    static /* synthetic */ void d(byte b7, char[] cArr, int i7) {
        cArr[i7] = (char) b7;
    }

    private static boolean e(byte b7) {
        return b7 > -65;
    }
}
