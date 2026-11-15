package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.C1073e1;

/* JADX INFO: loaded from: classes.dex */
final class H1 extends C1073e1.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final /* synthetic */ Long f14206q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final /* synthetic */ String f14207r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final /* synthetic */ String f14208s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final /* synthetic */ Bundle f14209t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final /* synthetic */ boolean f14210u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final /* synthetic */ boolean f14211v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final /* synthetic */ C1073e1 f14212w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    H1(C1073e1 c1073e1, Long l7, String str, String str2, Bundle bundle, boolean z6, boolean z7) {
        super(c1073e1);
        this.f14206q = l7;
        this.f14207r = str;
        this.f14208s = str2;
        this.f14209t = bundle;
        this.f14210u = z6;
        this.f14211v = z7;
        this.f14212w = c1073e1;
    }

    @Override // com.google.android.gms.internal.measurement.C1073e1.a
    final void a() {
        Long l7 = this.f14206q;
        ((P0) Preconditions.checkNotNull(this.f14212w.f14567i)).logEvent(this.f14207r, this.f14208s, this.f14209t, this.f14210u, this.f14211v, l7 == null ? this.f14568m : l7.longValue());
    }
}
