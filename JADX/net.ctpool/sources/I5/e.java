package I5;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import i5.m;
import i5.n;
import java.lang.reflect.InvocationTargetException;
import w5.k;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f1530a;
    private static volatile Choreographer choreographer;

    static {
        Object objA;
        try {
            m.a aVar = m.f19973m;
            objA = m.a(new c(a(Looper.getMainLooper(), true), null, 2, null));
        } catch (Throwable th) {
            m.a aVar2 = m.f19973m;
            objA = m.a(n.a(th));
        }
        f1530a = (d) (m.c(objA) ? null : objA);
    }

    public static final Handler a(Looper looper, boolean z6) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        if (!z6) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            objNewInstance = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            k.d(objNewInstance, "null cannot be cast to non-null type android.os.Handler");
        } else {
            try {
                objNewInstance = Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        return (Handler) objNewInstance;
    }
}
