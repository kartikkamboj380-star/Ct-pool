package j;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: j.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1767a extends AbstractC1770d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile C1767a f20188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Executor f20189d = new ExecutorC0270a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Executor f20190e = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AbstractC1770d f20191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AbstractC1770d f20192b;

    /* JADX INFO: renamed from: j.a$a, reason: collision with other inner class name */
    static class ExecutorC0270a implements Executor {
        ExecutorC0270a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            C1767a.e().c(runnable);
        }
    }

    /* JADX INFO: renamed from: j.a$b */
    static class b implements Executor {
        b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            C1767a.e().a(runnable);
        }
    }

    private C1767a() {
        C1769c c1769c = new C1769c();
        this.f20192b = c1769c;
        this.f20191a = c1769c;
    }

    public static Executor d() {
        return f20190e;
    }

    public static C1767a e() {
        if (f20188c != null) {
            return f20188c;
        }
        synchronized (C1767a.class) {
            try {
                if (f20188c == null) {
                    f20188c = new C1767a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f20188c;
    }

    @Override // j.AbstractC1770d
    public void a(Runnable runnable) {
        this.f20191a.a(runnable);
    }

    @Override // j.AbstractC1770d
    public boolean b() {
        return this.f20191a.b();
    }

    @Override // j.AbstractC1770d
    public void c(Runnable runnable) {
        this.f20191a.c(runnable);
    }
}
