package androidx.room;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class C implements Executor {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Executor f8893m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ArrayDeque f8894n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Runnable f8895o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Object f8896p;

    public C(Executor executor) {
        w5.k.f(executor, "executor");
        this.f8893m = executor;
        this.f8894n = new ArrayDeque();
        this.f8896p = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Runnable runnable, C c7) {
        w5.k.f(runnable, "$command");
        w5.k.f(c7, "this$0");
        try {
            runnable.run();
        } finally {
            c7.c();
        }
    }

    public final void c() {
        synchronized (this.f8896p) {
            try {
                Object objPoll = this.f8894n.poll();
                Runnable runnable = (Runnable) objPoll;
                this.f8895o = runnable;
                if (objPoll != null) {
                    this.f8893m.execute(runnable);
                }
                i5.u uVar = i5.u.f19985a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(final Runnable runnable) {
        w5.k.f(runnable, "command");
        synchronized (this.f8896p) {
            try {
                this.f8894n.offer(new Runnable() { // from class: androidx.room.B
                    @Override // java.lang.Runnable
                    public final void run() {
                        C.b(runnable, this);
                    }
                });
                if (this.f8895o == null) {
                    c();
                }
                i5.u uVar = i5.u.f19985a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
