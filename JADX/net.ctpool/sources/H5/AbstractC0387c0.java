package H5;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: H5.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0387c0 extends AbstractC0383a0 {
    protected abstract Thread q1();

    protected final void r1() {
        Thread threadQ1 = q1();
        if (Thread.currentThread() != threadQ1) {
            AbstractC0386c.a();
            LockSupport.unpark(threadQ1);
        }
    }
}
