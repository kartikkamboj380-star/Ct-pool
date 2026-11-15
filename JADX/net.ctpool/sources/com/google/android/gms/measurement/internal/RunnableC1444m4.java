package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.m4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1444m4 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ C1501v f16174m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ F3 f16175n;

    RunnableC1444m4(F3 f32, C1501v c1501v) {
        this.f16174m = c1501v;
        this.f16175n = f32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f16175n.g().y(this.f16174m)) {
            this.f16175n.d().H().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(this.f16174m.a()));
            return;
        }
        this.f16175n.d().I().b("Setting DMA consent(FE)", this.f16174m);
        if (this.f16175n.r().h0()) {
            this.f16175n.r().c0();
        } else {
            this.f16175n.r().S(false);
        }
    }
}
