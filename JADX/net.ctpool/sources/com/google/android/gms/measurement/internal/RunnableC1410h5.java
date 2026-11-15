package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.h5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1410h5 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ ServiceConnectionC1382d5 f16069m;

    RunnableC1410h5(ServiceConnectionC1382d5 serviceConnectionC1382d5) {
        this.f16069m = serviceConnectionC1382d5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        F4.I(this.f16069m.f15996c, new ComponentName(this.f16069m.f15996c.a(), "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
