package H5;

import m5.C1889h;
import m5.InterfaceC1885d;
import m5.InterfaceC1886e;
import m5.InterfaceC1888g;
import o5.InterfaceC1950e;

/* JADX INFO: loaded from: classes2.dex */
public abstract class E {

    static final class a extends w5.l implements v5.p {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final a f1380m = new a();

        a() {
            super(2);
        }

        @Override // v5.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC1888g m(InterfaceC1888g interfaceC1888g, InterfaceC1888g.b bVar) {
            return interfaceC1888g.o(bVar);
        }
    }

    static final class b extends w5.l implements v5.p {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ w5.v f1381m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f1382n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(w5.v vVar, boolean z6) {
            super(2);
            this.f1381m = vVar;
            this.f1382n = z6;
        }

        @Override // v5.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC1888g m(InterfaceC1888g interfaceC1888g, InterfaceC1888g.b bVar) {
            return interfaceC1888g.o(bVar);
        }
    }

    static final class c extends w5.l implements v5.p {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final c f1383m = new c();

        c() {
            super(2);
        }

        public final Boolean a(boolean z6, InterfaceC1888g.b bVar) {
            return Boolean.valueOf(z6);
        }

        @Override // v5.p
        public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
            return a(((Boolean) obj).booleanValue(), (InterfaceC1888g.b) obj2);
        }
    }

    private static final InterfaceC1888g a(InterfaceC1888g interfaceC1888g, InterfaceC1888g interfaceC1888g2, boolean z6) {
        boolean zC = c(interfaceC1888g);
        boolean zC2 = c(interfaceC1888g2);
        if (!zC && !zC2) {
            return interfaceC1888g.o(interfaceC1888g2);
        }
        w5.v vVar = new w5.v();
        vVar.f22740m = interfaceC1888g2;
        C1889h c1889h = C1889h.f21267m;
        InterfaceC1888g interfaceC1888g3 = (InterfaceC1888g) interfaceC1888g.j(c1889h, new b(vVar, z6));
        if (zC2) {
            vVar.f22740m = ((InterfaceC1888g) vVar.f22740m).j(c1889h, a.f1380m);
        }
        return interfaceC1888g3.o((InterfaceC1888g) vVar.f22740m);
    }

    public static final String b(InterfaceC1888g interfaceC1888g) {
        return null;
    }

    private static final boolean c(InterfaceC1888g interfaceC1888g) {
        return ((Boolean) interfaceC1888g.j(Boolean.FALSE, c.f1383m)).booleanValue();
    }

    public static final InterfaceC1888g d(I i7, InterfaceC1888g interfaceC1888g) {
        InterfaceC1888g interfaceC1888gA = a(i7.i(), interfaceC1888g, true);
        return (interfaceC1888gA == W.a() || interfaceC1888gA.b(InterfaceC1886e.f21264l) != null) ? interfaceC1888gA : interfaceC1888gA.o(W.a());
    }

    public static final InterfaceC1888g e(InterfaceC1888g interfaceC1888g, InterfaceC1888g interfaceC1888g2) {
        return !c(interfaceC1888g2) ? interfaceC1888g.o(interfaceC1888g2) : a(interfaceC1888g, interfaceC1888g2, false);
    }

    public static final N0 f(InterfaceC1950e interfaceC1950e) {
        while (!(interfaceC1950e instanceof T) && (interfaceC1950e = interfaceC1950e.g()) != null) {
            if (interfaceC1950e instanceof N0) {
                return (N0) interfaceC1950e;
            }
        }
        return null;
    }

    public static final N0 g(InterfaceC1885d interfaceC1885d, InterfaceC1888g interfaceC1888g, Object obj) {
        if (!(interfaceC1885d instanceof InterfaceC1950e) || interfaceC1888g.b(O0.f1403m) == null) {
            return null;
        }
        N0 n0F = f((InterfaceC1950e) interfaceC1885d);
        if (n0F != null) {
            n0F.O0(interfaceC1888g, obj);
        }
        return n0F;
    }
}
