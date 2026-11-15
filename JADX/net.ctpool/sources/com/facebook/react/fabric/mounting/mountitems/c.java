package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.bridge.ReadableArray;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class c extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f11749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f11750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f11751d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ReadableArray f11752e;

    public c(int i7, int i8, int i9, ReadableArray readableArray) {
        this.f11749b = i7;
        this.f11750c = i8;
        this.f11751d = i9;
        this.f11752e = readableArray;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public void execute(a2.c cVar) {
        k.f(cVar, "mountingManager");
        cVar.m(this.f11749b, this.f11750c, this.f11751d, this.f11752e);
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public int getSurfaceId() {
        return this.f11749b;
    }

    public String toString() {
        return "DispatchIntCommandMountItem [" + this.f11750c + "] " + this.f11751d;
    }
}
