package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.c4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1374c4 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ Bundle f15981m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ F3 f15982n;

    RunnableC1374c4(F3 f32, Bundle bundle) {
        this.f15981m = bundle;
        this.f15982n = f32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        F3.O0(this.f15982n, this.f15981m);
    }
}
