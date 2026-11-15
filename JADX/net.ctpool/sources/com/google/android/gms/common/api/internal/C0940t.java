package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0940t implements GoogleApiClient.OnConnectionFailedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ StatusPendingResult f13648a;

    C0940t(zabe zabeVar, StatusPendingResult statusPendingResult) {
        this.f13648a = statusPendingResult;
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.f13648a.setResult(new Status(8));
    }
}
