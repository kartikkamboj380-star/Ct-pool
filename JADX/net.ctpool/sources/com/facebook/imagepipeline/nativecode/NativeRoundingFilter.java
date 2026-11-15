package com.facebook.imagepipeline.nativecode;

import O0.l;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
@O0.d
public class NativeRoundingFilter {
    static {
        e.a();
    }

    @O0.d
    private static native void nativeAddRoundedCornersFilter(Bitmap bitmap, int i7, int i8, int i9, int i10);

    @O0.d
    private static native void nativeToCircleFastFilter(Bitmap bitmap, boolean z6);

    @O0.d
    private static native void nativeToCircleFilter(Bitmap bitmap, boolean z6);

    @O0.d
    private static native void nativeToCircleWithBorderFilter(Bitmap bitmap, int i7, int i8, boolean z6);

    @O0.d
    public static void toCircle(Bitmap bitmap, boolean z6) {
        l.g(bitmap);
        if (bitmap.getWidth() < 3 || bitmap.getHeight() < 3) {
            return;
        }
        nativeToCircleFilter(bitmap, z6);
    }

    @O0.d
    public static void toCircleFast(Bitmap bitmap, boolean z6) {
        l.g(bitmap);
        if (bitmap.getWidth() < 3 || bitmap.getHeight() < 3) {
            return;
        }
        nativeToCircleFastFilter(bitmap, z6);
    }
}
