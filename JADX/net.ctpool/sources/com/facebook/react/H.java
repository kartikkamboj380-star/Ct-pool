package com.facebook.react;

import X1.e;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.view.View;
import android.view.ViewGroup;
import b1.AbstractC0674a;
import com.facebook.react.T;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BridgeReactContext;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.CatalystInstanceImpl;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.NativeModuleRegistry;
import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactCxxErrorHandler;
import com.facebook.react.bridge.ReactInstanceManagerInspectorTarget;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerProvider;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.bridge.queue.ReactQueueConfigurationSpec;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.devsupport.InspectorFlags;
import com.facebook.react.devsupport.a0;
import com.facebook.react.internal.turbomodule.core.TurboModuleManager;
import com.facebook.react.modules.appearance.AppearanceModule;
import com.facebook.react.modules.appregistry.AppRegistry;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.AbstractC0884k0;
import com.facebook.react.uimanager.C0877h;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.soloader.SoLoader;
import d2.C1604a;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m2.InterfaceC1871b;
import n2.InterfaceC1899a;

/* JADX INFO: loaded from: classes.dex */
public class H {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final String f11051D = "H";

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final T.a f11052A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private List f11053B;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile LifecycleState f11056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private f f11057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile Thread f11058d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final JavaScriptExecutorFactory f11059e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final JSBundleLoader f11061g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f11062h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f11063i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final X1.e f11064j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f11065k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f11066l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f11067m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final NotThreadSafeBridgeIdleDebugListener f11068n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private volatile ReactContext f11070p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Context f11071q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private InterfaceC1871b f11072r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Activity f11073s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ReactInstanceManagerInspectorTarget f11074t;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final ComponentCallbacks2C0827j f11078x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final JSExceptionHandler f11079y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final UIManagerProvider f11080z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f11055a = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Collection f11060f = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Object f11069o = new Object();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Collection f11075u = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private volatile boolean f11076v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private volatile Boolean f11077w = Boolean.FALSE;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f11054C = true;

    class a implements InterfaceC1871b {
        a() {
        }

        @Override // m2.InterfaceC1871b
        public void c() {
            H.this.L();
        }
    }

    class b implements a0 {
        b() {
        }

        @Override // com.facebook.react.devsupport.a0
        public View a(String str) {
            Activity activityJ = j();
            if (activityJ == null) {
                return null;
            }
            X x6 = new X(activityJ);
            x6.setIsFabric(ReactFeatureFlags.enableFabricRenderer);
            x6.u(H.this, str, new Bundle());
            return x6;
        }

        @Override // com.facebook.react.devsupport.a0
        public JavaScriptExecutorFactory b() {
            return H.this.E();
        }

        @Override // com.facebook.react.devsupport.a0
        public void d(View view) {
            if (view instanceof X) {
                ((X) view).v();
            }
        }

        @Override // com.facebook.react.devsupport.a0
        public void h() {
            H.this.u0();
        }

        @Override // com.facebook.react.devsupport.a0
        public Activity j() {
            return H.this.f11073s;
        }
    }

    class c implements X1.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1899a f11083a;

