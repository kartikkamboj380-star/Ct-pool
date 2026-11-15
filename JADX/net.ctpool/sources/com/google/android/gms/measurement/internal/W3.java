package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class W3 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ String f15832m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ String f15833n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final /* synthetic */ Object f15834o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final /* synthetic */ long f15835p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final /* synthetic */ F3 f15836q;

    W3(F3 f32, String str, String str2, Object obj, long j7) {
        this.f15832m = str;
        this.f15833n = str2;
        this.f15834o = obj;
        this.f15835p = j7;
        this.f15836q = f32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f15836q.g0(this.f15832m, this.f15833n, this.f15834o, this.f15835p);
    }
}
