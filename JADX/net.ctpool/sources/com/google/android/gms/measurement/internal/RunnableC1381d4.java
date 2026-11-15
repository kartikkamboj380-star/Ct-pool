package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.d4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1381d4 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f15988m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ String f15989n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final /* synthetic */ String f15990o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final /* synthetic */ String f15991p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final /* synthetic */ boolean f15992q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final /* synthetic */ F3 f15993r;

    RunnableC1381d4(F3 f32, AtomicReference atomicReference, String str, String str2, String str3, boolean z6) {
        this.f15988m = atomicReference;
        this.f15990o = str2;
        this.f15991p = str3;
        this.f15992q = z6;
        this.f15993r = f32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f15993r.f16325a.H().P(this.f15988m, null, this.f15990o, this.f15991p, this.f15992q);
    }
}
