package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import androidx.core.view.H;

/* JADX INFO: loaded from: classes.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Rect f16778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ColorStateList f16779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ColorStateList f16780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ColorStateList f16781d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f16782e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final N3.k f16783f;

    private b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i7, N3.k kVar, Rect rect) {
        androidx.core.util.f.c(rect.left);
        androidx.core.util.f.c(rect.top);
        androidx.core.util.f.c(rect.right);
        androidx.core.util.f.c(rect.bottom);
        this.f16778a = rect;
        this.f16779b = colorStateList2;
        this.f16780c = colorStateList;
        this.f16781d = colorStateList3;
        this.f16782e = i7;
        this.f16783f = kVar;
    }

    static b a(Context context, int i7) {
        androidx.core.util.f.a(i7 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i7, A3.j.f389Q2);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(A3.j.f396R2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(A3.j.f410T2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(A3.j.f403S2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(A3.j.f417U2, 0));
        ColorStateList colorStateListA = K3.c.a(context, typedArrayObtainStyledAttributes, A3.j.f424V2);
        ColorStateList colorStateListA2 = K3.c.a(context, typedArrayObtainStyledAttributes, A3.j.f460a3);
        ColorStateList colorStateListA3 = K3.c.a(context, typedArrayObtainStyledAttributes, A3.j.f445Y2);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(A3.j.f452Z2, 0);
        N3.k kVarM = N3.k.b(context, typedArrayObtainStyledAttributes.getResourceId(A3.j.f431W2, 0), typedArrayObtainStyledAttributes.getResourceId(A3.j.f438X2, 0)).m();
        typedArrayObtainStyledAttributes.recycle();
        return new b(colorStateListA, colorStateListA2, colorStateListA3, dimensionPixelSize, kVarM, rect);
    }

    void b(TextView textView) {
        N3.g gVar = new N3.g();
        N3.g gVar2 = new N3.g();
        gVar.setShapeAppearanceModel(this.f16783f);
        gVar2.setShapeAppearanceModel(this.f16783f);
        gVar.V(this.f16780c);
        gVar.a0(this.f16782e, this.f16781d);
        textView.setTextColor(this.f16779b);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f16779b.withAlpha(30), gVar, gVar2);
        Rect rect = this.f16778a;
        H.t0(textView, new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
