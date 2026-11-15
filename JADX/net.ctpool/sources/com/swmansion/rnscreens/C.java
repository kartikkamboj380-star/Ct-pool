package com.swmansion.rnscreens;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.core.view.T;
import androidx.core.view.U;
import androidx.core.view.v0;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.google.android.gms.common.ConnectionResult;
import com.swmansion.rnscreens.C;
import com.swmansion.rnscreens.C1599l;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C f18332a = new C();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f18333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f18334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f18335d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Integer f18336e;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18337a;

        static {
            int[] iArr = new int[C1599l.e.values().length];
            try {
                iArr[C1599l.e.f18459m.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C1599l.e.f18460n.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C1599l.e.f18461o.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C1599l.e.f18462p.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[C1599l.e.f18463q.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[C1599l.e.f18464r.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[C1599l.e.f18465s.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[C1599l.e.f18466t.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[C1599l.e.f18467u.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f18337a = iArr;
        }
    }

    public static final class b extends GuardedRunnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ Activity f18338m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Integer f18339n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f18340o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Activity activity, Integer num, boolean z6, JSExceptionHandler jSExceptionHandler) {
            super(jSExceptionHandler);
            this.f18338m = activity;
            this.f18339n = num;
            this.f18340o = z6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(Window window, ValueAnimator valueAnimator) {
            w5.k.f(valueAnimator, "animator");
            Object animatedValue = valueAnimator.getAnimatedValue();
            w5.k.d(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            window.setStatusBarColor(((Integer) animatedValue).intValue());
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            final Window window = this.f18338m.getWindow();
            ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(window.getStatusBarColor()), this.f18339n);
            valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.swmansion.rnscreens.D
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C.b.b(window, valueAnimator);
                }
            });
            if (this.f18340o) {
                valueAnimatorOfObject.setDuration(300L).setStartDelay(0L);
            } else {
                valueAnimatorOfObject.setDuration(0L).setStartDelay(300L);
            }
            valueAnimatorOfObject.start();
        }
    }

    public static final class c extends GuardedRunnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ Activity f18341m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f18342n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Activity activity, boolean z6, JSExceptionHandler jSExceptionHandler) {
            super(jSExceptionHandler);
            this.f18341m = activity;
            this.f18342n = z6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final U b(View view, U u6) {
            w5.k.f(view, "v");
            w5.k.f(u6, "insets");
            U uB0 = androidx.core.view.H.b0(view, u6);
            w5.k.e(uB0, "onApplyWindowInsets(...)");
            if (Build.VERSION.SDK_INT < 30) {
                return uB0.p(uB0.j(), 0, uB0.k(), uB0.i());
            }
            androidx.core.graphics.b bVarF = uB0.f(U.m.e());
            w5.k.e(bVarF, "getInsets(...)");
            return new U.b().b(U.m.e(), androidx.core.graphics.b.b(bVarF.f7120a, 0, bVarF.f7122c, bVarF.f7123d)).a();
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            View decorView = this.f18341m.getWindow().getDecorView();
            w5.k.e(decorView, "getDecorView(...)");
            androidx.core.view.H.C0(decorView, this.f18342n ? new androidx.core.view.C() { // from class: com.swmansion.rnscreens.E
                @Override // androidx.core.view.C
                public final U a(View view, U u6) {
                    return C.c.b(view, u6);
                }
            } : null);
            androidx.core.view.H.m0(decorView);
        }
    }

    private C() {
    }

    private final boolean g(C1599l c1599l, C1599l.e eVar) {
        switch (a.f18337a[eVar.ordinal()]) {
            case 1:
                if (c1599l.getScreenOrientation() == null) {
                    return false;
                }
                break;
            case 2:
                if (c1599l.getStatusBarColor() == null) {
                    return false;
                }
                break;
            case 3:
                if (c1599l.getStatusBarStyle() == null) {
                    return false;
                }
                break;
            case 4:
                if (c1599l.i() == null) {
                    return false;
                }
                break;
            case 5:
                if (c1599l.h() == null) {
                    return false;
                }
                break;
            case 6:
                if (c1599l.g() == null) {
                    return false;
                }
                break;
            case 7:
                if (c1599l.getNavigationBarColor() == null) {
                    return false;
                }
                break;
            case 8:
                if (c1599l.f() == null) {
                    return false;
                }
                break;
            case ConnectionResult.SERVICE_INVALID /* 9 */:
                if (c1599l.e() == null) {
                    return false;
                }
                break;
            default:
                throw new i5.k();
        }
        return true;
    }

    private final C1599l h(C1599l c1599l, C1599l.e eVar) {
        r fragmentWrapper;
        if (c1599l == null || (fragmentWrapper = c1599l.getFragmentWrapper()) == null) {
            return null;
        }
        Iterator it = fragmentWrapper.i().iterator();
        while (it.hasNext()) {
            C1599l topScreen = ((n) it.next()).getTopScreen();
            C c7 = f18332a;
            C1599l c1599lH = c7.h(topScreen, eVar);
            if (c1599lH != null) {
                return c1599lH;
            }
            if (topScreen != null && c7.g(topScreen, eVar)) {
                return topScreen;
            }
        }
        return null;
    }

    private final C1599l i(C1599l c1599l, C1599l.e eVar) {
        for (ViewParent container = c1599l.getContainer(); container != null; container = container.getParent()) {
            if (container instanceof C1599l) {
                C1599l c1599l2 = (C1599l) container;
                if (g(c1599l2, eVar)) {
                    return c1599l2;
                }
            }
        }
        return null;
    }

    private final C1599l j(C1599l c1599l, C1599l.e eVar) {
        C1599l c1599lH = h(c1599l, eVar);
        return c1599lH != null ? c1599lH : g(c1599l, eVar) ? c1599l : i(c1599l, eVar);
    }

    private final boolean k(int i7) {
        return ((double) 1) - ((((((double) Color.red(i7)) * 0.299d) + (((double) Color.green(i7)) * 0.587d)) + (((double) Color.blue(i7)) * 0.114d)) / ((double) 255)) < 0.5d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(boolean z6, v0 v0Var) {
        w5.k.f(v0Var, "$controller");
        if (z6) {
            v0Var.a(U.m.e());
        } else {
            v0Var.e(U.m.e());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(Window window, int i7) {
        new v0(window, window.getDecorView()).b(f18332a.k(i7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(Activity activity, String str) {
        w5.k.f(str, "$style");
        View decorView = activity.getWindow().getDecorView();
        w5.k.e(decorView, "getDecorView(...)");
        new v0(activity.getWindow(), decorView).c(w5.k.b(str, "dark"));
    }

    public final void d() {
        f18335d = true;
    }

    public final void e() {
        f18333b = true;
    }

    public final void f() {
        f18334c = true;
    }

    public final void l(C1599l c1599l, Activity activity, ReactContext reactContext) {
        Integer statusBarColor;
        Boolean boolG;
        w5.k.f(c1599l, "screen");
        if (activity == null || reactContext == null) {
            return;
        }
        if (f18336e == null) {
            f18336e = Integer.valueOf(activity.getWindow().getStatusBarColor());
        }
        C1599l c1599lJ = j(c1599l, C1599l.e.f18460n);
        C1599l c1599lJ2 = j(c1599l, C1599l.e.f18464r);
        if (c1599lJ == null || (statusBarColor = c1599lJ.getStatusBarColor()) == null) {
            statusBarColor = f18336e;
        }
        UiThreadUtil.runOnUiThread(new b(activity, statusBarColor, (c1599lJ2 == null || (boolG = c1599lJ2.g()) == null) ? false : boolG.booleanValue(), reactContext.getExceptionHandler()));
    }

    public final void n(C1599l c1599l, Activity activity) {
        Boolean boolH;
        w5.k.f(c1599l, "screen");
        if (activity == null) {
            return;
        }
        C1599l c1599lJ = j(c1599l, C1599l.e.f18463q);
        final boolean zBooleanValue = (c1599lJ == null || (boolH = c1599lJ.h()) == null) ? false : boolH.booleanValue();
        Window window = activity.getWindow();
        final v0 v0Var = new v0(window, window.getDecorView());
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.swmansion.rnscreens.z
            @Override // java.lang.Runnable
            public final void run() {
                C.m(zBooleanValue, v0Var);
            }
        });
    }

    public final void p(C1599l c1599l, Activity activity) {
        Integer navigationBarColor;
        w5.k.f(c1599l, "screen");
        if (activity == null) {
            return;
        }
        final Window window = activity.getWindow();
        C1599l c1599lJ = j(c1599l, C1599l.e.f18465s);
        final int navigationBarColor2 = (c1599lJ == null || (navigationBarColor = c1599lJ.getNavigationBarColor()) == null) ? window.getNavigationBarColor() : navigationBarColor.intValue();
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.swmansion.rnscreens.B
            @Override // java.lang.Runnable
            public final void run() {
                C.o(window, navigationBarColor2);
            }
        });
        window.setNavigationBarColor(navigationBarColor2);
    }

    public final void q(C1599l c1599l, Activity activity) {
        Boolean boolE;
        w5.k.f(c1599l, "screen");
        if (activity == null) {
            return;
        }
        Window window = activity.getWindow();
        C1599l c1599lJ = j(c1599l, C1599l.e.f18467u);
        if (!((c1599lJ == null || (boolE = c1599lJ.e()) == null) ? false : boolE.booleanValue())) {
            new v0(window, window.getDecorView()).e(U.m.d());
            return;
        }
        v0 v0Var = new v0(window, window.getDecorView());
        v0Var.a(U.m.d());
        v0Var.d(2);
    }

    public final void r(C1599l c1599l, Activity activity) {
        Boolean boolF;
        w5.k.f(c1599l, "screen");
        if (activity == null) {
            return;
        }
        Window window = activity.getWindow();
        C1599l c1599lJ = j(c1599l, C1599l.e.f18466t);
        T.b(window, !((c1599lJ == null || (boolF = c1599lJ.f()) == null) ? false : boolF.booleanValue()));
    }

    public final void s(C1599l c1599l, Activity activity) {
        Integer screenOrientation;
        w5.k.f(c1599l, "screen");
        if (activity == null) {
            return;
        }
        C1599l c1599lJ = j(c1599l, C1599l.e.f18459m);
        activity.setRequestedOrientation((c1599lJ == null || (screenOrientation = c1599lJ.getScreenOrientation()) == null) ? -1 : screenOrientation.intValue());
    }

    public final void u(C1599l c1599l, final Activity activity, ReactContext reactContext) {
        final String statusBarStyle;
        w5.k.f(c1599l, "screen");
        if (activity == null || reactContext == null) {
            return;
        }
        C1599l c1599lJ = j(c1599l, C1599l.e.f18461o);
        if (c1599lJ == null || (statusBarStyle = c1599lJ.getStatusBarStyle()) == null) {
            statusBarStyle = "light";
        }
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.swmansion.rnscreens.A
            @Override // java.lang.Runnable
            public final void run() {
                C.t(activity, statusBarStyle);
            }
        });
    }

    public final void v(C1599l c1599l, Activity activity, ReactContext reactContext) {
        Boolean boolI;
        w5.k.f(c1599l, "screen");
        if (activity == null || reactContext == null) {
            return;
        }
        C1599l c1599lJ = j(c1599l, C1599l.e.f18462p);
        UiThreadUtil.runOnUiThread(new c(activity, (c1599lJ == null || (boolI = c1599lJ.i()) == null) ? false : boolI.booleanValue(), reactContext.getExceptionHandler()));
    }

    public final void w(C1599l c1599l, Activity activity, ReactContext reactContext) {
        w5.k.f(c1599l, "screen");
        if (f18333b) {
            s(c1599l, activity);
        }
        if (f18334c) {
            l(c1599l, activity, reactContext);
            u(c1599l, activity, reactContext);
            v(c1599l, activity, reactContext);
            n(c1599l, activity);
        }
        if (f18335d) {
            p(c1599l, activity);
            r(c1599l, activity);
            q(c1599l, activity);
        }
    }
}
