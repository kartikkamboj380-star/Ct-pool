package g0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;

/* JADX INFO: renamed from: g0.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1666A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final M f19311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Property f19312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Property f19313c;

    /* JADX INFO: renamed from: g0.A$a */
    static class a extends Property {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(AbstractC1666A.c(view));
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f7) {
            AbstractC1666A.g(view, f7.floatValue());
        }
    }

    /* JADX INFO: renamed from: g0.A$b */
    static class b extends Property {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Rect get(View view) {
            return androidx.core.view.H.u(view);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Rect rect) {
            androidx.core.view.H.w0(view, rect);
        }
    }

    static {
        f19311a = Build.VERSION.SDK_INT >= 29 ? new L() : new K();
        f19312b = new a(Float.class, "translationAlpha");
        f19313c = new b(Rect.class, "clipBounds");
    }

    static void a(View view) {
        f19311a.a(view);
    }

    static z b(View view) {
        return new y(view);
    }

    static float c(View view) {
        return f19311a.b(view);
    }

    static P d(View view) {
        return new O(view);
    }

    static void e(View view) {
        f19311a.c(view);
    }

    static void f(View view, int i7, int i8, int i9, int i10) {
        f19311a.d(view, i7, i8, i9, i10);
    }

    static void g(View view, float f7) {
        f19311a.e(view, f7);
    }

    static void h(View view, int i7) {
        f19311a.f(view, i7);
    }

    static void i(View view, Matrix matrix) {
        f19311a.g(view, matrix);
    }

    static void j(View view, Matrix matrix) {
        f19311a.h(view, matrix);
    }
}
