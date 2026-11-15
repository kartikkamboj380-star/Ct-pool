package g6;

import F5.g;
import i6.E;
import j5.AbstractC1809n;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import w5.k;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements HostnameVerifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f19558a = new d();

    private d() {
    }

    private final String b(String str) {
        if (!d(str)) {
            return str;
        }
        Locale locale = Locale.US;
        k.e(locale, "Locale.US");
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String lowerCase = str.toLowerCase(locale);
        k.e(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    private final List c(X509Certificate x509Certificate, int i7) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return AbstractC1809n.i();
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && !(!k.b(list.get(0), Integer.valueOf(i7))) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return AbstractC1809n.i();
        }
    }

    private final boolean d(String str) {
        return str.length() == ((int) E.b(str, 0, 0, 3, null));
    }

    private final boolean f(String str, String str2) {
        if (str != null && str.length() != 0 && !g.B(str, ".", false, 2, null) && !g.o(str, "..", false, 2, null) && str2 != null && str2.length() != 0 && !g.B(str2, ".", false, 2, null) && !g.o(str2, "..", false, 2, null)) {
            if (!g.o(str, ".", false, 2, null)) {
                str = str + ".";
            }
            String str3 = str;
            if (!g.o(str2, ".", false, 2, null)) {
                str2 = str2 + ".";
            }
            String strB = b(str2);
            if (!g.G(strB, "*", false, 2, null)) {
                return k.b(str3, strB);
            }
            if (!g.B(strB, "*.", false, 2, null) || g.Q(strB, '*', 1, false, 4, null) != -1 || str3.length() < strB.length() || k.b("*.", strB)) {
                return false;
            }
            String strSubstring = strB.substring(1);
            k.e(strSubstring, "(this as java.lang.String).substring(startIndex)");
            if (!g.o(str3, strSubstring, false, 2, null)) {
                return false;
            }
            int length = str3.length() - strSubstring.length();
            return length <= 0 || g.V(str3, '.', length + (-1), false, 4, null) == -1;
        }
        return false;
    }

    private final boolean g(String str, X509Certificate x509Certificate) {
        String strB = b(str);
        List listC = c(x509Certificate, 2);
        if ((listC instanceof Collection) && listC.isEmpty()) {
            return false;
        }
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            if (f19558a.f(strB, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    private final boolean h(String str, X509Certificate x509Certificate) {
        String strE = U5.a.e(str);
        List listC = c(x509Certificate, 7);
        if ((listC instanceof Collection) && listC.isEmpty()) {
            return false;
        }
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            if (k.b(strE, U5.a.e((String) it.next()))) {
                return true;
            }
        }
        return false;
    }

    public final List a(X509Certificate x509Certificate) {
        k.f(x509Certificate, "certificate");
        return AbstractC1809n.R(c(x509Certificate, 7), c(x509Certificate, 2));
    }

    public final boolean e(String str, X509Certificate x509Certificate) {
        k.f(str, "host");
        k.f(x509Certificate, "certificate");
        return U5.c.f(str) ? h(str, x509Certificate) : g(str, x509Certificate);
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        k.f(str, "host");
        k.f(sSLSession, "session");
        if (!d(str)) {
            return false;
        }
        try {
            Certificate certificate = sSLSession.getPeerCertificates()[0];
            if (certificate != null) {
                return e(str, (X509Certificate) certificate);
            }
            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
        } catch (SSLException unused) {
            return false;
        }
    }
}
