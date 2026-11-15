package M0;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public class f extends b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static f f2024n;

    private f() {
        super(new Handler(Looper.getMainLooper()));
    }

    public static f g() {
        if (f2024n == null) {
            f2024n = new f();
        }
        return f2024n;
    }

    @Override // M0.b, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (a()) {
            runnable.run();
        } else {
            super.execute(runnable);
        }
    }
}
