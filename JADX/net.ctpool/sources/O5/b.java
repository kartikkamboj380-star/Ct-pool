package O5;

import H5.AbstractC0395g0;
import H5.F;
import M5.G;
import M5.I;
import java.util.concurrent.Executor;
import m5.C1889h;
import m5.InterfaceC1888g;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends AbstractC0395g0 implements Executor {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final b f2522p = new b();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final F f2523q = m.f2543o.R0(I.e("kotlinx.coroutines.io.parallelism", C5.g.c(64, G.a()), 0, 0, 12, null));

    private b() {
    }

    @Override // H5.F
    public void a(InterfaceC1888g interfaceC1888g, Runnable runnable) {
        f2523q.a(interfaceC1888g, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        a(C1889h.f21267m, runnable);
    }

    @Override // H5.F
    public String toString() {
        return "Dispatchers.IO";
    }
}
