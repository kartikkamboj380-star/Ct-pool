package T5;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX INFO: loaded from: classes2.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0455a f3343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Proxy f3344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InetSocketAddress f3345c;

    public F(C0455a c0455a, Proxy proxy, InetSocketAddress inetSocketAddress) {
        w5.k.f(c0455a, "address");
        w5.k.f(proxy, "proxy");
        w5.k.f(inetSocketAddress, "socketAddress");
        this.f3343a = c0455a;
        this.f3344b = proxy;
        this.f3345c = inetSocketAddress;
    }

    public final C0455a a() {
        return this.f3343a;
    }

    public final Proxy b() {
        return this.f3344b;
    }

    public final boolean c() {
        return this.f3343a.k() != null && this.f3344b.type() == Proxy.Type.HTTP;
    }

    public final InetSocketAddress d() {
        return this.f3345c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof F) {
            F f7 = (F) obj;
            if (w5.k.b(f7.f3343a, this.f3343a) && w5.k.b(f7.f3344b, this.f3344b) && w5.k.b(f7.f3345c, this.f3345c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.f3343a.hashCode()) * 31) + this.f3344b.hashCode()) * 31) + this.f3345c.hashCode();
    }

    public String toString() {
        return "Route{" + this.f3345c + '}';
    }
}
