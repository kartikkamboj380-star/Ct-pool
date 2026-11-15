package com.facebook.react.views.modal;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.Window;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.r;
import com.facebook.react.uimanager.C0872e0;
import com.facebook.react.uimanager.C0893t;
import com.facebook.react.uimanager.C0894u;
import com.facebook.react.uimanager.G;
import com.facebook.react.uimanager.InterfaceC0870d0;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.Z;
import com.facebook.react.views.view.i;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class f extends ViewGroup implements LifecycleEventListener {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final a f12826v = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Dialog f12827m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f12828n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private DialogInterface.OnShowListener f12829o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private c f12830p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f12831q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f12832r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f12833s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private b f12834t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f12835u;

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final class b extends i implements Z {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private InterfaceC0870d0 f12836m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f12837n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f12838o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f12839p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final C0894u f12840q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private C0893t f12841r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private com.facebook.react.uimanager.events.e f12842s;

        public static final class a extends GuardedRunnable {

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ b f12844m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ int f12845n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ReactContext reactContext, b bVar, int i7) {
                super(reactContext);
                this.f12844m = bVar;
                this.f12845n = i7;
            }

            @Override // com.facebook.react.bridge.GuardedRunnable
            public void runGuarded() {
                UIManagerModule uIManagerModule = (UIManagerModule) this.f12844m.getReactContext().b().getNativeModule(UIManagerModule.class);
                if (uIManagerModule != null) {
                    uIManagerModule.updateNodeSize(this.f12845n, this.f12844m.f12838o, this.f12844m.f12839p);
                }
            }
        }

        public b(Context context) {
            super(context);
            this.f12840q = new C0894u(this);
            if (ReactFeatureFlags.dispatchPointerEvents) {
                this.f12841r = new C0893t(this);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final C0872e0 getReactContext() {
            Context context = getContext();
            k.d(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
            return (C0872e0) context;
        }

        private final void t() {
            if (getChildCount() <= 0) {
                this.f12837n = true;
                return;
            }
            this.f12837n = false;
            int id = getChildAt(0).getId();
            if (this.f12836m != null) {
                u(this.f12838o, this.f12839p);
            } else {
                C0872e0 reactContext = getReactContext();
                reactContext.runOnNativeModulesQueueThread(new a(reactContext, this, id));
            }
        }

        @Override // com.facebook.react.uimanager.Z
        public void a(View view, MotionEvent motionEvent) {
            k.f(view, "childView");
            k.f(motionEvent, "ev");
            com.facebook.react.uimanager.events.e eVar = this.f12842s;
            if (eVar != null) {
                this.f12840q.e(motionEvent, eVar);
                C0893t c0893t = this.f12841r;
                if (c0893t != null) {
                    c0893t.p(view, motionEvent, eVar);
                }
            }
        }

        @Override // com.facebook.react.views.view.i, android.view.ViewGroup
        public void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
            k.f(view, "child");
            k.f(layoutParams, "params");
            super.addView(view, i7, layoutParams);
            if (this.f12837n) {
                t();
            }
        }

        @Override // com.facebook.react.uimanager.Z
        public void b(Throwable th) {
            k.f(th, "t");
            getReactContext().b().handleException(new RuntimeException(th));
        }

        @Override // com.facebook.react.uimanager.Z
        public void d(View view, MotionEvent motionEvent) {
            k.f(view, "childView");
            k.f(motionEvent, "ev");
            com.facebook.react.uimanager.events.e eVar = this.f12842s;
            if (eVar != null) {
                this.f12840q.d(motionEvent, eVar);
            }
            C0893t c0893t = this.f12841r;
            if (c0893t != null) {
                c0893t.o();
            }
        }

        public final com.facebook.react.uimanager.events.e getEventDispatcher$ReactAndroid_release() {
            return this.f12842s;
        }

        public final InterfaceC0870d0 getStateWrapper$ReactAndroid_release() {
            return this.f12836m;
        }

        @Override // android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            C0893t c0893t;
            k.f(motionEvent, "event");
            com.facebook.react.uimanager.events.e eVar = this.f12842s;
            if (eVar != null && (c0893t = this.f12841r) != null) {
                c0893t.k(motionEvent, eVar, false);
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptHoverEvent(MotionEvent motionEvent) {
            C0893t c0893t;
            k.f(motionEvent, "event");
            com.facebook.react.uimanager.events.e eVar = this.f12842s;
            if (eVar != null && (c0893t = this.f12841r) != null) {
                c0893t.k(motionEvent, eVar, true);
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // com.facebook.react.views.view.i, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            k.f(motionEvent, "event");
            com.facebook.react.uimanager.events.e eVar = this.f12842s;
            if (eVar != null) {
                this.f12840q.c(motionEvent, eVar);
                C0893t c0893t = this.f12841r;
                if (c0893t != null) {
                    c0893t.k(motionEvent, eVar, true);
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // com.facebook.react.views.view.i, android.view.View
        protected void onSizeChanged(int i7, int i8, int i9, int i10) {
            super.onSizeChanged(i7, i8, i9, i10);
            this.f12838o = i7;
            this.f12839p = i8;
            t();
        }

        @Override // com.facebook.react.views.view.i, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            k.f(motionEvent, "event");
            com.facebook.react.uimanager.events.e eVar = this.f12842s;
            if (eVar != null) {
                this.f12840q.c(motionEvent, eVar);
                C0893t c0893t = this.f12841r;
                if (c0893t != null) {
                    c0893t.k(motionEvent, eVar, false);
                }
            }
            super.onTouchEvent(motionEvent);
            return true;
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public void requestDisallowInterceptTouchEvent(boolean z6) {
        }

        public final void setEventDispatcher$ReactAndroid_release(com.facebook.react.uimanager.events.e eVar) {
            this.f12842s = eVar;
        }

        public final void setStateWrapper$ReactAndroid_release(InterfaceC0870d0 interfaceC0870d0) {
            this.f12836m = interfaceC0870d0;
        }

        public final void u(int i7, int i8) {
            float fB = G.b(i7);
            float fB2 = G.b(i8);
            InterfaceC0870d0 interfaceC0870d0 = this.f12836m;
            ReadableNativeMap readableNativeMapB = interfaceC0870d0 != null ? interfaceC0870d0.b() : null;
            if (readableNativeMapB != null) {
                float f7 = readableNativeMapB.hasKey("screenHeight") ? (float) readableNativeMapB.getDouble("screenHeight") : 0.0f;
                double d7 = 0.9f;
                if (Math.abs((readableNativeMapB.hasKey("screenWidth") ? (float) readableNativeMapB.getDouble("screenWidth") : 0.0f) - fB) < d7 && Math.abs(f7 - fB2) < d7) {
                    return;
                }
            }
            InterfaceC0870d0 interfaceC0870d02 = this.f12836m;
            if (interfaceC0870d02 != null) {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putDouble("screenWidth", fB);
                writableNativeMap.putDouble("screenHeight", fB2);
                interfaceC0870d02.a(writableNativeMap);
            }
        }
    }

    public interface c {
        void a(DialogInterface dialogInterface);
    }

    public static final class d implements DialogInterface.OnKeyListener {
        d() {
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i7, KeyEvent keyEvent) {
            k.f(dialogInterface, "dialog");
            k.f(keyEvent, "event");
            if (keyEvent.getAction() != 1) {
                return false;
            }
            if (i7 == 4 || i7 == 111) {
                c onRequestCloseListener = f.this.getOnRequestCloseListener();
                if (onRequestCloseListener == null) {
                    throw new IllegalStateException("onRequestClose callback must be set if back key is expected to close the modal".toString());
                }
                onRequestCloseListener.a(dialogInterface);
                return true;
            }
            Context context = f.this.getContext();
            k.d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            Activity currentActivity = ((ReactContext) context).getCurrentActivity();
            if (currentActivity != null) {
                return currentActivity.onKeyUp(i7, keyEvent);
            }
            return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(C0872e0 c0872e0) {
        super(c0872e0);
        k.f(c0872e0, "context");
        c0872e0.addLifecycleEventListener(this);
        this.f12834t = new b(c0872e0);
    }

    private final void a() {
        Activity activity;
        UiThreadUtil.assertOnUiThread();
        Dialog dialog = this.f12827m;
        if (dialog != null) {
            if (dialog.isShowing() && ((activity = (Activity) G2.a.a(dialog.getContext(), Activity.class)) == null || !activity.isFinishing())) {
                dialog.dismiss();
            }
            this.f12827m = null;
            this.f12835u = true;
            ViewParent parent = this.f12834t.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeViewAt(0);
            }
        }
    }

    private final void d() {
        Dialog dialog = this.f12827m;
        if (dialog == null) {
            throw new IllegalStateException("dialog must exist when we call updateProperties".toString());
        }
        Activity currentActivity = getCurrentActivity();
        Window window = dialog.getWindow();
        if (window == null) {
            throw new IllegalStateException("dialog must have window when we call updateProperties".toString());
        }
        k.e(window, "checkNotNull(...)");
        if (currentActivity == null || currentActivity.isFinishing() || !window.isActive()) {
            return;
        }
        Window window2 = currentActivity.getWindow();
        if (window2 != null) {
            if ((window2.getAttributes().flags & 1024) != 0) {
                window.addFlags(1024);
            } else {
                window.clearFlags(1024);
            }
        }
        if (this.f12828n) {
            window.clearFlags(2);
        } else {
            window.setDimAmount(0.5f);
            window.setFlags(2, 2);
        }
    }

    private final void f() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        Dialog dialog = this.f12827m;
        if (dialog == null) {
            throw new IllegalStateException("dialog must exist when we call updateProperties".toString());
        }
        Window window = dialog.getWindow();
        if (window == null) {
            throw new IllegalStateException("dialog must have window when we call updateProperties".toString());
        }
        k.e(window, "checkNotNull(...)");
        int i7 = Build.VERSION.SDK_INT;
        Window window2 = currentActivity.getWindow();
        if (i7 <= 30) {
            if (window2 == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            View decorView = window2.getDecorView();
            k.e(decorView, "getDecorView(...)");
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility());
            return;
        }
        WindowInsetsController insetsController = window2.getInsetsController();
        if (insetsController == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        int systemBarsAppearance = insetsController.getSystemBarsAppearance() & 8;
        WindowInsetsController insetsController2 = window.getInsetsController();
        if (insetsController2 != null) {
            insetsController2.setSystemBarsAppearance(systemBarsAppearance, 8);
        }
    }

    private final View getContentView() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.addView(this.f12834t);
        if (this.f12831q) {
            frameLayout.setSystemUiVisibility(1024);
        } else {
            frameLayout.setFitsSystemWindows(true);
        }
        return frameLayout;
    }

    private final Activity getCurrentActivity() {
        Context context = getContext();
        k.d(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        return ((C0872e0) context).getCurrentActivity();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addChildrenForAccessibility(ArrayList arrayList) {
        k.f(arrayList, "outChildren");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i7) {
        UiThreadUtil.assertOnUiThread();
        this.f12834t.addView(view, i7);
    }

    public final void b() {
        Context context = getContext();
        k.d(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        ((C0872e0) context).removeLifecycleEventListener(this);
        a();
    }

    public final void c() {
        Window window;
        UiThreadUtil.assertOnUiThread();
        if (!this.f12835u) {
            d();
            return;
        }
        a();
        this.f12835u = false;
        String str = this.f12832r;
        int i7 = k.b(str, "fade") ? r.f12044d : k.b(str, "slide") ? r.f12045e : r.f12043c;
        Activity currentActivity = getCurrentActivity();
        Dialog dialog = new Dialog(currentActivity != null ? currentActivity : getContext(), i7);
        this.f12827m = dialog;
        Window window2 = dialog.getWindow();
        Objects.requireNonNull(window2);
        window2.setFlags(8, 8);
        dialog.setContentView(getContentView());
        d();
        dialog.setOnShowListener(this.f12829o);
        dialog.setOnKeyListener(new d());
        Window window3 = dialog.getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(16);
        }
        if (this.f12833s && (window = dialog.getWindow()) != null) {
            window.addFlags(16777216);
        }
        if (currentActivity == null || currentActivity.isFinishing()) {
            return;
        }
        dialog.show();
        f();
        Window window4 = dialog.getWindow();
        if (window4 != null) {
            window4.clearFlags(8);
        }
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        k.f(accessibilityEvent, "event");
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideStructure(ViewStructure viewStructure) {
        k.f(viewStructure, "structure");
        this.f12834t.dispatchProvideStructure(viewStructure);
    }

    public final void e(int i7, int i8) {
        this.f12834t.u(i7, i8);
    }

    public final String getAnimationType() {
        return this.f12832r;
    }

    @Override // android.view.ViewGroup
    public View getChildAt(int i7) {
        return this.f12834t.getChildAt(i7);
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        return this.f12834t.getChildCount();
    }

    public final Dialog getDialog() {
        return this.f12827m;
    }

    public final com.facebook.react.uimanager.events.e getEventDispatcher() {
        return this.f12834t.getEventDispatcher$ReactAndroid_release();
    }

    public final boolean getHardwareAccelerated() {
        return this.f12833s;
    }

    public final c getOnRequestCloseListener() {
        return this.f12830p;
    }

    public final DialogInterface.OnShowListener getOnShowListener() {
        return this.f12829o;
    }

    public final InterfaceC0870d0 getStateWrapper() {
        return this.f12834t.getStateWrapper$ReactAndroid_release();
    }

    public final boolean getStatusBarTranslucent() {
        return this.f12831q;
    }

    public final boolean getTransparent() {
        return this.f12828n;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        b();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        c();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        UiThreadUtil.assertOnUiThread();
        if (view != null) {
            this.f12834t.removeView(view);
        }
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i7) {
        UiThreadUtil.assertOnUiThread();
        this.f12834t.removeView(getChildAt(i7));
    }

    public final void setAnimationType(String str) {
        this.f12832r = str;
        this.f12835u = true;
    }

    public final void setEventDispatcher(com.facebook.react.uimanager.events.e eVar) {
        this.f12834t.setEventDispatcher$ReactAndroid_release(eVar);
    }

    public final void setHardwareAccelerated(boolean z6) {
        this.f12833s = z6;
        this.f12835u = true;
    }

    public final void setOnRequestCloseListener(c cVar) {
        this.f12830p = cVar;
    }

    public final void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.f12829o = onShowListener;
    }

    public final void setStateWrapper(InterfaceC0870d0 interfaceC0870d0) {
        this.f12834t.setStateWrapper$ReactAndroid_release(interfaceC0870d0);
    }

    public final void setStatusBarTranslucent(boolean z6) {
        this.f12831q = z6;
        this.f12835u = true;
    }

    public final void setTransparent(boolean z6) {
        this.f12828n = z6;
    }
}
