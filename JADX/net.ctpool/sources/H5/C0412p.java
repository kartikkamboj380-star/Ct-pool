package H5;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import m5.InterfaceC1885d;

/* JADX INFO: renamed from: H5.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0412p extends C0423z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f1441c = AtomicIntegerFieldUpdater.newUpdater(C0412p.class, "_resumed");
    private volatile int _resumed;

    public C0412p(InterfaceC1885d interfaceC1885d, Throwable th, boolean z6) {
        if (th == null) {
            th = new CancellationException("Continuation " + interfaceC1885d + " was cancelled normally");
        }
        super(th, z6);
        this._resumed = 0;
    }

    public final boolean c() {
        return f1441c.compareAndSet(this, 0, 1);
    }
}
