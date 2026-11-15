package X3;

import U3.h;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends c {

    private static final class a implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final Future f4340m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final X3.a f4341n;

        a(Future future, X3.a aVar) {
            this.f4340m = future;
            this.f4341n = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f4341n.b(b.b(this.f4340m));
            } catch (Error e7) {
                e = e7;
                this.f4341n.a(e);
            } catch (RuntimeException e8) {
                e = e8;
                this.f4341n.a(e);
            } catch (ExecutionException e9) {
                this.f4341n.a(e9.getCause());
            }
        }

        public String toString() {
            return U3.d.a(this).c(this.f4341n).toString();
        }
    }

    public static void a(d dVar, X3.a aVar, Executor executor) {
        h.i(aVar);
        dVar.e(new a(dVar, aVar), executor);
    }

    public static Object b(Future future) {
        h.p(future.isDone(), "Future was expected to be done: %s", future);
        return e.a(future);
    }
}
