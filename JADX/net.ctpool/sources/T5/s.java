package T5;

import j5.AbstractC1809n;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.Lazy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import v5.InterfaceC2171a;

/* JADX INFO: loaded from: classes2.dex */
public final class s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f3610e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Lazy f3611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final G f3612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C0463i f3613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f3614d;

    public static final class a {

        /* JADX INFO: renamed from: T5.s$a$a, reason: collision with other inner class name */
        static final class C0082a extends w5.l implements InterfaceC2171a {

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ List f3615m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0082a(List list) {
                super(0);
                this.f3615m = list;
            }

            @Override // v5.InterfaceC2171a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List invoke() {
                return this.f3615m;
            }
        }

        static final class b extends w5.l implements InterfaceC2171a {

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ List f3616m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(List list) {
                super(0);
                this.f3616m = list;
            }

            @Override // v5.InterfaceC2171a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List invoke() {
                return this.f3616m;
            }
        }

        private a() {
        }

        private final List c(Certificate[] certificateArr) {
            return certificateArr != null ? U5.c.t((Certificate[]) Arrays.copyOf(certificateArr, certificateArr.length)) : AbstractC1809n.i();
        }

        public final s a(G g7, C0463i c0463i, List list, List list2) {
            w5.k.f(g7, "tlsVersion");
            w5.k.f(c0463i, "cipherSuite");
            w5.k.f(list, "peerCertificates");
            w5.k.f(list2, "localCertificates");
            return new s(g7, c0463i, U5.c.R(list2), new C0082a(U5.c.R(list)));
        }

        public final s b(SSLSession sSLSession) throws IOException {
            List listI;
            w5.k.f(sSLSession, "$this$handshake");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null".toString());
            }
            int iHashCode = cipherSuite.hashCode();
            if (iHashCode == 1019404634 ? cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") : iHashCode == 1208658923 && cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException("cipherSuite == " + cipherSuite);
            }
            C0463i c0463iB = C0463i.f3541s1.b(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null".toString());
            }
            if (w5.k.b("NONE", protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            G gA = G.f3352t.a(protocol);
            try {
                listI = c(sSLSession.getPeerCertificates());
            } catch (SSLPeerUnverifiedException unused) {
                listI = AbstractC1809n.i();
            }
            return new s(gA, c0463iB, c(sSLSession.getLocalCertificates()), new b(listI));
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static final class b extends w5.l implements InterfaceC2171a {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ InterfaceC2171a f3617m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC2171a interfaceC2171a) {
            super(0);
            this.f3617m = interfaceC2171a;
        }

        @Override // v5.InterfaceC2171a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            try {
                return (List) this.f3617m.invoke();
            } catch (SSLPeerUnverifiedException unused) {
                return AbstractC1809n.i();
            }
        }
    }

    public s(G g7, C0463i c0463i, List list, InterfaceC2171a interfaceC2171a) {
        w5.k.f(g7, "tlsVersion");
        w5.k.f(c0463i, "cipherSuite");
        w5.k.f(list, "localCertificates");
        w5.k.f(interfaceC2171a, "peerCertificatesFn");
        this.f3612b = g7;
        this.f3613c = c0463i;
        this.f3614d = list;
        this.f3611a = i5.g.b(new b(interfaceC2171a));
    }

    private final String b(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        w5.k.e(type, "type");
        return type;
    }

    public final C0463i a() {
        return this.f3613c;
    }

    public final List c() {
        return this.f3614d;
    }

    public final List d() {
        return (List) this.f3611a.getValue();
    }

    public final G e() {
        return this.f3612b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof s) {
            s sVar = (s) obj;
            if (sVar.f3612b == this.f3612b && w5.k.b(sVar.f3613c, this.f3613c) && w5.k.b(sVar.d(), d()) && w5.k.b(sVar.f3614d, this.f3614d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((527 + this.f3612b.hashCode()) * 31) + this.f3613c.hashCode()) * 31) + d().hashCode()) * 31) + this.f3614d.hashCode();
    }

    public String toString() {
        List listD = d();
        ArrayList arrayList = new ArrayList(AbstractC1809n.q(listD, 10));
        Iterator it = listD.iterator();
        while (it.hasNext()) {
            arrayList.add(b((Certificate) it.next()));
        }
        String string = arrayList.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("Handshake{");
        sb.append("tlsVersion=");
        sb.append(this.f3612b);
        sb.append(' ');
        sb.append("cipherSuite=");
        sb.append(this.f3613c);
        sb.append(' ');
        sb.append("peerCertificates=");
        sb.append(string);
        sb.append(' ');
        sb.append("localCertificates=");
        List list = this.f3614d;
        ArrayList arrayList2 = new ArrayList(AbstractC1809n.q(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(b((Certificate) it2.next()));
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
