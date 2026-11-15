package Y5;

import T5.C0455a;
import T5.F;
import T5.InterfaceC0459e;
import T5.r;
import T5.u;
import j5.AbstractC1809n;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import v5.InterfaceC2171a;
import w5.l;

/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f4595i = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f4596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f4597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f4598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f4599d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C0455a f4600e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final i f4601f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC0459e f4602g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final r f4603h;

    public static final class a {
        private a() {
        }

        public final String a(InetSocketAddress inetSocketAddress) {
            String hostName;
            String str;
            w5.k.f(inetSocketAddress, "$this$socketHost");
            InetAddress address = inetSocketAddress.getAddress();
            if (address != null) {
                hostName = address.getHostAddress();
                str = "address.hostAddress";
            } else {
                hostName = inetSocketAddress.getHostName();
                str = "hostName";
            }
            w5.k.e(hostName, str);
            return hostName;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f4604a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f4605b;

        public b(List list) {
            w5.k.f(list, "routes");
            this.f4605b = list;
        }

        public final List a() {
            return this.f4605b;
        }

        public final boolean b() {
            return this.f4604a < this.f4605b.size();
        }

        public final F c() {
            if (!b()) {
                throw new NoSuchElementException();
            }
            List list = this.f4605b;
            int i7 = this.f4604a;
            this.f4604a = i7 + 1;
            return (F) list.get(i7);
        }
    }

    static final class c extends l implements InterfaceC2171a {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Proxy f4607n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ u f4608o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Proxy proxy, u uVar) {
            super(0);
            this.f4607n = proxy;
            this.f4608o = uVar;
        }

        @Override // v5.InterfaceC2171a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            Proxy proxy = this.f4607n;
            if (proxy != null) {
                return AbstractC1809n.d(proxy);
            }
            URI uriQ = this.f4608o.q();
            if (uriQ.getHost() == null) {
                return U5.c.t(Proxy.NO_PROXY);
            }
            List<Proxy> listSelect = k.this.f4600e.i().select(uriQ);
            List<Proxy> list = listSelect;
            return (list == null || list.isEmpty()) ? U5.c.t(Proxy.NO_PROXY) : U5.c.R(listSelect);
        }
    }

    public k(C0455a c0455a, i iVar, InterfaceC0459e interfaceC0459e, r rVar) {
        w5.k.f(c0455a, "address");
        w5.k.f(iVar, "routeDatabase");
        w5.k.f(interfaceC0459e, "call");
        w5.k.f(rVar, "eventListener");
        this.f4600e = c0455a;
        this.f4601f = iVar;
        this.f4602g = interfaceC0459e;
        this.f4603h = rVar;
        this.f4596a = AbstractC1809n.i();
        this.f4598c = AbstractC1809n.i();
        this.f4599d = new ArrayList();
        g(c0455a.l(), c0455a.g());
    }

    private final boolean c() {
        return this.f4597b < this.f4596a.size();
    }

    private final Proxy e() throws SocketException, UnknownHostException {
        if (c()) {
            List list = this.f4596a;
            int i7 = this.f4597b;
            this.f4597b = i7 + 1;
            Proxy proxy = (Proxy) list.get(i7);
            f(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f4600e.l().h() + "; exhausted proxy configurations: " + this.f4596a);
    }

    private final void f(Proxy proxy) throws SocketException, UnknownHostException {
        String strH;
        int iL;
        ArrayList arrayList = new ArrayList();
        this.f4598c = arrayList;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            strH = this.f4600e.l().h();
            iL = this.f4600e.l().l();
        } else {
            SocketAddress socketAddressAddress = proxy.address();
            if (!(socketAddressAddress instanceof InetSocketAddress)) {
                throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass()).toString());
            }
            InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
            strH = f4595i.a(inetSocketAddress);
            iL = inetSocketAddress.getPort();
        }
        if (1 > iL || 65535 < iL) {
            throw new SocketException("No route to " + strH + ':' + iL + "; port is out of range");
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            arrayList.add(InetSocketAddress.createUnresolved(strH, iL));
            return;
        }
        this.f4603h.n(this.f4602g, strH);
        List listA = this.f4600e.c().a(strH);
        if (listA.isEmpty()) {
            throw new UnknownHostException(this.f4600e.c() + " returned no addresses for " + strH);
        }
        this.f4603h.m(this.f4602g, strH, listA);
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(new InetSocketAddress((InetAddress) it.next(), iL));
        }
    }

    private final void g(u uVar, Proxy proxy) {
        c cVar = new c(proxy, uVar);
        this.f4603h.p(this.f4602g, uVar);
        List listInvoke = cVar.invoke();
        this.f4596a = listInvoke;
        this.f4597b = 0;
        this.f4603h.o(this.f4602g, uVar, listInvoke);
    }

    public final boolean b() {
        return c() || (this.f4599d.isEmpty() ^ true);
    }

    public final b d() {
        if (!b()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (c()) {
            Proxy proxyE = e();
            Iterator it = this.f4598c.iterator();
            while (it.hasNext()) {
                F f7 = new F(this.f4600e, proxyE, (InetSocketAddress) it.next());
                if (this.f4601f.c(f7)) {
                    this.f4599d.add(f7);
                } else {
                    arrayList.add(f7);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            AbstractC1809n.t(arrayList, this.f4599d);
            this.f4599d.clear();
        }
        return new b(arrayList);
    }
}
