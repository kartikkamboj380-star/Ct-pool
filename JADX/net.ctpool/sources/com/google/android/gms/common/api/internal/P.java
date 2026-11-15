package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes.dex */
final class P implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final /* synthetic */ Result f13581m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ zada f13582n;

    P(zada zadaVar, Result result) {
        this.f13582n = zadaVar;
        this.f13581m = result;
    }

    @Override // java.lang.Runnable
    public final void run() {
        GoogleApiClient googleApiClient;
        try {
            try {
                ThreadLocal threadLocal = BasePendingResult.zaa;
                threadLocal.set(Boolean.TRUE);
                PendingResult pendingResultOnSuccess = ((ResultTransform) Preconditions.checkNotNull(this.f13582n.zaa)).onSuccess(this.f13581m);
                zada zadaVar = this.f13582n;
                zadaVar.zah.sendMessage(zadaVar.zah.obtainMessage(0, pendingResultOnSuccess));
                threadLocal.set(Boolean.FALSE);
                zada zadaVar2 = this.f13582n;
                zada.zan(this.f13581m);
                googleApiClient = (GoogleApiClient) this.f13582n.zag.get();
                if (googleApiClient == null) {
                    return;
                }
            } catch (RuntimeException e7) {
                zada zadaVar3 = this.f13582n;
                zadaVar3.zah.sendMessage(zadaVar3.zah.obtainMessage(1, e7));
                BasePendingResult.zaa.set(Boolean.FALSE);
                zada zadaVar4 = this.f13582n;
                zada.zan(this.f13581m);
                googleApiClient = (GoogleApiClient) this.f13582n.zag.get();
                if (googleApiClient == null) {
                    return;
                }
            }
            googleApiClient.zap(this.f13582n);
        } catch (Throwable th) {
            BasePendingResult.zaa.set(Boolean.FALSE);
            zada zadaVar5 = this.f13582n;
            zada.zan(this.f13581m);
            GoogleApiClient googleApiClient2 = (GoogleApiClient) this.f13582n.zag.get();
            if (googleApiClient2 != null) {
                googleApiClient2.zap(this.f13582n);
            }
            throw th;
        }
    }
}
