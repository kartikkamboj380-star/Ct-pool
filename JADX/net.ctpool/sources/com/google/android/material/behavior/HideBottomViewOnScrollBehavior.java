package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f16500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f16501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f16502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ViewPropertyAnimator f16503d;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f16503d = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
        this.f16500a = 0;
        this.f16501b = 2;
        this.f16502c = 0;
    }

    private void F(View view, int i7, long j7, TimeInterpolator timeInterpolator) {
        this.f16503d = view.animate().translationY(i7).setInterpolator(timeInterpolator).setDuration(j7).setListener(new a());
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i7, int i8) {
        return i7 == 2;
    }

    public boolean G() {
        return this.f16501b == 1;
    }

    public boolean H() {
        return this.f16501b == 2;
    }

    public void I(View view) {
        J(view, true);
    }

    public void J(View view, boolean z6) {
        if (G()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f16503d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.f16501b = 1;
        int i7 = this.f16500a + this.f16502c;
        if (z6) {
            F(view, i7, 175L, B3.a.f741c);
        } else {
            view.setTranslationY(i7);
        }
    }

    public void K(View view) {
        L(view, true);
    }

    public void L(View view, boolean z6) {
        if (H()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f16503d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.f16501b = 2;
        if (z6) {
            F(view, 0, 225L, B3.a.f742d);
        } else {
            view.setTranslationY(0);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i7) {
        this.f16500a = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        return super.l(coordinatorLayout, view, i7);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i7, int i8, int i9, int i10, int i11, int[] iArr) {
        if (i8 > 0) {
            I(view);
        } else if (i8 < 0) {
            K(view);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16500a = 0;
        this.f16501b = 2;
        this.f16502c = 0;
    }
}
