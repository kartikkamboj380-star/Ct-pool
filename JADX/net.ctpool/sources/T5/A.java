package T5;

import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public enum A {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");


    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final a f3292u = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f3293m;

    public static final class a {
        private a() {
        }

        public final A a(String str) throws IOException {
            w5.k.f(str, "protocol");
            A a7 = A.HTTP_1_0;
            if (!w5.k.b(str, a7.f3293m)) {
                a7 = A.HTTP_1_1;
                if (!w5.k.b(str, a7.f3293m)) {
                    a7 = A.H2_PRIOR_KNOWLEDGE;
                    if (!w5.k.b(str, a7.f3293m)) {
                        a7 = A.HTTP_2;
                        if (!w5.k.b(str, a7.f3293m)) {
                            a7 = A.SPDY_3;
                            if (!w5.k.b(str, a7.f3293m)) {
                                a7 = A.QUIC;
                                if (!w5.k.b(str, a7.f3293m)) {
                                    throw new IOException("Unexpected protocol: " + str);
                                }
                            }
                        }
                    }
                }
            }
            return a7;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    A(String str) {
        this.f3293m = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f3293m;
    }
}
