package com.facebook.react.internal.turbomodule.core;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class TurboModuleManagerDelegate {

    @R1.a
    private final HybridData mHybridData;

    static {
        NativeModuleSoLoader.maybeLoadSoLibrary();
    }

    protected TurboModuleManagerDelegate() {
        maybeLoadOtherSoLibraries();
        this.mHybridData = initHybrid();
    }

    public List<String> getEagerInitModuleNames() {
        return new ArrayList();
    }

    public NativeModule getLegacyModule(String str) {
        return null;
    }

    public abstract TurboModule getModule(String str);

    protected abstract HybridData initHybrid();

    protected synchronized void maybeLoadOtherSoLibraries() {
    }

    public boolean unstable_enableSyncVoidMethods() {
        return false;
    }

    public boolean unstable_isLegacyModuleRegistered(String str) {
        return false;
    }

    public abstract boolean unstable_isModuleRegistered(String str);

    public boolean unstable_shouldEnableLegacyModuleInterop() {
        return false;
    }

    public boolean unstable_shouldRouteTurboModulesThroughLegacyModuleInterop() {
        return false;
    }

    protected TurboModuleManagerDelegate(HybridData hybridData) {
        maybeLoadOtherSoLibraries();
        this.mHybridData = hybridData;
    }
}
