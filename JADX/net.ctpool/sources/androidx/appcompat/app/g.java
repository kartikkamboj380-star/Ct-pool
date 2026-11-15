package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.b;
import androidx.appcompat.view.f;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C0534k;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.I;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.appcompat.widget.h0;
import androidx.appcompat.widget.q0;
import androidx.appcompat.widget.r0;
import androidx.core.app.AbstractC0550b;
import androidx.core.app.AbstractC0557i;
import androidx.core.content.res.f;
import androidx.core.view.AbstractC0596p;
import androidx.core.view.AbstractC0597q;
import androidx.core.view.H;
import androidx.core.view.O;
import androidx.core.view.Q;
import androidx.core.view.U;
import androidx.lifecycle.AbstractC0651h;
import e.AbstractC1609a;
import e.AbstractC1611c;
import e.AbstractC1614f;
import e.AbstractC1615g;
import f.AbstractC1641a;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
class g extends androidx.appcompat.app.f implements g.a, LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private static final n.g f5095v0 = new n.g();

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private static final boolean f5096w0 = false;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private static final int[] f5097x0 = {R.attr.windowBackground};

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private static final boolean f5098y0 = !"robolectric".equals(Build.FINGERPRINT);

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private static final boolean f5099z0 = true;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    AbstractC0521a f5100A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    MenuInflater f5101B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private CharSequence f5102C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private I f5103D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private C0121g f5104E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private u f5105F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    androidx.appcompat.view.b f5106G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    ActionBarContextView f5107H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    PopupWindow f5108I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    Runnable f5109J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    O f5110K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private boolean f5111L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private boolean f5112M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    ViewGroup f5113N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private TextView f5114O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private View f5115P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private boolean f5116Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private boolean f5117R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    boolean f5118S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    boolean f5119T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    boolean f5120U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    boolean f5121V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    boolean f5122W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private boolean f5123X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private t[] f5124Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private t f5125Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean f5126a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private boolean f5127b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private boolean f5128c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    boolean f5129d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private Configuration f5130e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private int f5131f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private int f5132g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private int f5133h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private boolean f5134i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private p f5135j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private p f5136k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    boolean f5137l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    int f5138m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private final Runnable f5139n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private boolean f5140o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private Rect f5141p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private Rect f5142q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private androidx.appcompat.app.r f5143r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private v f5144s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private OnBackInvokedDispatcher f5145t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private OnBackInvokedCallback f5146u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    final Object f5147v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    final Context f5148w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    Window f5149x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private n f5150y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    final androidx.appcompat.app.d f5151z;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g gVar = g.this;
            if ((gVar.f5138m0 & 1) != 0) {
                gVar.i0(0);
            }
            g gVar2 = g.this;
            if ((gVar2.f5138m0 & 4096) != 0) {
                gVar2.i0(108);
            }
            g gVar3 = g.this;
            gVar3.f5137l0 = false;
            gVar3.f5138m0 = 0;
        }
    }

    class b implements androidx.core.view.C {
        b() {
        }

        @Override // androidx.core.view.C
        public U a(View view, U u6) {
            int iL = u6.l();
            int iF1 = g.this.f1(u6, null);
            if (iL != iF1) {
                u6 = u6.p(u6.j(), iF1, u6.k(), u6.i());
            }
            return H.b0(view, u6);
        }
    }

    class c implements ContentFrameLayout.a {
        c() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
            g.this.g0();
        }
    }

    class d implements Runnable {

        class a extends Q {
            a() {
            }

            @Override // androidx.core.view.P
            public void b(View view) {
                g.this.f5107H.setAlpha(1.0f);
                g.this.f5110K.h(null);
                g.this.f5110K = null;
            }

            @Override // androidx.core.view.Q, androidx.core.view.P
            public void c(View view) {
                g.this.f5107H.setVisibility(0);
            }
        }

        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g gVar = g.this;
            gVar.f5108I.showAtLocation(gVar.f5107H, 55, 0, 0);
            g.this.j0();
            if (!g.this.U0()) {
                g.this.f5107H.setAlpha(1.0f);
                g.this.f5107H.setVisibility(0);
            } else {
                g.this.f5107H.setAlpha(0.0f);
                g gVar2 = g.this;
                gVar2.f5110K = H.e(gVar2.f5107H).b(1.0f);
                g.this.f5110K.h(new a());
            }
        }
    }

    class e extends Q {
        e() {
        }

        @Override // androidx.core.view.P
        public void b(View view) {
            g.this.f5107H.setAlpha(1.0f);
            g.this.f5110K.h(null);
            g.this.f5110K = null;
        }

        @Override // androidx.core.view.Q, androidx.core.view.P
        public void c(View view) {
            g.this.f5107H.setVisibility(0);
            if (g.this.f5107H.getParent() instanceof View) {
                H.m0((View) g.this.f5107H.getParent());
            }
        }
    }

    interface f {
        boolean a(int i7);

        View onCreatePanelView(int i7);
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.g$g, reason: collision with other inner class name */
    private final class C0121g implements m.a {
        C0121g() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void c(androidx.appcompat.view.menu.g gVar, boolean z6) {
            g.this.Z(gVar);
        }

        @Override // androidx.appcompat.view.menu.m.a
        public boolean d(androidx.appcompat.view.menu.g gVar) {
            Window.Callback callbackV0 = g.this.v0();
            if (callbackV0 == null) {
                return true;
            }
            callbackV0.onMenuOpened(108, gVar);
            return true;
        }
    }

    class h implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private b.a f5159a;

        class a extends Q {
            a() {
            }

            @Override // androidx.core.view.P
            public void b(View view) {
                g.this.f5107H.setVisibility(8);
                g gVar = g.this;
                PopupWindow popupWindow = gVar.f5108I;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (gVar.f5107H.getParent() instanceof View) {
                    H.m0((View) g.this.f5107H.getParent());
                }
                g.this.f5107H.k();
                g.this.f5110K.h(null);
                g gVar2 = g.this;
                gVar2.f5110K = null;
                H.m0(gVar2.f5113N);
            }
        }

        public h(b.a aVar) {
            this.f5159a = aVar;
        }

        @Override // androidx.appcompat.view.b.a
        public void a(androidx.appcompat.view.b bVar) {
            this.f5159a.a(bVar);
            g gVar = g.this;
            if (gVar.f5108I != null) {
                gVar.f5149x.getDecorView().removeCallbacks(g.this.f5109J);
            }
            g gVar2 = g.this;
            if (gVar2.f5107H != null) {
                gVar2.j0();
                g gVar3 = g.this;
                gVar3.f5110K = H.e(gVar3.f5107H).b(0.0f);
                g.this.f5110K.h(new a());
            }
            g gVar4 = g.this;
            androidx.appcompat.app.d dVar = gVar4.f5151z;
            if (dVar != null) {
                dVar.g(gVar4.f5106G);
            }
            g gVar5 = g.this;
            gVar5.f5106G = null;
            H.m0(gVar5.f5113N);
            g.this.d1();
        }

        @Override // androidx.appcompat.view.b.a
        public boolean b(androidx.appcompat.view.b bVar, Menu menu) {
            return this.f5159a.b(bVar, menu);
        }

        @Override // androidx.appcompat.view.b.a
        public boolean c(androidx.appcompat.view.b bVar, Menu menu) {
            H.m0(g.this.f5113N);
            return this.f5159a.c(bVar, menu);
        }

        @Override // androidx.appcompat.view.b.a
        public boolean d(androidx.appcompat.view.b bVar, MenuItem menuItem) {
            return this.f5159a.d(bVar, menuItem);
        }
    }

    static class i {
        static Context a(Context context, Configuration configuration) {
            return context.createConfigurationContext(configuration);
        }

        static void b(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i7 = configuration.densityDpi;
            int i8 = configuration2.densityDpi;
            if (i7 != i8) {
                configuration3.densityDpi = i8;
            }
        }

        static void c(Configuration configuration, Locale locale) {
            configuration.setLayoutDirection(locale);
        }

        static void d(Configuration configuration, Locale locale) {
            configuration.setLocale(locale);
        }
    }

    static class j {
        static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        static String b(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    static class k {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }

        static androidx.core.os.i b(Configuration configuration) {
            return androidx.core.os.i.b(configuration.getLocales().toLanguageTags());
        }

        public static void c(androidx.core.os.i iVar) {
            LocaleList.setDefault(LocaleList.forLanguageTags(iVar.h()));
        }

        static void d(Configuration configuration, androidx.core.os.i iVar) {
            configuration.setLocales(LocaleList.forLanguageTags(iVar.h()));
        }
    }

    static class l {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            if ((configuration.colorMode & 3) != (configuration2.colorMode & 3)) {
                configuration3.colorMode |= configuration2.colorMode & 3;
            }
            if ((configuration.colorMode & 12) != (configuration2.colorMode & 12)) {
                configuration3.colorMode |= configuration2.colorMode & 12;
            }
        }
    }

    static class m {
        static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }

        static OnBackInvokedCallback b(Object obj, final g gVar) {
            Objects.requireNonNull(gVar);
            OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: androidx.appcompat.app.o
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    gVar.D0();
                }
            };
            androidx.appcompat.app.k.a(obj).registerOnBackInvokedCallback(1000000, onBackInvokedCallback);
            return onBackInvokedCallback;
        }

        static void c(Object obj, Object obj2) {
            androidx.appcompat.app.k.a(obj).unregisterOnBackInvokedCallback(androidx.appcompat.app.j.a(obj2));
        }
    }

    class n extends androidx.appcompat.view.i {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private f f5162n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f5163o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private boolean f5164p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private boolean f5165q;

        n(Window.Callback callback) {
            super(callback);
        }

        public boolean b(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.f5164p = true;
                return callback.dispatchKeyEvent(keyEvent);
            } finally {
                this.f5164p = false;
            }
        }

        public void c(Window.Callback callback) {
            try {
                this.f5163o = true;
                callback.onContentChanged();
            } finally {
                this.f5163o = false;
            }
        }

        public void d(Window.Callback callback, int i7, Menu menu) {
            try {
                this.f5165q = true;
                callback.onPanelClosed(i7, menu);
            } finally {
                this.f5165q = false;
            }
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return this.f5164p ? a().dispatchKeyEvent(keyEvent) : g.this.h0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || g.this.G0(keyEvent.getKeyCode(), keyEvent);
        }

        void e(f fVar) {
            this.f5162n = fVar;
        }

        final ActionMode f(ActionMode.Callback callback) {
            f.a aVar = new f.a(g.this.f5148w, callback);
            androidx.appcompat.view.b bVarX0 = g.this.X0(aVar);
            if (bVarX0 != null) {
                return aVar.e(bVarX0);
            }
            return null;
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
            if (this.f5163o) {
                a().onContentChanged();
            }
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i7, Menu menu) {
            if (i7 != 0 || (menu instanceof androidx.appcompat.view.menu.g)) {
                return super.onCreatePanelMenu(i7, menu);
            }
            return false;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public View onCreatePanelView(int i7) {
            View viewOnCreatePanelView;
            f fVar = this.f5162n;
            return (fVar == null || (viewOnCreatePanelView = fVar.onCreatePanelView(i7)) == null) ? super.onCreatePanelView(i7) : viewOnCreatePanelView;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean onMenuOpened(int i7, Menu menu) {
            super.onMenuOpened(i7, menu);
            g.this.J0(i7);
            return true;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public void onPanelClosed(int i7, Menu menu) {
            if (this.f5165q) {
                a().onPanelClosed(i7, menu);
            } else {
                super.onPanelClosed(i7, menu);
                g.this.K0(i7);
            }
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean onPreparePanel(int i7, View view, Menu menu) {
            androidx.appcompat.view.menu.g gVar = menu instanceof androidx.appcompat.view.menu.g ? (androidx.appcompat.view.menu.g) menu : null;
            if (i7 == 0 && gVar == null) {
                return false;
            }
            if (gVar != null) {
                gVar.a0(true);
            }
            f fVar = this.f5162n;
            boolean zOnPreparePanel = fVar != null && fVar.a(i7);
            if (!zOnPreparePanel) {
                zOnPreparePanel = super.onPreparePanel(i7, view, menu);
            }
            if (gVar != null) {
                gVar.a0(false);
            }
            return zOnPreparePanel;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List list, Menu menu, int i7) {
            androidx.appcompat.view.menu.g gVar;
            t tVarT0 = g.this.t0(0, true);
            if (tVarT0 == null || (gVar = tVarT0.f5184j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i7);
            } else {
                super.onProvideKeyboardShortcuts(list, gVar, i7);
            }
        }

        @Override // android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i7) {
            return (g.this.B0() && i7 == 0) ? f(callback) : super.onWindowStartingActionMode(callback, i7);
        }
    }

    private class o extends p {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final PowerManager f5167c;

        o(Context context) {
            super();
            this.f5167c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.g.p
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.g.p
        public int c() {
            return j.a(this.f5167c) ? 2 : 1;
        }

        @Override // androidx.appcompat.app.g.p
        public void d() {
            g.this.f();
        }
    }

    abstract class p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private BroadcastReceiver f5169a;

        class a extends BroadcastReceiver {
            a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                p.this.d();
            }
        }

        p() {
        }

        void a() {
            BroadcastReceiver broadcastReceiver = this.f5169a;
            if (broadcastReceiver != null) {
                try {
                    g.this.f5148w.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f5169a = null;
            }
        }

        abstract IntentFilter b();

        abstract int c();

        abstract void d();

        void e() {
            a();
            IntentFilter intentFilterB = b();
            if (intentFilterB == null || intentFilterB.countActions() == 0) {
                return;
            }
            if (this.f5169a == null) {
                this.f5169a = new a();
            }
            g.this.f5148w.registerReceiver(this.f5169a, intentFilterB);
        }
    }

    private class q extends p {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final B f5172c;

        q(B b7) {
            super();
            this.f5172c = b7;
        }

        @Override // androidx.appcompat.app.g.p
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.g.p
        public int c() {
            return this.f5172c.d() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.g.p
        public void d() {
            g.this.f();
        }
    }

    private static class r {
        static void a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    private class s extends ContentFrameLayout {
        public s(Context context) {
            super(context);
        }

        private boolean b(int i7, int i8) {
            return i7 < -5 || i8 < -5 || i7 > getWidth() + 5 || i8 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return g.this.h0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !b((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            g.this.b0(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i7) {
            setBackgroundDrawable(AbstractC1641a.b(getContext(), i7));
        }
    }

    protected static final class t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f5175a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f5176b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f5177c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f5178d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f5179e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f5180f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        ViewGroup f5181g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        View f5182h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        View f5183i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        androidx.appcompat.view.menu.g f5184j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        androidx.appcompat.view.menu.e f5185k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Context f5186l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        boolean f5187m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f5188n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f5189o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f5190p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        boolean f5191q = false;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        boolean f5192r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Bundle f5193s;

        t(int i7) {
            this.f5175a = i7;
        }

        androidx.appcompat.view.menu.n a(m.a aVar) {
            if (this.f5184j == null) {
                return null;
            }
            if (this.f5185k == null) {
                androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(this.f5186l, AbstractC1615g.f18872j);
                this.f5185k = eVar;
                eVar.h(aVar);
                this.f5184j.b(this.f5185k);
            }
            return this.f5185k.b(this.f5181g);
        }

        public boolean b() {
            if (this.f5182h == null) {
                return false;
            }
            return this.f5183i != null || this.f5185k.a().getCount() > 0;
        }

        void c(androidx.appcompat.view.menu.g gVar) {
            androidx.appcompat.view.menu.e eVar;
            androidx.appcompat.view.menu.g gVar2 = this.f5184j;
            if (gVar == gVar2) {
                return;
            }
            if (gVar2 != null) {
                gVar2.O(this.f5185k);
            }
            this.f5184j = gVar;
            if (gVar == null || (eVar = this.f5185k) == null) {
                return;
            }
            gVar.b(eVar);
        }

        void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme themeNewTheme = context.getResources().newTheme();
            themeNewTheme.setTo(context.getTheme());
            themeNewTheme.resolveAttribute(AbstractC1609a.f18728a, typedValue, true);
            int i7 = typedValue.resourceId;
            if (i7 != 0) {
                themeNewTheme.applyStyle(i7, true);
            }
            themeNewTheme.resolveAttribute(AbstractC1609a.f18718C, typedValue, true);
            int i8 = typedValue.resourceId;
            if (i8 == 0) {
                i8 = e.i.f18898b;
            }
            themeNewTheme.applyStyle(i8, true);
            androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, 0);
            dVar.getTheme().setTo(themeNewTheme);
            this.f5186l = dVar;
            TypedArray typedArrayObtainStyledAttributes = dVar.obtainStyledAttributes(e.j.f19144y0);
            this.f5176b = typedArrayObtainStyledAttributes.getResourceId(e.j.f18907B0, 0);
            this.f5180f = typedArrayObtainStyledAttributes.getResourceId(e.j.f18902A0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private final class u implements m.a {
        u() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void c(androidx.appcompat.view.menu.g gVar, boolean z6) {
            androidx.appcompat.view.menu.g gVarD = gVar.D();
            boolean z7 = gVarD != gVar;
            g gVar2 = g.this;
            if (z7) {
                gVar = gVarD;
            }
            t tVarM0 = gVar2.m0(gVar);
            if (tVarM0 != null) {
                if (!z7) {
                    g.this.c0(tVarM0, z6);
                } else {
                    g.this.Y(tVarM0.f5175a, tVarM0, gVarD);
                    g.this.c0(tVarM0, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.m.a
        public boolean d(androidx.appcompat.view.menu.g gVar) {
            Window.Callback callbackV0;
            if (gVar != gVar.D()) {
                return true;
            }
            g gVar2 = g.this;
            if (!gVar2.f5118S || (callbackV0 = gVar2.v0()) == null || g.this.f5129d0) {
                return true;
            }
            callbackV0.onMenuOpened(108, gVar);
            return true;
        }
    }

    g(Activity activity, androidx.appcompat.app.d dVar) {
        this(activity, null, dVar, activity);
    }

    private void A0(int i7) {
        this.f5138m0 = (1 << i7) | this.f5138m0;
        if (this.f5137l0) {
            return;
        }
        H.h0(this.f5149x.getDecorView(), this.f5139n0);
        this.f5137l0 = true;
    }

    private boolean F0(int i7, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        t tVarT0 = t0(i7, true);
        if (tVarT0.f5189o) {
            return false;
        }
        return P0(tVarT0, keyEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean I0(int i7, KeyEvent keyEvent) {
        boolean zP0;
        I i8;
        if (this.f5106G != null) {
            return false;
        }
        boolean zG = true;
        t tVarT0 = t0(i7, true);
        if (i7 != 0 || (i8 = this.f5103D) == null || !i8.e() || ViewConfiguration.get(this.f5148w).hasPermanentMenuKey()) {
            boolean z6 = tVarT0.f5189o;
            if (z6 || tVarT0.f5188n) {
                c0(tVarT0, true);
                zG = z6;
            } else if (tVarT0.f5187m) {
                if (tVarT0.f5192r) {
                    tVarT0.f5187m = false;
                    zP0 = P0(tVarT0, keyEvent);
                } else {
                    zP0 = true;
                }
                if (zP0) {
                    M0(tVarT0, keyEvent);
                }
            } else {
                zG = false;
            }
        } else if (this.f5103D.c()) {
            zG = this.f5103D.g();
        } else if (!this.f5129d0 && P0(tVarT0, keyEvent)) {
            zG = this.f5103D.h();
        }
        if (zG) {
            AudioManager audioManager = (AudioManager) this.f5148w.getApplicationContext().getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
            } else {
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
            }
        }
        return zG;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void M0(t tVar, KeyEvent keyEvent) {
        int i7;
        ViewGroup.LayoutParams layoutParams;
        if (tVar.f5189o || this.f5129d0) {
            return;
        }
        if (tVar.f5175a == 0 && (this.f5148w.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callbackV0 = v0();
        if (callbackV0 != null && !callbackV0.onMenuOpened(tVar.f5175a, tVar.f5184j)) {
            c0(tVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f5148w.getSystemService("window");
        if (windowManager == null || !P0(tVar, keyEvent)) {
            return;
        }
        ViewGroup viewGroup = tVar.f5181g;
        if (viewGroup != null && !tVar.f5191q) {
            View view = tVar.f5183i;
            if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                i7 = -1;
            }
            tVar.f5188n = false;
            WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i7, -2, tVar.f5178d, tVar.f5179e, 1002, 8519680, -3);
            layoutParams2.gravity = tVar.f5177c;
            layoutParams2.windowAnimations = tVar.f5180f;
            windowManager.addView(tVar.f5181g, layoutParams2);
            tVar.f5189o = true;
            if (tVar.f5175a != 0) {
                d1();
                return;
            }
            return;
        }
        if (viewGroup == null) {
            if (!y0(tVar) || tVar.f5181g == null) {
                return;
            }
        } else if (tVar.f5191q && viewGroup.getChildCount() > 0) {
            tVar.f5181g.removeAllViews();
        }
        if (!x0(tVar) || !tVar.b()) {
            tVar.f5191q = true;
            return;
        }
        ViewGroup.LayoutParams layoutParams3 = tVar.f5182h.getLayoutParams();
        if (layoutParams3 == null) {
            layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
        }
        tVar.f5181g.setBackgroundResource(tVar.f5176b);
        ViewParent parent = tVar.f5182h.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(tVar.f5182h);
        }
        tVar.f5181g.addView(tVar.f5182h, layoutParams3);
        if (!tVar.f5182h.hasFocus()) {
            tVar.f5182h.requestFocus();
        }
        i7 = -2;
        tVar.f5188n = false;
        WindowManager.LayoutParams layoutParams22 = new WindowManager.LayoutParams(i7, -2, tVar.f5178d, tVar.f5179e, 1002, 8519680, -3);
        layoutParams22.gravity = tVar.f5177c;
        layoutParams22.windowAnimations = tVar.f5180f;
        windowManager.addView(tVar.f5181g, layoutParams22);
        tVar.f5189o = true;
        if (tVar.f5175a != 0) {
        }
    }

    private boolean O0(t tVar, int i7, KeyEvent keyEvent, int i8) {
        androidx.appcompat.view.menu.g gVar;
        boolean zPerformShortcut = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((tVar.f5187m || P0(tVar, keyEvent)) && (gVar = tVar.f5184j) != null) {
            zPerformShortcut = gVar.performShortcut(i7, keyEvent, i8);
        }
        if (zPerformShortcut && (i8 & 1) == 0 && this.f5103D == null) {
            c0(tVar, true);
        }
        return zPerformShortcut;
    }

    private boolean P0(t tVar, KeyEvent keyEvent) {
        I i7;
        I i8;
        I i9;
        if (this.f5129d0) {
            return false;
        }
        if (tVar.f5187m) {
            return true;
        }
        t tVar2 = this.f5125Z;
        if (tVar2 != null && tVar2 != tVar) {
            c0(tVar2, false);
        }
        Window.Callback callbackV0 = v0();
        if (callbackV0 != null) {
            tVar.f5183i = callbackV0.onCreatePanelView(tVar.f5175a);
        }
        int i10 = tVar.f5175a;
        boolean z6 = i10 == 0 || i10 == 108;
        if (z6 && (i9 = this.f5103D) != null) {
            i9.d();
        }
        if (tVar.f5183i == null && (!z6 || !(N0() instanceof z))) {
            androidx.appcompat.view.menu.g gVar = tVar.f5184j;
            if (gVar == null || tVar.f5192r) {
                if (gVar == null && (!z0(tVar) || tVar.f5184j == null)) {
                    return false;
                }
                if (z6 && this.f5103D != null) {
                    if (this.f5104E == null) {
                        this.f5104E = new C0121g();
                    }
                    this.f5103D.b(tVar.f5184j, this.f5104E);
                }
                tVar.f5184j.d0();
                if (!callbackV0.onCreatePanelMenu(tVar.f5175a, tVar.f5184j)) {
                    tVar.c(null);
                    if (z6 && (i7 = this.f5103D) != null) {
                        i7.b(null, this.f5104E);
                    }
                    return false;
                }
                tVar.f5192r = false;
            }
            tVar.f5184j.d0();
            Bundle bundle = tVar.f5193s;
            if (bundle != null) {
                tVar.f5184j.P(bundle);
                tVar.f5193s = null;
            }
            if (!callbackV0.onPreparePanel(0, tVar.f5183i, tVar.f5184j)) {
                if (z6 && (i8 = this.f5103D) != null) {
                    i8.b(null, this.f5104E);
                }
                tVar.f5184j.c0();
                return false;
            }
            boolean z7 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            tVar.f5190p = z7;
            tVar.f5184j.setQwertyMode(z7);
            tVar.f5184j.c0();
        }
        tVar.f5187m = true;
        tVar.f5188n = false;
        this.f5125Z = tVar;
        return true;
    }

    private void Q0(boolean z6) {
        I i7 = this.f5103D;
        if (i7 == null || !i7.e() || (ViewConfiguration.get(this.f5148w).hasPermanentMenuKey() && !this.f5103D.f())) {
            t tVarT0 = t0(0, true);
            tVarT0.f5191q = true;
            c0(tVarT0, false);
            M0(tVarT0, null);
            return;
        }
        Window.Callback callbackV0 = v0();
        if (this.f5103D.c() && z6) {
            this.f5103D.g();
            if (this.f5129d0) {
                return;
            }
            callbackV0.onPanelClosed(108, t0(0, true).f5184j);
            return;
        }
        if (callbackV0 == null || this.f5129d0) {
            return;
        }
        if (this.f5137l0 && (this.f5138m0 & 1) != 0) {
            this.f5149x.getDecorView().removeCallbacks(this.f5139n0);
            this.f5139n0.run();
        }
        t tVarT02 = t0(0, true);
        androidx.appcompat.view.menu.g gVar = tVarT02.f5184j;
        if (gVar == null || tVarT02.f5192r || !callbackV0.onPreparePanel(0, tVarT02.f5183i, gVar)) {
            return;
        }
        callbackV0.onMenuOpened(108, tVarT02.f5184j);
        this.f5103D.h();
    }

    private int R0(int i7) {
        if (i7 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        }
        if (i7 != 9) {
            return i7;
        }
        Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
        return 109;
    }

    private boolean S(boolean z6) {
        return T(z6, true);
    }

    private boolean T(boolean z6, boolean z7) {
        if (this.f5129d0) {
            return false;
        }
        int iX = X();
        int iC0 = C0(this.f5148w, iX);
        androidx.core.os.i iVarW = Build.VERSION.SDK_INT < 33 ? W(this.f5148w) : null;
        if (!z7 && iVarW != null) {
            iVarW = s0(this.f5148w.getResources().getConfiguration());
        }
        boolean zC1 = c1(iC0, iVarW, z6);
        if (iX == 0) {
            r0(this.f5148w).e();
        } else {
            p pVar = this.f5135j0;
            if (pVar != null) {
                pVar.a();
            }
        }
        if (iX == 3) {
            q0(this.f5148w).e();
        } else {
            p pVar2 = this.f5136k0;
            if (pVar2 != null) {
                pVar2.a();
            }
        }
        return zC1;
    }

    private void U() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f5113N.findViewById(R.id.content);
        View decorView = this.f5149x.getDecorView();
        contentFrameLayout.a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray typedArrayObtainStyledAttributes = this.f5148w.obtainStyledAttributes(e.j.f19144y0);
        typedArrayObtainStyledAttributes.getValue(e.j.f18952K0, contentFrameLayout.getMinWidthMajor());
        typedArrayObtainStyledAttributes.getValue(e.j.f18957L0, contentFrameLayout.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes.hasValue(e.j.f18942I0)) {
            typedArrayObtainStyledAttributes.getValue(e.j.f18942I0, contentFrameLayout.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(e.j.f18947J0)) {
            typedArrayObtainStyledAttributes.getValue(e.j.f18947J0, contentFrameLayout.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(e.j.f18932G0)) {
            typedArrayObtainStyledAttributes.getValue(e.j.f18932G0, contentFrameLayout.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(e.j.f18937H0)) {
            typedArrayObtainStyledAttributes.getValue(e.j.f18937H0, contentFrameLayout.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private void V(Window window) {
        if (this.f5149x != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof n) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        n nVar = new n(callback);
        this.f5150y = nVar;
        window.setCallback(nVar);
        h0 h0VarU = h0.u(this.f5148w, null, f5097x0);
        Drawable drawableH = h0VarU.h(0);
        if (drawableH != null) {
            window.setBackgroundDrawable(drawableH);
        }
        h0VarU.w();
        this.f5149x = window;
        if (Build.VERSION.SDK_INT < 33 || this.f5145t0 != null) {
            return;
        }
        N(null);
    }

    private boolean V0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f5149x.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || H.S((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private int X() {
        int i7 = this.f5131f0;
        return i7 != -100 ? i7 : androidx.appcompat.app.f.o();
    }

    private void Z0() {
        if (this.f5112M) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private void a0() {
        p pVar = this.f5135j0;
        if (pVar != null) {
            pVar.a();
        }
        p pVar2 = this.f5136k0;
        if (pVar2 != null) {
            pVar2.a();
        }
    }

    private AbstractActivityC0523c a1() {
        for (Context baseContext = this.f5148w; baseContext != null; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof AbstractActivityC0523c) {
                return (AbstractActivityC0523c) baseContext;
            }
            if (!(baseContext instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void b1(Configuration configuration) {
        Activity activity = (Activity) this.f5147v;
        if (activity instanceof androidx.lifecycle.l) {
            if (!((androidx.lifecycle.l) activity).getLifecycle().b().e(AbstractC0651h.c.CREATED)) {
                return;
            }
        } else if (!this.f5128c0 || this.f5129d0) {
            return;
        }
        activity.onConfigurationChanged(configuration);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean c1(int i7, androidx.core.os.i iVar, boolean z6) {
        boolean z7;
        Configuration configurationD0 = d0(this.f5148w, i7, iVar, null, false);
        int iP0 = p0(this.f5148w);
        Configuration configuration = this.f5130e0;
        if (configuration == null) {
            configuration = this.f5148w.getResources().getConfiguration();
        }
        int i8 = configuration.uiMode & 48;
        int i9 = configurationD0.uiMode & 48;
        androidx.core.os.i iVarS0 = s0(configuration);
        androidx.core.os.i iVarS02 = iVar == null ? null : s0(configurationD0);
        int i10 = i8 != i9 ? 512 : 0;
        if (iVarS02 != null && !iVarS0.equals(iVarS02)) {
            i10 |= 8196;
        }
        boolean z8 = true;
        if (((~iP0) & i10) != 0 && z6 && this.f5127b0 && (f5098y0 || this.f5128c0)) {
            Object obj = this.f5147v;
            if ((obj instanceof Activity) && !((Activity) obj).isChild()) {
                AbstractC0550b.r((Activity) this.f5147v);
                z7 = true;
            }
        } else {
            z7 = false;
        }
        if (z7 || i10 == 0) {
            z8 = z7;
        } else {
            e1(i9, iVarS02, (i10 & iP0) == i10, null);
        }
        if (z8) {
            Object obj2 = this.f5147v;
            if (obj2 instanceof AbstractActivityC0523c) {
                if ((i10 & 512) != 0) {
                    ((AbstractActivityC0523c) obj2).e0(i7);
                }
                if ((i10 & 4) != 0) {
                    ((AbstractActivityC0523c) this.f5147v).d0(iVar);
                }
            }
        }
        if (z8 && iVarS02 != null) {
            T0(s0(this.f5148w.getResources().getConfiguration()));
        }
        return z8;
    }

    private Configuration d0(Context context, int i7, androidx.core.os.i iVar, Configuration configuration, boolean z6) {
        int i8 = i7 != 1 ? i7 != 2 ? z6 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i8 | (configuration2.uiMode & (-49));
        if (iVar != null) {
            S0(configuration2, iVar);
        }
        return configuration2;
    }

    private ViewGroup e0() {
        ViewGroup viewGroup;
        TypedArray typedArrayObtainStyledAttributes = this.f5148w.obtainStyledAttributes(e.j.f19144y0);
        if (!typedArrayObtainStyledAttributes.hasValue(e.j.f18917D0)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(e.j.f18962M0, false)) {
            I(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(e.j.f18917D0, false)) {
            I(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(e.j.f18922E0, false)) {
            I(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(e.j.f18927F0, false)) {
            I(10);
        }
        this.f5121V = typedArrayObtainStyledAttributes.getBoolean(e.j.f19149z0, false);
        typedArrayObtainStyledAttributes.recycle();
        l0();
        this.f5149x.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f5148w);
        if (this.f5122W) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(this.f5120U ? AbstractC1615g.f18877o : AbstractC1615g.f18876n, (ViewGroup) null);
        } else if (this.f5121V) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(AbstractC1615g.f18868f, (ViewGroup) null);
            this.f5119T = false;
            this.f5118S = false;
        } else if (this.f5118S) {
            TypedValue typedValue = new TypedValue();
            this.f5148w.getTheme().resolveAttribute(AbstractC1609a.f18731d, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new androidx.appcompat.view.d(this.f5148w, typedValue.resourceId) : this.f5148w).inflate(AbstractC1615g.f18878p, (ViewGroup) null);
            I i7 = (I) viewGroup.findViewById(AbstractC1614f.f18852p);
            this.f5103D = i7;
            i7.setWindowCallback(v0());
            if (this.f5119T) {
                this.f5103D.i(109);
            }
            if (this.f5116Q) {
                this.f5103D.i(2);
            }
            if (this.f5117R) {
                this.f5103D.i(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f5118S + ", windowActionBarOverlay: " + this.f5119T + ", android:windowIsFloating: " + this.f5121V + ", windowActionModeOverlay: " + this.f5120U + ", windowNoTitle: " + this.f5122W + " }");
        }
        H.C0(viewGroup, new b());
        if (this.f5103D == null) {
            this.f5114O = (TextView) viewGroup.findViewById(AbstractC1614f.f18833M);
        }
        r0.c(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(AbstractC1614f.f18838b);
        ViewGroup viewGroup2 = (ViewGroup) this.f5149x.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f5149x.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new c());
        return viewGroup;
    }

    private void e1(int i7, androidx.core.os.i iVar, boolean z6, Configuration configuration) {
        Resources resources = this.f5148w.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i7 | (resources.getConfiguration().uiMode & (-49));
        if (iVar != null) {
            S0(configuration2, iVar);
        }
        resources.updateConfiguration(configuration2, null);
        if (Build.VERSION.SDK_INT < 26) {
            x.a(resources);
        }
        int i8 = this.f5132g0;
        if (i8 != 0) {
            this.f5148w.setTheme(i8);
            this.f5148w.getTheme().applyStyle(this.f5132g0, true);
        }
        if (z6 && (this.f5147v instanceof Activity)) {
            b1(configuration2);
        }
    }

    private void g1(View view) {
        Context context;
        int i7;
        if ((H.L(view) & 8192) != 0) {
            context = this.f5148w;
            i7 = AbstractC1611c.f18756b;
        } else {
            context = this.f5148w;
            i7 = AbstractC1611c.f18755a;
        }
        view.setBackgroundColor(androidx.core.content.b.c(context, i7));
    }

    private void k0() {
        if (this.f5112M) {
            return;
        }
        this.f5113N = e0();
        CharSequence charSequenceU0 = u0();
        if (!TextUtils.isEmpty(charSequenceU0)) {
            I i7 = this.f5103D;
            if (i7 != null) {
                i7.setWindowTitle(charSequenceU0);
            } else if (N0() != null) {
                N0().w(charSequenceU0);
            } else {
                TextView textView = this.f5114O;
                if (textView != null) {
                    textView.setText(charSequenceU0);
                }
            }
        }
        U();
        L0(this.f5113N);
        this.f5112M = true;
        t tVarT0 = t0(0, false);
        if (this.f5129d0) {
            return;
        }
        if (tVarT0 == null || tVarT0.f5184j == null) {
            A0(108);
        }
    }

    private void l0() {
        if (this.f5149x == null) {
            Object obj = this.f5147v;
            if (obj instanceof Activity) {
                V(((Activity) obj).getWindow());
            }
        }
        if (this.f5149x == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private static Configuration n0(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f7 = configuration.fontScale;
            float f8 = configuration2.fontScale;
            if (f7 != f8) {
                configuration3.fontScale = f8;
            }
            int i7 = configuration.mcc;
            int i8 = configuration2.mcc;
            if (i7 != i8) {
                configuration3.mcc = i8;
            }
            int i9 = configuration.mnc;
            int i10 = configuration2.mnc;
            if (i9 != i10) {
                configuration3.mnc = i10;
            }
            int i11 = Build.VERSION.SDK_INT;
            k.a(configuration, configuration2, configuration3);
            int i12 = configuration.touchscreen;
            int i13 = configuration2.touchscreen;
            if (i12 != i13) {
                configuration3.touchscreen = i13;
            }
            int i14 = configuration.keyboard;
            int i15 = configuration2.keyboard;
            if (i14 != i15) {
                configuration3.keyboard = i15;
            }
            int i16 = configuration.keyboardHidden;
            int i17 = configuration2.keyboardHidden;
            if (i16 != i17) {
                configuration3.keyboardHidden = i17;
            }
            int i18 = configuration.navigation;
            int i19 = configuration2.navigation;
            if (i18 != i19) {
                configuration3.navigation = i19;
            }
            int i20 = configuration.navigationHidden;
            int i21 = configuration2.navigationHidden;
            if (i20 != i21) {
                configuration3.navigationHidden = i21;
            }
            int i22 = configuration.orientation;
            int i23 = configuration2.orientation;
            if (i22 != i23) {
                configuration3.orientation = i23;
            }
            int i24 = configuration.screenLayout & 15;
            int i25 = configuration2.screenLayout;
            if (i24 != (i25 & 15)) {
                configuration3.screenLayout |= i25 & 15;
            }
            int i26 = configuration.screenLayout & 192;
            int i27 = configuration2.screenLayout;
            if (i26 != (i27 & 192)) {
                configuration3.screenLayout |= i27 & 192;
            }
            int i28 = configuration.screenLayout & 48;
            int i29 = configuration2.screenLayout;
            if (i28 != (i29 & 48)) {
                configuration3.screenLayout |= i29 & 48;
            }
            int i30 = configuration.screenLayout & 768;
            int i31 = configuration2.screenLayout;
            if (i30 != (i31 & 768)) {
                configuration3.screenLayout |= i31 & 768;
            }
            if (i11 >= 26) {
                l.a(configuration, configuration2, configuration3);
            }
            int i32 = configuration.uiMode & 15;
            int i33 = configuration2.uiMode;
            if (i32 != (i33 & 15)) {
                configuration3.uiMode |= i33 & 15;
            }
            int i34 = configuration.uiMode & 48;
            int i35 = configuration2.uiMode;
            if (i34 != (i35 & 48)) {
                configuration3.uiMode |= i35 & 48;
            }
            int i36 = configuration.screenWidthDp;
            int i37 = configuration2.screenWidthDp;
            if (i36 != i37) {
                configuration3.screenWidthDp = i37;
            }
            int i38 = configuration.screenHeightDp;
            int i39 = configuration2.screenHeightDp;
            if (i38 != i39) {
                configuration3.screenHeightDp = i39;
            }
            int i40 = configuration.smallestScreenWidthDp;
            int i41 = configuration2.smallestScreenWidthDp;
            if (i40 != i41) {
                configuration3.smallestScreenWidthDp = i41;
            }
            i.b(configuration, configuration2, configuration3);
        }
        return configuration3;
    }

    private int p0(Context context) {
        if (!this.f5134i0 && (this.f5147v instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return 0;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.f5147v.getClass()), Build.VERSION.SDK_INT >= 29 ? 269221888 : 786432);
                if (activityInfo != null) {
                    this.f5133h0 = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e7) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e7);
                this.f5133h0 = 0;
            }
        }
        this.f5134i0 = true;
        return this.f5133h0;
    }

    private p q0(Context context) {
        if (this.f5136k0 == null) {
            this.f5136k0 = new o(context);
        }
        return this.f5136k0;
    }

    private p r0(Context context) {
        if (this.f5135j0 == null) {
            this.f5135j0 = new q(B.a(context));
        }
        return this.f5135j0;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void w0() {
        C c7;
        AbstractC0521a abstractC0521a;
        k0();
        if (!this.f5118S || this.f5100A != null) {
            return;
        }
        Object obj = this.f5147v;
        if (!(obj instanceof Activity)) {
            if (obj instanceof Dialog) {
                c7 = new C((Dialog) this.f5147v);
            }
            abstractC0521a = this.f5100A;
            if (abstractC0521a == null) {
                abstractC0521a.r(this.f5140o0);
                return;
            }
            return;
        }
        c7 = new C((Activity) this.f5147v, this.f5119T);
        this.f5100A = c7;
        abstractC0521a = this.f5100A;
        if (abstractC0521a == null) {
        }
    }

    private boolean x0(t tVar) {
        View view = tVar.f5183i;
        if (view != null) {
            tVar.f5182h = view;
            return true;
        }
        if (tVar.f5184j == null) {
            return false;
        }
        if (this.f5105F == null) {
            this.f5105F = new u();
        }
        View view2 = (View) tVar.a(this.f5105F);
        tVar.f5182h = view2;
        return view2 != null;
    }

    private boolean y0(t tVar) {
        tVar.d(o0());
        tVar.f5181g = new s(tVar.f5186l);
        tVar.f5177c = 81;
        return true;
    }

    private boolean z0(t tVar) {
        Resources.Theme themeNewTheme;
        Context context = this.f5148w;
        int i7 = tVar.f5175a;
        if ((i7 == 0 || i7 == 108) && this.f5103D != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(AbstractC1609a.f18731d, typedValue, true);
            if (typedValue.resourceId != 0) {
                themeNewTheme = context.getResources().newTheme();
                themeNewTheme.setTo(theme);
                themeNewTheme.applyStyle(typedValue.resourceId, true);
                themeNewTheme.resolveAttribute(AbstractC1609a.f18732e, typedValue, true);
            } else {
                theme.resolveAttribute(AbstractC1609a.f18732e, typedValue, true);
                themeNewTheme = null;
            }
            if (typedValue.resourceId != 0) {
                if (themeNewTheme == null) {
                    themeNewTheme = context.getResources().newTheme();
                    themeNewTheme.setTo(theme);
                }
                themeNewTheme.applyStyle(typedValue.resourceId, true);
            }
            if (themeNewTheme != null) {
                androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, 0);
                dVar.getTheme().setTo(themeNewTheme);
                context = dVar;
            }
        }
        androidx.appcompat.view.menu.g gVar = new androidx.appcompat.view.menu.g(context);
        gVar.R(this);
        tVar.c(gVar);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    @Override // androidx.appcompat.app.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void A() {
        if (this.f5147v instanceof Activity) {
            androidx.appcompat.app.f.G(this);
        }
        if (this.f5137l0) {
            this.f5149x.getDecorView().removeCallbacks(this.f5139n0);
        }
        this.f5129d0 = true;
        if (this.f5131f0 != -100) {
            Object obj = this.f5147v;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f5095v0.put(this.f5147v.getClass().getName(), Integer.valueOf(this.f5131f0));
            } else {
                f5095v0.remove(this.f5147v.getClass().getName());
            }
        }
        AbstractC0521a abstractC0521a = this.f5100A;
        if (abstractC0521a != null) {
            abstractC0521a.n();
        }
        a0();
    }

    @Override // androidx.appcompat.app.f
    public void B(Bundle bundle) {
        k0();
    }

    public boolean B0() {
        return this.f5111L;
    }

    @Override // androidx.appcompat.app.f
    public void C() {
        AbstractC0521a abstractC0521aT = t();
        if (abstractC0521aT != null) {
            abstractC0521aT.u(true);
        }
    }

    int C0(Context context, int i7) {
        p pVarR0;
        if (i7 == -100) {
            return -1;
        }
        if (i7 != -1) {
            if (i7 != 0) {
                if (i7 != 1 && i7 != 2) {
                    if (i7 != 3) {
                        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                    pVarR0 = q0(context);
                }
            } else {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                pVarR0 = r0(context);
            }
            return pVarR0.c();
        }
        return i7;
    }

    @Override // androidx.appcompat.app.f
    public void D(Bundle bundle) {
    }

    boolean D0() {
        boolean z6 = this.f5126a0;
        this.f5126a0 = false;
        t tVarT0 = t0(0, false);
        if (tVarT0 != null && tVarT0.f5189o) {
            if (!z6) {
                c0(tVarT0, true);
            }
            return true;
        }
        androidx.appcompat.view.b bVar = this.f5106G;
        if (bVar != null) {
            bVar.c();
            return true;
        }
        AbstractC0521a abstractC0521aT = t();
        return abstractC0521aT != null && abstractC0521aT.h();
    }

    @Override // androidx.appcompat.app.f
    public void E() {
        T(true, false);
    }

    boolean E0(int i7, KeyEvent keyEvent) {
        if (i7 == 4) {
            this.f5126a0 = (keyEvent.getFlags() & 128) != 0;
        } else if (i7 == 82) {
            F0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.f
    public void F() {
        AbstractC0521a abstractC0521aT = t();
        if (abstractC0521aT != null) {
            abstractC0521aT.u(false);
        }
    }

    boolean G0(int i7, KeyEvent keyEvent) {
        AbstractC0521a abstractC0521aT = t();
        if (abstractC0521aT != null && abstractC0521aT.o(i7, keyEvent)) {
            return true;
        }
        t tVar = this.f5125Z;
        if (tVar != null && O0(tVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            t tVar2 = this.f5125Z;
            if (tVar2 != null) {
                tVar2.f5188n = true;
            }
            return true;
        }
        if (this.f5125Z == null) {
            t tVarT0 = t0(0, true);
            P0(tVarT0, keyEvent);
            boolean zO0 = O0(tVarT0, keyEvent.getKeyCode(), keyEvent, 1);
            tVarT0.f5187m = false;
            if (zO0) {
                return true;
            }
        }
        return false;
    }

    boolean H0(int i7, KeyEvent keyEvent) {
        if (i7 != 4) {
            if (i7 == 82) {
                I0(0, keyEvent);
                return true;
            }
        } else if (D0()) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.f
    public boolean I(int i7) {
        int iR0 = R0(i7);
        if (this.f5122W && iR0 == 108) {
            return false;
        }
        if (this.f5118S && iR0 == 1) {
            this.f5118S = false;
        }
        if (iR0 == 1) {
            Z0();
            this.f5122W = true;
            return true;
        }
        if (iR0 == 2) {
            Z0();
            this.f5116Q = true;
            return true;
        }
        if (iR0 == 5) {
            Z0();
            this.f5117R = true;
            return true;
        }
        if (iR0 == 10) {
            Z0();
            this.f5120U = true;
            return true;
        }
        if (iR0 == 108) {
            Z0();
            this.f5118S = true;
            return true;
        }
        if (iR0 != 109) {
            return this.f5149x.requestFeature(iR0);
        }
        Z0();
        this.f5119T = true;
        return true;
    }

    @Override // androidx.appcompat.app.f
    public void J(int i7) {
        k0();
        ViewGroup viewGroup = (ViewGroup) this.f5113N.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f5148w).inflate(i7, viewGroup);
        this.f5150y.c(this.f5149x.getCallback());
    }

    void J0(int i7) {
        AbstractC0521a abstractC0521aT;
        if (i7 != 108 || (abstractC0521aT = t()) == null) {
            return;
        }
        abstractC0521aT.i(true);
    }

    @Override // androidx.appcompat.app.f
    public void K(View view) {
        k0();
        ViewGroup viewGroup = (ViewGroup) this.f5113N.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f5150y.c(this.f5149x.getCallback());
    }

    void K0(int i7) {
        if (i7 == 108) {
            AbstractC0521a abstractC0521aT = t();
            if (abstractC0521aT != null) {
                abstractC0521aT.i(false);
                return;
            }
            return;
        }
        if (i7 == 0) {
            t tVarT0 = t0(i7, true);
            if (tVarT0.f5189o) {
                c0(tVarT0, false);
            }
        }
    }

    @Override // androidx.appcompat.app.f
    public void L(View view, ViewGroup.LayoutParams layoutParams) {
        k0();
        ViewGroup viewGroup = (ViewGroup) this.f5113N.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f5150y.c(this.f5149x.getCallback());
    }

    void L0(ViewGroup viewGroup) {
    }

    @Override // androidx.appcompat.app.f
    public void N(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        OnBackInvokedCallback onBackInvokedCallback;
        super.N(onBackInvokedDispatcher);
        OnBackInvokedDispatcher onBackInvokedDispatcher2 = this.f5145t0;
        if (onBackInvokedDispatcher2 != null && (onBackInvokedCallback = this.f5146u0) != null) {
            m.c(onBackInvokedDispatcher2, onBackInvokedCallback);
            this.f5146u0 = null;
        }
        if (onBackInvokedDispatcher == null) {
            Object obj = this.f5147v;
            if ((obj instanceof Activity) && ((Activity) obj).getWindow() != null) {
                onBackInvokedDispatcher = m.a((Activity) this.f5147v);
            }
        }
        this.f5145t0 = onBackInvokedDispatcher;
        d1();
    }

    final AbstractC0521a N0() {
        return this.f5100A;
    }

    @Override // androidx.appcompat.app.f
    public void O(Toolbar toolbar) {
        if (this.f5147v instanceof Activity) {
            AbstractC0521a abstractC0521aT = t();
            if (abstractC0521aT instanceof C) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.f5101B = null;
            if (abstractC0521aT != null) {
                abstractC0521aT.n();
            }
            this.f5100A = null;
            if (toolbar != null) {
                z zVar = new z(toolbar, u0(), this.f5150y);
                this.f5100A = zVar;
                this.f5150y.e(zVar.f5228c);
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.f5150y.e(null);
            }
            v();
        }
    }

    @Override // androidx.appcompat.app.f
    public void P(int i7) {
        this.f5132g0 = i7;
    }

    @Override // androidx.appcompat.app.f
    public final void Q(CharSequence charSequence) {
        this.f5102C = charSequence;
        I i7 = this.f5103D;
        if (i7 != null) {
            i7.setWindowTitle(charSequence);
            return;
        }
        if (N0() != null) {
            N0().w(charSequence);
            return;
        }
        TextView textView = this.f5114O;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    void S0(Configuration configuration, androidx.core.os.i iVar) {
        k.d(configuration, iVar);
    }

    void T0(androidx.core.os.i iVar) {
        k.c(iVar);
    }

    final boolean U0() {
        ViewGroup viewGroup;
        return this.f5112M && (viewGroup = this.f5113N) != null && H.T(viewGroup);
    }

    androidx.core.os.i W(Context context) {
        androidx.core.os.i iVarS;
        if (Build.VERSION.SDK_INT >= 33 || (iVarS = androidx.appcompat.app.f.s()) == null) {
            return null;
        }
        androidx.core.os.i iVarS0 = s0(context.getApplicationContext().getResources().getConfiguration());
        androidx.core.os.i iVarB = w.b(iVarS, iVarS0);
        return iVarB.f() ? iVarS0 : iVarB;
    }

    boolean W0() {
        if (this.f5145t0 == null) {
            return false;
        }
        t tVarT0 = t0(0, false);
        return (tVarT0 != null && tVarT0.f5189o) || this.f5106G != null;
    }

    public androidx.appcompat.view.b X0(b.a aVar) {
        androidx.appcompat.app.d dVar;
        if (aVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        androidx.appcompat.view.b bVar = this.f5106G;
        if (bVar != null) {
            bVar.c();
        }
        h hVar = new h(aVar);
        AbstractC0521a abstractC0521aT = t();
        if (abstractC0521aT != null) {
            androidx.appcompat.view.b bVarX = abstractC0521aT.x(hVar);
            this.f5106G = bVarX;
            if (bVarX != null && (dVar = this.f5151z) != null) {
                dVar.f(bVarX);
            }
        }
        if (this.f5106G == null) {
            this.f5106G = Y0(hVar);
        }
        d1();
        return this.f5106G;
    }

    void Y(int i7, t tVar, Menu menu) {
        if (menu == null) {
            if (tVar == null && i7 >= 0) {
                t[] tVarArr = this.f5124Y;
                if (i7 < tVarArr.length) {
                    tVar = tVarArr[i7];
                }
            }
            if (tVar != null) {
                menu = tVar.f5184j;
            }
        }
        if ((tVar == null || tVar.f5189o) && !this.f5129d0) {
            this.f5150y.d(this.f5149x.getCallback(), i7, menu);
        }
    }

    androidx.appcompat.view.b Y0(b.a aVar) {
        androidx.appcompat.view.b bVarN;
        Context dVar;
        androidx.appcompat.app.d dVar2;
        j0();
        androidx.appcompat.view.b bVar = this.f5106G;
        if (bVar != null) {
            bVar.c();
        }
        if (!(aVar instanceof h)) {
            aVar = new h(aVar);
        }
        androidx.appcompat.app.d dVar3 = this.f5151z;
        if (dVar3 == null || this.f5129d0) {
            bVarN = null;
        } else {
            try {
                bVarN = dVar3.n(aVar);
            } catch (AbstractMethodError unused) {
                bVarN = null;
            }
        }
        if (bVarN != null) {
            this.f5106G = bVarN;
        } else {
            if (this.f5107H == null) {
                if (this.f5121V) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = this.f5148w.getTheme();
                    theme.resolveAttribute(AbstractC1609a.f18731d, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = this.f5148w.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        dVar = new androidx.appcompat.view.d(this.f5148w, 0);
                        dVar.getTheme().setTo(themeNewTheme);
                    } else {
                        dVar = this.f5148w;
                    }
                    this.f5107H = new ActionBarContextView(dVar);
                    PopupWindow popupWindow = new PopupWindow(dVar, (AttributeSet) null, AbstractC1609a.f18733f);
                    this.f5108I = popupWindow;
                    androidx.core.widget.h.b(popupWindow, 2);
                    this.f5108I.setContentView(this.f5107H);
                    this.f5108I.setWidth(-1);
                    dVar.getTheme().resolveAttribute(AbstractC1609a.f18729b, typedValue, true);
                    this.f5107H.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, dVar.getResources().getDisplayMetrics()));
                    this.f5108I.setHeight(-2);
                    this.f5109J = new d();
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) this.f5113N.findViewById(AbstractC1614f.f18844h);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(o0()));
                        this.f5107H = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (this.f5107H != null) {
                j0();
                this.f5107H.k();
                androidx.appcompat.view.e eVar = new androidx.appcompat.view.e(this.f5107H.getContext(), this.f5107H, aVar, this.f5108I == null);
                if (aVar.b(eVar, eVar.e())) {
                    eVar.k();
                    this.f5107H.h(eVar);
                    this.f5106G = eVar;
                    if (U0()) {
                        this.f5107H.setAlpha(0.0f);
                        O oB = H.e(this.f5107H).b(1.0f);
                        this.f5110K = oB;
                        oB.h(new e());
                    } else {
                        this.f5107H.setAlpha(1.0f);
                        this.f5107H.setVisibility(0);
                        if (this.f5107H.getParent() instanceof View) {
                            H.m0((View) this.f5107H.getParent());
                        }
                    }
                    if (this.f5108I != null) {
                        this.f5149x.getDecorView().post(this.f5109J);
                    }
                } else {
                    this.f5106G = null;
                }
            }
        }
        androidx.appcompat.view.b bVar2 = this.f5106G;
        if (bVar2 != null && (dVar2 = this.f5151z) != null) {
            dVar2.f(bVar2);
        }
        d1();
        return this.f5106G;
    }

    void Z(androidx.appcompat.view.menu.g gVar) {
        if (this.f5123X) {
            return;
        }
        this.f5123X = true;
        this.f5103D.j();
        Window.Callback callbackV0 = v0();
        if (callbackV0 != null && !this.f5129d0) {
            callbackV0.onPanelClosed(108, gVar);
        }
        this.f5123X = false;
    }

    @Override // androidx.appcompat.view.menu.g.a
    public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
        t tVarM0;
        Window.Callback callbackV0 = v0();
        if (callbackV0 == null || this.f5129d0 || (tVarM0 = m0(gVar.D())) == null) {
            return false;
        }
        return callbackV0.onMenuItemSelected(tVarM0.f5175a, menuItem);
    }

    @Override // androidx.appcompat.view.menu.g.a
    public void b(androidx.appcompat.view.menu.g gVar) {
        Q0(true);
    }

    void b0(int i7) {
        c0(t0(i7, true), true);
    }

    void c0(t tVar, boolean z6) {
        ViewGroup viewGroup;
        I i7;
        if (z6 && tVar.f5175a == 0 && (i7 = this.f5103D) != null && i7.c()) {
            Z(tVar.f5184j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f5148w.getSystemService("window");
        if (windowManager != null && tVar.f5189o && (viewGroup = tVar.f5181g) != null) {
            windowManager.removeView(viewGroup);
            if (z6) {
                Y(tVar.f5175a, tVar, null);
            }
        }
        tVar.f5187m = false;
        tVar.f5188n = false;
        tVar.f5189o = false;
        tVar.f5182h = null;
        tVar.f5191q = true;
        if (this.f5125Z == tVar) {
            this.f5125Z = null;
        }
        if (tVar.f5175a == 0) {
            d1();
        }
    }

    void d1() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean zW0 = W0();
            if (zW0 && this.f5146u0 == null) {
                this.f5146u0 = m.b(this.f5145t0, this);
            } else {
                if (zW0 || (onBackInvokedCallback = this.f5146u0) == null) {
                    return;
                }
                m.c(this.f5145t0, onBackInvokedCallback);
            }
        }
    }

    @Override // androidx.appcompat.app.f
    public void e(View view, ViewGroup.LayoutParams layoutParams) {
        k0();
        ((ViewGroup) this.f5113N.findViewById(R.id.content)).addView(view, layoutParams);
        this.f5150y.c(this.f5149x.getCallback());
    }

    @Override // androidx.appcompat.app.f
    public boolean f() {
        return S(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View f0(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z6;
        androidx.appcompat.app.r rVar;
        if (this.f5143r0 == null) {
            String string = this.f5148w.obtainStyledAttributes(e.j.f19144y0).getString(e.j.f18912C0);
            if (string == null) {
                rVar = new androidx.appcompat.app.r();
            } else {
                try {
                    this.f5143r0 = (androidx.appcompat.app.r) this.f5148w.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    rVar = new androidx.appcompat.app.r();
                    this.f5143r0 = rVar;
                }
            }
            this.f5143r0 = rVar;
        }
        boolean z7 = f5096w0;
        boolean zV0 = false;
        if (z7) {
            if (this.f5144s0 == null) {
                this.f5144s0 = new v();
            }
            if (this.f5144s0.a(attributeSet)) {
                z6 = true;
            } else {
                if (!(attributeSet instanceof XmlPullParser)) {
                    zV0 = V0((ViewParent) view);
                } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                    zV0 = true;
                }
                z6 = zV0;
            }
        } else {
            z6 = zV0;
        }
        return this.f5143r0.r(view, str, context, attributeSet, z6, z7, true, q0.c());
    }

    final int f1(U u6, Rect rect) {
        boolean z6;
        boolean z7;
        int iL = u6 != null ? u6.l() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.f5107H;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z6 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f5107H.getLayoutParams();
            if (this.f5107H.isShown()) {
                if (this.f5141p0 == null) {
                    this.f5141p0 = new Rect();
                    this.f5142q0 = new Rect();
                }
                Rect rect2 = this.f5141p0;
                Rect rect3 = this.f5142q0;
                if (u6 == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(u6.j(), u6.l(), u6.k(), u6.i());
                }
                r0.a(this.f5113N, rect2, rect3);
                int i7 = rect2.top;
                int i8 = rect2.left;
                int i9 = rect2.right;
                U uI = H.I(this.f5113N);
                int iJ = uI == null ? 0 : uI.j();
                int iK = uI == null ? 0 : uI.k();
                if (marginLayoutParams.topMargin == i7 && marginLayoutParams.leftMargin == i8 && marginLayoutParams.rightMargin == i9) {
                    z7 = false;
                } else {
                    marginLayoutParams.topMargin = i7;
                    marginLayoutParams.leftMargin = i8;
                    marginLayoutParams.rightMargin = i9;
                    z7 = true;
                }
                if (i7 <= 0 || this.f5115P != null) {
                    View view = this.f5115P;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i10 = marginLayoutParams2.height;
                        int i11 = marginLayoutParams.topMargin;
                        if (i10 != i11 || marginLayoutParams2.leftMargin != iJ || marginLayoutParams2.rightMargin != iK) {
                            marginLayoutParams2.height = i11;
                            marginLayoutParams2.leftMargin = iJ;
                            marginLayoutParams2.rightMargin = iK;
                            this.f5115P.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f5148w);
                    this.f5115P = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iJ;
                    layoutParams.rightMargin = iK;
                    this.f5113N.addView(this.f5115P, -1, layoutParams);
                }
                View view3 = this.f5115P;
                z = view3 != null;
                if (z && view3.getVisibility() != 0) {
                    g1(this.f5115P);
                }
                if (!this.f5120U && z) {
                    iL = 0;
                }
                z6 = z;
                z = z7;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z6 = false;
            } else {
                z6 = false;
                z = false;
            }
            if (z) {
                this.f5107H.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.f5115P;
        if (view4 != null) {
            view4.setVisibility(z6 ? 0 : 8);
        }
        return iL;
    }

    void g0() {
        androidx.appcompat.view.menu.g gVar;
        I i7 = this.f5103D;
        if (i7 != null) {
            i7.j();
        }
        if (this.f5108I != null) {
            this.f5149x.getDecorView().removeCallbacks(this.f5109J);
            if (this.f5108I.isShowing()) {
                try {
                    this.f5108I.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f5108I = null;
        }
        j0();
        t tVarT0 = t0(0, false);
        if (tVarT0 == null || (gVar = tVarT0.f5184j) == null) {
            return;
        }
        gVar.close();
    }

    boolean h0(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f5147v;
        if (((obj instanceof AbstractC0596p.a) || (obj instanceof androidx.appcompat.app.q)) && (decorView = this.f5149x.getDecorView()) != null && AbstractC0596p.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f5150y.b(this.f5149x.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? E0(keyCode, keyEvent) : H0(keyCode, keyEvent);
    }

    @Override // androidx.appcompat.app.f
    public Context i(Context context) {
        this.f5127b0 = true;
        int iC0 = C0(context, X());
        if (androidx.appcompat.app.f.w(context)) {
            androidx.appcompat.app.f.R(context);
        }
        androidx.core.os.i iVarW = W(context);
        if (f5099z0 && (context instanceof ContextThemeWrapper)) {
            try {
                r.a((ContextThemeWrapper) context, d0(context, iC0, iVarW, null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof androidx.appcompat.view.d) {
            try {
                ((androidx.appcompat.view.d) context).a(d0(context, iC0, iVarW, null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f5098y0) {
            return super.i(context);
        }
        Configuration configuration = new Configuration();
        configuration.uiMode = -1;
        configuration.fontScale = 0.0f;
        Configuration configuration2 = i.a(context, configuration).getResources().getConfiguration();
        Configuration configuration3 = context.getResources().getConfiguration();
        configuration2.uiMode = configuration3.uiMode;
        Configuration configurationD0 = d0(context, iC0, iVarW, !configuration2.equals(configuration3) ? n0(configuration2, configuration3) : null, true);
        androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, e.i.f18899c);
        dVar.a(configurationD0);
        try {
            if (context.getTheme() != null) {
                f.C0138f.a(dVar.getTheme());
            }
        } catch (NullPointerException unused3) {
        }
        return super.i(dVar);
    }

    void i0(int i7) {
        t tVarT0;
        t tVarT02 = t0(i7, true);
        if (tVarT02.f5184j != null) {
            Bundle bundle = new Bundle();
            tVarT02.f5184j.Q(bundle);
            if (bundle.size() > 0) {
                tVarT02.f5193s = bundle;
            }
            tVarT02.f5184j.d0();
            tVarT02.f5184j.clear();
        }
        tVarT02.f5192r = true;
        tVarT02.f5191q = true;
        if ((i7 != 108 && i7 != 0) || this.f5103D == null || (tVarT0 = t0(0, false)) == null) {
            return;
        }
        tVarT0.f5187m = false;
        P0(tVarT0, null);
    }

    void j0() {
        O o6 = this.f5110K;
        if (o6 != null) {
            o6.c();
        }
    }

    @Override // androidx.appcompat.app.f
    public View l(int i7) {
        k0();
        return this.f5149x.findViewById(i7);
    }

    t m0(Menu menu) {
        t[] tVarArr = this.f5124Y;
        int length = tVarArr != null ? tVarArr.length : 0;
        for (int i7 = 0; i7 < length; i7++) {
            t tVar = tVarArr[i7];
            if (tVar != null && tVar.f5184j == menu) {
                return tVar;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.app.f
    public Context n() {
        return this.f5148w;
    }

    final Context o0() {
        AbstractC0521a abstractC0521aT = t();
        Context contextK = abstractC0521aT != null ? abstractC0521aT.k() : null;
        return contextK == null ? this.f5148w : contextK;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return f0(view, str, context, attributeSet);
    }

    @Override // androidx.appcompat.app.f
    public int p() {
        return this.f5131f0;
    }

    @Override // androidx.appcompat.app.f
    public MenuInflater r() {
        if (this.f5101B == null) {
            w0();
            AbstractC0521a abstractC0521a = this.f5100A;
            this.f5101B = new androidx.appcompat.view.g(abstractC0521a != null ? abstractC0521a.k() : this.f5148w);
        }
        return this.f5101B;
    }

    androidx.core.os.i s0(Configuration configuration) {
        return k.b(configuration);
    }

    @Override // androidx.appcompat.app.f
    public AbstractC0521a t() {
        w0();
        return this.f5100A;
    }

    protected t t0(int i7, boolean z6) {
        t[] tVarArr = this.f5124Y;
        if (tVarArr == null || tVarArr.length <= i7) {
            t[] tVarArr2 = new t[i7 + 1];
            if (tVarArr != null) {
                System.arraycopy(tVarArr, 0, tVarArr2, 0, tVarArr.length);
            }
            this.f5124Y = tVarArr2;
            tVarArr = tVarArr2;
        }
        t tVar = tVarArr[i7];
        if (tVar != null) {
            return tVar;
        }
        t tVar2 = new t(i7);
        tVarArr[i7] = tVar2;
        return tVar2;
    }

    @Override // androidx.appcompat.app.f
    public void u() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f5148w);
        if (layoutInflaterFrom.getFactory() == null) {
            AbstractC0597q.a(layoutInflaterFrom, this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof g) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    final CharSequence u0() {
        Object obj = this.f5147v;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.f5102C;
    }

    @Override // androidx.appcompat.app.f
    public void v() {
        if (N0() == null || t().l()) {
            return;
        }
        A0(0);
    }

    final Window.Callback v0() {
        return this.f5149x.getCallback();
    }

    @Override // androidx.appcompat.app.f
    public void y(Configuration configuration) {
        AbstractC0521a abstractC0521aT;
        if (this.f5118S && this.f5112M && (abstractC0521aT = t()) != null) {
            abstractC0521aT.m(configuration);
        }
        C0534k.b().g(this.f5148w);
        this.f5130e0 = new Configuration(this.f5148w.getResources().getConfiguration());
        T(false, false);
    }

    @Override // androidx.appcompat.app.f
    public void z(Bundle bundle) {
        String strC;
        this.f5127b0 = true;
        S(false);
        l0();
        Object obj = this.f5147v;
        if (obj instanceof Activity) {
            try {
                strC = AbstractC0557i.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
                strC = null;
            }
            if (strC != null) {
                AbstractC0521a abstractC0521aN0 = N0();
                if (abstractC0521aN0 == null) {
                    this.f5140o0 = true;
                } else {
                    abstractC0521aN0.r(true);
                }
            }
            androidx.appcompat.app.f.d(this);
        }
        this.f5130e0 = new Configuration(this.f5148w.getResources().getConfiguration());
        this.f5128c0 = true;
    }

    g(Dialog dialog, androidx.appcompat.app.d dVar) {
        this(dialog.getContext(), dialog.getWindow(), dVar, dialog);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    private g(Context context, Window window, androidx.appcompat.app.d dVar, Object obj) {
        AbstractActivityC0523c abstractActivityC0523cA1;
        this.f5110K = null;
        this.f5111L = true;
        this.f5131f0 = -100;
        this.f5139n0 = new a();
        this.f5148w = context;
        this.f5151z = dVar;
        this.f5147v = obj;
        if (this.f5131f0 == -100 && (obj instanceof Dialog) && (abstractActivityC0523cA1 = a1()) != null) {
            this.f5131f0 = abstractActivityC0523cA1.Z().p();
        }
        if (this.f5131f0 == -100) {
            n.g gVar = f5095v0;
            Integer num = (Integer) gVar.get(obj.getClass().getName());
            if (num != null) {
                this.f5131f0 = num.intValue();
                gVar.remove(obj.getClass().getName());
            }
        }
        if (window != null) {
            V(window);
        }
        C0534k.h();
    }
}
