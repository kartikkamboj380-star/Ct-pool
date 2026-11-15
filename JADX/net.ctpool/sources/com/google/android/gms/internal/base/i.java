package com.google.android.gms.internal.base;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
final class i extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final i f14057a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final h f14058b = new h(null);

    private i() {
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return f14058b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
