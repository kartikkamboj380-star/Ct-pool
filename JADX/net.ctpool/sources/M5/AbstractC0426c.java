package M5;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* JADX INFO: renamed from: M5.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0426c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Method f2081a;

    static {
        Method method;
        try {
            method = ScheduledThreadPoolExecutor.class.getMethod("setRemoveOnCancelPolicy", Boolean.TYPE);
        } catch (Throwable unused) {
            method = null;
        }
        f2081a = method;
    }

    public static final boolean a(Executor executor) {
        Method method;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor == null || (method = f2081a) == null) {
                return false;
            }
            method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
