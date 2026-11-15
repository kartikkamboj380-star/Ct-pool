package T5;

import i6.i;
import j5.AbstractC1809n;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import v5.InterfaceC2171a;

/* JADX INFO: renamed from: T5.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0461g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f3426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g6.c f3427b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f3425d = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0461g f3424c = new a().a();

    /* JADX INFO: renamed from: T5.g$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f3428a = new ArrayList();

        /* JADX WARN: Multi-variable type inference failed */
        public final C0461g a() {
            return new C0461g(AbstractC1809n.e0(this.f3428a), null, 2, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: T5.g$b */
    public static final class b {
        private b() {
        }

        public final String a(Certificate certificate) {
            w5.k.f(certificate, "certificate");
            if (!(certificate instanceof X509Certificate)) {
                throw new IllegalArgumentException("Certificate pinning requires X509 certificates".toString());
            }
            return "sha256/" + b((X509Certificate) certificate).e();
        }

        public final i6.i b(X509Certificate x509Certificate) {
            w5.k.f(x509Certificate, "$this$sha256Hash");
            i.a aVar = i6.i.f20019q;
            PublicKey publicKey = x509Certificate.getPublicKey();
            w5.k.e(publicKey, "publicKey");
            byte[] encoded = publicKey.getEncoded();
            w5.k.e(encoded, "publicKey.encoded");
            return i.a.g(aVar, encoded, 0, 0, 3, null).B();
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: T5.g$c */
    static final class c extends w5.l implements InterfaceC2171a {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ List f3430n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ String f3431o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(List list, String str) {
            super(0);
            this.f3430n = list;
            this.f3431o = str;
        }

        @Override // v5.InterfaceC2171a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            List listA;
            g6.c cVarD = C0461g.this.d();
            if (cVarD == null || (listA = cVarD.a(this.f3430n, this.f3431o)) == null) {
                listA = this.f3430n;
            }
            List<Certificate> list = listA;
            ArrayList arrayList = new ArrayList(AbstractC1809n.q(list, 10));
            for (Certificate certificate : list) {
                if (certificate == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                }
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    public C0461g(Set set, g6.c cVar) {
        w5.k.f(set, "pins");
        this.f3426a = set;
        this.f3427b = cVar;
    }

    public final void a(String str, List list) {
        w5.k.f(str, "hostname");
        w5.k.f(list, "peerCertificates");
        b(str, new c(list, str));
    }

    public final void b(String str, InterfaceC2171a interfaceC2171a) throws SSLPeerUnverifiedException {
        w5.k.f(str, "hostname");
        w5.k.f(interfaceC2171a, "cleanedPeerCertificatesFn");
        List listC = c(str);
        if (listC.isEmpty()) {
            return;
        }
        List<X509Certificate> list = (List) interfaceC2171a.invoke();
        for (X509Certificate x509Certificate : list) {
            Iterator it = listC.iterator();
            if (it.hasNext()) {
                androidx.appcompat.app.y.a(it.next());
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Certificate pinning failure!");
        sb.append("\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : list) {
            sb.append("\n    ");
            sb.append(f3425d.a(x509Certificate2));
            sb.append(": ");
            Principal subjectDN = x509Certificate2.getSubjectDN();
            w5.k.e(subjectDN, "element.subjectDN");
            sb.append(subjectDN.getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(str);
        sb.append(":");
        Iterator it2 = listC.iterator();
        while (it2.hasNext()) {
            androidx.appcompat.app.y.a(it2.next());
            sb.append("\n    ");
            sb.append((Object) null);
        }
        String string = sb.toString();
        w5.k.e(string, "StringBuilder().apply(builderAction).toString()");
        throw new SSLPeerUnverifiedException(string);
    }

    public final List c(String str) {
        w5.k.f(str, "hostname");
        Set set = this.f3426a;
        List listI = AbstractC1809n.i();
        Iterator it = set.iterator();
        if (!it.hasNext()) {
            return listI;
        }
        androidx.appcompat.app.y.a(it.next());
        throw null;
    }

    public final g6.c d() {
        return this.f3427b;
    }

    public final C0461g e(g6.c cVar) {
        w5.k.f(cVar, "certificateChainCleaner");
        return w5.k.b(this.f3427b, cVar) ? this : new C0461g(this.f3426a, cVar);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C0461g) {
            C0461g c0461g = (C0461g) obj;
            if (w5.k.b(c0461g.f3426a, this.f3426a) && w5.k.b(c0461g.f3427b, this.f3427b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (1517 + this.f3426a.hashCode()) * 41;
        g6.c cVar = this.f3427b;
        return iHashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    public /* synthetic */ C0461g(Set set, g6.c cVar, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, (i7 & 2) != 0 ? null : cVar);
    }
}
