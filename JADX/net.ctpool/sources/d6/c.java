package d6;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;
import w5.k;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final boolean f18692e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f18693f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f18694d;

    public static final class a {
        private a() {
        }

        public final c a() {
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (b()) {
                return new c(defaultConstructorMarker);
            }
            return null;
        }

        public final boolean b() {
            return c.f18692e;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        a aVar = new a(null);
        f18693f = aVar;
        boolean z6 = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, aVar.getClass().getClassLoader());
            z6 = true;
        } catch (ClassNotFoundException unused) {
        }
        f18692e = z6;
    }

    private c() {
        this.f18694d = new BouncyCastleJsseProvider();
    }

    @Override // d6.j
    public void e(SSLSocket sSLSocket, String str, List list) {
        k.f(sSLSocket, "sslSocket");
        k.f(list, "protocols");
        if (!(sSLSocket instanceof BCSSLSocket)) {
            super.e(sSLSocket, str, list);
            return;
        }
        BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
        BCSSLParameters parameters = bCSSLSocket.getParameters();
        List listB = j.f18715c.b(list);
        k.e(parameters, "sslParameters");
        Object[] array = listB.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        parameters.setApplicationProtocols((String[]) array);
        bCSSLSocket.setParameters(parameters);
    }

    @Override // d6.j
    public String h(SSLSocket sSLSocket) {
        k.f(sSLSocket, "sslSocket");
        if (!(sSLSocket instanceof BCSSLSocket)) {
            return super.h(sSLSocket);
        }
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null || (applicationProtocol.hashCode() == 0 && applicationProtocol.equals(""))) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // d6.j
    public SSLContext n() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f18694d);
        k.e(sSLContext, "SSLContext.getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // d6.j
    public X509TrustManager p() throws NoSuchAlgorithmException, KeyStoreException, NoSuchProviderException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
        trustManagerFactory.init((KeyStore) null);
        k.e(trustManagerFactory, "factory");
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        k.c(trustManagers);
        if (trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager != null) {
                return (X509TrustManager) trustManager;
            }
            throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected default trust managers: ");
        String string = Arrays.toString(trustManagers);
        k.e(string, "java.util.Arrays.toString(this)");
        sb.append(string);
        throw new IllegalStateException(sb.toString().toString());
    }

    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
