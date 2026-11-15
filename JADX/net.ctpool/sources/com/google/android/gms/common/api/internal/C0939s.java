package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0939s implements GoogleApiClient.ConnectionCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f13645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ StatusPendingResult f13646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ zabe f13647c;

    C0939s(zabe zabeVar, AtomicReference atomicReference, StatusPendingResult statusPendingResult) {
        this.f13647c = zabeVar;
        this.f13645a = atomicReference;
        this.f13646b = statusPendingResult;
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        this.f13647c.zam((GoogleApiClient) Preconditions.checkNotNull((GoogleApiClient) this.f13645a.get()), this.f13646b, true);
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i7) {
    }
}
