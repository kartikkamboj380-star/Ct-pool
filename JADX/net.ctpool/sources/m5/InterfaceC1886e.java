package m5;

import m5.InterfaceC1888g;
import w5.k;

/* JADX INFO: renamed from: m5.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC1886e extends InterfaceC1888g.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b f21264l = b.f21265m;

    /* JADX INFO: renamed from: m5.e$a */
    public static final class a {
        public static InterfaceC1888g.b a(InterfaceC1886e interfaceC1886e, InterfaceC1888g.c cVar) {
            k.f(cVar, "key");
            if (!(cVar instanceof AbstractC1883b)) {
                if (InterfaceC1886e.f21264l != cVar) {
                    return null;
                }
                k.d(interfaceC1886e, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return interfaceC1886e;
            }
            AbstractC1883b abstractC1883b = (AbstractC1883b) cVar;
            if (!abstractC1883b.a(interfaceC1886e.getKey())) {
                return null;
            }
            InterfaceC1888g.b bVarB = abstractC1883b.b(interfaceC1886e);
            if (bVarB instanceof InterfaceC1888g.b) {
                return bVarB;
            }
            return null;
        }

        public static InterfaceC1888g b(InterfaceC1886e interfaceC1886e, InterfaceC1888g.c cVar) {
            k.f(cVar, "key");
            if (!(cVar instanceof AbstractC1883b)) {
                return InterfaceC1886e.f21264l == cVar ? C1889h.f21267m : interfaceC1886e;
            }
            AbstractC1883b abstractC1883b = (AbstractC1883b) cVar;
            return (!abstractC1883b.a(interfaceC1886e.getKey()) || abstractC1883b.b(interfaceC1886e) == null) ? interfaceC1886e : C1889h.f21267m;
        }
    }

    /* JADX INFO: renamed from: m5.e$b */
    public static final class b implements InterfaceC1888g.c {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        static final /* synthetic */ b f21265m = new b();

        private b() {
        }
    }

    InterfaceC1885d J(InterfaceC1885d interfaceC1885d);

    void z(InterfaceC1885d interfaceC1885d);
}
