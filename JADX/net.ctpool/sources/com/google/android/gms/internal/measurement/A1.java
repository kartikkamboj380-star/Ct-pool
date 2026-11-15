package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.C1073e1;

/* JADX INFO: loaded from: classes.dex */
final class A1 extends C1073e1.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final /* synthetic */ String f14121q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final /* synthetic */ Q0 f14122r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final /* synthetic */ C1073e1 f14123s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    A1(C1073e1 c1073e1, String str, Q0 q02) {
        super(c1073e1);
        this.f14121q = str;
        this.f14122r = q02;
        this.f14123s = c1073e1;
    }

    @Override // com.google.android.gms.internal.measurement.C1073e1.a
    final void a() {
        ((P0) Preconditions.checkNotNull(this.f14123s.f14567i)).getMaxUserProperties(this.f14121q, this.f14122r);
    }

    @Override // com.google.android.gms.internal.measurement.C1073e1.a
    protected final void b() {
        this.f14122r.b(null);
    }
}
