package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.RetryableMountingLayerException;

/* JADX INFO: loaded from: classes.dex */
final class h implements MountItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f11767a = "Fabric.SendAccessibilityEvent";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f11768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f11769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f11770d;

    h(int i7, int i8, int i9) {
        this.f11768b = i7;
        this.f11769c = i8;
        this.f11770d = i9;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public void execute(a2.c cVar) {
        try {
            cVar.o(this.f11768b, this.f11769c, this.f11770d);
        } catch (RetryableMountingLayerException e7) {
            ReactSoftExceptionLogger.logSoftException("Fabric.SendAccessibilityEvent", e7);
        }
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public int getSurfaceId() {
        return this.f11768b;
    }

    public String toString() {
        return "SendAccessibilityEventMountItem [" + this.f11769c + "] " + this.f11770d;
    }
}
