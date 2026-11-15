package com.facebook.fbreact.specs;

import R1.a;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* JADX INFO: loaded from: classes.dex */
public abstract class NativeTimingSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "Timing";

    public NativeTimingSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @a
    @ReactMethod
    public abstract void createTimer(double d7, double d8, double d9, boolean z6);

    @a
    @ReactMethod
    public abstract void deleteTimer(double d7);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @a
    @ReactMethod
    public abstract void setSendIdleEvents(boolean z6);
}
