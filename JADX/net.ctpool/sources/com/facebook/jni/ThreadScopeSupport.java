package com.facebook.jni;

import com.facebook.jni.annotations.DoNotStrip;

/* JADX INFO: loaded from: classes.dex */
@DoNotStrip
public class ThreadScopeSupport {
    static {
        N2.a.d("fbjni");
    }

    @DoNotStrip
    private static void runStdFunction(long j7) {
        runStdFunctionImpl(j7);
    }

    private static native void runStdFunctionImpl(long j7);
}
