package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes.dex */
abstract class C1 {
    static /* bridge */ /* synthetic */ void a(byte b7, byte b8, byte b9, byte b10, char[] cArr, int i7) throws H0 {
        if (e(b8) || (((b7 << 28) + (b8 + 112)) >> 30) != 0 || e(b9) || e(b10)) {
            throw H0.b();
        }
        int i8 = ((b7 & 7) << 18) | ((b8 & 63) << 12) | ((b9 & 63) << 6) | (b10 & 63);
        cArr[i7] = (char) ((i8 >>> 10) + 55232);
        cArr[i7 + 1] = (char) ((i8 & 1023) + 56320);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0016 A[PHI: r2
      0x0016: PHI (r2v3 byte) = (r2v2 byte), (r2v9 byte) binds: [B:9:0x0011, B:11:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* bridge */ /* synthetic */ void b(byte b7, byte b8, byte b9, char[] cArr, int i7) throws H0 {
        if (!e(b8)) {
            if (b7 != -32) {
                if (b7 != -19) {
                    if (!e(b9)) {
                        cArr[i7] = (char) (((b7 & 15) << 12) | ((b8 & 63) << 6) | (b9 & 63));
                        return;
                    }
                } else if (b8 < -96) {
                    b7 = -19;
                    if (!e(b9)) {
                    }
                }
            } else if (b8 >= -96) {
                b7 = -32;
                if (b7 != -19) {
                }
            }
        }
        throw H0.b();
    }

    static /* bridge */ /* synthetic */ void c(byte b7, byte b8, char[] cArr, int i7) throws H0 {
        if (b7 < -62 || e(b8)) {
            throw H0.b();
        }
        cArr[i7] = (char) (((b7 & 31) << 6) | (b8 & 63));
    }

    static /* bridge */ /* synthetic */ boolean d(byte b7) {
        return b7 >= 0;
    }

    private static boolean e(byte b7) {
        return b7 > -65;
    }
}
