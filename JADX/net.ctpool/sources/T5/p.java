package T5;

import Y5.e;
import com.google.android.gms.common.api.Api;
import j5.AbstractC1809n;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Runnable f3601c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ExecutorService f3602d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f3599a = 64;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f3600b = 5;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ArrayDeque f3603e = new ArrayDeque();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ArrayDeque f3604f = new ArrayDeque();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayDeque f3605g = new ArrayDeque();

    private final e.a d(String str) {
        for (e.a aVar : this.f3604f) {
            if (w5.k.b(aVar.d(), str)) {
                return aVar;
            }
        }
        for (e.a aVar2 : this.f3603e) {
            if (w5.k.b(aVar2.d(), str)) {
                return aVar2;
            }
        }
        return null;
    }

    private final void e(Deque deque, Object obj) {
        Runnable runnable;
        synchronized (this) {
            if (!deque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            runnable = this.f3601c;
            i5.u uVar = i5.u.f19985a;
        }
        if (h() || runnable == null) {
            return;
        }
        runnable.run();
    }

    private final boolean h() {
        int i7;
        boolean z6;
        if (U5.c.f3990h && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            w5.k.e(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = this.f3603e.iterator();
                w5.k.e(it, "readyAsyncCalls.iterator()");
                while (it.hasNext()) {
                    e.a aVar = (e.a) it.next();
                    if (this.f3604f.size() >= this.f3599a) {
                        break;
                    }
                    if (aVar.c().get() < this.f3600b) {
                        it.remove();
                        aVar.c().incrementAndGet();
                        w5.k.e(aVar, "asyncCall");
                        arrayList.add(aVar);
                        this.f3604f.add(aVar);
                    }
                }
                z6 = k() > 0;
                i5.u uVar = i5.u.f19985a;
            } catch (Throwable th) {
                throw th;
            }
        }
        int size = arrayList.size();
        for (i7 = 0; i7 < size; i7++) {
            ((e.a) arrayList.get(i7)).a(c());
        }
        return z6;
    }

    public final void a(e.a aVar) {
        e.a aVarD;
        w5.k.f(aVar, "call");
        synchronized (this) {
            try {
                this.f3603e.add(aVar);
                if (!aVar.b().p() && (aVarD = d(aVar.d())) != null) {
                    aVar.e(aVarD);
                }
                i5.u uVar = i5.u.f19985a;
            } catch (Throwable th) {
                throw th;
            }
        }
        h();
    }

    public final synchronized void b(Y5.e eVar) {
        w5.k.f(eVar, "call");
        this.f3605g.add(eVar);
    }

    public final synchronized ExecutorService c() {
        ExecutorService executorService;
        try {
            if (this.f3602d == null) {
                this.f3602d = new ThreadPoolExecutor(0, Api.BaseClientBuilder.API_PRIORITY_OTHER, 60L, TimeUnit.SECONDS, new SynchronousQueue(), U5.c.K(U5.c.f3991i + " Dispatcher", false));
            }
            executorService = this.f3602d;
            w5.k.c(executorService);
        } catch (Throwable th) {
            throw th;
        }
        return executorService;
    }

    public final void f(e.a aVar) {
        w5.k.f(aVar, "call");
        aVar.c().decrementAndGet();
        e(this.f3604f, aVar);
    }

    public final void g(Y5.e eVar) {
        w5.k.f(eVar, "call");
        e(this.f3605g, eVar);
    }

    public final synchronized List i() {
        List listUnmodifiableList;
        try {
            ArrayDeque arrayDeque = this.f3603e;
            ArrayList arrayList = new ArrayList(AbstractC1809n.q(arrayDeque, 10));
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                arrayList.add(((e.a) it.next()).b());
            }
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
            w5.k.e(listUnmodifiableList, "Collections.unmodifiable…yncCalls.map { it.call })");
        } catch (Throwable th) {
            throw th;
        }
        return listUnmodifiableList;
    }

    public final synchronized List j() {
        List listUnmodifiableList;
        try {
            ArrayDeque arrayDeque = this.f3605g;
            ArrayDeque arrayDeque2 = this.f3604f;
            ArrayList arrayList = new ArrayList(AbstractC1809n.q(arrayDeque2, 10));
            Iterator it = arrayDeque2.iterator();
            while (it.hasNext()) {
                arrayList.add(((e.a) it.next()).b());
            }
            listUnmodifiableList = Collections.unmodifiableList(AbstractC1809n.R(arrayDeque, arrayList));
            w5.k.e(listUnmodifiableList, "Collections.unmodifiable…yncCalls.map { it.call })");
        } catch (Throwable th) {
            throw th;
        }
        return listUnmodifiableList;
    }

    public final synchronized int k() {
        return this.f3604f.size() + this.f3605g.size();
    }
}
