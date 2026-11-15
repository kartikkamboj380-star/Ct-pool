package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class V3 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ long f15820m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ F3 f15821n;

    V3(F3 f32, long j7) {
        this.f15820m = j7;
        this.f15821n = f32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f15821n.g().f16380m.b(this.f15820m);
        this.f15821n.d().D().b("Session timeout duration set", Long.valueOf(this.f15820m));
    }
}
