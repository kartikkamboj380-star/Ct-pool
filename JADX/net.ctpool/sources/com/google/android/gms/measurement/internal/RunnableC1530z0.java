package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1530z0 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ String f16365m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ long f16366n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final /* synthetic */ C1522y f16367o;

    RunnableC1530z0(C1522y c1522y, String str, long j7) {
        this.f16365m = str;
        this.f16366n = j7;
        this.f16367o = c1522y;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1522y.A(this.f16367o, this.f16365m, this.f16366n);
    }
}
