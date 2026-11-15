package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.u3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1498u3 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ Y5 f16294m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ M5 f16295n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final /* synthetic */ X2 f16296o;

    RunnableC1498u3(X2 x22, Y5 y52, M5 m52) {
        this.f16294m = y52;
        this.f16295n = m52;
        this.f16296o = x22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16296o.f15844a.x0();
        if (this.f16294m.w() == null) {
            this.f16296o.f15844a.F(this.f16294m.f15876n, this.f16295n);
        } else {
            this.f16296o.f15844a.x(this.f16294m, this.f16295n);
        }
    }
}
