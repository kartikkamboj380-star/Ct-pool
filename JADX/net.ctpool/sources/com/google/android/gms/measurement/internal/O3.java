package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class O3 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.U0 f15717m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ E f15718n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final /* synthetic */ String f15719o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f15720p;

    O3(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.U0 u02, E e7, String str) {
        this.f15717m = u02;
        this.f15718n = e7;
        this.f15719o = str;
        this.f15720p = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f15720p.f15362a.H().C(this.f15717m, this.f15718n, this.f15719o);
    }
}
