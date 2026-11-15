package c1;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import n1.AbstractC1898e;
import y1.k;
import y1.l;
import y1.o;
import y1.p;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Class f9964a = c.class;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static f f9965b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile boolean f9966c = false;

    public static k a() {
        return b().l();
    }

    public static o b() {
        return o.n();
    }

    public static boolean c() {
        return f9966c;
    }

    public static void d(Context context) {
        f(context, null, null);
    }

    public static void e(Context context, l lVar) {
        f(context, lVar, null);
    }

    public static void f(Context context, l lVar, b bVar) {
        g(context, lVar, bVar, true);
    }

    public static void g(Context context, l lVar, b bVar, boolean z6) {
        if (K1.b.d()) {
            K1.b.a("Fresco#initialize");
        }
        if (f9966c) {
            P0.a.C(f9964a, "Fresco has already been initialized! `Fresco.initialize(...)` should only be called 1 single time to avoid memory leaks!");
        } else {
            f9966c = true;
        }
        p.b(z6);
        if (!N2.a.c()) {
            if (K1.b.d()) {
                K1.b.a("Fresco.initialize->SoLoader.init");
            }
            try {
                try {
                    try {
                        try {
                            Class.forName("com.facebook.imagepipeline.nativecode.NativeCodeInitializer").getMethod("init", Context.class).invoke(null, context);
                        } catch (ClassNotFoundException unused) {
                            N2.a.b(new N2.c());
                            if (K1.b.d()) {
                            }
                        }
                    } catch (NoSuchMethodException unused2) {
                        N2.a.b(new N2.c());
                        if (K1.b.d()) {
                        }
                    }
                } catch (IllegalAccessException unused3) {
                    N2.a.b(new N2.c());
                    if (K1.b.d()) {
                    }
                } catch (InvocationTargetException unused4) {
                    N2.a.b(new N2.c());
                    if (K1.b.d()) {
                    }
                }
                if (K1.b.d()) {
                    K1.b.b();
                }
            } catch (Throwable th) {
                if (K1.b.d()) {
                    K1.b.b();
                }
                throw th;
            }
        }
        Context applicationContext = context.getApplicationContext();
        if (lVar == null) {
            o.w(applicationContext);
        } else {
            o.x(lVar);
        }
        h(applicationContext, bVar);
        if (K1.b.d()) {
            K1.b.b();
        }
    }

    private static void h(Context context, b bVar) {
        if (K1.b.d()) {
            K1.b.a("Fresco.initializeDrawee");
        }
        f fVar = new f(context, bVar);
        f9965b = fVar;
        AbstractC1898e.g(fVar);
        if (K1.b.d()) {
            K1.b.b();
        }
    }

    public static e i() {
        return f9965b.get();
    }
}
