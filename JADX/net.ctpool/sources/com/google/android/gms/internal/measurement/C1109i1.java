package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.C1073e1;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.i1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1109i1 extends C1073e1.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final /* synthetic */ String f14613q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final /* synthetic */ String f14614r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final /* synthetic */ Q0 f14615s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final /* synthetic */ C1073e1 f14616t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1109i1(C1073e1 c1073e1, String str, String str2, Q0 q02) {
        super(c1073e1);
        this.f14613q = str;
        this.f14614r = str2;
        this.f14615s = q02;
        this.f14616t = c1073e1;
    }

    @Override // com.google.android.gms.internal.measurement.C1073e1.a
    final void a() {
        ((P0) Preconditions.checkNotNull(this.f14616t.f14567i)).getConditionalUserProperties(this.f14613q, this.f14614r, this.f14615s);
    }

    @Override // com.google.android.gms.internal.measurement.C1073e1.a
    protected final void b() {
        this.f14615s.b(null);
    }
}
