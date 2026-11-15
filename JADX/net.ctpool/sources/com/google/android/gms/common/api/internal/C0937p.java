package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;
import x3.InterfaceC2224e;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0937p implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ zaaw f13642a;

    /* synthetic */ C0937p(zaaw zaawVar, zaas zaasVar) {
        this.f13642a = zaawVar;
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        ((InterfaceC2224e) Preconditions.checkNotNull(this.f13642a.zak)).a(new BinderC0936o(this.f13642a));
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.f13642a.zab.lock();
        try {
            if (this.f13642a.zaI(connectionResult)) {
                this.f13642a.zaA();
                this.f13642a.zaF();
            } else {
                this.f13642a.zaD(connectionResult);
            }
            this.f13642a.zab.unlock();
        } catch (Throwable th) {
            this.f13642a.zab.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i7) {
    }
}
