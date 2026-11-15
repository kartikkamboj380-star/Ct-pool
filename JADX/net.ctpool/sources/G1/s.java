package G1;

import android.graphics.Bitmap;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class s implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f1221a;

    public s() {
        Set setB = O0.n.b();
        w5.k.e(setB, "newIdentityHashSet()");
        this.f1221a = setB;
    }

    @Override // R0.f
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Bitmap get(int i7) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, (int) Math.ceil(((double) i7) / 2.0d), Bitmap.Config.RGB_565);
        w5.k.e(bitmapCreateBitmap, "createBitmap(\n          …   Bitmap.Config.RGB_565)");
        this.f1221a.add(bitmapCreateBitmap);
        return bitmapCreateBitmap;
    }

    @Override // R0.f, S0.g
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void a(Bitmap bitmap) {
        w5.k.f(bitmap, "value");
        this.f1221a.remove(bitmap);
        bitmap.recycle();
    }
}
