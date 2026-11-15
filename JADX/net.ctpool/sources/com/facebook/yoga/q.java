package com.facebook.yoga;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {
    public static long a(float f7, float f8) {
        return ((long) Float.floatToRawIntBits(f8)) | (((long) Float.floatToRawIntBits(f7)) << 32);
    }

    public static long b(int i7, int i8) {
        return a(i7, i8);
    }
}
