package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.C1073e1;

/* JADX INFO: loaded from: classes.dex */
final class N1 extends C1073e1.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final /* synthetic */ Activity f14286q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final /* synthetic */ C1073e1.c f14287r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    N1(C1073e1.c cVar, Activity activity) {
        super(C1073e1.this);
        this.f14286q = activity;
        this.f14287r = cVar;
    }

    @Override // com.google.android.gms.internal.measurement.C1073e1.a
    final void a() {
        ((P0) Preconditions.checkNotNull(C1073e1.this.f14567i)).onActivityDestroyed(com.google.android.gms.dynamic.b.k0(this.f14286q), this.f14569n);
    }
}
