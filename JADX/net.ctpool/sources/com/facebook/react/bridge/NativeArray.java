package com.facebook.react.bridge;

import com.facebook.jni.HybridData;

/* JADX INFO: loaded from: classes.dex */
@R1.a
public abstract class NativeArray implements NativeArrayInterface {

    @R1.a
    private HybridData mHybridData;

    static {
        ReactBridge.staticInit();
    }

    protected NativeArray(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    @Override // com.facebook.react.bridge.NativeArrayInterface
    public native String toString();
}
