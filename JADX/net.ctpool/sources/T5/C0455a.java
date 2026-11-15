package T5;

import T5.u;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: T5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0455a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f3354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f3355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f3356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final q f3357d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final SocketFactory f3358e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final SSLSocketFactory f3359f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HostnameVerifier f3360g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C0461g f3361h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final InterfaceC0456b f3362i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Proxy f3363j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ProxySelector f3364k;

    public C0455a(String str, int i7, q qVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C0461g c0461g, InterfaceC0456b interfaceC0456b, Proxy proxy, List list, List list2, ProxySelector proxySelector) {
        w5.k.f(str, "uriHost");
        w5.k.f(qVar, "dns");
        w5.k.f(socketFactory, "socketFactory");
        w5.k.f(interfaceC0456b, "proxyAuthenticator");
        w5.k.f(list, "protocols");
        w5.k.f(list2, "connectionSpecs");
        w5.k.f(proxySelector, "proxySelector");
        this.f3357d = qVar;
        this.f3358e = socketFactory;
        this.f3359f = sSLSocketFactory;
        this.f3360g = hostnameVerifier;
        this.f3361h = c0461g;
        this.f3362i = interfaceC0456b;
        this.f3363j = proxy;
        this.f3364k = proxySelector;
        this.f3354a = new u.a().o(sSLSocketFactory != null ? "https" : "http").e(str).k(i7).a();
        this.f3355b = U5.c.R(list);
        this.f3356c = U5.c.R(list2);
    }

    public final C0461g a() {
        return this.f3361h;
    }

    public final List b() {
        return this.f3356c;
    }

    public final q c() {
        return this.f3357d;
    }

    public final boolean d(C0455a c0455a) {
        w5.k.f(c0455a, "that");
        return w5.k.b(this.f3357d, c0455a.f3357d) && w5.k.b(this.f3362i, c0455a.f3362i) && w5.k.b(this.f3355b, c0455a.f3355b) && w5.k.b(this.f3356c, c0455a.f3356c) && w5.k.b(this.f3364k, c0455a.f3364k) && w5.k.b(this.f3363j, c0455a.f3363j) && w5.k.b(this.f3359f, c0455a.f3359f) && w5.k.b(this.f3360g, c0455a.f3360g) && w5.k.b(this.f3361h, c0455a.f3361h) && this.f3354a.l() == c0455a.f3354a.l();
    }

    public final HostnameVerifier e() {
        return this.f3360g;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C0455a) {
            C0455a c0455a = (C0455a) obj;
            if (w5.k.b(this.f3354a, c0455a.f3354a) && d(c0455a)) {
                return true;
            }
        }
        return false;
    }

    public final List f() {
        return this.f3355b;
    }

    public final Proxy g() {
        return this.f3363j;
    }

    public final InterfaceC0456b h() {
        return this.f3362i;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.f3354a.hashCode()) * 31) + this.f3357d.hashCode()) * 31) + this.f3362i.hashCode()) * 31) + this.f3355b.hashCode()) * 31) + this.f3356c.hashCode()) * 31) + this.f3364k.hashCode()) * 31) + Objects.hashCode(this.f3363j)) * 31) + Objects.hashCode(this.f3359f)) * 31) + Objects.hashCode(this.f3360g)) * 31) + Objects.hashCode(this.f3361h);
    }

    public final ProxySelector i() {
        return this.f3364k;
    }

    public final SocketFactory j() {
        return this.f3358e;
    }

    public final SSLSocketFactory k() {
        return this.f3359f;
    }

    public final u l() {
        return this.f3354a;
    }

    public String toString() {
        StringBuilder sb;
        Object obj;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Address{");
        sb2.append(this.f3354a.h());
        sb2.append(':');
        sb2.append(this.f3354a.l());
        sb2.append(", ");
        if (this.f3363j != null) {
            sb = new StringBuilder();
            sb.append("proxy=");
            obj = this.f3363j;
        } else {
            sb = new StringBuilder();
            sb.append("proxySelector=");
            obj = this.f3364k;
        }
        sb.append(obj);
        sb2.append(sb.toString());
        sb2.append("}");
        return sb2.toString();
    }
}
