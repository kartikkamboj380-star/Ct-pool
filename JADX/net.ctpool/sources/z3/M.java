package z3;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class M implements Executor {
    M() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
