package T5;

import j5.AbstractC1803h;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public interface q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f3607b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f3606a = new a.C0081a();

    public static final class a {

        /* JADX INFO: renamed from: T5.q$a$a, reason: collision with other inner class name */
        private static final class C0081a implements q {
            @Override // T5.q
            public List a(String str) throws UnknownHostException {
                w5.k.f(str, "hostname");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(str);
                    w5.k.e(allByName, "InetAddress.getAllByName(hostname)");
                    return AbstractC1803h.F(allByName);
                } catch (NullPointerException e7) {
                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of " + str);
                    unknownHostException.initCause(e7);
                    throw unknownHostException;
                }
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    List a(String str);
}
