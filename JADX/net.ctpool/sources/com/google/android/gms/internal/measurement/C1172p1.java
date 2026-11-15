package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.C1073e1;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.p1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1172p1 extends C1073e1.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final /* synthetic */ long f14775q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final /* synthetic */ C1073e1 f14776r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1172p1(C1073e1 c1073e1, long j7) {
        super(c1073e1);
        this.f14775q = j7;
        this.f14776r = c1073e1;
    }

    @Override // com.google.android.gms.internal.measurement.C1073e1.a
    final void a() {
        ((P0) Preconditions.checkNotNull(this.f14776r.f14567i)).setSessionTimeoutDuration(this.f14775q);
    }
}
