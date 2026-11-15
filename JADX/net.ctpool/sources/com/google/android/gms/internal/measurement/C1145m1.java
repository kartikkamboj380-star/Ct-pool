package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.C1073e1;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.m1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1145m1 extends C1073e1.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final /* synthetic */ Boolean f14733q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final /* synthetic */ C1073e1 f14734r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1145m1(C1073e1 c1073e1, Boolean bool) {
        super(c1073e1);
        this.f14733q = bool;
        this.f14734r = c1073e1;
    }

    @Override // com.google.android.gms.internal.measurement.C1073e1.a
    final void a() {
        if (this.f14733q != null) {
            ((P0) Preconditions.checkNotNull(this.f14734r.f14567i)).setMeasurementEnabled(this.f14733q.booleanValue(), this.f14568m);
        } else {
            ((P0) Preconditions.checkNotNull(this.f14734r.f14567i)).clearMeasurementEnabled(this.f14568m);
        }
    }
}
