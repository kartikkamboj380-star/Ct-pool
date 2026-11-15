package d6;

import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.Conscrypt;
import org.conscrypt.ConscryptHostnameVerifier;
import w5.k;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final boolean f18695e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f18696f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f18697d;

    public static final class a {
        private a() {
        }

        public final boolean a(int i7, int i8, int i9) {
            Conscrypt.Version version = Conscrypt.version();
            return version.major() != i7 ? version.major() > i7 : version.minor() != i8 ? version.minor() > i8 : version.patch() >= i9;
        }

        public final d b() {
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (c()) {
                return new d(defaultConstructorMarker);
            }
            return null;
        }

        public final boolean c() {
            return d.f18695e;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class b implements ConscryptHostnameVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f18698a = new b();

        private b() {
        }
    }

    static {
        a aVar = new a(null);
        f18696f = aVar;
        boolean z6 = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, aVar.getClass().getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (aVar.a(2, 1, 0)) {
                    z6 = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f18695e = z6;
    }

    private d() {
        Provider providerNewProvider = Conscrypt.newProvider();
        k.e(providerNewProvider, "Conscrypt.newProvider()");
        this.f18697d = providerNewProvider;
    }

    @Override // d6.j
    public void e(SSLSocket sSLSocket, String str, List list) {
        k.f(sSLSocket, "sslSocket");
        k.f(list, "protocols");
        if (!Conscrypt.isConscrypt(sSLSocket)) {
            super.e(sSLSocket, str, list);
            return;
        }
        Conscrypt.setUseSessionTickets(sSLSocket, true);
        Object[] array = j.f18715c.b(list).toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
    }

    @Override // d6.j
    public String h(SSLSocket sSLSocket) {
        k.f(sSLSocket, "sslSocket");
        return Conscrypt.isConscrypt(sSLSocket) ? Conscrypt.getApplicationProtocol(sSLSocket) : super.h(sSLSocket);
    }

    @Override // d6.j
    public SSLContext n() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f18697d);
        k.e(sSLContext, "SSLContext.getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // d6.j
    public SSLSocketFactory o(X509TrustManager x509TrustManager) throws NoSuchAlgorithmException, KeyManagementException {
        k.f(x509TrustManager, "trustManager");
        SSLContext sSLContextN = n();
        sSLContextN.init(null, new TrustManager[]{x509TrustManager}, null);
        SSLSocketFactory socketFactory = sSLContextN.getSocketFactory();
        k.e(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    @Override // d6.j
    public X509TrustManager p() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        k.e(trustManagerFactory, "TrustManagerFactory.getI…(null as KeyStore?)\n    }");
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        k.c(trustManagers);
        if (trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager == null) {
                throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            }
            X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
            Conscrypt.setHostnameVerifier(x509TrustManager, b.f18698a);
            return x509TrustManager;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected default trust managers: ");
        String string = Arrays.toString(trustManagers);
        k.e(string, "java.util.Arrays.toString(this)");
        sb.append(string);
        throw new IllegalStateException(sb.toString().toString());
    }

    public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
