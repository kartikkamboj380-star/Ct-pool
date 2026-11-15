package H5;

import java.util.concurrent.CancellationException;
import m5.InterfaceC1888g;

/* JADX INFO: loaded from: classes2.dex */
abstract /* synthetic */ class v0 {
    public static final InterfaceC0421x a(InterfaceC0415q0 interfaceC0415q0) {
        return new t0(interfaceC0415q0);
    }

    public static /* synthetic */ InterfaceC0421x b(InterfaceC0415q0 interfaceC0415q0, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            interfaceC0415q0 = null;
        }
        return u0.a(interfaceC0415q0);
    }

    public static final void c(InterfaceC1888g interfaceC1888g, CancellationException cancellationException) {
        InterfaceC0415q0 interfaceC0415q0 = (InterfaceC0415q0) interfaceC1888g.b(InterfaceC0415q0.f1444b);
        if (interfaceC0415q0 != null) {
            interfaceC0415q0.M0(cancellationException);
        }
    }

    public static final void d(InterfaceC0415q0 interfaceC0415q0) {
        if (!interfaceC0415q0.d()) {
            throw interfaceC0415q0.w();
        }
    }

    public static final void e(InterfaceC1888g interfaceC1888g) {
        InterfaceC0415q0 interfaceC0415q0 = (InterfaceC0415q0) interfaceC1888g.b(InterfaceC0415q0.f1444b);
        if (interfaceC0415q0 != null) {
            u0.d(interfaceC0415q0);
        }
    }
}
