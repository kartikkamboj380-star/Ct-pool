package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@R1.a
public final class WritableNativeMap extends ReadableNativeMap implements WritableMap {
    private static final Companion Companion = new Companion(null);

    private static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final HybridData initHybrid() {
            return WritableNativeMap.initHybrid();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        ReactBridge.staticInit();
    }

    public WritableNativeMap() {
        super(Companion.initHybrid());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final native HybridData initHybrid();

    private final native void mergeNativeMap(ReadableNativeMap readableNativeMap);

    private final native void putNativeArray(String str, ReadableNativeArray readableNativeArray);

    private final native void putNativeMap(String str, ReadableNativeMap readableNativeMap);

    @Override // com.facebook.react.bridge.WritableMap
    public WritableMap copy() {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.merge(this);
        return writableNativeMap;
    }

    @Override // com.facebook.react.bridge.WritableMap
    public void merge(ReadableMap readableMap) {
        w5.k.f(readableMap, "source");
        O1.a.b(readableMap instanceof ReadableNativeMap, "Illegal type provided");
        mergeNativeMap((ReadableNativeMap) readableMap);
    }

    @Override // com.facebook.react.bridge.WritableMap
    public void putArray(String str, ReadableArray readableArray) {
        w5.k.f(str, "key");
        O1.a.b(readableArray == null || (readableArray instanceof ReadableNativeArray), "Illegal type provided");
        putNativeArray(str, (ReadableNativeArray) readableArray);
    }

    @Override // com.facebook.react.bridge.WritableMap
    public native void putBoolean(String str, boolean z6);

    @Override // com.facebook.react.bridge.WritableMap
    public native void putDouble(String str, double d7);

    @Override // com.facebook.react.bridge.WritableMap
    public native void putInt(String str, int i7);

    @Override // com.facebook.react.bridge.WritableMap
    public native void putLong(String str, long j7);

    @Override // com.facebook.react.bridge.WritableMap
    public void putMap(String str, ReadableMap readableMap) {
        w5.k.f(str, "key");
        O1.a.b(readableMap == null || (readableMap instanceof ReadableNativeMap), "Illegal type provided");
        putNativeMap(str, (ReadableNativeMap) readableMap);
    }

    @Override // com.facebook.react.bridge.WritableMap
    public native void putNull(String str);

    @Override // com.facebook.react.bridge.WritableMap
    public native void putString(String str, String str2);
}
