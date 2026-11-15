package e6;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private m f19247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f19248b;

    public interface a {
        boolean a(SSLSocket sSLSocket);

        m b(SSLSocket sSLSocket);
    }

    public l(a aVar) {
        w5.k.f(aVar, "socketAdapterFactory");
        this.f19248b = aVar;
    }

    private final synchronized m b(SSLSocket sSLSocket) {
        try {
            if (this.f19247a == null && this.f19248b.a(sSLSocket)) {
                this.f19247a = this.f19248b.b(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f19247a;
    }

    @Override // e6.m
    public boolean a(SSLSocket sSLSocket) {
        w5.k.f(sSLSocket, "sslSocket");
        return this.f19248b.a(sSLSocket);
    }

    @Override // e6.m
    public boolean e() {
        return true;
    }

    @Override // e6.m
    public String f(SSLSocket sSLSocket) {
        w5.k.f(sSLSocket, "sslSocket");
        m mVarB = b(sSLSocket);
        if (mVarB != null) {
            return mVarB.f(sSLSocket);
        }
        return null;
    }

    @Override // e6.m
    public void g(SSLSocket sSLSocket, String str, List list) {
        w5.k.f(sSLSocket, "sslSocket");
        w5.k.f(list, "protocols");
        m mVarB = b(sSLSocket);
        if (mVarB != null) {
            mVarB.g(sSLSocket, str, list);
        }
    }
}
