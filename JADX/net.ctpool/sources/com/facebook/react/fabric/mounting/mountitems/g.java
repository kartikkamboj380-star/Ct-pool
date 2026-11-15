package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.fabric.events.EventEmitterWrapper;
import com.facebook.react.uimanager.InterfaceC0870d0;

/* JADX INFO: loaded from: classes.dex */
final class g implements MountItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f11760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f11761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f11762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ReadableMap f11763d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC0870d0 f11764e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final EventEmitterWrapper f11765f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f11766g;

    g(int i7, int i8, String str, ReadableMap readableMap, InterfaceC0870d0 interfaceC0870d0, EventEmitterWrapper eventEmitterWrapper, boolean z6) {
        this.f11760a = e.a(str);
        this.f11761b = i7;
        this.f11763d = readableMap;
        this.f11764e = interfaceC0870d0;
        this.f11765f = eventEmitterWrapper;
        this.f11762c = i8;
        this.f11766g = z6;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public void execute(a2.c cVar) {
        a2.f fVarE = cVar.e(this.f11761b);
        if (fVarE != null) {
            fVarE.D(this.f11760a, this.f11762c, this.f11763d, this.f11764e, this.f11765f, this.f11766g);
            return;
        }
        P0.a.j(FabricUIManager.TAG, "Skipping View PreAllocation; no SurfaceMountingManager found for [" + this.f11761b + "]");
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public int getSurfaceId() {
        return this.f11761b;
    }

    public String toString() {
        return "PreAllocateViewMountItem [" + this.f11762c + "] - component: " + this.f11760a + " surfaceId: " + this.f11761b + " isLayoutable: " + this.f11766g;
    }
}
