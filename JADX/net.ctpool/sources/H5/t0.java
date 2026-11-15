package H5;

/* JADX INFO: loaded from: classes2.dex */
public class t0 extends x0 implements InterfaceC0421x {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f1448o;

    public t0(InterfaceC0415q0 interfaceC0415q0) {
        super(true);
        Z(interfaceC0415q0);
        this.f1448o = I0();
    }

    private final boolean I0() {
        x0 x0VarZ;
        r rVarU = U();
        C0416s c0416s = rVarU instanceof C0416s ? (C0416s) rVarU : null;
        if (c0416s != null && (x0VarZ = c0416s.z()) != null) {
            while (!x0VarZ.R()) {
                r rVarU2 = x0VarZ.U();
                C0416s c0416s2 = rVarU2 instanceof C0416s ? (C0416s) rVarU2 : null;
                if (c0416s2 == null || (x0VarZ = c0416s2.z()) == null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // H5.x0
    public boolean R() {
        return this.f1448o;
    }

    @Override // H5.x0
    public boolean S() {
        return true;
    }
}
