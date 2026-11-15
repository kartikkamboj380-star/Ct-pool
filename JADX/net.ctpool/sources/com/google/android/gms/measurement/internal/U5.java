package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes.dex */
final class U5 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ String f15815m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ String f15816n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final /* synthetic */ Bundle f15817o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final /* synthetic */ S5 f15818p;

    U5(S5 s52, String str, String str2, Bundle bundle) {
        this.f15815m = str;
        this.f15816n = str2;
        this.f15817o = bundle;
        this.f15818p = s52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f15818p.f15800a.u((E) Preconditions.checkNotNull(this.f15818p.f15800a.w0().F(this.f15815m, this.f15816n, this.f15817o, "auto", this.f15818p.f15800a.zzb().currentTimeMillis(), false, true)), this.f15815m);
    }
}
