package D1;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
class f extends b {
    protected f(S0.a aVar, l lVar, int i7, int i8) {
        super(aVar, lVar, i7, i8);
    }

    protected void finalize() throws Throwable {
        if (isClosed()) {
            return;
        }
        P0.a.I("DefaultCloseableStaticBitmap", "finalize: %s %x still open.", getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(this)));
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    protected f(Bitmap bitmap, S0.g gVar, l lVar, int i7, int i8) {
        super(bitmap, gVar, lVar, i7, i8);
    }
}
