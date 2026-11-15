package p0;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import n0.C1892b;
import s0.InterfaceC2034b;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f21522a;

    static {
        String strI = l0.i.i("NetworkStateTracker");
        w5.k.e(strI, "tagWithPrefix(\"NetworkStateTracker\")");
        f21522a = strI;
    }

    public static final h a(Context context, InterfaceC2034b interfaceC2034b) {
        w5.k.f(context, "context");
        w5.k.f(interfaceC2034b, "taskExecutor");
        return new j(context, interfaceC2034b);
    }

    public static final C1892b c(ConnectivityManager connectivityManager) {
        w5.k.f(connectivityManager, "<this>");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z6 = false;
        boolean z7 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        boolean zD = d(connectivityManager);
        boolean zA = androidx.core.net.a.a(connectivityManager);
        if (activeNetworkInfo != null && !activeNetworkInfo.isRoaming()) {
            z6 = true;
        }
        return new C1892b(z7, zD, zA, z6);
    }

    public static final boolean d(ConnectivityManager connectivityManager) {
        w5.k.f(connectivityManager, "<this>");
        try {
            NetworkCapabilities networkCapabilitiesA = r0.m.a(connectivityManager, r0.n.a(connectivityManager));
            if (networkCapabilitiesA != null) {
                return r0.m.b(networkCapabilitiesA, 16);
            }
            return false;
        } catch (SecurityException e7) {
            l0.i.e().d(f21522a, "Unable to validate active network", e7);
            return false;
        }
    }
}
