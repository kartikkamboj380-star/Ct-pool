package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class A4 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ long f15360m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ C1513w4 f15361n;

    A4(C1513w4 c1513w4, long j7) {
        this.f15360m = j7;
        this.f15361n = c1513w4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f15361n.m().t(this.f15360m);
        this.f15361n.f16328e = null;
    }
}
