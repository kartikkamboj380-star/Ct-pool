package E3;

import K3.b;
import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static int a(int i7, int i8) {
        return androidx.core.graphics.a.k(i7, (Color.alpha(i7) * i8) / 255);
    }

    public static int b(Context context, int i7, int i8) {
        TypedValue typedValueA = b.a(context, i7);
        return typedValueA != null ? typedValueA.data : i8;
    }

    public static int c(Context context, int i7, String str) {
        return b.c(context, i7, str);
    }

    public static int d(View view, int i7) {
        return b.d(view, i7);
    }

    public static int e(View view, int i7, int i8) {
        return b(view.getContext(), i7, i8);
    }

    public static boolean f(int i7) {
        return i7 != 0 && androidx.core.graphics.a.d(i7) > 0.5d;
    }

    public static int g(int i7, int i8) {
        return androidx.core.graphics.a.g(i8, i7);
    }

    public static int h(int i7, int i8, float f7) {
        return g(i7, androidx.core.graphics.a.k(i8, Math.round(Color.alpha(i8) * f7)));
    }

    public static int i(View view, int i7, int i8, float f7) {
        return h(d(view, i7), d(view, i8), f7);
    }
}
