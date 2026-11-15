package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@R1.a
public abstract class NativeMap {
    private static final Companion Companion = new Companion(null);

    @R1.a
    private final HybridData mHybridData;

    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        ReactBridge.staticInit();
    }

    public NativeMap(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public native String toString();
}
