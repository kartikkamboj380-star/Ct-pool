package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.C1073e1;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.h1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1100h1 extends C1073e1.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final /* synthetic */ String f14598q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final /* synthetic */ String f14599r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final /* synthetic */ Object f14600s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final /* synthetic */ boolean f14601t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final /* synthetic */ C1073e1 f14602u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1100h1(C1073e1 c1073e1, String str, String str2, Object obj, boolean z6) {
        super(c1073e1);
        this.f14598q = str;
        this.f14599r = str2;
        this.f14600s = obj;
        this.f14601t = z6;
        this.f14602u = c1073e1;
    }

    @Override // com.google.android.gms.internal.measurement.C1073e1.a
    final void a() {
        ((P0) Preconditions.checkNotNull(this.f14602u.f14567i)).setUserProperty(this.f14598q, this.f14599r, com.google.android.gms.dynamic.b.k0(this.f14600s), this.f14601t, this.f14568m);
    }
}
