package com.google.android.gms.internal.common;

/* JADX INFO: loaded from: classes.dex */
final class w extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final char f14114a;

    w(char c7) {
        this.f14114a = c7;
    }

    @Override // com.google.android.gms.internal.common.z
    public final boolean a(char c7) {
        return c7 == this.f14114a;
    }

    public final String toString() {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        int i7 = this.f14114a;
        for (int i8 = 0; i8 < 4; i8++) {
            cArr[5 - i8] = "0123456789ABCDEF".charAt(i7 & 15);
            i7 >>= 4;
        }
        return "CharMatcher.is('" + String.copyValueOf(cArr) + "')";
    }
}
