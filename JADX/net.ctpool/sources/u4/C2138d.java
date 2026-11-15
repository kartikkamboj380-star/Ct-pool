package u4;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;

/* JADX INFO: renamed from: u4.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2138d extends GoogleApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Api.ClientKey f22544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Api.AbstractClientBuilder f22545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Api f22546c;

    /* JADX INFO: renamed from: u4.d$a */
    class a extends Api.AbstractClientBuilder {
        a() {
        }

        @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2139e buildClient(Context context, Looper looper, ClientSettings clientSettings, Api.ApiOptions.NoOptions noOptions, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
            return new C2139e(context, looper, clientSettings, connectionCallbacks, onConnectionFailedListener);
        }
    }

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f22544a = clientKey;
        a aVar = new a();
        f22545b = aVar;
        f22546c = new Api("DynamicLinks.API", aVar, clientKey);
    }

    public C2138d(Context context) {
        super(context, (Api<Api.ApiOptions.NoOptions>) f22546c, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }
}
