package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.q5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1473q5 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ long f16250m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ C1466p5 f16251n;

    RunnableC1473q5(C1466p5 c1466p5, long j7) {
        this.f16250m = j7;
        this.f16251n = c1466p5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1466p5.A(this.f16251n, this.f16250m);
    }
}
