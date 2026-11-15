package com.facebook.react.bridge;

import com.facebook.jni.HybridData;

/* JADX INFO: loaded from: classes.dex */
@R1.a
public class CxxCallbackImpl implements Callback {

    @R1.a
    private final HybridData mHybridData;

    @R1.a
    private CxxCallbackImpl(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    private native void nativeInvoke(NativeArray nativeArray);

    @Override // com.facebook.react.bridge.Callback
    public void invoke(Object... objArr) {
        nativeInvoke(Arguments.fromJavaArgs(objArr));
    }
}
