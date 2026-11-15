package r0;

import android.net.ConnectivityManager;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {
    public static final void a(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        w5.k.f(connectivityManager, "<this>");
        w5.k.f(networkCallback, "networkCallback");
        connectivityManager.registerDefaultNetworkCallback(networkCallback);
    }
}
