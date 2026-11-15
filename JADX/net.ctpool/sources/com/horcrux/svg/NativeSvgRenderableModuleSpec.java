package com.horcrux.svg;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* JADX INFO: loaded from: classes.dex */
public abstract class NativeSvgRenderableModuleSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public static final String NAME = "RNSVGRenderableModule";

    public NativeSvgRenderableModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @R1.a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract WritableMap getBBox(Double d7, ReadableMap readableMap);

    @R1.a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract WritableMap getCTM(Double d7);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNSVGRenderableModule";
    }

    @R1.a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract WritableMap getPointAtLength(Double d7, ReadableMap readableMap);

    @R1.a
    @ReactMethod
    public abstract void getRawResource(String str, Promise promise);

    @R1.a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract WritableMap getScreenCTM(Double d7);

    @R1.a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract double getTotalLength(Double d7);

    @R1.a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract boolean isPointInFill(Double d7, ReadableMap readableMap);

    @R1.a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract boolean isPointInStroke(Double d7, ReadableMap readableMap);
}
