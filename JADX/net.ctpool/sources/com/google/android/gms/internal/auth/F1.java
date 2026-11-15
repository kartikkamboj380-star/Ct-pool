package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes.dex */
abstract class F1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final D1 f13792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f13793b = 0;

    static {
        if (B1.u() && B1.v()) {
            int i7 = AbstractC0958d0.f13883a;
        }
        f13792a = new E1();
    }

    static /* bridge */ /* synthetic */ int a(byte[] bArr, int i7, int i8) {
        int i9 = i8 - i7;
        byte b7 = bArr[i7 - 1];
        if (i9 != 0) {
            if (i9 == 1) {
                byte b8 = bArr[i7];
                if (b7 <= -12 && b8 <= -65) {
                    return b7 ^ (b8 << 8);
                }
            } else {
                if (i9 != 2) {
                    throw new AssertionError();
                }
                byte b9 = bArr[i7];
                byte b10 = bArr[i7 + 1];
                if (b7 <= -12 && b9 <= -65 && b10 <= -65) {
                    return ((b9 << 8) ^ b7) ^ (b10 << 16);
                }
            }
        } else if (b7 <= -12) {
            return b7;
        }
        return -1;
    }

    static boolean b(byte[] bArr) {
        return f13792a.b(bArr, 0, bArr.length);
    }

    static boolean c(byte[] bArr, int i7, int i8) {
        return f13792a.b(bArr, i7, i8);
    }
}
