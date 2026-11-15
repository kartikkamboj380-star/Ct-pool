package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: renamed from: androidx.core.app.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0552d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static final Class f6943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final Field f6944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static final Field f6945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected static final Method f6946d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected static final Method f6947e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected static final Method f6948f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Handler f6949g = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: androidx.core.app.d$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ C0131d f6950m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Object f6951n;

        a(C0131d c0131d, Object obj) {
            this.f6950m = c0131d;
            this.f6951n = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6950m.f6956m = this.f6951n;
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.d$b */
    class b implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ Application f6952m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ C0131d f6953n;

        b(Application application, C0131d c0131d) {
            this.f6952m = application;
            this.f6953n = c0131d;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6952m.unregisterActivityLifecycleCallbacks(this.f6953n);
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.d$c */
    class c implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ Object f6954m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Object f6955n;

        c(Object obj, Object obj2) {
            this.f6954m = obj;
            this.f6955n = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = AbstractC0552d.f6946d;
                if (method != null) {
                    method.invoke(this.f6954m, this.f6955n, Boolean.FALSE, "AppCompat recreation");
                } else {
                    AbstractC0552d.f6947e.invoke(this.f6954m, this.f6955n, Boolean.FALSE);
                }
            } catch (RuntimeException e7) {
                if (e7.getClass() == RuntimeException.class && e7.getMessage() != null && e7.getMessage().startsWith("Unable to stop")) {
                    throw e7;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.d$d, reason: collision with other inner class name */
    private static final class C0131d implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f6956m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Activity f6957n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final int f6958o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private boolean f6959p = false;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private boolean f6960q = false;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private boolean f6961r = false;

        C0131d(Activity activity) {
            this.f6957n = activity;
            this.f6958o = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f6957n == activity) {
                this.f6957n = null;
                this.f6960q = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f6960q || this.f6961r || this.f6959p || !AbstractC0552d.h(this.f6956m, this.f6958o, activity)) {
                return;
            }
            this.f6961r = true;
            this.f6956m = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f6957n == activity) {
                this.f6959p = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class clsA = a();
        f6943a = clsA;
        f6944b = b();
        f6945c = f();
        f6946d = d(clsA);
        f6947e = c(clsA);
        f6948f = e(clsA);
    }

    private static Class a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method c(Class cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method d(Class cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method e(Class cls) {
        if (g() && cls != null) {
            try {
                Class cls2 = Integer.TYPE;
                Class cls3 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, cls2, cls3, Configuration.class, Configuration.class, cls3, cls3);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean g() {
        int i7 = Build.VERSION.SDK_INT;
        return i7 == 26 || i7 == 27;
    }

    protected static boolean h(Object obj, int i7, Activity activity) {
        try {
            Object obj2 = f6945c.get(activity);
            if (obj2 == obj && activity.hashCode() == i7) {
                f6949g.postAtFrontOfQueue(new c(f6944b.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    static boolean i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (g() && f6948f == null) {
            return false;
        }
        if (f6947e == null && f6946d == null) {
            return false;
        }
        try {
            Object obj2 = f6945c.get(activity);
            if (obj2 == null || (obj = f6944b.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            C0131d c0131d = new C0131d(activity);
            application.registerActivityLifecycleCallbacks(c0131d);
            Handler handler = f6949g;
            handler.post(new a(c0131d, obj2));
            try {
                if (g()) {
                    Method method = f6948f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new b(application, c0131d));
                return true;
            } catch (Throwable th) {
                f6949g.post(new b(application, c0131d));
                throw th;
            }
        } catch (Throwable unused) {
            return false;
        }
    }
}
