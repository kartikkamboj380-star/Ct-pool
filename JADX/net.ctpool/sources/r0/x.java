package r0;

import android.content.Context;
import android.os.PowerManager;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f22115a;

    static {
        String strI = l0.i.i("WakeLocks");
        w5.k.e(strI, "tagWithPrefix(\"WakeLocks\")");
        f22115a = strI;
    }

    public static final void a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        y yVar = y.f22116a;
        synchronized (yVar) {
            linkedHashMap.putAll(yVar.a());
            i5.u uVar = i5.u.f19985a;
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str = (String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                l0.i.e().k(f22115a, "WakeLock held for " + str);
            }
        }
    }

    public static final PowerManager.WakeLock b(Context context, String str) {
        w5.k.f(context, "context");
        w5.k.f(str, "tag");
        Object systemService = context.getApplicationContext().getSystemService("power");
        w5.k.d(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String str2 = "WorkManager: " + str;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) systemService).newWakeLock(1, str2);
        y yVar = y.f22116a;
        synchronized (yVar) {
        }
        w5.k.e(wakeLockNewWakeLock, "wakeLock");
        return wakeLockNewWakeLock;
    }
}
