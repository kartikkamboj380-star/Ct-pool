package com.facebook.fbreact.specs;

import R1.a;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* JADX INFO: loaded from: classes.dex */
public abstract class NativeHeadlessJsTaskSupportSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "HeadlessJsTaskSupport";

    public NativeHeadlessJsTaskSupportSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @a
    @ReactMethod
    public abstract void notifyTaskFinished(double d7);

    @a
    @ReactMethod
    public abstract void notifyTaskRetry(double d7, Promise promise);
}
