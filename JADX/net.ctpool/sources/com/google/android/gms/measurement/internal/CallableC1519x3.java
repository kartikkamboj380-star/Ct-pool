package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.x3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class CallableC1519x3 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f16344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ X2 f16345b;

    CallableC1519x3(X2 x22, String str) {
        this.f16344a = str;
        this.f16345b = x22;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        this.f16345b.f15844a.x0();
        return this.f16345b.f15844a.j0().W0(this.f16344a);
    }
}
