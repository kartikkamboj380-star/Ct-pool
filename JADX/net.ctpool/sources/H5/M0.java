package H5;

import m5.InterfaceC1888g;

/* JADX INFO: loaded from: classes2.dex */
public final class M0 extends F {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final M0 f1397o = new M0();

    private M0() {
    }

    @Override // H5.F
    public void a(InterfaceC1888g interfaceC1888g, Runnable runnable) {
        androidx.appcompat.app.y.a(interfaceC1888g.b(Q0.f1404n));
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    @Override // H5.F
    public boolean g(InterfaceC1888g interfaceC1888g) {
        return false;
    }

    @Override // H5.F
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
