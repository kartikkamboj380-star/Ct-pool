package com.facebook.react.views.text;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f13018a = new a();

    private a() {
    }

    private final ColorStateList a(Context context, int i7) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i7});
        w5.k.e(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        return typedArrayObtainStyledAttributes.getColorStateList(0);
    }

    public static final ColorStateList b(Context context) {
        w5.k.f(context, "context");
        return f13018a.a(context, R.attr.textColor);
    }

    public static final int c(Context context) {
        w5.k.f(context, "context");
        ColorStateList colorStateListA = f13018a.a(context, R.attr.textColorHighlight);
        if (colorStateListA != null) {
            return colorStateListA.getDefaultColor();
        }
        return 0;
    }

    public static final ColorStateList d(Context context) {
        w5.k.f(context, "context");
        return f13018a.a(context, R.attr.textColorHint);
    }
}
