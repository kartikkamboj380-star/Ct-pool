package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC0595o;
import androidx.core.view.H;
import androidx.core.view.U;
import java.util.List;
import w.AbstractC2173a;

/* JADX INFO: loaded from: classes.dex */
abstract class c extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Rect f16485d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Rect f16486e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f16487f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f16488g;

    public c() {
        this.f16485d = new Rect();
        this.f16486e = new Rect();
        this.f16487f = 0;
    }

    private static int N(int i7) {
        if (i7 == 0) {
            return 8388659;
        }
        return i7;
    }

    @Override // com.google.android.material.appbar.d
    protected void F(CoordinatorLayout coordinatorLayout, View view, int i7) {
        int bottom;
        View viewH = H(coordinatorLayout.s(view));
        if (viewH != null) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
            Rect rect = this.f16485d;
            rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, viewH.getBottom() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, ((coordinatorLayout.getHeight() + viewH.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
            U lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && H.y(coordinatorLayout) && !H.y(view)) {
                rect.left += lastWindowInsets.j();
                rect.right -= lastWindowInsets.k();
            }
            Rect rect2 = this.f16486e;
            AbstractC0595o.a(N(fVar.f6848c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i7);
            int I6 = I(viewH);
            view.layout(rect2.left, rect2.top - I6, rect2.right, rect2.bottom - I6);
            bottom = rect2.top - viewH.getBottom();
        } else {
            super.F(coordinatorLayout, view, i7);
            bottom = 0;
        }
        this.f16487f = bottom;
    }

    abstract View H(List list);

    final int I(View view) {
        if (this.f16488g == 0) {
            return 0;
        }
        float fJ = J(view);
        int i7 = this.f16488g;
        return AbstractC2173a.b((int) (fJ * i7), 0, i7);
    }

    abstract float J(View view);

    public final int K() {
        return this.f16488g;
    }

    int L(View view) {
        return view.getMeasuredHeight();
    }

    final int M() {
        return this.f16487f;
    }

    public final void O(int i7) {
        this.f16488g = i7;
    }

    protected boolean P() {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i7, int i8, int i9, int i10) {
        View viewH;
        U lastWindowInsets;
        int i11 = view.getLayoutParams().height;
        if ((i11 != -1 && i11 != -2) || (viewH = H(coordinatorLayout.s(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i9);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (H.y(viewH) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.l() + lastWindowInsets.i();
        }
        int iL = size + L(viewH);
        int measuredHeight = viewH.getMeasuredHeight();
        if (P()) {
            view.setTranslationY(-measuredHeight);
        } else {
            iL -= measuredHeight;
        }
        coordinatorLayout.L(view, i7, i8, View.MeasureSpec.makeMeasureSpec(iL, i11 == -1 ? 1073741824 : Integer.MIN_VALUE), i10);
        return true;
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16485d = new Rect();
        this.f16486e = new Rect();
        this.f16487f = 0;
    }
}
