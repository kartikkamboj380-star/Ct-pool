package d6;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import e6.l;
import e6.m;
import e6.n;
import j5.AbstractC1809n;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.k;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends j {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f18686f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f18687g = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f18688d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final e6.j f18689e;

    public static final class a {
        private a() {
        }

        public final j a() {
            if (b()) {
                return new b();
            }
            return null;
        }

        public final boolean b() {
            return b.f18686f;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: d6.b$b, reason: collision with other inner class name */
    public static final class C0252b implements g6.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final X509TrustManager f18690a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Method f18691b;

        public C0252b(X509TrustManager x509TrustManager, Method method) {
            k.f(x509TrustManager, "trustManager");
            k.f(method, "findByIssuerAndSignatureMethod");
            this.f18690a = x509TrustManager;
            this.f18691b = method;
        }

        @Override // g6.e
        public X509Certificate a(X509Certificate x509Certificate) {
            k.f(x509Certificate, "cert");
            try {
                Object objInvoke = this.f18691b.invoke(this.f18690a, x509Certificate);
                if (objInvoke != null) {
                    return ((TrustAnchor) objInvoke).getTrustedCert();
                }
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
            } catch (IllegalAccessException e7) {
                throw new AssertionError("unable to get issues and signature", e7);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0252b)) {
                return false;
            }
            C0252b c0252b = (C0252b) obj;
            return k.b(this.f18690a, c0252b.f18690a) && k.b(this.f18691b, c0252b.f18691b);
        }

        public int hashCode() {
            X509TrustManager x509TrustManager = this.f18690a;
            int iHashCode = (x509TrustManager != null ? x509TrustManager.hashCode() : 0) * 31;
            Method method = this.f18691b;
            return iHashCode + (method != null ? method.hashCode() : 0);
        }

        public String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.f18690a + ", findByIssuerAndSignatureMethod=" + this.f18691b + ")";
        }
    }

    static {
        boolean z6 = false;
        if (j.f18715c.h() && Build.VERSION.SDK_INT < 30) {
            z6 = true;
        }
        f18686f = z6;
    }

    public b() {
        List listL = AbstractC1809n.l(n.a.b(n.f19249j, null, 1, null), new l(e6.h.f19232g.d()), new l(e6.k.f19246b.a()), new l(e6.i.f19240b.a()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listL) {
            if (((m) obj).e()) {
                arrayList.add(obj);
            }
        }
        this.f18688d = arrayList;
        this.f18689e = e6.j.f19241d.a();
    }

    @Override // d6.j
    public g6.c c(X509TrustManager x509TrustManager) {
        k.f(x509TrustManager, "trustManager");
        e6.d dVarA = e6.d.f19224d.a(x509TrustManager);
        return dVarA != null ? dVarA : super.c(x509TrustManager);
    }

    @Override // d6.j
    public g6.e d(X509TrustManager x509TrustManager) {
        k.f(x509TrustManager, "trustManager");
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            k.e(declaredMethod, "method");
            declaredMethod.setAccessible(true);
            return new C0252b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.d(x509TrustManager);
        }
    }

    @Override // d6.j
    public void e(SSLSocket sSLSocket, String str, List list) {
        Object next;
        k.f(sSLSocket, "sslSocket");
        k.f(list, "protocols");
        Iterator it = this.f18688d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((m) next).a(sSLSocket)) {
                    break;
                }
            }
        }
        m mVar = (m) next;
        if (mVar != null) {
            mVar.g(sSLSocket, str, list);
        }
    }

    @Override // d6.j
    public void f(Socket socket, InetSocketAddress inetSocketAddress, int i7) throws IOException {
        k.f(socket, "socket");
        k.f(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i7);
        } catch (ClassCastException e7) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e7;
            }
            throw new IOException("Exception in connect", e7);
        }
    }

    @Override // d6.j
    public String h(SSLSocket sSLSocket) {
        Object next;
        k.f(sSLSocket, "sslSocket");
        Iterator it = this.f18688d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((m) next).a(sSLSocket)) {
                break;
            }
        }
        m mVar = (m) next;
        if (mVar != null) {
            return mVar.f(sSLSocket);
        }
        return null;
    }

    @Override // d6.j
    public Object i(String str) {
        k.f(str, "closer");
        return this.f18689e.a(str);
    }

    @Override // d6.j
    public boolean j(String str) {
        k.f(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // d6.j
    public void m(String str, Object obj) {
        k.f(str, "message");
        if (this.f18689e.b(obj)) {
            return;
        }
        j.l(this, str, 5, null, 4, null);
    }
}
