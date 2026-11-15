package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.T;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends T implements g.b, androidx.appcompat.view.menu.n {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private androidx.appcompat.view.menu.g f5635B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private Context f5636C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f5637D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f5638E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private C0526c f5639F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private m.a f5640G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    g.a f5641H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f5642I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f5643J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private int f5644K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private int f5645L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    e f5646M;

    public interface a {
        boolean a();

        boolean b();
    }

    private static class b implements m.a {
        b() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void c(androidx.appcompat.view.menu.g gVar, boolean z6) {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public boolean d(androidx.appcompat.view.menu.g gVar) {
            return false;
        }
    }

    public static class c extends T.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f5647a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f5648b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f5649c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f5650d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f5651e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f5652f;

        public c(int i7, int i8) {
            super(i7, i8);
            this.f5647a = false;
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super(cVar);
            this.f5647a = cVar.f5647a;
        }
    }

    private class d implements g.a {
        d() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
            e eVar = ActionMenuView.this.f5646M;
            return eVar != null && eVar.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(androidx.appcompat.view.menu.g gVar) {
            g.a aVar = ActionMenuView.this.f5641H;
            if (aVar != null) {
                aVar.b(gVar);
            }
        }
    }

    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static int L(View view, int i7, int i8, int i9, int i10) {
        int i11;
        c cVar = (c) view.getLayoutParams();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9) - i10, View.MeasureSpec.getMode(i9));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z6 = false;
        boolean z7 = actionMenuItemView != null && actionMenuItemView.r();
        if (i8 > 0) {
            i11 = 2;
            if (!z7 || i8 >= 2) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i8 * i7, Integer.MIN_VALUE), iMakeMeasureSpec);
                int measuredWidth = view.getMeasuredWidth();
                int i12 = measuredWidth / i7;
                if (measuredWidth % i7 != 0) {
                    i12++;
                }
                if (!z7 || i12 >= 2) {
                    i11 = i12;
                }
            } else {
                i11 = 0;
            }
        }
        if (!cVar.f5647a && z7) {
            z6 = true;
        }
        cVar.f5650d = z6;
        cVar.f5648b = i11;
        view.measure(View.MeasureSpec.makeMeasureSpec(i7 * i11, 1073741824), iMakeMeasureSpec);
        return i11;
    }

    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v14 */
    private void M(int i7, int i8) {
        int i9;
        int i10;
        boolean z6;
        int i11;
        int i12;
        boolean z7;
        boolean z8;
        int i13;
        ?? r14;
        int mode = View.MeasureSpec.getMode(i8);
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i8);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i8, paddingTop, -2);
        int i14 = size - paddingLeft;
        int i15 = this.f5644K;
        int i16 = i14 / i15;
        int i17 = i14 % i15;
        if (i16 == 0) {
            setMeasuredDimension(i14, 0);
            return;
        }
        int i18 = i15 + (i17 / i16);
        int childCount = getChildCount();
        int iMax = 0;
        int i19 = 0;
        boolean z9 = false;
        int i20 = 0;
        int iMax2 = 0;
        int i21 = 0;
        long j7 = 0;
        while (i19 < childCount) {
            View childAt = getChildAt(i19);
            int i22 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z10 = childAt instanceof ActionMenuItemView;
                int i23 = i20 + 1;
                if (z10) {
                    int i24 = this.f5645L;
                    i13 = i23;
                    r14 = 0;
                    childAt.setPadding(i24, 0, i24, 0);
                } else {
                    i13 = i23;
                    r14 = 0;
                }
                c cVar = (c) childAt.getLayoutParams();
                cVar.f5652f = r14;
                cVar.f5649c = r14;
                cVar.f5648b = r14;
                cVar.f5650d = r14;
                ((LinearLayout.LayoutParams) cVar).leftMargin = r14;
                ((LinearLayout.LayoutParams) cVar).rightMargin = r14;
                cVar.f5651e = z10 && ((ActionMenuItemView) childAt).r();
                int iL = L(childAt, i18, cVar.f5647a ? 1 : i16, childMeasureSpec, paddingTop);
                iMax2 = Math.max(iMax2, iL);
                if (cVar.f5650d) {
                    i21++;
                }
                if (cVar.f5647a) {
                    z9 = true;
                }
                i16 -= iL;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (iL == 1) {
                    j7 |= (long) (1 << i19);
                    iMax = iMax;
                }
                i20 = i13;
            }
            i19++;
            size2 = i22;
        }
        int i25 = size2;
        boolean z11 = z9 && i20 == 2;
        boolean z12 = false;
        while (i21 > 0 && i16 > 0) {
            int i26 = Integer.MAX_VALUE;
            int i27 = 0;
            int i28 = 0;
            long j8 = 0;
            while (i28 < childCount) {
                boolean z13 = z12;
                c cVar2 = (c) getChildAt(i28).getLayoutParams();
                int i29 = iMax;
                if (cVar2.f5650d) {
                    int i30 = cVar2.f5648b;
                    if (i30 < i26) {
                        j8 = 1 << i28;
                        i26 = i30;
                        i27 = 1;
                    } else if (i30 == i26) {
                        i27++;
                        j8 |= 1 << i28;
                    }
                }
                i28++;
                iMax = i29;
                z12 = z13;
            }
            z6 = z12;
            i11 = iMax;
            j7 |= j8;
            if (i27 > i16) {
                i9 = mode;
                i10 = i14;
                break;
            }
            int i31 = i26 + 1;
            int i32 = 0;
            while (i32 < childCount) {
                View childAt2 = getChildAt(i32);
                c cVar3 = (c) childAt2.getLayoutParams();
                int i33 = i14;
                int i34 = mode;
                long j9 = 1 << i32;
                if ((j8 & j9) == 0) {
                    if (cVar3.f5648b == i31) {
                        j7 |= j9;
                    }
                    z8 = z11;
                } else {
                    if (z11 && cVar3.f5651e && i16 == 1) {
                        int i35 = this.f5645L;
                        z8 = z11;
                        childAt2.setPadding(i35 + i18, 0, i35, 0);
                    } else {
                        z8 = z11;
                    }
                    cVar3.f5648b++;
                    cVar3.f5652f = true;
                    i16--;
                }
                i32++;
                mode = i34;
                i14 = i33;
                z11 = z8;
            }
            iMax = i11;
            z12 = true;
        }
        i9 = mode;
        i10 = i14;
        z6 = z12;
        i11 = iMax;
        boolean z14 = !z9 && i20 == 1;
        if (i16 <= 0 || j7 == 0 || (i16 >= i20 - 1 && !z14 && iMax2 <= 1)) {
            i12 = 0;
            z7 = z6;
        } else {
            float fBitCount = Long.bitCount(j7);
            if (z14) {
                i12 = 0;
            } else {
                i12 = 0;
                if ((j7 & 1) != 0 && !((c) getChildAt(0).getLayoutParams()).f5651e) {
                    fBitCount -= 0.5f;
                }
                int i36 = childCount - 1;
                if ((j7 & ((long) (1 << i36))) != 0 && !((c) getChildAt(i36).getLayoutParams()).f5651e) {
                    fBitCount -= 0.5f;
                }
            }
            int i37 = fBitCount > 0.0f ? (int) ((i16 * i18) / fBitCount) : i12;
            z7 = z6;
            for (int i38 = i12; i38 < childCount; i38++) {
                if ((j7 & ((long) (1 << i38))) != 0) {
                    View childAt3 = getChildAt(i38);
                    c cVar4 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar4.f5649c = i37;
                        cVar4.f5652f = true;
                        if (i38 == 0 && !cVar4.f5651e) {
                            ((LinearLayout.LayoutParams) cVar4).leftMargin = (-i37) / 2;
                        }
                        z7 = true;
                    } else if (cVar4.f5647a) {
                        cVar4.f5649c = i37;
                        cVar4.f5652f = true;
                        ((LinearLayout.LayoutParams) cVar4).rightMargin = (-i37) / 2;
                        z7 = true;
                    } else {
                        if (i38 != 0) {
                            ((LinearLayout.LayoutParams) cVar4).leftMargin = i37 / 2;
                        }
                        if (i38 != childCount - 1) {
                            ((LinearLayout.LayoutParams) cVar4).rightMargin = i37 / 2;
                        }
                    }
                }
            }
        }
        if (z7) {
            for (int i39 = i12; i39 < childCount; i39++) {
                View childAt4 = getChildAt(i39);
                c cVar5 = (c) childAt4.getLayoutParams();
                if (cVar5.f5652f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar5.f5648b * i18) + cVar5.f5649c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i10, i9 != 1073741824 ? i11 : i25);
    }

    public void B() {
        C0526c c0526c = this.f5639F;
        if (c0526c != null) {
            c0526c.y();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.T
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public c generateDefaultLayoutParams() {
        c cVar = new c(-2, -2);
        ((LinearLayout.LayoutParams) cVar).gravity = 16;
        return cVar;
    }

    @Override // androidx.appcompat.widget.T
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public c generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.T
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        c cVar = layoutParams instanceof c ? new c((c) layoutParams) : new c(layoutParams);
        if (((LinearLayout.LayoutParams) cVar).gravity <= 0) {
            ((LinearLayout.LayoutParams) cVar).gravity = 16;
        }
        return cVar;
    }

    public c F() {
        c cVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        cVarGenerateDefaultLayoutParams.f5647a = true;
        return cVarGenerateDefaultLayoutParams;
    }

    protected boolean G(int i7) {
        boolean zA = false;
        if (i7 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i7 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i7);
        if (i7 < getChildCount() && (childAt instanceof a)) {
            zA = ((a) childAt).a();
        }
        return (i7 <= 0 || !(childAt2 instanceof a)) ? zA : zA | ((a) childAt2).b();
    }

    public boolean H() {
        C0526c c0526c = this.f5639F;
        return c0526c != null && c0526c.B();
    }

    public boolean I() {
        C0526c c0526c = this.f5639F;
        return c0526c != null && c0526c.D();
    }

    public boolean J() {
        C0526c c0526c = this.f5639F;
        return c0526c != null && c0526c.E();
    }

    public boolean K() {
        return this.f5638E;
    }

    public androidx.appcompat.view.menu.g N() {
        return this.f5635B;
    }

    public void O(m.a aVar, g.a aVar2) {
        this.f5640G = aVar;
        this.f5641H = aVar2;
    }

    public boolean P() {
        C0526c c0526c = this.f5639F;
        return c0526c != null && c0526c.K();
    }

    @Override // androidx.appcompat.view.menu.g.b
    public boolean a(androidx.appcompat.view.menu.i iVar) {
        return this.f5635B.L(iVar, 0);
    }

    @Override // androidx.appcompat.view.menu.n
    public void b(androidx.appcompat.view.menu.g gVar) {
        this.f5635B = gVar;
    }

    @Override // androidx.appcompat.widget.T, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.f5635B == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.g gVar = new androidx.appcompat.view.menu.g(context);
            this.f5635B = gVar;
            gVar.R(new d());
            C0526c c0526c = new C0526c(context);
            this.f5639F = c0526c;
            c0526c.J(true);
            C0526c c0526c2 = this.f5639F;
            m.a bVar = this.f5640G;
            if (bVar == null) {
                bVar = new b();
            }
            c0526c2.h(bVar);
            this.f5635B.c(this.f5639F, this.f5636C);
            this.f5639F.H(this);
        }
        return this.f5635B;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f5639F.A();
    }

    public int getPopupTheme() {
        return this.f5637D;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0526c c0526c = this.f5639F;
        if (c0526c != null) {
            c0526c.d(false);
            if (this.f5639F.E()) {
                this.f5639F.B();
                this.f5639F.K();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        B();
    }

    @Override // androidx.appcompat.widget.T, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        int width;
        int paddingLeft;
        if (!this.f5642I) {
            super.onLayout(z6, i7, i8, i9, i10);
            return;
        }
        int childCount = getChildCount();
        int i11 = (i10 - i8) / 2;
        int dividerWidth = getDividerWidth();
        int i12 = i9 - i7;
        int paddingRight = (i12 - getPaddingRight()) - getPaddingLeft();
        boolean zB = r0.b(this);
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f5647a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (G(i15)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zB) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) cVar).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) cVar).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i16 = i11 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i16, width, measuredHeight + i16);
                    paddingRight -= measuredWidth;
                    i13 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) cVar).leftMargin) + ((LinearLayout.LayoutParams) cVar).rightMargin;
                    G(i15);
                    i14++;
                }
            }
        }
        if (childCount == 1 && i13 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i17 = (i12 / 2) - (measuredWidth2 / 2);
            int i18 = i11 - (measuredHeight2 / 2);
            childAt2.layout(i17, i18, measuredWidth2 + i17, measuredHeight2 + i18);
            return;
        }
        int i19 = i14 - (i13 ^ 1);
        int iMax = Math.max(0, i19 > 0 ? paddingRight / i19 : 0);
        if (zB) {
            int width2 = getWidth() - getPaddingRight();
            for (int i20 = 0; i20 < childCount; i20++) {
                View childAt3 = getChildAt(i20);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f5647a) {
                    int i21 = width2 - ((LinearLayout.LayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i22 = i11 - (measuredHeight3 / 2);
                    childAt3.layout(i21 - measuredWidth3, i22, i21, measuredHeight3 + i22);
                    width2 = i21 - ((measuredWidth3 + ((LinearLayout.LayoutParams) cVar2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i23 = 0; i23 < childCount; i23++) {
            View childAt4 = getChildAt(i23);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f5647a) {
                int i24 = paddingLeft2 + ((LinearLayout.LayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i25 = i11 - (measuredHeight4 / 2);
                childAt4.layout(i24, i25, i24 + measuredWidth4, measuredHeight4 + i25);
                paddingLeft2 = i24 + measuredWidth4 + ((LinearLayout.LayoutParams) cVar3).rightMargin + iMax;
            }
        }
    }

    @Override // androidx.appcompat.widget.T, android.view.View
    protected void onMeasure(int i7, int i8) {
        androidx.appcompat.view.menu.g gVar;
        boolean z6 = this.f5642I;
        boolean z7 = View.MeasureSpec.getMode(i7) == 1073741824;
        this.f5642I = z7;
        if (z6 != z7) {
            this.f5643J = 0;
        }
        int size = View.MeasureSpec.getSize(i7);
        if (this.f5642I && (gVar = this.f5635B) != null && size != this.f5643J) {
            this.f5643J = size;
            gVar.K(true);
        }
        int childCount = getChildCount();
        if (this.f5642I && childCount > 0) {
            M(i7, i8);
            return;
        }
        for (int i9 = 0; i9 < childCount; i9++) {
            c cVar = (c) getChildAt(i9).getLayoutParams();
            ((LinearLayout.LayoutParams) cVar).rightMargin = 0;
            ((LinearLayout.LayoutParams) cVar).leftMargin = 0;
        }
        super.onMeasure(i7, i8);
    }

    public void setExpandedActionViewsExclusive(boolean z6) {
        this.f5639F.G(z6);
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.f5646M = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f5639F.I(drawable);
    }

    public void setOverflowReserved(boolean z6) {
        this.f5638E = z6;
    }

    public void setPopupTheme(int i7) {
        if (this.f5637D != i7) {
            this.f5637D = i7;
            if (i7 == 0) {
                this.f5636C = getContext();
            } else {
                this.f5636C = new ContextThemeWrapper(getContext(), i7);
            }
        }
    }

    public void setPresenter(C0526c c0526c) {
        this.f5639F = c0526c;
        c0526c.H(this);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f7 = context.getResources().getDisplayMetrics().density;
        this.f5644K = (int) (56.0f * f7);
        this.f5645L = (int) (f7 * 4.0f);
        this.f5636C = context;
        this.f5637D = 0;
    }
}
