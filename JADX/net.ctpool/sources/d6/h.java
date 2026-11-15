package d6;

import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.k;

/* JADX INFO: loaded from: classes2.dex */
public class h extends j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean f18708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f18709e = new a(null);

    public static final class a {
        private a() {
        }

        public final h a() {
            if (b()) {
                return new h();
            }
            return null;
        }

        public final boolean b() {
            return h.f18708d;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        String property = System.getProperty("java.specification.version");
        Integer numI = property != null ? F5.g.i(property) : null;
        boolean z6 = false;
        if (numI == null) {
            try {
                SSLSocket.class.getMethod("getApplicationProtocol", null);
                z6 = true;
            } catch (NoSuchMethodException unused) {
            }
        } else if (numI.intValue() >= 9) {
            z6 = true;
        }
        f18708d = z6;
    }

    @Override // d6.j
    public void e(SSLSocket sSLSocket, String str, List list) {
        k.f(sSLSocket, "sslSocket");
        k.f(list, "protocols");
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        List listB = j.f18715c.b(list);
        k.e(sSLParameters, "sslParameters");
        Object[] array = listB.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        sSLParameters.setApplicationProtocols((String[]) array);
        sSLSocket.setSSLParameters(sSLParameters);
    }

    @Override // d6.j
    public String h(SSLSocket sSLSocket) {
        k.f(sSLSocket, "sslSocket");
        try {
            String applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null) {
                return null;
            }
            if (applicationProtocol.hashCode() == 0) {
                if (applicationProtocol.equals("")) {
                    return null;
                }
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}
