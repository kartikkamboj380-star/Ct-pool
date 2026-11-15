package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.m3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class CallableC1443m3 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f16170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f16171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f16172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ X2 f16173d;

    CallableC1443m3(X2 x22, String str, String str2, String str3) {
        this.f16170a = str;
        this.f16171b = str2;
        this.f16172c = str3;
        this.f16173d = x22;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        this.f16173d.f15844a.x0();
        return this.f16173d.f15844a.j0().P(this.f16170a, this.f16171b, this.f16172c);
    }
}
