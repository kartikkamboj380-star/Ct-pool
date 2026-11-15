package com.zoontek.rnbootsplash;

import android.R;
import android.app.Activity;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewTreeObserver;
import android.window.SplashScreen$OnExitAnimationListener;
import android.window.SplashScreenView;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.G;
import e5.AbstractC1630a;
import e5.C1640k;
import e5.DialogC1633d;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C1640k f18629a = new C1640k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static e f18630b = e.HIDDEN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f18631c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static DialogC1633d f18632d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static DialogC1633d f18633e = null;

    class a implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ View f18634m;

        a(View view) {
            this.f18634m = view;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (b.f18630b == e.INITIALIZING) {
                return false;
            }
            this.f18634m.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.zoontek.rnbootsplash.b$b, reason: collision with other inner class name */
    class C0246b implements SplashScreen$OnExitAnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f18635a;

        C0246b(Activity activity) {
            this.f18635a = activity;
        }

        public void onSplashScreenExit(SplashScreenView splashScreenView) {
            splashScreenView.remove();
            this.f18635a.getSplashScreen().clearOnExitAnimationListener();
        }
    }

    class c implements Runnable {

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                b.f18630b = e.VISIBLE;
            }
        }

        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.f18632d.b(new a());
        }
    }

    class d implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ ReactApplicationContext f18637m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f18638n;

        class a extends TimerTask {

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ Timer f18639m;

            a(Timer timer) {
                this.f18639m = timer;
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                this.f18639m.cancel();
                d dVar = d.this;
                b.m(dVar.f18637m, dVar.f18638n);
            }
        }

        /* JADX INFO: renamed from: com.zoontek.rnbootsplash.b$d$b, reason: collision with other inner class name */
        class RunnableC0247b implements Runnable {
            RunnableC0247b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                b.f18630b = e.HIDDEN;
                b.f18632d = null;
                b.j();
            }
        }

        class c implements Runnable {

            class a implements Runnable {

                /* JADX INFO: renamed from: com.zoontek.rnbootsplash.b$d$c$a$a, reason: collision with other inner class name */
                class RunnableC0248a implements Runnable {
                    RunnableC0248a() {
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        b.f18630b = e.HIDDEN;
                        b.f18632d = null;
                        b.f18633e = null;
                        b.j();
                    }
                }

                a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    b.f18633e.a(new RunnableC0248a());
                }
            }

            c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                b.f18632d.a(new a());
            }
        }

        d(ReactApplicationContext reactApplicationContext, boolean z6) {
            this.f18637m = reactApplicationContext;
            this.f18638n = z6;
        }

        @Override // java.lang.Runnable
        public void run() {
            Activity currentActivity = this.f18637m.getCurrentActivity();
            if (b.f18630b == e.INITIALIZING || currentActivity == null || currentActivity.isFinishing() || currentActivity.isDestroyed()) {
                Timer timer = new Timer();
                timer.schedule(new a(timer), 100L);
                return;
            }
            e eVar = b.f18630b;
            e eVar2 = e.HIDING;
            if (eVar == eVar2) {
                return;
            }
            if (b.f18632d == null || b.f18630b == e.HIDDEN) {
                b.j();
                return;
            }
            b.f18630b = eVar2;
            if (!this.f18638n) {
                b.f18632d.a(new RunnableC0247b());
            } else {
                b.f18633e = new DialogC1633d(currentActivity, b.f18631c, true);
                b.f18633e.b(new c());
            }
        }
    }

    private enum e {
        HIDDEN,
        HIDING,
        INITIALIZING,
        VISIBLE
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void j() {
        while (true) {
            C1640k c1640k = f18629a;
            if (c1640k.isEmpty()) {
                return;
            }
            Promise promise = (Promise) c1640k.h();
            if (promise != null) {
                promise.resolve(Boolean.TRUE);
            }
        }
    }

    public static Map k(ReactApplicationContext reactApplicationContext) {
        Resources resources = reactApplicationContext.getResources();
        HashMap map = new HashMap();
        int i7 = reactApplicationContext.getResources().getConfiguration().uiMode & 48;
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        int identifier2 = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        float fB = 0.0f;
        float fB2 = identifier > 0 ? G.b(resources.getDimensionPixelSize(identifier)) : 0.0f;
        if (identifier2 > 0 && !ViewConfiguration.get(reactApplicationContext).hasPermanentMenuKey()) {
            fB = G.b(resources.getDimensionPixelSize(identifier2));
        }
        map.put("darkModeEnabled", Boolean.valueOf(i7 == 32));
        map.put("logoSizeRatio", Double.valueOf(o() ? 0.5d : 1.0d));
        map.put("navigationBarHeight", Float.valueOf(fB));
        map.put("statusBarHeight", Float.valueOf(fB2));
        return map;
    }

    public static void l(ReactApplicationContext reactApplicationContext, boolean z6, Promise promise) {
        f18629a.c(promise);
        m(reactApplicationContext, z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void m(ReactApplicationContext reactApplicationContext, boolean z6) {
        UiThreadUtil.runOnUiThread(new d(reactApplicationContext, z6));
    }

    protected static void n(Activity activity, int i7) {
        int i8;
        if (f18631c != -1) {
            P0.a.G("ReactNative", "RNBootSplash: Ignored initialization, module is already initialized.");
            return;
        }
        f18631c = i7;
        if (activity == null) {
            P0.a.G("ReactNative", "RNBootSplash: Ignored initialization, current activity is null.");
            return;
        }
        TypedValue typedValue = new TypedValue();
        if (activity.getTheme().resolveAttribute(AbstractC1630a.f19214a, typedValue, true) && (i8 = typedValue.resourceId) != 0) {
            activity.setTheme(i8);
        }
        View viewFindViewById = activity.findViewById(R.id.content);
        f18630b = e.INITIALIZING;
        viewFindViewById.getViewTreeObserver().addOnPreDrawListener(new a(viewFindViewById));
        if (Build.VERSION.SDK_INT >= 31) {
            activity.getSplashScreen().setOnExitAnimationListener(new C0246b(activity));
        }
        f18632d = new DialogC1633d(activity, f18631c, false);
        UiThreadUtil.runOnUiThread(new c());
    }

    public static boolean o() {
        try {
            return (Build.VERSION.class.getDeclaredField("SEM_PLATFORM_INT").getInt(null) - 90000) / 10000 == 4;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void p(Promise promise) {
        promise.resolve(Boolean.valueOf(f18630b != e.HIDDEN));
    }

    protected static void q() {
        f18630b = e.HIDDEN;
        f18631c = -1;
        j();
        DialogC1633d dialogC1633d = f18632d;
        if (dialogC1633d != null) {
            dialogC1633d.dismiss();
            f18632d = null;
        }
        DialogC1633d dialogC1633d2 = f18633e;
        if (dialogC1633d2 != null) {
            dialogC1633d2.dismiss();
            f18633e = null;
        }
    }
}
