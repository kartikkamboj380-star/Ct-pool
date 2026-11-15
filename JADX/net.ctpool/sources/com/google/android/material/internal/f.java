package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.T;

/* JADX INFO: loaded from: classes.dex */
public abstract class f extends T {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private Drawable f17006B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final Rect f17007C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final Rect f17008D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f17009E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    protected boolean f17010F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    boolean f17011G;

    public f(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f17007C = new Rect();
        this.f17008D = new Rect();
        this.f17009E = 119;
        this.f17010F = true;
        this.f17011G = false;
        TypedArray typedArrayH = l.h(context, attributeSet, A3.j.f339J1, i7, 0, new int[0]);
        this.f17009E = typedArrayH.getInt(A3.j.f353L1, this.f17009E);
        Drawable drawable = typedArrayH.getDrawable(A3.j.f346K1);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f17010F = typedArrayH.getBoolean(A3.j.f360M1, true);
        typedArrayH.recycle();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f17006B;
        if (drawable != null) {
            if (this.f17011G) {
                this.f17011G = false;
                Rect rect = this.f17007C;
                Rect rect2 = this.f17008D;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f17010F) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f17009E, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public void drawableHotspotChanged(float f7, float f8) {
        super.drawableHotspotChanged(f7, f8);
        Drawable drawable = this.f17006B;
        if (drawable != null) {
            drawable.setHotspot(f7, f8);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f17006B;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f17006B.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f17006B;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f17009E;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f17006B;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.T, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        super.onLayout(z6, i7, i8, i9, i10);
        this.f17011G = z6 | this.f17011G;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        this.f17011G = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f17006B;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f17006B);
            }
            this.f17006B = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f17009E == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i7) {
        if (this.f17009E != i7) {
            if ((8388615 & i7) == 0) {
                i7 |= 8388611;
            }
            if ((i7 & 112) == 0) {
                i7 |= 48;
            }
            this.f17009E = i7;
            if (i7 == 119 && this.f17006B != null) {
                this.f17006B.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f17006B;
    }
}
