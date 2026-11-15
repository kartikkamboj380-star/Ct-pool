package com.facebook.react.runtime;

import android.content.res.AssetManager;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeArray;
import com.facebook.react.bridge.NativeArrayInterface;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.NativeModuleRegistry;
import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.react.bridge.RuntimeScheduler;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.queue.ReactQueueConfiguration;
import com.facebook.react.internal.turbomodule.core.interfaces.TurboModuleRegistry;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import com.facebook.react.turbomodule.core.interfaces.NativeMethodCallInvokerHolder;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
@R1.a
public final class BridgelessCatalystInstance implements CatalystInstance {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReactHostImpl f12051a;

    public BridgelessCatalystInstance(ReactHostImpl reactHostImpl) {
        w5.k.f(reactHostImpl, "reactHost");
        this.f12051a = reactHostImpl;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void addBridgeIdleDebugListener(NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener) {
        w5.k.f(notThreadSafeBridgeIdleDebugListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        throw new UnsupportedOperationException("Unimplemented method 'addBridgeIdleDebugListener'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void callFunction(String str, String str2, NativeArray nativeArray) {
        w5.k.f(str, "module");
        w5.k.f(str2, "method");
        throw new UnsupportedOperationException("Unimplemented method 'callFunction'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    /* JADX INFO: renamed from: destroy */
    public void lambda$onNativeException$6() {
        throw new UnsupportedOperationException("Unimplemented method 'destroy'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void extendNativeModules(NativeModuleRegistry nativeModuleRegistry) {
        w5.k.f(nativeModuleRegistry, "modules");
        throw new UnsupportedOperationException("Unimplemented method 'extendNativeModules'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public UIManager getFabricUIManager() {
        throw new UnsupportedOperationException("Unimplemented method 'getFabricUIManager'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public CallInvokerHolder getJSCallInvokerHolder() {
        CallInvokerHolder callInvokerHolderL0 = this.f12051a.l0();
        w5.k.c(callInvokerHolderL0);
        return callInvokerHolderL0;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public JavaScriptModule getJSModule(Class cls) {
        w5.k.f(cls, "jsInterface");
        ReactContext reactContextH0 = this.f12051a.h0();
        if (reactContextH0 != null) {
            return reactContextH0.getJSModule(cls);
        }
        return null;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public JavaScriptContextHolder getJavaScriptContextHolder() {
        JavaScriptContextHolder javaScriptContextHolderM0 = this.f12051a.m0();
        w5.k.c(javaScriptContextHolderM0);
        return javaScriptContextHolderM0;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public NativeMethodCallInvokerHolder getNativeMethodCallInvokerHolder() {
        throw new UnsupportedOperationException("Unimplemented method 'getNativeMethodCallInvokerHolder'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public NativeModule getNativeModule(Class cls) {
        w5.k.f(cls, "nativeModuleInterface");
        return this.f12051a.p0(cls);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public Collection getNativeModules() {
        Collection collectionR0 = this.f12051a.r0();
        w5.k.e(collectionR0, "getNativeModules(...)");
        return collectionR0;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public ReactQueueConfiguration getReactQueueConfiguration() {
        ReactQueueConfiguration reactQueueConfigurationY0 = this.f12051a.y0();
        w5.k.c(reactQueueConfigurationY0);
        return reactQueueConfigurationY0;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public RuntimeExecutor getRuntimeExecutor() {
        return this.f12051a.z0();
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public RuntimeScheduler getRuntimeScheduler() {
        throw new UnsupportedOperationException("Unimplemented method 'getRuntimeScheduler'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public String getSourceURL() {
        throw new UnsupportedOperationException("Unimplemented method 'getSourceURL'");
    }

    @Override // com.facebook.react.bridge.MemoryPressureListener
    public void handleMemoryPressure(int i7) {
        throw new UnsupportedOperationException("Unimplemented method 'handleMemoryPressure'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public boolean hasNativeModule(Class cls) {
        w5.k.f(cls, "nativeModuleInterface");
        return this.f12051a.C0(cls);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public boolean hasRunJSBundle() {
        throw new UnsupportedOperationException("Unimplemented method 'hasRunJSBundle'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void initialize() {
        throw new UnsupportedOperationException("Unimplemented method 'initialize'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance, com.facebook.react.bridge.JSInstance
    @R1.a
    public void invokeCallback(int i7, NativeArrayInterface nativeArrayInterface) {
        w5.k.f(nativeArrayInterface, "arguments");
        throw new UnsupportedOperationException("Unimplemented method 'invokeCallback'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public boolean isDestroyed() {
        throw new UnsupportedOperationException("Unimplemented method 'isDestroyed'");
    }

    @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
    public void loadScriptFromAssets(AssetManager assetManager, String str, boolean z6) {
        w5.k.f(assetManager, "assetManager");
        w5.k.f(str, "assetURL");
        throw new UnsupportedOperationException("Unimplemented method 'loadScriptFromAssets'");
    }

    @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
    public void loadScriptFromFile(String str, String str2, boolean z6) {
        w5.k.f(str, "fileName");
        w5.k.f(str2, "sourceURL");
        throw new UnsupportedOperationException("Unimplemented method 'loadScriptFromFile'");
    }

    @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
    public void loadSplitBundleFromFile(String str, String str2) {
        w5.k.f(str, "fileName");
        w5.k.f(str2, "sourceURL");
        throw new UnsupportedOperationException("Unimplemented method 'loadSplitBundleFromFile'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void registerSegment(int i7, String str) {
        w5.k.f(str, "path");
        throw new UnsupportedOperationException("Unimplemented method 'registerSegment'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void removeBridgeIdleDebugListener(NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener) {
        w5.k.f(notThreadSafeBridgeIdleDebugListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        throw new UnsupportedOperationException("Unimplemented method 'removeBridgeIdleDebugListener'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void runJSBundle() {
        throw new UnsupportedOperationException("Unimplemented method 'runJSBundle'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void setFabricUIManager(UIManager uIManager) {
        w5.k.f(uIManager, "fabricUIManager");
        throw new UnsupportedOperationException("Unimplemented method 'setFabricUIManager'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void setGlobalVariable(String str, String str2) {
        w5.k.f(str, "propName");
        w5.k.f(str2, "jsonValue");
        throw new UnsupportedOperationException("Unimplemented method 'setGlobalVariable'");
    }

    @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
    public void setSourceURLs(String str, String str2) {
        w5.k.f(str, "deviceURL");
        w5.k.f(str2, "remoteURL");
        throw new UnsupportedOperationException("Unimplemented method 'setSourceURLs'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void setTurboModuleRegistry(TurboModuleRegistry turboModuleRegistry) {
        w5.k.f(turboModuleRegistry, "turboModuleRegistry");
        throw new UnsupportedOperationException("Unimplemented method 'setTurboModuleRegistry'");
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public NativeModule getNativeModule(String str) {
        w5.k.f(str, "moduleName");
        return this.f12051a.q0(str);
    }
}
