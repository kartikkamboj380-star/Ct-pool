package com.facebook.react.fabric;

import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.react.bridge.RuntimeScheduler;
import com.facebook.react.fabric.events.EventBeatManager;
import com.facebook.react.fabric.events.EventEmitterWrapper;

/* JADX INFO: loaded from: classes.dex */
public interface a {
    void a(RuntimeExecutor runtimeExecutor, RuntimeScheduler runtimeScheduler, FabricUIManager fabricUIManager, EventBeatManager eventBeatManager, ComponentFactory componentFactory, ReactNativeConfig reactNativeConfig);

    void b();

    void driveCxxAnimations();

    ReadableNativeMap getInspectorDataForInstance(EventEmitterWrapper eventEmitterWrapper);

    void registerSurface(SurfaceHandlerBinding surfaceHandlerBinding);

    void reportMount(int i7);

    void setConstraints(int i7, float f7, float f8, float f9, float f10, float f11, float f12, boolean z6, boolean z7);

    void startSurface(int i7, String str, NativeMap nativeMap);

    void startSurfaceWithConstraints(int i7, String str, NativeMap nativeMap, float f7, float f8, float f9, float f10, float f11, float f12, boolean z6, boolean z7);

    void stopSurface(int i7);

    void unregisterSurface(SurfaceHandlerBinding surfaceHandlerBinding);
}
