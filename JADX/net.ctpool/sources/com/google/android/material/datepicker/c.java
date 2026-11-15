package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final b f16784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final b f16785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final b f16786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final b f16787d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final b f16788e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final b f16789f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final b f16790g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Paint f16791h;

    c(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(K3.b.c(context, A3.a.f120t, h.class.getCanonicalName()), A3.j.f326H2);
        this.f16784a = b.a(context, typedArrayObtainStyledAttributes.getResourceId(A3.j.f347K2, 0));
        this.f16790g = b.a(context, typedArrayObtainStyledAttributes.getResourceId(A3.j.f333I2, 0));
        this.f16785b = b.a(context, typedArrayObtainStyledAttributes.getResourceId(A3.j.f340J2, 0));
        this.f16786c = b.a(context, typedArrayObtainStyledAttributes.getResourceId(A3.j.f354L2, 0));
        ColorStateList colorStateListA = K3.c.a(context, typedArrayObtainStyledAttributes, A3.j.f361M2);
        this.f16787d = b.a(context, typedArrayObtainStyledAttributes.getResourceId(A3.j.f375O2, 0));
        this.f16788e = b.a(context, typedArrayObtainStyledAttributes.getResourceId(A3.j.f368N2, 0));
        this.f16789f = b.a(context, typedArrayObtainStyledAttributes.getResourceId(A3.j.f382P2, 0));
        Paint paint = new Paint();
        this.f16791h = paint;
        paint.setColor(colorStateListA.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
