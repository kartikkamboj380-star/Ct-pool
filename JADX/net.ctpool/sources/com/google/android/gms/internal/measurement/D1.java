package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.C1073e1;

/* JADX INFO: loaded from: classes.dex */
final class D1 extends C1073e1.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final /* synthetic */ boolean f14158q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final /* synthetic */ C1073e1 f14159r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    D1(C1073e1 c1073e1, boolean z6) {
        super(c1073e1);
        this.f14158q = z6;
        this.f14159r = c1073e1;
    }

    @Override // com.google.android.gms.internal.measurement.C1073e1.a
    final void a() {
        ((P0) Preconditions.checkNotNull(this.f14159r.f14567i)).setDataCollectionEnabled(this.f14158q);
    }
}
