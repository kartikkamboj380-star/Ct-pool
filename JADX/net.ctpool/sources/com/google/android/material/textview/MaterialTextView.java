package com.google.android.material.textview;

import A3.a;
import A3.j;
import K3.b;
import K3.c;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.D;

/* JADX INFO: loaded from: classes.dex */
public class MaterialTextView extends D {
    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private void r(Resources.Theme theme, int i7) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(i7, j.f564n3);
        int iU = u(getContext(), typedArrayObtainStyledAttributes, j.f579p3, j.f586q3);
        typedArrayObtainStyledAttributes.recycle();
        if (iU >= 0) {
            setLineHeight(iU);
        }
    }

    private static boolean s(Context context) {
        return b.b(context, a.f97C, true);
    }

    private static int t(Resources.Theme theme, AttributeSet attributeSet, int i7, int i8) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, j.f593r3, i7, i8);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(j.f600s3, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    private static int u(Context context, TypedArray typedArray, int... iArr) {
        int iC = -1;
        for (int i7 = 0; i7 < iArr.length && iC < 0; i7++) {
            iC = c.c(context, typedArray, iArr[i7], -1);
        }
        return iC;
    }

    private static boolean v(Context context, Resources.Theme theme, AttributeSet attributeSet, int i7, int i8) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, j.f593r3, i7, i8);
        int iU = u(context, typedArrayObtainStyledAttributes, j.f607t3, j.f614u3);
        typedArrayObtainStyledAttributes.recycle();
        return iU != -1;
    }

    @Override // androidx.appcompat.widget.D, android.widget.TextView
    public void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        if (s(context)) {
            r(context.getTheme(), i7);
        }
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i7) {
        this(context, attributeSet, i7, 0);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i7, int i8) {
        int iT;
        super(O3.a.c(context, attributeSet, i7, i8), attributeSet, i7);
        Context context2 = getContext();
        if (s(context2)) {
            Resources.Theme theme = context2.getTheme();
            if (v(context2, theme, attributeSet, i7, i8) || (iT = t(theme, attributeSet, i7, i8)) == -1) {
                return;
            }
            r(theme, iT);
        }
    }
}
