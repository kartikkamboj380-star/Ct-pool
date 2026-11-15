package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.j3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class CallableC1422j3 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f16097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f16098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f16099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ X2 f16100d;

    CallableC1422j3(X2 x22, String str, String str2, String str3) {
        this.f16097a = str;
        this.f16098b = str2;
        this.f16099c = str3;
        this.f16100d = x22;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        this.f16100d.f15844a.x0();
        return this.f16100d.f15844a.j0().B0(this.f16097a, this.f16098b, this.f16099c);
    }
}
