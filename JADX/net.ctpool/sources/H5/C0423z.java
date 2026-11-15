package H5;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: H5.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C0423z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f1475b = AtomicIntegerFieldUpdater.newUpdater(C0423z.class, "_handled");
    private volatile int _handled;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f1476a;

    public C0423z(Throwable th, boolean z6) {
        this.f1476a = th;
        this._handled = z6 ? 1 : 0;
    }

    public final boolean a() {
        return f1475b.get(this) != 0;
    }

    public final boolean b() {
        return f1475b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return M.a(this) + '[' + this.f1476a + ']';
    }

    public /* synthetic */ C0423z(Throwable th, boolean z6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(th, (i7 & 2) != 0 ? false : z6);
    }
}
