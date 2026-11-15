package G1;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public final class r implements i {
    @Override // R0.f
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Bitmap get(int i7) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, (int) Math.ceil(((double) i7) / 2.0d), Bitmap.Config.RGB_565);
        w5.k.e(bitmapCreateBitmap, "createBitmap(\n          …   Bitmap.Config.RGB_565)");
        return bitmapCreateBitmap;
    }

    @Override // R0.f, S0.g
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void a(Bitmap bitmap) {
        w5.k.f(bitmap, "value");
        bitmap.recycle();
    }
}
