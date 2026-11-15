package com.facebook.react.views.scroll;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.OverScroller;
import com.facebook.react.uimanager.A;
import com.facebook.react.uimanager.H;
import com.facebook.react.uimanager.InterfaceC0870d0;
import com.facebook.react.uimanager.K;
import com.facebook.react.uimanager.L;
import com.facebook.react.uimanager.P;
import com.facebook.react.uimanager.events.m;
import com.facebook.react.views.scroll.a;
import com.facebook.react.views.scroll.f;
import com.google.android.gms.common.api.Api;
import e2.C1619a;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class b extends HorizontalScrollView implements K, ViewGroup.OnHierarchyChangeListener, View.OnLayoutChangeListener, P, f.c, f.e, f.a, f.b, f.d {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static boolean f12867b0 = false;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static String f12868c0 = "b";

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static int f12869d0 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static Field f12870e0 = null;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static boolean f12871f0 = false;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f12872A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private boolean f12873B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private String f12874C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private Drawable f12875D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f12876E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private boolean f12877F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f12878G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private List f12879H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f12880I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f12881J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private int f12882K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private com.facebook.react.views.view.g f12883L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private boolean f12884M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private int f12885N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f12886O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private InterfaceC0870d0 f12887P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private final f.g f12888Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private final ValueAnimator f12889R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private H f12890S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private long f12891T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private int f12892U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private View f12893V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private com.facebook.react.views.scroll.a f12894W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private final Rect f12895a0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f12896m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final K2.b f12897n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final OverScroller f12898o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final i f12899p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Rect f12900q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f12901r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Rect f12902s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f12903t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f12904u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f12905v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Runnable f12906w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f12907x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f12908y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f12909z;

    class a implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f12910m = false;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f12911n = 0;

        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.f12901r) {
                b.this.f12901r = false;
                this.f12911n = 0;
            } else {
                f.q(b.this);
                int i7 = this.f12911n + 1;
                this.f12911n = i7;
                if (i7 >= 3) {
                    b.this.f12906w = null;
                    if (b.this.f12873B) {
                        f.h(b.this);
                    }
                    b.this.n();
                    return;
                }
                if (b.this.f12905v && !this.f12910m) {
                    this.f12910m = true;
                    b.this.s(0);
                }
            }
            androidx.core.view.H.i0(b.this, this, 20L);
        }
    }

    public b(Context context, K2.a aVar) {
        super(context);
        this.f12896m = f12869d0;
        this.f12897n = new K2.b();
        this.f12899p = new i();
        this.f12900q = new Rect();
        this.f12903t = "hidden";
        this.f12905v = false;
        this.f12908y = true;
        this.f12909z = false;
        this.f12872A = false;
        this.f12876E = 0;
        this.f12877F = false;
        this.f12878G = 0;
        this.f12880I = true;
        this.f12881J = true;
        this.f12882K = 0;
        this.f12884M = false;
        this.f12885N = -1;
        this.f12886O = -1;
        this.f12887P = null;
        this.f12889R = ObjectAnimator.ofInt(this, "scrollX", 0, 0);
        this.f12890S = H.f12293q;
        this.f12891T = 0L;
        this.f12892U = 0;
        this.f12895a0 = new Rect();
        this.f12883L = new com.facebook.react.views.view.g(this);
        androidx.core.view.H.p0(this, new d());
        this.f12898o = getOverScrollerFromParent();
        this.f12888Q = new f.g(com.facebook.react.modules.i18nmanager.a.f().i(context) ? 1 : 0);
        setOnHierarchyChangeListener(this);
        setClipChildren(false);
        this.f12883L.k("scroll");
    }

    private boolean B() {
        return false;
    }

    private boolean C(View view) {
        return v(view) == 0;
    }

    private int D(int i7) {
        int iMax = Math.max(0, computeHorizontalScrollRange() - getWidth());
        if (getFlingAnimator() == this.f12889R) {
            return f.n(this, i7, 0, iMax, 0).x;
        }
        return t(i7) + f.k(this, getScrollX(), getReactScrollViewScrollState().b().x, i7);
    }

    private void E(int i7, int i8) {
        if (getFlingAnimator().isRunning()) {
            getFlingAnimator().cancel();
        }
        OverScroller overScroller = this.f12898o;
        if (overScroller == null || overScroller.isFinished()) {
            return;
        }
        int currX = this.f12898o.getCurrX();
        boolean zComputeScrollOffset = this.f12898o.computeScrollOffset();
        this.f12898o.forceFinished(true);
        if (!zComputeScrollOffset) {
            scrollTo(i7 + (this.f12898o.getCurrX() - currX), getScrollY());
            return;
        }
        this.f12898o.fling(i7, getScrollY(), (int) (this.f12898o.getCurrVelocity() * Math.signum(this.f12898o.getFinalX() - this.f12898o.getStartX())), 0, 0, i8, 0, 0);
    }

    private void F(View view) {
        int iV = v(view);
        if (iV != 0) {
            scrollBy(iV, 0);
        }
    }

    private void J(int i7, int i8) {
        if (f12867b0) {
            P0.a.r(f12868c0, "setPendingContentOffsets[%d] x %d y %d", Integer.valueOf(getId()), Integer.valueOf(i7), Integer.valueOf(i8));
        }
        if (y()) {
            this.f12885N = -1;
            this.f12886O = -1;
        } else {
            this.f12885N = i7;
            this.f12886O = i8;
        }
    }

    private void K(int i7) {
        if (f12867b0) {
            P0.a.q(f12868c0, "smoothScrollAndSnap[%d] velocity %d", Integer.valueOf(getId()), Integer.valueOf(i7));
        }
        double snapInterval = getSnapInterval();
        double dK = f.k(this, getScrollX(), getReactScrollViewScrollState().b().x, i7);
        double D6 = D(i7);
        double d7 = dK / snapInterval;
        int iFloor = (int) Math.floor(d7);
        int iCeil = (int) Math.ceil(d7);
        int iRound = (int) Math.round(d7);
        int iRound2 = (int) Math.round(D6 / snapInterval);
        if (i7 > 0 && iCeil == iFloor) {
            iCeil++;
        } else if (i7 < 0 && iFloor == iCeil) {
            iFloor--;
        }
        if (i7 > 0 && iRound < iCeil && iRound2 > iFloor) {
            iRound = iCeil;
        } else if (i7 < 0 && iRound > iFloor && iRound2 < iCeil) {
            iRound = iFloor;
        }
        double d8 = ((double) iRound) * snapInterval;
        if (d8 != dK) {
            this.f12901r = true;
            c((int) d8, getScrollY());
        }
    }

    private void L(int i7) {
        if (f12867b0) {
            P0.a.q(f12868c0, "smoothScrollToNextPage[%d] direction %d", Integer.valueOf(getId()), Integer.valueOf(i7));
        }
        int width = getWidth();
        int scrollX = getScrollX();
        int i8 = scrollX / width;
        if (scrollX % width != 0) {
            i8++;
        }
        int i9 = i7 == 17 ? i8 - 1 : i8 + 1;
        if (i9 < 0) {
            i9 = 0;
        }
        c(i9 * width, getScrollY());
        x(0, 0);
    }

    private View getContentView() {
        return getChildAt(0);
    }

    private OverScroller getOverScrollerFromParent() {
        if (!f12871f0) {
            f12871f0 = true;
            try {
                Field declaredField = HorizontalScrollView.class.getDeclaredField("mScroller");
                f12870e0 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                P0.a.G(f12868c0, "Failed to get mScroller field for HorizontalScrollView! This app will exhibit the bounce-back scrolling bug :(");
            }
        }
        Field field = f12870e0;
        OverScroller overScroller = null;
        if (field != null) {
            try {
                Object obj = field.get(this);
                if (obj instanceof OverScroller) {
                    overScroller = (OverScroller) obj;
                } else {
                    P0.a.G(f12868c0, "Failed to cast mScroller field in HorizontalScrollView (probably due to OEM changes to AOSP)! This app will exhibit the bounce-back scrolling bug :(");
                }
            } catch (IllegalAccessException e7) {
                throw new RuntimeException("Failed to get mScroller from HorizontalScrollView!", e7);
            }
        }
        return overScroller;
    }

    private int getSnapInterval() {
        int i7 = this.f12878G;
        return i7 != 0 ? i7 : getWidth();
    }

    private void l(int i7, int i8, int i9, int i10) {
        if (getFlingAnimator().isRunning()) {
            getFlingAnimator().end();
        }
        int i11 = i8 - i7;
        int scrollX = i11 - (i10 - getScrollX());
        scrollTo(scrollX, getScrollY());
        E(scrollX, i11 - getWidth());
    }

    private void m() {
        Runnable runnable = this.f12906w;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f12906w = null;
            getFlingAnimator().cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        if (B()) {
            O1.a.c(null);
            O1.a.c(this.f12874C);
            throw null;
        }
    }

    private void o() {
        if (B()) {
            O1.a.c(null);
            O1.a.c(this.f12874C);
            throw null;
        }
    }

    private static HorizontalScrollView p(View view, MotionEvent motionEvent) {
        return q(view, motionEvent, true);
    }

    private static HorizontalScrollView q(View view, MotionEvent motionEvent, boolean z6) {
        if (view == null) {
            return null;
        }
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
            return null;
        }
        if (!z6 && (view instanceof HorizontalScrollView) && androidx.core.view.H.U(view) && (view instanceof b) && ((b) view).f12908y) {
            return (HorizontalScrollView) view;
        }
        if (view instanceof ViewGroup) {
            int i7 = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i7 >= viewGroup.getChildCount()) {
                    break;
                }
                HorizontalScrollView horizontalScrollViewQ = q(viewGroup.getChildAt(i7), motionEvent, false);
                if (horizontalScrollViewQ != null) {
                    return horizontalScrollViewQ;
                }
                i7++;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s(int i7) {
        int i8;
        int iFloor;
        int iMin;
        int iIntValue;
        int iIntValue2;
        OverScroller overScroller;
        if (f12867b0) {
            P0.a.q(f12868c0, "smoothScrollAndSnap[%d] velocityX %d", Integer.valueOf(getId()), Integer.valueOf(i7));
        }
        if (getChildCount() <= 0) {
            return;
        }
        if (this.f12878G == 0 && this.f12879H == null && this.f12882K == 0) {
            K(i7);
            return;
        }
        boolean z6 = getFlingAnimator() != this.f12889R;
        int iMax = Math.max(0, computeHorizontalScrollRange() - getWidth());
        int iD = D(i7);
        if (this.f12877F) {
            iD = getScrollX();
        }
        int width = (getWidth() - androidx.core.view.H.G(this)) - androidx.core.view.H.F(this);
        int layoutDirection = C1619a.d() ? getLayoutDirection() : this.f12888Q.d();
        if (layoutDirection == 1) {
            iD = iMax - iD;
            i8 = -i7;
        } else {
            i8 = i7;
        }
        List list = this.f12879H;
        if (list == null || list.isEmpty()) {
            int i9 = this.f12882K;
            if (i9 != 0) {
                int i10 = this.f12878G;
                if (i10 > 0) {
                    double d7 = ((double) iD) / ((double) i10);
                    double dFloor = Math.floor(d7);
                    int i11 = this.f12878G;
                    iFloor = Math.max(u(i9, (int) (dFloor * ((double) i11)), i11, width), 0);
                    int i12 = this.f12882K;
                    double dCeil = Math.ceil(d7);
                    int i13 = this.f12878G;
                    iMin = Math.min(u(i12, (int) (dCeil * ((double) i13)), i13, width), iMax);
                    iIntValue = iMax;
                    iIntValue2 = 0;
                } else {
                    ViewGroup viewGroup = (ViewGroup) getContentView();
                    int iMin2 = iMax;
                    int i14 = iMin2;
                    int i15 = 0;
                    int iMax2 = 0;
                    for (int i16 = 0; i16 < viewGroup.getChildCount(); i16++) {
                        View childAt = viewGroup.getChildAt(i16);
                        int iU = u(this.f12882K, childAt.getLeft(), childAt.getWidth(), width);
                        if (iU <= iD && iD - iU < iD - i15) {
                            i15 = iU;
                        }
                        if (iU >= iD && iU - iD < i14 - iD) {
                            i14 = iU;
                        }
                        iMin2 = Math.min(iMin2, iU);
                        iMax2 = Math.max(iMax2, iU);
                    }
                    int iMax3 = Math.max(i15, iMin2);
                    iMin = Math.min(i14, iMax2);
                    iIntValue = iMax;
                    iFloor = iMax3;
                }
            } else {
                double snapInterval = getSnapInterval();
                double d8 = ((double) iD) / snapInterval;
                iFloor = (int) (Math.floor(d8) * snapInterval);
                iMin = Math.min((int) (Math.ceil(d8) * snapInterval), iMax);
                iIntValue = iMax;
            }
            iIntValue2 = 0;
        } else {
            iIntValue2 = ((Integer) this.f12879H.get(0)).intValue();
            List list2 = this.f12879H;
            iIntValue = ((Integer) list2.get(list2.size() - 1)).intValue();
            iMin = iMax;
            iFloor = 0;
            for (int i17 = 0; i17 < this.f12879H.size(); i17++) {
                int iIntValue3 = ((Integer) this.f12879H.get(i17)).intValue();
                if (iIntValue3 <= iD && iD - iIntValue3 < iD - iFloor) {
                    iFloor = iIntValue3;
                }
                if (iIntValue3 >= iD && iIntValue3 - iD < iMin - iD) {
                    iMin = iIntValue3;
                }
            }
        }
        int i18 = iD - iFloor;
        int i19 = iMin - iD;
        int i20 = Math.abs(i18) < Math.abs(i19) ? iFloor : iMin;
        int scrollX = getScrollX();
        if (layoutDirection == 1) {
            scrollX = iMax - scrollX;
        }
        if (this.f12881J || iD < iIntValue) {
            if (this.f12880I || iD > iIntValue2) {
                if (i8 > 0) {
                    if (!z6) {
                        i8 += (int) (((double) i19) * 10.0d);
                    }
                    iD = iMin;
                } else if (i8 < 0) {
                    if (!z6) {
                        i8 -= (int) (((double) i18) * 10.0d);
                    }
                    iD = iFloor;
                } else {
                    iD = i20;
                }
            } else if (scrollX > iIntValue2) {
                iD = iIntValue2;
            }
        } else if (scrollX < iIntValue) {
            iD = iIntValue;
        }
        int iMin3 = Math.min(Math.max(0, iD), iMax);
        if (layoutDirection == 1) {
            iMin3 = iMax - iMin3;
            i8 = -i8;
        }
        int i21 = iMin3;
        if (z6 || (overScroller = this.f12898o) == null) {
            c(i21, getScrollY());
            return;
        }
        this.f12901r = true;
        overScroller.fling(getScrollX(), getScrollY(), i8 != 0 ? i8 : i21 - getScrollX(), 0, i21, i21, 0, 0, (i21 == 0 || i21 == iMax) ? width / 2 : 0, 0);
        postInvalidateOnAnimation();
    }

    private int u(int i7, int i8, int i9, int i10) {
        int i11;
        if (i7 == 1) {
            return i8;
        }
        if (i7 == 2) {
            i11 = (i10 - i9) / 2;
        } else {
            if (i7 != 3) {
                throw new IllegalStateException("Invalid SnapToAlignment value: " + this.f12882K);
            }
            i11 = i10 - i9;
        }
        return i8 - i11;
    }

    private int v(View view) {
        view.getDrawingRect(this.f12895a0);
        offsetDescendantRectToMyCoords(view, this.f12895a0);
        return computeScrollDeltaToGetChildRectOnScreen(this.f12895a0);
    }

    private void x(int i7, int i8) {
        if (f12867b0) {
            P0.a.r(f12868c0, "handlePostTouchScrolling[%d] velocityX %d velocityY %d", Integer.valueOf(getId()), Integer.valueOf(i7), Integer.valueOf(i8));
        }
        if (this.f12906w != null) {
            return;
        }
        if (this.f12873B) {
            f.g(this, i7, i8);
        }
        this.f12901r = false;
        a aVar = new a();
        this.f12906w = aVar;
        androidx.core.view.H.i0(this, aVar, 20L);
    }

    private boolean y() {
        View contentView = getContentView();
        return (contentView == null || contentView.getWidth() == 0 || contentView.getHeight() == 0) ? false : true;
    }

    private boolean z(View view) {
        int iV = v(view);
        view.getDrawingRect(this.f12895a0);
        return iV != 0 && Math.abs(iV) < this.f12895a0.width() / 2;
    }

    public boolean A(View view) {
        int iV = v(view);
        view.getDrawingRect(this.f12895a0);
        return iV != 0 && Math.abs(iV) < this.f12895a0.width();
    }

    public void G(int i7, float f7, float f8) {
        this.f12883L.f(i7, f7, f8);
    }

    public void H(float f7, int i7) {
        this.f12883L.h(f7, i7);
    }

    public void I(int i7, float f7) {
        this.f12883L.j(i7, f7);
    }

    @Override // com.facebook.react.views.scroll.f.a
    public void a(int i7, int i8) {
        this.f12889R.cancel();
        this.f12889R.setDuration(f.j(getContext())).setIntValues(i7, i8);
        this.f12889R.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i7, int i8) {
        if (!this.f12905v || this.f12884M) {
            super.addFocusables(arrayList, i7, i8);
            return;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        super.addFocusables(arrayList2, i7, i8);
        for (View view : arrayList2) {
            if (C(view) || A(view) || view.isFocused()) {
                arrayList.add(view);
            }
        }
    }

    @Override // android.widget.HorizontalScrollView
    public boolean arrowScroll(int i7) {
        if (!this.f12905v) {
            return super.arrowScroll(i7);
        }
        boolean z6 = true;
        this.f12884M = true;
        if (getChildCount() > 0) {
            View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus(), i7);
            View contentView = getContentView();
            if (contentView == null || viewFindNextFocus == null || viewFindNextFocus.getParent() != contentView) {
                L(i7);
            } else {
                if (!C(viewFindNextFocus) && !z(viewFindNextFocus)) {
                    L(i7);
                }
                viewFindNextFocus.requestFocus();
            }
        } else {
            z6 = false;
        }
        this.f12884M = false;
        return z6;
    }

    @Override // com.facebook.react.views.scroll.f.d
    public void b(int i7, int i8) {
        scrollTo(i7, i8);
        E(i7, Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    @Override // com.facebook.react.views.scroll.f.d
    public void c(int i7, int i8) {
        f.p(this, i7, i8);
        J(i7, i8);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i7) {
        return this.f12908y && super.canScrollHorizontally(i7);
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if (H.j(this.f12890S)) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        return false;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void draw(Canvas canvas) {
        if (this.f12876E != 0) {
            View contentView = getContentView();
            if (this.f12875D != null && contentView != null && contentView.getRight() < getWidth()) {
                this.f12875D.setBounds(contentView.getRight(), 0, getWidth(), getHeight());
                this.f12875D.draw(canvas);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.HorizontalScrollView
    public boolean executeKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (this.f12908y || !(keyCode == 21 || keyCode == 22)) {
            return super.executeKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.widget.HorizontalScrollView
    public void fling(int i7) {
        if (f12867b0) {
            P0.a.q(f12868c0, "fling[%d] velocityX %d", Integer.valueOf(getId()), Integer.valueOf(i7));
        }
        if (Build.VERSION.SDK_INT == 28) {
            i7 = (int) (Math.abs(i7) * Math.signum(this.f12897n.a()));
        }
        if (this.f12905v) {
            s(i7);
        } else if (this.f12898o != null) {
            this.f12898o.fling(getScrollX(), getScrollY(), i7, 0, 0, Api.BaseClientBuilder.API_PRIORITY_OTHER, 0, 0, ((getWidth() - androidx.core.view.H.G(this)) - androidx.core.view.H.F(this)) / 2, 0);
            androidx.core.view.H.g0(this);
        } else {
            super.fling(i7);
        }
        x(i7, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean getChildVisibleRect(View view, Rect rect, Point point) {
        return super.getChildVisibleRect(view, rect, point);
    }

    @Override // com.facebook.react.uimanager.K
    public void getClippingRect(Rect rect) {
        rect.set((Rect) O1.a.c(this.f12902s));
    }

    @Override // com.facebook.react.views.scroll.f.a
    public ValueAnimator getFlingAnimator() {
        return this.f12889R;
    }

    @Override // com.facebook.react.views.scroll.f.b
    public long getLastScrollDispatchTime() {
        return this.f12891T;
    }

    @Override // com.facebook.react.uimanager.O
    public String getOverflow() {
        return this.f12903t;
    }

    @Override // com.facebook.react.uimanager.P
    public Rect getOverflowInset() {
        return this.f12900q;
    }

    public H getPointerEvents() {
        return this.f12890S;
    }

    @Override // com.facebook.react.views.scroll.f.c
    public f.g getReactScrollViewScrollState() {
        return this.f12888Q;
    }

    @Override // com.facebook.react.uimanager.K
    public boolean getRemoveClippedSubviews() {
        return this.f12907x;
    }

    public boolean getScrollEnabled() {
        return this.f12908y;
    }

    @Override // com.facebook.react.views.scroll.f.b
    public int getScrollEventThrottle() {
        return this.f12892U;
    }

    @Override // com.facebook.react.views.scroll.f.e
    public InterfaceC0870d0 getStateWrapper() {
        return this.f12887P;
    }

    public void k() {
        OverScroller overScroller = this.f12898o;
        if (overScroller == null || overScroller.isFinished()) {
            return;
        }
        this.f12898o.abortAnimation();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f12907x) {
            updateClippingRect();
        }
        com.facebook.react.views.scroll.a aVar = this.f12894W;
        if (aVar != null) {
            aVar.f();
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewAdded(View view, View view2) {
        this.f12893V = view2;
        view2.addOnLayoutChangeListener(this);
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewRemoved(View view, View view2) {
        View view3 = this.f12893V;
        if (view3 != null) {
            view3.removeOnLayoutChangeListener(this);
        }
        this.f12893V = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.facebook.react.views.scroll.a aVar = this.f12894W;
        if (aVar != null) {
            aVar.g();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.f12883L.d(canvas);
        super.onDraw(canvas);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f12908y) {
            return false;
        }
        if (motionEvent.getAction() == 0 && p(this, motionEvent) != null) {
            return false;
        }
        if (!H.j(this.f12890S)) {
            return true;
        }
        try {
            if (super.onInterceptTouchEvent(motionEvent)) {
                w(motionEvent);
                return true;
            }
        } catch (IllegalArgumentException e7) {
            P0.a.H("ReactNative", "Error intercepting touch event.", e7);
        }
        return false;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        OverScroller overScroller;
        if (f12867b0) {
            P0.a.t(f12868c0, "onLayout[%d] l %d t %d r %d b %d", Integer.valueOf(getId()), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10));
        }
        int i11 = this.f12896m;
        if (i11 != f12869d0 && (overScroller = this.f12898o) != null && i11 != overScroller.getFinalX() && !this.f12898o.isFinished()) {
            if (f12867b0) {
                P0.a.q(f12868c0, "onLayout[%d] scroll hack enabled: reset to previous scrollX position of %d", Integer.valueOf(getId()), Integer.valueOf(this.f12896m));
            }
            OverScroller overScroller2 = this.f12898o;
            overScroller2.startScroll(this.f12896m, overScroller2.getFinalY(), 0, 0);
            this.f12898o.forceFinished(true);
            this.f12896m = f12869d0;
        }
        if (y()) {
            int scrollX = this.f12885N;
            if (scrollX == -1) {
                scrollX = getScrollX();
            }
            int scrollY = this.f12886O;
            if (scrollY == -1) {
                scrollY = getScrollY();
            }
            scrollTo(scrollX, scrollY);
        }
        f.a(this);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
        if (this.f12893V == null) {
            return;
        }
        if ((C1619a.d() ? view.getLayoutDirection() : this.f12888Q.d()) == 1) {
            l(i7, i9, i11, i13);
            return;
        }
        com.facebook.react.views.scroll.a aVar = this.f12894W;
        if (aVar != null) {
            aVar.h();
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i7, int i8) {
        OverScroller overScroller;
        A.a(i7, i8);
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i8);
        if (f12867b0) {
            P0.a.r(f12868c0, "onMeasure[%d] measured width: %d measured height: %d", Integer.valueOf(getId()), Integer.valueOf(size), Integer.valueOf(size2));
        }
        boolean z6 = getMeasuredHeight() != size2;
        setMeasuredDimension(size, size2);
        if (!z6 || (overScroller = this.f12898o) == null) {
            return;
        }
        this.f12896m = overScroller.getCurrX();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    protected void onOverScrolled(int i7, int i8, boolean z6, boolean z7) {
        int iMax;
        if (f12867b0) {
            P0.a.t(f12868c0, "onOverScrolled[%d] scrollX %d scrollY %d clampedX %b clampedY %b", Integer.valueOf(getId()), Integer.valueOf(i7), Integer.valueOf(i8), Boolean.valueOf(z6), Boolean.valueOf(z7));
        }
        OverScroller overScroller = this.f12898o;
        if (overScroller != null && !overScroller.isFinished() && this.f12898o.getCurrX() != this.f12898o.getFinalX() && i7 >= (iMax = Math.max(computeHorizontalScrollRange() - getWidth(), 0))) {
            this.f12898o.abortAnimation();
            i7 = iMax;
        }
        super.onOverScrolled(i7, i8, z6, z7);
    }

    @Override // android.view.View
    protected void onScrollChanged(int i7, int i8, int i9, int i10) {
        if (f12867b0) {
            P0.a.t(f12868c0, "onScrollChanged[%d] x %d y %d oldx %d oldy %d", Integer.valueOf(getId()), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10));
        }
        super.onScrollChanged(i7, i8, i9, i10);
        this.f12901r = true;
        if (this.f12897n.c(i7, i8)) {
            if (this.f12907x) {
                updateClippingRect();
            }
            if (this.f12909z) {
                return;
            }
            this.f12909z = true;
            f.s(this, this.f12897n.a(), this.f12897n.b(), this.f12872A);
            this.f12909z = false;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    protected void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        if (this.f12907x) {
            updateClippingRect();
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f12908y || !H.h(this.f12890S)) {
            return false;
        }
        this.f12899p.a(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 && this.f12904u) {
            f.q(this);
            float fB = this.f12899p.b();
            float fC = this.f12899p.c();
            f.c(this, fB, fC);
            m.a(this, motionEvent);
            this.f12904u = false;
            x(Math.round(fB), Math.round(fC));
        }
        if (actionMasked == 0) {
            m();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.HorizontalScrollView
    public boolean pageScroll(int i7) {
        boolean zPageScroll = super.pageScroll(i7);
        if (this.f12905v && zPageScroll) {
            x(0, 0);
        }
        return zPageScroll;
    }

    public void r() {
        awakenScrollBars();
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (view2 != null && !this.f12905v) {
            F(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void scrollTo(int i7, int i8) {
        if (f12867b0) {
            P0.a.r(f12868c0, "scrollTo[%d] x %d y %d", Integer.valueOf(getId()), Integer.valueOf(i7), Integer.valueOf(i8));
        }
        super.scrollTo(i7, i8);
        f.q(this);
        J(i7, i8);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i7) {
        this.f12883L.e(i7);
    }

    public void setBorderRadius(float f7) {
        this.f12883L.g(f7);
    }

    public void setBorderStyle(String str) {
        this.f12883L.i(str);
    }

    public void setDecelerationRate(float f7) {
        getReactScrollViewScrollState().i(f7);
        OverScroller overScroller = this.f12898o;
        if (overScroller != null) {
            overScroller.setFriction(1.0f - f7);
        }
    }

    public void setDisableIntervalMomentum(boolean z6) {
        this.f12877F = z6;
    }

    public void setEnableSyncOnScroll(boolean z6) {
        this.f12872A = z6;
    }

    public void setEndFillColor(int i7) {
        if (i7 != this.f12876E) {
            this.f12876E = i7;
            this.f12875D = new ColorDrawable(this.f12876E);
        }
    }

    @Override // com.facebook.react.views.scroll.f.b
    public void setLastScrollDispatchTime(long j7) {
        this.f12891T = j7;
    }

    public void setMaintainVisibleContentPosition(a.b bVar) {
        com.facebook.react.views.scroll.a aVar;
        if (bVar != null && this.f12894W == null) {
            com.facebook.react.views.scroll.a aVar2 = new com.facebook.react.views.scroll.a(this, true);
            this.f12894W = aVar2;
            aVar2.f();
        } else if (bVar == null && (aVar = this.f12894W) != null) {
            aVar.g();
            this.f12894W = null;
        }
        com.facebook.react.views.scroll.a aVar3 = this.f12894W;
        if (aVar3 != null) {
            aVar3.e(bVar);
        }
    }

    public void setOverflow(String str) {
        this.f12903t = str;
        com.facebook.react.views.view.g gVar = this.f12883L;
        if (str == null) {
            str = "scroll";
        }
        gVar.k(str);
    }

    @Override // com.facebook.react.uimanager.P
    public void setOverflowInset(int i7, int i8, int i9, int i10) {
        this.f12900q.set(i7, i8, i9, i10);
    }

    public void setPagingEnabled(boolean z6) {
        this.f12905v = z6;
    }

    public void setPointerEvents(H h7) {
        this.f12890S = h7;
    }

    public void setRemoveClippedSubviews(boolean z6) {
        if (z6 && this.f12902s == null) {
            this.f12902s = new Rect();
        }
        this.f12907x = z6;
        updateClippingRect();
    }

    public void setScrollEnabled(boolean z6) {
        this.f12908y = z6;
    }

    public void setScrollEventThrottle(int i7) {
        this.f12892U = i7;
    }

    public void setScrollPerfTag(String str) {
        this.f12874C = str;
    }

    public void setSendMomentumEvents(boolean z6) {
        this.f12873B = z6;
    }

    public void setSnapInterval(int i7) {
        this.f12878G = i7;
    }

    public void setSnapOffsets(List<Integer> list) {
        this.f12879H = list;
    }

    public void setSnapToAlignment(int i7) {
        this.f12882K = i7;
    }

    public void setSnapToEnd(boolean z6) {
        this.f12881J = z6;
    }

    public void setSnapToStart(boolean z6) {
        this.f12880I = z6;
    }

    public void setStateWrapper(InterfaceC0870d0 interfaceC0870d0) {
        this.f12887P = interfaceC0870d0;
    }

    public int t(int i7) {
        return f.n(this, i7, 0, Math.max(0, computeHorizontalScrollRange() - getWidth()), 0).x;
    }

    @Override // com.facebook.react.uimanager.K
    public void updateClippingRect() {
        if (this.f12907x) {
            O1.a.c(this.f12902s);
            L.a(this, this.f12902s);
            KeyEvent.Callback contentView = getContentView();
            if (contentView instanceof K) {
                ((K) contentView).updateClippingRect();
            }
        }
    }

    protected void w(MotionEvent motionEvent) {
        m.b(this, motionEvent);
        f.b(this);
        this.f12904u = true;
        o();
        getFlingAnimator().cancel();
    }
}
