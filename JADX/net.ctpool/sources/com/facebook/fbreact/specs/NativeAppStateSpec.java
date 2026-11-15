package com.facebook.fbreact.specs;

import R1.a;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class NativeAppStateSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "AppState";

    public NativeAppStateSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @a
    @ReactMethod
    public abstract void addListener(String str);

    @Override // com.facebook.react.bridge.BaseJavaModule
    @a
    public final Map<String, Object> getConstants() {
        return getTypedExportedConstants();
    }

    @a
    @ReactMethod
    public abstract void getCurrentAppState(Callback callback, Callback callback2);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "AppState";
    }

    protected abstract Map<String, Object> getTypedExportedConstants();

    @a
    @ReactMethod
    public abstract void removeListeners(double d7);
}
