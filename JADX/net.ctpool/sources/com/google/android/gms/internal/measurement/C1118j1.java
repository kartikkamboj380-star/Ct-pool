package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.C1073e1;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.j1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1118j1 extends C1073e1.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final /* synthetic */ String f14631q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final /* synthetic */ String f14632r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final /* synthetic */ Bundle f14633s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final /* synthetic */ C1073e1 f14634t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1118j1(C1073e1 c1073e1, String str, String str2, Bundle bundle) {
        super(c1073e1);
        this.f14631q = str;
        this.f14632r = str2;
        this.f14633s = bundle;
        this.f14634t = c1073e1;
    }

    @Override // com.google.android.gms.internal.measurement.C1073e1.a
    final void a() {
        ((P0) Preconditions.checkNotNull(this.f14634t.f14567i)).clearConditionalUserProperty(this.f14631q, this.f14632r, this.f14633s);
    }
}
