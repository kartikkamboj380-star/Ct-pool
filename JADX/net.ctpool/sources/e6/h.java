package e6;

import e6.l;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public class h implements m {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final l.a f19231f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f19232g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Method f19233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Method f19234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Method f19235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Method f19236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Class f19237e;

    public static final class a {

        /* JADX INFO: renamed from: e6.h$a$a, reason: collision with other inner class name */
        public static final class C0255a implements l.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f19238a;

            C0255a(String str) {
                this.f19238a = str;
            }

            @Override // e6.l.a
            public boolean a(SSLSocket sSLSocket) {
                w5.k.f(sSLSocket, "sslSocket");
                String name = sSLSocket.getClass().getName();
                w5.k.e(name, "sslSocket.javaClass.name");
                return F5.g.B(name, this.f19238a + '.', false, 2, null);
            }

            @Override // e6.l.a
            public m b(SSLSocket sSLSocket) {
                w5.k.f(sSLSocket, "sslSocket");
                return h.f19232g.b(sSLSocket.getClass());
            }
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final h b(Class cls) {
            Class superclass = cls;
            while (superclass != null && (!w5.k.b(superclass.getSimpleName(), "OpenSSLSocketImpl"))) {
                superclass = superclass.getSuperclass();
                if (superclass == null) {
                    throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
                }
            }
            w5.k.c(superclass);
            return new h(superclass);
        }

        public final l.a c(String str) {
            w5.k.f(str, "packageName");
            return new C0255a(str);
        }

        public final l.a d() {
            return h.f19231f;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        a aVar = new a(null);
        f19232g = aVar;
        f19231f = aVar.c("com.google.android.gms.org.conscrypt");
    }

    public h(Class cls) throws NoSuchMethodException {
        w5.k.f(cls, "sslSocketClass");
        this.f19237e = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        w5.k.e(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f19233a = declaredMethod;
        this.f19234b = cls.getMethod("setHostname", String.class);
        this.f19235c = cls.getMethod("getAlpnSelectedProtocol", null);
        this.f19236d = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // e6.m
    public boolean a(SSLSocket sSLSocket) {
        w5.k.f(sSLSocket, "sslSocket");
        return this.f19237e.isInstance(sSLSocket);
    }

    @Override // e6.m
    public boolean e() {
        return d6.b.f18687g.b();
    }

    @Override // e6.m
    public String f(SSLSocket sSLSocket) {
        w5.k.f(sSLSocket, "sslSocket");
        if (!a(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f19235c.invoke(sSLSocket, null);
            if (bArr == null) {
                return null;
            }
            Charset charset = StandardCharsets.UTF_8;
            w5.k.e(charset, "StandardCharsets.UTF_8");
            return new String(bArr, charset);
        } catch (IllegalAccessException e7) {
            throw new AssertionError(e7);
        } catch (NullPointerException e8) {
            if (w5.k.b(e8.getMessage(), "ssl == null")) {
                return null;
            }
            throw e8;
        } catch (InvocationTargetException e9) {
            throw new AssertionError(e9);
        }
    }

    @Override // e6.m
    public void g(SSLSocket sSLSocket, String str, List list) {
        w5.k.f(sSLSocket, "sslSocket");
        w5.k.f(list, "protocols");
        if (a(sSLSocket)) {
            try {
                this.f19233a.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f19234b.invoke(sSLSocket, str);
                }
                this.f19236d.invoke(sSLSocket, d6.j.f18715c.c(list));
            } catch (IllegalAccessException e7) {
                throw new AssertionError(e7);
            } catch (InvocationTargetException e8) {
                throw new AssertionError(e8);
            }
        }
    }
}
