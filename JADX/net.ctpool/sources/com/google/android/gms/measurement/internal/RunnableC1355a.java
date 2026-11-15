package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1355a implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ String f15893m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ long f15894n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final /* synthetic */ C1522y f15895o;

    RunnableC1355a(C1522y c1522y, String str, long j7) {
        this.f15893m = str;
        this.f15894n = j7;
        this.f15895o = c1522y;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1522y.w(this.f15895o, this.f15893m, this.f15894n);
    }
}
