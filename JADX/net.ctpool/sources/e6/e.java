package e6;

import T5.z;
import android.util.Log;
import j5.AbstractC1787F;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f19228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f19229c = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final CopyOnWriteArraySet f19227a = new CopyOnWriteArraySet();

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r22 = z.class.getPackage();
        String name = r22 != null ? r22.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        String name2 = z.class.getName();
        w5.k.e(name2, "OkHttpClient::class.java.name");
        linkedHashMap.put(name2, "okhttp.OkHttpClient");
        String name3 = b6.e.class.getName();
        w5.k.e(name3, "Http2::class.java.name");
        linkedHashMap.put(name3, "okhttp.Http2");
        String name4 = X5.e.class.getName();
        w5.k.e(name4, "TaskRunner::class.java.name");
        linkedHashMap.put(name4, "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f19228b = AbstractC1787F.q(linkedHashMap);
    }

    private e() {
    }

    private final void c(String str, String str2) {
        Logger logger = Logger.getLogger(str);
        if (f19227a.add(logger)) {
            w5.k.e(logger, "logger");
            logger.setUseParentHandlers(false);
            logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
            logger.addHandler(f.f19230a);
        }
    }

    private final String d(String str) {
        String str2 = (String) f19228b.get(str);
        return str2 != null ? str2 : F5.g.F0(str, 23);
    }

    public final void a(String str, int i7, String str2, Throwable th) {
        int iMin;
        w5.k.f(str, "loggerName");
        w5.k.f(str2, "message");
        String strD = d(str);
        if (Log.isLoggable(strD, i7)) {
            if (th != null) {
                str2 = str2 + "\n" + Log.getStackTraceString(th);
            }
            int length = str2.length();
            int i8 = 0;
            while (i8 < length) {
                int iQ = F5.g.Q(str2, '\n', i8, false, 4, null);
                if (iQ == -1) {
                    iQ = length;
                }
                while (true) {
                    iMin = Math.min(iQ, i8 + 4000);
                    String strSubstring = str2.substring(i8, iMin);
                    w5.k.e(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    Log.println(i7, strD, strSubstring);
                    if (iMin >= iQ) {
                        break;
                    } else {
                        i8 = iMin;
                    }
                }
                i8 = iMin + 1;
            }
        }
    }

    public final void b() {
        for (Map.Entry entry : f19228b.entrySet()) {
            c((String) entry.getKey(), (String) entry.getValue());
        }
    }
}
