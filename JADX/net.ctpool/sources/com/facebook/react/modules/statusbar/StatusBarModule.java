package com.facebook.react.modules.statusbar;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import androidx.core.view.H;
import androidx.core.view.U;
import com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.modules.statusbar.StatusBarModule;
import com.facebook.react.uimanager.G;
import i2.InterfaceC1741a;
import i5.q;
import j5.AbstractC1787F;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.k;
import w5.y;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1741a(name = "StatusBarManager")
public final class StatusBarModule extends NativeStatusBarManagerAndroidSpec {
    public static final a Companion = new a(null);
    private static final String DEFAULT_BACKGROUND_COLOR_KEY = "DEFAULT_BACKGROUND_COLOR";
    private static final String HEIGHT_KEY = "HEIGHT";
    public static final String NAME = "StatusBarManager";

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class b extends GuardedRunnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ Activity f11957m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f11958n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f11959o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Activity activity, boolean z6, int i7, ReactApplicationContext reactApplicationContext) {
            super(reactApplicationContext);
            this.f11957m = activity;
            this.f11958n = z6;
            this.f11959o = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(Activity activity, ValueAnimator valueAnimator) {
            k.f(valueAnimator, "animator");
            Window window = activity.getWindow();
            if (window == null) {
                return;
            }
            Object animatedValue = valueAnimator.getAnimatedValue();
            k.d(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            window.setStatusBarColor(((Integer) animatedValue).intValue());
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            Window window = this.f11957m.getWindow();
            if (window == null) {
                return;
            }
            window.addFlags(Integer.MIN_VALUE);
            if (!this.f11958n) {
                window.setStatusBarColor(this.f11959o);
                return;
            }
            ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(window.getStatusBarColor()), Integer.valueOf(this.f11959o));
            final Activity activity = this.f11957m;
            valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.facebook.react.modules.statusbar.c
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    StatusBarModule.b.b(activity, valueAnimator);
                }
            });
            valueAnimatorOfObject.setDuration(300L).setStartDelay(0L);
            valueAnimatorOfObject.start();
        }
    }

    public static final class c extends GuardedRunnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ Activity f11960m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f11961n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Activity activity, boolean z6, ReactApplicationContext reactApplicationContext) {
            super(reactApplicationContext);
            this.f11960m = activity;
            this.f11961n = z6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final WindowInsets b(View view, WindowInsets windowInsets) {
            k.f(view, "v");
            k.f(windowInsets, "insets");
            WindowInsets windowInsetsOnApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
            return windowInsetsOnApplyWindowInsets.replaceSystemWindowInsets(windowInsetsOnApplyWindowInsets.getSystemWindowInsetLeft(), 0, windowInsetsOnApplyWindowInsets.getSystemWindowInsetRight(), windowInsetsOnApplyWindowInsets.getSystemWindowInsetBottom());
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            Window window = this.f11960m.getWindow();
            if (window == null) {
                return;
            }
            View decorView = window.getDecorView();
            k.e(decorView, "getDecorView(...)");
            decorView.setOnApplyWindowInsetsListener(this.f11961n ? new View.OnApplyWindowInsetsListener() { // from class: com.facebook.react.modules.statusbar.d
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return StatusBarModule.c.b(view, windowInsets);
                }
            } : null);
            H.m0(decorView);
        }
    }

    public StatusBarModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private final float getStatusBarHeightPx() {
        Window window;
        View decorView;
        U uI;
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || (window = currentActivity.getWindow()) == null || (decorView = window.getDecorView()) == null || (uI = H.I(decorView)) == null) {
            return 0.0f;
        }
        return uI.f(U.m.e() | U.m.d() | U.m.a()).f7121b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setHidden$lambda$1(Activity activity, boolean z6) {
        Window window = activity.getWindow();
        if (window == null) {
            return;
        }
        if (z6) {
            window.addFlags(1024);
            window.clearFlags(2048);
        } else {
            window.addFlags(2048);
            window.clearFlags(1024);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setStyle$lambda$2(Activity activity, String str) {
        Window window = activity.getWindow();
        if (window == null) {
            return;
        }
        if (Build.VERSION.SDK_INT <= 30) {
            View decorView = window.getDecorView();
            k.e(decorView, "getDecorView(...)");
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(k.b("dark-content", str) ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
            return;
        }
        WindowInsetsController insetsController = window.getInsetsController();
        if (insetsController == null) {
            return;
        }
        if (k.b("dark-content", str)) {
            insetsController.setSystemBarsAppearance(8, 8);
        } else {
            insetsController.setSystemBarsAppearance(0, 8);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    protected Map<String, Object> getTypedExportedConstants() {
        String str;
        Window window;
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || (window = currentActivity.getWindow()) == null) {
            str = "black";
        } else {
            int statusBarColor = window.getStatusBarColor();
            y yVar = y.f22743a;
            str = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(statusBarColor & 16777215)}, 1));
            k.e(str, "format(...)");
        }
        return AbstractC1787F.i(q.a(HEIGHT_KEY, Float.valueOf(G.b(getStatusBarHeightPx()))), q.a(DEFAULT_BACKGROUND_COLOR_KEY, str));
    }

    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    public void setColor(double d7, boolean z6) {
        int i7 = (int) d7;
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            P0.a.G("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
        } else {
            UiThreadUtil.runOnUiThread(new b(currentActivity, z6, i7, getReactApplicationContext()));
        }
    }

    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    public void setHidden(final boolean z6) {
        final Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            P0.a.G("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
        } else {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.modules.statusbar.a
                @Override // java.lang.Runnable
                public final void run() {
                    StatusBarModule.setHidden$lambda$1(currentActivity, z6);
                }
            });
        }
    }

    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    public void setStyle(final String str) {
        final Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            P0.a.G("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
        } else {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.modules.statusbar.b
                @Override // java.lang.Runnable
                public final void run() {
                    StatusBarModule.setStyle$lambda$2(currentActivity, str);
                }
            });
        }
    }

    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    public void setTranslucent(boolean z6) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            P0.a.G("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
        } else {
            UiThreadUtil.runOnUiThread(new c(currentActivity, z6, getReactApplicationContext()));
        }
    }
}
