package H5;

import m5.InterfaceC1885d;
import m5.InterfaceC1888g;
import n5.AbstractC1930b;

/* JADX INFO: loaded from: classes2.dex */
final class z0 extends Q {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final InterfaceC1885d f1477p;

    public z0(InterfaceC1888g interfaceC1888g, v5.p pVar) {
        super(interfaceC1888g, false);
        this.f1477p = AbstractC1930b.a(pVar, this, this);
    }

    @Override // H5.x0
    protected void q0() throws Throwable {
        N5.a.b(this.f1477p, this);
    }
}
