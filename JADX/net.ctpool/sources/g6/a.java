package g6;

import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.k;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0263a f19554c = new C0263a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f19555b;

    /* JADX INFO: renamed from: g6.a$a, reason: collision with other inner class name */
    public static final class C0263a {
        private C0263a() {
        }

        public /* synthetic */ C0263a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public a(e eVar) {
        k.f(eVar, "trustRootIndex");
        this.f19555b = eVar;
    }

    private final boolean b(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        if (!k.b(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // g6.c
    public List a(List list, String str) throws SSLPeerUnverifiedException {
        k.f(list, "chain");
        k.f(str, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        Object objRemoveFirst = arrayDeque.removeFirst();
        k.e(objRemoveFirst, "queue.removeFirst()");
        arrayList.add(objRemoveFirst);
        boolean z6 = false;
        for (int i7 = 0; i7 < 9; i7++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
            }
            X509Certificate x509Certificate = (X509Certificate) obj;
            X509Certificate x509CertificateA = this.f19555b.a(x509Certificate);
            if (x509CertificateA == null) {
                Iterator it = arrayDeque.iterator();
                k.e(it, "queue.iterator()");
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                    }
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (b(x509Certificate, x509Certificate2)) {
                        it.remove();
                        arrayList.add(x509Certificate2);
                    }
                }
                if (z6) {
                    return arrayList;
                }
                throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
            }
            if (arrayList.size() > 1 || (!k.b(x509Certificate, x509CertificateA))) {
                arrayList.add(x509CertificateA);
            }
            if (b(x509CertificateA, x509CertificateA)) {
                return arrayList;
            }
            z6 = true;
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof a) && k.b(((a) obj).f19555b, this.f19555b);
    }

    public int hashCode() {
        return this.f19555b.hashCode();
    }
}
