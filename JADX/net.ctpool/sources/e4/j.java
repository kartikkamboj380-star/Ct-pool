package e4;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import j5.AbstractC1809n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k4.F;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f19211a = new j();

    private j() {
    }

    public static /* synthetic */ F.e.d.a.c c(j jVar, String str, int i7, int i8, boolean z6, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i7 = 0;
        }
        if ((i9 & 4) != 0) {
            i8 = 0;
        }
        if ((i9 & 8) != 0) {
            z6 = false;
        }
        return jVar.b(str, i7, i8, z6);
    }

    private final String f() {
        String processName;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 33) {
            return (i7 < 28 || (processName = Application.getProcessName()) == null) ? "" : processName;
        }
        String strMyProcessName = Process.myProcessName();
        w5.k.e(strMyProcessName, "{\n      Process.myProcessName()\n    }");
        return strMyProcessName;
    }

    public final F.e.d.a.c a(String str, int i7, int i8) {
        w5.k.f(str, "processName");
        return c(this, str, i7, i8, false, 8, null);
    }

    public final F.e.d.a.c b(String str, int i7, int i8, boolean z6) {
        w5.k.f(str, "processName");
        F.e.d.a.c cVarA = F.e.d.a.c.a().e(str).d(i7).c(i8).b(z6).a();
        w5.k.e(cVarA, "builder()\n      .setProc…ltProcess)\n      .build()");
        return cVarA;
    }

    public final List d(Context context) {
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
            arrayList2.add(F.e.d.a.c.a().e(runningAppProcessInfo.processName).d(runningAppProcessInfo.pid).c(runningAppProcessInfo.importance).b(w5.k.b(runningAppProcessInfo.processName, str)).a());
        }
        return arrayList2;
    }

    public final F.e.d.a.c e(Context context) {
        Object next;
        w5.k.f(context, "context");
        int iMyPid = Process.myPid();
        Iterator it = d(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((F.e.d.a.c) next).c() == iMyPid) {
                break;
            }
        }
        F.e.d.a.c cVar = (F.e.d.a.c) next;
        return cVar == null ? c(this, f(), iMyPid, 0, false, 12, null) : cVar;
    }
}
