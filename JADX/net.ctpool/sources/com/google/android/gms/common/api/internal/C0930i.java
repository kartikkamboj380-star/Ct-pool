package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0930i implements BaseGmsClient.ConnectionProgressReportCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f13629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Api f13630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f13631c;

    public C0930i(zaaw zaawVar, Api api, boolean z6) {
        this.f13629a = new WeakReference(zaawVar);
        this.f13630b = api;
        this.f13631c = z6;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
    public final void onReportServiceBinding(ConnectionResult connectionResult) {
        zaaw zaawVar = (zaaw) this.f13629a.get();
        if (zaawVar == null) {
            return;
        }
        Preconditions.checkState(Looper.myLooper() == zaawVar.zaa.zag.getLooper(), "onReportServiceBinding must be called on the GoogleApiClient handler thread");
        zaawVar.zab.lock();
        try {
            if (zaawVar.zaG(0)) {
                if (!connectionResult.isSuccess()) {
                    zaawVar.zaE(connectionResult, this.f13630b, this.f13631c);
                }
                if (zaawVar.zaH()) {
                    zaawVar.zaF();
                }
            }
        } finally {
            zaawVar.zab.unlock();
        }
    }
}
