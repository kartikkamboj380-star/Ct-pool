package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class G implements BaseGmsClient.ConnectionProgressReportCallbacks, zacs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Api.Client f13560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ApiKey f13561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IAccountAccessor f13562c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Set f13563d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f13564e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ GoogleApiManager f13565f;

    public G(GoogleApiManager googleApiManager, Api.Client client, ApiKey apiKey) {
        this.f13565f = googleApiManager;
        this.f13560a = client;
        this.f13561b = apiKey;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        IAccountAccessor iAccountAccessor;
        if (!this.f13564e || (iAccountAccessor = this.f13562c) == null) {
            return;
        }
        this.f13560a.getRemoteService(iAccountAccessor, this.f13563d);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
    public final void onReportServiceBinding(ConnectionResult connectionResult) {
        this.f13565f.zar.post(new F(this, connectionResult));
    }

    @Override // com.google.android.gms.common.api.internal.zacs
    public final void zae(ConnectionResult connectionResult) {
        zabq zabqVar = (zabq) this.f13565f.zan.get(this.f13561b);
        if (zabqVar != null) {
            zabqVar.zas(connectionResult);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zacs
    public final void zaf(IAccountAccessor iAccountAccessor, Set set) {
        if (iAccountAccessor == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            zae(new ConnectionResult(4));
        } else {
            this.f13562c = iAccountAccessor;
            this.f13563d = set;
            e();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zacs
    public final void zag(int i7) {
        zabq zabqVar = (zabq) this.f13565f.zan.get(this.f13561b);
        if (zabqVar != null) {
            if (zabqVar.zaj) {
                zabqVar.zas(new ConnectionResult(17));
            } else {
                zabqVar.onConnectionSuspended(i7);
            }
        }
    }
}
