package com.facebook.react.fabric;

import android.annotation.SuppressLint;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.mapbuffer.ReadableMapBuffer;
import com.facebook.react.uimanager.InterfaceC0870d0;

/* JADX INFO: loaded from: classes.dex */
@R1.a
@SuppressLint({"MissingNativeLoadLibrary"})
public class StateWrapperImpl implements InterfaceC0870d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile boolean f11715a = false;

    @R1.a
    private final HybridData mHybridData = initHybrid();

    static {
        d.a();
    }

    private StateWrapperImpl() {
    }

    private native ReadableNativeMap getStateDataImpl();

    private native ReadableMapBuffer getStateMapBufferDataImpl();

    private static native HybridData initHybrid();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.uimanager.InterfaceC0870d0
    public void a(WritableMap writableMap) {
        if (this.f11715a) {
            P0.a.j("StateWrapperImpl", "Race between StateWrapperImpl destruction and updateState");
        } else {
            updateStateImpl((NativeMap) writableMap);
        }
    }

    @Override // com.facebook.react.uimanager.InterfaceC0870d0
    public ReadableNativeMap b() {
        if (!this.f11715a) {
            return getStateDataImpl();
        }
        P0.a.j("StateWrapperImpl", "Race between StateWrapperImpl destruction and getState");
        return null;
    }

    @Override // com.facebook.react.uimanager.InterfaceC0870d0
    public ReadableMapBuffer c() {
        if (!this.f11715a) {
            return getStateMapBufferDataImpl();
        }
        P0.a.j("StateWrapperImpl", "Race between StateWrapperImpl destruction and getState");
        return null;
    }

    @Override // com.facebook.react.uimanager.InterfaceC0870d0
    public void d() {
        if (this.f11715a) {
            return;
        }
        this.f11715a = true;
        this.mHybridData.resetNative();
    }

    public String toString() {
        if (this.f11715a) {
            return "<destroyed>";
        }
        ReadableMapBuffer stateMapBufferDataImpl = getStateMapBufferDataImpl();
        if (stateMapBufferDataImpl != null) {
            return stateMapBufferDataImpl.toString();
        }
        ReadableNativeMap stateDataImpl = getStateDataImpl();
        return stateDataImpl == null ? "<unexpected null>" : stateDataImpl.toString();
    }

    public native void updateStateImpl(NativeMap nativeMap);
}
