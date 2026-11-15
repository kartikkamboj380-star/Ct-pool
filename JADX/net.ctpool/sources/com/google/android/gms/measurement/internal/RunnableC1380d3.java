package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.d3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1380d3 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ M5 f15986m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ X2 f15987n;

    RunnableC1380d3(X2 x22, M5 m52) {
        this.f15986m = m52;
        this.f15987n = x22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f15987n.f15844a.x0();
        this.f15987n.f15844a.f0(this.f15986m);
    }
}
