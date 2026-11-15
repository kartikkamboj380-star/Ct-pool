package com.facebook.react.fabric;

import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.react.bridge.RuntimeScheduler;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerProvider;
import com.facebook.react.fabric.events.EventBeatManager;
import com.facebook.react.uimanager.G0;

/* JADX INFO: loaded from: classes.dex */
public class h implements UIManagerProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ComponentFactory f11729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ReactNativeConfig f11730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final G0 f11731c;

    public h(ComponentFactory componentFactory, ReactNativeConfig reactNativeConfig, G0 g02) {
        this.f11729a = componentFactory;
        this.f11730b = reactNativeConfig;
        this.f11731c = g02;
    }

    @Override // com.facebook.react.bridge.UIManagerProvider
    public UIManager createUIManager(ReactApplicationContext reactApplicationContext) {
        P2.a.c(0L, "FabricUIManagerProviderImpl.create");
        EventBeatManager eventBeatManager = new EventBeatManager();
        P2.a.c(0L, "FabricUIManagerProviderImpl.createUIManager");
        FabricUIManager fabricUIManager = new FabricUIManager(reactApplicationContext, this.f11731c, eventBeatManager);
        P2.a.g(0L);
        P2.a.c(0L, "FabricUIManagerProviderImpl.registerBinding");
        BindingImpl bindingImpl = new BindingImpl();
        CatalystInstance catalystInstance = reactApplicationContext.getCatalystInstance();
        RuntimeExecutor runtimeExecutor = catalystInstance.getRuntimeExecutor();
        RuntimeScheduler runtimeScheduler = catalystInstance.getRuntimeScheduler();
        if (runtimeExecutor == null || runtimeScheduler == null) {
            throw new IllegalStateException("Unable to register FabricUIManager with CatalystInstance, runtimeExecutor and runtimeScheduler must not be null");
        }
        bindingImpl.a(runtimeExecutor, runtimeScheduler, fabricUIManager, eventBeatManager, this.f11729a, this.f11730b);
        P2.a.g(0L);
        P2.a.g(0L);
        return fabricUIManager;
    }
}
