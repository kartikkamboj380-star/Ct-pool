package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.core.view.AbstractC0595o;

/* JADX INFO: loaded from: classes.dex */
public abstract class T extends ViewGroup {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f5832A;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f5833m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f5834n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f5835o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f5836p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f5837q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f5838r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f5839s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f5840t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int[] f5841u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int[] f5842v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Drawable f5843w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f5844x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f5845y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f5846z;

    public static class a extends LinearLayout.LayoutParams {
        public a(int i7, int i8) {
            super(i7, i8);
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public T(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void A(View view, int i7, int i8, int i9, int i10) {
        view.layout(i7, i8, i9 + i7, i10 + i8);
    }

    private void k(int i7, int i8) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i9 = 0; i9 < i7; i9++) {
            View viewS = s(i9);
            if (viewS.getVisibility() != 8) {
                a aVar = (a) viewS.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).height == -1) {
                    int i10 = ((LinearLayout.LayoutParams) aVar).width;
                    ((LinearLayout.LayoutParams) aVar).width = viewS.getMeasuredWidth();
                    measureChildWithMargins(viewS, i8, 0, iMakeMeasureSpec, 0);
                    ((LinearLayout.LayoutParams) aVar).width = i10;
                }
            }
        }
    }

    private void l(int i7, int i8) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i9 = 0; i9 < i7; i9++) {
            View viewS = s(i9);
            if (viewS.getVisibility() != 8) {
                a aVar = (a) viewS.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).width == -1) {
                    int i10 = ((LinearLayout.LayoutParams) aVar).height;
                    ((LinearLayout.LayoutParams) aVar).height = viewS.getMeasuredHeight();
                    measureChildWithMargins(viewS, iMakeMeasureSpec, 0, i8, 0);
                    ((LinearLayout.LayoutParams) aVar).height = i10;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    void g(Canvas canvas) {
        int right;
        int left;
        int paddingRight;
        int virtualChildCount = getVirtualChildCount();
        boolean zB = r0.b(this);
        for (int i7 = 0; i7 < virtualChildCount; i7++) {
            View viewS = s(i7);
            if (viewS != null && viewS.getVisibility() != 8 && t(i7)) {
                a aVar = (a) viewS.getLayoutParams();
                j(canvas, zB ? viewS.getRight() + ((LinearLayout.LayoutParams) aVar).rightMargin : (viewS.getLeft() - ((LinearLayout.LayoutParams) aVar).leftMargin) - this.f5844x);
            }
        }
        if (t(virtualChildCount)) {
            View viewS2 = s(virtualChildCount - 1);
            if (viewS2 != null) {
                a aVar2 = (a) viewS2.getLayoutParams();
                if (zB) {
                    left = viewS2.getLeft();
                    paddingRight = ((LinearLayout.LayoutParams) aVar2).leftMargin;
                    right = (left - paddingRight) - this.f5844x;
                } else {
                    right = viewS2.getRight() + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                }
            } else if (zB) {
                right = getPaddingLeft();
            } else {
                left = getWidth();
                paddingRight = getPaddingRight();
                right = (left - paddingRight) - this.f5844x;
            }
            j(canvas, right);
        }
    }

    @Override // android.view.View
    public int getBaseline() {
        int i7;
        if (this.f5834n < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i8 = this.f5834n;
        if (childCount <= i8) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i8);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f5834n == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f5835o;
        if (this.f5836p == 1 && (i7 = this.f5837q & 112) != 48) {
            if (i7 == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f5838r) / 2;
            } else if (i7 == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f5838r;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f5834n;
    }

    public Drawable getDividerDrawable() {
        return this.f5843w;
    }

    public int getDividerPadding() {
        return this.f5832A;
    }

    public int getDividerWidth() {
        return this.f5844x;
    }

    public int getGravity() {
        return this.f5837q;
    }

    public int getOrientation() {
        return this.f5836p;
    }

    public int getShowDividers() {
        return this.f5846z;
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f5839s;
    }

    void h(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i7 = 0; i7 < virtualChildCount; i7++) {
            View viewS = s(i7);
            if (viewS != null && viewS.getVisibility() != 8 && t(i7)) {
                i(canvas, (viewS.getTop() - ((LinearLayout.LayoutParams) ((a) viewS.getLayoutParams())).topMargin) - this.f5845y);
            }
        }
        if (t(virtualChildCount)) {
            View viewS2 = s(virtualChildCount - 1);
            i(canvas, viewS2 == null ? (getHeight() - getPaddingBottom()) - this.f5845y : viewS2.getBottom() + ((LinearLayout.LayoutParams) ((a) viewS2.getLayoutParams())).bottomMargin);
        }
    }

    void i(Canvas canvas, int i7) {
        this.f5843w.setBounds(getPaddingLeft() + this.f5832A, i7, (getWidth() - getPaddingRight()) - this.f5832A, this.f5845y + i7);
        this.f5843w.draw(canvas);
    }

    void j(Canvas canvas, int i7) {
        this.f5843w.setBounds(i7, getPaddingTop() + this.f5832A, this.f5844x + i7, (getHeight() - getPaddingBottom()) - this.f5832A);
        this.f5843w.draw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        int i7 = this.f5836p;
        if (i7 == 0) {
            return new a(-2, -2);
        }
        if (i7 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f5843w == null) {
            return;
        }
        if (this.f5836p == 1) {
            h(canvas);
        } else {
            g(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        if (this.f5836p == 1) {
            v(i7, i8, i9, i10);
        } else {
            u(i7, i8, i9, i10);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i7, int i8) {
        if (this.f5836p == 1) {
            z(i7, i8);
        } else {
            x(i7, i8);
        }
    }

    int p(View view, int i7) {
        return 0;
    }

    int q(View view) {
        return 0;
    }

    int r(View view) {
        return 0;
    }

    View s(int i7) {
        return getChildAt(i7);
    }

    public void setBaselineAligned(boolean z6) {
        this.f5833m = z6;
    }

    public void setBaselineAlignedChildIndex(int i7) {
        if (i7 >= 0 && i7 < getChildCount()) {
            this.f5834n = i7;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f5843w) {
            return;
        }
        this.f5843w = drawable;
        if (drawable != null) {
            this.f5844x = drawable.getIntrinsicWidth();
            this.f5845y = drawable.getIntrinsicHeight();
        } else {
            this.f5844x = 0;
            this.f5845y = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i7) {
        this.f5832A = i7;
    }

    public void setGravity(int i7) {
        if (this.f5837q != i7) {
            if ((8388615 & i7) == 0) {
                i7 |= 8388611;
            }
            if ((i7 & 112) == 0) {
                i7 |= 48;
            }
            this.f5837q = i7;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i7) {
        int i8 = i7 & 8388615;
        int i9 = this.f5837q;
        if ((8388615 & i9) != i8) {
            this.f5837q = i8 | ((-8388616) & i9);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z6) {
        this.f5840t = z6;
    }

    public void setOrientation(int i7) {
        if (this.f5836p != i7) {
            this.f5836p = i7;
            requestLayout();
        }
    }

    public void setShowDividers(int i7) {
        if (i7 != this.f5846z) {
            requestLayout();
        }
        this.f5846z = i7;
    }

    public void setVerticalGravity(int i7) {
        int i8 = i7 & 112;
        int i9 = this.f5837q;
        if ((i9 & 112) != i8) {
            this.f5837q = i8 | (i9 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f7) {
        this.f5839s = Math.max(0.0f, f7);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    protected boolean t(int i7) {
        if (i7 == 0) {
            return (this.f5846z & 1) != 0;
        }
        if (i7 == getChildCount()) {
            return (this.f5846z & 4) != 0;
        }
        if ((this.f5846z & 2) == 0) {
            return false;
        }
        for (int i8 = i7 - 1; i8 >= 0; i8--) {
            if (getChildAt(i8).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void u(int i7, int i8, int i9, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z6;
        int i16;
        int i17;
        int measuredHeight;
        boolean zB = r0.b(this);
        int paddingTop = getPaddingTop();
        int i18 = i10 - i8;
        int paddingBottom = i18 - getPaddingBottom();
        int paddingBottom2 = (i18 - paddingTop) - getPaddingBottom();
        int virtualChildCount = getVirtualChildCount();
        int i19 = this.f5837q;
        int i20 = i19 & 112;
        boolean z7 = this.f5833m;
        int[] iArr = this.f5841u;
        int[] iArr2 = this.f5842v;
        int iB = AbstractC0595o.b(8388615 & i19, androidx.core.view.H.B(this));
        boolean z8 = true;
        int paddingLeft = iB != 1 ? iB != 5 ? getPaddingLeft() : ((getPaddingLeft() + i9) - i7) - this.f5838r : getPaddingLeft() + (((i9 - i7) - this.f5838r) / 2);
        if (zB) {
            i11 = virtualChildCount - 1;
            i12 = -1;
        } else {
            i11 = 0;
            i12 = 1;
        }
        int iP = 0;
        while (iP < virtualChildCount) {
            int i21 = i11 + (i12 * iP);
            View viewS = s(i21);
            if (viewS == null) {
                paddingLeft += y(i21);
                z6 = z8;
                i13 = paddingTop;
                i14 = virtualChildCount;
                i15 = i20;
            } else if (viewS.getVisibility() != 8) {
                int measuredWidth = viewS.getMeasuredWidth();
                int measuredHeight2 = viewS.getMeasuredHeight();
                a aVar = (a) viewS.getLayoutParams();
                int i22 = iP;
                if (z7) {
                    i14 = virtualChildCount;
                    int baseline = ((LinearLayout.LayoutParams) aVar).height != -1 ? viewS.getBaseline() : -1;
                    i16 = ((LinearLayout.LayoutParams) aVar).gravity;
                    if (i16 < 0) {
                        i16 = i20;
                    }
                    i17 = i16 & 112;
                    i15 = i20;
                    if (i17 == 16) {
                        if (i17 == 48) {
                            measuredHeight = ((LinearLayout.LayoutParams) aVar).topMargin + paddingTop;
                            if (baseline != -1) {
                                z6 = true;
                                measuredHeight += iArr[1] - baseline;
                            }
                        } else if (i17 != 80) {
                            measuredHeight = paddingTop;
                        } else {
                            measuredHeight = (paddingBottom - measuredHeight2) - ((LinearLayout.LayoutParams) aVar).bottomMargin;
                            if (baseline != -1) {
                                measuredHeight -= iArr2[2] - (viewS.getMeasuredHeight() - baseline);
                            }
                        }
                        z6 = true;
                    } else {
                        z6 = true;
                        measuredHeight = ((((paddingBottom2 - measuredHeight2) / 2) + paddingTop) + ((LinearLayout.LayoutParams) aVar).topMargin) - ((LinearLayout.LayoutParams) aVar).bottomMargin;
                    }
                    if (t(i21)) {
                        paddingLeft += this.f5844x;
                    }
                    int i23 = ((LinearLayout.LayoutParams) aVar).leftMargin + paddingLeft;
                    i13 = paddingTop;
                    A(viewS, i23 + q(viewS), measuredHeight, measuredWidth, measuredHeight2);
                    int iR = i23 + measuredWidth + ((LinearLayout.LayoutParams) aVar).rightMargin + r(viewS);
                    iP = i22 + p(viewS, i21);
                    paddingLeft = iR;
                    iP++;
                    virtualChildCount = i14;
                    i20 = i15;
                    z8 = z6;
                    paddingTop = i13;
                } else {
                    i14 = virtualChildCount;
                }
                i16 = ((LinearLayout.LayoutParams) aVar).gravity;
                if (i16 < 0) {
                }
                i17 = i16 & 112;
                i15 = i20;
                if (i17 == 16) {
                }
                if (t(i21)) {
                }
                int i232 = ((LinearLayout.LayoutParams) aVar).leftMargin + paddingLeft;
                i13 = paddingTop;
                A(viewS, i232 + q(viewS), measuredHeight, measuredWidth, measuredHeight2);
                int iR2 = i232 + measuredWidth + ((LinearLayout.LayoutParams) aVar).rightMargin + r(viewS);
                iP = i22 + p(viewS, i21);
                paddingLeft = iR2;
                iP++;
                virtualChildCount = i14;
                i20 = i15;
                z8 = z6;
                paddingTop = i13;
            } else {
                i13 = paddingTop;
                i14 = virtualChildCount;
                i15 = i20;
                z6 = true;
            }
            iP++;
            virtualChildCount = i14;
            i20 = i15;
            z8 = z6;
            paddingTop = i13;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void v(int i7, int i8, int i9, int i10) {
        int i11;
        int i12;
        int i13;
        int paddingLeft = getPaddingLeft();
        int i14 = i9 - i7;
        int paddingRight = i14 - getPaddingRight();
        int paddingRight2 = (i14 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i15 = this.f5837q;
        int i16 = i15 & 112;
        int i17 = i15 & 8388615;
        int paddingTop = i16 != 16 ? i16 != 80 ? getPaddingTop() : ((getPaddingTop() + i10) - i8) - this.f5838r : getPaddingTop() + (((i10 - i8) - this.f5838r) / 2);
        int iP = 0;
        while (iP < virtualChildCount) {
            View viewS = s(iP);
            if (viewS == null) {
                paddingTop += y(iP);
            } else {
                if (viewS.getVisibility() != 8) {
                    int measuredWidth = viewS.getMeasuredWidth();
                    int measuredHeight = viewS.getMeasuredHeight();
                    a aVar = (a) viewS.getLayoutParams();
                    int i18 = ((LinearLayout.LayoutParams) aVar).gravity;
                    if (i18 < 0) {
                        i18 = i17;
                    }
                    int iB = AbstractC0595o.b(i18, androidx.core.view.H.B(this)) & 7;
                    if (iB == 1) {
                        i11 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) aVar).leftMargin;
                    } else if (iB != 5) {
                        i12 = ((LinearLayout.LayoutParams) aVar).leftMargin + paddingLeft;
                        int i19 = i12;
                        if (t(iP)) {
                            paddingTop += this.f5845y;
                        }
                        int i20 = paddingTop + ((LinearLayout.LayoutParams) aVar).topMargin;
                        A(viewS, i19, i20 + q(viewS), measuredWidth, measuredHeight);
                        int iR = i20 + measuredHeight + ((LinearLayout.LayoutParams) aVar).bottomMargin + r(viewS);
                        iP += p(viewS, iP);
                        paddingTop = iR;
                        i13 = 1;
                    } else {
                        i11 = paddingRight - measuredWidth;
                    }
                    i12 = i11 - ((LinearLayout.LayoutParams) aVar).rightMargin;
                    int i192 = i12;
                    if (t(iP)) {
                    }
                    int i202 = paddingTop + ((LinearLayout.LayoutParams) aVar).topMargin;
                    A(viewS, i192, i202 + q(viewS), measuredWidth, measuredHeight);
                    int iR2 = i202 + measuredHeight + ((LinearLayout.LayoutParams) aVar).bottomMargin + r(viewS);
                    iP += p(viewS, iP);
                    paddingTop = iR2;
                    i13 = 1;
                }
                iP += i13;
            }
            i13 = 1;
            iP += i13;
        }
    }

    void w(View view, int i7, int i8, int i9, int i10, int i11) {
        measureChildWithMargins(view, i8, i9, i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:169:0x03b1 A[PHI: r3
      0x03b1: PHI (r3v31 int) = (r3v27 int), (r3v32 int) binds: [B:173:0x03c2, B:167:0x03ae] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void x(int i7, int i8) {
        int[] iArr;
        int i9;
        int iMax;
        int iCombineMeasuredStates;
        int i10;
        int i11;
        int iMax2;
        int i12;
        int i13;
        float f7;
        int i14;
        int baseline;
        int i15;
        int i16;
        int i17;
        byte b7;
        int i18;
        int i19;
        boolean z6;
        boolean z7;
        View view;
        int iMax3;
        int i20;
        boolean z8;
        int measuredHeight;
        int iP;
        int baseline2;
        int i21;
        this.f5838r = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i7);
        int mode2 = View.MeasureSpec.getMode(i8);
        if (this.f5841u == null || this.f5842v == null) {
            this.f5841u = new int[4];
            this.f5842v = new int[4];
        }
        int[] iArr2 = this.f5841u;
        int[] iArr3 = this.f5842v;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        iArr3[3] = -1;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        boolean z9 = this.f5833m;
        boolean z10 = this.f5840t;
        int i22 = 1073741824;
        boolean z11 = mode == 1073741824;
        int iP2 = 0;
        int iMax4 = 0;
        int iMax5 = 0;
        int iMax6 = 0;
        int iMax7 = 0;
        boolean z12 = false;
        int iCombineMeasuredStates2 = 0;
        boolean z13 = false;
        boolean z14 = true;
        float f8 = 0.0f;
        while (true) {
            iArr = iArr3;
            if (iP2 >= virtualChildCount) {
                break;
            }
            View viewS = s(iP2);
            if (viewS == null) {
                this.f5838r += y(iP2);
            } else if (viewS.getVisibility() == 8) {
                iP2 += p(viewS, iP2);
            } else {
                if (t(iP2)) {
                    this.f5838r += this.f5844x;
                }
                a aVar = (a) viewS.getLayoutParams();
                float f9 = ((LinearLayout.LayoutParams) aVar).weight;
                float f10 = f8 + f9;
                if (mode == i22 && ((LinearLayout.LayoutParams) aVar).width == 0 && f9 > 0.0f) {
                    int i23 = this.f5838r;
                    this.f5838r = z11 ? i23 + ((LinearLayout.LayoutParams) aVar).leftMargin + ((LinearLayout.LayoutParams) aVar).rightMargin : Math.max(i23, ((LinearLayout.LayoutParams) aVar).leftMargin + i23 + ((LinearLayout.LayoutParams) aVar).rightMargin);
                    if (z9) {
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                        viewS.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        i19 = iP2;
                        z6 = z10;
                        z7 = z9;
                        view = viewS;
                    } else {
                        i19 = iP2;
                        z6 = z10;
                        z7 = z9;
                        view = viewS;
                        z12 = true;
                        i20 = 1073741824;
                        if (mode2 == i20 && ((LinearLayout.LayoutParams) aVar).height == -1) {
                            z8 = true;
                            z13 = true;
                        } else {
                            z8 = false;
                        }
                        int i24 = ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin;
                        measuredHeight = view.getMeasuredHeight() + i24;
                        iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, view.getMeasuredState());
                        if (z7 && (baseline2 = view.getBaseline()) != -1) {
                            i21 = ((LinearLayout.LayoutParams) aVar).gravity;
                            if (i21 < 0) {
                                i21 = this.f5837q;
                            }
                            int i25 = (((i21 & 112) >> 4) & (-2)) >> 1;
                            iArr2[i25] = Math.max(iArr2[i25], baseline2);
                            iArr[i25] = Math.max(iArr[i25], measuredHeight - baseline2);
                        }
                        iMax5 = Math.max(iMax5, measuredHeight);
                        z14 = !z14 && ((LinearLayout.LayoutParams) aVar).height == -1;
                        if (((LinearLayout.LayoutParams) aVar).weight <= 0.0f) {
                            if (!z8) {
                                i24 = measuredHeight;
                            }
                            iMax7 = Math.max(iMax7, i24);
                        } else {
                            int i26 = iMax7;
                            if (!z8) {
                                i24 = measuredHeight;
                            }
                            iMax6 = Math.max(iMax6, i24);
                            iMax7 = i26;
                        }
                        int i27 = i19;
                        iP = p(view, i27) + i27;
                        f8 = f10;
                        int i28 = iP + 1;
                        iArr3 = iArr;
                        z10 = z6;
                        z9 = z7;
                        i22 = i20;
                        iP2 = i28;
                    }
                } else {
                    if (((LinearLayout.LayoutParams) aVar).width != 0 || f9 <= 0.0f) {
                        b7 = -2;
                        i18 = Integer.MIN_VALUE;
                    } else {
                        b7 = -2;
                        ((LinearLayout.LayoutParams) aVar).width = -2;
                        i18 = 0;
                    }
                    i19 = iP2;
                    int i29 = i18;
                    z6 = z10;
                    z7 = z9;
                    w(viewS, i19, i7, f10 == 0.0f ? this.f5838r : 0, i8, 0);
                    if (i29 != Integer.MIN_VALUE) {
                        ((LinearLayout.LayoutParams) aVar).width = i29;
                    }
                    int measuredWidth = viewS.getMeasuredWidth();
                    if (z11) {
                        view = viewS;
                        iMax3 = this.f5838r + ((LinearLayout.LayoutParams) aVar).leftMargin + measuredWidth + ((LinearLayout.LayoutParams) aVar).rightMargin + r(view);
                    } else {
                        view = viewS;
                        int i30 = this.f5838r;
                        iMax3 = Math.max(i30, i30 + measuredWidth + ((LinearLayout.LayoutParams) aVar).leftMargin + ((LinearLayout.LayoutParams) aVar).rightMargin + r(view));
                    }
                    this.f5838r = iMax3;
                    if (z6) {
                        iMax4 = Math.max(measuredWidth, iMax4);
                    }
                }
                i20 = 1073741824;
                if (mode2 == i20) {
                    z8 = false;
                    int i242 = ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin;
                    measuredHeight = view.getMeasuredHeight() + i242;
                    iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, view.getMeasuredState());
                    if (z7) {
                        i21 = ((LinearLayout.LayoutParams) aVar).gravity;
                        if (i21 < 0) {
                        }
                        int i252 = (((i21 & 112) >> 4) & (-2)) >> 1;
                        iArr2[i252] = Math.max(iArr2[i252], baseline2);
                        iArr[i252] = Math.max(iArr[i252], measuredHeight - baseline2);
                    }
                    iMax5 = Math.max(iMax5, measuredHeight);
                    if (z14) {
                        if (((LinearLayout.LayoutParams) aVar).weight <= 0.0f) {
                        }
                        int i272 = i19;
                        iP = p(view, i272) + i272;
                        f8 = f10;
                    }
                }
                int i282 = iP + 1;
                iArr3 = iArr;
                z10 = z6;
                z9 = z7;
                i22 = i20;
                iP2 = i282;
            }
            z6 = z10;
            z7 = z9;
            int i31 = i22;
            iP = iP2;
            i20 = i31;
            int i2822 = iP + 1;
            iArr3 = iArr;
            z10 = z6;
            z9 = z7;
            i22 = i20;
            iP2 = i2822;
        }
        boolean z15 = z10;
        boolean z16 = z9;
        int i32 = iMax5;
        int i33 = iMax6;
        int i34 = iMax7;
        int i35 = iCombineMeasuredStates2;
        if (this.f5838r > 0 && t(virtualChildCount)) {
            this.f5838r += this.f5844x;
        }
        int i36 = iArr2[1];
        if (i36 == -1 && iArr2[0] == -1 && iArr2[2] == -1 && iArr2[3] == -1) {
            iMax = i32;
            i9 = i35;
        } else {
            i9 = i35;
            iMax = Math.max(i32, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(i36, iArr2[2]))) + Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))));
        }
        if (z15 && (mode == Integer.MIN_VALUE || mode == 0)) {
            this.f5838r = 0;
            int iP3 = 0;
            while (iP3 < virtualChildCount) {
                View viewS2 = s(iP3);
                if (viewS2 == null) {
                    this.f5838r += y(iP3);
                } else if (viewS2.getVisibility() == 8) {
                    iP3 += p(viewS2, iP3);
                } else {
                    a aVar2 = (a) viewS2.getLayoutParams();
                    int i37 = this.f5838r;
                    if (z11) {
                        this.f5838r = i37 + ((LinearLayout.LayoutParams) aVar2).leftMargin + iMax4 + ((LinearLayout.LayoutParams) aVar2).rightMargin + r(viewS2);
                    } else {
                        i17 = iMax;
                        this.f5838r = Math.max(i37, i37 + iMax4 + ((LinearLayout.LayoutParams) aVar2).leftMargin + ((LinearLayout.LayoutParams) aVar2).rightMargin + r(viewS2));
                        iP3++;
                        iMax = i17;
                    }
                }
                i17 = iMax;
                iP3++;
                iMax = i17;
            }
        }
        int iMax8 = iMax;
        int paddingLeft = this.f5838r + getPaddingLeft() + getPaddingRight();
        this.f5838r = paddingLeft;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i7, 0);
        int i38 = (16777215 & iResolveSizeAndState) - this.f5838r;
        if (z12 || (i38 != 0 && f8 > 0.0f)) {
            float f11 = this.f5839s;
            if (f11 > 0.0f) {
                f8 = f11;
            }
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            this.f5838r = 0;
            int i39 = i33;
            int iMax9 = -1;
            iCombineMeasuredStates = i9;
            int i40 = 0;
            while (i40 < virtualChildCount) {
                View viewS3 = s(i40);
                if (viewS3 == null || viewS3.getVisibility() == 8) {
                    i12 = i38;
                    i13 = virtualChildCount;
                } else {
                    a aVar3 = (a) viewS3.getLayoutParams();
                    float f12 = ((LinearLayout.LayoutParams) aVar3).weight;
                    if (f12 > 0.0f) {
                        int measuredWidth2 = (int) ((i38 * f12) / f8);
                        float f13 = f8 - f12;
                        int i41 = i38 - measuredWidth2;
                        i13 = virtualChildCount;
                        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i8, getPaddingTop() + getPaddingBottom() + ((LinearLayout.LayoutParams) aVar3).topMargin + ((LinearLayout.LayoutParams) aVar3).bottomMargin, ((LinearLayout.LayoutParams) aVar3).height);
                        if (((LinearLayout.LayoutParams) aVar3).width == 0) {
                            i16 = 1073741824;
                            if (mode == 1073741824) {
                                if (measuredWidth2 <= 0) {
                                    measuredWidth2 = 0;
                                }
                                viewS3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, i16), childMeasureSpec);
                                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewS3.getMeasuredState() & (-16777216));
                                f8 = f13;
                                i12 = i41;
                            }
                        } else {
                            i16 = 1073741824;
                        }
                        measuredWidth2 = viewS3.getMeasuredWidth() + measuredWidth2;
                        if (measuredWidth2 < 0) {
                        }
                        viewS3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, i16), childMeasureSpec);
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewS3.getMeasuredState() & (-16777216));
                        f8 = f13;
                        i12 = i41;
                    } else {
                        i12 = i38;
                        i13 = virtualChildCount;
                    }
                    int i42 = this.f5838r;
                    if (z11) {
                        this.f5838r = i42 + viewS3.getMeasuredWidth() + ((LinearLayout.LayoutParams) aVar3).leftMargin + ((LinearLayout.LayoutParams) aVar3).rightMargin + r(viewS3);
                        f7 = f8;
                    } else {
                        f7 = f8;
                        this.f5838r = Math.max(i42, viewS3.getMeasuredWidth() + i42 + ((LinearLayout.LayoutParams) aVar3).leftMargin + ((LinearLayout.LayoutParams) aVar3).rightMargin + r(viewS3));
                    }
                    boolean z17 = mode2 != 1073741824 && ((LinearLayout.LayoutParams) aVar3).height == -1;
                    int i43 = ((LinearLayout.LayoutParams) aVar3).topMargin + ((LinearLayout.LayoutParams) aVar3).bottomMargin;
                    int measuredHeight2 = viewS3.getMeasuredHeight() + i43;
                    iMax9 = Math.max(iMax9, measuredHeight2);
                    if (!z17) {
                        i43 = measuredHeight2;
                    }
                    int iMax10 = Math.max(i39, i43);
                    if (z14) {
                        i14 = -1;
                        boolean z18 = ((LinearLayout.LayoutParams) aVar3).height == -1;
                        if (z16 && (baseline = viewS3.getBaseline()) != i14) {
                            i15 = ((LinearLayout.LayoutParams) aVar3).gravity;
                            if (i15 < 0) {
                                i15 = this.f5837q;
                            }
                            int i44 = (((i15 & 112) >> 4) & (-2)) >> 1;
                            iArr2[i44] = Math.max(iArr2[i44], baseline);
                            iArr[i44] = Math.max(iArr[i44], measuredHeight2 - baseline);
                        }
                        z14 = z18;
                        i39 = iMax10;
                        f8 = f7;
                    } else {
                        i14 = -1;
                    }
                    if (z16) {
                        i15 = ((LinearLayout.LayoutParams) aVar3).gravity;
                        if (i15 < 0) {
                        }
                        int i442 = (((i15 & 112) >> 4) & (-2)) >> 1;
                        iArr2[i442] = Math.max(iArr2[i442], baseline);
                        iArr[i442] = Math.max(iArr[i442], measuredHeight2 - baseline);
                    }
                    z14 = z18;
                    i39 = iMax10;
                    f8 = f7;
                }
                i40++;
                i38 = i12;
                virtualChildCount = i13;
            }
            i10 = i8;
            i11 = virtualChildCount;
            this.f5838r += getPaddingLeft() + getPaddingRight();
            int i45 = iArr2[1];
            iMax8 = (i45 == -1 && iArr2[0] == -1 && iArr2[2] == -1 && iArr2[3] == -1) ? iMax9 : Math.max(iMax9, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(i45, iArr2[2]))) + Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))));
            iMax2 = i39;
        } else {
            iMax2 = Math.max(i33, i34);
            if (z15 && mode != 1073741824) {
                for (int i46 = 0; i46 < virtualChildCount; i46++) {
                    View viewS4 = s(i46);
                    if (viewS4 != null && viewS4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((a) viewS4.getLayoutParams())).weight > 0.0f) {
                        viewS4.measure(View.MeasureSpec.makeMeasureSpec(iMax4, 1073741824), View.MeasureSpec.makeMeasureSpec(viewS4.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i10 = i8;
            i11 = virtualChildCount;
            iCombineMeasuredStates = i9;
        }
        if (z14 || mode2 == 1073741824) {
            iMax2 = iMax8;
        }
        setMeasuredDimension(iResolveSizeAndState | ((-16777216) & iCombineMeasuredStates), View.resolveSizeAndState(Math.max(iMax2 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i10, iCombineMeasuredStates << 16));
        if (z13) {
            k(i11, i7);
        }
    }

    int y(int i7) {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x02d4 A[PHI: r10
      0x02d4: PHI (r10v21 int) = (r10v19 int), (r10v22 int) binds: [B:136:0x02e5, B:130:0x02d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0327  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void z(int i7, int i8) {
        int i9;
        int iCombineMeasuredStates;
        int i10;
        int iMax;
        int i11;
        int i12;
        int i13;
        int i14;
        int iMax2;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int iMax3;
        int i21;
        View view;
        int iMax4;
        boolean z6;
        this.f5838r = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i7);
        int mode2 = View.MeasureSpec.getMode(i8);
        int i22 = this.f5834n;
        boolean z7 = this.f5840t;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int iMax5 = 0;
        int i26 = 0;
        int iP = 0;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = true;
        float f7 = 0.0f;
        while (true) {
            int i27 = 8;
            int i28 = iMax5;
            if (iP >= virtualChildCount) {
                int i29 = i23;
                int i30 = i25;
                int i31 = i26;
                int i32 = mode2;
                int iMax6 = i24;
                int i33 = virtualChildCount;
                if (this.f5838r > 0) {
                    i9 = i33;
                    if (t(i9)) {
                        this.f5838r += this.f5845y;
                    }
                } else {
                    i9 = i33;
                }
                if (z7 && (i32 == Integer.MIN_VALUE || i32 == 0)) {
                    this.f5838r = 0;
                    int iP2 = 0;
                    while (iP2 < i9) {
                        View viewS = s(iP2);
                        if (viewS == null) {
                            iMax2 = this.f5838r + y(iP2);
                        } else if (viewS.getVisibility() == i27) {
                            iP2 += p(viewS, iP2);
                            iP2++;
                            i27 = 8;
                        } else {
                            a aVar = (a) viewS.getLayoutParams();
                            int i34 = this.f5838r;
                            iMax2 = Math.max(i34, i34 + i30 + ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin + r(viewS));
                        }
                        this.f5838r = iMax2;
                        iP2++;
                        i27 = 8;
                    }
                }
                int paddingTop = this.f5838r + getPaddingTop() + getPaddingBottom();
                this.f5838r = paddingTop;
                int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i8, 0);
                int i35 = (16777215 & iResolveSizeAndState) - this.f5838r;
                if (z8 || (i35 != 0 && f7 > 0.0f)) {
                    float f8 = this.f5839s;
                    if (f8 > 0.0f) {
                        f7 = f8;
                    }
                    this.f5838r = 0;
                    int i36 = i35;
                    int i37 = i31;
                    iCombineMeasuredStates = i29;
                    int i38 = 0;
                    while (i38 < i9) {
                        View viewS2 = s(i38);
                        if (viewS2.getVisibility() == 8) {
                            i11 = i36;
                        } else {
                            a aVar2 = (a) viewS2.getLayoutParams();
                            float f9 = ((LinearLayout.LayoutParams) aVar2).weight;
                            if (f9 > 0.0f) {
                                int measuredHeight = (int) ((i36 * f9) / f7);
                                float f10 = f7 - f9;
                                i11 = i36 - measuredHeight;
                                int childMeasureSpec = ViewGroup.getChildMeasureSpec(i7, getPaddingLeft() + getPaddingRight() + ((LinearLayout.LayoutParams) aVar2).leftMargin + ((LinearLayout.LayoutParams) aVar2).rightMargin, ((LinearLayout.LayoutParams) aVar2).width);
                                if (((LinearLayout.LayoutParams) aVar2).height == 0) {
                                    i14 = 1073741824;
                                    if (i32 == 1073741824) {
                                        if (measuredHeight <= 0) {
                                            measuredHeight = 0;
                                        }
                                        viewS2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight, i14));
                                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewS2.getMeasuredState() & (-256));
                                        f7 = f10;
                                    }
                                } else {
                                    i14 = 1073741824;
                                }
                                measuredHeight = viewS2.getMeasuredHeight() + measuredHeight;
                                if (measuredHeight < 0) {
                                }
                                viewS2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight, i14));
                                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewS2.getMeasuredState() & (-256));
                                f7 = f10;
                            } else {
                                i11 = i36;
                            }
                            int i39 = ((LinearLayout.LayoutParams) aVar2).leftMargin + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                            int measuredWidth = viewS2.getMeasuredWidth() + i39;
                            iMax6 = Math.max(iMax6, measuredWidth);
                            float f11 = f7;
                            if (mode != 1073741824) {
                                i12 = iCombineMeasuredStates;
                                i13 = -1;
                                if (((LinearLayout.LayoutParams) aVar2).width != -1) {
                                }
                                int iMax7 = Math.max(i37, i39);
                                boolean z11 = !z10 && ((LinearLayout.LayoutParams) aVar2).width == i13;
                                int i40 = this.f5838r;
                                this.f5838r = Math.max(i40, viewS2.getMeasuredHeight() + i40 + ((LinearLayout.LayoutParams) aVar2).topMargin + ((LinearLayout.LayoutParams) aVar2).bottomMargin + r(viewS2));
                                z10 = z11;
                                iCombineMeasuredStates = i12;
                                i37 = iMax7;
                                f7 = f11;
                            } else {
                                i12 = iCombineMeasuredStates;
                                i13 = -1;
                            }
                            i39 = measuredWidth;
                            int iMax72 = Math.max(i37, i39);
                            if (z10) {
                                int i402 = this.f5838r;
                                this.f5838r = Math.max(i402, viewS2.getMeasuredHeight() + i402 + ((LinearLayout.LayoutParams) aVar2).topMargin + ((LinearLayout.LayoutParams) aVar2).bottomMargin + r(viewS2));
                                z10 = z11;
                                iCombineMeasuredStates = i12;
                                i37 = iMax72;
                                f7 = f11;
                            }
                        }
                        i38++;
                        i36 = i11;
                    }
                    i10 = i7;
                    this.f5838r += getPaddingTop() + getPaddingBottom();
                    iMax = i37;
                } else {
                    iMax = Math.max(i31, i28);
                    if (z7 && i32 != 1073741824) {
                        for (int i41 = 0; i41 < i9; i41++) {
                            View viewS3 = s(i41);
                            if (viewS3 != null && viewS3.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((a) viewS3.getLayoutParams())).weight > 0.0f) {
                                viewS3.measure(View.MeasureSpec.makeMeasureSpec(viewS3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i30, 1073741824));
                            }
                        }
                    }
                    i10 = i7;
                    iCombineMeasuredStates = i29;
                }
                if (z10 || mode == 1073741824) {
                    iMax = iMax6;
                }
                setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, iCombineMeasuredStates), iResolveSizeAndState);
                if (z9) {
                    l(i9, i8);
                    return;
                }
                return;
            }
            View viewS4 = s(iP);
            if (viewS4 == null) {
                this.f5838r += y(iP);
                i18 = mode2;
                iMax5 = i28;
                i20 = virtualChildCount;
            } else {
                int i42 = i23;
                if (viewS4.getVisibility() == 8) {
                    iP += p(viewS4, iP);
                    iMax5 = i28;
                    i23 = i42;
                    i20 = virtualChildCount;
                    i18 = mode2;
                } else {
                    if (t(iP)) {
                        this.f5838r += this.f5845y;
                    }
                    a aVar3 = (a) viewS4.getLayoutParams();
                    float f12 = ((LinearLayout.LayoutParams) aVar3).weight;
                    float f13 = f7 + f12;
                    if (mode2 == 1073741824 && ((LinearLayout.LayoutParams) aVar3).height == 0 && f12 > 0.0f) {
                        int i43 = this.f5838r;
                        this.f5838r = Math.max(i43, ((LinearLayout.LayoutParams) aVar3).topMargin + i43 + ((LinearLayout.LayoutParams) aVar3).bottomMargin);
                        iMax4 = i25;
                        view = viewS4;
                        iMax3 = i26;
                        z8 = true;
                        i16 = i42;
                        i17 = i24;
                        i18 = mode2;
                        i19 = i28;
                        i20 = virtualChildCount;
                        i21 = iP;
                    } else {
                        int i44 = i24;
                        if (((LinearLayout.LayoutParams) aVar3).height != 0 || f12 <= 0.0f) {
                            i15 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) aVar3).height = -2;
                            i15 = 0;
                        }
                        i16 = i42;
                        int i45 = i15;
                        i17 = i44;
                        int i46 = i25;
                        i18 = mode2;
                        i19 = i28;
                        i20 = virtualChildCount;
                        iMax3 = i26;
                        i21 = iP;
                        w(viewS4, iP, i7, 0, i8, f13 == 0.0f ? this.f5838r : 0);
                        if (i45 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) aVar3).height = i45;
                        }
                        int measuredHeight2 = viewS4.getMeasuredHeight();
                        int i47 = this.f5838r;
                        view = viewS4;
                        this.f5838r = Math.max(i47, i47 + measuredHeight2 + ((LinearLayout.LayoutParams) aVar3).topMargin + ((LinearLayout.LayoutParams) aVar3).bottomMargin + r(view));
                        iMax4 = z7 ? Math.max(measuredHeight2, i46) : i46;
                    }
                    if (i22 >= 0 && i22 == i21 + 1) {
                        this.f5835o = this.f5838r;
                    }
                    if (i21 < i22 && ((LinearLayout.LayoutParams) aVar3).weight > 0.0f) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    if (mode == 1073741824 || ((LinearLayout.LayoutParams) aVar3).width != -1) {
                        z6 = false;
                    } else {
                        z6 = true;
                        z9 = true;
                    }
                    int i48 = ((LinearLayout.LayoutParams) aVar3).leftMargin + ((LinearLayout.LayoutParams) aVar3).rightMargin;
                    int measuredWidth2 = view.getMeasuredWidth() + i48;
                    int iMax8 = Math.max(i17, measuredWidth2);
                    int iCombineMeasuredStates2 = View.combineMeasuredStates(i16, view.getMeasuredState());
                    z10 = z10 && ((LinearLayout.LayoutParams) aVar3).width == -1;
                    if (((LinearLayout.LayoutParams) aVar3).weight > 0.0f) {
                        if (!z6) {
                            i48 = measuredWidth2;
                        }
                        iMax5 = Math.max(i19, i48);
                    } else {
                        if (!z6) {
                            i48 = measuredWidth2;
                        }
                        iMax3 = Math.max(iMax3, i48);
                        iMax5 = i19;
                    }
                    int iP3 = p(view, i21) + i21;
                    i25 = iMax4;
                    i24 = iMax8;
                    f7 = f13;
                    i26 = iMax3;
                    iP = iP3;
                    i23 = iCombineMeasuredStates2;
                }
            }
            iP++;
            virtualChildCount = i20;
            mode2 = i18;
        }
    }

    public T(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f5833m = true;
        this.f5834n = -1;
        this.f5835o = 0;
        this.f5837q = 8388659;
        h0 h0VarV = h0.v(context, attributeSet, e.j.f19025a1, i7, 0);
        androidx.core.view.H.n0(this, context, e.j.f19025a1, attributeSet, h0VarV.r(), i7, 0);
        int iK = h0VarV.k(e.j.f19035c1, -1);
        if (iK >= 0) {
            setOrientation(iK);
        }
        int iK2 = h0VarV.k(e.j.f19030b1, -1);
        if (iK2 >= 0) {
            setGravity(iK2);
        }
        boolean zA = h0VarV.a(e.j.f19040d1, true);
        if (!zA) {
            setBaselineAligned(zA);
        }
        this.f5839s = h0VarV.i(e.j.f19050f1, -1.0f);
        this.f5834n = h0VarV.k(e.j.f19045e1, -1);
        this.f5840t = h0VarV.a(e.j.f19065i1, false);
        setDividerDrawable(h0VarV.g(e.j.f19055g1));
        this.f5846z = h0VarV.k(e.j.f19070j1, 0);
        this.f5832A = h0VarV.f(e.j.f19060h1, 0);
        h0VarV.w();
    }
}
