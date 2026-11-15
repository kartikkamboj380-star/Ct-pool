package com.google.android.gms.measurement.internal;

import android.net.Uri;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.q4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1472q4 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ boolean f16245m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ Uri f16246n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final /* synthetic */ String f16247o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final /* synthetic */ String f16248p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final /* synthetic */ C1451n4 f16249q;

    RunnableC1472q4(C1451n4 c1451n4, boolean z6, Uri uri, String str, String str2) {
        this.f16245m = z6;
        this.f16246n = uri;
        this.f16247o = str;
        this.f16248p = str2;
        this.f16249q = c1451n4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1451n4.a(this.f16249q, this.f16245m, this.f16246n, this.f16247o, this.f16248p);
    }
}
