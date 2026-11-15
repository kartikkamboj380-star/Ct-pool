package H5;

import m5.InterfaceC1885d;
import n5.AbstractC1930b;

/* JADX INFO: renamed from: H5.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0419v extends x0 implements InterfaceC0418u {
    public C0419v(InterfaceC0415q0 interfaceC0415q0) {
        super(true);
        Z(interfaceC0415q0);
    }

    @Override // H5.x0
    public boolean S() {
        return true;
    }

    @Override // H5.InterfaceC0418u
    public boolean a0(Throwable th) {
        return e0(new C0423z(th, false, 2, null));
    }

    @Override // H5.P
    public Object e() {
        return O();
    }

    @Override // H5.P
    public Object f(InterfaceC1885d interfaceC1885d) throws Throwable {
        Object objX = x(interfaceC1885d);
        AbstractC1930b.c();
        return objX;
    }

    @Override // H5.InterfaceC0418u
    public boolean j0(Object obj) {
        return e0(obj);
    }
}
