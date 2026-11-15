package x3;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;

/* JADX INFO: renamed from: x3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C2221b extends Api.AbstractClientBuilder {
    C2221b() {
    }

    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    public final /* bridge */ /* synthetic */ Api.Client buildClient(Context context, Looper looper, ClientSettings clientSettings, Object obj, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return new com.google.android.gms.signin.internal.a(context, looper, true, clientSettings, com.google.android.gms.signin.internal.a.c(clientSettings), connectionCallbacks, onConnectionFailedListener);
    }
}
