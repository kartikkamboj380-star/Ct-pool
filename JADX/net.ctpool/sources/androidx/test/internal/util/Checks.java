package androidx.test.internal.util;

import androidx.test.internal.platform.ServiceLoaderWrapper;
import androidx.test.internal.platform.ThreadChecker;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class Checks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadChecker f9191a;

    static {
        ThreadChecker threadChecker;
        List listA = ServiceLoaderWrapper.a(ThreadChecker.class);
        if (listA.isEmpty()) {
            threadChecker = new ThreadChecker() { // from class: androidx.test.internal.util.Checks.1
            };
        } else {
            if (listA.size() != 1) {
                throw new IllegalStateException(String.format("Found more than one %s implementations.", ThreadChecker.class.getName()));
            }
            threadChecker = (ThreadChecker) listA.get(0);
        }
        f9191a = threadChecker;
    }

    public static Object a(Object obj) {
        obj.getClass();
        return obj;
    }
}
