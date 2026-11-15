package V5;

import F5.g;
import T5.B;
import T5.C0455a;
import T5.C0462h;
import T5.D;
import T5.F;
import T5.InterfaceC0456b;
import T5.o;
import T5.q;
import T5.u;
import j5.AbstractC1809n;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.k;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements InterfaceC0456b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final q f4154d;

    public b(q qVar) {
        k.f(qVar, "defaultDns");
        this.f4154d = qVar;
    }

    private final InetAddress b(Proxy proxy, u uVar, q qVar) {
        Proxy.Type type = proxy.type();
        if (type != null && a.f4153a[type.ordinal()] == 1) {
            return (InetAddress) AbstractC1809n.I(qVar.a(uVar.h()));
        }
        SocketAddress socketAddressAddress = proxy.address();
        if (socketAddressAddress == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.net.InetSocketAddress");
        }
        InetAddress address = ((InetSocketAddress) socketAddressAddress).getAddress();
        k.e(address, "(address() as InetSocketAddress).address");
        return address;
    }

    @Override // T5.InterfaceC0456b
    public B a(F f7, D d7) {
        Proxy proxyB;
        q qVarC;
        PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication;
        C0455a c0455aA;
        k.f(d7, "response");
        List<C0462h> listE = d7.e();
        B bJ0 = d7.j0();
        u uVarL = bJ0.l();
        boolean z6 = d7.f() == 407;
        if (f7 == null || (proxyB = f7.b()) == null) {
            proxyB = Proxy.NO_PROXY;
        }
        for (C0462h c0462h : listE) {
            if (g.p("Basic", c0462h.c(), true)) {
                if (f7 == null || (c0455aA = f7.a()) == null || (qVarC = c0455aA.c()) == null) {
                    qVarC = this.f4154d;
                }
                if (z6) {
                    SocketAddress socketAddressAddress = proxyB.address();
                    if (socketAddressAddress == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.net.InetSocketAddress");
                    }
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                    String hostName = inetSocketAddress.getHostName();
                    k.e(proxyB, "proxy");
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(hostName, b(proxyB, uVarL, qVarC), inetSocketAddress.getPort(), uVarL.p(), c0462h.b(), c0462h.c(), uVarL.r(), Authenticator.RequestorType.PROXY);
                } else {
                    String strH = uVarL.h();
                    k.e(proxyB, "proxy");
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(strH, b(proxyB, uVarL, qVarC), uVarL.l(), uVarL.p(), c0462h.b(), c0462h.c(), uVarL.r(), Authenticator.RequestorType.SERVER);
                }
                if (passwordAuthenticationRequestPasswordAuthentication != null) {
                    String str = z6 ? "Proxy-Authorization" : "Authorization";
                    String userName = passwordAuthenticationRequestPasswordAuthentication.getUserName();
                    k.e(userName, "auth.userName");
                    char[] password = passwordAuthenticationRequestPasswordAuthentication.getPassword();
                    k.e(password, "auth.password");
                    return bJ0.i().e(str, o.a(userName, new String(password), c0462h.a())).b();
                }
            }
        }
        return null;
    }

    public /* synthetic */ b(q qVar, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? q.f3606a : qVar);
    }
}
