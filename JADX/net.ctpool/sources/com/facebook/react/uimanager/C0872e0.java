package com.facebook.react.uimanager;

import android.app.Activity;
import android.content.Context;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import java.util.Collection;

/* JADX INFO: renamed from: com.facebook.react.uimanager.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0872e0 extends ReactContext {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ReactApplicationContext f12493m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f12494n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f12495o;

    public C0872e0(ReactApplicationContext reactApplicationContext, Context context, String str, int i7) {
        super(context);
        initializeFromOther(reactApplicationContext);
        this.f12493m = reactApplicationContext;
        this.f12494n = str;
        this.f12495o = i7;
    }

    @Override // com.facebook.react.bridge.ReactContext
    public void addLifecycleEventListener(LifecycleEventListener lifecycleEventListener) {
        this.f12493m.addLifecycleEventListener(lifecycleEventListener);
    }

    public ReactApplicationContext b() {
        return this.f12493m;
    }

    public int c() {
        return this.f12495o;
    }

    @Override // com.facebook.react.bridge.ReactContext
    public void destroy() {
        this.f12493m.destroy();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public CatalystInstance getCatalystInstance() {
        return this.f12493m.getCatalystInstance();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public Activity getCurrentActivity() {
        return this.f12493m.getCurrentActivity();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public UIManager getFabricUIManager() {
        return this.f12493m.getFabricUIManager();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public CallInvokerHolder getJSCallInvokerHolder() {
        return this.f12493m.getJSCallInvokerHolder();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public JavaScriptModule getJSModule(Class cls) {
        return this.f12493m.getJSModule(cls);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public JavaScriptContextHolder getJavaScriptContextHolder() {
        return this.f12493m.getJavaScriptContextHolder();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public NativeModule getNativeModule(Class cls) {
        return this.f12493m.getNativeModule(cls);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public Collection getNativeModules() {
        return this.f12493m.getNativeModules();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public String getSourceURL() {
        return this.f12493m.getSourceURL();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public void handleException(Exception exc) {
        this.f12493m.handleException(exc);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean hasActiveCatalystInstance() {
        return this.f12493m.hasActiveCatalystInstance();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean hasActiveReactInstance() {
        return this.f12493m.hasActiveCatalystInstance();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean hasCatalystInstance() {
        return this.f12493m.hasCatalystInstance();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean hasCurrentActivity() {
        return this.f12493m.hasCurrentActivity();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean hasNativeModule(Class cls) {
        return this.f12493m.hasNativeModule(cls);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean hasReactInstance() {
        return this.f12493m.hasReactInstance();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean isBridgeless() {
        return this.f12493m.isBridgeless();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public void registerSegment(int i7, String str, Callback callback) {
        this.f12493m.registerSegment(i7, str, callback);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public void removeLifecycleEventListener(LifecycleEventListener lifecycleEventListener) {
        this.f12493m.removeLifecycleEventListener(lifecycleEventListener);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public NativeModule getNativeModule(String str) {
        return this.f12493m.getNativeModule(str);
    }
}
