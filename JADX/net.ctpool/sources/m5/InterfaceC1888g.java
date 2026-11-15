package m5;

import m5.InterfaceC1886e;
import v5.p;
import w5.k;
import w5.l;

/* JADX INFO: renamed from: m5.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC1888g {

    /* JADX INFO: renamed from: m5.g$a */
    public static final class a {

        /* JADX INFO: renamed from: m5.g$a$a, reason: collision with other inner class name */
        static final class C0303a extends l implements p {

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public static final C0303a f21266m = new C0303a();

            C0303a() {
                super(2);
            }

            @Override // v5.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC1888g m(InterfaceC1888g interfaceC1888g, b bVar) {
                C1884c c1884c;
                k.f(interfaceC1888g, "acc");
                k.f(bVar, "element");
                InterfaceC1888g interfaceC1888gH0 = interfaceC1888g.h0(bVar.getKey());
                C1889h c1889h = C1889h.f21267m;
                if (interfaceC1888gH0 == c1889h) {
                    return bVar;
                }
                InterfaceC1886e.b bVar2 = InterfaceC1886e.f21264l;
                InterfaceC1886e interfaceC1886e = (InterfaceC1886e) interfaceC1888gH0.b(bVar2);
                if (interfaceC1886e == null) {
                    c1884c = new C1884c(interfaceC1888gH0, bVar);
                } else {
                    InterfaceC1888g interfaceC1888gH02 = interfaceC1888gH0.h0(bVar2);
                    if (interfaceC1888gH02 == c1889h) {
                        return new C1884c(bVar, interfaceC1886e);
                    }
                    c1884c = new C1884c(new C1884c(interfaceC1888gH02, bVar), interfaceC1886e);
                }
                return c1884c;
            }
        }

        public static InterfaceC1888g a(InterfaceC1888g interfaceC1888g, InterfaceC1888g interfaceC1888g2) {
            k.f(interfaceC1888g2, "context");
            return interfaceC1888g2 == C1889h.f21267m ? interfaceC1888g : (InterfaceC1888g) interfaceC1888g2.j(interfaceC1888g, C0303a.f21266m);
        }
    }

    /* JADX INFO: renamed from: m5.g$b */
    public interface b extends InterfaceC1888g {

        /* JADX INFO: renamed from: m5.g$b$a */
        public static final class a {
            public static Object a(b bVar, Object obj, p pVar) {
                k.f(pVar, "operation");
                return pVar.m(obj, bVar);
            }

            public static b b(b bVar, c cVar) {
                k.f(cVar, "key");
                if (!k.b(bVar.getKey(), cVar)) {
                    return null;
                }
                k.d(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return bVar;
            }

            public static InterfaceC1888g c(b bVar, c cVar) {
                k.f(cVar, "key");
                return k.b(bVar.getKey(), cVar) ? C1889h.f21267m : bVar;
            }

            public static InterfaceC1888g d(b bVar, InterfaceC1888g interfaceC1888g) {
                k.f(interfaceC1888g, "context");
                return a.a(bVar, interfaceC1888g);
            }
        }

        @Override // m5.InterfaceC1888g
        b b(c cVar);

        c getKey();
    }

    /* JADX INFO: renamed from: m5.g$c */
    public interface c {
    }

    b b(c cVar);

    InterfaceC1888g h0(c cVar);

    Object j(Object obj, p pVar);

    InterfaceC1888g o(InterfaceC1888g interfaceC1888g);
}
