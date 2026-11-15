package z3;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: z3.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2275o {
    public static Object a(AbstractC2272l abstractC2272l) throws InterruptedException {
        Preconditions.checkNotMainThread();
        Preconditions.checkNotGoogleApiHandlerThread();
        Preconditions.checkNotNull(abstractC2272l, "Task must not be null");
        if (abstractC2272l.o()) {
            return i(abstractC2272l);
        }
        r rVar = new r(null);
        j(abstractC2272l, rVar);
        rVar.d();
        return i(abstractC2272l);
    }

    public static Object b(AbstractC2272l abstractC2272l, long j7, TimeUnit timeUnit) throws TimeoutException {
        Preconditions.checkNotMainThread();
        Preconditions.checkNotGoogleApiHandlerThread();
        Preconditions.checkNotNull(abstractC2272l, "Task must not be null");
        Preconditions.checkNotNull(timeUnit, "TimeUnit must not be null");
        if (abstractC2272l.o()) {
            return i(abstractC2272l);
        }
        r rVar = new r(null);
        j(abstractC2272l, rVar);
        if (rVar.e(j7, timeUnit)) {
            return i(abstractC2272l);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static AbstractC2272l c(Callable callable) {
        return d(AbstractC2274n.f23288a, callable);
    }

    public static AbstractC2272l d(Executor executor, Callable callable) {
        Preconditions.checkNotNull(executor, "Executor must not be null");
        Preconditions.checkNotNull(callable, "Callback must not be null");
        O o6 = new O();
        executor.execute(new P(o6, callable));
        return o6;
    }

    public static AbstractC2272l e(Exception exc) {
        O o6 = new O();
        o6.s(exc);
        return o6;
    }

    public static AbstractC2272l f(Object obj) {
        O o6 = new O();
        o6.t(obj);
        return o6;
    }

    public static AbstractC2272l g(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            return f(null);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((AbstractC2272l) it.next()) == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        O o6 = new O();
        t tVar = new t(collection.size(), o6);
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            j((AbstractC2272l) it2.next(), tVar);
        }
        return o6;
    }

    public static AbstractC2272l h(AbstractC2272l... abstractC2272lArr) {
        return (abstractC2272lArr == null || abstractC2272lArr.length == 0) ? f(null) : g(Arrays.asList(abstractC2272lArr));
    }

    private static Object i(AbstractC2272l abstractC2272l) throws ExecutionException {
        if (abstractC2272l.p()) {
            return abstractC2272l.l();
        }
        if (abstractC2272l.n()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(abstractC2272l.k());
    }

    private static void j(AbstractC2272l abstractC2272l, s sVar) {
        Executor executor = AbstractC2274n.f23289b;
        abstractC2272l.f(executor, sVar);
        abstractC2272l.d(executor, sVar);
        abstractC2272l.a(executor, sVar);
    }
}
