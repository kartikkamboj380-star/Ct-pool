package com.facebook.fbreact.specs;

import R1.a;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class NativeToastAndroidSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "ToastAndroid";

    public NativeToastAndroidSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    @a
    public final Map<String, Object> getConstants() {
        return getTypedExportedConstants();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "ToastAndroid";
    }

    protected abstract Map<String, Object> getTypedExportedConstants();

    @a
    @ReactMethod
    public abstract void show(String str, double d7);

    @a
    @ReactMethod
    public abstract void showWithGravity(String str, double d7, double d8);

    @a
    @ReactMethod
    public abstract void showWithGravityAndOffset(String str, double d7, double d8, double d9, double d10);
}
