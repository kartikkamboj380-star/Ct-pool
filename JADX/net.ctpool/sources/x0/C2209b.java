package x0;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: x0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C2209b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C2209b f22758d = new C2209b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f22759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f22760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f22761c;

    /* JADX INFO: renamed from: x0.b$b, reason: collision with other inner class name */
    private static class ExecutorC0326b implements Executor {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private ThreadLocal f22762m;

        private ExecutorC0326b() {
            this.f22762m = new ThreadLocal();
        }

        private int a() {
            Integer num = (Integer) this.f22762m.get();
            if (num == null) {
                num = 0;
            }
            int iIntValue = num.intValue() - 1;
            ThreadLocal threadLocal = this.f22762m;
            if (iIntValue == 0) {
                threadLocal.remove();
            } else {
                threadLocal.set(Integer.valueOf(iIntValue));
            }
            return iIntValue;
        }

        private int b() {
            Integer num = (Integer) this.f22762m.get();
            if (num == null) {
                num = 0;
            }
            int iIntValue = num.intValue() + 1;
            this.f22762m.set(Integer.valueOf(iIntValue));
            return iIntValue;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            try {
                if (b() <= 15) {
                    runnable.run();
                } else {
                    C2209b.a().execute(runnable);
                }
                a();
            } catch (Throwable th) {
                a();
                throw th;
            }
        }
    }

    private C2209b() {
        this.f22759a = !c() ? Executors.newCachedThreadPool() : C2208a.b();
        this.f22760b = Executors.newSingleThreadScheduledExecutor();
        this.f22761c = new ExecutorC0326b();
    }

    public static ExecutorService a() {
        return f22758d.f22759a;
    }

    static Executor b() {
        return f22758d.f22761c;
    }

    private static boolean c() {
        String property = System.getProperty("java.runtime.name");
        if (property == null) {
            return false;
        }
        return property.toLowerCase(Locale.US).contains("android");
    }
}
