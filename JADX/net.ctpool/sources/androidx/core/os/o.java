package androidx.core.os;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f7168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Method f7169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Method f7170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Method f7171d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Method f7172e;

    static class a {
        static void a(String str) {
            Trace.beginSection(str);
        }

        static void b() {
            Trace.endSection();
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f7168a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f7169b = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f7170c = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f7171d = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f7172e = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e7) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e7);
            }
        }
    }

    public static void a(String str) {
        a.a(str);
    }

    public static void b() {
        a.b();
    }
}
