package M1;

import android.graphics.Bitmap;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f2025a = new b();

    private b() {
    }

    public static final boolean a(a aVar, S0.a aVar2) {
        if (aVar == null || aVar2 == null) {
            return false;
        }
        Object objJ = aVar2.j();
        k.e(objJ, "bitmapReference.get()");
        Bitmap bitmap = (Bitmap) objJ;
        if (aVar.a()) {
            bitmap.setHasAlpha(true);
        }
        aVar.b(bitmap);
        return true;
    }
}
