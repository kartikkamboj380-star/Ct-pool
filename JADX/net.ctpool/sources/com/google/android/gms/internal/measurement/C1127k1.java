package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.C1073e1;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.k1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1127k1 extends C1073e1.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final /* synthetic */ Activity f14660q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final /* synthetic */ String f14661r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final /* synthetic */ String f14662s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final /* synthetic */ C1073e1 f14663t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1127k1(C1073e1 c1073e1, Activity activity, String str, String str2) {
        super(c1073e1);
        this.f14660q = activity;
        this.f14661r = str;
        this.f14662s = str2;
        this.f14663t = c1073e1;
    }

    @Override // com.google.android.gms.internal.measurement.C1073e1.a
    final void a() {
        ((P0) Preconditions.checkNotNull(this.f14663t.f14567i)).setCurrentScreen(com.google.android.gms.dynamic.b.k0(this.f14660q), this.f14661r, this.f14662s, this.f14568m);
    }
}
