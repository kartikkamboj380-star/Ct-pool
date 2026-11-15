package com.facebook.fbreact.specs;

import R1.a;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class NativeBlobModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "BlobModule";

    public NativeBlobModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @a
    @ReactMethod
    public abstract void addNetworkingHandler();

    @a
    @ReactMethod
    public abstract void addWebSocketHandler(double d7);

    @a
    @ReactMethod
    public abstract void createFromParts(ReadableArray readableArray, String str);

    @Override // com.facebook.react.bridge.BaseJavaModule
    @a
    public final Map<String, Object> getConstants() {
        return getTypedExportedConstants();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    protected abstract Map<String, Object> getTypedExportedConstants();

    @a
    @ReactMethod
    public abstract void release(String str);

    @a
    @ReactMethod
    public abstract void removeWebSocketHandler(double d7);

    @a
    @ReactMethod
    public abstract void sendOverSocket(ReadableMap readableMap, double d7);
}
