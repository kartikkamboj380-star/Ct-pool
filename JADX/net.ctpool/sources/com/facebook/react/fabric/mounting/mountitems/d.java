package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.bridge.ReadableArray;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class d extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f11753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f11754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f11755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ReadableArray f11756e;

    public d(int i7, int i8, String str, ReadableArray readableArray) {
        k.f(str, "commandId");
        this.f11753b = i7;
        this.f11754c = i8;
        this.f11755d = str;
        this.f11756e = readableArray;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public void execute(a2.c cVar) {
        k.f(cVar, "mountingManager");
        cVar.n(this.f11753b, this.f11754c, this.f11755d, this.f11756e);
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public int getSurfaceId() {
        return this.f11753b;
    }

    public String toString() {
        return "DispatchStringCommandMountItem [" + this.f11754c + "] " + this.f11755d;
    }
}
