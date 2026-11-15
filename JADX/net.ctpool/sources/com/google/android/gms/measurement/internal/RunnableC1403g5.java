package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.g5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1403g5 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ ServiceConnectionC1382d5 f16058m;

    RunnableC1403g5(ServiceConnectionC1382d5 serviceConnectionC1382d5) {
        this.f16058m = serviceConnectionC1382d5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16058m.f15996c.f15449d = null;
        this.f16058m.f15996c.j0();
    }
}
