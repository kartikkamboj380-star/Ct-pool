package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.l3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class CallableC1436l3 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f16151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f16152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f16153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ X2 f16154d;

    CallableC1436l3(X2 x22, String str, String str2, String str3) {
        this.f16151a = str;
        this.f16152b = str2;
        this.f16153c = str3;
        this.f16154d = x22;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        this.f16154d.f15844a.x0();
        return this.f16154d.f15844a.j0().P(this.f16151a, this.f16152b, this.f16153c);
    }
}
