package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.C1073e1;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.s1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1198s1 extends C1073e1.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final /* synthetic */ String f14827q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final /* synthetic */ C1073e1 f14828r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1198s1(C1073e1 c1073e1, String str) {
        super(c1073e1);
        this.f14827q = str;
        this.f14828r = c1073e1;
    }

    @Override // com.google.android.gms.internal.measurement.C1073e1.a
    final void a() {
        ((P0) Preconditions.checkNotNull(this.f14828r.f14567i)).beginAdUnitExposure(this.f14827q, this.f14569n);
    }
}
