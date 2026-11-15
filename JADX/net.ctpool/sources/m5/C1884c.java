package m5;

import java.io.Serializable;
import m5.InterfaceC1888g;
import v5.p;
import w5.k;
import w5.l;

/* JADX INFO: renamed from: m5.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1884c implements InterfaceC1888g, Serializable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final InterfaceC1888g f21261m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InterfaceC1888g.b f21262n;

    /* JADX INFO: renamed from: m5.c$a */
    static final class a extends l implements p {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final a f21263m = new a();

        a() {
            super(2);
        }

        @Override // v5.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String m(String str, InterfaceC1888g.b bVar) {
            k.f(str, "acc");
            k.f(bVar, "element");
            if (str.length() == 0) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }

    public C1884c(InterfaceC1888g interfaceC1888g, InterfaceC1888g.b bVar) {
        k.f(interfaceC1888g, "left");
        k.f(bVar, "element");
        this.f21261m = interfaceC1888g;
        this.f21262n = bVar;
    }

    private final boolean a(InterfaceC1888g.b bVar) {
        return k.b(b(bVar.getKey()), bVar);
    }

    private final boolean c(C1884c c1884c) {
        while (a(c1884c.f21262n)) {
            InterfaceC1888g interfaceC1888g = c1884c.f21261m;
            if (!(interfaceC1888g instanceof C1884c)) {
                k.d(interfaceC1888g, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return a((InterfaceC1888g.b) interfaceC1888g);
            }
            c1884c = (C1884c) interfaceC1888g;
        }
        return false;
    }

    private final int g() {
        int i7 = 2;
        C1884c c1884c = this;
        while (true) {
            InterfaceC1888g interfaceC1888g = c1884c.f21261m;
            c1884c = interfaceC1888g instanceof C1884c ? (C1884c) interfaceC1888g : null;
            if (c1884c == null) {
                return i7;
            }
            i7++;
        }
    }

    @Override // m5.InterfaceC1888g
    public InterfaceC1888g.b b(InterfaceC1888g.c cVar) {
        k.f(cVar, "key");
        C1884c c1884c = this;
        while (true) {
            InterfaceC1888g.b bVarB = c1884c.f21262n.b(cVar);
            if (bVarB != null) {
                return bVarB;
            }
            InterfaceC1888g interfaceC1888g = c1884c.f21261m;
            if (!(interfaceC1888g instanceof C1884c)) {
                return interfaceC1888g.b(cVar);
            }
            c1884c = (C1884c) interfaceC1888g;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1884c) {
                C1884c c1884c = (C1884c) obj;
                if (c1884c.g() != g() || !c1884c.c(this)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // m5.InterfaceC1888g
    public InterfaceC1888g h0(InterfaceC1888g.c cVar) {
        k.f(cVar, "key");
        if (this.f21262n.b(cVar) != null) {
            return this.f21261m;
        }
        InterfaceC1888g interfaceC1888gH0 = this.f21261m.h0(cVar);
        return interfaceC1888gH0 == this.f21261m ? this : interfaceC1888gH0 == C1889h.f21267m ? this.f21262n : new C1884c(interfaceC1888gH0, this.f21262n);
    }

    public int hashCode() {
        return this.f21261m.hashCode() + this.f21262n.hashCode();
    }

    @Override // m5.InterfaceC1888g
    public Object j(Object obj, p pVar) {
        k.f(pVar, "operation");
        return pVar.m(this.f21261m.j(obj, pVar), this.f21262n);
    }

    @Override // m5.InterfaceC1888g
    public InterfaceC1888g o(InterfaceC1888g interfaceC1888g) {
        return InterfaceC1888g.a.a(this, interfaceC1888g);
    }

    public String toString() {
        return '[' + ((String) j("", a.f21263m)) + ']';
    }
}
