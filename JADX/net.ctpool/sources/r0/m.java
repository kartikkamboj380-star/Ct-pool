package r0;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {
    public static final NetworkCapabilities a(ConnectivityManager connectivityManager, Network network) {
        w5.k.f(connectivityManager, "<this>");
        return connectivityManager.getNetworkCapabilities(network);
    }

    public static final boolean b(NetworkCapabilities networkCapabilities, int i7) {
        w5.k.f(networkCapabilities, "<this>");
        return networkCapabilities.hasCapability(i7);
    }

    public static final void c(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        w5.k.f(connectivityManager, "<this>");
        w5.k.f(networkCallback, "networkCallback");
        connectivityManager.unregisterNetworkCallback(networkCallback);
    }
}
