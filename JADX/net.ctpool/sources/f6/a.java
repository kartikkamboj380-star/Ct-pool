package f6;

import j5.AbstractC1809n;
import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends ProxySelector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f19309a = new a();

    private a() {
    }

    @Override // java.net.ProxySelector
    public List select(URI uri) {
        if (uri != null) {
            return AbstractC1809n.d(Proxy.NO_PROXY);
        }
        throw new IllegalArgumentException("uri must not be null".toString());
    }

    @Override // java.net.ProxySelector
    public void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }
}
