package g6;

import d6.j;
import java.util.List;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.k;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f19557a = new a(null);

    public static final class a {
        private a() {
        }

        public final c a(X509TrustManager x509TrustManager) {
            k.f(x509TrustManager, "trustManager");
            return j.f18715c.g().c(x509TrustManager);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public abstract List a(List list, String str);
}
