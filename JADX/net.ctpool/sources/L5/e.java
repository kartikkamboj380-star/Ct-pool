package L5;

import m5.InterfaceC1888g;
import v5.p;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements InterfaceC1888g {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Throwable f1998m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ InterfaceC1888g f1999n;

    public e(Throwable th, InterfaceC1888g interfaceC1888g) {
        this.f1998m = th;
        this.f1999n = interfaceC1888g;
    }

    @Override // m5.InterfaceC1888g
    public InterfaceC1888g.b b(InterfaceC1888g.c cVar) {
        return this.f1999n.b(cVar);
    }

    @Override // m5.InterfaceC1888g
    public InterfaceC1888g h0(InterfaceC1888g.c cVar) {
        return this.f1999n.h0(cVar);
    }

    @Override // m5.InterfaceC1888g
    public Object j(Object obj, p pVar) {
        return this.f1999n.j(obj, pVar);
    }

    @Override // m5.InterfaceC1888g
    public InterfaceC1888g o(InterfaceC1888g interfaceC1888g) {
        return this.f1999n.o(interfaceC1888g);
    }
}
