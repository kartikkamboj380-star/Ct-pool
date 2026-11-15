package z3;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import u3.HandlerC2134a;

/* JADX INFO: loaded from: classes.dex */
final class N implements Executor {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Handler f23277m = new HandlerC2134a(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f23277m.post(runnable);
    }
}
