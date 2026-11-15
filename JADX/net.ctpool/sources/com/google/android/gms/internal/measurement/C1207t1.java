package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.C1073e1;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.t1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1207t1 extends C1073e1.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final /* synthetic */ Q0 f14847q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final /* synthetic */ C1073e1 f14848r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1207t1(C1073e1 c1073e1, Q0 q02) {
        super(c1073e1);
        this.f14847q = q02;
        this.f14848r = c1073e1;
    }

    @Override // com.google.android.gms.internal.measurement.C1073e1.a
    final void a() {
        ((P0) Preconditions.checkNotNull(this.f14848r.f14567i)).getCachedAppInstanceId(this.f14847q);
    }

    @Override // com.google.android.gms.internal.measurement.C1073e1.a
    protected final void b() {
        this.f14847q.b(null);
    }
}
