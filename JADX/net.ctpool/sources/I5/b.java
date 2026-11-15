package I5;

import H5.G;
import android.os.Build;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import m5.AbstractC1882a;
import m5.InterfaceC1888g;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends AbstractC1882a implements G {
    private volatile Object _preHandler;

    public b() {
        super(G.f1386a);
        this._preHandler = this;
    }

    private final Method a() {
        Object obj = this._preHandler;
        if (obj != this) {
            return (Method) obj;
        }
        Method method = null;
        try {
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", null);
            if (Modifier.isPublic(declaredMethod.getModifiers())) {
                if (Modifier.isStatic(declaredMethod.getModifiers())) {
                    method = declaredMethod;
                }
            }
        } catch (Throwable unused) {
        }
        this._preHandler = method;
        return method;
    }

    @Override // H5.G
    public void B(InterfaceC1888g interfaceC1888g, Throwable th) {
        int i7 = Build.VERSION.SDK_INT;
        if (26 > i7 || i7 >= 28) {
            return;
        }
        Method methodA = a();
        Object objInvoke = methodA != null ? methodA.invoke(null, null) : null;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = objInvoke instanceof Thread.UncaughtExceptionHandler ? (Thread.UncaughtExceptionHandler) objInvoke : null;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        }
    }
}
