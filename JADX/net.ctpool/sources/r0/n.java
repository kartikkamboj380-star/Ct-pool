package r0;

import android.net.ConnectivityManager;
import android.net.Network;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    public static final Network a(ConnectivityManager connectivityManager) {
        w5.k.f(connectivityManager, "<this>");
        return connectivityManager.getActiveNetwork();
    }
}
