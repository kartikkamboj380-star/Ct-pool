package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.C1073e1;

/* JADX INFO: loaded from: classes.dex */
final class F1 extends C1073e1.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final /* synthetic */ Bundle f14191q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final /* synthetic */ C1073e1 f14192r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    F1(C1073e1 c1073e1, Bundle bundle) {
        super(c1073e1);
        this.f14191q = bundle;
        this.f14192r = c1073e1;
    }

    @Override // com.google.android.gms.internal.measurement.C1073e1.a
    final void a() {
        ((P0) Preconditions.checkNotNull(this.f14192r.f14567i)).setDefaultEventParameters(this.f14191q);
    }
}
