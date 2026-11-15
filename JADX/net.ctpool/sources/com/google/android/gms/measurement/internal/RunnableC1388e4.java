package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.e4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1388e4 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f16018m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ String f16019n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final /* synthetic */ String f16020o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final /* synthetic */ String f16021p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final /* synthetic */ F3 f16022q;

    RunnableC1388e4(F3 f32, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f16018m = atomicReference;
        this.f16020o = str2;
        this.f16021p = str3;
        this.f16022q = f32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16022q.f16325a.H().O(this.f16018m, null, this.f16020o, this.f16021p);
    }
}
