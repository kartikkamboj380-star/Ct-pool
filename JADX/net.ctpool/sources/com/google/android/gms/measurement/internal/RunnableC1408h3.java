package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.h3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1408h3 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ C1383e f16065m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ X2 f16066n;

    RunnableC1408h3(X2 x22, C1383e c1383e) {
        this.f16065m = c1383e;
        this.f16066n = x22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16066n.f15844a.x0();
        if (this.f16065m.f16007o.w() == null) {
            this.f16066n.f15844a.r(this.f16065m);
        } else {
            this.f16066n.f15844a.U(this.f16065m);
        }
    }
}
