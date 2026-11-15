package l3;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import k3.C1819b;

/* JADX INFO: loaded from: classes.dex */
final class k extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f21107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ GoogleSignInOptions f21108b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(GoogleApiClient googleApiClient, Context context, GoogleSignInOptions googleSignInOptions) {
        super(googleApiClient);
        this.f21107a = context;
        this.f21108b = googleSignInOptions;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ Result createFailedResult(Status status) {
        return new C1819b(null, status);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((w) ((i) anyClient).getService()).m0(new j(this), this.f21108b);
    }
}
