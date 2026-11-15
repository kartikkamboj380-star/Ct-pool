package com.facebook.react.fabric;

import com.facebook.jni.HybridData;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class EmptyReactNativeConfig implements ReactNativeConfig {
    private static final a Companion = new a(null);
    private final HybridData mHybridData = initHybrid();

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        d.a();
    }

    private final native HybridData initHybrid();

    @Override // com.facebook.react.fabric.ReactNativeConfig
    public native boolean getBool(String str);

    @Override // com.facebook.react.fabric.ReactNativeConfig
    public native double getDouble(String str);

    @Override // com.facebook.react.fabric.ReactNativeConfig
    public native long getInt64(String str);

    @Override // com.facebook.react.fabric.ReactNativeConfig
    public native String getString(String str);
}
