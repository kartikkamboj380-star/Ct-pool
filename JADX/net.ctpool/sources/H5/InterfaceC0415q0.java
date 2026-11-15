package H5;

import java.util.concurrent.CancellationException;
import m5.InterfaceC1888g;

/* JADX INFO: renamed from: H5.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC0415q0 extends InterfaceC1888g.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f1444b = b.f1445m;

    /* JADX INFO: renamed from: H5.q0$a */
    public static final class a {
        public static Object a(InterfaceC0415q0 interfaceC0415q0, Object obj, v5.p pVar) {
            return InterfaceC1888g.b.a.a(interfaceC0415q0, obj, pVar);
        }

        public static InterfaceC1888g.b b(InterfaceC0415q0 interfaceC0415q0, InterfaceC1888g.c cVar) {
            return InterfaceC1888g.b.a.b(interfaceC0415q0, cVar);
        }

        public static /* synthetic */ X c(InterfaceC0415q0 interfaceC0415q0, boolean z6, boolean z7, v5.l lVar, int i7, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
            }
            if ((i7 & 1) != 0) {
                z6 = false;
            }
            if ((i7 & 2) != 0) {
                z7 = true;
            }
            return interfaceC0415q0.W(z6, z7, lVar);
        }

        public static InterfaceC1888g d(InterfaceC0415q0 interfaceC0415q0, InterfaceC1888g.c cVar) {
            return InterfaceC1888g.b.a.c(interfaceC0415q0, cVar);
        }

        public static InterfaceC1888g e(InterfaceC0415q0 interfaceC0415q0, InterfaceC1888g interfaceC1888g) {
            return InterfaceC1888g.b.a.d(interfaceC0415q0, interfaceC1888g);
        }
    }

    /* JADX INFO: renamed from: H5.q0$b */
    public static final class b implements InterfaceC1888g.c {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        static final /* synthetic */ b f1445m = new b();

        private b() {
        }
    }

    X D0(v5.l lVar);

    void M0(CancellationException cancellationException);

    X W(boolean z6, boolean z7, v5.l lVar);

    boolean d();

    InterfaceC0415q0 getParent();

    boolean isCancelled();

    r l(InterfaceC0417t interfaceC0417t);

    boolean start();

    CancellationException w();
}
