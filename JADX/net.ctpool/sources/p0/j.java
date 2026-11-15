package p0;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import n0.C1892b;
import r0.o;
import s0.InterfaceC2034b;

/* JADX INFO: loaded from: classes.dex */
public final class j extends h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ConnectivityManager f21519f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final a f21520g;

    public static final class a extends ConnectivityManager.NetworkCallback {
        a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            w5.k.f(network, "network");
            w5.k.f(networkCapabilities, "capabilities");
            l0.i.e().a(k.f21522a, "Network capabilities changed: " + networkCapabilities);
            j jVar = j.this;
            jVar.g(k.c(jVar.f21519f));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            w5.k.f(network, "network");
            l0.i.e().a(k.f21522a, "Network connection lost");
            j jVar = j.this;
            jVar.g(k.c(jVar.f21519f));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, InterfaceC2034b interfaceC2034b) {
        super(context, interfaceC2034b);
        w5.k.f(context, "context");
        w5.k.f(interfaceC2034b, "taskExecutor");
        Object systemService = d().getSystemService("connectivity");
        w5.k.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f21519f = (ConnectivityManager) systemService;
        this.f21520g = new a();
    }

    @Override // p0.h
    public void h() {
        try {
            l0.i.e().a(k.f21522a, "Registering network callback");
            o.a(this.f21519f, this.f21520g);
        } catch (IllegalArgumentException | SecurityException e7) {
            l0.i.e().d(k.f21522a, "Received exception while registering network callback", e7);
        }
    }

    @Override // p0.h
    public void i() {
        try {
            l0.i.e().a(k.f21522a, "Unregistering network callback");
            r0.m.c(this.f21519f, this.f21520g);
        } catch (IllegalArgumentException | SecurityException e7) {
            l0.i.e().d(k.f21522a, "Received exception while unregistering network callback", e7);
        }
    }

    @Override // p0.h
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public C1892b e() {
        return k.c(this.f21519f);
    }
}
