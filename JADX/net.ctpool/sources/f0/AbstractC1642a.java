package f0;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: f0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1642a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f19252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Method f19253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Method f19254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Method f19255d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Method f19256e;

    public static void a(String str, int i7) {
        if (Build.VERSION.SDK_INT >= 29) {
            c.a(str, i7);
        } else {
            b(str, i7);
        }
    }

    private static void b(String str, int i7) {
        try {
            if (f19254c == null) {
                f19254c = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            }
            f19254c.invoke(null, Long.valueOf(f19252a), str, Integer.valueOf(i7));
        } catch (Exception e7) {
            g("asyncTraceBegin", e7);
        }
    }

    public static void c(String str) {
        AbstractC1643b.a(str);
    }

    public static void d(String str, int i7) {
        if (Build.VERSION.SDK_INT >= 29) {
            c.b(str, i7);
        } else {
            e(str, i7);
        }
    }

    private static void e(String str, int i7) {
        try {
            if (f19255d == null) {
                f19255d = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            }
            f19255d.invoke(null, Long.valueOf(f19252a), str, Integer.valueOf(i7));
        } catch (Exception e7) {
            g("asyncTraceEnd", e7);
        }
    }

    public static void f() {
        AbstractC1643b.b();
    }

    private static void g(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static boolean h() {
        return Build.VERSION.SDK_INT >= 29 ? c.c() : i();
    }

    private static boolean i() {
        try {
            if (f19253b == null) {
                f19252a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f19253b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f19253b.invoke(null, Long.valueOf(f19252a))).booleanValue();
        } catch (Exception e7) {
            g("isTagEnabled", e7);
            return false;
        }
    }

    public static void j(String str, int i7) {
        if (Build.VERSION.SDK_INT >= 29) {
            c.d(str, i7);
        } else {
            k(str, i7);
        }
    }

    private static void k(String str, int i7) {
        try {
            if (f19256e == null) {
                f19256e = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
            }
            f19256e.invoke(null, Long.valueOf(f19252a), str, Integer.valueOf(i7));
        } catch (Exception e7) {
            g("traceCounter", e7);
        }
    }
}
