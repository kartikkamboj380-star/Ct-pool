package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import e.AbstractC1614f;

/* JADX INFO: loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f5657m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f5658n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f5659o;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5659o = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.j.f18967N0);
        androidx.core.view.H.n0(this, context, e.j.f18967N0, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        this.f5657m = typedArrayObtainStyledAttributes.getBoolean(e.j.f18972O0, true);
        typedArrayObtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f5657m);
        }
    }

    private int a(int i7) {
        int childCount = getChildCount();
        while (i7 < childCount) {
            if (getChildAt(i7).getVisibility() == 0) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    private boolean b() {
        return this.f5658n;
    }

    private void setStacked(boolean z6) {
        if (this.f5658n != z6) {
            if (!z6 || this.f5657m) {
                this.f5658n = z6;
                setOrientation(z6 ? 1 : 0);
                setGravity(z6 ? 8388613 : 80);
                View viewFindViewById = findViewById(AbstractC1614f.f18827G);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(z6 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i7, int i8) {
        int iMakeMeasureSpec;
        boolean z6;
        int size = View.MeasureSpec.getSize(i7);
        int paddingBottom = 0;
        if (this.f5657m) {
            if (size > this.f5659o && b()) {
                setStacked(false);
            }
            this.f5659o = size;
        }
        if (b() || View.MeasureSpec.getMode(i7) != 1073741824) {
            iMakeMeasureSpec = i7;
            z6 = false;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z6 = true;
        }
        super.onMeasure(iMakeMeasureSpec, i8);
        if (this.f5657m && !b() && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z6 = true;
        }
        if (z6) {
            super.onMeasure(i7, i8);
        }
        int iA = a(0);
        if (iA >= 0) {
            View childAt = getChildAt(iA);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (b()) {
                int iA2 = a(iA + 1);
                if (iA2 >= 0) {
                    paddingTop += getChildAt(iA2).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                paddingBottom = paddingTop;
            } else {
                paddingBottom = paddingTop + getPaddingBottom();
            }
        }
        if (androidx.core.view.H.C(this) != paddingBottom) {
            setMinimumHeight(paddingBottom);
            if (i8 == 0) {
                super.onMeasure(i7, i8);
            }
        }
    }

    public void setAllowStacking(boolean z6) {
        if (this.f5657m != z6) {
            this.f5657m = z6;
            if (!z6 && b()) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
