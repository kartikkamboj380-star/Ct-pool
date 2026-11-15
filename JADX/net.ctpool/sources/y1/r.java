package y1;

import android.os.Process;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class r implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f23106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f23107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f23108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicInteger f23109d;

    public r(int i7, String str, boolean z6) {
        w5.k.f(str, "prefix");
        this.f23106a = i7;
        this.f23107b = str;
        this.f23108c = z6;
        this.f23109d = new AtomicInteger(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(r rVar, Runnable runnable) {
        w5.k.f(rVar, "this$0");
        w5.k.f(runnable, "$runnable");
        try {
            Process.setThreadPriority(rVar.f23106a);
        } catch (Throwable unused) {
        }
        runnable.run();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        String str;
        w5.k.f(runnable, "runnable");
        Runnable runnable2 = new Runnable() { // from class: y1.q
            @Override // java.lang.Runnable
            public final void run() {
                r.b(this.f23104m, runnable);
            }
        };
        if (this.f23108c) {
            str = this.f23107b + "-" + this.f23109d.getAndIncrement();
        } else {
            str = this.f23107b;
        }
        return new Thread(runnable2, str);
    }
}
