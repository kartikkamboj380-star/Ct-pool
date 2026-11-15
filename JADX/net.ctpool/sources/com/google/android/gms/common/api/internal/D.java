package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: loaded from: classes.dex */
final class D implements BaseGmsClient.SignOutCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ zabq f13555a;

    D(zabq zabqVar) {
        this.f13555a = zabqVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.SignOutCallbacks
    public final void onSignOutComplete() {
        this.f13555a.zaa.zar.post(new C(this));
    }
}
