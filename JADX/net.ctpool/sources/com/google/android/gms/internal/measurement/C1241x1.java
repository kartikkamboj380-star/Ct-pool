package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.C1073e1;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.x1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1241x1 extends C1073e1.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final /* synthetic */ String f14964q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final /* synthetic */ String f14965r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final /* synthetic */ boolean f14966s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final /* synthetic */ Q0 f14967t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final /* synthetic */ C1073e1 f14968u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1241x1(C1073e1 c1073e1, String str, String str2, boolean z6, Q0 q02) {
        super(c1073e1);
        this.f14964q = str;
        this.f14965r = str2;
        this.f14966s = z6;
        this.f14967t = q02;
        this.f14968u = c1073e1;
    }

    @Override // com.google.android.gms.internal.measurement.C1073e1.a
    final void a() {
        ((P0) Preconditions.checkNotNull(this.f14968u.f14567i)).getUserProperties(this.f14964q, this.f14965r, this.f14966s, this.f14967t);
    }

    @Override // com.google.android.gms.internal.measurement.C1073e1.a
    protected final void b() {
        this.f14967t.b(null);
    }
}
