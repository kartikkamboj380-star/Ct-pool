package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.s3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1484s3 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ E f16268m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ String f16269n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final /* synthetic */ X2 f16270o;

    RunnableC1484s3(X2 x22, E e7, String str) {
        this.f16268m = e7;
        this.f16269n = str;
        this.f16270o = x22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16270o.f15844a.x0();
        this.f16270o.f15844a.u(this.f16268m, this.f16269n);
    }
}
