package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
final class X3 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ String f15847m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ String f15848n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final /* synthetic */ long f15849o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final /* synthetic */ Bundle f15850p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final /* synthetic */ boolean f15851q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final /* synthetic */ boolean f15852r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final /* synthetic */ boolean f15853s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final /* synthetic */ String f15854t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final /* synthetic */ F3 f15855u;

    X3(F3 f32, String str, String str2, long j7, Bundle bundle, boolean z6, boolean z7, boolean z8, String str3) {
        this.f15847m = str;
        this.f15848n = str2;
        this.f15849o = j7;
        this.f15850p = bundle;
        this.f15851q = z6;
        this.f15852r = z7;
        this.f15853s = z8;
        this.f15854t = str3;
        this.f15855u = f32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f15855u.b0(this.f15847m, this.f15848n, this.f15849o, this.f15850p, this.f15851q, this.f15852r, this.f15853s, this.f15854t);
    }
}
