package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class Y2 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ D3 f15865m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ S2 f15866n;

    Y2(S2 s22, D3 d32) {
        this.f15865m = d32;
        this.f15866n = s22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        S2.g(this.f15866n, this.f15865m);
        this.f15866n.c(this.f15865m.f15408g);
    }
}
