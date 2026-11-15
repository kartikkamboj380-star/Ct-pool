package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.C1073e1;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.f1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1082f1 extends C1073e1.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final /* synthetic */ Bundle f14578q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final /* synthetic */ C1073e1 f14579r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1082f1(C1073e1 c1073e1, Bundle bundle) {
        super(c1073e1);
        this.f14578q = bundle;
        this.f14579r = c1073e1;
    }

    @Override // com.google.android.gms.internal.measurement.C1073e1.a
    final void a() {
        ((P0) Preconditions.checkNotNull(this.f14579r.f14567i)).setConditionalUserProperty(this.f14578q, this.f14568m);
    }
}
