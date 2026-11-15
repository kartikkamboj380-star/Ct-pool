package m5;

import m5.InterfaceC1888g;
import v5.p;
import w5.k;

/* JADX INFO: renamed from: m5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1882a implements InterfaceC1888g.b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final InterfaceC1888g.c f21258m;

    public AbstractC1882a(InterfaceC1888g.c cVar) {
        k.f(cVar, "key");
        this.f21258m = cVar;
    }

    @Override // m5.InterfaceC1888g.b, m5.InterfaceC1888g
    public InterfaceC1888g.b b(InterfaceC1888g.c cVar) {
        return InterfaceC1888g.b.a.b(this, cVar);
    }

    @Override // m5.InterfaceC1888g.b
    public InterfaceC1888g.c getKey() {
        return this.f21258m;
    }

    @Override // m5.InterfaceC1888g
    public InterfaceC1888g h0(InterfaceC1888g.c cVar) {
        return InterfaceC1888g.b.a.c(this, cVar);
    }

    @Override // m5.InterfaceC1888g
    public Object j(Object obj, p pVar) {
        return InterfaceC1888g.b.a.a(this, obj, pVar);
    }

    @Override // m5.InterfaceC1888g
    public InterfaceC1888g o(InterfaceC1888g interfaceC1888g) {
        return InterfaceC1888g.b.a.d(this, interfaceC1888g);
    }
}
