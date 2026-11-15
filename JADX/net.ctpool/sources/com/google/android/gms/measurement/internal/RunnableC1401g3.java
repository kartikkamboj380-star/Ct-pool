package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.g3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1401g3 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ M5 f16054m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ X2 f16055n;

    RunnableC1401g3(X2 x22, M5 m52) {
        this.f16054m = m52;
        this.f16055n = x22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16055n.f15844a.x0();
        this.f16055n.f15844a.d0(this.f16054m);
    }
}
