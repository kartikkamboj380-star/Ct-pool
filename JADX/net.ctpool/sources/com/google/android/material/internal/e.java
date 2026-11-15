package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.H;
import androidx.core.view.r;
import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes.dex */
public abstract class e extends ViewGroup {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f17002m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f17003n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f17004o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f17005p;

    public e(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f17004o = false;
        d(context, attributeSet);
    }

    private static int a(int i7, int i8, int i9) {
        return i8 != Integer.MIN_VALUE ? i8 != 1073741824 ? i9 : i7 : Math.min(i9, i7);
    }

    private void d(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, A3.j.f304E1, 0, 0);
        this.f17002m = typedArrayObtainStyledAttributes.getDimensionPixelSize(A3.j.f318G1, 0);
        this.f17003n = typedArrayObtainStyledAttributes.getDimensionPixelSize(A3.j.f311F1, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public int b(View view) {
        Object tag = view.getTag(A3.e.f184C);
        if (tag instanceof Integer) {
            return ((Integer) tag).intValue();
        }
        return -1;
    }

    public boolean c() {
        return this.f17004o;
    }

    protected int getItemSpacing() {
        return this.f17003n;
    }

    protected int getLineSpacing() {
        return this.f17002m;
    }

    protected int getRowCount() {
        return this.f17005p;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        int iA;
        int iB;
        if (getChildCount() == 0) {
            this.f17005p = 0;
            return;
        }
        this.f17005p = 1;
        boolean z7 = H.B(this) == 1;
        int paddingRight = z7 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z7 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i11 = (i9 - i7) - paddingLeft;
        int measuredWidth = paddingRight;
        int i12 = paddingTop;
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(A3.e.f184C, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    iB = r.b(marginLayoutParams);
                    iA = r.a(marginLayoutParams);
                } else {
                    iA = 0;
                    iB = 0;
                }
                int measuredWidth2 = measuredWidth + iB + childAt.getMeasuredWidth();
                if (!this.f17004o && measuredWidth2 > i11) {
                    i12 = this.f17002m + paddingTop;
                    this.f17005p++;
                    measuredWidth = paddingRight;
                }
                childAt.setTag(A3.e.f184C, Integer.valueOf(this.f17005p - 1));
                int i14 = measuredWidth + iB;
                int measuredWidth3 = childAt.getMeasuredWidth() + i14;
                int measuredHeight = childAt.getMeasuredHeight() + i12;
                if (z7) {
                    i14 = i11 - measuredWidth3;
                    measuredWidth3 = (i11 - measuredWidth) - iB;
                }
                childAt.layout(i14, i12, measuredWidth3, measuredHeight);
                measuredWidth += iB + iA + childAt.getMeasuredWidth() + this.f17003n;
                paddingTop = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i7, int i8) {
        int i9;
        int i10;
        int paddingLeft;
        int size = View.MeasureSpec.getSize(i7);
        int mode = View.MeasureSpec.getMode(i7);
        int size2 = View.MeasureSpec.getSize(i8);
        int mode2 = View.MeasureSpec.getMode(i8);
        int i11 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Api.BaseClientBuilder.API_PRIORITY_OTHER;
        int paddingLeft2 = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i11 - getPaddingRight();
        int i12 = paddingTop;
        int i13 = 0;
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i7, i8);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i9 = marginLayoutParams.leftMargin;
                    i10 = marginLayoutParams.rightMargin;
                } else {
                    i9 = 0;
                    i10 = 0;
                }
                int i15 = paddingLeft2;
                if (paddingLeft2 + i9 + childAt.getMeasuredWidth() <= paddingRight || c()) {
                    paddingLeft = i15;
                } else {
                    paddingLeft = getPaddingLeft();
                    i12 = this.f17002m + paddingTop;
                }
                int measuredWidth = paddingLeft + i9 + childAt.getMeasuredWidth();
                int measuredHeight = i12 + childAt.getMeasuredHeight();
                if (measuredWidth > i13) {
                    i13 = measuredWidth;
                }
                paddingLeft2 = paddingLeft + i9 + i10 + childAt.getMeasuredWidth() + this.f17003n;
                if (i14 == getChildCount() - 1) {
                    i13 += i10;
                }
                paddingTop = measuredHeight;
            }
        }
        setMeasuredDimension(a(size, mode, i13 + getPaddingRight()), a(size2, mode2, paddingTop + getPaddingBottom()));
    }

    protected void setItemSpacing(int i7) {
        this.f17003n = i7;
    }

    protected void setLineSpacing(int i7) {
        this.f17002m = i7;
    }

    public void setSingleLine(boolean z6) {
        this.f17004o = z6;
    }
}
