package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.core.view.A;
import androidx.core.view.AbstractC0602w;
import androidx.core.view.B;
import androidx.core.view.C0574a;
import androidx.core.view.C0604y;
import androidx.core.view.H;
import androidx.core.view.InterfaceC0603x;
import androidx.core.view.accessibility.C;
import androidx.core.view.accessibility.E;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import u.AbstractC2076a;

/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements A, InterfaceC0603x {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private static final float f7437N = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final a f7438O = new a();

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private static final int[] f7439P = {R.attr.fillViewport};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f7440A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f7441B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f7442C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f7443D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final int[] f7444E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final int[] f7445F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f7446G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int f7447H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private d f7448I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final B f7449J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final C0604y f7450K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private float f7451L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private c f7452M;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final float f7453m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f7454n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Rect f7455o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private OverScroller f7456p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public EdgeEffect f7457q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public EdgeEffect f7458r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f7459s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f7460t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f7461u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private View f7462v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f7463w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private VelocityTracker f7464x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f7465y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f7466z;

    static class a extends C0574a {
        a() {
        }

        @Override // androidx.core.view.C0574a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            E.a(accessibilityEvent, nestedScrollView.getScrollX());
            E.b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // androidx.core.view.C0574a
        public void g(View view, C c7) {
            int scrollRange;
            super.g(view, c7);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            c7.g0(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            c7.B0(true);
            if (nestedScrollView.getScrollY() > 0) {
                c7.b(C.a.f7377r);
                c7.b(C.a.f7345C);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                c7.b(C.a.f7376q);
                c7.b(C.a.f7347E);
            }
        }

        @Override // androidx.core.view.C0574a
        public boolean j(View view, int i7, Bundle bundle) {
            if (super.j(view, i7, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i7 != 4096) {
                if (i7 == 8192 || i7 == 16908344) {
                    int iMax = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (iMax == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.T(0, iMax, true);
                    return true;
                }
                if (i7 != 16908346) {
                    return false;
                }
            }
            int iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (iMin == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.T(0, iMin, true);
            return true;
        }
    }

    static class b {
        static boolean a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    public interface c {
        void a(NestedScrollView nestedScrollView, int i7, int i8, int i9, int i10);
    }

    static class d extends View.BaseSavedState {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f7467m;

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public d[] newArray(int i7) {
                return new d[i7];
            }
        }

        d(Parcel parcel) {
            super(parcel);
            this.f7467m = parcel.readInt();
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f7467m + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeInt(this.f7467m);
        }

        d(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC2076a.f22339c);
    }

    private void A() {
        this.f7456p = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f7440A = viewConfiguration.getScaledTouchSlop();
        this.f7441B = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f7442C = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    private void B() {
        if (this.f7464x == null) {
            this.f7464x = VelocityTracker.obtain();
        }
    }

    private boolean C(View view) {
        return !E(view, 0, getHeight());
    }

    private static boolean D(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && D((View) parent, view2);
    }

    private boolean E(View view, int i7, int i8) {
        view.getDrawingRect(this.f7455o);
        offsetDescendantRectToMyCoords(view, this.f7455o);
        return this.f7455o.bottom + i7 >= getScrollY() && this.f7455o.top - i7 <= getScrollY() + i8;
    }

    private void F(int i7, int i8, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i7);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f7450K.e(0, scrollY2, 0, i7 - scrollY2, null, i8, iArr);
    }

    private void G(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f7443D) {
            int i7 = actionIndex == 0 ? 1 : 0;
            this.f7459s = (int) motionEvent.getY(i7);
            this.f7443D = motionEvent.getPointerId(i7);
            VelocityTracker velocityTracker = this.f7464x;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void J() {
        VelocityTracker velocityTracker = this.f7464x;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f7464x = null;
        }
    }

    private int K(int i7, float f7) {
        float fD;
        EdgeEffect edgeEffect;
        float width = f7 / getWidth();
        float height = i7 / getHeight();
        float f8 = 0.0f;
        if (androidx.core.widget.d.b(this.f7457q) != 0.0f) {
            fD = -androidx.core.widget.d.d(this.f7457q, -height, width);
            if (androidx.core.widget.d.b(this.f7457q) == 0.0f) {
                edgeEffect = this.f7457q;
                edgeEffect.onRelease();
            }
            f8 = fD;
        } else if (androidx.core.widget.d.b(this.f7458r) != 0.0f) {
            fD = androidx.core.widget.d.d(this.f7458r, height, 1.0f - width);
            if (androidx.core.widget.d.b(this.f7458r) == 0.0f) {
                edgeEffect = this.f7458r;
                edgeEffect.onRelease();
            }
            f8 = fD;
        }
        int iRound = Math.round(f8 * getHeight());
        if (iRound != 0) {
            invalidate();
        }
        return iRound;
    }

    private void L(boolean z6) {
        if (z6) {
            U(2, 1);
        } else {
            W(1);
        }
        this.f7447H = getScrollY();
        H.g0(this);
    }

    private boolean M(int i7, int i8, int i9) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i10 = height + scrollY;
        boolean z6 = false;
        boolean z7 = i7 == 33;
        View viewT = t(z7, i8, i9);
        if (viewT == null) {
            viewT = this;
        }
        if (i8 < scrollY || i9 > i10) {
            p(z7 ? i8 - scrollY : i9 - i10);
            z6 = true;
        }
        if (viewT != findFocus()) {
            viewT.requestFocus(i7);
        }
        return z6;
    }

    private void N(View view) {
        view.getDrawingRect(this.f7455o);
        offsetDescendantRectToMyCoords(view, this.f7455o);
        int iG = g(this.f7455o);
        if (iG != 0) {
            scrollBy(0, iG);
        }
    }

    private boolean O(Rect rect, boolean z6) {
        int iG = g(rect);
        boolean z7 = iG != 0;
        if (z7) {
            if (z6) {
                scrollBy(0, iG);
            } else {
                Q(0, iG);
            }
        }
        return z7;
    }

    private boolean P(EdgeEffect edgeEffect, int i7) {
        if (i7 > 0) {
            return true;
        }
        return w(-i7) < androidx.core.widget.d.b(edgeEffect) * ((float) getHeight());
    }

    private void R(int i7, int i8, int i9, boolean z6) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f7454n > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f7456p.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i8 + scrollY, Math.max(0, height - height2))) - scrollY, i9);
            L(z6);
        } else {
            if (!this.f7456p.isFinished()) {
                b();
            }
            scrollBy(i7, i8);
        }
        this.f7454n = AnimationUtils.currentAnimationTimeMillis();
    }

    private boolean V(MotionEvent motionEvent) {
        boolean z6;
        if (androidx.core.widget.d.b(this.f7457q) != 0.0f) {
            androidx.core.widget.d.d(this.f7457q, 0.0f, motionEvent.getX() / getWidth());
            z6 = true;
        } else {
            z6 = false;
        }
        if (androidx.core.widget.d.b(this.f7458r) == 0.0f) {
            return z6;
        }
        androidx.core.widget.d.d(this.f7458r, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    private void b() {
        this.f7456p.abortAnimation();
        W(1);
    }

    private boolean d() {
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0) {
            return overScrollMode == 1 && getScrollRange() > 0;
        }
        return true;
    }

    private boolean e() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    private static int f(int i7, int i8, int i9) {
        if (i8 >= i9 || i7 < 0) {
            return 0;
        }
        return i8 + i7 > i9 ? i9 - i8 : i7;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f7451L == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f7451L = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f7451L;
    }

    private void p(int i7) {
        if (i7 != 0) {
            if (this.f7466z) {
                Q(0, i7);
            } else {
                scrollBy(0, i7);
            }
        }
    }

    private boolean q(int i7) {
        EdgeEffect edgeEffect;
        if (androidx.core.widget.d.b(this.f7457q) != 0.0f) {
            if (P(this.f7457q, i7)) {
                edgeEffect = this.f7457q;
                edgeEffect.onAbsorb(i7);
            } else {
                i7 = -i7;
                u(i7);
            }
        } else {
            if (androidx.core.widget.d.b(this.f7458r) == 0.0f) {
                return false;
            }
            i7 = -i7;
            if (P(this.f7458r, i7)) {
                edgeEffect = this.f7458r;
                edgeEffect.onAbsorb(i7);
            }
            u(i7);
        }
        return true;
    }

    private void r() {
        this.f7463w = false;
        J();
        W(0);
        this.f7457q.onRelease();
        this.f7458r.onRelease();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private View t(boolean z6, int i7, int i8) {
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z7 = false;
        for (int i9 = 0; i9 < size; i9++) {
            View view2 = focusables.get(i9);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i7 < bottom && top < i8) {
                boolean z8 = i7 < top && bottom < i8;
                if (view == null) {
                    view = view2;
                    z7 = z8;
                } else {
                    boolean z9 = (z6 && top < view.getTop()) || (!z6 && bottom > view.getBottom());
                    if (z7) {
                        if (z8 && z9) {
                            view = view2;
                        }
                    } else if (z8) {
                        view = view2;
                        z7 = true;
                    } else if (z9) {
                    }
                }
            }
        }
        return view;
    }

    private float w(int i7) {
        double dLog = Math.log((Math.abs(i7) * 0.35f) / (this.f7453m * 0.015f));
        float f7 = f7437N;
        return (float) (((double) (this.f7453m * 0.015f)) * Math.exp((((double) f7) / (((double) f7) - 1.0d)) * dLog));
    }

    private boolean y(int i7, int i8) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        return i8 >= childAt.getTop() - scrollY && i8 < childAt.getBottom() - scrollY && i7 >= childAt.getLeft() && i7 < childAt.getRight();
    }

    private void z() {
        VelocityTracker velocityTracker = this.f7464x;
        if (velocityTracker == null) {
            this.f7464x = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    boolean H(int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, boolean z6) {
        boolean z7;
        boolean z8;
        int overScrollMode = getOverScrollMode();
        boolean z9 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z10 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z11 = overScrollMode == 0 || (overScrollMode == 1 && z9);
        boolean z12 = overScrollMode == 0 || (overScrollMode == 1 && z10);
        int i15 = i9 + i7;
        int i16 = !z11 ? 0 : i13;
        int i17 = i10 + i8;
        int i18 = !z12 ? 0 : i14;
        int i19 = -i16;
        int i20 = i16 + i11;
        int i21 = -i18;
        int i22 = i18 + i12;
        if (i15 > i20) {
            i15 = i20;
            z7 = true;
        } else if (i15 < i19) {
            z7 = true;
            i15 = i19;
        } else {
            z7 = false;
        }
        if (i17 > i22) {
            i17 = i22;
            z8 = true;
        } else if (i17 < i21) {
            z8 = true;
            i17 = i21;
        } else {
            z8 = false;
        }
        if (z8 && !x(1)) {
            this.f7456p.springBack(i15, i17, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i15, i17, z7, z8);
        return z7 || z8;
    }

    public boolean I(int i7) {
        boolean z6 = i7 == 130;
        int height = getHeight();
        if (z6) {
            this.f7455o.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f7455o;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f7455o.top = getScrollY() - height;
            Rect rect2 = this.f7455o;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f7455o;
        int i8 = rect3.top;
        int i9 = height + i8;
        rect3.bottom = i9;
        return M(i7, i8, i9);
    }

    public final void Q(int i7, int i8) {
        R(i7, i8, 250, false);
    }

    void S(int i7, int i8, int i9, boolean z6) {
        R(i7 - getScrollX(), i8 - getScrollY(), i9, z6);
    }

    void T(int i7, int i8, boolean z6) {
        S(i7, i8, 250, z6);
    }

    public boolean U(int i7, int i8) {
        return this.f7450K.p(i7, i8);
    }

    public void W(int i7) {
        this.f7450K.r(i7);
    }

    @Override // androidx.core.view.A
    public void a(View view, int i7, int i8, int i9, int i10, int i11, int[] iArr) {
        F(i10, i11, iArr);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    public boolean c(int i7) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i7);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !E(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i7 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i7 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i7 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            p(maxScrollAmount);
        } else {
            viewFindNextFocus.getDrawingRect(this.f7455o);
            offsetDescendantRectToMyCoords(viewFindNextFocus, this.f7455o);
            p(g(this.f7455o));
            viewFindNextFocus.requestFocus(i7);
        }
        if (viewFindFocus == null || !viewFindFocus.isFocused() || !C(viewFindFocus)) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        EdgeEffect edgeEffect;
        if (this.f7456p.isFinished()) {
            return;
        }
        this.f7456p.computeScrollOffset();
        int currY = this.f7456p.getCurrY();
        int iH = h(currY - this.f7447H);
        this.f7447H = currY;
        int[] iArr = this.f7445F;
        iArr[1] = 0;
        i(0, iH, iArr, null, 1);
        int i7 = iH - this.f7445F[1];
        int scrollRange = getScrollRange();
        if (i7 != 0) {
            int scrollY = getScrollY();
            H(0, i7, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            int scrollY2 = getScrollY() - scrollY;
            int i8 = i7 - scrollY2;
            int[] iArr2 = this.f7445F;
            iArr2[1] = 0;
            j(0, scrollY2, 0, i8, this.f7444E, 1, iArr2);
            i7 = i8 - this.f7445F[1];
        }
        if (i7 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                if (i7 < 0) {
                    if (this.f7457q.isFinished()) {
                        edgeEffect = this.f7457q;
                        edgeEffect.onAbsorb((int) this.f7456p.getCurrVelocity());
                    }
                } else if (this.f7458r.isFinished()) {
                    edgeEffect = this.f7458r;
                    edgeEffect.onAbsorb((int) this.f7456p.getCurrVelocity());
                }
            }
            b();
        }
        if (this.f7456p.isFinished()) {
            W(1);
        } else {
            H.g0(this);
        }
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > iMax ? bottom + (scrollY - iMax) : bottom;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || s(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f7, float f8, boolean z6) {
        return this.f7450K.a(f7, f8, z6);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f7, float f8) {
        return this.f7450K.b(f7, f8);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i7, int i8, int[] iArr, int[] iArr2) {
        return i(i7, i8, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i7, int i8, int i9, int i10, int[] iArr) {
        return this.f7450K.f(i7, i8, i9, i10, iArr);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        int paddingLeft2 = 0;
        if (!this.f7457q.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (b.a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (b.a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            this.f7457q.setSize(width, height);
            if (this.f7457q.draw(canvas)) {
                H.g0(this);
            }
            canvas.restoreToCount(iSave);
        }
        if (this.f7458r.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (b.a(this)) {
            width2 -= getPaddingLeft() + getPaddingRight();
            paddingLeft2 = getPaddingLeft();
        }
        if (b.a(this)) {
            height2 -= getPaddingTop() + getPaddingBottom();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        this.f7458r.setSize(width2, height2);
        if (this.f7458r.draw(canvas)) {
            H.g0(this);
        }
        canvas.restoreToCount(iSave2);
    }

    protected int g(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i7 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i8 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i7 - verticalFadingEdgeLength : i7;
        int i9 = rect.bottom;
        if (i9 > i8 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i8, (childAt.getBottom() + layoutParams.bottomMargin) - i7);
        }
        if (rect.top >= scrollY || i9 >= i8) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i8 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f7449J.a();
    }

    int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    int h(int i7) {
        int height = getHeight();
        if (i7 > 0 && androidx.core.widget.d.b(this.f7457q) != 0.0f) {
            int iRound = Math.round(((-height) / 4.0f) * androidx.core.widget.d.d(this.f7457q, ((-i7) * 4.0f) / height, 0.5f));
            if (iRound != i7) {
                this.f7457q.finish();
            }
            return i7 - iRound;
        }
        if (i7 >= 0 || androidx.core.widget.d.b(this.f7458r) == 0.0f) {
            return i7;
        }
        float f7 = height;
        int iRound2 = Math.round((f7 / 4.0f) * androidx.core.widget.d.d(this.f7458r, (i7 * 4.0f) / f7, 0.5f));
        if (iRound2 != i7) {
            this.f7458r.finish();
        }
        return i7 - iRound2;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return x(0);
    }

    public boolean i(int i7, int i8, int[] iArr, int[] iArr2, int i9) {
        return this.f7450K.d(i7, i8, iArr, iArr2, i9);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f7450K.l();
    }

    public void j(int i7, int i8, int i9, int i10, int[] iArr, int i11, int[] iArr2) {
        this.f7450K.e(i7, i8, i9, i10, iArr, i11, iArr2);
    }

    @Override // androidx.core.view.InterfaceC0605z
    public void k(View view, int i7, int i8, int i9, int i10, int i11) {
        F(i10, i11, null);
    }

    @Override // androidx.core.view.InterfaceC0605z
    public boolean l(View view, View view2, int i7, int i8) {
        return (i7 & 2) != 0;
    }

    @Override // androidx.core.view.InterfaceC0605z
    public void m(View view, View view2, int i7, int i8) {
        this.f7449J.c(view, view2, i7, i8);
        U(2, i8);
    }

    @Override // android.view.ViewGroup
    protected void measureChild(View view, int i7, int i8) {
        view.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i7, int i8, int i9, int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i8, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // androidx.core.view.InterfaceC0605z
    public void n(View view, int i7) {
        this.f7449J.e(view, i7);
        W(i7);
    }

    @Override // androidx.core.view.InterfaceC0605z
    public void o(View view, int i7, int i8, int[] iArr, int i9) {
        i(i7, i8, iArr, null, i9);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f7461u = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue;
        int i7;
        boolean z6;
        int i8 = 0;
        if (motionEvent.getAction() == 8 && !this.f7463w) {
            if (AbstractC0602w.a(motionEvent, 2)) {
                i7 = 9;
            } else if (AbstractC0602w.a(motionEvent, 4194304)) {
                i7 = 26;
            } else {
                axisValue = 0.0f;
                if (axisValue != 0.0f) {
                    int verticalScrollFactorCompat = (int) (axisValue * getVerticalScrollFactorCompat());
                    int scrollRange = getScrollRange();
                    int scrollY = getScrollY();
                    int i9 = scrollY - verticalScrollFactorCompat;
                    if (i9 < 0) {
                        if (!d() || AbstractC0602w.a(motionEvent, 8194)) {
                            z6 = 0;
                        } else {
                            androidx.core.widget.d.d(this.f7457q, (-i9) / getHeight(), 0.5f);
                            this.f7457q.onRelease();
                            invalidate();
                            z6 = 1;
                        }
                    } else if (i9 > scrollRange) {
                        if (d() && !AbstractC0602w.a(motionEvent, 8194)) {
                            androidx.core.widget.d.d(this.f7458r, (i9 - scrollRange) / getHeight(), 0.5f);
                            this.f7458r.onRelease();
                            invalidate();
                            i8 = 1;
                        }
                        z6 = i8;
                        i8 = scrollRange;
                    } else {
                        z6 = 0;
                        i8 = i9;
                    }
                    if (i8 == scrollY) {
                        return z6;
                    }
                    super.scrollTo(getScrollX(), i8);
                    return true;
                }
            }
            axisValue = motionEvent.getAxisValue(i7);
            if (axisValue != 0.0f) {
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z6 = true;
        if (action == 2 && this.f7463w) {
            return true;
        }
        int i7 = action & 255;
        if (i7 == 0) {
            int y6 = (int) motionEvent.getY();
            if (y((int) motionEvent.getX(), y6)) {
                this.f7459s = y6;
                this.f7443D = motionEvent.getPointerId(0);
                z();
                this.f7464x.addMovement(motionEvent);
                this.f7456p.computeScrollOffset();
                if (!V(motionEvent) && this.f7456p.isFinished()) {
                    z6 = false;
                }
                this.f7463w = z6;
                U(2, 0);
            } else {
                if (!V(motionEvent) && this.f7456p.isFinished()) {
                    z6 = false;
                }
                this.f7463w = z6;
                J();
            }
        } else if (i7 == 1) {
            this.f7463w = false;
            this.f7443D = -1;
            J();
            if (this.f7456p.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                H.g0(this);
            }
            W(0);
        } else if (i7 == 2) {
            int i8 = this.f7443D;
            if (i8 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i8);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + i8 + " in onInterceptTouchEvent");
                } else {
                    int y7 = (int) motionEvent.getY(iFindPointerIndex);
                    if (Math.abs(y7 - this.f7459s) > this.f7440A && (2 & getNestedScrollAxes()) == 0) {
                        this.f7463w = true;
                        this.f7459s = y7;
                        B();
                        this.f7464x.addMovement(motionEvent);
                        this.f7446G = 0;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
            }
        } else if (i7 != 3) {
            if (i7 == 6) {
                G(motionEvent);
            }
        }
        return this.f7463w;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        super.onLayout(z6, i7, i8, i9, i10);
        int measuredHeight = 0;
        this.f7460t = false;
        View view = this.f7462v;
        if (view != null && D(view, this)) {
            N(this.f7462v);
        }
        this.f7462v = null;
        if (!this.f7461u) {
            if (this.f7448I != null) {
                scrollTo(getScrollX(), this.f7448I.f7467m);
                this.f7448I = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i10 - i8) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iF = f(scrollY, paddingTop, measuredHeight);
            if (iF != scrollY) {
                scrollTo(getScrollX(), iF);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f7461u = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        if (this.f7465y && View.MeasureSpec.getMode(i8) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f7, float f8, boolean z6) {
        if (z6) {
            return false;
        }
        dispatchNestedFling(0.0f, f8, true);
        u((int) f8);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f7, float f8) {
        return dispatchNestedPreFling(f7, f8);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i7, int i8, int[] iArr) {
        o(view, i7, i8, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i7, int i8, int i9, int i10) {
        F(i10, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i7) {
        m(view, view2, i7, 0);
    }

    @Override // android.view.View
    protected void onOverScrolled(int i7, int i8, boolean z6, boolean z7) {
        super.scrollTo(i7, i8);
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i7, Rect rect) {
        if (i7 == 2) {
            i7 = 130;
        } else if (i7 == 1) {
            i7 = 33;
        }
        FocusFinder focusFinder = FocusFinder.getInstance();
        View viewFindNextFocus = rect == null ? focusFinder.findNextFocus(this, null, i7) : focusFinder.findNextFocusFromRect(this, rect, i7);
        if (viewFindNextFocus == null || C(viewFindNextFocus)) {
            return false;
        }
        return viewFindNextFocus.requestFocus(i7, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        this.f7448I = dVar;
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.f7467m = getScrollY();
        return dVar;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i7, int i8, int i9, int i10) {
        super.onScrollChanged(i7, i8, i9, i10);
        c cVar = this.f7452M;
        if (cVar != null) {
            cVar.a(this, i7, i8, i9, i10);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !E(viewFindFocus, 0, i10)) {
            return;
        }
        viewFindFocus.getDrawingRect(this.f7455o);
        offsetDescendantRectToMyCoords(viewFindFocus, this.f7455o);
        p(g(this.f7455o));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i7) {
        return l(view, view2, i7, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        n(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01d3  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        EdgeEffect edgeEffect;
        B();
        int actionMasked = motionEvent.getActionMasked();
        boolean z6 = false;
        if (actionMasked == 0) {
            this.f7446G = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(0.0f, this.f7446G);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f7464x;
                velocityTracker.computeCurrentVelocity(1000, this.f7442C);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f7443D);
                if (Math.abs(yVelocity) >= this.f7441B) {
                    if (!q(yVelocity)) {
                        int i7 = -yVelocity;
                        float f7 = i7;
                        if (!dispatchNestedPreFling(0.0f, f7)) {
                            dispatchNestedFling(0.0f, f7, true);
                            u(i7);
                        }
                    }
                } else if (this.f7456p.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                }
                this.f7443D = -1;
                r();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f7443D);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f7443D + " in onTouchEvent");
                } else {
                    int y6 = (int) motionEvent.getY(iFindPointerIndex);
                    int i8 = this.f7459s - y6;
                    int iK = i8 - K(i8, motionEvent.getX(iFindPointerIndex));
                    if (!this.f7463w && Math.abs(iK) > this.f7440A) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f7463w = true;
                        int i9 = this.f7440A;
                        iK = iK > 0 ? iK - i9 : iK + i9;
                    }
                    int i10 = iK;
                    if (this.f7463w) {
                        if (i(0, i10, this.f7445F, this.f7444E, 0)) {
                            i10 -= this.f7445F[1];
                            this.f7446G += this.f7444E[1];
                        }
                        int i11 = i10;
                        this.f7459s = y6 - this.f7444E[1];
                        int scrollY = getScrollY();
                        int scrollRange = getScrollRange();
                        int overScrollMode = getOverScrollMode();
                        boolean z7 = overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0);
                        boolean z8 = H(0, i11, 0, getScrollY(), 0, scrollRange, 0, 0, true) && !x(0);
                        int scrollY2 = getScrollY() - scrollY;
                        int[] iArr = this.f7445F;
                        iArr[1] = 0;
                        j(0, scrollY2, 0, i11 - scrollY2, this.f7444E, 0, iArr);
                        int i12 = this.f7459s;
                        int i13 = this.f7444E[1];
                        this.f7459s = i12 - i13;
                        this.f7446G += i13;
                        if (z7) {
                            int i14 = i11 - this.f7445F[1];
                            int i15 = scrollY + i14;
                            if (i15 < 0) {
                                androidx.core.widget.d.d(this.f7457q, (-i14) / getHeight(), motionEvent.getX(iFindPointerIndex) / getWidth());
                                if (!this.f7458r.isFinished()) {
                                    edgeEffect = this.f7458r;
                                    edgeEffect.onRelease();
                                }
                                if (this.f7457q.isFinished() || !this.f7458r.isFinished()) {
                                    H.g0(this);
                                }
                                if (z6) {
                                }
                            } else {
                                if (i15 > scrollRange) {
                                    androidx.core.widget.d.d(this.f7458r, i14 / getHeight(), 1.0f - (motionEvent.getX(iFindPointerIndex) / getWidth()));
                                    if (!this.f7457q.isFinished()) {
                                        edgeEffect = this.f7457q;
                                        edgeEffect.onRelease();
                                    }
                                }
                                if (this.f7457q.isFinished()) {
                                }
                                H.g0(this);
                                if (z6) {
                                }
                            }
                        } else {
                            z6 = z8;
                            if (z6) {
                                this.f7464x.clear();
                            }
                        }
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f7463w && getChildCount() > 0 && this.f7456p.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    H.g0(this);
                }
                this.f7443D = -1;
                r();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f7459s = (int) motionEvent.getY(actionIndex);
                this.f7443D = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                G(motionEvent);
                this.f7459s = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f7443D));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f7463w && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f7456p.isFinished()) {
                b();
            }
            this.f7459s = (int) motionEvent.getY();
            this.f7443D = motionEvent.getPointerId(0);
            U(2, 0);
        }
        VelocityTracker velocityTracker2 = this.f7464x;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.f7460t) {
            this.f7462v = view2;
        } else {
            N(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z6) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return O(rect, z6);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z6) {
        if (z6) {
            J();
        }
        super.requestDisallowInterceptTouchEvent(z6);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f7460t = true;
        super.requestLayout();
    }

    public boolean s(KeyEvent keyEvent) {
        this.f7455o.setEmpty();
        if (!e()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View viewFindFocus = findFocus();
            if (viewFindFocus == this) {
                viewFindFocus = null;
            }
            View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
            return (viewFindNextFocus == null || viewFindNextFocus == this || !viewFindNextFocus.requestFocus(130)) ? false : true;
        }
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 19) {
            return !keyEvent.isAltPressed() ? c(33) : v(33);
        }
        if (keyCode == 20) {
            return !keyEvent.isAltPressed() ? c(130) : v(130);
        }
        if (keyCode != 62) {
            return false;
        }
        I(keyEvent.isShiftPressed() ? 33 : 130);
        return false;
    }

    @Override // android.view.View
    public void scrollTo(int i7, int i8) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int iF = f(i7, width, width2);
            int iF2 = f(i8, height, height2);
            if (iF == getScrollX() && iF2 == getScrollY()) {
                return;
            }
            super.scrollTo(iF, iF2);
        }
    }

    public void setFillViewport(boolean z6) {
        if (z6 != this.f7465y) {
            this.f7465y = z6;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z6) {
        this.f7450K.m(z6);
    }

    public void setOnScrollChangeListener(c cVar) {
    }

    public void setSmoothScrollingEnabled(boolean z6) {
        this.f7466z = z6;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i7) {
        return U(i7, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        W(0);
    }

    public void u(int i7) {
        if (getChildCount() > 0) {
            this.f7456p.fling(getScrollX(), getScrollY(), 0, i7, 0, 0, Integer.MIN_VALUE, Api.BaseClientBuilder.API_PRIORITY_OTHER, 0, 0);
            L(true);
        }
    }

    public boolean v(int i7) {
        int childCount;
        boolean z6 = i7 == 130;
        int height = getHeight();
        Rect rect = this.f7455o;
        rect.top = 0;
        rect.bottom = height;
        if (z6 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f7455o.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f7455o;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f7455o;
        return M(i7, rect3.top, rect3.bottom);
    }

    public boolean x(int i7) {
        return this.f7450K.k(i7);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f7455o = new Rect();
        this.f7460t = true;
        this.f7461u = false;
        this.f7462v = null;
        this.f7463w = false;
        this.f7466z = true;
        this.f7443D = -1;
        this.f7444E = new int[2];
        this.f7445F = new int[2];
        this.f7457q = androidx.core.widget.d.a(context, attributeSet);
        this.f7458r = androidx.core.widget.d.a(context, attributeSet);
        this.f7453m = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        A();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f7439P, i7, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f7449J = new B(this);
        this.f7450K = new C0604y(this);
        setNestedScrollingEnabled(true);
        H.p0(this, f7438O);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i7) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i7);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i7, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }
}
