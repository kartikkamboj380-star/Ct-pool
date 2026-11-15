package com.facebook.react.runtime;

import android.content.res.AssetManager;
import android.view.ViewGroup;
import com.facebook.fbreact.specs.NativeExceptionsManagerSpec;
import com.facebook.jni.HybridData;
import com.facebook.react.C0824g;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JSBundleLoaderDelegate;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.NativeArray;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.react.bridge.RuntimeScheduler;
import com.facebook.react.bridge.queue.MessageQueueThread;
import com.facebook.react.bridge.queue.MessageQueueThreadSpec;
import com.facebook.react.bridge.queue.QueueThreadExceptionHandler;
import com.facebook.react.bridge.queue.ReactQueueConfiguration;
import com.facebook.react.bridge.queue.ReactQueueConfigurationImpl;
import com.facebook.react.bridge.queue.ReactQueueConfigurationSpec;
import com.facebook.react.devsupport.h0;
import com.facebook.react.fabric.BindingImpl;
import com.facebook.react.fabric.ComponentFactory;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.fabric.ReactNativeConfig;
import com.facebook.react.fabric.events.EventBeatManager;
import com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler;
import com.facebook.react.internal.turbomodule.core.TurboModuleManager;
import com.facebook.react.modules.core.JavaTimerManager;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;
import com.facebook.react.turbomodule.core.NativeMethodCallInvokerHolderImpl;
import com.facebook.react.uimanager.C0877h;
import com.facebook.react.uimanager.C0892s;
import com.facebook.react.uimanager.ComponentNameResolver;
import com.facebook.react.uimanager.ComponentNameResolverBinding;
import com.facebook.react.uimanager.G0;
import com.facebook.react.uimanager.H0;
import com.facebook.react.uimanager.UIConstantsProviderBinding;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.n0;
import com.facebook.soloader.SoLoader;
import d2.C1604a;
import e2.C1619a;
import i2.InterfaceC1741a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class ReactInstance {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f12119j = "ReactInstance";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static volatile boolean f12120k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC0841g f12121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0837c f12122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f12123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ReactQueueConfiguration f12124d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final TurboModuleManager f12125e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final FabricUIManager f12126f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final JavaTimerManager f12127g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final b f12128h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private JavaScriptContextHolder f12129i;

    @R1.a
    private final HybridData mHybridData;

    class a implements JSBundleLoaderDelegate {
        a() {
        }

        @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
        public void loadScriptFromAssets(AssetManager assetManager, String str, boolean z6) {
            ReactInstance.this.f12122b.d(str);
            ReactInstance.this.loadJSBundleFromAssets(assetManager, str);
        }

        @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
        public void loadScriptFromFile(String str, String str2, boolean z6) {
            ReactInstance.this.f12122b.d(str2);
            ReactInstance.this.loadJSBundleFromFile(str, str2);
        }

        @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
        public void loadSplitBundleFromFile(String str, String str2) {
            ReactInstance.this.loadJSBundleFromFile(str, str2);
        }

        @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
        public void setSourceURLs(String str, String str2) {
            ReactInstance.this.f12122b.d(str);
        }
    }

    private static class b implements H0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List f12131a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private C0837c f12132b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Map f12133c = new HashMap();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Map f12134d = null;

        public b(List list, C0837c c0837c) {
            this.f12131a = list;
            this.f12132b = c0837c;
        }

        private ViewManager d(String str) {
            ViewManager viewManagerCreateViewManager;
            if (this.f12133c.containsKey(str)) {
                return (ViewManager) this.f12133c.get(str);
            }
            for (com.facebook.react.M m7 : this.f12131a) {
                if ((m7 instanceof com.facebook.react.Z) && (viewManagerCreateViewManager = ((com.facebook.react.Z) m7).createViewManager(this.f12132b, str)) != null) {
                    this.f12133c.put(str, viewManagerCreateViewManager);
                    return viewManagerCreateViewManager;
                }
            }
            return null;
        }

        @Override // com.facebook.react.uimanager.H0
        public synchronized Collection a() {
            HashSet hashSet;
            hashSet = new HashSet();
            hashSet.addAll(e());
            hashSet.addAll(c().keySet());
            return hashSet;
        }

        @Override // com.facebook.react.uimanager.H0
        public synchronized ViewManager b(String str) {
            ViewManager viewManagerD = d(str);
            if (viewManagerD != null) {
                return viewManagerD;
            }
            return (ViewManager) c().get(str);
        }

        public synchronized Map c() {
            try {
                Map map = this.f12134d;
                if (map != null) {
                    return map;
                }
                HashMap map2 = new HashMap();
                for (com.facebook.react.M m7 : this.f12131a) {
                    if (!(m7 instanceof com.facebook.react.Z)) {
                        for (ViewManager viewManager : m7.createViewManagers(this.f12132b)) {
                            map2.put(viewManager.getName(), viewManager);
                        }
                    }
                }
                this.f12134d = map2;
                return map2;
            } catch (Throwable th) {
                throw th;
            }
        }

        public synchronized Collection e() {
            HashSet hashSet;
            Collection viewManagerNames;
            hashSet = new HashSet();
            for (com.facebook.react.M m7 : this.f12131a) {
                if ((m7 instanceof com.facebook.react.Z) && (viewManagerNames = ((com.facebook.react.Z) m7).getViewManagerNames(this.f12132b)) != null) {
                    hashSet.addAll(viewManagerNames);
                }
            }
            return hashSet;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class c implements ReactJsExceptionHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MessageQueueThread f12135a;

        c(MessageQueueThread messageQueueThread) {
            this.f12135a = messageQueueThread;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(JavaOnlyMap javaOnlyMap) {
            ((NativeExceptionsManagerSpec) O1.a.c(ReactInstance.this.f12125e.getModule(NativeExceptionsManagerSpec.NAME))).reportException(javaOnlyMap);
        }

        @Override // com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler
        public void reportJsException(ReactJsExceptionHandler.ParsedError parsedError) {
            final JavaOnlyMap javaOnlyMapC = h0.c(parsedError);
            this.f12135a.runOnQueue(new Runnable() { // from class: com.facebook.react.runtime.b0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f12163m.b(javaOnlyMapC);
                }
            });
        }
    }

    static {
        y();
    }

    ReactInstance(C0837c c0837c, InterfaceC0841g interfaceC0841g, ComponentFactory componentFactory, X1.e eVar, QueueThreadExceptionHandler queueThreadExceptionHandler, boolean z6, ReactHostInspectorTarget reactHostInspectorTarget) {
        this.f12122b = c0837c;
        this.f12121a = interfaceC0841g;
        P2.a.c(0L, "ReactInstance.initialize");
        ReactQueueConfigurationImpl reactQueueConfigurationImplCreate = ReactQueueConfigurationImpl.create(ReactQueueConfigurationSpec.builder().setJSQueueThreadSpec(MessageQueueThreadSpec.newBackgroundThreadSpec("v_js")).setNativeModulesQueueThreadSpec(MessageQueueThreadSpec.newBackgroundThreadSpec("v_native")).build(), queueThreadExceptionHandler);
        this.f12124d = reactQueueConfigurationImplCreate;
        P0.a.b(f12119j, "Calling initializeMessageQueueThreads()");
        c0837c.initializeMessageQueueThreads(reactQueueConfigurationImplCreate);
        MessageQueueThread jSQueueThread = reactQueueConfigurationImplCreate.getJSQueueThread();
        MessageQueueThread nativeModulesQueueThread = reactQueueConfigurationImplCreate.getNativeModulesQueueThread();
        com.facebook.react.modules.core.a.i(C1604a.b());
        if (z6) {
            eVar.z();
        }
        JSTimerExecutor jSTimerExecutorCreateJSTimerExecutor = createJSTimerExecutor();
        JavaTimerManager javaTimerManager = new JavaTimerManager(c0837c, jSTimerExecutorCreateJSTimerExecutor, com.facebook.react.modules.core.a.h(), eVar);
        this.f12127g = javaTimerManager;
        this.mHybridData = initHybrid(interfaceC0841g.a(), jSQueueThread, nativeModulesQueueThread, javaTimerManager, jSTimerExecutorCreateJSTimerExecutor, new c(nativeModulesQueueThread), interfaceC0841g.getBindingsInstaller(), P2.a.h(0L), reactHostInspectorTarget);
        this.f12129i = new JavaScriptContextHolder(getJavaScriptContext());
        P2.a.c(0L, "ReactInstance.initialize#initTurboModules");
        ArrayList arrayList = new ArrayList();
        this.f12123c = arrayList;
        arrayList.add(new C0840f(c0837c.c(), c0837c.b()));
        if (z6) {
            arrayList.add(new C0824g());
        }
        arrayList.addAll(interfaceC0841g.c());
        com.facebook.react.T tA = interfaceC0841g.f().c(arrayList).d(c0837c).a();
        RuntimeExecutor unbufferedRuntimeExecutor = getUnbufferedRuntimeExecutor();
        this.f12125e = new TurboModuleManager(unbufferedRuntimeExecutor, tA, getJSCallInvokerHolder(), getNativeMethodCallInvokerHolder());
        P2.a.g(0L);
        P2.a.c(0L, "ReactInstance.initialize#initFabric");
        b bVar = new b(arrayList, c0837c);
        this.f12128h = bVar;
        ComponentNameResolverBinding.install(unbufferedRuntimeExecutor, new ComponentNameResolver() { // from class: com.facebook.react.runtime.X
            @Override // com.facebook.react.uimanager.ComponentNameResolver
            public final String[] getComponentNames() {
                return this.f12147a.t();
            }
        });
        if (C1619a.f()) {
            final HashMap map = new HashMap();
            UIConstantsProviderBinding.install(unbufferedRuntimeExecutor, new UIConstantsProviderBinding.DefaultEventTypesProvider() { // from class: com.facebook.react.runtime.Y
                @Override // com.facebook.react.uimanager.UIConstantsProviderBinding.DefaultEventTypesProvider
                public final NativeMap getDefaultEventTypes() {
                    return ReactInstance.u();
                }
            }, new UIConstantsProviderBinding.ConstantsForViewManagerProvider() { // from class: com.facebook.react.runtime.Z
                @Override // com.facebook.react.uimanager.UIConstantsProviderBinding.ConstantsForViewManagerProvider
                public final NativeMap getConstantsForViewManager(String str) {
                    return this.f12148a.v(map, str);
                }
            }, new UIConstantsProviderBinding.ConstantsProvider() { // from class: com.facebook.react.runtime.a0
                @Override // com.facebook.react.uimanager.UIConstantsProviderBinding.ConstantsProvider
                public final NativeMap getConstants() {
                    return this.f12159a.w(map);
                }
            });
        }
        EventBeatManager eventBeatManager = new EventBeatManager();
        FabricUIManager fabricUIManager = new FabricUIManager(c0837c, new G0(bVar), eventBeatManager);
        this.f12126f = fabricUIManager;
        ReactNativeConfig reactNativeConfigB = interfaceC0841g.b();
        C0877h.f(c0837c);
        new BindingImpl().a(getBufferedRuntimeExecutor(), getRuntimeScheduler(), fabricUIManager, eventBeatManager, componentFactory, reactNativeConfigB);
        fabricUIManager.initialize();
        P2.a.g(0L);
        P2.a.g(0L);
    }

    @R1.a
    private static native JSTimerExecutor createJSTimerExecutor();

    private native long getJavaScriptContext();

    private native NativeMethodCallInvokerHolderImpl getNativeMethodCallInvokerHolder();

    private native RuntimeScheduler getRuntimeScheduler();

    private native RuntimeExecutor getUnbufferedRuntimeExecutor();

    private native void handleMemoryPressureJs(int i7);

    @R1.a
    private native HybridData initHybrid(JSRuntimeFactory jSRuntimeFactory, MessageQueueThread messageQueueThread, MessageQueueThread messageQueueThread2, JavaTimerManager javaTimerManager, JSTimerExecutor jSTimerExecutor, ReactJsExceptionHandler reactJsExceptionHandler, BindingsInstaller bindingsInstaller, boolean z6, ReactHostInspectorTarget reactHostInspectorTarget);

    @R1.a
    private native void installGlobals(boolean z6);

    /* JADX INFO: Access modifiers changed from: private */
    public native void loadJSBundleFromAssets(AssetManager assetManager, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public native void loadJSBundleFromFile(String str, String str2);

    private native void registerSegmentNative(int i7, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String[] t() {
        Collection collectionA = this.f12128h.a();
        if (collectionA.size() >= 1) {
            return (String[]) collectionA.toArray(new String[0]);
        }
        P0.a.j(f12119j, "No ViewManager names found");
        return new String[0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ NativeMap u() {
        return Arguments.makeNativeMap((Map<String, Object>) n0.d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ NativeMap v(Map map, String str) {
        ViewManager viewManagerB = this.f12128h.b(str);
        if (viewManagerB == null) {
            return null;
        }
        return (NativeMap) UIManagerModule.getConstantsForViewManager(viewManagerB, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ NativeMap w(Map map) {
        Map<String, Object> mapCreateConstants = UIManagerModule.createConstants(new ArrayList(this.f12128h.c().values()), null, map);
        Collection collectionE = this.f12128h.e();
        if (collectionE.size() > 0) {
            mapCreateConstants.put("ViewManagerNames", new ArrayList(collectionE));
            mapCreateConstants.put("LazyViewManagersEnabled", Boolean.TRUE);
        }
        return Arguments.makeNativeMap(mapCreateConstants);
    }

    private static synchronized void y() {
        if (!f12120k) {
            SoLoader.t("rninstance");
            f12120k = true;
        }
    }

    void A(e0 e0Var) {
        String str = f12119j;
        P0.a.b(str, "startSurface() is called with surface: " + e0Var.n());
        P2.a.c(0L, "ReactInstance.startSurface");
        ViewGroup viewGroupA = e0Var.a();
        if (viewGroupA == null) {
            throw new IllegalStateException("Starting surface without a view is not supported, use prerenderSurface instead.");
        }
        if (viewGroupA.getId() != -1) {
            ReactSoftExceptionLogger.logSoftException(str, new C0892s("surfaceView's is NOT equal to View.NO_ID before calling startSurface."));
            viewGroupA.setId(-1);
        }
        if (e0Var.q()) {
            this.f12126f.attachRootView(e0Var.m(), viewGroupA);
        } else {
            this.f12126f.startSurface(e0Var.m(), e0Var.h(), viewGroupA);
        }
        P2.a.g(0L);
    }

    void B(e0 e0Var) {
        P0.a.b(f12119j, "stopSurface() is called with surface: " + e0Var.n());
        this.f12126f.stopSurface(e0Var.m());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public native void callFunctionOnModule(String str, String str2, NativeArray nativeArray);

    native RuntimeExecutor getBufferedRuntimeExecutor();

    native CallInvokerHolderImpl getJSCallInvokerHolder();

    void i() {
        P0.a.b(f12119j, "ReactInstance.destroy() is called.");
        this.f12124d.destroy();
        this.f12125e.invalidate();
        this.f12126f.invalidate();
        this.f12127g.x();
        this.mHybridData.resetNative();
        this.f12129i.clear();
    }

    com.facebook.react.uimanager.events.e j() {
        return this.f12126f.getEventDispatcher();
    }

    JavaScriptContextHolder k() {
        return this.f12129i;
    }

    public NativeModule l(Class cls) {
        InterfaceC1741a interfaceC1741a = (InterfaceC1741a) cls.getAnnotation(InterfaceC1741a.class);
        if (interfaceC1741a != null) {
            return m(interfaceC1741a.name());
        }
        return null;
    }

    public NativeModule m(String str) {
        NativeModule module;
        synchronized (this.f12125e) {
            module = this.f12125e.getModule(str);
        }
        return module;
    }

    public Collection n() {
        return new ArrayList(this.f12125e.getModules());
    }

    public ReactQueueConfiguration o() {
        return this.f12124d;
    }

    FabricUIManager p() {
        return this.f12126f;
    }

    public void q(int i7) {
        try {
            handleMemoryPressureJs(i7);
        } catch (NullPointerException unused) {
            ReactSoftExceptionLogger.logSoftException(f12119j, new ReactNoCrashSoftException("Native method handleMemoryPressureJs is called earlier than librninstance.so got ready."));
        }
    }

    public boolean r(Class cls) {
        InterfaceC1741a interfaceC1741a = (InterfaceC1741a) cls.getAnnotation(InterfaceC1741a.class);
        if (interfaceC1741a != null) {
            return this.f12125e.hasModule(interfaceC1741a.name());
        }
        return false;
    }

    void s() {
        Iterator<String> it = this.f12125e.getEagerInitModuleNames().iterator();
        while (it.hasNext()) {
            this.f12125e.getModule(it.next());
        }
    }

    native void unregisterFromInspector();

    public void x(JSBundleLoader jSBundleLoader) {
        P2.a.c(0L, "ReactInstance.loadJSBundle");
        jSBundleLoader.loadScript(new a());
        P2.a.g(0L);
    }

    public void z(int i7, String str) {
        registerSegmentNative(i7, str);
    }
}
