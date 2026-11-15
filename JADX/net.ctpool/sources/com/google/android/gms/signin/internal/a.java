package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zat;
import x3.InterfaceC2224e;

/* JADX INFO: loaded from: classes.dex */
public class a extends GmsClient implements InterfaceC2224e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f16402e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f16403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ClientSettings f16404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Bundle f16405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Integer f16406d;

    public a(Context context, Looper looper, boolean z6, ClientSettings clientSettings, Bundle bundle, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 44, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.f16403a = true;
        this.f16404b = clientSettings;
        this.f16405c = bundle;
        this.f16406d = clientSettings.zab();
    }

    public static Bundle c(ClientSettings clientSettings) {
        clientSettings.zaa();
        Integer numZab = clientSettings.zab();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", clientSettings.getAccount());
        if (numZab != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", numZab.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // x3.InterfaceC2224e
    public final void a(f fVar) {
        Preconditions.checkNotNull(fVar, "Expecting a valid ISignInCallbacks");
        try {
            Account accountOrDefault = this.f16404b.getAccountOrDefault();
            ((g) getService()).k0(new j(1, new zat(accountOrDefault, ((Integer) Preconditions.checkNotNull(this.f16406d)).intValue(), "<<default account>>".equals(accountOrDefault.name) ? l3.c.b(getContext()).c() : null)), fVar);
        } catch (RemoteException e7) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                fVar.zab(new l(1, new ConnectionResult(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e7);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // x3.InterfaceC2224e
    public final void b(IAccountAccessor iAccountAccessor, boolean z6) {
        try {
            ((g) getService()).j0(iAccountAccessor, ((Integer) Preconditions.checkNotNull(this.f16406d)).intValue(), z6);
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof g ? (g) iInterfaceQueryLocalInterface : new g(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final Bundle getGetServiceRequestExtraArgs() {
        if (!getContext().getPackageName().equals(this.f16404b.getRealClientPackageName())) {
            this.f16405c.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f16404b.getRealClientPackageName());
        }
        return this.f16405c;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final boolean requiresSignIn() {
        return this.f16403a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // x3.InterfaceC2224e
    public final void zaa() {
        try {
            ((g) getService()).i0(((Integer) Preconditions.checkNotNull(this.f16406d)).intValue());
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    @Override // x3.InterfaceC2224e
    public final void zab() {
        connect(new BaseGmsClient.LegacyClientCallbackAdapter());
    }
}
