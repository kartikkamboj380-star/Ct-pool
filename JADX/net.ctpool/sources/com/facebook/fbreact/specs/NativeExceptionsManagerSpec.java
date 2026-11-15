package com.facebook.fbreact.specs;

import R1.a;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* JADX INFO: loaded from: classes.dex */
public abstract class NativeExceptionsManagerSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "ExceptionsManager";

    public NativeExceptionsManagerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @a
    @ReactMethod
    public void dismissRedbox() {
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @a
    @ReactMethod
    public void reportException(ReadableMap readableMap) {
    }

    @a
    @ReactMethod
    public abstract void reportFatalException(String str, ReadableArray readableArray, double d7);

    @a
    @ReactMethod
    public abstract void reportSoftException(String str, ReadableArray readableArray, double d7);

    @a
    @ReactMethod
    public abstract void updateExceptionMessage(String str, ReadableArray readableArray, double d7);
}
