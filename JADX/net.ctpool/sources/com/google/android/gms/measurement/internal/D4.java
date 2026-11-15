package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class D4 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ C1520x4 f15412m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ long f15413n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final /* synthetic */ C1513w4 f15414o;

    D4(C1513w4 c1513w4, C1520x4 c1520x4, long j7) {
        this.f15412m = c1520x4;
        this.f15413n = j7;
        this.f15414o = c1513w4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f15414o.M(this.f15412m, false, this.f15413n);
        C1513w4 c1513w4 = this.f15414o;
        c1513w4.f16328e = null;
        c1513w4.r().H(null);
    }
}
