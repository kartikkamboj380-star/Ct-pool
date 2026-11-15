package e6;

import java.lang.reflect.Method;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f19241d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Method f19242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Method f19243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Method f19244c;

    public static final class a {
        private a() {
        }

        public final j a() throws NoSuchMethodException {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                Method method4 = cls.getMethod("get", null);
                method2 = cls.getMethod("open", String.class);
                method = cls.getMethod("warnIfOpen", null);
                method3 = method4;
            } catch (Exception unused) {
                method = null;
                method2 = null;
            }
            return new j(method3, method2, method);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public j(Method method, Method method2, Method method3) {
        this.f19242a = method;
        this.f19243b = method2;
        this.f19244c = method3;
    }

    public final Object a(String str) {
        w5.k.f(str, "closer");
        Method method = this.f19242a;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(null, null);
                Method method2 = this.f19243b;
                w5.k.c(method2);
                method2.invoke(objInvoke, str);
                return objInvoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final boolean b(Object obj) {
        if (obj != null) {
            try {
                Method method = this.f19244c;
                w5.k.c(method);
                method.invoke(obj, null);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
