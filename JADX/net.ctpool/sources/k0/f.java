package k0;

import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final i f20502a = new i(f.d().getWebkitToCompatConverter());
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final g f20503a = f.a();
    }

    static g a() {
        try {
            return new h((WebViewProviderFactoryBoundaryInterface) k6.a.a(WebViewProviderFactoryBoundaryInterface.class, b()));
        } catch (ClassNotFoundException unused) {
            return new k0.b();
        } catch (IllegalAccessException e7) {
            throw new RuntimeException(e7);
        } catch (NoSuchMethodException e8) {
            throw new RuntimeException(e8);
        } catch (InvocationTargetException e9) {
            throw new RuntimeException(e9);
        }
    }

    private static InvocationHandler b() {
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, e()).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
    }

    public static i c() {
        return a.f20502a;
    }

    public static g d() {
        return b.f20503a;
    }

    public static ClassLoader e() {
        return Build.VERSION.SDK_INT >= 28 ? WebView.getWebViewClassLoader() : f().getClass().getClassLoader();
    }

    private static Object f() {
        try {
            Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", null);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(null, null);
        } catch (IllegalAccessException e7) {
            throw new RuntimeException(e7);
        } catch (NoSuchMethodException e8) {
            throw new RuntimeException(e8);
        } catch (InvocationTargetException e9) {
            throw new RuntimeException(e9);
        }
    }
}
