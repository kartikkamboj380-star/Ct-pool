package i3;

import android.content.Context;
import android.os.Looper;
import androidx.appcompat.app.y;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.internal.auth.C0957d;

/* JADX INFO: loaded from: classes.dex */
final class h extends Api.AbstractClientBuilder {
    h() {
    }

    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    public final /* synthetic */ Api.Client buildClient(Context context, Looper looper, ClientSettings clientSettings, Object obj, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        y.a(obj);
        return new C0957d(context, looper, clientSettings, null, connectionCallbacks, onConnectionFailedListener);
    }
}
