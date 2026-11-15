package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;
import w3.C2191b;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.q3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class CallableC1471q3 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ M5 f16243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ X2 f16244b;

    CallableC1471q3(X2 x22, M5 m52) {
        this.f16243a = m52;
        this.f16244b = x22;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        this.f16244b.f15844a.x0();
        return new C2191b(this.f16244b.f15844a.e(this.f16243a.f15695m));
    }
}
