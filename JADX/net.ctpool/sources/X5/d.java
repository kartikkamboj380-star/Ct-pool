package X5;

import i5.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import w5.k;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f4361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f4362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f4363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f4364d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final e f4365e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f4366f;

    public d(e eVar, String str) {
        k.f(eVar, "taskRunner");
        k.f(str, "name");
        this.f4365e = eVar;
        this.f4366f = str;
        this.f4363c = new ArrayList();
    }

    public static /* synthetic */ void j(d dVar, a aVar, long j7, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            j7 = 0;
        }
        dVar.i(aVar, j7);
    }

    public final void a() {
        if (U5.c.f3990h && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            k.e(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        synchronized (this.f4365e) {
            try {
                if (b()) {
                    this.f4365e.h(this);
                }
                u uVar = u.f19985a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        a aVar = this.f4362b;
        if (aVar != null) {
            k.c(aVar);
            if (aVar.a()) {
                this.f4364d = true;
            }
        }
        boolean z6 = false;
        for (int size = this.f4363c.size() - 1; size >= 0; size--) {
            if (((a) this.f4363c.get(size)).a()) {
                a aVar2 = (a) this.f4363c.get(size);
                if (e.f4369j.a().isLoggable(Level.FINE)) {
                    b.c(aVar2, this, "canceled");
                }
                this.f4363c.remove(size);
                z6 = true;
            }
        }
        return z6;
    }

    public final a c() {
        return this.f4362b;
    }

    public final boolean d() {
        return this.f4364d;
    }

    public final List e() {
        return this.f4363c;
    }

    public final String f() {
        return this.f4366f;
    }

    public final boolean g() {
        return this.f4361a;
    }

    public final e h() {
        return this.f4365e;
    }

    public final void i(a aVar, long j7) {
        k.f(aVar, "task");
        synchronized (this.f4365e) {
            if (!this.f4361a) {
                if (k(aVar, j7, false)) {
                    this.f4365e.h(this);
                }
                u uVar = u.f19985a;
            } else if (aVar.a()) {
                if (e.f4369j.a().isLoggable(Level.FINE)) {
                    b.c(aVar, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (e.f4369j.a().isLoggable(Level.FINE)) {
                    b.c(aVar, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean k(a aVar, long j7, boolean z6) {
        StringBuilder sb;
        String str;
        k.f(aVar, "task");
        aVar.e(this);
        long jNanoTime = this.f4365e.g().nanoTime();
        long j8 = jNanoTime + j7;
        int iIndexOf = this.f4363c.indexOf(aVar);
        if (iIndexOf != -1) {
            if (aVar.c() <= j8) {
                if (e.f4369j.a().isLoggable(Level.FINE)) {
                    b.c(aVar, this, "already scheduled");
                }
                return false;
            }
            this.f4363c.remove(iIndexOf);
        }
        aVar.g(j8);
        if (e.f4369j.a().isLoggable(Level.FINE)) {
            if (z6) {
                sb = new StringBuilder();
                str = "run again after ";
            } else {
                sb = new StringBuilder();
                str = "scheduled after ";
            }
            sb.append(str);
            sb.append(b.b(j8 - jNanoTime));
            b.c(aVar, this, sb.toString());
        }
        Iterator it = this.f4363c.iterator();
        int size = 0;
        while (true) {
            if (!it.hasNext()) {
                size = -1;
                break;
            }
            if (((a) it.next()).c() - jNanoTime > j7) {
                break;
            }
            size++;
        }
        if (size == -1) {
            size = this.f4363c.size();
        }
        this.f4363c.add(size, aVar);
        return size == 0;
    }

    public final void l(a aVar) {
        this.f4362b = aVar;
    }

    public final void m(boolean z6) {
        this.f4364d = z6;
    }

    public final void n() {
        if (U5.c.f3990h && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            k.e(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        synchronized (this.f4365e) {
            try {
                this.f4361a = true;
                if (b()) {
                    this.f4365e.h(this);
                }
                u uVar = u.f19985a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        return this.f4366f;
    }
}
