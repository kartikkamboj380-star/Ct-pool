package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.C1073e1;

/* JADX INFO: loaded from: classes.dex */
final class O1 extends C1073e1.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final /* synthetic */ Activity f14298q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final /* synthetic */ Q0 f14299r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final /* synthetic */ C1073e1.c f14300s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    O1(C1073e1.c cVar, Activity activity, Q0 q02) {
        super(C1073e1.this);
        this.f14298q = activity;
        this.f14299r = q02;
        this.f14300s = cVar;
    }

    @Override // com.google.android.gms.internal.measurement.C1073e1.a
    final void a() {
        ((P0) Preconditions.checkNotNull(C1073e1.this.f14567i)).onActivitySaveInstanceState(com.google.android.gms.dynamic.b.k0(this.f14298q), this.f14299r, this.f14569n);
    }
}
