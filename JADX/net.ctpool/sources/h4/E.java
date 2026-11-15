package h4;

import e4.C1629g;
import e4.InterfaceC1623a;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
class E implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f19660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p4.j f19661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f19662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC1623a f19663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f19664e = new AtomicBoolean(false);

    interface a {
        void a(p4.j jVar, Thread thread, Throwable th);
    }

    public E(a aVar, p4.j jVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, InterfaceC1623a interfaceC1623a) {
        this.f19660a = aVar;
        this.f19661b = jVar;
        this.f19662c = uncaughtExceptionHandler;
        this.f19663d = interfaceC1623a;
    }

    private boolean b(Thread thread, Throwable th) {
        if (thread == null) {
            C1629g.f().d("Crashlytics will not record uncaught exception; null thread");
            return false;
        }
        if (th == null) {
            C1629g.f().d("Crashlytics will not record uncaught exception; null throwable");
            return false;
        }
        if (!this.f19663d.b()) {
            return true;
        }
        C1629g.f().b("Crashlytics will not record uncaught exception; native crash exists for session.");
        return false;
    }

    boolean a() {
        return this.f19664e.get();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void uncaughtException(Thread thread, Throwable th) {
        this.f19664e.set(true);
        try {
            try {
                if (b(thread, th)) {
                    this.f19660a.a(this.f19661b, thread, th);
                } else {
                    C1629g.f().b("Uncaught exception will not be recorded by Crashlytics.");
                }
            } catch (Exception e7) {
                C1629g.f().e("An error occurred in the uncaught exception handler", e7);
                if (this.f19662c != null) {
                }
            }
            if (this.f19662c != null) {
                C1629g.f().b("Completed exception processing. Invoking default exception handler.");
                this.f19662c.uncaughtException(thread, th);
            } else {
                C1629g.f().b("Completed exception processing, but no default exception handler.");
                System.exit(1);
            }
            this.f19664e.set(false);
        } catch (Throwable th2) {
            if (this.f19662c != null) {
                C1629g.f().b("Completed exception processing. Invoking default exception handler.");
                this.f19662c.uncaughtException(thread, th);
            } else {
                C1629g.f().b("Completed exception processing, but no default exception handler.");
                System.exit(1);
            }
            this.f19664e.set(false);
            throw th2;
        }
    }
}
