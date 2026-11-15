package b4;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
class u implements A4.d, A4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f9720a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Queue f9721b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f9722c;

    u(Executor executor) {
        this.f9722c = executor;
    }

    private synchronized Set g(A4.a aVar) {
        Map map;
        try {
            map = (Map) this.f9720a.get(aVar.b());
        } catch (Throwable th) {
            throw th;
        }
        return map == null ? Collections.emptySet() : map.entrySet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(Map.Entry entry, A4.a aVar) {
        ((A4.b) entry.getKey()).a(aVar);
    }

    @Override // A4.d
    public synchronized void a(Class cls, A4.b bVar) {
        AbstractC0683D.b(cls);
        AbstractC0683D.b(bVar);
        if (this.f9720a.containsKey(cls)) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f9720a.get(cls);
            concurrentHashMap.remove(bVar);
            if (concurrentHashMap.isEmpty()) {
                this.f9720a.remove(cls);
            }
        }
    }

    @Override // A4.d
    public void b(Class cls, A4.b bVar) {
        c(cls, this.f9722c, bVar);
    }

    @Override // A4.d
    public synchronized void c(Class cls, Executor executor, A4.b bVar) {
        try {
            AbstractC0683D.b(cls);
            AbstractC0683D.b(bVar);
            AbstractC0683D.b(executor);
            if (!this.f9720a.containsKey(cls)) {
                this.f9720a.put(cls, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f9720a.get(cls)).put(bVar, executor);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // A4.c
    public void d(final A4.a aVar) {
        AbstractC0683D.b(aVar);
        synchronized (this) {
            try {
                Queue queue = this.f9721b;
                if (queue != null) {
                    queue.add(aVar);
                    return;
                }
                for (final Map.Entry entry : g(aVar)) {
                    ((Executor) entry.getValue()).execute(new Runnable() { // from class: b4.t
                        @Override // java.lang.Runnable
                        public final void run() {
                            u.h(entry, aVar);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void f() {
        Queue queue;
        synchronized (this) {
            try {
                queue = this.f9721b;
                if (queue != null) {
                    this.f9721b = null;
                } else {
                    queue = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (queue != null) {
            Iterator it = queue.iterator();
            while (it.hasNext()) {
                d((A4.a) it.next());
            }
        }
    }
}
