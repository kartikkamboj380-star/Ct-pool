package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class J5 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ W5 f15652m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ H5 f15653n;

    J5(H5 h52, W5 w52) {
        this.f15652m = w52;
        this.f15653n = h52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        H5.w(this.f15653n, this.f15652m);
        this.f15653n.B0();
    }
}
