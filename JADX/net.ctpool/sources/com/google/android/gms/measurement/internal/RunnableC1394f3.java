package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.f3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1394f3 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ String f16027m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ String f16028n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final /* synthetic */ String f16029o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final /* synthetic */ long f16030p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final /* synthetic */ X2 f16031q;

    RunnableC1394f3(X2 x22, String str, String str2, String str3, long j7) {
        this.f16027m = str;
        this.f16028n = str2;
        this.f16029o = str3;
        this.f16030p = j7;
        this.f16031q = x22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.f16027m;
        if (str == null) {
            this.f16031q.f15844a.E(this.f16028n, null);
        } else {
            this.f16031q.f15844a.E(this.f16028n, new C1520x4(this.f16029o, str, this.f16030p));
        }
    }
}
