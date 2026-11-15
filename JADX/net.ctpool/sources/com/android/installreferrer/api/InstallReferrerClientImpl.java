package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.android.installreferrer.commons.InstallReferrerCommons;
import g3.InterfaceC1693a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class InstallReferrerClientImpl extends InstallReferrerClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f10385a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f10386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC1693a f10387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ServiceConnection f10388d;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ClientState {
        public static final int CLOSED = 3;
        public static final int CONNECTED = 2;
        public static final int CONNECTING = 1;
        public static final int DISCONNECTED = 0;
    }

    private final class b implements ServiceConnection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InstallReferrerStateListener f10389a;

        private b(InstallReferrerStateListener installReferrerStateListener) {
            if (installReferrerStateListener == null) {
                throw new RuntimeException("Please specify a listener to know when setup is done.");
            }
            this.f10389a = installReferrerStateListener;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            InstallReferrerCommons.logVerbose("InstallReferrerClient", "Install Referrer service connected.");
            InstallReferrerClientImpl.this.f10387c = InterfaceC1693a.AbstractBinderC0261a.i0(iBinder);
            InstallReferrerClientImpl.this.f10385a = 2;
            this.f10389a.onInstallReferrerSetupFinished(0);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            InstallReferrerCommons.logWarn("InstallReferrerClient", "Install Referrer service disconnected.");
            InstallReferrerClientImpl.this.f10387c = null;
            InstallReferrerClientImpl.this.f10385a = 0;
            this.f10389a.onInstallReferrerServiceDisconnected();
        }
    }

    public InstallReferrerClientImpl(Context context) {
        this.f10386b = context.getApplicationContext();
    }

    private boolean c() {
        return this.f10386b.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300;
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public void endConnection() {
        this.f10385a = 3;
        if (this.f10388d != null) {
            InstallReferrerCommons.logVerbose("InstallReferrerClient", "Unbinding from service.");
            this.f10386b.unbindService(this.f10388d);
            this.f10388d = null;
        }
        this.f10387c = null;
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public ReferrerDetails getInstallReferrer() throws RemoteException {
        if (!isReady()) {
            throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", this.f10386b.getPackageName());
        try {
            return new ReferrerDetails(this.f10387c.x(bundle));
        } catch (RemoteException e7) {
            InstallReferrerCommons.logWarn("InstallReferrerClient", "RemoteException getting install referrer information");
            this.f10385a = 0;
            throw e7;
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public boolean isReady() {
        return (this.f10385a != 2 || this.f10387c == null || this.f10388d == null) ? false : true;
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public void startConnection(InstallReferrerStateListener installReferrerStateListener) {
        ServiceInfo serviceInfo;
        if (isReady()) {
            InstallReferrerCommons.logVerbose("InstallReferrerClient", "Service connection is valid. No need to re-initialize.");
            installReferrerStateListener.onInstallReferrerSetupFinished(0);
            return;
        }
        int i7 = this.f10385a;
        if (i7 == 1) {
            InstallReferrerCommons.logWarn("InstallReferrerClient", "Client is already in the process of connecting to the service.");
            installReferrerStateListener.onInstallReferrerSetupFinished(3);
            return;
        }
        if (i7 == 3) {
            InstallReferrerCommons.logWarn("InstallReferrerClient", "Client was already closed and can't be reused. Please create another instance.");
            installReferrerStateListener.onInstallReferrerSetupFinished(3);
            return;
        }
        InstallReferrerCommons.logVerbose("InstallReferrerClient", "Starting install referrer service setup.");
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        List<ResolveInfo> listQueryIntentServices = this.f10386b.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty() || (serviceInfo = listQueryIntentServices.get(0).serviceInfo) == null) {
            this.f10385a = 0;
            InstallReferrerCommons.logVerbose("InstallReferrerClient", "Install Referrer service unavailable on device.");
            installReferrerStateListener.onInstallReferrerSetupFinished(2);
            return;
        }
        String str = serviceInfo.packageName;
        String str2 = serviceInfo.name;
        if (!"com.android.vending".equals(str) || str2 == null || !c()) {
            InstallReferrerCommons.logWarn("InstallReferrerClient", "Play Store missing or incompatible. Version 8.3.73 or later required.");
            this.f10385a = 0;
            installReferrerStateListener.onInstallReferrerSetupFinished(2);
            return;
        }
        Intent intent2 = new Intent(intent);
        b bVar = new b(installReferrerStateListener);
        this.f10388d = bVar;
        try {
            if (this.f10386b.bindService(intent2, bVar, 1)) {
                InstallReferrerCommons.logVerbose("InstallReferrerClient", "Service was bonded successfully.");
                return;
            }
            InstallReferrerCommons.logWarn("InstallReferrerClient", "Connection to service is blocked.");
            this.f10385a = 0;
            installReferrerStateListener.onInstallReferrerSetupFinished(1);
        } catch (SecurityException unused) {
            InstallReferrerCommons.logWarn("InstallReferrerClient", "No permission to connect to service.");
            this.f10385a = 0;
            installReferrerStateListener.onInstallReferrerSetupFinished(4);
        }
    }
}
