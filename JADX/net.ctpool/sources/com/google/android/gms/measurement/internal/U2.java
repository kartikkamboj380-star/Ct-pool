package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class U2 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.U0 f15810m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f15811n;

    U2(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.U0 u02) {
        this.f15810m = u02;
        this.f15811n = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f15811n.f15362a.H().B(this.f15810m);
    }
}
