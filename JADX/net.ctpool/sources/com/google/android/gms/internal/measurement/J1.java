package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.C1073e1;

/* JADX INFO: loaded from: classes.dex */
final class J1 extends C1073e1.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final /* synthetic */ Activity f14225q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final /* synthetic */ C1073e1.c f14226r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    J1(C1073e1.c cVar, Activity activity) {
        super(C1073e1.this);
        this.f14225q = activity;
        this.f14226r = cVar;
    }

    @Override // com.google.android.gms.internal.measurement.C1073e1.a
    final void a() {
        ((P0) Preconditions.checkNotNull(C1073e1.this.f14567i)).onActivityResumed(com.google.android.gms.dynamic.b.k0(this.f14225q), this.f14569n);
    }
}
