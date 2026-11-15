package com.facebook.react.views.scroll;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.widget.OverScroller;
import androidx.appcompat.app.y;
import androidx.core.view.H;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.AbstractC0884k0;
import com.facebook.react.uimanager.G;
import com.facebook.react.uimanager.InterfaceC0870d0;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import w5.k;
import y2.C2239a;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f12962c = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f12965f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f12960a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f12961b = com.facebook.react.views.scroll.b.class.getSimpleName();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Set f12963d = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f12964e = 250;

    public interface a {
        void a(int i7, int i8);

        ValueAnimator getFlingAnimator();
    }

    public interface b {
        long getLastScrollDispatchTime();

        int getScrollEventThrottle();

        void setLastScrollDispatchTime(long j7);
    }

    public interface c {
        g getReactScrollViewScrollState();
    }

    public interface d {
        void b(int i7, int i8);

        void c(int i7, int i8);
    }

    public interface e {
        InterfaceC0870d0 getStateWrapper();
    }

    /* JADX INFO: renamed from: com.facebook.react.views.scroll.f$f, reason: collision with other inner class name */
    private static final class C0221f extends OverScroller {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f12966a;

        public C0221f(Context context) {
            super(context);
            this.f12966a = 250;
        }

        public final int a() {
            super.startScroll(0, 0, 0, 0);
            return this.f12966a;
        }

        @Override // android.widget.OverScroller
        public void startScroll(int i7, int i8, int i9, int i10, int i11) {
            this.f12966a = i11;
        }
    }

    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f12967a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f12969c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f12971e;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Point f12968b = new Point();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Point f12970d = new Point(-1, -1);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f12972f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private float f12973g = 0.985f;

        public g(int i7) {
            this.f12967a = i7;
        }

        public final float a() {
            return this.f12973g;
        }

        public final Point b() {
            return this.f12968b;
        }

        public final Point c() {
            return this.f12970d;
        }

        public final int d() {
            return this.f12967a;
        }

        public final int e() {
            return this.f12969c;
        }

        public final boolean f() {
            return this.f12971e;
        }

        public final boolean g() {
            return this.f12972f;
        }

        public final void h(boolean z6) {
            this.f12971e = z6;
        }

        public final void i(float f7) {
            this.f12973g = f7;
        }

        public final g j(int i7, int i8) {
            this.f12968b.set(i7, i8);
            return this;
        }

        public final void k(boolean z6) {
            this.f12972f = z6;
        }

        public final g l(int i7, int i8) {
            this.f12970d.set(i7, i8);
            return this;
        }

        public final void m(int i7) {
            this.f12969c = i7;
        }
    }

    public static final class h implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f12974a;

        h(ViewGroup viewGroup) {
            this.f12974a = viewGroup;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            k.f(animator, "animator");
            ((c) this.f12974a).getReactScrollViewScrollState().h(true);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            k.f(animator, "animator");
            ((c) this.f12974a).getReactScrollViewScrollState().k(true);
            f.q(this.f12974a);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            k.f(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            k.f(animator, "animator");
            g reactScrollViewScrollState = ((c) this.f12974a).getReactScrollViewScrollState();
            reactScrollViewScrollState.h(false);
            reactScrollViewScrollState.k(false);
        }
    }

    private f() {
    }

    public static final void a(ViewGroup viewGroup) {
        k.f(viewGroup, "scrollView");
        Iterator it = f12963d.iterator();
        if (it.hasNext()) {
            y.a(it.next());
            throw null;
        }
    }

    public static final void b(ViewGroup viewGroup) {
        f12960a.d(viewGroup, com.facebook.react.views.scroll.h.f12989n);
    }

    public static final void c(ViewGroup viewGroup, float f7, float f8) {
        f(f12960a, viewGroup, com.facebook.react.views.scroll.h.f12990o, f7, f8, false, 16, null);
    }

    private final void d(ViewGroup viewGroup, com.facebook.react.views.scroll.h hVar) {
        f(this, viewGroup, hVar, 0.0f, 0.0f, false, 16, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void e(ViewGroup viewGroup, com.facebook.react.views.scroll.h hVar, float f7, float f8, boolean z6) {
        View childAt;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (r3.getScrollEventThrottle() < Math.max(17L, jCurrentTimeMillis - ((b) viewGroup).getLastScrollDispatchTime()) && (childAt = viewGroup.getChildAt(0)) != null) {
            Iterator it = f12963d.iterator();
            if (it.hasNext()) {
                y.a(it.next());
                throw null;
            }
            Context context = viewGroup.getContext();
            k.d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            ReactContext reactContext = (ReactContext) context;
            int iE = AbstractC0884k0.e(reactContext);
            com.facebook.react.uimanager.events.e eVarC = AbstractC0884k0.c(reactContext, viewGroup.getId());
            if (eVarC != null) {
                eVarC.c(com.facebook.react.views.scroll.g.f12975k.a(iE, viewGroup.getId(), hVar, viewGroup.getScrollX(), viewGroup.getScrollY(), f7, f8, childAt.getWidth(), childAt.getHeight(), viewGroup.getWidth(), viewGroup.getHeight(), z6));
                ((b) viewGroup).setLastScrollDispatchTime(jCurrentTimeMillis);
            }
        }
    }

    static /* synthetic */ void f(f fVar, ViewGroup viewGroup, com.facebook.react.views.scroll.h hVar, float f7, float f8, boolean z6, int i7, Object obj) {
        if ((i7 & 16) != 0) {
            z6 = false;
        }
        fVar.e(viewGroup, hVar, f7, f8, z6);
    }

    public static final void g(ViewGroup viewGroup, int i7, int i8) {
        f(f12960a, viewGroup, com.facebook.react.views.scroll.h.f12992q, i7, i8, false, 16, null);
    }

    public static final void h(ViewGroup viewGroup) {
        f12960a.d(viewGroup, com.facebook.react.views.scroll.h.f12993r);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void i(ViewGroup viewGroup) {
        int i7;
        g reactScrollViewScrollState = ((c) viewGroup).getReactScrollViewScrollState();
        int iE = reactScrollViewScrollState.e();
        Point pointC = reactScrollViewScrollState.c();
        int i8 = pointC.x;
        int i9 = pointC.y;
        if (reactScrollViewScrollState.d() == 1) {
            View childAt = viewGroup.getChildAt(0);
            i7 = -(((childAt != null ? childAt.getWidth() : 0) - i8) - viewGroup.getWidth());
        } else {
            i7 = i8;
        }
        if (f12962c) {
            P0.a.s(f12961b, "updateFabricScrollState[%d] scrollX %d scrollY %d fabricScrollX", Integer.valueOf(viewGroup.getId()), Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i7));
        }
        InterfaceC0870d0 stateWrapper = ((e) viewGroup).getStateWrapper();
        if (stateWrapper != null) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble("contentOffsetLeft", G.b(i8));
            writableNativeMap.putDouble("contentOffsetTop", G.b(i9));
            writableNativeMap.putDouble("scrollAwayPaddingTop", G.b(iE));
            stateWrapper.a(writableNativeMap);
        }
    }

    public static final int j(Context context) {
        if (!f12965f) {
            f12965f = true;
            try {
                f12964e = new C0221f(context).a();
            } catch (Throwable unused) {
            }
        }
        return f12964e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int k(ViewGroup viewGroup, int i7, int i8, int i9) {
        g reactScrollViewScrollState = ((c) viewGroup).getReactScrollViewScrollState();
        return (!reactScrollViewScrollState.g() || (reactScrollViewScrollState.f() && ((i9 != 0 ? i9 / Math.abs(i9) : 0) * (i8 - i7) > 0))) ? i8 : i7;
    }

    public static final int l(String str) {
        if (str == null) {
            return 1;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != -1414557169) {
            if (iHashCode != 3005871) {
                if (iHashCode == 104712844 && str.equals("never")) {
                    return 2;
                }
            } else if (str.equals("auto")) {
                return 1;
            }
        } else if (str.equals("always")) {
            return 0;
        }
        P0.a.G("ReactNative", "wrong overScrollMode: " + str);
        return 1;
    }

    public static final int m(String str) {
        if (str == null) {
            return 0;
        }
        if (F5.g.p("start", str, true)) {
            return 1;
        }
        if (F5.g.p("center", str, true)) {
            return 2;
        }
        if (k.b("end", str)) {
            return 3;
        }
        P0.a.G("ReactNative", "wrong snap alignment value: " + str);
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Point n(ViewGroup viewGroup, int i7, int i8, int i9, int i10) {
        g reactScrollViewScrollState = ((c) viewGroup).getReactScrollViewScrollState();
        OverScroller overScroller = new OverScroller(viewGroup.getContext());
        overScroller.setFriction(1.0f - reactScrollViewScrollState.a());
        int width = (viewGroup.getWidth() - H.G(viewGroup)) - H.F(viewGroup);
        int height = (viewGroup.getHeight() - viewGroup.getPaddingBottom()) - viewGroup.getPaddingTop();
        Point pointB = reactScrollViewScrollState.b();
        overScroller.fling(k(viewGroup, viewGroup.getScrollX(), pointB.x, i7), k(viewGroup, viewGroup.getScrollY(), pointB.y, i8), i7, i8, 0, i9, 0, i10, width / 2, height / 2);
        return new Point(overScroller.getFinalX(), overScroller.getFinalY());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void p(ViewGroup viewGroup, int i7, int i8) {
        if (f12962c) {
            P0.a.r(f12961b, "smoothScrollTo[%d] x %d y %d", Integer.valueOf(viewGroup.getId()), Integer.valueOf(i7), Integer.valueOf(i8));
        }
        ValueAnimator flingAnimator = ((a) viewGroup).getFlingAnimator();
        if (flingAnimator.getListeners() == null || flingAnimator.getListeners().size() == 0) {
            f12960a.o(viewGroup);
        }
        ((c) viewGroup).getReactScrollViewScrollState().j(i7, i8);
        int scrollX = viewGroup.getScrollX();
        int scrollY = viewGroup.getScrollY();
        if (scrollX != i7) {
            ((a) viewGroup).a(scrollX, i7);
        }
        if (scrollY != i8) {
            ((a) viewGroup).a(scrollY, i8);
        }
        f12960a.r(viewGroup, i7, i8);
    }

    public static final void q(ViewGroup viewGroup) {
        f12960a.r(viewGroup, viewGroup.getScrollX(), viewGroup.getScrollY());
    }

    public static final void s(ViewGroup viewGroup, float f7, float f8, boolean z6) {
        q(viewGroup);
        f12960a.e(viewGroup, com.facebook.react.views.scroll.h.f12991p, f7, f8, z6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o(ViewGroup viewGroup) {
        ((a) viewGroup).getFlingAnimator().addListener(new h(viewGroup));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r(ViewGroup viewGroup, int i7, int i8) {
        if (f12962c) {
            P0.a.r(f12961b, "updateFabricScrollState[%d] scrollX %d scrollY %d", Integer.valueOf(viewGroup.getId()), Integer.valueOf(i7), Integer.valueOf(i8));
        }
        if (C2239a.a(viewGroup.getId()) == 1) {
            return;
        }
        g reactScrollViewScrollState = ((c) viewGroup).getReactScrollViewScrollState();
        if (reactScrollViewScrollState.c().equals(i7, i8)) {
            return;
        }
        reactScrollViewScrollState.l(i7, i8);
        i(viewGroup);
    }
}
