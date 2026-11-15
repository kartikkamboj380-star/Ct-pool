package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.r5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1479r5 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ long f16260m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ C1466p5 f16261n;

    RunnableC1479r5(C1466p5 c1466p5, long j7) {
        this.f16260m = j7;
        this.f16261n = c1466p5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1466p5.G(this.f16261n, this.f16260m);
    }
}
