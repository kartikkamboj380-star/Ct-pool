package H5;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: H5.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0411o0 extends s0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f1439r = AtomicIntegerFieldUpdater.newUpdater(C0411o0.class, "_invoked");
    private volatile int _invoked;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final v5.l f1440q;

    public C0411o0(v5.l lVar) {
        this.f1440q = lVar;
    }

    @Override // v5.l
    public /* bridge */ /* synthetic */ Object i(Object obj) {
        y((Throwable) obj);
        return i5.u.f19985a;
    }

    @Override // H5.B
    public void y(Throwable th) {
        if (f1439r.compareAndSet(this, 0, 1)) {
            this.f1440q.i(th);
        }
    }
}
