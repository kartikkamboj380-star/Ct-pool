package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.n5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1452n5 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.U0 f16201m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f16202n;

    RunnableC1452n5(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.U0 u02) {
        this.f16201m = u02;
        this.f16202n = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16202n.f15362a.J().S(this.f16201m, this.f16202n.f15362a.m());
    }
}
