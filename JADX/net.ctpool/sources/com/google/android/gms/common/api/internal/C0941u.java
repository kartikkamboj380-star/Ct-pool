package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0941u implements ResultCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ StatusPendingResult f13649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f13650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ GoogleApiClient f13651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ zabe f13652d;

    C0941u(zabe zabeVar, StatusPendingResult statusPendingResult, boolean z6, GoogleApiClient googleApiClient) {
        this.f13652d = zabeVar;
        this.f13649a = statusPendingResult;
        this.f13650b = z6;
        this.f13651c = googleApiClient;
    }

    @Override // com.google.android.gms.common.api.ResultCallback
    public final /* bridge */ /* synthetic */ void onResult(Result result) {
        Status status = (Status) result;
        l3.c.b(this.f13652d.zan).i();
        if (status.isSuccess() && this.f13652d.isConnected()) {
            zabe zabeVar = this.f13652d;
            zabeVar.disconnect();
            zabeVar.connect();
        }
        this.f13649a.setResult(status);
        if (this.f13650b) {
            this.f13651c.disconnect();
        }
    }
}
