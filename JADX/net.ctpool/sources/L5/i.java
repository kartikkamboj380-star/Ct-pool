package L5;

import H5.u0;
import i5.m;
import i5.u;
import m5.C1889h;
import m5.InterfaceC1885d;
import m5.InterfaceC1888g;
import n5.AbstractC1930b;
import o5.AbstractC1949d;
import o5.AbstractC1953h;
import o5.InterfaceC1950e;
import v5.p;
import v5.q;
import w5.l;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends AbstractC1949d implements K5.c, InterfaceC1950e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final K5.c f2005p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final InterfaceC1888g f2006q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f2007r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private InterfaceC1888g f2008s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private InterfaceC1885d f2009t;

    static final class a extends l implements p {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final a f2010m = new a();

        a() {
            super(2);
        }

        public final Integer a(int i7, InterfaceC1888g.b bVar) {
            return Integer.valueOf(i7 + 1);
        }

        @Override // v5.p
        public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
            return a(((Number) obj).intValue(), (InterfaceC1888g.b) obj2);
        }
    }

    public i(K5.c cVar, InterfaceC1888g interfaceC1888g) {
        super(g.f2000m, C1889h.f21267m);
        this.f2005p = cVar;
        this.f2006q = interfaceC1888g;
        this.f2007r = ((Number) interfaceC1888g.j(0, a.f2010m)).intValue();
    }

    private final void v(InterfaceC1888g interfaceC1888g, InterfaceC1888g interfaceC1888g2, Object obj) {
        if (interfaceC1888g2 instanceof e) {
            x((e) interfaceC1888g2, obj);
        }
        k.a(this, interfaceC1888g);
    }

    private final Object w(InterfaceC1885d interfaceC1885d, Object obj) {
        InterfaceC1888g interfaceC1888gA = interfaceC1885d.a();
        u0.e(interfaceC1888gA);
        InterfaceC1888g interfaceC1888g = this.f2008s;
        if (interfaceC1888g != interfaceC1888gA) {
            v(interfaceC1888gA, interfaceC1888g, obj);
            this.f2008s = interfaceC1888gA;
        }
        this.f2009t = interfaceC1885d;
        q qVar = j.f2011a;
        K5.c cVar = this.f2005p;
        w5.k.d(cVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        w5.k.d(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object objE = qVar.e(cVar, obj, this);
        if (!w5.k.b(objE, AbstractC1930b.c())) {
            this.f2009t = null;
        }
        return objE;
    }

    private final void x(e eVar, Object obj) {
        throw new IllegalStateException(F5.g.f("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + eVar.f1998m + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    @Override // o5.AbstractC1949d, m5.InterfaceC1885d
    public InterfaceC1888g a() {
        InterfaceC1888g interfaceC1888g = this.f2008s;
        return interfaceC1888g == null ? C1889h.f21267m : interfaceC1888g;
    }

    @Override // K5.c
    public Object b(Object obj, InterfaceC1885d interfaceC1885d) {
        try {
            Object objW = w(interfaceC1885d, obj);
            if (objW == AbstractC1930b.c()) {
                AbstractC1953h.c(interfaceC1885d);
            }
            return objW == AbstractC1930b.c() ? objW : u.f19985a;
        } catch (Throwable th) {
            this.f2008s = new e(th, interfaceC1885d.a());
            throw th;
        }
    }

    @Override // o5.AbstractC1946a, o5.InterfaceC1950e
    public InterfaceC1950e g() {
        InterfaceC1885d interfaceC1885d = this.f2009t;
        if (interfaceC1885d instanceof InterfaceC1950e) {
            return (InterfaceC1950e) interfaceC1885d;
        }
        return null;
    }

    @Override // o5.AbstractC1946a
    public StackTraceElement n() {
        return null;
    }

    @Override // o5.AbstractC1946a
    public Object s(Object obj) {
        Throwable thB = m.b(obj);
        if (thB != null) {
            this.f2008s = new e(thB, a());
        }
        InterfaceC1885d interfaceC1885d = this.f2009t;
        if (interfaceC1885d != null) {
            interfaceC1885d.h(obj);
        }
        return AbstractC1930b.c();
    }

    @Override // o5.AbstractC1949d, o5.AbstractC1946a
    public void t() {
        super.t();
    }
}
