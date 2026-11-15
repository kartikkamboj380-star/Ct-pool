package U2;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
class n implements Executor {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Executor f3819m;

    static class a implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final Runnable f3820m;

        a(Runnable runnable) {
            this.f3820m = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f3820m.run();
            } catch (Exception e7) {
                Y2.a.d("Executor", "Background execution failure.", e7);
            }
        }
    }

    n(Executor executor) {
        this.f3819m = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f3819m.execute(new a(runnable));
    }
}
