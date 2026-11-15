package M5;

import H5.K0;
import m5.InterfaceC1888g;

/* JADX INFO: loaded from: classes2.dex */
public abstract class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final F f2068a = new F("NO_THREAD_ELEMENTS");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final v5.p f2069b = a.f2072m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final v5.p f2070c = b.f2073m;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final v5.p f2071d = c.f2074m;

    static final class a extends w5.l implements v5.p {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final a f2072m = new a();

        a() {
            super(2);
        }

        @Override // v5.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object m(Object obj, InterfaceC1888g.b bVar) {
            if (!(bVar instanceof K0)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int iIntValue = num != null ? num.intValue() : 1;
            return iIntValue == 0 ? bVar : Integer.valueOf(iIntValue + 1);
        }
    }

    static final class b extends w5.l implements v5.p {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final b f2073m = new b();

        b() {
            super(2);
        }

        @Override // v5.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final K0 m(K0 k02, InterfaceC1888g.b bVar) {
            if (k02 != null) {
                return k02;
            }
            if (bVar instanceof K0) {
                return (K0) bVar;
            }
            return null;
        }
    }

    static final class c extends w5.l implements v5.p {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final c f2074m = new c();

        c() {
            super(2);
        }

        @Override // v5.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final N m(N n7, InterfaceC1888g.b bVar) {
            if (bVar instanceof K0) {
                K0 k02 = (K0) bVar;
                n7.a(k02, k02.H0(n7.f2075a));
            }
            return n7;
        }
    }

    public static final void a(InterfaceC1888g interfaceC1888g, Object obj) {
        if (obj == f2068a) {
            return;
        }
        if (obj instanceof N) {
            ((N) obj).b(interfaceC1888g);
            return;
        }
        Object objJ = interfaceC1888g.j(null, f2070c);
        w5.k.d(objJ, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((K0) objJ).n(interfaceC1888g, obj);
    }

    public static final Object b(InterfaceC1888g interfaceC1888g) {
        Object objJ = interfaceC1888g.j(0, f2069b);
        w5.k.c(objJ);
        return objJ;
    }

    public static final Object c(InterfaceC1888g interfaceC1888g, Object obj) {
        if (obj == null) {
            obj = b(interfaceC1888g);
        }
        if (obj == 0) {
            return f2068a;
        }
        if (obj instanceof Integer) {
            return interfaceC1888g.j(new N(interfaceC1888g, ((Number) obj).intValue()), f2071d);
        }
        w5.k.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((K0) obj).H0(interfaceC1888g);
    }
}
