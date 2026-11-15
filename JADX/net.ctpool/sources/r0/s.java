package r0;

import androidx.work.impl.E;
import l0.l;

/* JADX INFO: loaded from: classes.dex */
public class s implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final E f22100m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final androidx.work.impl.o f22101n = new androidx.work.impl.o();

    public s(E e7) {
        this.f22100m = e7;
    }

    public l0.l a() {
        return this.f22101n;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f22100m.v().j().c();
            this.f22101n.a(l0.l.f21052a);
        } catch (Throwable th) {
            this.f22101n.a(new l.b.a(th));
        }
    }
}
