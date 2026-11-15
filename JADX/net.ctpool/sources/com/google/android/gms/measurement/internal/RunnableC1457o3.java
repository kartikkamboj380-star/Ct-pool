package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.o3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1457o3 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ M5 f16213m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ X2 f16214n;

    RunnableC1457o3(X2 x22, M5 m52) {
        this.f16213m = m52;
        this.f16214n = x22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16214n.f15844a.x0();
        this.f16214n.f15844a.h0(this.f16213m);
    }
}
