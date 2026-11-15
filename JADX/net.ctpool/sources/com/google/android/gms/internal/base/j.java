package com.google.android.gms.internal.base;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
final class j extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f14059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f14060b;

    j(j jVar) {
        if (jVar != null) {
            this.f14059a = jVar.f14059a;
            this.f14060b = jVar.f14060b;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f14059a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new k(this);
    }
}
