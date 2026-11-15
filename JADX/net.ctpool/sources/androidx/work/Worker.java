package androidx.work;

import X3.d;
import android.content.Context;
import androidx.work.c;
import l0.e;

/* JADX INFO: loaded from: classes.dex */
public abstract class Worker extends c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    androidx.work.impl.utils.futures.c f9207q;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Worker.this.f9207q.p(Worker.this.o());
            } catch (Throwable th) {
                Worker.this.f9207q.q(th);
            }
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f9209m;

        b(androidx.work.impl.utils.futures.c cVar) {
            this.f9209m = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f9209m.p(Worker.this.p());
            } catch (Throwable th) {
                this.f9209m.q(th);
            }
        }
    }

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.c
    public d d() {
        androidx.work.impl.utils.futures.c cVarT = androidx.work.impl.utils.futures.c.t();
        c().execute(new b(cVarT));
        return cVarT;
    }

    @Override // androidx.work.c
    public final d m() {
        this.f9207q = androidx.work.impl.utils.futures.c.t();
        c().execute(new a());
        return this.f9207q;
    }

    public abstract c.a o();

    public e p() {
        throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`");
    }
}
