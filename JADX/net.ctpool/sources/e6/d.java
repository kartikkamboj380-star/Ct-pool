package e6;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends g6.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f19224d = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final X509TrustManager f19225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final X509TrustManagerExtensions f19226c;

    public static final class a {
        private a() {
        }

        public final d a(X509TrustManager x509TrustManager) {
            X509TrustManagerExtensions x509TrustManagerExtensions;
            w5.k.f(x509TrustManager, "trustManager");
            try {
                x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
            } catch (IllegalArgumentException unused) {
                x509TrustManagerExtensions = null;
            }
            if (x509TrustManagerExtensions != null) {
                return new d(x509TrustManager, x509TrustManagerExtensions);
            }
            return null;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public d(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        w5.k.f(x509TrustManager, "trustManager");
        w5.k.f(x509TrustManagerExtensions, "x509TrustManagerExtensions");
        this.f19225b = x509TrustManager;
        this.f19226c = x509TrustManagerExtensions;
    }

    @Override // g6.c
    public List a(List list, String str) throws SSLPeerUnverifiedException {
        w5.k.f(list, "chain");
        w5.k.f(str, "hostname");
        Object[] array = list.toArray(new X509Certificate[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        try {
            List<X509Certificate> listCheckServerTrusted = this.f19226c.checkServerTrusted((X509Certificate[]) array, "RSA", str);
            w5.k.e(listCheckServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return listCheckServerTrusted;
        } catch (CertificateException e7) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e7.getMessage());
            sSLPeerUnverifiedException.initCause(e7);
            throw sSLPeerUnverifiedException;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof d) && ((d) obj).f19225b == this.f19225b;
    }

    public int hashCode() {
        return System.identityHashCode(this.f19225b);
    }
}
