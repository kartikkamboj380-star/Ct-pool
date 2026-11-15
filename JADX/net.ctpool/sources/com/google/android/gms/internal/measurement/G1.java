package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.C1073e1;

/* JADX INFO: loaded from: classes.dex */
final class G1 extends C1073e1.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final /* synthetic */ C1073e1.b f14198q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final /* synthetic */ C1073e1 f14199r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    G1(C1073e1 c1073e1, C1073e1.b bVar) {
        super(c1073e1);
        this.f14198q = bVar;
        this.f14199r = c1073e1;
    }

    @Override // com.google.android.gms.internal.measurement.C1073e1.a
    final void a() {
        ((P0) Preconditions.checkNotNull(this.f14199r.f14567i)).registerOnMeasurementEventListener(this.f14198q);
    }
}
