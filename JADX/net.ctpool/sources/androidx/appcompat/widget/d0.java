package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f6084a = new ThreadLocal();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int[] f6085b = {-16842910};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int[] f6086c = {R.attr.state_focused};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int[] f6087d = {R.attr.state_activated};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int[] f6088e = {R.attr.state_pressed};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final int[] f6089f = {R.attr.state_checked};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final int[] f6090g = {R.attr.state_selected};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final int[] f6091h = {-16842919, -16842908};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final int[] f6092i = new int[0];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int[] f6093j = new int[1];

    public static void a(View view, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(e.j.f19144y0);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(e.j.f18917D0)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i7) {
        ColorStateList colorStateListE = e(context, i7);
        if (colorStateListE != null && colorStateListE.isStateful()) {
            return colorStateListE.getColorForState(f6085b, colorStateListE.getDefaultColor());
        }
        TypedValue typedValueF = f();
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValueF, true);
        return d(context, i7, typedValueF.getFloat());
    }

    public static int c(Context context, int i7) {
        int[] iArr = f6093j;
        iArr[0] = i7;
        h0 h0VarU = h0.u(context, null, iArr);
        try {
            return h0VarU.b(0, 0);
        } finally {
            h0VarU.w();
        }
    }

    static int d(Context context, int i7, float f7) {
        return androidx.core.graphics.a.k(c(context, i7), Math.round(Color.alpha(r0) * f7));
    }

    public static ColorStateList e(Context context, int i7) {
        int[] iArr = f6093j;
        iArr[0] = i7;
        h0 h0VarU = h0.u(context, null, iArr);
        try {
            return h0VarU.c(0);
        } finally {
            h0VarU.w();
        }
    }

    private static TypedValue f() {
        ThreadLocal threadLocal = f6084a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }
}
