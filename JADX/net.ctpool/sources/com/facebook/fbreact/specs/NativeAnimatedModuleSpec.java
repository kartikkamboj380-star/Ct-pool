package com.facebook.fbreact.specs;

import R1.a;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* JADX INFO: loaded from: classes.dex */
public abstract class NativeAnimatedModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "NativeAnimatedModule";

    public NativeAnimatedModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @a
    @ReactMethod
    public abstract void addAnimatedEventToView(double d7, String str, ReadableMap readableMap);

    @a
    @ReactMethod
    public abstract void addListener(String str);

    @a
    @ReactMethod
    public abstract void connectAnimatedNodeToView(double d7, double d8);

    @a
    @ReactMethod
    public abstract void connectAnimatedNodes(double d7, double d8);

    @a
    @ReactMethod
    public abstract void createAnimatedNode(double d7, ReadableMap readableMap);

    @a
    @ReactMethod
    public abstract void disconnectAnimatedNodeFromView(double d7, double d8);

    @a
    @ReactMethod
    public abstract void disconnectAnimatedNodes(double d7, double d8);

    @a
    @ReactMethod
    public abstract void dropAnimatedNode(double d7);

    @a
    @ReactMethod
    public abstract void extractAnimatedNodeOffset(double d7);

    @a
    @ReactMethod
    public abstract void finishOperationBatch();

    @a
    @ReactMethod
    public abstract void flattenAnimatedNodeOffset(double d7);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @a
    @ReactMethod
    public abstract void getValue(double d7, Callback callback);

    @a
    @ReactMethod
    public void queueAndExecuteBatchedOperations(ReadableArray readableArray) {
    }

    @a
    @ReactMethod
    public abstract void removeAnimatedEventFromView(double d7, String str, double d8);

    @a
    @ReactMethod
    public abstract void removeListeners(double d7);

    @a
    @ReactMethod
    public abstract void restoreDefaultValues(double d7);

    @a
    @ReactMethod
    public abstract void setAnimatedNodeOffset(double d7, double d8);

    @a
    @ReactMethod
    public abstract void setAnimatedNodeValue(double d7, double d8);

    @a
    @ReactMethod
    public abstract void startAnimatingNode(double d7, double d8, ReadableMap readableMap, Callback callback);

    @a
    @ReactMethod
    public abstract void startListeningToAnimatedNodeValue(double d7);

    @a
    @ReactMethod
    public abstract void startOperationBatch();

    @a
    @ReactMethod
    public abstract void stopAnimation(double d7);

    @a
    @ReactMethod
    public abstract void stopListeningToAnimatedNodeValue(double d7);

    @a
    @ReactMethod
    public void updateAnimatedNodeConfig(double d7, ReadableMap readableMap) {
    }
}
