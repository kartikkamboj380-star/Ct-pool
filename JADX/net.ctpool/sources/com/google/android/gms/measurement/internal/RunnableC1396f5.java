package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.f5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1396f5 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ ComponentName f16033m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ ServiceConnectionC1382d5 f16034n;

    RunnableC1396f5(ServiceConnectionC1382d5 serviceConnectionC1382d5, ComponentName componentName) {
        this.f16033m = componentName;
        this.f16034n = serviceConnectionC1382d5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        F4.I(this.f16034n.f15996c, this.f16033m);
    }
}