        c(InterfaceC1899a interfaceC1899a) {
            this.f11083a = interfaceC1899a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(boolean z6, InterfaceC1899a interfaceC1899a) {
            if (z6) {
                H.this.f11064j.q();
                return;
            }
            if (H.this.f11064j.A() && !interfaceC1899a.m() && !H.this.f11054C) {
                H.this.g0();
            } else {
                interfaceC1899a.f(false);
                H.this.m0();
            }
        }

        @Override // X1.g
        public void a(final boolean z6) {
            final InterfaceC1899a interfaceC1899a = this.f11083a;
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.I
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11092m.c(z6, interfaceC1899a);
                }
            });
        }
    }

    class d implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ View f11085m;

        d(View view) {
            this.f11085m = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f11085m.removeOnAttachStateChangeListener(this);
            H.this.f11064j.s(true);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    class e implements ReactInstanceManagerInspectorTarget.TargetDelegate {

        class a implements e.a {
            a() {
            }

            @Override // X1.e.a
            public void a() {
                UiThreadUtil.assertOnUiThread();
                if (H.this.f11074t != null) {
                    H.this.f11074t.sendDebuggerResumeCommand();
                }
            }
        }

        e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b() {
            H.this.f11064j.q();
        }

        @Override // com.facebook.react.bridge.ReactInstanceManagerInspectorTarget.TargetDelegate
        public void onReload() {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.J
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11095m.b();
                }
            });
        }

        @Override // com.facebook.react.bridge.ReactInstanceManagerInspectorTarget.TargetDelegate
        public void onSetPausedInDebuggerMessage(String str) {
            if (str == null) {
                H.this.f11064j.g();
            } else {
                H.this.f11064j.i(str, new a());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final JavaScriptExecutorFactory f11089a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final JSBundleLoader f11090b;

        public f(JavaScriptExecutorFactory javaScriptExecutorFactory, JSBundleLoader jSBundleLoader) {
            this.f11089a = (JavaScriptExecutorFactory) O1.a.c(javaScriptExecutorFactory);
            this.f11090b = (JSBundleLoader) O1.a.c(jSBundleLoader);
        }

        public JSBundleLoader a() {
            return this.f11090b;
        }

        public JavaScriptExecutorFactory b() {
            return this.f11089a;
        }
    }

    H(Context context, Activity activity, InterfaceC1871b interfaceC1871b, JavaScriptExecutorFactory javaScriptExecutorFactory, JSBundleLoader jSBundleLoader, String str, List list, boolean z6, com.facebook.react.devsupport.F f7, boolean z7, boolean z8, NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener, LifecycleState lifecycleState, JSExceptionHandler jSExceptionHandler, X1.i iVar, boolean z9, X1.b bVar, int i7, int i8, UIManagerProvider uIManagerProvider, Map map, T.a aVar, S1.j jVar, X1.c cVar, d2.b bVar2, X1.h hVar) {
        P0.a.b(f11051D, "ReactInstanceManager.ctor()");
        K(context);
        C0877h.f(context);
        this.f11071q = context;
        this.f11073s = activity;
        this.f11072r = interfaceC1871b;
        this.f11059e = javaScriptExecutorFactory;
        this.f11061g = jSBundleLoader;
        this.f11062h = str;
        ArrayList arrayList = new ArrayList();
        this.f11063i = arrayList;
        this.f11065k = z6;
        this.f11066l = z7;
        this.f11067m = z8;
        P2.a.c(0L, "ReactInstanceManager.initDevSupportManager");
        X1.e eVarA = f7.a(context, v(), str, z6, iVar, bVar, i7, map, jVar, cVar, hVar);
        this.f11064j = eVarA;
        P2.a.g(0L);
        this.f11068n = notThreadSafeBridgeIdleDebugListener;
        this.f11056b = lifecycleState;
        this.f11078x = new ComponentCallbacks2C0827j(context);
        this.f11079y = jSExceptionHandler;
        this.f11052A = aVar;
        synchronized (arrayList) {
            try {
                a1.c.a().b(AbstractC0674a.f9572c, "RNCore: Use Split Packages");
                arrayList.add(new C0796d(this, new a(), z9, i8));
                if (z6) {
                    arrayList.add(new C0824g());
                }
                arrayList.addAll(list);
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f11080z = uIManagerProvider;
        com.facebook.react.modules.core.a.i(bVar2 != null ? bVar2 : C1604a.b());
        if (z6) {
            eVarA.z();
        }
        o0();
    }

    private void B(com.facebook.react.uimanager.S s6, ReactContext reactContext) {
        P0.a.b("ReactNative", "ReactInstanceManager.detachRootViewFromInstance()");
        UiThreadUtil.assertOnUiThread();
        if (s6.getState().compareAndSet(1, 0)) {
            int uIManagerType = s6.getUIManagerType();
            if (uIManagerType == 2) {
                int rootViewTag = s6.getRootViewTag();
                if (rootViewTag != -1) {
                    UIManager uIManagerG = AbstractC0884k0.g(reactContext, uIManagerType);
                    if (uIManagerG != null) {
                        uIManagerG.stopSurface(rootViewTag);
                    } else {
                        P0.a.G("ReactNative", "Failed to stop surface, UIManager has already gone away");
                    }
                } else {
                    ReactSoftExceptionLogger.logSoftException(f11051D, new RuntimeException("detachRootViewFromInstance called with ReactRootView with invalid id"));
                }
            } else {
                ((AppRegistry) reactContext.getCatalystInstance().getJSModule(AppRegistry.class)).unmountApplicationComponentAtRootTag(s6.getRootViewTag());
            }
            u(s6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JavaScriptExecutorFactory E() {
        return this.f11059e;
    }

    private ReactInstanceManagerInspectorTarget F() {
        if (this.f11074t == null && InspectorFlags.getFuseboxEnabled()) {
            this.f11074t = new ReactInstanceManagerInspectorTarget(new e());
        }
        return this.f11074t;
    }

    static void K(Context context) {
        SoLoader.m(context, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L() {
        UiThreadUtil.assertOnUiThread();
        InterfaceC1871b interfaceC1871b = this.f11072r;
        if (interfaceC1871b != null) {
            interfaceC1871b.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void M(int i7, com.facebook.react.uimanager.S s6) {
        P2.a.e(0L, "pre_rootView.onAttachedToReactInstance", i7);
        s6.c(101);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N() {
        f fVar = this.f11057c;
        if (fVar != null) {
            q0(fVar);
            this.f11057c = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O(ReactApplicationContext reactApplicationContext) {
        try {
            r0(reactApplicationContext);
        } catch (Exception e7) {
            this.f11064j.handleException(e7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P(f fVar) {
        ReactMarker.logMarker(ReactMarkerConstants.REACT_CONTEXT_THREAD_END);
        synchronized (this.f11077w) {
            while (this.f11077w.booleanValue()) {
                try {
                    this.f11077w.wait();
                } catch (InterruptedException unused) {
                }
            }
        }
        this.f11076v = true;
        try {
            Process.setThreadPriority(-4);
            ReactMarker.logMarker(ReactMarkerConstants.VM_INIT);
            final ReactApplicationContext reactApplicationContextW = w(fVar.b().create(), fVar.a());
            try {
                this.f11058d = null;
                ReactMarker.logMarker(ReactMarkerConstants.PRE_SETUP_REACT_CONTEXT_START);
                Runnable runnable = new Runnable() { // from class: com.facebook.react.C
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f11045m.N();
                    }
                };
                reactApplicationContextW.runOnNativeModulesQueueThread(new Runnable() { // from class: com.facebook.react.D
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f11046m.O(reactApplicationContextW);
                    }
                });
                UiThreadUtil.runOnUiThread(runnable);
            } catch (Exception e7) {
                this.f11064j.handleException(e7);
            }
        } catch (Exception e8) {
            this.f11076v = false;
            this.f11058d = null;
            this.f11064j.handleException(e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q(InterfaceC0918z[] interfaceC0918zArr, ReactApplicationContext reactApplicationContext) {
        T();
        for (InterfaceC0918z interfaceC0918z : interfaceC0918zArr) {
            if (interfaceC0918z != null) {
                interfaceC0918z.a(reactApplicationContext);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void R() {
        Process.setThreadPriority(0);
        ReactMarker.logMarker(ReactMarkerConstants.CHANGE_THREAD_PRIORITY, "js_default");
    }

    private synchronized void T() {
        if (this.f11056b == LifecycleState.f11401o) {
            W(true);
        }
    }

    private synchronized void U() {
        try {
            ReactContext reactContextC = C();
            if (reactContextC != null) {
                if (this.f11056b == LifecycleState.f11401o) {
                    reactContextC.onHostPause();
                    this.f11056b = LifecycleState.f11400n;
                }
                if (this.f11056b == LifecycleState.f11400n) {
                    reactContextC.onHostDestroy(this.f11067m);
                }
            } else {
                z();
            }
            this.f11056b = LifecycleState.f11399m;
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized void V() {
        try {
            ReactContext reactContextC = C();
            if (reactContextC != null) {
                if (this.f11056b == LifecycleState.f11399m) {
                    reactContextC.onHostResume(this.f11073s);
                } else if (this.f11056b == LifecycleState.f11401o) {
                }
                reactContextC.onHostPause();
            }
            this.f11056b = LifecycleState.f11400n;
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized void W(boolean z6) {
        try {
            ReactContext reactContextC = C();
            if (reactContextC != null && (z6 || this.f11056b == LifecycleState.f11400n || this.f11056b == LifecycleState.f11399m)) {
                reactContextC.onHostResume(this.f11073s);
            }
            this.f11056b = LifecycleState.f11401o;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0() {
        P0.a.b("ReactNative", "ReactInstanceManager.onJSBundleLoadedFromServer()");
        l0(this.f11059e, JSBundleLoader.createCachedBundleFromNetworkLoader(this.f11064j.v(), this.f11064j.k()));
    }

    private void j0(M m7, C0828k c0828k) {
        P2.b.a(0L, "processPackage").b("className", m7.getClass().getSimpleName()).c();
        boolean z6 = m7 instanceof P;
        if (z6) {
            ((P) m7).a();
        }
        c0828k.b(m7);
        if (z6) {
            ((P) m7).b();
        }
        P2.b.b(0L).c();
    }

    private NativeModuleRegistry k0(ReactApplicationContext reactApplicationContext, List list) {
        C0828k c0828k = new C0828k(reactApplicationContext, this);
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_PACKAGES_START);
        synchronized (this.f11063i) {
            try {
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        M m7 = (M) it.next();
                        P2.a.c(0L, "createAndProcessCustomReactPackage");
                        try {
                            j0(m7, c0828k);
                            P2.a.g(0L);
                        } catch (Throwable th) {
                            P2.a.g(0L);
                            throw th;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_PACKAGES_END);
        ReactMarker.logMarker(ReactMarkerConstants.BUILD_NATIVE_MODULE_REGISTRY_START);
        P2.a.c(0L, "buildNativeModuleRegistry");
        try {
            return c0828k.a();
        } finally {
            P2.a.g(0L);
            ReactMarker.logMarker(ReactMarkerConstants.BUILD_NATIVE_MODULE_REGISTRY_END);
        }
    }

    private void l0(JavaScriptExecutorFactory javaScriptExecutorFactory, JSBundleLoader jSBundleLoader) {
        P0.a.b("ReactNative", "ReactInstanceManager.recreateReactContextInBackground()");
        UiThreadUtil.assertOnUiThread();
        f fVar = new f(javaScriptExecutorFactory, jSBundleLoader);
        if (this.f11058d == null) {
            q0(fVar);
        } else {
            this.f11057c = fVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0() {
        P0.a.b(f11051D, "ReactInstanceManager.recreateReactContextInBackgroundFromBundleLoader()");
        a1.c.a().b(AbstractC0674a.f9572c, "RNCore: load from BundleLoader");
        l0(this.f11059e, this.f11061g);
    }

    private void n0() {
        P0.a.b(f11051D, "ReactInstanceManager.recreateReactContextInBackgroundInner()");
        a1.c.a().b(AbstractC0674a.f9572c, "RNCore: recreateReactContextInBackground");
        UiThreadUtil.assertOnUiThread();
        if (this.f11065k && this.f11062h != null) {
            InterfaceC1899a interfaceC1899aW = this.f11064j.w();
            if (!P2.a.h(0L)) {
                if (this.f11061g == null) {
                    this.f11064j.q();
                    return;
                } else {
                    this.f11064j.u(new c(interfaceC1899aW));
                    return;
                }
            }
        }
        m0();
    }

    private void o0() {
        Method method;
        try {
            method = H.class.getMethod("I", Exception.class);
        } catch (NoSuchMethodException e7) {
            P0.a.k("ReactInstanceHolder", "Failed to set cxx error handler function", e7);
            method = null;
        }
        ReactCxxErrorHandler.setHandleErrorFunc(this, method);
    }

    private void q0(final f fVar) {
        P0.a.b("ReactNative", "ReactInstanceManager.runCreateReactContextOnNewThread()");
        UiThreadUtil.assertOnUiThread();
        ReactMarker.logMarker(ReactMarkerConstants.REACT_BRIDGE_LOADING_START);
        synchronized (this.f11055a) {
            synchronized (this.f11069o) {
                try {
                    if (this.f11070p != null) {
                        t0(this.f11070p);
                        this.f11070p = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f11058d = new Thread(null, new Runnable() { // from class: com.facebook.react.A
            @Override // java.lang.Runnable
            public final void run() {
                this.f11041m.P(fVar);
            }
        }, "create_react_context");
        ReactMarker.logMarker(ReactMarkerConstants.REACT_CONTEXT_THREAD_START);
        this.f11058d.start();
    }

    private void r0(final ReactApplicationContext reactApplicationContext) {
        P0.a.b("ReactNative", "ReactInstanceManager.setupReactContext()");
        ReactMarker.logMarker(ReactMarkerConstants.PRE_SETUP_REACT_CONTEXT_END);
        ReactMarker.logMarker(ReactMarkerConstants.SETUP_REACT_CONTEXT_START);
        P2.a.c(0L, "setupReactContext");
        synchronized (this.f11055a) {
            try {
                synchronized (this.f11069o) {
                    this.f11070p = (ReactContext) O1.a.c(reactApplicationContext);
                }
                CatalystInstance catalystInstance = (CatalystInstance) O1.a.c(reactApplicationContext.getCatalystInstance());
                catalystInstance.initialize();
                this.f11064j.p(reactApplicationContext);
                this.f11078x.a(catalystInstance);
                ReactMarker.logMarker(ReactMarkerConstants.ATTACH_MEASURED_ROOT_VIEWS_START);
                Iterator it = this.f11055a.iterator();
                while (it.hasNext()) {
                    s((com.facebook.react.uimanager.S) it.next());
                }
                ReactMarker.logMarker(ReactMarkerConstants.ATTACH_MEASURED_ROOT_VIEWS_END);
            } catch (Throwable th) {
                throw th;
            }
        }
        final InterfaceC0918z[] interfaceC0918zArr = (InterfaceC0918z[]) this.f11075u.toArray(new InterfaceC0918z[this.f11075u.size()]);
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.E
            @Override // java.lang.Runnable
            public final void run() {
                this.f11048m.Q(interfaceC0918zArr, reactApplicationContext);
            }
        });
        reactApplicationContext.runOnJSQueueThread(new Runnable() { // from class: com.facebook.react.F
            @Override // java.lang.Runnable
            public final void run() {
                H.R();
            }
        });
        reactApplicationContext.runOnNativeModulesQueueThread(new Runnable() { // from class: com.facebook.react.G
            @Override // java.lang.Runnable
            public final void run() {
                Process.setThreadPriority(0);
            }
        });
        P2.a.g(0L);
        ReactMarker.logMarker(ReactMarkerConstants.SETUP_REACT_CONTEXT_END);
        ReactMarker.logMarker(ReactMarkerConstants.REACT_BRIDGE_LOADING_END);
    }

    private void s(final com.facebook.react.uimanager.S s6) {
        final int iAddRootView;
        P0.a.b("ReactNative", "ReactInstanceManager.attachRootViewToInstance()");
        if (s6.getState().compareAndSet(0, 1)) {
            P2.a.c(0L, "attachRootViewToInstance");
            UIManager uIManagerG = AbstractC0884k0.g(this.f11070p, s6.getUIManagerType());
            if (uIManagerG == null) {
                throw new IllegalStateException("Unable to attach a rootView to ReactInstance when UIManager is not properly initialized.");
            }
            Bundle appProperties = s6.getAppProperties();
            if (s6.getUIManagerType() == 2) {
                iAddRootView = uIManagerG.startSurface(s6.getRootViewGroup(), s6.getJSModuleName(), appProperties == null ? new WritableNativeMap() : Arguments.fromBundle(appProperties), s6.getWidthMeasureSpec(), s6.getHeightMeasureSpec());
                s6.setShouldLogContentAppeared(true);
            } else {
                iAddRootView = uIManagerG.addRootView(s6.getRootViewGroup(), appProperties == null ? new WritableNativeMap() : Arguments.fromBundle(appProperties));
                s6.setRootViewTag(iAddRootView);
                s6.e();
            }
            P2.a.a(0L, "pre_rootView.onAttachedToReactInstance", iAddRootView);
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.B
                @Override // java.lang.Runnable
                public final void run() {
                    H.M(iAddRootView, s6);
                }
            });
            P2.a.g(0L);
        }
    }

    public static K t() {
        return new K();
    }

    private void t0(ReactContext reactContext) {
        P0.a.b("ReactNative", "ReactInstanceManager.tearDownReactContext()");
        UiThreadUtil.assertOnUiThread();
        if (this.f11056b == LifecycleState.f11401o) {
            reactContext.onHostPause();
        }
        synchronized (this.f11055a) {
            try {
                Iterator it = this.f11055a.iterator();
                while (it.hasNext()) {
                    B((com.facebook.react.uimanager.S) it.next(), reactContext);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f11078x.d(reactContext.getCatalystInstance());
        reactContext.destroy();
        this.f11064j.D(reactContext);
    }

    private void u(com.facebook.react.uimanager.S s6) {
        UiThreadUtil.assertOnUiThread();
        s6.getState().compareAndSet(1, 0);
        ViewGroup rootViewGroup = s6.getRootViewGroup();
        rootViewGroup.removeAllViews();
        rootViewGroup.setId(-1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u0() {
        ReactContext reactContextC = C();
        if (reactContextC == null || !reactContextC.hasActiveReactInstance()) {
            ReactSoftExceptionLogger.logSoftException(f11051D, new ReactNoCrashSoftException("Cannot toggleElementInspector, CatalystInstance not available"));
        } else {
            reactContextC.emitDeviceEvent("toggleElementInspector");
        }
    }

    private a0 v() {
        return new b();
    }

    private ReactApplicationContext w(JavaScriptExecutor javaScriptExecutor, JSBundleLoader jSBundleLoader) {
        UIManager uIManagerCreateUIManager;
        T.a aVar;
        P0.a.b("ReactNative", "ReactInstanceManager.createReactContext()");
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_REACT_CONTEXT_START, javaScriptExecutor.getName());
        BridgeReactContext bridgeReactContext = new BridgeReactContext(this.f11071q);
        JSExceptionHandler jSExceptionHandler = this.f11079y;
        if (jSExceptionHandler == null) {
            jSExceptionHandler = this.f11064j;
        }
        bridgeReactContext.setJSExceptionHandler(jSExceptionHandler);
        CatalystInstanceImpl.Builder inspectorTarget = new CatalystInstanceImpl.Builder().setReactQueueConfigurationSpec(ReactQueueConfigurationSpec.createDefault()).setJSExecutor(javaScriptExecutor).setRegistry(k0(bridgeReactContext, this.f11063i)).setJSBundleLoader(jSBundleLoader).setJSExceptionHandler(jSExceptionHandler).setInspectorTarget(F());
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_CATALYST_INSTANCE_START);
        P2.a.c(0L, "createCatalystInstance");
        try {
            CatalystInstanceImpl catalystInstanceImplBuild = inspectorTarget.build();
            P2.a.g(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_CATALYST_INSTANCE_END);
            bridgeReactContext.initializeWithInstance(catalystInstanceImplBuild);
            catalystInstanceImplBuild.getRuntimeScheduler();
            if (ReactFeatureFlags.useTurboModules && (aVar = this.f11052A) != null) {
                TurboModuleManager turboModuleManager = new TurboModuleManager(catalystInstanceImplBuild.getRuntimeExecutor(), aVar.c(this.f11063i).d(bridgeReactContext).a(), catalystInstanceImplBuild.getJSCallInvokerHolder(), catalystInstanceImplBuild.getNativeMethodCallInvokerHolder());
                catalystInstanceImplBuild.setTurboModuleRegistry(turboModuleManager);
                Iterator<String> it = turboModuleManager.getEagerInitModuleNames().iterator();
                while (it.hasNext()) {
                    turboModuleManager.getModule(it.next());
                }
            }
            UIManagerProvider uIManagerProvider = this.f11080z;
            if (uIManagerProvider != null && (uIManagerCreateUIManager = uIManagerProvider.createUIManager(bridgeReactContext)) != null) {
                catalystInstanceImplBuild.setFabricUIManager(uIManagerCreateUIManager);
                uIManagerCreateUIManager.initialize();
                catalystInstanceImplBuild.setFabricUIManager(uIManagerCreateUIManager);
            }
            NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener = this.f11068n;
            if (notThreadSafeBridgeIdleDebugListener != null) {
                catalystInstanceImplBuild.addBridgeIdleDebugListener(notThreadSafeBridgeIdleDebugListener);
            }
            if (P2.a.h(0L)) {
                catalystInstanceImplBuild.setGlobalVariable("__RCTProfileIsProfiling", "true");
            }
            ReactMarker.logMarker(ReactMarkerConstants.PRE_RUN_JS_BUNDLE_START);
            P2.a.c(0L, "runJSBundle");
            catalystInstanceImplBuild.runJSBundle();
            P2.a.g(0L);
            return bridgeReactContext;
        } catch (Throwable th) {
            P2.a.g(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_CATALYST_INSTANCE_END);
            throw th;
        }
    }

    private void z() {
        ReactInstanceManagerInspectorTarget reactInstanceManagerInspectorTarget = this.f11074t;
        if (reactInstanceManagerInspectorTarget != null) {
            reactInstanceManagerInspectorTarget.close();
            this.f11074t = null;
        }
    }

    public void A(com.facebook.react.uimanager.S s6) {
        ReactContext reactContext;
        UiThreadUtil.assertOnUiThread();
        if (this.f11055a.remove(s6) && (reactContext = this.f11070p) != null && reactContext.hasActiveReactInstance()) {
            B(s6, reactContext);
        }
    }

    public ReactContext C() {
        ReactContext reactContext;
        synchronized (this.f11069o) {
            reactContext = this.f11070p;
        }
        return reactContext;
    }

    public X1.e D() {
        return this.f11064j;
    }

    public List G(ReactApplicationContext reactApplicationContext) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_VIEW_MANAGERS_START);
        P2.a.c(0L, "createAllViewManagers");
        try {
            if (this.f11053B == null) {
                synchronized (this.f11063i) {
                    try {
                        if (this.f11053B == null) {
                            ArrayList arrayList = new ArrayList();
                            Iterator it = this.f11063i.iterator();
                            while (it.hasNext()) {
                                arrayList.addAll(((M) it.next()).createViewManagers(reactApplicationContext));
                            }
                            this.f11053B = arrayList;
                            P2.a.g(0L);
                            ReactMarker.logMarker(ReactMarkerConstants.CREATE_VIEW_MANAGERS_END);
                            return arrayList;
                        }
                    } finally {
                    }
                }
            }
            List list = this.f11053B;
            P2.a.g(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_VIEW_MANAGERS_END);
            return list;
        } catch (Throwable th) {
            P2.a.g(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_VIEW_MANAGERS_END);
            throw th;
        }
    }

    public Collection H() {
        Collection collection;
        P2.a.c(0L, "ReactInstanceManager.getViewManagerNames");
        try {
            Collection collection2 = this.f11060f;
            if (collection2 != null) {
                return collection2;
            }
            synchronized (this.f11069o) {
                ReactApplicationContext reactApplicationContext = (ReactApplicationContext) C();
                if (reactApplicationContext != null && reactApplicationContext.hasActiveReactInstance()) {
                    synchronized (this.f11063i) {
                        try {
                            if (this.f11060f == null) {
                                HashSet hashSet = new HashSet();
                                for (M m7 : this.f11063i) {
                                    P2.b.a(0L, "ReactInstanceManager.getViewManagerName").b("Package", m7.getClass().getSimpleName()).c();
                                    if (m7 instanceof Z) {
                                        Collection viewManagerNames = ((Z) m7).getViewManagerNames(reactApplicationContext);
                                        if (viewManagerNames != null) {
                                            hashSet.addAll(viewManagerNames);
                                        }
                                    } else {
                                        P0.a.I("ReactNative", "Package %s is not a ViewManagerOnDemandReactPackage, view managers will not be loaded", m7.getClass().getSimpleName());
                                    }
                                    P2.a.g(0L);
                                }
                                this.f11060f = hashSet;
                            }
                            collection = this.f11060f;
                        } finally {
                        }
                    }
                    return collection;
                }
                P0.a.G("ReactNative", "Calling getViewManagerNames without active context");
                return Collections.emptyList();
            }
        } finally {
            P2.a.g(0L);
        }
    }

    public void I(Exception exc) {
        this.f11064j.handleException(exc);
    }

    public boolean J() {
        return this.f11076v;
    }

    public void X(Activity activity, int i7, int i8, Intent intent) {
        ReactContext reactContextC = C();
        if (reactContextC != null) {
            reactContextC.onActivityResult(activity, i7, i8, intent);
        }
    }

    public void Y() {
        UiThreadUtil.assertOnUiThread();
        ReactContext reactContext = this.f11070p;
        if (reactContext == null) {
            P0.a.G(f11051D, "Instance detached from instance manager");
            L();
        } else {
            DeviceEventManagerModule deviceEventManagerModule = (DeviceEventManagerModule) reactContext.getNativeModule(DeviceEventManagerModule.class);
            if (deviceEventManagerModule != null) {
                deviceEventManagerModule.emitHardwareBackPressed();
            }
        }
    }

    public void Z(Context context, Configuration configuration) {
        AppearanceModule appearanceModule;
        UiThreadUtil.assertOnUiThread();
        ReactContext reactContextC = C();
        if (reactContextC == null || (appearanceModule = (AppearanceModule) reactContextC.getNativeModule(AppearanceModule.class)) == null) {
            return;
        }
        appearanceModule.onConfigurationChanged(context);
    }

    public void a0() {
        UiThreadUtil.assertOnUiThread();
        if (this.f11065k) {
            this.f11064j.s(false);
        }
        U();
        if (this.f11067m) {
            return;
        }
        this.f11073s = null;
    }

    public void b0(Activity activity) {
        if (activity == this.f11073s) {
            a0();
        }
    }

    public void c0() {
        UiThreadUtil.assertOnUiThread();
        this.f11072r = null;
        if (this.f11065k) {
            this.f11064j.s(false);
        }
        V();
    }

    public void d0(Activity activity) {
        if (this.f11066l) {
            O1.a.a(this.f11073s != null);
        }
        Activity activity2 = this.f11073s;
        if (activity2 != null) {
            O1.a.b(activity == activity2, "Pausing an activity that is not the current activity, this is incorrect! Current activity: " + this.f11073s.getClass().getSimpleName() + " Paused activity: " + activity.getClass().getSimpleName());
        }
        c0();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void e0(Activity activity) {
        UiThreadUtil.assertOnUiThread();
        this.f11073s = activity;
        if (this.f11065k) {
            if (activity != null) {
                View decorView = activity.getWindow().getDecorView();
                if (androidx.core.view.H.S(decorView)) {
                    this.f11064j.s(true);
                } else {
                    decorView.addOnAttachStateChangeListener(new d(decorView));
                }
            } else if (!this.f11066l) {
            }
        }
        W(false);
    }

    public void f0(Activity activity, InterfaceC1871b interfaceC1871b) {
        UiThreadUtil.assertOnUiThread();
        this.f11072r = interfaceC1871b;
        e0(activity);
    }

    public void h0(Intent intent) {
        DeviceEventManagerModule deviceEventManagerModule;
        UiThreadUtil.assertOnUiThread();
        ReactContext reactContextC = C();
        if (reactContextC == null) {
            P0.a.G(f11051D, "Instance detached from instance manager");
            return;
        }
        String action = intent.getAction();
        Uri data = intent.getData();
        if (data != null && (("android.intent.action.VIEW".equals(action) || "android.nfc.action.NDEF_DISCOVERED".equals(action)) && (deviceEventManagerModule = (DeviceEventManagerModule) reactContextC.getNativeModule(DeviceEventManagerModule.class)) != null)) {
            deviceEventManagerModule.emitNewIntentReceived(data);
        }
        reactContextC.onNewIntent(this.f11073s, intent);
    }

    public void i0(boolean z6) {
        UiThreadUtil.assertOnUiThread();
        ReactContext reactContextC = C();
        if (reactContextC != null) {
            reactContextC.onWindowFocusChange(z6);
        }
    }

    public void p0(InterfaceC0918z interfaceC0918z) {
        this.f11075u.remove(interfaceC0918z);
    }

    public void q(InterfaceC0918z interfaceC0918z) {
        this.f11075u.add(interfaceC0918z);
    }

    public void r(com.facebook.react.uimanager.S s6) {
        UiThreadUtil.assertOnUiThread();
        if (this.f11055a.add(s6)) {
            u(s6);
        } else {
            P0.a.j("ReactNative", "ReactRoot was attached multiple times");
        }
        ReactContext reactContextC = C();
        if (this.f11058d != null || reactContextC == null) {
            return;
        }
        s(s6);
    }

    public void s0() {
        UiThreadUtil.assertOnUiThread();
        this.f11064j.C();
    }

    public void x() {
        P0.a.b(f11051D, "ReactInstanceManager.createReactContextInBackground()");
        UiThreadUtil.assertOnUiThread();
        if (this.f11076v) {
            return;
        }
        this.f11076v = true;
        n0();
    }

    public ViewManager y(String str) {
        ViewManager viewManagerCreateViewManager;
        synchronized (this.f11069o) {
            ReactApplicationContext reactApplicationContext = (ReactApplicationContext) C();
            if (reactApplicationContext != null && reactApplicationContext.hasActiveReactInstance()) {
                synchronized (this.f11063i) {
                    try {
                        for (M m7 : this.f11063i) {
                            if ((m7 instanceof Z) && (viewManagerCreateViewManager = ((Z) m7).createViewManager(reactApplicationContext, str)) != null) {
                                return viewManagerCreateViewManager;
                            }
                        }
                        return null;
                    } finally {
                    }
                }
            }
            return null;
        }
    }
}
