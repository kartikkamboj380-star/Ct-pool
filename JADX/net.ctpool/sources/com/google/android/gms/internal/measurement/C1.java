package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.C1073e1;

/* JADX INFO: loaded from: classes.dex */
final class C1 extends C1073e1.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final /* synthetic */ Q0 f14148q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final /* synthetic */ C1073e1 f14149r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1(C1073e1 c1073e1, Q0 q02) {
        super(c1073e1);
        this.f14148q = q02;
        this.f14149r = c1073e1;
    }

    @Override // com.google.android.gms.internal.measurement.C1073e1.a
    final void a() {
        ((P0) Preconditions.checkNotNull(this.f14149r.f14567i)).getAppInstanceId(this.f14148q);
    }

    @Override // com.google.android.gms.internal.measurement.C1073e1.a
    protected final void b() {
        this.f14148q.b(null);
    }
}
