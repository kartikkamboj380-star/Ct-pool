package com.facebook.react.fabric;

import android.annotation.SuppressLint;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.react.bridge.RuntimeScheduler;
import com.facebook.react.fabric.events.EventBeatManager;
import com.facebook.react.fabric.events.EventEmitterWrapper;
import com.facebook.react.uimanager.G;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@R1.a
@SuppressLint({"MissingNativeLoadLibrary"})
public final class BindingImpl implements com.facebook.react.fabric.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f11696a = new a(null);

    @R1.a
    private final HybridData mHybridData = f11696a.b();

    private static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final HybridData b() {
            return BindingImpl.initHybrid();
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        d.a();
        U1.a.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final native HybridData initHybrid();

    private final native void installFabricUIManager(RuntimeExecutor runtimeExecutor, RuntimeScheduler runtimeScheduler, FabricUIManager fabricUIManager, EventBeatManager eventBeatManager, ComponentFactory componentFactory, Object obj);

    private final native void uninstallFabricUIManager();

    @Override // com.facebook.react.fabric.a
    public void a(RuntimeExecutor runtimeExecutor, RuntimeScheduler runtimeScheduler, FabricUIManager fabricUIManager, EventBeatManager eventBeatManager, ComponentFactory componentFactory, ReactNativeConfig reactNativeConfig) {
        w5.k.f(runtimeExecutor, "runtimeExecutor");
        w5.k.f(runtimeScheduler, "runtimeScheduler");
        w5.k.f(fabricUIManager, "fabricUIManager");
        w5.k.f(eventBeatManager, "eventBeatManager");
        w5.k.f(componentFactory, "componentFactory");
        w5.k.f(reactNativeConfig, "reactNativeConfig");
        fabricUIManager.setBinding(this);
        installFabricUIManager(runtimeExecutor, runtimeScheduler, fabricUIManager, eventBeatManager, componentFactory, reactNativeConfig);
        setPixelDensity(G.a());
    }

    @Override // com.facebook.react.fabric.a
    public void b() {
        uninstallFabricUIManager();
    }

    @Override // com.facebook.react.fabric.a
    public native void driveCxxAnimations();

    @Override // com.facebook.react.fabric.a
    public native ReadableNativeMap getInspectorDataForInstance(EventEmitterWrapper eventEmitterWrapper);

    @Override // com.facebook.react.fabric.a
    public native void registerSurface(SurfaceHandlerBinding surfaceHandlerBinding);

    @Override // com.facebook.react.fabric.a
    public native void reportMount(int i7);

    @Override // com.facebook.react.fabric.a
    public native void setConstraints(int i7, float f7, float f8, float f9, float f10, float f11, float f12, boolean z6, boolean z7);

    public native void setPixelDensity(float f7);

    @Override // com.facebook.react.fabric.a
    public native void startSurface(int i7, String str, NativeMap nativeMap);

    @Override // com.facebook.react.fabric.a
    public native void startSurfaceWithConstraints(int i7, String str, NativeMap nativeMap, float f7, float f8, float f9, float f10, float f11, float f12, boolean z6, boolean z7);

    @Override // com.facebook.react.fabric.a
    public native void stopSurface(int i7);

    @Override // com.facebook.react.fabric.a
    public native void unregisterSurface(SurfaceHandlerBinding surfaceHandlerBinding);
}
