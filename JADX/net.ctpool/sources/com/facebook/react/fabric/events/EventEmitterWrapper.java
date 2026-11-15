package com.facebook.react.fabric.events;

import R1.a;
import android.annotation.SuppressLint;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.fabric.d;

/* JADX INFO: loaded from: classes.dex */
@a
@SuppressLint({"MissingNativeLoadLibrary"})
public class EventEmitterWrapper {

    @a
    private final HybridData mHybridData;

    static {
        d.a();
    }

    @a
    private EventEmitterWrapper(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    private native void dispatchEvent(String str, NativeMap nativeMap, int i7);

    private native void dispatchEventSynchronously(String str, NativeMap nativeMap);

    private native void dispatchUniqueEvent(String str, NativeMap nativeMap);

    private boolean e() {
        HybridData hybridData = this.mHybridData;
        if (hybridData != null) {
            return hybridData.isValid();
        }
        return false;
    }

    public synchronized void a() {
        HybridData hybridData = this.mHybridData;
        if (hybridData != null) {
            hybridData.resetNative();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized void b(String str, WritableMap writableMap, int i7) {
        if (e()) {
            dispatchEvent(str, (NativeMap) writableMap, i7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized void c(String str, WritableMap writableMap) {
        if (e()) {
            dispatchEventSynchronously(str, (NativeMap) writableMap);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized void d(String str, WritableMap writableMap) {
        if (e()) {
            dispatchUniqueEvent(str, (NativeMap) writableMap);
        }
    }
}
