package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.fabric.events.EventEmitterWrapper;
import com.facebook.react.uimanager.InterfaceC0870d0;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f11759a = new f();

    private f() {
    }

    public static final b a(int i7, int i8, int i9, ReadableArray readableArray) {
        return new c(i7, i8, i9, readableArray);
    }

    public static final b b(int i7, int i8, String str, ReadableArray readableArray) {
        k.f(str, "commandId");
        return new d(i7, i8, str, readableArray);
    }

    public static final MountItem c(int i7, int[] iArr, Object[] objArr, int i8) {
        k.f(iArr, "intBuf");
        k.f(objArr, "objBuf");
        return new IntBufferBatchMountItem(i7, iArr, objArr, i8);
    }

    public static final MountItem d(int i7, int i8, String str, ReadableMap readableMap, InterfaceC0870d0 interfaceC0870d0, EventEmitterWrapper eventEmitterWrapper, boolean z6) {
        k.f(str, "component");
        return new g(i7, i8, str, readableMap, interfaceC0870d0, eventEmitterWrapper, z6);
    }

    public static final MountItem e(int i7, int i8, int i9) {
        return new h(i7, i8, i9);
    }
}
