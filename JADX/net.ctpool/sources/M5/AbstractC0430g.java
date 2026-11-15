package M5;

import java.util.Collection;
import java.util.ServiceLoader;

/* JADX INFO: renamed from: M5.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0430g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Collection f2086a = E5.e.i(E5.e.a(ServiceLoader.load(H5.G.class, H5.G.class.getClassLoader()).iterator()));

    public static final Collection a() {
        return f2086a;
    }

    public static final void b(Throwable th) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }
}
