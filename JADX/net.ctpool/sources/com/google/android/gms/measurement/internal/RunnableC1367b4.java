package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.b4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1367b4 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ Bundle f15927m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ F3 f15928n;

    RunnableC1367b4(F3 f32, Bundle bundle) {
        this.f15927m = bundle;
        this.f15928n = f32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        F3.S(this.f15928n, this.f15927m);
    }
}
