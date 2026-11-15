package com.google.android.material.snackbar;

import A3.j;
import K3.c;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.H;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.internal.n;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseTransientBottomBar {

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final a f17043j = new a(this);

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean E(View view) {
            return this.f17043j.a(view);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.f17043j.b(coordinatorLayout, view, motionEvent);
            return super.k(coordinatorLayout, view, motionEvent);
        }
    }

    public static class a {
        public a(SwipeDismissBehavior swipeDismissBehavior) {
            swipeDismissBehavior.K(0.1f);
            swipeDismissBehavior.J(0.6f);
            swipeDismissBehavior.L(0);
        }

        public boolean a(View view) {
            return view instanceof b;
        }

        public void b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (coordinatorLayout.C(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                    com.google.android.material.snackbar.a.b().e(null);
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                com.google.android.material.snackbar.a.b().f(null);
            }
        }
    }

    protected static class b extends FrameLayout {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private static final View.OnTouchListener f17044v = new a();

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f17045m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final float f17046n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final float f17047o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final int f17048p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final int f17049q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private ColorStateList f17050r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private PorterDuff.Mode f17051s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private Rect f17052t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private boolean f17053u;

        class a implements View.OnTouchListener {
            a() {
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        protected b(Context context, AttributeSet attributeSet) {
            super(O3.a.c(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, j.f594r4);
            if (typedArrayObtainStyledAttributes.hasValue(j.f643y4)) {
                H.x0(this, typedArrayObtainStyledAttributes.getDimensionPixelSize(j.f643y4, 0));
            }
            this.f17045m = typedArrayObtainStyledAttributes.getInt(j.f615u4, 0);
            this.f17046n = typedArrayObtainStyledAttributes.getFloat(j.f622v4, 1.0f);
            setBackgroundTintList(c.a(context2, typedArrayObtainStyledAttributes, j.f629w4));
            setBackgroundTintMode(n.f(typedArrayObtainStyledAttributes.getInt(j.f636x4, -1), PorterDuff.Mode.SRC_IN));
            this.f17047o = typedArrayObtainStyledAttributes.getFloat(j.f608t4, 1.0f);
            this.f17048p = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.f601s4, -1);
            this.f17049q = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.f650z4, -1);
            typedArrayObtainStyledAttributes.recycle();
            setOnTouchListener(f17044v);
            setFocusable(true);
            if (getBackground() == null) {
                H.t0(this, a());
            }
        }

        private Drawable a() {
            float dimension = getResources().getDimension(A3.c.f144L);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(E3.a.i(this, A3.a.f112l, A3.a.f109i, getBackgroundOverlayColorAlpha()));
            if (this.f17050r == null) {
                return androidx.core.graphics.drawable.a.l(gradientDrawable);
            }
            Drawable drawableL = androidx.core.graphics.drawable.a.l(gradientDrawable);
            androidx.core.graphics.drawable.a.i(drawableL, this.f17050r);
            return drawableL;
        }

        private void b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.f17052t = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }

        private void setBaseTransientBottomBar(BaseTransientBottomBar baseTransientBottomBar) {
        }

        float getActionTextColorAlpha() {
            return this.f17047o;
        }

        int getAnimationMode() {
            return this.f17045m;
        }

        float getBackgroundOverlayColorAlpha() {
            return this.f17046n;
        }

        int getMaxInlineActionWidth() {
            return this.f17049q;
        }

        int getMaxWidth() {
            return this.f17048p;
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            H.m0(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
            super.onLayout(z6, i7, i8, i9, i10);
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i7, int i8) {
            super.onMeasure(i7, i8);
            if (this.f17048p > 0) {
                int measuredWidth = getMeasuredWidth();
                int i9 = this.f17048p;
                if (measuredWidth > i9) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), i8);
                }
            }
        }

        void setAnimationMode(int i7) {
            this.f17045m = i7;
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.f17050r != null) {
                drawable = androidx.core.graphics.drawable.a.l(drawable.mutate());
                androidx.core.graphics.drawable.a.i(drawable, this.f17050r);
                androidx.core.graphics.drawable.a.j(drawable, this.f17051s);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f17050r = colorStateList;
            if (getBackground() != null) {
                Drawable drawableL = androidx.core.graphics.drawable.a.l(getBackground().mutate());
                androidx.core.graphics.drawable.a.i(drawableL, colorStateList);
                androidx.core.graphics.drawable.a.j(drawableL, this.f17051s);
                if (drawableL != getBackground()) {
                    super.setBackgroundDrawable(drawableL);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f17051s = mode;
            if (getBackground() != null) {
                Drawable drawableL = androidx.core.graphics.drawable.a.l(getBackground().mutate());
                androidx.core.graphics.drawable.a.j(drawableL, mode);
                if (drawableL != getBackground()) {
                    super.setBackgroundDrawable(drawableL);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (this.f17053u || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                return;
            }
            b((ViewGroup.MarginLayoutParams) layoutParams);
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f17044v);
            super.setOnClickListener(onClickListener);
        }
    }
}
