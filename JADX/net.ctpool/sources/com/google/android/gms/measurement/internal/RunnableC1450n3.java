package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.n3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1450n3 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ M5 f16198m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ X2 f16199n;

    RunnableC1450n3(X2 x22, M5 m52) {
        this.f16198m = m52;
        this.f16199n = x22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16199n.f15844a.x0();
        H5 h52 = this.f16199n.f15844a;
        M5 m52 = this.f16198m;
        h52.f().l();
        h52.y0();
        Preconditions.checkNotEmpty(m52.f15695m);
        h52.m0(m52);
        h52.k0(m52);
    }
}
