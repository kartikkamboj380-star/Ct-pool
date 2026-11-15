package d6;

import T5.A;
import T5.z;
import j5.AbstractC1809n;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.k;

/* JADX INFO: loaded from: classes2.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile j f18713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f18714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f18715c;

    public static final class a {
        private a() {
        }

        private final j d() {
            e6.e.f19229c.b();
            j jVarA = d6.a.f18684f.a();
            if (jVarA != null) {
                return jVarA;
            }
            j jVarA2 = b.f18687g.a();
            k.c(jVarA2);
            return jVarA2;
        }

        private final j e() {
            i iVarA;
            c cVarA;
            d dVarB;
            if (j() && (dVarB = d.f18696f.b()) != null) {
                return dVarB;
            }
            if (i() && (cVarA = c.f18693f.a()) != null) {
                return cVarA;
            }
            if (k() && (iVarA = i.f18711f.a()) != null) {
                return iVarA;
            }
            h hVarA = h.f18709e.a();
            if (hVarA != null) {
                return hVarA;
            }
            j jVarA = e.f18699i.a();
            return jVarA != null ? jVarA : new j();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final j f() {
            return h() ? d() : e();
        }

        private final boolean i() {
            Provider provider = Security.getProviders()[0];
            k.e(provider, "Security.getProviders()[0]");
            return k.b("BC", provider.getName());
        }

        private final boolean j() {
            Provider provider = Security.getProviders()[0];
            k.e(provider, "Security.getProviders()[0]");
            return k.b("Conscrypt", provider.getName());
        }

        private final boolean k() {
            Provider provider = Security.getProviders()[0];
            k.e(provider, "Security.getProviders()[0]");
            return k.b("OpenJSSE", provider.getName());
        }

        public final List b(List list) {
            k.f(list, "protocols");
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((A) obj) != A.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(AbstractC1809n.q(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((A) it.next()).toString());
            }
            return arrayList2;
        }

        public final byte[] c(List list) {
            k.f(list, "protocols");
            i6.f fVar = new i6.f();
            for (String str : b(list)) {
                fVar.P(str.length());
                fVar.k0(str);
            }
            return fVar.M();
        }

        public final j g() {
            return j.f18713a;
        }

        public final boolean h() {
            return k.b("Dalvik", System.getProperty("java.vm.name"));
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        a aVar = new a(null);
        f18715c = aVar;
        f18713a = aVar.f();
        f18714b = Logger.getLogger(z.class.getName());
    }

    public static /* synthetic */ void l(j jVar, String str, int i7, Throwable th, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
        }
        if ((i8 & 2) != 0) {
            i7 = 4;
        }
        if ((i8 & 4) != 0) {
            th = null;
        }
        jVar.k(str, i7, th);
    }

    public void b(SSLSocket sSLSocket) {
        k.f(sSLSocket, "sslSocket");
    }

    public g6.c c(X509TrustManager x509TrustManager) {
        k.f(x509TrustManager, "trustManager");
        return new g6.a(d(x509TrustManager));
    }

    public g6.e d(X509TrustManager x509TrustManager) {
        k.f(x509TrustManager, "trustManager");
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        k.e(acceptedIssuers, "trustManager.acceptedIssuers");
        return new g6.b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void e(SSLSocket sSLSocket, String str, List list) {
        k.f(sSLSocket, "sslSocket");
        k.f(list, "protocols");
    }

    public void f(Socket socket, InetSocketAddress inetSocketAddress, int i7) throws IOException {
        k.f(socket, "socket");
        k.f(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, i7);
    }

    public final String g() {
        return "OkHttp";
    }

    public String h(SSLSocket sSLSocket) {
        k.f(sSLSocket, "sslSocket");
        return null;
    }

    public Object i(String str) {
        k.f(str, "closer");
        if (f18714b.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    public boolean j(String str) {
        k.f(str, "hostname");
        return true;
    }

    public void k(String str, int i7, Throwable th) {
        k.f(str, "message");
        f18714b.log(i7 == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public void m(String str, Object obj) {
        k.f(str, "message");
        if (obj == null) {
            str = str + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        k(str, 5, (Throwable) obj);
    }

    public SSLContext n() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        k.e(sSLContext, "SSLContext.getInstance(\"TLS\")");
        return sSLContext;
    }

    public SSLSocketFactory o(X509TrustManager x509TrustManager) {
        k.f(x509TrustManager, "trustManager");
        try {
            SSLContext sSLContextN = n();
            sSLContextN.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = sSLContextN.getSocketFactory();
            k.e(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e7) {
            throw new AssertionError("No System TLS: " + e7, e7);
        }
    }

    public X509TrustManager p() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
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

    public String toString() {
        String simpleName = getClass().getSimpleName();
        k.e(simpleName, "javaClass.simpleName");
        return simpleName;
    }
}
