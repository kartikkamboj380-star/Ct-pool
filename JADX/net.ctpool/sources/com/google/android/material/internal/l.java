package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.h0;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f17033a = {A3.a.f110j};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f17034b = {A3.a.f111k};

    public static void a(Context context) {
        e(context, f17033a, "Theme.AppCompat");
    }

    private static void b(Context context, AttributeSet attributeSet, int i7, int i8) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A3.j.f567n6, i7, i8);
        boolean z6 = typedArrayObtainStyledAttributes.getBoolean(A3.j.p6, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z6) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(A3.a.f117q, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                c(context);
            }
        }
        a(context);
    }

    public static void c(Context context) {
        e(context, f17034b, "Theme.MaterialComponents");
    }

    private static void d(Context context, AttributeSet attributeSet, int[] iArr, int i7, int i8, int... iArr2) {
        boolean zF;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A3.j.f567n6, i7, i8);
        if (!typedArrayObtainStyledAttributes.getBoolean(A3.j.q6, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 == null || iArr2.length == 0) {
            zF = typedArrayObtainStyledAttributes.getResourceId(A3.j.o6, -1) != -1;
        } else {
            zF = f(context, attributeSet, iArr, i7, i8, iArr2);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!zF) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    private static void e(Context context, int[] iArr, String str) {
        if (g(context, iArr)) {
            return;
        }
        throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
    }

    private static boolean f(Context context, AttributeSet attributeSet, int[] iArr, int i7, int i8, int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i7, i8);
        for (int i9 : iArr2) {
            if (typedArrayObtainStyledAttributes.getResourceId(i9, -1) == -1) {
                typedArrayObtainStyledAttributes.recycle();
                return false;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return true;
    }

    private static boolean g(Context context, int[] iArr) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i7 = 0; i7 < iArr.length; i7++) {
            if (!typedArrayObtainStyledAttributes.hasValue(i7)) {
                typedArrayObtainStyledAttributes.recycle();
                return false;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return true;
    }

    public static TypedArray h(Context context, AttributeSet attributeSet, int[] iArr, int i7, int i8, int... iArr2) {
        b(context, attributeSet, i7, i8);
        d(context, attributeSet, iArr, i7, i8, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i7, i8);
    }

    public static h0 i(Context context, AttributeSet attributeSet, int[] iArr, int i7, int i8, int... iArr2) {
        b(context, attributeSet, i7, i8);
        d(context, attributeSet, iArr, i7, i8, iArr2);
        return h0.v(context, attributeSet, iArr, i7, i8);
    }
}
