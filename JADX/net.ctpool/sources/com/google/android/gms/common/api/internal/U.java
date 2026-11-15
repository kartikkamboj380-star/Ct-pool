package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;

/* JADX INFO: loaded from: classes.dex */
final class U implements GoogleApiClient.OnConnectionFailedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GoogleApiClient f13586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final GoogleApiClient.OnConnectionFailedListener f13587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ zak f13588d;

    public U(zak zakVar, int i7, GoogleApiClient googleApiClient, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.f13588d = zakVar;
        this.f13585a = i7;
        this.f13586b = googleApiClient;
        this.f13587c = onConnectionFailedListener;
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        Log.d("AutoManageHelper", "beginFailureResolution for ".concat(String.valueOf(connectionResult)));
        this.f13588d.zah(connectionResult, this.f13585a);
    }
}
