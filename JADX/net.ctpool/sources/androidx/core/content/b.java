package androidx.core.content;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import androidx.core.app.T;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f7058a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f7059b = new Object();

    static class a {
        static void a(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        static void b(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    /* JADX INFO: renamed from: androidx.core.content.b$b, reason: collision with other inner class name */
    static class C0135b {
        static File[] a(Context context) {
            return context.getExternalCacheDirs();
        }

        static File[] b(Context context, String str) {
            return context.getExternalFilesDirs(str);
        }

        static File[] c(Context context) {
            return context.getObbDirs();
        }
    }

    static class c {
        static File a(Context context) {
            return context.getCodeCacheDir();
        }

        static Drawable b(Context context, int i7) {
            return context.getDrawable(i7);
        }

        static File c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    static class d {
        static int a(Context context, int i7) {
            return context.getColor(i7);
        }

        static <T> T b(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        static String c(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    static class e {
        static Context a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        static File b(Context context) {
            return context.getDataDir();
        }

        static boolean c(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    static class f {
        static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i7) {
            return ((i7 & 4) == 0 || str != null) ? context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i7 & 1) : context.registerReceiver(broadcastReceiver, intentFilter, b.i(context), handler);
        }

        static ComponentName b(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    static class g {
        static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i7) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i7);
        }
    }

    public static int a(Context context, String str) {
        androidx.core.util.b.d(str, "permission must be non-null");
        return (androidx.core.os.a.c() || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : T.i(context).a() ? 0 : -1;
    }

    public static Context b(Context context) {
        return e.a(context);
    }

    public static int c(Context context, int i7) {
        return d.a(context, i7);
    }

    public static ColorStateList d(Context context, int i7) {
        return androidx.core.content.res.f.e(context.getResources(), i7, context.getTheme());
    }

    public static Drawable e(Context context, int i7) {
        return c.b(context, i7);
    }

    public static File[] f(Context context) {
        return C0135b.a(context);
    }

    public static File[] g(Context context, String str) {
        return C0135b.b(context, str);
    }

    public static File h(Context context) {
        return c.c(context);
    }

    static String i(Context context) {
        String str = context.getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
        if (androidx.core.content.f.b(context, str) == 0) {
            return str;
        }
        throw new RuntimeException("Permission " + str + " is required by your application to receive broadcasts, please add it to your manifest");
    }

    public static Intent j(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i7) {
        return k(context, broadcastReceiver, intentFilter, null, null, i7);
    }

    public static Intent k(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i7) {
        int i8 = i7 & 1;
        if (i8 != 0 && (i7 & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
        }
        if (i8 != 0) {
            i7 |= 2;
        }
        int i9 = i7;
        int i10 = i9 & 2;
        if (i10 == 0 && (i9 & 4) == 0) {
            throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
        }
        if (i10 == 0 || (i9 & 4) == 0) {
            return androidx.core.os.a.c() ? g.a(context, broadcastReceiver, intentFilter, str, handler, i9) : Build.VERSION.SDK_INT >= 26 ? f.a(context, broadcastReceiver, intentFilter, str, handler, i9) : ((i9 & 4) == 0 || str != null) ? context.registerReceiver(broadcastReceiver, intentFilter, str, handler) : context.registerReceiver(broadcastReceiver, intentFilter, i(context), handler);
        }
        throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
    }

    public static boolean l(Context context, Intent[] intentArr, Bundle bundle) {
        a.a(context, intentArr, bundle);
        return true;
    }

    public static void m(Context context, Intent intent, Bundle bundle) {
        a.b(context, intent, bundle);
    }

    public static void n(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            f.b(context, intent);
        } else {
            context.startService(intent);
        }
    }
}
