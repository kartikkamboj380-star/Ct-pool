package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.o4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1458o4 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.U0 f16215m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ String f16216n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final /* synthetic */ String f16217o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f16218p;

    RunnableC1458o4(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.U0 u02, String str, String str2) {
        this.f16215m = u02;
        this.f16216n = str;
        this.f16217o = str2;
        this.f16218p = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16218p.f15362a.H().D(this.f16215m, this.f16216n, this.f16217o);
    }
}
