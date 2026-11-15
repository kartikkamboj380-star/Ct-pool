package z3;

import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
final class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f23273a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Queue f23274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f23275c;

    K() {
    }

    public final void a(J j7) {
        synchronized (this.f23273a) {
            try {
                if (this.f23274b == null) {
                    this.f23274b = new ArrayDeque();
                }
                this.f23274b.add(j7);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(AbstractC2272l abstractC2272l) {
        J j7;
        synchronized (this.f23273a) {
            if (this.f23274b != null && !this.f23275c) {
                this.f23275c = true;
                while (true) {
                    synchronized (this.f23273a) {
                        try {
                            j7 = (J) this.f23274b.poll();
                            if (j7 == null) {
                                this.f23275c = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    j7.d(abstractC2272l);
                }
            }
        }
    }
}
