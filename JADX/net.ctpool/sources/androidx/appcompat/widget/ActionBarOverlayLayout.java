package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.m;
import androidx.core.view.InterfaceC0605z;
import androidx.core.view.U;
import com.google.android.gms.common.api.Api;
import e.AbstractC1609a;
import e.AbstractC1614f;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements I, InterfaceC0605z, androidx.core.view.A {

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    static final int[] f5600R = {AbstractC1609a.f18729b, R.attr.windowContentOverlay};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final Rect f5601A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final Rect f5602B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final Rect f5603C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final Rect f5604D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final Rect f5605E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final Rect f5606F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private androidx.core.view.U f5607G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private androidx.core.view.U f5608H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private androidx.core.view.U f5609I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private androidx.core.view.U f5610J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private d f5611K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private OverScroller f5612L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    ViewPropertyAnimator f5613M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    final AnimatorListenerAdapter f5614N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Runnable f5615O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final Runnable f5616P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private final androidx.core.view.B f5617Q;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f5618m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f5619n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ContentFrameLayout f5620o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    ActionBarContainer f5621p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private J f5622q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Drawable f5623r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f5624s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f5625t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f5626u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f5627v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    boolean f5628w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f5629x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f5630y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final Rect f5631z;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f5613M = null;
            actionBarOverlayLayout.f5628w = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f5613M = null;
            actionBarOverlayLayout.f5628w = false;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f5613M = actionBarOverlayLayout.f5621p.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f5614N);
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f5613M = actionBarOverlayLayout.f5621p.animate().translationY(-ActionBarOverlayLayout.this.f5621p.getHeight()).setListener(ActionBarOverlayLayout.this.f5614N);
        }
    }

    public interface d {
        void a();

        void b();

        void c(boolean z6);

        void d();

        void e();

        void f(int i7);
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public e(int i7, int i8) {
            super(i7, i8);
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5619n = 0;
        this.f5631z = new Rect();
        this.f5601A = new Rect();
        this.f5602B = new Rect();
        this.f5603C = new Rect();
        this.f5604D = new Rect();
        this.f5605E = new Rect();
        this.f5606F = new Rect();
        androidx.core.view.U u6 = androidx.core.view.U.f7302b;
        this.f5607G = u6;
        this.f5608H = u6;
        this.f5609I = u6;
        this.f5610J = u6;
        this.f5614N = new a();
        this.f5615O = new b();
        this.f5616P = new c();
        v(context);
        this.f5617Q = new androidx.core.view.B(this);
    }

    private void A() {
        u();
        this.f5615O.run();
    }

    private boolean B(float f7) {
        this.f5612L.fling(0, 0, 0, (int) f7, 0, 0, Integer.MIN_VALUE, Api.BaseClientBuilder.API_PRIORITY_OTHER);
        return this.f5612L.getFinalY() > this.f5621p.getHeight();
    }

    private void p() {
        u();
        this.f5616P.run();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean q(View view, Rect rect, boolean z6, boolean z7, boolean z8, boolean z9) {
        boolean z10;
        e eVar = (e) view.getLayoutParams();
        if (z6) {
            int i7 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
            int i8 = rect.left;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) eVar).leftMargin = i8;
                z10 = true;
            } else {
                z10 = false;
            }
        }
        if (z7) {
            int i9 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
            int i10 = rect.top;
            if (i9 != i10) {
                ((ViewGroup.MarginLayoutParams) eVar).topMargin = i10;
                z10 = true;
            }
        }
        if (z9) {
            int i11 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
            int i12 = rect.right;
            if (i11 != i12) {
                ((ViewGroup.MarginLayoutParams) eVar).rightMargin = i12;
                z10 = true;
            }
        }
        if (z8) {
            int i13 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            int i14 = rect.bottom;
            if (i13 != i14) {
                ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = i14;
                return true;
            }
        }
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private J t(View view) {
        if (view instanceof J) {
            return (J) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    private void v(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f5600R);
        this.f5618m = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f5623r = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f5624s = context.getApplicationInfo().targetSdkVersion < 19;
        this.f5612L = new OverScroller(context);
    }

    private void x() {
        u();
        postDelayed(this.f5616P, 600L);
    }

    private void y() {
        u();
        postDelayed(this.f5615O, 600L);
    }

    @Override // androidx.core.view.A
    public void a(View view, int i7, int i8, int i9, int i10, int i11, int[] iArr) {
        k(view, i7, i8, i9, i10, i11);
    }

    @Override // androidx.appcompat.widget.I
    public void b(Menu menu, m.a aVar) {
        z();
        this.f5622q.b(menu, aVar);
    }

    @Override // androidx.appcompat.widget.I
    public boolean c() {
        z();
        return this.f5622q.c();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // androidx.appcompat.widget.I
    public void d() {
        z();
        this.f5622q.d();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f5623r == null || this.f5624s) {
            return;
        }
        int bottom = this.f5621p.getVisibility() == 0 ? (int) (this.f5621p.getBottom() + this.f5621p.getTranslationY() + 0.5f) : 0;
        this.f5623r.setBounds(0, bottom, getWidth(), this.f5623r.getIntrinsicHeight() + bottom);
        this.f5623r.draw(canvas);
    }

    @Override // androidx.appcompat.widget.I
    public boolean e() {
        z();
        return this.f5622q.e();
    }

    @Override // androidx.appcompat.widget.I
    public boolean f() {
        z();
        return this.f5622q.f();
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.I
    public boolean g() {
        z();
        return this.f5622q.g();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f5621p;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f5617Q.a();
    }

    public CharSequence getTitle() {
        z();
        return this.f5622q.getTitle();
    }

    @Override // androidx.appcompat.widget.I
    public boolean h() {
        z();
        return this.f5622q.h();
    }

    @Override // androidx.appcompat.widget.I
    public void i(int i7) {
        z();
        if (i7 == 2) {
            this.f5622q.v();
        } else if (i7 == 5) {
            this.f5622q.w();
        } else {
            if (i7 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // androidx.appcompat.widget.I
    public void j() {
        z();
        this.f5622q.i();
    }

    @Override // androidx.core.view.InterfaceC0605z
    public void k(View view, int i7, int i8, int i9, int i10, int i11) {
        if (i11 == 0) {
            onNestedScroll(view, i7, i8, i9, i10);
        }
    }

    @Override // androidx.core.view.InterfaceC0605z
    public boolean l(View view, View view2, int i7, int i8) {
        return i8 == 0 && onStartNestedScroll(view, view2, i7);
    }

    @Override // androidx.core.view.InterfaceC0605z
    public void m(View view, View view2, int i7, int i8) {
        if (i8 == 0) {
            onNestedScrollAccepted(view, view2, i7);
        }
    }

    @Override // androidx.core.view.InterfaceC0605z
    public void n(View view, int i7) {
        if (i7 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // androidx.core.view.InterfaceC0605z
    public void o(View view, int i7, int i8, int[] iArr, int i9) {
        if (i9 == 0) {
            onNestedPreScroll(view, i7, i8, iArr);
        }
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        z();
        androidx.core.view.U uW = androidx.core.view.U.w(windowInsets, this);
        boolean zQ = q(this.f5621p, new Rect(uW.j(), uW.l(), uW.k(), uW.i()), true, true, false, true);
        androidx.core.view.H.f(this, uW, this.f5631z);
        Rect rect = this.f5631z;
        androidx.core.view.U uM = uW.m(rect.left, rect.top, rect.right, rect.bottom);
        this.f5607G = uM;
        boolean z6 = true;
        if (!this.f5608H.equals(uM)) {
            this.f5608H = this.f5607G;
            zQ = true;
        }
        if (this.f5601A.equals(this.f5631z)) {
            z6 = zQ;
        } else {
            this.f5601A.set(this.f5631z);
        }
        if (z6) {
            requestLayout();
        }
        return uW.a().c().b().u();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        v(getContext());
        androidx.core.view.H.m0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i12 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i13 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i12, i13, measuredWidth + i12, measuredHeight + i13);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i7, int i8) {
        int measuredHeight;
        androidx.core.view.U uA;
        z();
        measureChildWithMargins(this.f5621p, i7, 0, i8, 0);
        e eVar = (e) this.f5621p.getLayoutParams();
        int iMax = Math.max(0, this.f5621p.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int iMax2 = Math.max(0, this.f5621p.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f5621p.getMeasuredState());
        boolean z6 = (androidx.core.view.H.L(this) & 256) != 0;
        if (z6) {
            measuredHeight = this.f5618m;
            if (this.f5626u && this.f5621p.getTabContainer() != null) {
                measuredHeight += this.f5618m;
            }
        } else {
            measuredHeight = this.f5621p.getVisibility() != 8 ? this.f5621p.getMeasuredHeight() : 0;
        }
        this.f5602B.set(this.f5631z);
        androidx.core.view.U u6 = this.f5607G;
        this.f5609I = u6;
        if (this.f5625t || z6) {
            uA = new U.b(this.f5609I).d(androidx.core.graphics.b.b(u6.j(), this.f5609I.l() + measuredHeight, this.f5609I.k(), this.f5609I.i())).a();
        } else {
            Rect rect = this.f5602B;
            rect.top += measuredHeight;
            rect.bottom = rect.bottom;
            uA = u6.m(0, measuredHeight, 0, 0);
        }
        this.f5609I = uA;
        q(this.f5620o, this.f5602B, true, true, true, true);
        if (!this.f5610J.equals(this.f5609I)) {
            androidx.core.view.U u7 = this.f5609I;
            this.f5610J = u7;
            androidx.core.view.H.g(this.f5620o, u7);
        }
        measureChildWithMargins(this.f5620o, i7, 0, i8, 0);
        e eVar2 = (e) this.f5620o.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f5620o.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f5620o.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f5620o.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i7, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(iMax4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i8, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f7, float f8, boolean z6) {
        if (!this.f5627v || !z6) {
            return false;
        }
        if (B(f8)) {
            p();
        } else {
            A();
        }
        this.f5628w = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f7, float f8) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i7, int i8, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i7, int i8, int i9, int i10) {
        int i11 = this.f5629x + i8;
        this.f5629x = i11;
        setActionBarHideOffset(i11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i7) {
        this.f5617Q.b(view, view2, i7);
        this.f5629x = getActionBarHideOffset();
        u();
        d dVar = this.f5611K;
        if (dVar != null) {
            dVar.e();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i7) {
        if ((i7 & 2) == 0 || this.f5621p.getVisibility() != 0) {
            return false;
        }
        return this.f5627v;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        if (this.f5627v && !this.f5628w) {
            if (this.f5629x <= this.f5621p.getHeight()) {
                y();
            } else {
                x();
            }
        }
        d dVar = this.f5611K;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i7) {
        super.onWindowSystemUiVisibilityChanged(i7);
        z();
        int i8 = this.f5630y ^ i7;
        this.f5630y = i7;
        boolean z6 = (i7 & 4) == 0;
        boolean z7 = (i7 & 256) != 0;
        d dVar = this.f5611K;
        if (dVar != null) {
            dVar.c(!z7);
            if (z6 || !z7) {
                this.f5611K.a();
            } else {
                this.f5611K.d();
            }
        }
        if ((i8 & 256) == 0 || this.f5611K == null) {
            return;
        }
        androidx.core.view.H.m0(this);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i7) {
        super.onWindowVisibilityChanged(i7);
        this.f5619n = i7;
        d dVar = this.f5611K;
        if (dVar != null) {
            dVar.f(i7);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public void setActionBarHideOffset(int i7) {
        u();
        this.f5621p.setTranslationY(-Math.max(0, Math.min(i7, this.f5621p.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.f5611K = dVar;
        if (getWindowToken() != null) {
            this.f5611K.f(this.f5619n);
            int i7 = this.f5630y;
            if (i7 != 0) {
                onWindowSystemUiVisibilityChanged(i7);
                androidx.core.view.H.m0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z6) {
        this.f5626u = z6;
    }

    public void setHideOnContentScrollEnabled(boolean z6) {
        if (z6 != this.f5627v) {
            this.f5627v = z6;
            if (z6) {
                return;
            }
            u();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i7) {
        z();
        this.f5622q.setIcon(i7);
    }

    public void setLogo(int i7) {
        z();
        this.f5622q.n(i7);
    }

    public void setOverlayMode(boolean z6) {
        this.f5625t = z6;
        this.f5624s = z6 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z6) {
    }

    public void setUiOptions(int i7) {
    }

    @Override // androidx.appcompat.widget.I
    public void setWindowCallback(Window.Callback callback) {
        z();
        this.f5622q.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.I
    public void setWindowTitle(CharSequence charSequence) {
        z();
        this.f5622q.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    void u() {
        removeCallbacks(this.f5615O);
        removeCallbacks(this.f5616P);
        ViewPropertyAnimator viewPropertyAnimator = this.f5613M;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public boolean w() {
        return this.f5625t;
    }

    void z() {
        if (this.f5620o == null) {
            this.f5620o = (ContentFrameLayout) findViewById(AbstractC1614f.f18838b);
            this.f5621p = (ActionBarContainer) findViewById(AbstractC1614f.f18839c);
            this.f5622q = t(findViewById(AbstractC1614f.f18837a));
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        z();
        this.f5622q.setIcon(drawable);
    }
}
