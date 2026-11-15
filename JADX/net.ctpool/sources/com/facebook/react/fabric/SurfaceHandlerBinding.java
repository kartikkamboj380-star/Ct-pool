package com.facebook.react.fabric;

import a2.InterfaceC0504a;
import c2.InterfaceC0712b;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.NativeMap;

/* JADX INFO: loaded from: classes.dex */
public class SurfaceHandlerBinding implements InterfaceC0712b {

    @R1.a
    private final HybridData mHybridData;

    static {
        d.a();
    }

    public SurfaceHandlerBinding(String str) {
        this.mHybridData = initHybrid(0, str);
    }

    private native String getModuleNameNative();

    private native int getSurfaceIdNative();

    private static native HybridData initHybrid(int i7, String str);

    private native boolean isRunningNative();

    private native void setDisplayModeNative(int i7);

    private native void setLayoutConstraintsNative(float f7, float f8, float f9, float f10, float f11, float f12, boolean z6, boolean z7, float f13);

    private native void setPropsNative(NativeMap nativeMap);

    private native void setSurfaceIdNative(int i7);

    private native void startNative();

    private native void stopNative();

    @Override // c2.InterfaceC0712b
    public void a(int i7) {
        setSurfaceIdNative(i7);
    }

    @Override // c2.InterfaceC0712b
    public void b(NativeMap nativeMap) {
        setPropsNative(nativeMap);
    }

    @Override // c2.InterfaceC0712b
    public void c(boolean z6) {
        setDisplayModeNative(!z6 ? 1 : 0);
    }

    @Override // c2.InterfaceC0712b
    public String d() {
        return getModuleNameNative();
    }

    @Override // c2.InterfaceC0712b
    public void e(int i7, int i8, int i9, int i10, boolean z6, boolean z7, float f7) {
        setLayoutConstraintsNative(InterfaceC0504a.a(i7) / f7, InterfaceC0504a.b(i7) / f7, InterfaceC0504a.a(i8) / f7, InterfaceC0504a.b(i8) / f7, i9 / f7, i10 / f7, z6, z7, f7);
    }

    @Override // c2.InterfaceC0712b
    public int getSurfaceId() {
        return getSurfaceIdNative();
    }

    @Override // c2.InterfaceC0712b
    public boolean isRunning() {
        return isRunningNative();
    }

    @Override // c2.InterfaceC0712b
    public void start() {
        startNative();
    }

    @Override // c2.InterfaceC0712b
    public void stop() {
        stopNative();
    }
}
