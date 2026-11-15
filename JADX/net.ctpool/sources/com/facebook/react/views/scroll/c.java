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
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.OverScroller;
import android.widget.ScrollView;
import com.facebook.react.AbstractC0831n;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.A;
import com.facebook.react.uimanager.G;
import com.facebook.react.uimanager.H;
import com.facebook.react.uimanager.InterfaceC0870d0;
import com.facebook.react.uimanager.K;
import com.facebook.react.uimanager.L;
import com.facebook.react.uimanager.P;
import com.facebook.react.uimanager.events.m;
import com.facebook.react.views.scroll.a;
import com.facebook.react.views.scroll.f;
import com.google.android.gms.common.api.Api;
import java.lang.reflect.Field;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class c extends ScrollView implements K, ViewGroup.OnHierarchyChangeListener, View.OnLayoutChangeListener, P, f.c, f.e, f.a, f.b, f.d {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static Field f12913a0 = null;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static boolean f12914b0 = false;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f12915A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private String f12916B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f12917C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private Drawable f12918D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f12919E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private boolean f12920F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f12921G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private List f12922H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f12923I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f12924J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private int f12925K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private View f12926L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private com.facebook.react.views.view.g f12927M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private ReadableMap f12928N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f12929O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private int f12930P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private InterfaceC0870d0 f12931Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private final f.g f12932R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final ValueAnimator f12933S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private H f12934T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private long f12935U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private int f12936V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private com.facebook.react.views.scroll.a f12937W;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final K2.b f12938m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final OverScroller f12939n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final i f12940o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Rect f12941p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Rect f12942q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f12943r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Rect f12944s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f12945t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f12946u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f12947v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Runnable f12948w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f12949x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f12950y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f12951z;

    class a implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f12952m = false;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f12953n = 0;

        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (c.this.f12943r) {
                c.this.f12943r = false;
                this.f12953n = 0;
            } else {
                f.q(c.this);
                int i7 = this.f12953n + 1;
                this.f12953n = i7;
                if (i7 >= 3) {
                    c.this.f12948w = null;
                    if (c.this.f12915A) {
                        f.h(c.this);
                    }
                    c.this.n();
                    return;
                }
                if (c.this.f12947v && !this.f12952m) {
                    this.f12952m = true;
                    c.this.q(0);
                }
            }
            androidx.core.view.H.i0(c.this, this, 20L);
        }
    }

    public c(Context context, K2.a aVar) {
        super(context);
        this.f12938m = new K2.b();
        this.f12940o = new i();
        this.f12941p = new Rect();
        this.f12942q = new Rect();
        this.f12945t = "hidden";
        this.f12947v = false;
        this.f12950y = true;
        this.f12951z = false;
        this.f12917C = false;
        this.f12919E = 0;
        this.f12920F = false;
        this.f12921G = 0;
        this.f12923I = true;
        this.f12924J = true;
        this.f12925K = 0;
        this.f12928N = null;
        this.f12929O = -1;
        this.f12930P = -1;
        this.f12931Q = null;
        this.f12932R = new f.g(0);
        this.f12933S = ObjectAnimator.ofInt(this, "scrollY", 0, 0);
        this.f12934T = H.f12293q;
        this.f12935U = 0L;
        this.f12936V = 0;
        this.f12937W = null;
        this.f12927M = new com.facebook.react.views.view.g(this);
        this.f12939n = getOverScrollerFromParent();
        setOnHierarchyChangeListener(this);
        setScrollBarStyle(33554432);
        setClipChildren(false);
        this.f12927M.k("scroll");
        androidx.core.view.H.p0(this, new d());
    }

    private void A(int i7) {
        if (getFlingAnimator().isRunning()) {
            getFlingAnimator().cancel();
        }
        OverScroller overScroller = this.f12939n;
        if (overScroller == null || overScroller.isFinished()) {
            return;
        }
        int currY = this.f12939n.getCurrY();
        boolean zComputeScrollOffset = this.f12939n.computeScrollOffset();
        this.f12939n.forceFinished(true);
        if (!zComputeScrollOffset) {
            scrollTo(getScrollX(), i7 + (this.f12939n.getCurrX() - currY));
            return;
        }
        this.f12939n.fling(getScrollX(), i7, 0, (int) (this.f12939n.getCurrVelocity() * Math.signum(this.f12939n.getFinalY() - this.f12939n.getStartY())), 0, 0, 0, Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    private void B(View view) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        int iComputeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(rect);
        if (iComputeScrollDeltaToGetChildRectOnScreen != 0) {
            scrollBy(0, iComputeScrollDeltaToGetChildRectOnScreen);
        }
    }

    private void F(int i7, int i8) {
        if (w()) {
            this.f12929O = -1;
            this.f12930P = -1;
        } else {
            this.f12929O = i7;
            this.f12930P = i8;
        }
    }

    private void G(int i7) {
        double snapInterval = getSnapInterval();
        double dK = f.k(this, getScrollY(), getReactScrollViewScrollState().b().y, i7);
        double dZ = z(i7);
        double d7 = dK / snapInterval;
        int iFloor = (int) Math.floor(d7);
        int iCeil = (int) Math.ceil(d7);
        int iRound = (int) Math.round(d7);
        int iRound2 = (int) Math.round(dZ / snapInterval);
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
            this.f12943r = true;
            c(getScrollX(), (int) d8);
        }
    }

    private void H(int i7) {
        getReactScrollViewScrollState().m(i7);
        f.i(this);
    }

    private View getContentView() {
        return getChildAt(0);
    }

    private int getMaxScrollY() {
        View view = this.f12926L;
        return Math.max(0, (view == null ? 0 : view.getHeight()) - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
    }

    private OverScroller getOverScrollerFromParent() {
        if (!f12914b0) {
            f12914b0 = true;
            try {
                Field declaredField = ScrollView.class.getDeclaredField("mScroller");
                f12913a0 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                P0.a.G("ReactNative", "Failed to get mScroller field for ScrollView! This app will exhibit the bounce-back scrolling bug :(");
            }
        }
        Field field = f12913a0;
        OverScroller overScroller = null;
        if (field != null) {
            try {
                Object obj = field.get(this);
                if (obj instanceof OverScroller) {
                    overScroller = (OverScroller) obj;
                } else {
                    P0.a.G("ReactNative", "Failed to cast mScroller field in ScrollView (probably due to OEM changes to AOSP)! This app will exhibit the bounce-back scrolling bug :(");
                }
            } catch (IllegalAccessException e7) {
                throw new RuntimeException("Failed to get mScroller from ScrollView!", e7);
            }
        }
        return overScroller;
    }

    private int getSnapInterval() {
        int i7 = this.f12921G;
        return i7 != 0 ? i7 : getHeight();
    }

    private void l() {
        Runnable runnable = this.f12948w;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f12948w = null;
            getFlingAnimator().cancel();
        }
    }

    private int m(int i7) {
        if (Build.VERSION.SDK_INT != 28) {
            return i7;
        }
        float fSignum = Math.signum(this.f12938m.b());
        if (fSignum == 0.0f) {
            fSignum = Math.signum(i7);
        }
        return (int) (Math.abs(i7) * fSignum);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        if (y()) {
            O1.a.c(null);
            O1.a.c(this.f12916B);
            throw null;
        }
    }

    private void o() {
        if (y()) {
            O1.a.c(null);
            O1.a.c(this.f12916B);
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0188  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void q(int i7) {
        int iMin;
        int iIntValue;
        int iMax;
        int iIntValue2;
        int top;
        int top2;
        int height;
        int scrollY;
        OverScroller overScroller;
        if (getChildCount() <= 0) {
            return;
        }
        if (this.f12921G == 0 && this.f12922H == null && this.f12925K == 0) {
            G(i7);
            return;
        }
        int i8 = 1;
        boolean z6 = getFlingAnimator() != this.f12933S;
        int maxScrollY = getMaxScrollY();
        int iZ = z(i7);
        if (this.f12920F) {
            iZ = getScrollY();
        }
        int height2 = (getHeight() - getPaddingBottom()) - getPaddingTop();
        List list = this.f12922H;
        if (list != null) {
            iIntValue2 = ((Integer) list.get(0)).intValue();
            List list2 = this.f12922H;
            iIntValue = ((Integer) list2.get(list2.size() - 1)).intValue();
            iMin = maxScrollY;
            iMax = 0;
            for (int i9 = 0; i9 < this.f12922H.size(); i9++) {
                int iIntValue3 = ((Integer) this.f12922H.get(i9)).intValue();
                if (iIntValue3 <= iZ && iZ - iIntValue3 < iZ - iMax) {
                    iMax = iIntValue3;
                }
                if (iIntValue3 >= iZ && iIntValue3 - iZ < iMin - iZ) {
                    iMin = iIntValue3;
                }
            }
        } else {
            int i10 = this.f12925K;
            if (i10 != 0) {
                int i11 = this.f12921G;
                if (i11 > 0) {
                    double d7 = ((double) iZ) / ((double) i11);
                    double dFloor = Math.floor(d7);
                    int i12 = this.f12921G;
                    int iMax2 = Math.max(s(i10, (int) (dFloor * ((double) i12)), i12, height2), 0);
                    int i13 = this.f12925K;
                    double dCeil = Math.ceil(d7);
                    int i14 = this.f12921G;
                    iMin = Math.min(s(i13, (int) (dCeil * ((double) i14)), i14, height2), maxScrollY);
                    iIntValue = maxScrollY;
                    iMax = iMax2;
                } else {
                    ViewGroup viewGroup = (ViewGroup) getContentView();
                    int iMin2 = maxScrollY;
                    int i15 = iMin2;
                    int i16 = 0;
                    int i17 = 0;
                    int iMax3 = 0;
                    while (i16 < viewGroup.getChildCount()) {
                        View childAt = viewGroup.getChildAt(i16);
                        int i18 = this.f12925K;
                        if (i18 != i8) {
                            if (i18 == 2) {
                                top2 = childAt.getTop();
                                height = (height2 - childAt.getHeight()) / 2;
                            } else {
                                if (i18 != 3) {
                                    throw new IllegalStateException("Invalid SnapToAlignment value: " + this.f12925K);
                                }
                                top2 = childAt.getTop();
                                height = height2 - childAt.getHeight();
                            }
                            top = top2 - height;
                        } else {
                            top = childAt.getTop();
                        }
                        if (top <= iZ && iZ - top < iZ - i17) {
                            i17 = top;
                        }
                        if (top >= iZ && top - iZ < i15 - iZ) {
                            i15 = top;
                        }
                        iMin2 = Math.min(iMin2, top);
                        iMax3 = Math.max(iMax3, top);
                        i16++;
                        i8 = 1;
                    }
                    iMax = Math.max(i17, iMin2);
                    iMin = Math.min(i15, iMax3);
                    iIntValue = maxScrollY;
                }
            } else {
                double snapInterval = getSnapInterval();
                double d8 = ((double) iZ) / snapInterval;
                int iFloor = (int) (Math.floor(d8) * snapInterval);
                iMin = Math.min((int) (Math.ceil(d8) * snapInterval), maxScrollY);
                iIntValue = maxScrollY;
                iMax = iFloor;
            }
            iIntValue2 = 0;
        }
        int i19 = iZ - iMax;
        int i20 = iMin - iZ;
        int i21 = Math.abs(i19) < Math.abs(i20) ? iMax : iMin;
        if (this.f12924J || iZ < iIntValue) {
            if (this.f12923I || iZ > iIntValue2) {
                if (i7 > 0) {
                    scrollY = !z6 ? i7 + ((int) (((double) i20) * 10.0d)) : i7;
                    iZ = iMin;
                } else if (i7 < 0) {
                    scrollY = !z6 ? i7 - ((int) (((double) i19) * 10.0d)) : i7;
                    iZ = iMax;
                } else {
                    scrollY = i7;
                    iZ = i21;
                }
            } else if (getScrollY() <= iIntValue2) {
                scrollY = i7;
            } else {
                scrollY = i7;
                iZ = iIntValue2;
            }
        } else if (getScrollY() < iIntValue) {
            scrollY = i7;
            iZ = iIntValue;
        }
        int iMin3 = Math.min(Math.max(0, iZ), maxScrollY);
        if (z6 || (overScroller = this.f12939n) == null) {
            c(getScrollX(), iMin3);
            return;
        }
        this.f12943r = true;
        int scrollX = getScrollX();
        int scrollY2 = getScrollY();
        if (scrollY == 0) {
            scrollY = iMin3 - getScrollY();
        }
        overScroller.fling(scrollX, scrollY2, 0, scrollY, 0, 0, iMin3, iMin3, 0, (iMin3 == 0 || iMin3 == maxScrollY) ? height2 / 2 : 0);
        postInvalidateOnAnimation();
    }

    private int s(int i7, int i8, int i9, int i10) {
        int i11;
        if (i7 == 1) {
            return i8;
        }
        if (i7 == 2) {
            i11 = (i10 - i9) / 2;
        } else {
            if (i7 != 3) {
                throw new IllegalStateException("Invalid SnapToAlignment value: " + this.f12925K);
            }
            i11 = i10 - i9;
        }
        return i8 - i11;
    }

    private int t(View view) {
        view.getDrawingRect(this.f12941p);
        offsetDescendantRectToMyCoords(view, this.f12941p);
        return computeScrollDeltaToGetChildRectOnScreen(this.f12941p);
    }

    private void v(int i7, int i8) {
        if (this.f12948w != null) {
            return;
        }
        if (this.f12915A) {
            o();
            f.g(this, i7, i8);
        }
        this.f12943r = false;
        a aVar = new a();
        this.f12948w = aVar;
        androidx.core.view.H.i0(this, aVar, 20L);
    }

    private boolean w() {
        View contentView = getContentView();
        return (contentView == null || contentView.getWidth() == 0 || contentView.getHeight() == 0) ? false : true;
    }

    private boolean y() {
        return false;
    }

    private int z(int i7) {
        if (getFlingAnimator() == this.f12933S) {
            return f.n(this, 0, i7, 0, getMaxScrollY()).y;
        }
        return r(i7) + f.k(this, getScrollY(), getReactScrollViewScrollState().b().y, i7);
    }

    public void C(int i7, float f7, float f8) {
        this.f12927M.f(i7, f7, f8);
    }

    public void D(float f7, int i7) {
        this.f12927M.h(f7, i7);
    }

    public void E(int i7, float f7) {
        this.f12927M.j(i7, f7);
    }

    @Override // com.facebook.react.views.scroll.f.a
    public void a(int i7, int i8) {
        this.f12933S.cancel();
        this.f12933S.setDuration(f.j(getContext())).setIntValues(i7, i8);
        this.f12933S.start();
    }

    @Override // com.facebook.react.views.scroll.f.d
    public void b(int i7, int i8) {
        scrollTo(i7, i8);
        A(i8);
    }

    @Override // com.facebook.react.views.scroll.f.d
    public void c(int i7, int i8) {
        f.p(this, i7, i8);
        F(i7, i8);
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if (H.j(this.f12934T)) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        return false;
    }

    @Override // android.widget.ScrollView, android.view.View
    public void draw(Canvas canvas) {
        if (this.f12919E != 0) {
            View contentView = getContentView();
            if (this.f12918D != null && contentView != null && contentView.getBottom() < getHeight()) {
                this.f12918D.setBounds(0, contentView.getBottom(), getWidth(), getHeight());
                this.f12918D.draw(canvas);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.ScrollView
    public boolean executeKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (this.f12950y || !(keyCode == 19 || keyCode == 20)) {
            return super.executeKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.widget.ScrollView
    public void fling(int i7) {
        int iM = m(i7);
        if (this.f12947v) {
            q(iM);
        } else if (this.f12939n != null) {
            this.f12939n.fling(getScrollX(), getScrollY(), 0, iM, 0, 0, 0, Api.BaseClientBuilder.API_PRIORITY_OTHER, 0, ((getHeight() - getPaddingBottom()) - getPaddingTop()) / 2);
            androidx.core.view.H.g0(this);
        } else {
            super.fling(iM);
        }
        v(0, iM);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean getChildVisibleRect(View view, Rect rect, Point point) {
        return super.getChildVisibleRect(view, rect, point);
    }

    @Override // com.facebook.react.uimanager.K
    public void getClippingRect(Rect rect) {
        rect.set((Rect) O1.a.c(this.f12944s));
    }

    @Override // com.facebook.react.views.scroll.f.a
    public ValueAnimator getFlingAnimator() {
        return this.f12933S;
    }

    @Override // com.facebook.react.views.scroll.f.b
    public long getLastScrollDispatchTime() {
        return this.f12935U;
    }

    @Override // com.facebook.react.uimanager.O
    public String getOverflow() {
        return this.f12945t;
    }

    @Override // com.facebook.react.uimanager.P
    public Rect getOverflowInset() {
        return this.f12942q;
    }

    public H getPointerEvents() {
        return this.f12934T;
    }

    @Override // com.facebook.react.views.scroll.f.c
    public f.g getReactScrollViewScrollState() {
        return this.f12932R;
    }

    @Override // com.facebook.react.uimanager.K
    public boolean getRemoveClippedSubviews() {
        return this.f12949x;
    }

    public boolean getScrollEnabled() {
        return this.f12950y;
    }

    @Override // com.facebook.react.views.scroll.f.b
    public int getScrollEventThrottle() {
        return this.f12936V;
    }

    @Override // com.facebook.react.views.scroll.f.e
    public InterfaceC0870d0 getStateWrapper() {
        return this.f12931Q;
    }

    public void k() {
        OverScroller overScroller = this.f12939n;
        if (overScroller == null || overScroller.isFinished()) {
            return;
        }
        this.f12939n.abortAnimation();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f12949x) {
            updateClippingRect();
        }
        com.facebook.react.views.scroll.a aVar = this.f12937W;
        if (aVar != null) {
            aVar.f();
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewAdded(View view, View view2) {
        this.f12926L = view2;
        view2.addOnLayoutChangeListener(this);
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewRemoved(View view, View view2) {
        View view3 = this.f12926L;
        if (view3 != null) {
            view3.removeOnLayoutChangeListener(this);
            this.f12926L = null;
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.facebook.react.views.scroll.a aVar = this.f12937W;
        if (aVar != null) {
            aVar.g();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.f12927M.d(canvas);
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String str = (String) getTag(AbstractC0831n.f11987q);
        if (str != null) {
            accessibilityNodeInfo.setViewIdResourceName(str);
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f12950y) {
            return false;
        }
        if (!H.j(this.f12934T)) {
            return true;
        }
        try {
            if (super.onInterceptTouchEvent(motionEvent)) {
                u(motionEvent);
                return true;
            }
        } catch (IllegalArgumentException e7) {
            P0.a.H("ReactNative", "Error intercepting touch event.", e7);
        }
        return false;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        if (w()) {
            int scrollX = this.f12929O;
            if (scrollX == -1) {
                scrollX = getScrollX();
            }
            int scrollY = this.f12930P;
            if (scrollY == -1) {
                scrollY = getScrollY();
            }
            scrollTo(scrollX, scrollY);
        }
        f.a(this);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
        if (this.f12926L == null) {
            return;
        }
        com.facebook.react.views.scroll.a aVar = this.f12937W;
        if (aVar != null) {
            aVar.h();
        }
        if (isShown() && w()) {
            int scrollY = getScrollY();
            int maxScrollY = getMaxScrollY();
            if (scrollY > maxScrollY) {
                scrollTo(getScrollX(), maxScrollY);
            }
        }
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i7, int i8) {
        A.a(i7, i8);
        setMeasuredDimension(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i8));
    }

    @Override // android.widget.ScrollView, android.view.View
    protected void onOverScrolled(int i7, int i8, boolean z6, boolean z7) {
        int maxScrollY;
        OverScroller overScroller = this.f12939n;
        if (overScroller != null && this.f12926L != null && !overScroller.isFinished() && this.f12939n.getCurrY() != this.f12939n.getFinalY() && i8 >= (maxScrollY = getMaxScrollY())) {
            this.f12939n.abortAnimation();
            i8 = maxScrollY;
        }
        super.onOverScrolled(i7, i8, z6, z7);
    }

    @Override // android.view.View
    protected void onScrollChanged(int i7, int i8, int i9, int i10) {
        super.onScrollChanged(i7, i8, i9, i10);
        this.f12943r = true;
        if (this.f12938m.c(i7, i8)) {
            if (this.f12949x) {
                updateClippingRect();
            }
            if (this.f12951z) {
                return;
            }
            this.f12951z = true;
            f.s(this, this.f12938m.a(), this.f12938m.b(), this.f12917C);
            this.f12951z = false;
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    protected void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        if (this.f12949x) {
            updateClippingRect();
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f12950y || !H.h(this.f12934T)) {
            return false;
        }
        this.f12940o.a(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 && this.f12946u) {
            f.q(this);
            float fB = this.f12940o.b();
            float fC = this.f12940o.c();
            f.c(this, fB, fC);
            m.a(this, motionEvent);
            this.f12946u = false;
            v(Math.round(fB), Math.round(fC));
        }
        if (actionMasked == 0) {
            l();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void p() {
        awakenScrollBars();
    }

    public int r(int i7) {
        return f.n(this, 0, i7, 0, getMaxScrollY()).y;
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (view2 != null) {
            B(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.widget.ScrollView, android.view.View
    public void scrollTo(int i7, int i8) {
        super.scrollTo(i7, i8);
        f.q(this);
        F(i7, i8);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i7) {
        this.f12927M.e(i7);
    }

    public void setBorderRadius(float f7) {
        this.f12927M.g(f7);
    }

    public void setBorderStyle(String str) {
        this.f12927M.i(str);
    }

    public void setContentOffset(ReadableMap readableMap) {
        ReadableMap readableMap2 = this.f12928N;
        if (readableMap2 == null || !readableMap2.equals(readableMap)) {
            this.f12928N = readableMap;
            if (readableMap != null) {
                scrollTo((int) G.c(readableMap.hasKey("x") ? readableMap.getDouble("x") : 0.0d), (int) G.c(readableMap.hasKey("y") ? readableMap.getDouble("y") : 0.0d));
            } else {
                scrollTo(0, 0);
            }
        }
    }

    public void setDecelerationRate(float f7) {
        getReactScrollViewScrollState().i(f7);
        OverScroller overScroller = this.f12939n;
        if (overScroller != null) {
            overScroller.setFriction(1.0f - f7);
        }
    }

    public void setDisableIntervalMomentum(boolean z6) {
        this.f12920F = z6;
    }

    public void setEnableSyncOnScroll(boolean z6) {
        this.f12917C = z6;
    }

    public void setEndFillColor(int i7) {
        if (i7 != this.f12919E) {
            this.f12919E = i7;
            this.f12918D = new ColorDrawable(this.f12919E);
        }
    }

    @Override // com.facebook.react.views.scroll.f.b
    public void setLastScrollDispatchTime(long j7) {
        this.f12935U = j7;
    }

    public void setMaintainVisibleContentPosition(a.b bVar) {
        com.facebook.react.views.scroll.a aVar;
        if (bVar != null && this.f12937W == null) {
            com.facebook.react.views.scroll.a aVar2 = new com.facebook.react.views.scroll.a(this, false);
            this.f12937W = aVar2;
            aVar2.f();
        } else if (bVar == null && (aVar = this.f12937W) != null) {
            aVar.g();
            this.f12937W = null;
        }
        com.facebook.react.views.scroll.a aVar3 = this.f12937W;
        if (aVar3 != null) {
            aVar3.e(bVar);
        }
    }

    public void setOverflow(String str) {
        this.f12945t = str;
        com.facebook.react.views.view.g gVar = this.f12927M;
        if (str == null) {
            str = "scroll";
        }
        gVar.k(str);
    }

    @Override // com.facebook.react.uimanager.P
    public void setOverflowInset(int i7, int i8, int i9, int i10) {
        this.f12942q.set(i7, i8, i9, i10);
    }

    public void setPagingEnabled(boolean z6) {
        this.f12947v = z6;
    }

    public void setPointerEvents(H h7) {
        this.f12934T = h7;
    }

    public void setRemoveClippedSubviews(boolean z6) {
        if (z6 && this.f12944s == null) {
            this.f12944s = new Rect();
        }
        this.f12949x = z6;
        updateClippingRect();
    }

    public void setScrollAwayTopPaddingEnabledUnstable(int i7) {
        int childCount = getChildCount();
        O1.a.b(childCount <= 1, "React Native ScrollView should not have more than one child, it should have exactly 1 child; a content View");
        if (childCount > 0) {
            for (int i8 = 0; i8 < childCount; i8++) {
                getChildAt(i8).setTranslationY(i7);
            }
            setPadding(0, 0, 0, i7);
        }
        H(i7);
        setRemoveClippedSubviews(this.f12949x);
    }

    public void setScrollEnabled(boolean z6) {
        this.f12950y = z6;
    }

    public void setScrollEventThrottle(int i7) {
        this.f12936V = i7;
    }

    public void setScrollPerfTag(String str) {
        this.f12916B = str;
    }

    public void setSendMomentumEvents(boolean z6) {
        this.f12915A = z6;
    }

    public void setSnapInterval(int i7) {
        this.f12921G = i7;
    }

    public void setSnapOffsets(List<Integer> list) {
        this.f12922H = list;
    }

    public void setSnapToAlignment(int i7) {
        this.f12925K = i7;
    }

    public void setSnapToEnd(boolean z6) {
        this.f12924J = z6;
    }

    public void setSnapToStart(boolean z6) {
        this.f12923I = z6;
    }

    public void setStateWrapper(InterfaceC0870d0 interfaceC0870d0) {
        this.f12931Q = interfaceC0870d0;
    }

    protected void u(MotionEvent motionEvent) {
        m.b(this, motionEvent);
        f.b(this);
        this.f12946u = true;
        o();
        getFlingAnimator().cancel();
    }

    @Override // com.facebook.react.uimanager.K
    public void updateClippingRect() {
        if (this.f12949x) {
            O1.a.c(this.f12944s);
            L.a(this, this.f12944s);
            KeyEvent.Callback contentView = getContentView();
            if (contentView instanceof K) {
                ((K) contentView).updateClippingRect();
            }
        }
    }

    boolean x(View view) {
        int iT = t(view);
        view.getDrawingRect(this.f12941p);
        return iT != 0 && Math.abs(iT) < this.f12941p.width();
    }
}
