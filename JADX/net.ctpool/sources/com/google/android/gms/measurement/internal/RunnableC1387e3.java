package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.e3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1387e3 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ M5 f16016m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ X2 f16017n;

    RunnableC1387e3(X2 x22, M5 m52) {
        this.f16016m = m52;
        this.f16017n = x22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16017n.f15844a.x0();
        H5 h52 = this.f16017n.f15844a;
        M5 m52 = this.f16016m;
        h52.f().l();
        h52.y0();
        Preconditions.checkNotEmpty(m52.f15695m);
        h52.h(m52);
    }
}
