package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.H;
import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes.dex */
abstract class b extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Runnable f16475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    OverScroller f16476e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f16477f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f16478g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f16479h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f16480i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private VelocityTracker f16481j;

    private class a implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final CoordinatorLayout f16482m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final View f16483n;

        a(CoordinatorLayout coordinatorLayout, View view) {
            this.f16482m = coordinatorLayout;
            this.f16483n = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f16483n == null || (overScroller = b.this.f16476e) == null) {
                return;
            }
            if (!overScroller.computeScrollOffset()) {
                b.this.N(this.f16482m, this.f16483n);
                return;
            }
            b bVar = b.this;
            bVar.P(this.f16482m, this.f16483n, bVar.f16476e.getCurrY());
            H.h0(this.f16483n, this);
        }
    }

    public b() {
        this.f16478g = -1;
        this.f16480i = -1;
    }

    private void I() {
        if (this.f16481j == null) {
            this.f16481j = VelocityTracker.obtain();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z6;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            VelocityTracker velocityTracker3 = this.f16481j;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
                this.f16481j.computeCurrentVelocity(1000);
                J(coordinatorLayout, view, -L(view), 0, this.f16481j.getYVelocity(this.f16478g));
                z6 = true;
            }
            this.f16477f = false;
            this.f16478g = -1;
            velocityTracker = this.f16481j;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f16481j = null;
            }
            velocityTracker2 = this.f16481j;
            if (velocityTracker2 != null) {
            }
            if (this.f16477f) {
                return true;
            }
        }
        if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f16478g);
            if (iFindPointerIndex == -1) {
                return false;
            }
            int y6 = (int) motionEvent.getY(iFindPointerIndex);
            int i7 = this.f16479h - y6;
            this.f16479h = y6;
            O(coordinatorLayout, view, i7, K(view), 0);
        } else if (actionMasked != 3) {
            if (actionMasked == 6) {
                int i8 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                this.f16478g = motionEvent.getPointerId(i8);
                this.f16479h = (int) (motionEvent.getY(i8) + 0.5f);
            }
        }
        z6 = false;
        velocityTracker2 = this.f16481j;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return !this.f16477f || z6;
        z6 = false;
        this.f16477f = false;
        this.f16478g = -1;
        velocityTracker = this.f16481j;
        if (velocityTracker != null) {
        }
        velocityTracker2 = this.f16481j;
        if (velocityTracker2 != null) {
        }
        if (this.f16477f) {
        }
    }

    abstract boolean H(View view);

    final boolean J(CoordinatorLayout coordinatorLayout, View view, int i7, int i8, float f7) {
        Runnable runnable = this.f16475d;
        if (runnable != null) {
            view.removeCallbacks(runnable);
            this.f16475d = null;
        }
        if (this.f16476e == null) {
            this.f16476e = new OverScroller(view.getContext());
        }
        this.f16476e.fling(0, E(), 0, Math.round(f7), 0, 0, i7, i8);
        if (!this.f16476e.computeScrollOffset()) {
            N(coordinatorLayout, view);
            return false;
        }
        a aVar = new a(coordinatorLayout, view);
        this.f16475d = aVar;
        H.h0(view, aVar);
        return true;
    }

    abstract int K(View view);

    abstract int L(View view);

    abstract int M();

    abstract void N(CoordinatorLayout coordinatorLayout, View view);

    final int O(CoordinatorLayout coordinatorLayout, View view, int i7, int i8, int i9) {
        return Q(coordinatorLayout, view, M() - i7, i8, i9);
    }

    int P(CoordinatorLayout coordinatorLayout, View view, int i7) {
        return Q(coordinatorLayout, view, i7, Integer.MIN_VALUE, Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    abstract int Q(CoordinatorLayout coordinatorLayout, View view, int i7, int i8, int i9);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (this.f16480i < 0) {
            this.f16480i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f16477f) {
            int i7 = this.f16478g;
            if (i7 == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i7)) == -1) {
                return false;
            }
            int y6 = (int) motionEvent.getY(iFindPointerIndex);
            if (Math.abs(y6 - this.f16479h) > this.f16480i) {
                this.f16479h = y6;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f16478g = -1;
            int x6 = (int) motionEvent.getX();
            int y7 = (int) motionEvent.getY();
            boolean z6 = H(view) && coordinatorLayout.C(view, x6, y7);
            this.f16477f = z6;
            if (z6) {
                this.f16479h = y7;
                this.f16478g = motionEvent.getPointerId(0);
                I();
                OverScroller overScroller = this.f16476e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f16476e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f16481j;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16478g = -1;
        this.f16480i = -1;
    }
}
