package H5;

import M5.AbstractC0437n;
import M5.C0433j;
import M5.C0436m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m5.AbstractC1882a;
import m5.AbstractC1883b;
import m5.InterfaceC1885d;
import m5.InterfaceC1886e;
import m5.InterfaceC1888g;

/* JADX INFO: loaded from: classes2.dex */
public abstract class F extends AbstractC1882a implements InterfaceC1886e {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f1384n = new a(null);

    public static final class a extends AbstractC1883b {

        /* JADX INFO: renamed from: H5.F$a$a, reason: collision with other inner class name */
        static final class C0024a extends w5.l implements v5.l {

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public static final C0024a f1385m = new C0024a();

            C0024a() {
                super(1);
            }

            @Override // v5.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final F i(InterfaceC1888g.b bVar) {
                if (bVar instanceof F) {
                    return (F) bVar;
                }
                return null;
            }
        }

        private a() {
            super(InterfaceC1886e.f21264l, C0024a.f1385m);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public F() {
        super(InterfaceC1886e.f21264l);
    }

    @Override // m5.InterfaceC1886e
    public final InterfaceC1885d J(InterfaceC1885d interfaceC1885d) {
        return new C0433j(this, interfaceC1885d);
    }

    public F R0(int i7) {
        AbstractC0437n.a(i7);
        return new C0436m(this, i7);
    }

    public abstract void a(InterfaceC1888g interfaceC1888g, Runnable runnable);

    @Override // m5.AbstractC1882a, m5.InterfaceC1888g.b, m5.InterfaceC1888g
    public InterfaceC1888g.b b(InterfaceC1888g.c cVar) {
        return InterfaceC1886e.a.a(this, cVar);
    }

    public boolean g(InterfaceC1888g interfaceC1888g) {
        return true;
    }

    @Override // m5.AbstractC1882a, m5.InterfaceC1888g
    public InterfaceC1888g h0(InterfaceC1888g.c cVar) {
        return InterfaceC1886e.a.b(this, cVar);
    }

    public String toString() {
        return M.a(this) + '@' + M.b(this);
    }

    @Override // m5.InterfaceC1886e
    public final void z(InterfaceC1885d interfaceC1885d) {
        w5.k.d(interfaceC1885d, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((C0433j) interfaceC1885d).u();
    }
}
