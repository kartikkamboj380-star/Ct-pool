package com.facebook.fbreact.specs;

import R1.a;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* JADX INFO: loaded from: classes.dex */
public abstract class NativeDevToolsSettingsManagerSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "DevToolsSettingsManager";

    public NativeDevToolsSettingsManagerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract String getConsolePatchSettings();

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getProfilingSettings() {
        return null;
    }

    @a
    @ReactMethod
    public abstract void setConsolePatchSettings(String str);

    @a
    @ReactMethod
    public void setProfilingSettings(String str) {
    }
}
