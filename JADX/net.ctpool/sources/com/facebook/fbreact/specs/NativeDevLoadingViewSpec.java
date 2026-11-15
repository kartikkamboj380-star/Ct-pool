package com.facebook.fbreact.specs;

import R1.a;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* JADX INFO: loaded from: classes.dex */
public abstract class NativeDevLoadingViewSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "DevLoadingView";

    public NativeDevLoadingViewSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "DevLoadingView";
    }

    @a
    @ReactMethod
    public abstract void hide();

    @a
    @ReactMethod
    public abstract void showMessage(String str, Double d7, Double d8);
}
