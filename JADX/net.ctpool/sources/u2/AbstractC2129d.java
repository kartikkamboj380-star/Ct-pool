package u2;

import com.facebook.react.bridge.UiThreadUtil;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: u2.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2129d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Executor f22496a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Executor f22497b = new a();

    /* JADX INFO: renamed from: u2.d$a */
    private static class a implements Executor {
        private a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: u2.d$b */
    private static class b implements Executor {
        private b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            UiThreadUtil.runOnUiThread(runnable);
        }
    }
}
