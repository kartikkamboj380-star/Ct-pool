package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.k3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class CallableC1429k3 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f16132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f16133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f16134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ X2 f16135d;

    CallableC1429k3(X2 x22, String str, String str2, String str3) {
        this.f16132a = str;
        this.f16133b = str2;
        this.f16134c = str3;
        this.f16135d = x22;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        this.f16135d.f15844a.x0();
        return this.f16135d.f15844a.j0().B0(this.f16132a, this.f16133b, this.f16134c);
    }
}
