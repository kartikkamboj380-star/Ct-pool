package com.google.android.material.timepicker;

import A3.e;
import A3.j;
import N3.g;
import N3.i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.core.view.H;

/* JADX INFO: loaded from: classes.dex */
abstract class b extends ConstraintLayout {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final Runnable f17314J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private int f17315K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private g f17316L;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.x();
        }
    }

    public b(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        LayoutInflater.from(context).inflate(A3.g.f228f, this);
        H.t0(this, t());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f418U3, i7, 0);
        this.f17315K = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.f425V3, 0);
        this.f17314J = new a();
        typedArrayObtainStyledAttributes.recycle();
    }

    private Drawable t() {
        g gVar = new g();
        this.f17316L = gVar;
        gVar.T(new i(0.5f));
        this.f17316L.V(ColorStateList.valueOf(-1));
        return this.f17316L;
    }

    private static boolean w(View view) {
        return "skip".equals(view.getTag());
    }

    private void y() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f17314J);
            handler.post(this.f17314J);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i7, layoutParams);
        if (view.getId() == -1) {
            view.setId(H.k());
        }
        y();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        x();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        y();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i7) {
        this.f17316L.V(ColorStateList.valueOf(i7));
    }

    public int u() {
        return this.f17315K;
    }

    public void v(int i7) {
        this.f17315K = i7;
        x();
    }

    protected void x() {
        int childCount = getChildCount();
        int i7 = 1;
        for (int i8 = 0; i8 < childCount; i8++) {
            if (w(getChildAt(i8))) {
                i7++;
            }
        }
        d dVar = new d();
        dVar.g(this);
        float f7 = 0.0f;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getId() != e.f196b && !w(childAt)) {
                dVar.h(childAt.getId(), e.f196b, this.f17315K, f7);
                f7 += 360.0f / (childCount - i7);
            }
        }
        dVar.c(this);
    }
}
