package com.facebook.imagepipeline.nativecode;

import O0.l;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
@O0.d
public class NativeBlurFilter {
    static {
        e.a();
    }

    public static void a(Bitmap bitmap, int i7, int i8) {
        l.g(bitmap);
        l.b(Boolean.valueOf(i7 > 0));
        l.b(Boolean.valueOf(i8 > 0));
        nativeIterativeBoxBlur(bitmap, i7, i8);
    }

    @O0.d
    private static native void nativeIterativeBoxBlur(Bitmap bitmap, int i7, int i8);
}
