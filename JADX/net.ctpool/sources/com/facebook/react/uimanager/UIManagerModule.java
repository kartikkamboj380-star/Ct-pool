package com.facebook.react.uimanager;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.view.View;
import b1.AbstractC0674a;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.OnBatchCompleteListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerListener;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import i2.InterfaceC1741a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import y2.C2239a;
import z2.InterfaceC2256a;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1741a(name = UIManagerModule.NAME)
public class UIManagerModule extends ReactContextBaseJavaModule implements OnBatchCompleteListener, LifecycleEventListener, UIManager {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final boolean DEBUG = a1.c.a().c(AbstractC0674a.f9575f);
    public static final String NAME = "UIManager";
    public static final String TAG = "UIManagerModule";
    private int mBatchId;
    private final Map<String, Object> mCustomDirectEvents;
    private final com.facebook.react.uimanager.events.e mEventDispatcher;
    private final List<o0> mListeners;
    private final e mMemoryTrimCallback;
    private final Map<String, Object> mModuleConstants;
    private final C0882j0 mUIImplementation;
    private final CopyOnWriteArrayList<UIManagerListener> mUIManagerListeners;
    private final G0 mViewManagerRegistry;

    class a implements d {
        a() {
        }
    }

    class b extends GuardedRunnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f12448m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Object f12449n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ReactContext reactContext, int i7, Object obj) {
            super(reactContext);
            this.f12448m = i7;
            this.f12449n = obj;
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            UIManagerModule.this.mUIImplementation.U(this.f12448m, this.f12449n);
        }
    }

    class c extends GuardedRunnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f12451m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f12452n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f12453o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ReactContext reactContext, int i7, int i8, int i9) {
            super(reactContext);
            this.f12451m = i7;
            this.f12452n = i8;
            this.f12453o = i9;
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            UIManagerModule.this.mUIImplementation.X(this.f12451m, this.f12452n, this.f12453o);
            UIManagerModule.this.mUIImplementation.m(-1);
        }
    }

    public interface d {
    }

    private static class e implements ComponentCallbacks2 {
        private e() {
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i7) {
            if (i7 >= 60) {
                L0.a().c();
            }
        }
    }

    public UIManagerModule(ReactApplicationContext reactApplicationContext, H0 h02, int i7) {
        super(reactApplicationContext);
        this.mMemoryTrimCallback = new e();
        this.mListeners = new ArrayList();
        this.mUIManagerListeners = new CopyOnWriteArrayList<>();
        this.mBatchId = 0;
        C0877h.f(reactApplicationContext);
        com.facebook.react.uimanager.events.f fVar = new com.facebook.react.uimanager.events.f(reactApplicationContext);
        this.mEventDispatcher = fVar;
        this.mModuleConstants = createConstants(h02);
        this.mCustomDirectEvents = m0.c();
        G0 g02 = new G0(h02);
        this.mViewManagerRegistry = g02;
        this.mUIImplementation = new C0882j0(reactApplicationContext, g02, fVar, i7);
        reactApplicationContext.addLifecycleEventListener(this);
    }

    private static Map<String, Object> createConstants(H0 h02) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_START);
        P2.b.a(0L, "CreateUIManagerConstants").b("Lazy", Boolean.TRUE).c();
        try {
            return n0.a(h02);
        } finally {
            P2.a.g(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_END);
        }
    }

    public static WritableMap getConstantsForViewManager(ViewManager viewManager, Map<String, Object> map) {
        P2.b.a(0L, "UIManagerModule.getConstantsForViewManager").b("ViewManager", viewManager.getName()).b("Lazy", Boolean.TRUE).c();
        try {
            Map mapC = n0.c(viewManager, null, null, null, map);
            if (mapC != null) {
                return Arguments.makeNativeMap((Map<String, Object>) mapC);
            }
            return null;
        } finally {
            P2.b.b(0L).c();
        }
    }

    public <T extends View> int addRootView(T t6) {
        return addRootView(t6, null);
    }

    public void addUIBlock(InterfaceC0880i0 interfaceC0880i0) {
        this.mUIImplementation.a(interfaceC0880i0);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void addUIManagerEventListener(UIManagerListener uIManagerListener) {
        this.mUIManagerListeners.add(uIManagerListener);
    }

    @Deprecated
    public void addUIManagerListener(o0 o0Var) {
        this.mListeners.add(o0Var);
    }

    @ReactMethod
    public void clearJSResponder() {
        this.mUIImplementation.f();
    }

    @ReactMethod
    public void configureNextLayoutAnimation(ReadableMap readableMap, Callback callback, Callback callback2) {
        this.mUIImplementation.g(readableMap, callback);
    }

    @ReactMethod
    public void createView(int i7, String str, int i8, ReadableMap readableMap) {
        if (DEBUG) {
            String str2 = "(UIManager.createView) tag: " + i7 + ", class: " + str + ", props: " + readableMap;
            P0.a.b("ReactNative", str2);
            a1.c.a().b(AbstractC0674a.f9575f, str2);
        }
        this.mUIImplementation.j(i7, str, i8, readableMap);
    }

    @Override // com.facebook.react.bridge.UIManager
    @Deprecated
    public void dispatchCommand(int i7, int i8, ReadableArray readableArray) {
        this.mUIImplementation.k(i7, i8, readableArray);
    }

    @ReactMethod
    public void dispatchViewManagerCommand(int i7, Dynamic dynamic, ReadableArray readableArray) {
        UIManager uIManagerG = AbstractC0884k0.g(getReactApplicationContext(), C2239a.a(i7));
        if (uIManagerG == null) {
            return;
        }
        if (dynamic.getType() == ReadableType.Number) {
            uIManagerG.dispatchCommand(i7, dynamic.asInt(), readableArray);
        } else if (dynamic.getType() == ReadableType.String) {
            uIManagerG.dispatchCommand(i7, dynamic.asString(), readableArray);
        }
    }

    @ReactMethod
    public void findSubviewIn(int i7, ReadableArray readableArray, Callback callback) {
        this.mUIImplementation.o(i7, Math.round(G.c(readableArray.getDouble(0))), Math.round(G.c(readableArray.getDouble(1))), callback);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return this.mModuleConstants;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getDefaultEventTypes() {
        return Arguments.makeNativeMap((Map<String, Object>) n0.d());
    }

    @Deprecated
    public d getDirectEventNamesResolver() {
        return new a();
    }

    @Override // com.facebook.react.bridge.UIManager
    public com.facebook.react.uimanager.events.e getEventDispatcher() {
        return this.mEventDispatcher;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.PerformanceCounter
    public Map<String, Long> getPerformanceCounters() {
        return this.mUIImplementation.p();
    }

    @Deprecated
    public C0882j0 getUIImplementation() {
        return this.mUIImplementation;
    }

    @Deprecated
    public G0 getViewManagerRegistry_DO_NOT_USE() {
        return this.mViewManagerRegistry;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        getReactApplicationContext().registerComponentCallbacks(this.mMemoryTrimCallback);
        getReactApplicationContext().registerComponentCallbacks(this.mViewManagerRegistry);
        this.mEventDispatcher.a(1, (RCTEventEmitter) getReactApplicationContext().getJSModule(RCTEventEmitter.class));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
        super.invalidate();
        this.mEventDispatcher.g();
        this.mUIImplementation.B();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.unregisterComponentCallbacks(this.mMemoryTrimCallback);
        reactApplicationContext.unregisterComponentCallbacks(this.mViewManagerRegistry);
        L0.a().c();
        C0.a();
    }

    public void invalidateNodeLayout(int i7) {
        U uN = this.mUIImplementation.N(i7);
        if (uN != null) {
            uN.i();
            this.mUIImplementation.m(-1);
        } else {
            P0.a.G("ReactNative", "Warning : attempted to dirty a non-existent react shadow node. reactTag=" + i7);
        }
    }

    @ReactMethod
    public void manageChildren(int i7, ReadableArray readableArray, ReadableArray readableArray2, ReadableArray readableArray3, ReadableArray readableArray4, ReadableArray readableArray5) {
        if (DEBUG) {
            String str = "(UIManager.manageChildren) tag: " + i7 + ", moveFrom: " + readableArray + ", moveTo: " + readableArray2 + ", addTags: " + readableArray3 + ", atIndices: " + readableArray4 + ", removeFrom: " + readableArray5;
            P0.a.b("ReactNative", str);
            a1.c.a().b(AbstractC0674a.f9575f, str);
        }
        this.mUIImplementation.u(i7, readableArray, readableArray2, readableArray3, readableArray4, readableArray5);
    }

    @ReactMethod
    public void measure(int i7, Callback callback) {
        this.mUIImplementation.v(i7, callback);
    }

    @ReactMethod
    public void measureInWindow(int i7, Callback callback) {
        this.mUIImplementation.w(i7, callback);
    }

    @ReactMethod
    public void measureLayout(int i7, int i8, Callback callback, Callback callback2) {
        this.mUIImplementation.x(i7, i8, callback, callback2);
    }

    @Override // com.facebook.react.bridge.OnBatchCompleteListener
    public void onBatchComplete() {
        int i7 = this.mBatchId;
        this.mBatchId = i7 + 1;
        P2.b.a(0L, "onBatchCompleteUI").a("BatchId", i7).c();
        Iterator<o0> it = this.mListeners.iterator();
        if (it.hasNext()) {
            androidx.appcompat.app.y.a(it.next());
            throw null;
        }
        Iterator<UIManagerListener> it2 = this.mUIManagerListeners.iterator();
        while (it2.hasNext()) {
            it2.next().willDispatchViewUpdates(this);
        }
        try {
            if (this.mUIImplementation.q() > 0) {
                this.mUIImplementation.m(i7);
            }
        } finally {
            P2.a.g(0L);
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        this.mUIImplementation.C();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.mUIImplementation.D();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        this.mUIImplementation.E();
    }

    public void prependUIBlock(InterfaceC0880i0 interfaceC0880i0) {
        this.mUIImplementation.F(interfaceC0880i0);
    }

    @Override // com.facebook.react.bridge.PerformanceCounter
    public void profileNextBatch() {
        this.mUIImplementation.G();
    }

    @Override // com.facebook.react.bridge.UIManager
    public void receiveEvent(int i7, int i8, String str, WritableMap writableMap) {
        ((RCTEventEmitter) getReactApplicationContext().getJSModule(RCTEventEmitter.class)).receiveEvent(i8, str, writableMap);
    }

    @ReactMethod
    public void removeRootView(int i7) {
        this.mUIImplementation.J(i7);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void removeUIManagerEventListener(UIManagerListener uIManagerListener) {
        this.mUIManagerListeners.remove(uIManagerListener);
    }

    @Deprecated
    public void removeUIManagerListener(o0 o0Var) {
        this.mListeners.remove(o0Var);
    }

    @Override // com.facebook.react.bridge.UIManager
    @Deprecated
    public String resolveCustomDirectEventName(String str) {
        Map map;
        return (str == null || (map = (Map) this.mCustomDirectEvents.get(str)) == null) ? str : (String) map.get("registrationName");
    }

    @Deprecated
    public int resolveRootTagFromReactTag(int i7) {
        return C2239a.d(i7) ? i7 : this.mUIImplementation.M(i7);
    }

    @Override // com.facebook.react.bridge.UIManager
    public View resolveView(int i7) {
        UiThreadUtil.assertOnUiThread();
        return this.mUIImplementation.r().S().v(i7);
    }

    @Override // com.facebook.react.bridge.UIManager
    @ReactMethod
    public void sendAccessibilityEvent(int i7, int i8) {
        int iA = C2239a.a(i7);
        if (iA != 2) {
            this.mUIImplementation.P(i7, i8);
            return;
        }
        UIManager uIManagerG = AbstractC0884k0.g(getReactApplicationContext(), iA);
        if (uIManagerG != null) {
            uIManagerG.sendAccessibilityEvent(i7, i8);
        }
    }

    @ReactMethod
    public void setChildren(int i7, ReadableArray readableArray) {
        if (DEBUG) {
            String str = "(UIManager.setChildren) tag: " + i7 + ", children: " + readableArray;
            P0.a.b("ReactNative", str);
            a1.c.a().b(AbstractC0674a.f9575f, str);
        }
        this.mUIImplementation.Q(i7, readableArray);
    }

    @ReactMethod
    public void setJSResponder(int i7, boolean z6) {
        this.mUIImplementation.R(i7, z6);
    }

    @ReactMethod
    public void setLayoutAnimationEnabledExperimental(boolean z6) {
        this.mUIImplementation.S(z6);
    }

    public void setViewHierarchyUpdateDebugListener(InterfaceC2256a interfaceC2256a) {
        this.mUIImplementation.T(interfaceC2256a);
    }

    public void setViewLocalData(int i7, Object obj) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.assertOnUiQueueThread();
        reactApplicationContext.runOnNativeModulesQueueThread(new b(reactApplicationContext, i7, obj));
    }

    @Override // com.facebook.react.bridge.UIManager
    public <T extends View> int startSurface(T t6, String str, WritableMap writableMap, int i7, int i8) {
        throw new UnsupportedOperationException();
    }

    @Override // com.facebook.react.bridge.UIManager
    public void stopSurface(int i7) {
        throw new UnsupportedOperationException();
    }

    @Override // com.facebook.react.bridge.UIManager
    public void synchronouslyUpdateViewOnUIThread(int i7, ReadableMap readableMap) {
        this.mUIImplementation.V(i7, new W(readableMap));
    }

    public void updateNodeSize(int i7, int i8, int i9) {
        getReactApplicationContext().assertOnNativeModulesQueueThread();
        this.mUIImplementation.W(i7, i8, i9);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void updateRootLayoutSpecs(int i7, int i8, int i9, int i10, int i11) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.runOnNativeModulesQueueThread(new c(reactApplicationContext, i7, i8, i9));
    }

    @ReactMethod
    public void updateView(int i7, String str, ReadableMap readableMap) {
        if (DEBUG) {
            String str2 = "(UIManager.updateView) tag: " + i7 + ", class: " + str + ", props: " + readableMap;
            P0.a.b("ReactNative", str2);
            a1.c.a().b(AbstractC0674a.f9575f, str2);
        }
        this.mUIImplementation.Z(i7, str, readableMap);
    }

    @ReactMethod
    @Deprecated
    public void viewIsDescendantOf(int i7, int i8, Callback callback) {
        this.mUIImplementation.b0(i7, i8, callback);
    }

    public UIManagerModule(ReactApplicationContext reactApplicationContext, List<ViewManager> list, int i7) {
        super(reactApplicationContext);
        this.mMemoryTrimCallback = new e();
        this.mListeners = new ArrayList();
        this.mUIManagerListeners = new CopyOnWriteArrayList<>();
        this.mBatchId = 0;
        C0877h.f(reactApplicationContext);
        com.facebook.react.uimanager.events.f fVar = new com.facebook.react.uimanager.events.f(reactApplicationContext);
        this.mEventDispatcher = fVar;
        HashMap mapB = S1.f.b();
        this.mCustomDirectEvents = mapB;
        this.mModuleConstants = createConstants(list, null, mapB);
        G0 g02 = new G0(list);
        this.mViewManagerRegistry = g02;
        this.mUIImplementation = new C0882j0(reactApplicationContext, g02, fVar, i7);
        reactApplicationContext.addLifecycleEventListener(this);
    }

    public static Map<String, Object> createConstants(List<ViewManager> list, Map<String, Object> map, Map<String, Object> map2) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_START);
        P2.b.a(0L, "CreateUIManagerConstants").b("Lazy", Boolean.FALSE).c();
        try {
            return n0.b(list, map, map2);
        } finally {
            P2.a.g(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_END);
        }
    }

    @Override // com.facebook.react.bridge.UIManager
    public <T extends View> int addRootView(T t6, WritableMap writableMap) {
        P2.a.c(0L, "UIManagerModule.addRootView");
        int iA = T.a();
        this.mUIImplementation.H(t6, iA, new C0872e0(getReactApplicationContext(), t6.getContext(), ((S) t6).getSurfaceID(), -1));
        P2.a.g(0L);
        return iA;
    }

    @Override // com.facebook.react.bridge.UIManager
    public void dispatchCommand(int i7, String str, ReadableArray readableArray) {
        this.mUIImplementation.l(i7, str, readableArray);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getConstantsForViewManager(String str) {
        ViewManager viewManagerO = this.mUIImplementation.O(str);
        if (viewManagerO == null) {
            return null;
        }
        return getConstantsForViewManager(viewManagerO, this.mCustomDirectEvents);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void receiveEvent(int i7, String str, WritableMap writableMap) {
        receiveEvent(-1, i7, str, writableMap);
    }
}
