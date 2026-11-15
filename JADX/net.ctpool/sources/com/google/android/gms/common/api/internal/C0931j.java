package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0931j extends AbstractC0944x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ConnectionResult f13632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ C0933l f13633c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0931j(C0933l c0933l, zabf zabfVar, ConnectionResult connectionResult) {
        super(zabfVar);
        this.f13633c = c0933l;
        this.f13632b = connectionResult;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0944x
    public final void a() {
        this.f13633c.f13636o.zaD(this.f13632b);
    }
}
