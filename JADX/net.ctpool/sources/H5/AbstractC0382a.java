package H5;

import m5.InterfaceC1885d;
import m5.InterfaceC1888g;

/* JADX INFO: renamed from: H5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0382a extends x0 implements InterfaceC0415q0, InterfaceC1885d, I {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final InterfaceC1888g f1413o;

    public AbstractC0382a(InterfaceC1888g interfaceC1888g, boolean z6, boolean z7) {
        super(z7);
        if (z6) {
            Z((InterfaceC0415q0) interfaceC1888g.b(InterfaceC0415q0.f1444b));
        }
        this.f1413o = interfaceC1888g.o(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // H5.x0
    public String G() {
        return M.a(this) + " was cancelled";
    }

    protected void I0(Object obj) {
        v(obj);
    }

    public final void L0(K k7, Object obj, v5.p pVar) {
        k7.h(pVar, obj, this);
    }

    @Override // H5.x0
    public final void Y(Throwable th) {
        H.a(this.f1413o, th);
    }

    @Override // m5.InterfaceC1885d
    public final InterfaceC1888g a() {
        return this.f1413o;
    }

    @Override // H5.x0, H5.InterfaceC0415q0
    public boolean d() {
        return super.d();
    }

    @Override // m5.InterfaceC1885d
    public final void h(Object obj) {
        Object objF0 = f0(D.d(obj, null, 1, null));
        if (objF0 == y0.f1469b) {
            return;
        }
        I0(objF0);
    }

    @Override // H5.I
    public InterfaceC1888g i() {
        return this.f1413o;
    }

    @Override // H5.x0
    public String i0() {
        String strB = E.b(this.f1413o);
        if (strB == null) {
            return super.i0();
        }
        return '\"' + strB + "\":" + super.i0();
    }

    @Override // H5.x0
    protected final void p0(Object obj) {
        if (!(obj instanceof C0423z)) {
            K0(obj);
        } else {
            C0423z c0423z = (C0423z) obj;
            J0(c0423z.f1476a, c0423z.a());
        }
    }

    protected void K0(Object obj) {
    }

    protected void J0(Throwable th, boolean z6) {
    }
}
