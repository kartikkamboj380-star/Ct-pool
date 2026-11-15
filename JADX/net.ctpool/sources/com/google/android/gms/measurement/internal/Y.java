package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class Y implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ long f15863m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ C1522y f15864n;

    Y(C1522y c1522y, long j7) {
        this.f15863m = j7;
        this.f15864n = c1522y;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f15864n.z(this.f15863m);
    }
}
