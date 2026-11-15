package H5;

import M5.AbstractC0431h;
import i5.AbstractC1744a;
import m5.InterfaceC1888g;

/* JADX INFO: loaded from: classes2.dex */
public abstract class H {
    public static final void a(InterfaceC1888g interfaceC1888g, Throwable th) {
        try {
            G g7 = (G) interfaceC1888g.b(G.f1386a);
            if (g7 != null) {
                g7.B(interfaceC1888g, th);
            } else {
                AbstractC0431h.a(interfaceC1888g, th);
            }
        } catch (Throwable th2) {
            AbstractC0431h.a(interfaceC1888g, b(th, th2));
        }
    }

    public static final Throwable b(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        AbstractC1744a.a(runtimeException, th);
        return runtimeException;
    }
}
