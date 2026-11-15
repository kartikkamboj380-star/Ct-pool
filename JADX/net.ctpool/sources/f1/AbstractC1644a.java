package f1;

import android.os.Looper;

/* JADX INFO: renamed from: f1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1644a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static AbstractC1644a f19257a;

    /* JADX INFO: renamed from: f1.a$a, reason: collision with other inner class name */
    public interface InterfaceC0256a {
        void release();
    }

    public static synchronized AbstractC1644a b() {
        try {
            if (f19257a == null) {
                f19257a = new C1645b();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f19257a;
    }

    static boolean c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public abstract void a(InterfaceC0256a interfaceC0256a);

    public abstract void d(InterfaceC0256a interfaceC0256a);
}
