package e6;

import e6.l;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f19240b = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final l.a f19239a = new a();

    public static final class a implements l.a {
        a() {
        }

        @Override // e6.l.a
        public boolean a(SSLSocket sSLSocket) {
            w5.k.f(sSLSocket, "sslSocket");
            return d6.c.f18693f.b() && (sSLSocket instanceof BCSSLSocket);
        }

        @Override // e6.l.a
        public m b(SSLSocket sSLSocket) {
            w5.k.f(sSLSocket, "sslSocket");
            return new i();
        }
    }

    public static final class b {
        private b() {
        }

        public final l.a a() {
            return i.f19239a;
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // e6.m
    public boolean a(SSLSocket sSLSocket) {
        w5.k.f(sSLSocket, "sslSocket");
        return sSLSocket instanceof BCSSLSocket;
    }

    @Override // e6.m
    public boolean e() {
        return d6.c.f18693f.b();
    }

    @Override // e6.m
    public String f(SSLSocket sSLSocket) {
        w5.k.f(sSLSocket, "sslSocket");
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null || (applicationProtocol.hashCode() == 0 && applicationProtocol.equals(""))) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // e6.m
    public void g(SSLSocket sSLSocket, String str, List list) {
        w5.k.f(sSLSocket, "sslSocket");
        w5.k.f(list, "protocols");
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            w5.k.e(parameters, "sslParameters");
            Object[] array = d6.j.f18715c.b(list).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            parameters.setApplicationProtocols((String[]) array);
            bCSSLSocket.setParameters(parameters);
        }
    }
}
