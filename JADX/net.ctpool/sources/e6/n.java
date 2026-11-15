package e6;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class n extends h {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f19249j = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Class f19250h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Class f19251i;

    public static final class a {
        private a() {
        }

        public static /* synthetic */ m b(a aVar, String str, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = "com.android.org.conscrypt";
            }
            return aVar.a(str);
        }

        public final m a(String str) {
            w5.k.f(str, "packageName");
            try {
                Class<?> cls = Class.forName(str + ".OpenSSLSocketImpl");
                Class<?> cls2 = Class.forName(str + ".OpenSSLSocketFactoryImpl");
                Class<?> cls3 = Class.forName(str + ".SSLParametersImpl");
                w5.k.e(cls3, "paramsClass");
                return new n(cls, cls2, cls3);
            } catch (Exception e7) {
                d6.j.f18715c.g().k("unable to load android socket classes", 5, e7);
                return null;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Class cls, Class cls2, Class cls3) {
        super(cls);
        w5.k.f(cls, "sslSocketClass");
        w5.k.f(cls2, "sslSocketFactoryClass");
        w5.k.f(cls3, "paramClass");
        this.f19250h = cls2;
        this.f19251i = cls3;
    }
}
