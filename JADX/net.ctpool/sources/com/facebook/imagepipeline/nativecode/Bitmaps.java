package com.facebook.imagepipeline.nativecode;

import O0.l;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
@O0.d
public class Bitmaps {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f10696a = 0;

    static {
        d.a();
    }

    @O0.d
    public static void copyBitmap(Bitmap bitmap, Bitmap bitmap2) {
        l.b(Boolean.valueOf(bitmap2.getConfig() == bitmap.getConfig()));
        l.b(Boolean.valueOf(bitmap.isMutable()));
        l.b(Boolean.valueOf(bitmap.getWidth() == bitmap2.getWidth()));
        l.b(Boolean.valueOf(bitmap.getHeight() == bitmap2.getHeight()));
        nativeCopyBitmap(bitmap, bitmap.getRowBytes(), bitmap2, bitmap2.getRowBytes(), bitmap.getHeight());
    }

    @O0.d
    private static native void nativeCopyBitmap(Bitmap bitmap, int i7, Bitmap bitmap2, int i8, int i9);
}
