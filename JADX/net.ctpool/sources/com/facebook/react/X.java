package com.facebook.react;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.modules.appregistry.AppRegistry;
import com.facebook.react.modules.deviceinfo.DeviceInfoModule;
import com.facebook.react.uimanager.AbstractC0884k0;
import com.facebook.react.uimanager.C0864a0;
import com.facebook.react.uimanager.C0877h;
import com.facebook.react.uimanager.C0892s;
import com.facebook.react.uimanager.C0893t;
import com.facebook.react.uimanager.C0894u;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class X extends FrameLayout implements com.facebook.react.uimanager.Z, com.facebook.react.uimanager.S {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f11141A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f11142B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f11143C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f11144D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final AtomicInteger f11145E;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private H f11146m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f11147n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Bundle f11148o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private a f11149p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f11150q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f11151r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f11152s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private C0894u f11153t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private C0893t f11154u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final C0900v f11155v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f11156w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f11157x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f11158y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f11159z;

    private class a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final Rect f11160m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f11161n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f11162o = false;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f11163p = 0;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f11164q = 0;

        a() {
            C0877h.f(X.this.getContext().getApplicationContext());
            this.f11160m = new Rect();
            this.f11161n = (int) com.facebook.react.uimanager.G.d(60.0f);
        }

        private void a() {
            g();
        }

        private void b() {
            int rotation = ((WindowManager) X.this.getContext().getSystemService("window")).getDefaultDisplay().getRotation();
            if (this.f11164q == rotation) {
                return;
            }
            this.f11164q = rotation;
            C0877h.e(X.this.getContext().getApplicationContext());
            f(rotation);
        }

        private void c() {
            boolean zIsVisible;
            X.this.getRootView().getWindowVisibleDisplayFrame(this.f11160m);
            WindowInsets rootWindowInsets = X.this.getRootView().getRootWindowInsets();
            if (rootWindowInsets == null || (zIsVisible = rootWindowInsets.isVisible(WindowInsets.Type.ime())) == this.f11162o) {
                return;
            }
            this.f11162o = zIsVisible;
            if (!zIsVisible) {
                X.this.r("keyboardDidHide", e(com.facebook.react.uimanager.G.b(this.f11160m.height()), 0.0d, com.facebook.react.uimanager.G.b(this.f11160m.width()), 0.0d));
                return;
            }
            int i7 = rootWindowInsets.getInsets(WindowInsets.Type.ime()).bottom - rootWindowInsets.getInsets(WindowInsets.Type.systemBars()).bottom;
            ViewGroup.LayoutParams layoutParams = X.this.getRootView().getLayoutParams();
            O1.a.a(layoutParams instanceof WindowManager.LayoutParams);
            X.this.r("keyboardDidShow", e(com.facebook.react.uimanager.G.b(((WindowManager.LayoutParams) layoutParams).softInputMode == 48 ? this.f11160m.bottom - i7 : this.f11160m.bottom), com.facebook.react.uimanager.G.b(this.f11160m.left), com.facebook.react.uimanager.G.b(this.f11160m.width()), com.facebook.react.uimanager.G.b(i7)));
        }

        private void d() {
            WindowInsets rootWindowInsets;
            DisplayCutout displayCutout;
            X.this.getRootView().getWindowVisibleDisplayFrame(this.f11160m);
            int safeInsetTop = (Build.VERSION.SDK_INT < 28 || (rootWindowInsets = X.this.getRootView().getRootWindowInsets()) == null || (displayCutout = rootWindowInsets.getDisplayCutout()) == null) ? 0 : displayCutout.getSafeInsetTop();
            int i7 = (C0877h.d().heightPixels - this.f11160m.bottom) + safeInsetTop;
            int i8 = this.f11163p;
            if (i8 != i7 && i7 > this.f11161n) {
                this.f11163p = i7;
                this.f11162o = true;
                X.this.r("keyboardDidShow", e(com.facebook.react.uimanager.G.b(r4), com.facebook.react.uimanager.G.b(this.f11160m.left), com.facebook.react.uimanager.G.b(this.f11160m.width()), com.facebook.react.uimanager.G.b(this.f11163p)));
            } else {
                if (i8 == 0 || i7 > this.f11161n) {
                    return;
                }
                this.f11163p = 0;
                this.f11162o = false;
                X.this.r("keyboardDidHide", e(com.facebook.react.uimanager.G.b(r3.height()), 0.0d, com.facebook.react.uimanager.G.b(this.f11160m.width()), 0.0d));
            }
        }

        private WritableMap e(double d7, double d8, double d9, double d10) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            WritableMap writableMapCreateMap2 = Arguments.createMap();
            writableMapCreateMap2.putDouble("height", d10);
            writableMapCreateMap2.putDouble("screenX", d8);
            writableMapCreateMap2.putDouble("width", d9);
            writableMapCreateMap2.putDouble("screenY", d7);
            writableMapCreateMap.putMap("endCoordinates", writableMapCreateMap2);
            writableMapCreateMap.putString("easing", "keyboard");
            writableMapCreateMap.putDouble("duration", 0.0d);
            return writableMapCreateMap;
        }

        private void f(int i7) {
            String str;
            double d7;
            boolean z6 = false;
            if (i7 != 0) {
                if (i7 == 1) {
                    str = "landscape-primary";
                    d7 = -90.0d;
                } else if (i7 == 2) {
                    str = "portrait-secondary";
                    d7 = 180.0d;
                } else {
                    if (i7 != 3) {
                        return;
                    }
                    str = "landscape-secondary";
                    d7 = 90.0d;
                }
                z6 = true;
            } else {
                str = "portrait-primary";
                d7 = 0.0d;
            }
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("name", str);
            writableMapCreateMap.putDouble("rotationDegrees", d7);
            writableMapCreateMap.putBoolean("isLandscape", z6);
            X.this.r("namedOrientationDidChange", writableMapCreateMap);
        }

        private void g() {
            DeviceInfoModule deviceInfoModule;
            ReactContext currentReactContext = X.this.getCurrentReactContext();
            if (currentReactContext == null || (deviceInfoModule = (DeviceInfoModule) currentReactContext.getNativeModule(DeviceInfoModule.class)) == null) {
                return;
            }
            deviceInfoModule.emitUpdateDimensionsEvent();
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (X.this.i() && X.this.o()) {
                if (Build.VERSION.SDK_INT >= 30) {
                    c();
                } else {
                    d();
                }
                b();
                a();
            }
        }
    }

    public interface b {
    }

    public X(Context context) {
        super(context);
        this.f11150q = 0;
        this.f11155v = new C0900v(this);
        this.f11156w = false;
        this.f11157x = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f11158y = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f11159z = 0;
        this.f11141A = 0;
        this.f11142B = Integer.MIN_VALUE;
        this.f11143C = Integer.MIN_VALUE;
        this.f11144D = 1;
        this.f11145E = new AtomicInteger(0);
        k();
    }

    private void f() {
        P2.a.c(0L, "attachToReactInstanceManager");
        ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_ATTACH_TO_REACT_INSTANCE_MANAGER_START);
        if (getId() != -1) {
            ReactSoftExceptionLogger.logSoftException("ReactRootView", new C0892s("Trying to attach a ReactRootView with an explicit id already set to [" + getId() + "]. React Native uses the id field to track react tags and will overwrite this field. If that is fine, explicitly overwrite the id field to View.NO_ID."));
        }
        try {
            if (this.f11151r) {
                return;
            }
            this.f11151r = true;
            ((H) O1.a.c(this.f11146m)).r(this);
            getViewTreeObserver().addOnGlobalLayoutListener(getCustomGlobalLayoutListener());
        } finally {
            ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_ATTACH_TO_REACT_INSTANCE_MANAGER_END);
            P2.a.g(0L);
        }
    }

    private a getCustomGlobalLayoutListener() {
        if (this.f11149p == null) {
            this.f11149p = new a();
        }
        return this.f11149p;
    }

    private void k() {
        setRootViewTag(com.facebook.react.uimanager.T.a());
        setClipChildren(false);
    }

    private boolean l() {
        String str;
        if (!i() || !o()) {
            str = "Unable to dispatch touch to JS as the catalyst instance has not been attached";
        } else if (this.f11153t == null) {
            str = "Unable to dispatch touch to JS before the dispatcher is available";
        } else {
            if (!ReactFeatureFlags.dispatchPointerEvents || this.f11154u != null) {
                return true;
            }
            str = "Unable to dispatch pointer events to JS before the dispatcher is available";
        }
        P0.a.G("ReactRootView", str);
        return false;
    }

    private boolean m() {
        return getUIManagerType() == 2;
    }

    private boolean n() {
        int i7 = this.f11150q;
        return (i7 == 0 || i7 == -1) ? false : true;
    }

    private void q() {
        getViewTreeObserver().removeOnGlobalLayoutListener(getCustomGlobalLayoutListener());
    }

    private void s() {
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        this.f11157x = View.MeasureSpec.makeMeasureSpec(displayMetrics.widthPixels, Integer.MIN_VALUE);
        this.f11158y = View.MeasureSpec.makeMeasureSpec(displayMetrics.heightPixels, Integer.MIN_VALUE);
    }

    private void w(boolean z6, int i7, int i8) {
        UIManager uIManagerG;
        int i9;
        int i10;
        ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_UPDATE_LAYOUT_SPECS_START);
        if (!j()) {
            ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_UPDATE_LAYOUT_SPECS_END);
            P0.a.G("ReactRootView", "Unable to update root layout specs for uninitialized ReactInstanceManager");
            return;
        }
        boolean zM = m();
        if (zM && !n()) {
            ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_UPDATE_LAYOUT_SPECS_END);
            P0.a.j("ReactRootView", "Unable to update root layout specs for ReactRootView: no rootViewTag set yet");
            return;
        }
        ReactContext currentReactContext = getCurrentReactContext();
        if (currentReactContext != null && (uIManagerG = AbstractC0884k0.g(currentReactContext, getUIManagerType())) != null) {
            if (zM) {
                Point pointB = C0864a0.b(this);
                i9 = pointB.x;
                i10 = pointB.y;
            } else {
                i9 = 0;
                i10 = 0;
            }
            if (z6 || i9 != this.f11142B || i10 != this.f11143C) {
                uIManagerG.updateRootLayoutSpecs(getRootViewTag(), i7, i8, i9, i10);
            }
            this.f11142B = i9;
            this.f11143C = i10;
        }
        ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_UPDATE_LAYOUT_SPECS_END);
    }

    @Override // com.facebook.react.uimanager.Z
    public void a(View view, MotionEvent motionEvent) {
        com.facebook.react.uimanager.events.e eVarB;
        C0893t c0893t;
        if (l() && (eVarB = AbstractC0884k0.b(getCurrentReactContext(), getUIManagerType())) != null) {
            this.f11153t.e(motionEvent, eVarB);
            if (view == null || (c0893t = this.f11154u) == null) {
                return;
            }
            c0893t.p(view, motionEvent, eVarB);
        }
    }

    @Override // com.facebook.react.uimanager.Z
    public void b(Throwable th) {
        if (!i()) {
            throw new RuntimeException(th);
        }
        getCurrentReactContext().handleException(new C0892s(th.getMessage(), this, th));
    }

    @Override // com.facebook.react.uimanager.S
    public void c(int i7) {
        if (i7 != 101) {
            return;
        }
        p();
    }

    @Override // com.facebook.react.uimanager.Z
    public void d(View view, MotionEvent motionEvent) {
        com.facebook.react.uimanager.events.e eVarB;
        if (l() && (eVarB = AbstractC0884k0.b(getCurrentReactContext(), getUIManagerType())) != null) {
            this.f11153t.d(motionEvent, eVarB);
            C0893t c0893t = this.f11154u;
            if (c0893t != null) {
                c0893t.o();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        try {
            super.dispatchDraw(canvas);
        } catch (StackOverflowError e7) {
            b(e7);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (i() && o()) {
            this.f11155v.d(keyEvent);
        } else {
            P0.a.G("ReactRootView", "Unable to handle key event as the catalyst instance has not been attached");
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // com.facebook.react.uimanager.S
    public void e() {
        P2.a.c(0L, "ReactRootView.runApplication");
        try {
            if (j() && o()) {
                ReactContext currentReactContext = getCurrentReactContext();
                if (currentReactContext == null) {
                    P2.a.g(0L);
                    return;
                }
                CatalystInstance catalystInstance = currentReactContext.getCatalystInstance();
                String jSModuleName = getJSModuleName();
                if (this.f11156w) {
                    w(true, this.f11157x, this.f11158y);
                }
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putDouble("rootTag", getRootViewTag());
                Bundle appProperties = getAppProperties();
                if (appProperties != null) {
                    writableNativeMap.putMap("initialProps", Arguments.fromBundle(appProperties));
                }
                this.f11152s = true;
                ((AppRegistry) catalystInstance.getJSModule(AppRegistry.class)).runApplication(jSModuleName, writableNativeMap);
                P2.a.g(0L);
            }
        } finally {
            P2.a.g(0L);
        }
    }

    protected void finalize() throws Throwable {
        super.finalize();
        O1.a.b(!this.f11151r, "The application this ReactRootView was rendering was not unmounted before the ReactRootView was garbage collected. This usually means that your application is leaking large amounts of memory. To solve this, make sure to call ReactRootView#unmountReactApplication in the onDestroy() of your hosting Activity or in the onDestroyView() of your hosting Fragment.");
    }

    protected void g(MotionEvent motionEvent, boolean z6) {
        String str;
        if (!i() || !o()) {
            str = "Unable to dispatch touch to JS as the catalyst instance has not been attached";
        } else {
            if (this.f11154u != null) {
                com.facebook.react.uimanager.events.e eVarB = AbstractC0884k0.b(getCurrentReactContext(), getUIManagerType());
                if (eVarB != null) {
                    this.f11154u.k(motionEvent, eVarB, z6);
                    return;
                }
                return;
            }
            if (!ReactFeatureFlags.dispatchPointerEvents) {
                return;
            } else {
                str = "Unable to dispatch pointer events to JS before the dispatcher is available";
            }
        }
        P0.a.G("ReactRootView", str);
    }

    @Override // com.facebook.react.uimanager.S
    public Bundle getAppProperties() {
        return this.f11148o;
    }

    public ReactContext getCurrentReactContext() {
        return this.f11146m.C();
    }

    @Override // com.facebook.react.uimanager.S
    public int getHeightMeasureSpec() {
        return this.f11158y;
    }

    @Override // com.facebook.react.uimanager.S
    public String getJSModuleName() {
        return (String) O1.a.c(this.f11147n);
    }

    public H getReactInstanceManager() {
        return this.f11146m;
    }

    @Override // com.facebook.react.uimanager.S
    public ViewGroup getRootViewGroup() {
        return this;
    }

    @Override // com.facebook.react.uimanager.S
    public int getRootViewTag() {
        return this.f11150q;
    }

    @Override // com.facebook.react.uimanager.S
    public AtomicInteger getState() {
        return this.f11145E;
    }

    @Override // com.facebook.react.uimanager.S
    public String getSurfaceID() {
        Bundle appProperties = getAppProperties();
        if (appProperties != null) {
            return appProperties.getString("surfaceID");
        }
        return null;
    }

    @Override // com.facebook.react.uimanager.S
    public int getUIManagerType() {
        return this.f11144D;
    }

    @Override // com.facebook.react.uimanager.S
    public int getWidthMeasureSpec() {
        return this.f11157x;
    }

    protected void h(MotionEvent motionEvent) {
        String str;
        if (!i() || !o()) {
            str = "Unable to dispatch touch to JS as the catalyst instance has not been attached";
        } else {
            if (this.f11153t != null) {
                com.facebook.react.uimanager.events.e eVarB = AbstractC0884k0.b(getCurrentReactContext(), getUIManagerType());
                if (eVarB != null) {
                    this.f11153t.c(motionEvent, eVarB);
                    return;
                }
                return;
            }
            str = "Unable to dispatch touch to JS before the dispatcher is available";
        }
        P0.a.G("ReactRootView", str);
    }

    public boolean i() {
        H h7 = this.f11146m;
        return (h7 == null || h7.C() == null) ? false : true;
    }

    public boolean j() {
        return this.f11146m != null;
    }

    public boolean o() {
        return this.f11151r;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (o()) {
            q();
            getViewTreeObserver().addOnGlobalLayoutListener(getCustomGlobalLayoutListener());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (o()) {
            q();
        }
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z6, int i7, Rect rect) {
        if (i() && o()) {
            this.f11155v.a();
        } else {
            P0.a.G("ReactRootView", "Unable to handle focus changed event as the catalyst instance has not been attached");
        }
        super.onFocusChanged(z6, i7, rect);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        g(motionEvent, false);
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptHoverEvent(MotionEvent motionEvent) {
        g(motionEvent, true);
        return super.onInterceptHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (t(motionEvent)) {
            h(motionEvent);
        }
        g(motionEvent, true);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        if (this.f11156w && m()) {
            w(false, this.f11157x, this.f11158y);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i7, int i8) {
        int iMax;
        int iMax2;
        P2.a.c(0L, "ReactRootView.onMeasure");
        ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_ON_MEASURE_START);
        try {
            boolean z6 = (i7 == this.f11157x && i8 == this.f11158y) ? false : true;
            this.f11157x = i7;
            this.f11158y = i8;
            int mode = View.MeasureSpec.getMode(i7);
            if (mode == Integer.MIN_VALUE || mode == 0) {
                iMax = 0;
                for (int i9 = 0; i9 < getChildCount(); i9++) {
                    View childAt = getChildAt(i9);
                    iMax = Math.max(iMax, childAt.getLeft() + childAt.getMeasuredWidth() + childAt.getPaddingLeft() + childAt.getPaddingRight());
                }
            } else {
                iMax = View.MeasureSpec.getSize(i7);
            }
            int mode2 = View.MeasureSpec.getMode(i8);
            if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
                iMax2 = 0;
                for (int i10 = 0; i10 < getChildCount(); i10++) {
                    View childAt2 = getChildAt(i10);
                    iMax2 = Math.max(iMax2, childAt2.getTop() + childAt2.getMeasuredHeight() + childAt2.getPaddingTop() + childAt2.getPaddingBottom());
                }
            } else {
                iMax2 = View.MeasureSpec.getSize(i8);
            }
            setMeasuredDimension(iMax, iMax2);
            this.f11156w = true;
            if (j() && !o()) {
                f();
            } else if (z6 || this.f11159z != iMax || this.f11141A != iMax2) {
                w(true, this.f11157x, this.f11158y);
            }
            this.f11159z = iMax;
            this.f11141A = iMax2;
            ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_ON_MEASURE_END);
            P2.a.g(0L);
        } catch (Throwable th) {
            ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_ON_MEASURE_END);
            P2.a.g(0L);
            throw th;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (t(motionEvent)) {
            h(motionEvent);
        }
        g(motionEvent, false);
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (this.f11152s) {
            this.f11152s = false;
            ReactMarker.logMarker(ReactMarkerConstants.CONTENT_APPEARED, getJSModuleName(), this.f11150q);
        }
    }

    public void p() {
        this.f11153t = new C0894u(this);
        if (ReactFeatureFlags.dispatchPointerEvents) {
            this.f11154u = new C0893t(this);
        }
    }

    void r(String str, WritableMap writableMap) {
        if (j()) {
            getCurrentReactContext().emitDeviceEvent(str, writableMap);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (i() && o()) {
            this.f11155v.e(view2);
        } else {
            P0.a.G("ReactRootView", "Unable to handle child focus changed event as the catalyst instance has not been attached");
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z6) {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(z6);
        }
    }

    public void setAppProperties(Bundle bundle) {
        UiThreadUtil.assertOnUiThread();
        this.f11148o = bundle;
        if (n()) {
            e();
        }
    }

    public void setEventListener(b bVar) {
    }

    public void setIsFabric(boolean z6) {
        this.f11144D = z6 ? 2 : 1;
    }

    @Override // com.facebook.react.uimanager.S
    public void setRootViewTag(int i7) {
        this.f11150q = i7;
    }

    @Override // com.facebook.react.uimanager.S
    public void setShouldLogContentAppeared(boolean z6) {
        this.f11152s = z6;
    }

    public boolean t(MotionEvent motionEvent) {
        return true;
    }

    public void u(H h7, String str, Bundle bundle) {
        P2.a.c(0L, "startReactApplication");
        try {
            UiThreadUtil.assertOnUiThread();
            O1.a.b(this.f11146m == null, "This root view has already been attached to a catalyst instance manager");
            this.f11146m = h7;
            this.f11147n = str;
            this.f11148o = bundle;
            h7.x();
            if (ReactFeatureFlags.enableEagerRootViewAttachment) {
                if (!this.f11156w) {
                    s();
                }
                f();
            }
            P2.a.g(0L);
        } catch (Throwable th) {
            P2.a.g(0L);
            throw th;
        }
    }

    public void v() {
        UiThreadUtil.assertOnUiThread();
        H h7 = this.f11146m;
        if (h7 != null && this.f11151r) {
            h7.A(this);
            this.f11151r = false;
        }
        this.f11146m = null;
        this.f11152s = false;
    }
}
