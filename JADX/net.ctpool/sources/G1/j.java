package G1;

import android.graphics.Bitmap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public class j extends v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f1204c = new a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // G1.v, G1.B
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Bitmap get(int i7) {
        Bitmap bitmap = (Bitmap) super.get(i7);
        if (bitmap == null || !g(bitmap)) {
            return null;
        }
        bitmap.eraseColor(0);
        return bitmap;
    }

    @Override // G1.B
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public int a(Bitmap bitmap) {
        w5.k.f(bitmap, "bitmap");
        return N1.b.g(bitmap);
    }

    protected final boolean g(Bitmap bitmap) {
        if (bitmap == null) {
            return false;
        }
        if (bitmap.isRecycled()) {
            P0.a.M("BitmapPoolBackend", "Cannot reuse a recycled bitmap: %s", bitmap);
            return false;
        }
        if (bitmap.isMutable()) {
            return true;
        }
        P0.a.M("BitmapPoolBackend", "Cannot reuse an immutable bitmap: %s", bitmap);
        return false;
    }

    @Override // G1.v, G1.B
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void c(Bitmap bitmap) {
        w5.k.f(bitmap, "bitmap");
        if (g(bitmap)) {
            super.c(bitmap);
        }
    }
}
