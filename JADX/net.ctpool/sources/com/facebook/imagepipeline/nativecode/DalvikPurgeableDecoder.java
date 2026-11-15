package com.facebook.imagepipeline.nativecode;

import G1.C0380g;
import G1.C0381h;
import O0.l;
import O0.q;
import R0.h;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.os.Build;
import java.util.Locale;
import x1.C2217h;

/* JADX INFO: loaded from: classes.dex */
@O0.d
public abstract class DalvikPurgeableDecoder implements H1.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final byte[] f10697b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0380g f10698a = C0381h.a();

    @com.facebook.soloader.f
    private static class OreoUtils {
        private OreoUtils() {
        }

        static void a(BitmapFactory.Options options, ColorSpace colorSpace) {
            if (colorSpace == null) {
                colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
            options.inPreferredColorSpace = colorSpace;
        }
    }

    static {
        d.a();
        f10697b = new byte[]{-1, -39};
    }

    protected DalvikPurgeableDecoder() {
    }

    public static boolean e(S0.a aVar, int i7) {
        h hVar = (h) aVar.j();
        return i7 >= 2 && hVar.k(i7 + (-2)) == -1 && hVar.k(i7 - 1) == -39;
    }

    public static BitmapFactory.Options f(int i7, Bitmap.Config config) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = i7;
        options.inMutable = true;
        return options;
    }

    @O0.d
    private static native void nativePinBitmap(Bitmap bitmap);

    @Override // H1.f
    public S0.a a(D1.g gVar, Bitmap.Config config, Rect rect, int i7, ColorSpace colorSpace) {
        BitmapFactory.Options optionsF = f(gVar.z(), config);
        if (Build.VERSION.SDK_INT >= 26) {
            OreoUtils.a(optionsF, colorSpace);
        }
        S0.a aVarF = gVar.f();
        l.g(aVarF);
        try {
            return g(d(aVarF, i7, optionsF));
        } finally {
            S0.a.g(aVarF);
        }
    }

    @Override // H1.f
    public S0.a b(D1.g gVar, Bitmap.Config config, Rect rect, ColorSpace colorSpace) {
        BitmapFactory.Options optionsF = f(gVar.z(), config);
        if (Build.VERSION.SDK_INT >= 26) {
            OreoUtils.a(optionsF, colorSpace);
        }
        S0.a aVarF = gVar.f();
        l.g(aVarF);
        try {
            return g(c(aVarF, optionsF));
        } finally {
            S0.a.g(aVarF);
        }
    }

    protected abstract Bitmap c(S0.a aVar, BitmapFactory.Options options);

    protected abstract Bitmap d(S0.a aVar, int i7, BitmapFactory.Options options);

    public S0.a g(Bitmap bitmap) {
        l.g(bitmap);
        try {
            nativePinBitmap(bitmap);
            if (this.f10698a.g(bitmap)) {
                return S0.a.W(bitmap, this.f10698a.e());
            }
            int iG = N1.b.g(bitmap);
            bitmap.recycle();
            throw new C2217h(String.format(Locale.US, "Attempted to pin a bitmap of size %d bytes. The current pool count is %d, the current pool size is %d bytes. The current pool max count is %d, the current pool max size is %d bytes.", Integer.valueOf(iG), Integer.valueOf(this.f10698a.b()), Long.valueOf(this.f10698a.f()), Integer.valueOf(this.f10698a.c()), Integer.valueOf(this.f10698a.d())));
        } catch (Exception e7) {
            bitmap.recycle();
            throw q.a(e7);
        }
    }
}
