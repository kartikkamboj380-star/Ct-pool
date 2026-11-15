package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.y4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1527y4 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ C1520x4 f16357m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ C1520x4 f16358n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final /* synthetic */ long f16359o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final /* synthetic */ boolean f16360p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final /* synthetic */ C1513w4 f16361q;

    RunnableC1527y4(C1513w4 c1513w4, C1520x4 c1520x4, C1520x4 c1520x42, long j7, boolean z6) {
        this.f16357m = c1520x4;
        this.f16358n = c1520x42;
        this.f16359o = j7;
        this.f16360p = z6;
        this.f16361q = c1513w4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16361q.L(this.f16357m, this.f16358n, this.f16359o, this.f16360p, null);
    }
}
