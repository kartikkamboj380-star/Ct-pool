package r0;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f22099a;

    static {
        String strI = l0.i.i("ProcessUtils");
        w5.k.e(strI, "tagWithPrefix(\"ProcessUtils\")");
        f22099a = strI;
    }

    private static final String a(Context context) {
        Object next;
        if (Build.VERSION.SDK_INT >= 28) {
            return C2010a.f22080a.a();
        }
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, l0.t.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, null);
            w5.k.c(objInvoke);
            if (objInvoke instanceof String) {
                return (String) objInvoke;
            }
        } catch (Throwable th) {
            l0.i.e().b(f22099a, "Unable to check ActivityThread for processName", th);
        }
        int iMyPid = Process.myPid();
        Object systemService = context.getSystemService("activity");
        w5.k.d(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return null;
        }
        Iterator<T> it = runningAppProcesses.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ActivityManager.RunningAppProcessInfo) next).pid == iMyPid) {
                break;
            }
        }
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) next;
        if (runningAppProcessInfo != null) {
            return runningAppProcessInfo.processName;
        }
        return null;
    }

    public static final boolean b(Context context, androidx.work.a aVar) {
        w5.k.f(context, "context");
        w5.k.f(aVar, "configuration");
        String strA = a(context);
        String strC = aVar.c();
        return w5.k.b(strA, (strC == null || strC.length() == 0) ? context.getApplicationInfo().processName : aVar.c());
    }
}
