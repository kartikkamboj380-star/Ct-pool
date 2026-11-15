package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.T;
import androidx.core.view.AbstractC0595o;
import e.AbstractC1614f;

/* JADX INFO: loaded from: classes.dex */
public class AlertDialogLayout extends T {
    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void A(View view, int i7, int i8, int i9, int i10) {
        view.layout(i7, i8, i9 + i7, i10 + i8);
    }

    private static int B(View view) {
        int iC = androidx.core.view.H.C(view);
        if (iC > 0) {
            return iC;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return B(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    private boolean C(int i7, int i8) {
        int iCombineMeasuredStates;
        int iB;
        int measuredHeight;
        int measuredHeight2;
        int childCount = getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == AbstractC1614f.f18836P) {
                    view = childAt;
                } else if (id == AbstractC1614f.f18847k) {
                    view2 = childAt;
                } else {
                    if ((id != AbstractC1614f.f18849m && id != AbstractC1614f.f18851o) || view3 != null) {
                        return false;
                    }
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i8);
        int size = View.MeasureSpec.getSize(i8);
        int mode2 = View.MeasureSpec.getMode(i7);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (view != null) {
            view.measure(i7, 0);
            paddingTop += view.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            iCombineMeasuredStates = 0;
        }
        if (view2 != null) {
            view2.measure(i7, 0);
            iB = B(view2);
            measuredHeight = view2.getMeasuredHeight() - iB;
            paddingTop += iB;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        } else {
            iB = 0;
            measuredHeight = 0;
        }
        if (view3 != null) {
            view3.measure(i7, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingTop), mode));
            measuredHeight2 = view3.getMeasuredHeight();
            paddingTop += measuredHeight2;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        } else {
            measuredHeight2 = 0;
        }
        int i10 = size - paddingTop;
        if (view2 != null) {
            int i11 = paddingTop - iB;
            int iMin = Math.min(i10, measuredHeight);
            if (iMin > 0) {
                i10 -= iMin;
                iB += iMin;
            }
            view2.measure(i7, View.MeasureSpec.makeMeasureSpec(iB, 1073741824));
            paddingTop = i11 + view2.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        }
        if (view3 != null && i10 > 0) {
            view3.measure(i7, View.MeasureSpec.makeMeasureSpec(measuredHeight2 + i10, mode));
            paddingTop = (paddingTop - measuredHeight2) + view3.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        }
        int iMax = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8) {
                iMax = Math.max(iMax, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(iMax + getPaddingLeft() + getPaddingRight(), i7, iCombineMeasuredStates), View.resolveSizeAndState(paddingTop, i8, 0));
        if (mode2 == 1073741824) {
            return true;
        }
        l(childCount, i8);
        return true;
    }

    private void l(int i7, int i8) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i9 = 0; i9 < i7; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                T.a aVar = (T.a) childAt.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).width == -1) {
                    int i10 = ((LinearLayout.LayoutParams) aVar).height;
                    ((LinearLayout.LayoutParams) aVar).height = childAt.getMeasuredHeight();
                    measureChildWithMargins(childAt, iMakeMeasureSpec, 0, i8, 0);
                    ((LinearLayout.LayoutParams) aVar).height = i10;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a7  */
    @Override // androidx.appcompat.widget.T, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        int i11;
        int i12;
        int paddingLeft = getPaddingLeft();
        int i13 = i9 - i7;
        int paddingRight = i13 - getPaddingRight();
        int paddingRight2 = (i13 - paddingLeft) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int gravity = getGravity();
        int i14 = gravity & 112;
        int i15 = gravity & 8388615;
        int paddingTop = i14 != 16 ? i14 != 80 ? getPaddingTop() : ((getPaddingTop() + i10) - i8) - measuredHeight : getPaddingTop() + (((i10 - i8) - measuredHeight) / 2);
        Drawable dividerDrawable = getDividerDrawable();
        int intrinsicHeight = dividerDrawable == null ? 0 : dividerDrawable.getIntrinsicHeight();
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                T.a aVar = (T.a) childAt.getLayoutParams();
                int i17 = ((LinearLayout.LayoutParams) aVar).gravity;
                if (i17 < 0) {
                    i17 = i15;
                }
                int iB = AbstractC0595o.b(i17, androidx.core.view.H.B(this)) & 7;
                if (iB == 1) {
                    i11 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) aVar).leftMargin;
                } else if (iB != 5) {
                    i12 = ((LinearLayout.LayoutParams) aVar).leftMargin + paddingLeft;
                    if (t(i16)) {
                        paddingTop += intrinsicHeight;
                    }
                    int i18 = paddingTop + ((LinearLayout.LayoutParams) aVar).topMargin;
                    A(childAt, i12, i18, measuredWidth, measuredHeight2);
                    paddingTop = i18 + measuredHeight2 + ((LinearLayout.LayoutParams) aVar).bottomMargin;
                } else {
                    i11 = paddingRight - measuredWidth;
                }
                i12 = i11 - ((LinearLayout.LayoutParams) aVar).rightMargin;
                if (t(i16)) {
                }
                int i182 = paddingTop + ((LinearLayout.LayoutParams) aVar).topMargin;
                A(childAt, i12, i182, measuredWidth, measuredHeight2);
                paddingTop = i182 + measuredHeight2 + ((LinearLayout.LayoutParams) aVar).bottomMargin;
            }
        }
    }

    @Override // androidx.appcompat.widget.T, android.view.View
    protected void onMeasure(int i7, int i8) {
        if (C(i7, i8)) {
            return;
        }
        super.onMeasure(i7, i8);
    }
}
