package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.r3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class CallableC1477r3 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ E f16257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f16258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ X2 f16259c;

    CallableC1477r3(X2 x22, E e7, String str) {
        this.f16257a = e7;
        this.f16258b = str;
        this.f16259c = x22;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        this.f16259c.f15844a.x0();
        return this.f16259c.f15844a.s0().w(this.f16257a, this.f16258b);
    }
}
