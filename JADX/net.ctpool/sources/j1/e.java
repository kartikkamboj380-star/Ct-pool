package j1;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static void a(Drawable drawable, Drawable drawable2) {
        if (drawable2 == null || drawable == null || drawable == drawable2) {
            return;
        }
        drawable.setBounds(drawable2.getBounds());
        drawable.setChangingConfigurations(drawable2.getChangingConfigurations());
        drawable.setLevel(drawable2.getLevel());
        drawable.setVisible(drawable2.isVisible(), false);
        drawable.setState(drawable2.getState());
    }

    public static int b(int i7) {
        int i8 = i7 >>> 24;
        if (i8 == 255) {
            return -1;
        }
        return i8 == 0 ? -2 : -3;
    }

    public static int c(int i7, int i8) {
        if (i8 == 255) {
            return i7;
        }
        if (i8 == 0) {
            return i7 & 16777215;
        }
        return (i7 & 16777215) | ((((i7 >>> 24) * (i8 + (i8 >> 7))) >> 8) << 24);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void d(Drawable drawable, Drawable.Callback callback, r rVar) {
        if (drawable != 0) {
            drawable.setCallback(callback);
            if (drawable instanceof q) {
                ((q) drawable).m(rVar);
            }
        }
    }

    public static void e(Drawable drawable, C1777d c1777d) {
        if (drawable == null || c1777d == null) {
            return;
        }
        c1777d.a(drawable);
    }
}
