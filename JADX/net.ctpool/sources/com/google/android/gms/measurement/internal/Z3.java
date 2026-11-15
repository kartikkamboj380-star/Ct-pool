package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
final class Z3 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ long f15885m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ F3 f15886n;

    Z3(F3 f32, long j7) {
        this.f15885m = j7;
        this.f15886n = f32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f15886n.K0(this.f15885m);
        this.f15886n.r().M(new AtomicReference());
    }
}
