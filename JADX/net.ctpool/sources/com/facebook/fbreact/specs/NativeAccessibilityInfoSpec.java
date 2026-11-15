package com.facebook.fbreact.specs;

import R1.a;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* JADX INFO: loaded from: classes.dex */
public abstract class NativeAccessibilityInfoSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "AccessibilityInfo";

    public NativeAccessibilityInfoSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @a
    @ReactMethod
    public abstract void announceForAccessibility(String str);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @a
    @ReactMethod
    public void getRecommendedTimeoutMillis(double d7, Callback callback) {
    }

    @a
    @ReactMethod
    public void isAccessibilityServiceEnabled(Callback callback) {
    }

    @a
    @ReactMethod
    public abstract void isReduceMotionEnabled(Callback callback);

    @a
    @ReactMethod
    public abstract void isTouchExplorationEnabled(Callback callback);

    @a
    @ReactMethod
    public abstract void setAccessibilityFocus(double d7);
}
