package N4;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.google.android.gms.common.util.ProcessUtils;
import j5.AbstractC1809n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f2409a = new v();

    private v() {
    }

    private final u a(String str, int i7, int i8, boolean z6) {
        return new u(str, i7, i8, z6);
    }

    static /* synthetic */ u b(v vVar, String str, int i7, int i8, boolean z6, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i7 = 0;
        }
        if ((i9 & 4) != 0) {
            i8 = 0;
        }
        if ((i9 & 8) != 0) {
            z6 = false;
        }
        return vVar.a(str, i7, i8, z6);
    }

    public final List c(Context context) {
        w5.k.f(context, "context");
        int i7 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager != null ? activityManager.getRunningAppProcesses() : null;
        if (runningAppProcesses == null) {
            runningAppProcesses = AbstractC1809n.i();
        }
        List listF = AbstractC1809n.F(runningAppProcesses);
        ArrayList<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList();
        for (Object obj : listF) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i7) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC1809n.q(arrayList, 10));
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
            String str2 = runningAppProcessInfo.processName;
            w5.k.e(str2, "runningAppProcessInfo.processName");
            arrayList2.add(new u(str2, runningAppProcessInfo.pid, runningAppProcessInfo.importance, w5.k.b(runningAppProcessInfo.processName, str)));
        }
        return arrayList2;
    }

    public final u d(Context context) {
        Object next;
        w5.k.f(context, "context");
        int iMyPid = Process.myPid();
        Iterator it = c(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((u) next).b() == iMyPid) {
                break;
            }
        }
        u uVar = (u) next;
        return uVar == null ? b(this, e(), iMyPid, 0, false, 12, null) : uVar;
    }

    public final String e() throws Throwable {
        String processName;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 33) {
            String strMyProcessName = Process.myProcessName();
            w5.k.e(strMyProcessName, "myProcessName()");
            return strMyProcessName;
        }
        if (i7 >= 28 && (processName = Application.getProcessName()) != null) {
            return processName;
        }
        String myProcessName = ProcessUtils.getMyProcessName();
        return myProcessName != null ? myProcessName : "";
    }
}
