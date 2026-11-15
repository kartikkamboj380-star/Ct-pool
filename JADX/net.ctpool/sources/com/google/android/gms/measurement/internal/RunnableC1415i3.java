package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.i3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1415i3 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ C1383e f16076m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ M5 f16077n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final /* synthetic */ X2 f16078o;

    RunnableC1415i3(X2 x22, C1383e c1383e, M5 m52) {
        this.f16076m = c1383e;
        this.f16077n = m52;
        this.f16078o = x22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16078o.f15844a.x0();
        if (this.f16076m.f16007o.w() == null) {
            this.f16078o.f15844a.s(this.f16076m, this.f16077n);
        } else {
            this.f16078o.f15844a.V(this.f16076m, this.f16077n);
        }
    }
}
