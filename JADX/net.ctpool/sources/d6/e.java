package d6;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.k;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends j {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f18699i = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Method f18700d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Method f18701e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Method f18702f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Class f18703g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Class f18704h;

    private static final class a implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f18705a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f18706b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f18707c;

        public a(List list) {
            k.f(list, "protocols");
            this.f18707c = list;
        }

        public final String a() {
            return this.f18706b;
        }

        public final boolean b() {
            return this.f18705a;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            k.f(obj, "proxy");
            k.f(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (k.b(name, "supports") && k.b(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (k.b(name, "unsupported") && k.b(Void.TYPE, returnType)) {
                this.f18705a = true;
                return null;
            }
            if (k.b(name, "protocols") && objArr.length == 0) {
                return this.f18707c;
            }
            if ((k.b(name, "selectProtocol") || k.b(name, "select")) && k.b(String.class, returnType) && objArr.length == 1) {
                Object obj2 = objArr[0];
                if (obj2 instanceof List) {
                    if (obj2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<*>");
                    }
                    List list = (List) obj2;
                    int size = list.size();
                    if (size >= 0) {
                        int i7 = 0;
                        while (true) {
                            Object obj3 = list.get(i7);
                            if (obj3 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                            String str = (String) obj3;
                            if (!this.f18707c.contains(str)) {
                                if (i7 == size) {
                                    break;
                                }
                                i7++;
                            } else {
                                this.f18706b = str;
                                return str;
                            }
                        }
                    }
                    String str2 = (String) this.f18707c.get(0);
                    this.f18706b = str2;
                    return str2;
                }
            }
            if ((!k.b(name, "protocolSelected") && !k.b(name, "selected")) || objArr.length != 1) {
                return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
            }
            Object obj4 = objArr[0];
            if (obj4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            this.f18706b = (String) obj4;
            return null;
        }
    }

    public static final class b {
        private b() {
        }

        public final j a() {
            String property = System.getProperty("java.specification.version", "unknown");
            try {
                k.e(property, "jvmVersion");
                if (Integer.parseInt(property) >= 9) {
                    return null;
                }
            } catch (NumberFormatException unused) {
            }
            try {
                Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                Method method = cls.getMethod("put", SSLSocket.class, cls2);
                Method method2 = cls.getMethod("get", SSLSocket.class);
                Method method3 = cls.getMethod("remove", SSLSocket.class);
                k.e(method, "putMethod");
                k.e(method2, "getMethod");
                k.e(method3, "removeMethod");
                k.e(cls3, "clientProviderClass");
                k.e(cls4, "serverProviderClass");
                return new e(method, method2, method3, cls3, cls4);
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                return null;
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public e(Method method, Method method2, Method method3, Class cls, Class cls2) {
        k.f(method, "putMethod");
        k.f(method2, "getMethod");
        k.f(method3, "removeMethod");
        k.f(cls, "clientProviderClass");
        k.f(cls2, "serverProviderClass");
        this.f18700d = method;
        this.f18701e = method2;
        this.f18702f = method3;
        this.f18703g = cls;
        this.f18704h = cls2;
    }

    @Override // d6.j
    public void b(SSLSocket sSLSocket) {
        k.f(sSLSocket, "sslSocket");
        try {
            this.f18702f.invoke(null, sSLSocket);
        } catch (IllegalAccessException e7) {
            throw new AssertionError("failed to remove ALPN", e7);
        } catch (InvocationTargetException e8) {
            throw new AssertionError("failed to remove ALPN", e8);
        }
    }

    @Override // d6.j
    public void e(SSLSocket sSLSocket, String str, List list) {
        k.f(sSLSocket, "sslSocket");
        k.f(list, "protocols");
        try {
            this.f18700d.invoke(null, sSLSocket, Proxy.newProxyInstance(j.class.getClassLoader(), new Class[]{this.f18703g, this.f18704h}, new a(j.f18715c.b(list))));
        } catch (IllegalAccessException e7) {
            throw new AssertionError("failed to set ALPN", e7);
        } catch (InvocationTargetException e8) {
            throw new AssertionError("failed to set ALPN", e8);
        }
    }

    @Override // d6.j
    public String h(SSLSocket sSLSocket) {
        k.f(sSLSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f18701e.invoke(null, sSLSocket));
            if (invocationHandler == null) {
                throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            }
            a aVar = (a) invocationHandler;
            if (!aVar.b() && aVar.a() == null) {
                j.l(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, null, 6, null);
                return null;
            }
            if (aVar.b()) {
                return null;
            }
            return aVar.a();
        } catch (IllegalAccessException e7) {
            throw new AssertionError("failed to get ALPN selected protocol", e7);
        } catch (InvocationTargetException e8) {
            throw new AssertionError("failed to get ALPN selected protocol", e8);
        }
    }
}
