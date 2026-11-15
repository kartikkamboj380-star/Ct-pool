package com.facebook.react.bridge;

import com.facebook.jni.HybridData;

/* JADX INFO: loaded from: classes.dex */
final class DynamicNative implements Dynamic {

    @R1.a
    private final HybridData mHybridData;

    public DynamicNative(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    private final native ReadableType getTypeNative();

    private final native boolean isNullNative();

    @Override // com.facebook.react.bridge.Dynamic
    public native ReadableArray asArray();

    @Override // com.facebook.react.bridge.Dynamic
    public native boolean asBoolean();

    @Override // com.facebook.react.bridge.Dynamic
    public native double asDouble();

    @Override // com.facebook.react.bridge.Dynamic
    public int asInt() {
        return (int) asDouble();
    }

    @Override // com.facebook.react.bridge.Dynamic
    public native ReadableMap asMap();

    @Override // com.facebook.react.bridge.Dynamic
    public native String asString();

    @Override // com.facebook.react.bridge.Dynamic
    public ReadableType getType() {
        return getTypeNative();
    }

    @Override // com.facebook.react.bridge.Dynamic
    public boolean isNull() {
        return isNullNative();
    }

    @Override // com.facebook.react.bridge.Dynamic
    public void recycle() {
    }
}
