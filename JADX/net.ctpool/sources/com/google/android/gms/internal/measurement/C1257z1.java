package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.C1073e1;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.z1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1257z1 extends C1073e1.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final /* synthetic */ String f14995r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final /* synthetic */ Object f14996s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final /* synthetic */ C1073e1 f14999v;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final /* synthetic */ int f14994q = 5;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final /* synthetic */ Object f14997t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final /* synthetic */ Object f14998u = null;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1257z1(C1073e1 c1073e1, boolean z6, int i7, String str, Object obj, Object obj2, Object obj3) {
        super(false);
        this.f14995r = str;
        this.f14996s = obj;
        this.f14999v = c1073e1;
    }

    @Override // com.google.android.gms.internal.measurement.C1073e1.a
    final void a() {
        ((P0) Preconditions.checkNotNull(this.f14999v.f14567i)).logHealthData(this.f14994q, this.f14995r, com.google.android.gms.dynamic.b.k0(this.f14996s), com.google.android.gms.dynamic.b.k0(null), com.google.android.gms.dynamic.b.k0(null));
    }
}
