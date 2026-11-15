package d6;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import e6.k;
import e6.l;
import e6.m;
import j5.AbstractC1809n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final boolean f18683e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0251a f18684f = new C0251a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f18685d;

    /* JADX INFO: renamed from: d6.a$a, reason: collision with other inner class name */
    public static final class C0251a {
        private C0251a() {
        }

        public final j a() {
            if (b()) {
                return new a();
            }
            return null;
        }

        public final boolean b() {
            return a.f18683e;
        }

        public /* synthetic */ C0251a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        f18683e = j.f18715c.h() && Build.VERSION.SDK_INT >= 29;
    }

    public a() {
        List listL = AbstractC1809n.l(e6.c.f19223a.a(), new l(e6.h.f19232g.d()), new l(k.f19246b.a()), new l(e6.i.f19240b.a()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listL) {
            if (((m) obj).e()) {
                arrayList.add(obj);
            }
        }
        this.f18685d = arrayList;
    }

    @Override // d6.j
    public g6.c c(X509TrustManager x509TrustManager) {
        w5.k.f(x509TrustManager, "trustManager");
        e6.d dVarA = e6.d.f19224d.a(x509TrustManager);
        return dVarA != null ? dVarA : super.c(x509TrustManager);
    }

    @Override // d6.j
    public void e(SSLSocket sSLSocket, String str, List list) {
        Object next;
        w5.k.f(sSLSocket, "sslSocket");
        w5.k.f(list, "protocols");
        Iterator it = this.f18685d.iterator();
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
    public String h(SSLSocket sSLSocket) {
        Object next;
        w5.k.f(sSLSocket, "sslSocket");
        Iterator it = this.f18685d.iterator();
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
    public boolean j(String str) {
        w5.k.f(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
