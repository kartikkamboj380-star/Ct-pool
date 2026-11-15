package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: loaded from: classes.dex */
final class M4 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService.a f15675m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f15676n;

    M4(AppMeasurementDynamiteService appMeasurementDynamiteService, AppMeasurementDynamiteService.a aVar) {
        this.f15675m = aVar;
        this.f15676n = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f15676n.f15362a.F().m0(this.f15675m);
    }
}
