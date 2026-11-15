package androidx.core.net;

import android.net.ConnectivityManager;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: androidx.core.net.a$a, reason: collision with other inner class name */
    static class C0140a {
        static boolean a(ConnectivityManager connectivityManager) {
            return connectivityManager.isActiveNetworkMetered();
        }
    }

    public static boolean a(ConnectivityManager connectivityManager) {
        return C0140a.a(connectivityManager);
    }
}
