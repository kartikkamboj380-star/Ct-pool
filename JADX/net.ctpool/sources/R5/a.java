package R5;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class a implements Executor {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f2903m = new a();

    private a() {
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
