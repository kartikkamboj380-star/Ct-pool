package M5;

import H5.AbstractC0382a;
import m5.InterfaceC1885d;
import m5.InterfaceC1888g;
import n5.AbstractC1930b;
import o5.InterfaceC1950e;

/* JADX INFO: loaded from: classes2.dex */
public class B extends AbstractC0382a implements InterfaceC1950e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final InterfaceC1885d f2060p;

    public B(InterfaceC1888g interfaceC1888g, InterfaceC1885d interfaceC1885d) {
        super(interfaceC1888g, true, true);
        this.f2060p = interfaceC1885d;
    }

    @Override // H5.AbstractC0382a
    protected void I0(Object obj) {
        InterfaceC1885d interfaceC1885d = this.f2060p;
        interfaceC1885d.h(H5.D.a(obj, interfaceC1885d));
    }

    @Override // H5.x0
    protected final boolean c0() {
        return true;
    }

    @Override // o5.InterfaceC1950e
    public final InterfaceC1950e g() {
        InterfaceC1885d interfaceC1885d = this.f2060p;
        if (interfaceC1885d instanceof InterfaceC1950e) {
            return (InterfaceC1950e) interfaceC1885d;
        }
        return null;
    }

    @Override // H5.x0
    protected void v(Object obj) {
        AbstractC0434k.c(AbstractC1930b.b(this.f2060p), H5.D.a(obj, this.f2060p), null, 2, null);
    }
}
