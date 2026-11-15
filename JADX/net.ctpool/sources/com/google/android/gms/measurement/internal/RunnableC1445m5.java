package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.m5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1445m5 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ H5 f16176m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ Runnable f16177n;

    RunnableC1445m5(C1438l5 c1438l5, H5 h52, Runnable runnable) {
        this.f16176m = h52;
        this.f16177n = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        this.f16176m.x0();
        this.f16176m.y(this.f16177n);
        this.f16176m.C0();
    }
}
