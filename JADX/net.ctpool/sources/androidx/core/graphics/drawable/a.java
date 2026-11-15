package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: androidx.core.graphics.drawable.a$a, reason: collision with other inner class name */
    static class C0139a {
        static int a(Drawable drawable) {
            return drawable.getAlpha();
        }

        static Drawable b(DrawableContainer.DrawableContainerState drawableContainerState, int i7) {
            return drawableContainerState.getChild(i7);
        }

        static Drawable c(InsetDrawable insetDrawable) {
            return insetDrawable.getDrawable();
        }

        static boolean d(Drawable drawable) {
            return drawable.isAutoMirrored();
        }

        static void e(Drawable drawable, boolean z6) {
            drawable.setAutoMirrored(z6);
        }
    }

    static class b {
        static void a(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        static boolean b(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        static ColorFilter c(Drawable drawable) {
            return drawable.getColorFilter();
        }

        static void d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        static void e(Drawable drawable, float f7, float f8) {
            drawable.setHotspot(f7, f8);
        }

        static void f(Drawable drawable, int i7, int i8, int i9, int i10) {
            drawable.setHotspotBounds(i7, i8, i9, i10);
        }

        static void g(Drawable drawable, int i7) {
            drawable.setTint(i7);
        }

        static void h(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        static void i(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    static class c {
        static int a(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        static boolean b(Drawable drawable, int i7) {
            return drawable.setLayoutDirection(i7);
        }
    }

    public static void a(Drawable drawable) {
        drawable.clearColorFilter();
    }

    public static int b(Drawable drawable) {
        return c.a(drawable);
    }

    public static boolean c(Drawable drawable) {
        return C0139a.d(drawable);
    }

    public static void d(Drawable drawable, boolean z6) {
        C0139a.e(drawable, z6);
    }

    public static void e(Drawable drawable, float f7, float f8) {
        b.e(drawable, f7, f8);
    }

    public static void f(Drawable drawable, int i7, int i8, int i9, int i10) {
        b.f(drawable, i7, i8, i9, i10);
    }

    public static boolean g(Drawable drawable, int i7) {
        return c.b(drawable, i7);
    }

    public static void h(Drawable drawable, int i7) {
        b.g(drawable, i7);
    }

    public static void i(Drawable drawable, ColorStateList colorStateList) {
        b.h(drawable, colorStateList);
    }

    public static void j(Drawable drawable, PorterDuff.Mode mode) {
        b.i(drawable, mode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Drawable k(Drawable drawable) {
        return drawable instanceof androidx.core.graphics.drawable.b ? ((androidx.core.graphics.drawable.b) drawable).b() : drawable;
    }

    public static Drawable l(Drawable drawable) {
        return drawable;
    }
}
