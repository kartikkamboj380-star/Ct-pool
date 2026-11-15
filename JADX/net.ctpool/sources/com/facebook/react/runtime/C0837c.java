package com.facebook.react.runtime;

import android.content.Context;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.JavaScriptModuleRegistry;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.interop.InteropModuleRegistry;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicReference;
import m2.InterfaceC1871b;

/* JADX INFO: renamed from: com.facebook.react.runtime.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C0837c extends ReactApplicationContext implements com.facebook.react.uimanager.events.j {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ReactHostImpl f12165m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AtomicReference f12166n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f12167o;

    /* JADX INFO: renamed from: com.facebook.react.runtime.c$a */
    private static class a implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ReactHostImpl f12168a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class f12169b;

        public a(ReactHostImpl reactHostImpl, Class cls) {
            this.f12168a = reactHostImpl;
            this.f12169b = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            this.f12168a.Z(JavaScriptModuleRegistry.getJSModuleName(this.f12169b), method.getName(), objArr != null ? Arguments.fromJavaArgs(objArr) : new WritableNativeArray());
            return null;
        }
    }

    C0837c(Context context, ReactHostImpl reactHostImpl) {
        super(context);
        this.f12166n = new AtomicReference();
        this.f12167o = getClass().getSimpleName();
        this.f12165m = reactHostImpl;
        if (ReactFeatureFlags.unstable_useFabricInterop) {
            initializeInteropModules();
        }
    }

    InterfaceC1871b b() {
        return this.f12165m.i0();
    }

    X1.e c() {
        return this.f12165m.f();
    }

    public void d(String str) {
        this.f12166n.set(str);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public void destroy() {
    }

    @Override // com.facebook.react.bridge.ReactContext
    public void emitDeviceEvent(String str, Object obj) {
        this.f12165m.Z("RCTDeviceEventEmitter", "emit", Arguments.fromJavaArgs(new Object[]{str, obj}));
    }

    @Override // com.facebook.react.bridge.ReactContext
    public CatalystInstance getCatalystInstance() {
        Log.w(this.f12167o, "[WARNING] Bridgeless doesn't support CatalystInstance. Accessing an API that's not part of the new architecture is not encouraged usage.");
        return new BridgelessCatalystInstance(this.f12165m);
    }

    @Override // com.facebook.react.uimanager.events.j
    public com.facebook.react.uimanager.events.e getEventDispatcher() {
        return this.f12165m.k0();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public UIManager getFabricUIManager() {
        return this.f12165m.A0();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public CallInvokerHolder getJSCallInvokerHolder() {
        return this.f12165m.l0();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public JavaScriptModule getJSModule(Class cls) {
        InteropModuleRegistry interopModuleRegistry = this.mInteropModuleRegistry;
        return (interopModuleRegistry == null || !interopModuleRegistry.shouldReturnInteropModule(cls)) ? (JavaScriptModule) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(this.f12165m, cls)) : this.mInteropModuleRegistry.getInteropModule(cls);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public JavaScriptContextHolder getJavaScriptContextHolder() {
        return this.f12165m.m0();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public NativeModule getNativeModule(Class cls) {
        return this.f12165m.p0(cls);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public Collection getNativeModules() {
        return this.f12165m.r0();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public String getSourceURL() {
        return (String) this.f12166n.get();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public void handleException(Exception exc) {
        this.f12165m.B0(exc);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean hasActiveCatalystInstance() {
        return hasActiveReactInstance();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean hasActiveReactInstance() {
        return this.f12165m.D0();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean hasCatalystInstance() {
        return false;
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean hasNativeModule(Class cls) {
        return this.f12165m.C0(cls);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean hasReactInstance() {
        return this.f12165m.D0();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean isBridgeless() {
        return true;
    }

    @Override // com.facebook.react.bridge.ReactContext
    public void registerSegment(int i7, String str, Callback callback) {
        this.f12165m.z1(i7, str, callback);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public NativeModule getNativeModule(String str) {
        return this.f12165m.q0(str);
    }
}
