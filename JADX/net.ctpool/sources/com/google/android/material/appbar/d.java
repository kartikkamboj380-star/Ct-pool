package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes.dex */
abstract class d extends CoordinatorLayout.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f16489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f16490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f16491c;

    public d() {
        this.f16490b = 0;
        this.f16491c = 0;
    }

    public int E() {
        e eVar = this.f16489a;
        if (eVar != null) {
            return eVar.b();
        }
        return 0;
    }

    protected void F(CoordinatorLayout coordinatorLayout, View view, int i7) {
        coordinatorLayout.K(view, i7);
    }

    public boolean G(int i7) {
        e eVar = this.f16489a;
        if (eVar != null) {
            return eVar.e(i7);
        }
        this.f16490b = i7;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i7) {
        F(coordinatorLayout, view, i7);
        if (this.f16489a == null) {
            this.f16489a = new e(view);
        }
        this.f16489a.c();
        this.f16489a.a();
        int i8 = this.f16490b;
        if (i8 != 0) {
            this.f16489a.e(i8);
            this.f16490b = 0;
        }
        int i9 = this.f16491c;
        if (i9 == 0) {
            return true;
        }
        this.f16489a.d(i9);
        this.f16491c = 0;
        return true;
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16490b = 0;
        this.f16491c = 0;
    }
}
