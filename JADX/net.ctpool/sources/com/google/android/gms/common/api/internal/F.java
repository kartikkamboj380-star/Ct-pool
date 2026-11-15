package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes.dex */
final class F implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final /* synthetic */ ConnectionResult f13558m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ G f13559n;

    F(G g7, ConnectionResult connectionResult) {
        this.f13559n = g7;
        this.f13558m = connectionResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        G g7 = this.f13559n;
        zabq zabqVar = (zabq) g7.f13565f.zan.get(g7.f13561b);
        if (zabqVar == null) {
            return;
        }
        if (!this.f13558m.isSuccess()) {
            zabqVar.zar(this.f13558m, null);
            return;
        }
        this.f13559n.f13564e = true;
        if (this.f13559n.f13560a.requiresSignIn()) {
            this.f13559n.e();
            return;
        }
        try {
            G g8 = this.f13559n;
            g8.f13560a.getRemoteService(null, g8.f13560a.getScopesForConnectionlessNonSignIn());
        } catch (SecurityException e7) {
            Log.e("GoogleApiManager", "Failed to get service from broker. ", e7);
            this.f13559n.f13560a.disconnect("Failed to get service from broker.");
            zabqVar.zar(new ConnectionResult(10), null);
        }
    }
}
