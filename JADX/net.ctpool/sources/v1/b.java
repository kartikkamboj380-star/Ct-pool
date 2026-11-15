package v1;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public S0.a a(int i7, int i8) {
        return b(i7, i8, Bitmap.Config.ARGB_8888);
    }

    public S0.a b(int i7, int i8, Bitmap.Config config) {
        return c(i7, i8, config, null);
    }

    public S0.a c(int i7, int i8, Bitmap.Config config, Object obj) {
        return d(i7, i8, config);
    }

    public abstract S0.a d(int i7, int i8, Bitmap.Config config);
}
