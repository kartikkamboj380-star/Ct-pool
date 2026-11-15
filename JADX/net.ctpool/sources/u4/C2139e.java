package u4;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import u4.InterfaceC2142h;
import u4.InterfaceC2143i;

/* JADX INFO: renamed from: u4.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2139e extends GmsClient {
    public C2139e(Context context, Looper looper, ClientSettings clientSettings, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 131, clientSettings, connectionCallbacks, onConnectionFailedListener);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.BaseGmsClient
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC2143i createServiceInterface(IBinder iBinder) {
        return InterfaceC2143i.a.i0(iBinder);
    }

    void d(InterfaceC2142h.a aVar, Bundle bundle) {
        try {
            ((InterfaceC2143i) getService()).c0(aVar, bundle);
        } catch (RemoteException unused) {
        }
    }

    void e(InterfaceC2142h.a aVar, String str) {
        try {
            ((InterfaceC2143i) getService()).X(aVar, str);
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected String getServiceDescriptor() {
        return "com.google.firebase.dynamiclinks.internal.IDynamicLinksService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected String getStartServiceAction() {
        return "com.google.firebase.dynamiclinks.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public boolean usesClientTelemetry() {
        return true;
    }
}
