package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.C1073e1;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.v1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1225v1 extends C1073e1.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final /* synthetic */ Q0 f14931q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final /* synthetic */ C1073e1 f14932r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1225v1(C1073e1 c1073e1, Q0 q02) {
        super(c1073e1);
        this.f14931q = q02;
        this.f14932r = c1073e1;
    }

    @Override // com.google.android.gms.internal.measurement.C1073e1.a
    final void a() {
        ((P0) Preconditions.checkNotNull(this.f14932r.f14567i)).getCurrentScreenName(this.f14931q);
    }

    @Override // com.google.android.gms.internal.measurement.C1073e1.a
    protected final void b() {
        this.f14931q.b(null);
    }
}
