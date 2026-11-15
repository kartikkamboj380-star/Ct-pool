package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.z4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1534z4 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ Bundle f16395m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ C1520x4 f16396n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final /* synthetic */ C1520x4 f16397o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final /* synthetic */ long f16398p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final /* synthetic */ C1513w4 f16399q;

    RunnableC1534z4(C1513w4 c1513w4, Bundle bundle, C1520x4 c1520x4, C1520x4 c1520x42, long j7) {
        this.f16395m = bundle;
        this.f16396n = c1520x4;
        this.f16397o = c1520x42;
        this.f16398p = j7;
        this.f16399q = c1513w4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1513w4.H(this.f16399q, this.f16395m, this.f16396n, this.f16397o, this.f16398p);
    }
}
