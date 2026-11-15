package e6;

import e6.l;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.Conscrypt;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f19246b = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final l.a f19245a = new a();

    public static final class a implements l.a {
        a() {
        }

        @Override // e6.l.a
        public boolean a(SSLSocket sSLSocket) {
            w5.k.f(sSLSocket, "sslSocket");
            return d6.d.f18696f.c() && Conscrypt.isConscrypt(sSLSocket);
        }

        @Override // e6.l.a
        public m b(SSLSocket sSLSocket) {
            w5.k.f(sSLSocket, "sslSocket");
            return new k();
        }
    }

    public static final class b {
        private b() {
        }

        public final l.a a() {
            return k.f19245a;
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // e6.m
    public boolean a(SSLSocket sSLSocket) {
        w5.k.f(sSLSocket, "sslSocket");
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // e6.m
    public boolean e() {
        return d6.d.f18696f.c();
    }

    @Override // e6.m
    public String f(SSLSocket sSLSocket) {
        w5.k.f(sSLSocket, "sslSocket");
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // e6.m
    public void g(SSLSocket sSLSocket, String str, List list) {
        w5.k.f(sSLSocket, "sslSocket");
        w5.k.f(list, "protocols");
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Object[] array = d6.j.f18715c.b(list).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
        }
    }
}
