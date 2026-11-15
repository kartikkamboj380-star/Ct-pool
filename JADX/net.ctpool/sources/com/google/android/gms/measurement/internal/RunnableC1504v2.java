package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.v2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1504v2 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ boolean f16312m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ C1511w2 f16313n;

    RunnableC1504v2(C1511w2 c1511w2, boolean z6) {
        this.f16312m = z6;
        this.f16313n = c1511w2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16313n.f16322a.I(this.f16312m);
    }
}
