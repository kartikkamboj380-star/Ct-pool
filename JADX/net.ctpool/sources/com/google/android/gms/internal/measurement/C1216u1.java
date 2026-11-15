package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.C1073e1;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.u1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1216u1 extends C1073e1.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final /* synthetic */ Q0 f14923q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final /* synthetic */ C1073e1 f14924r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1216u1(C1073e1 c1073e1, Q0 q02) {
        super(c1073e1);
        this.f14923q = q02;
        this.f14924r = c1073e1;
    }

    @Override // com.google.android.gms.internal.measurement.C1073e1.a
    final void a() {
        ((P0) Preconditions.checkNotNull(this.f14924r.f14567i)).getGmpAppId(this.f14923q);
    }

    @Override // com.google.android.gms.internal.measurement.C1073e1.a
    protected final void b() {
        this.f14923q.b(null);
    }
}
