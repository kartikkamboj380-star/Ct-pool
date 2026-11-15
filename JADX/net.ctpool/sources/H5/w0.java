package H5;

/* JADX INFO: loaded from: classes2.dex */
public abstract class w0 extends B implements X, InterfaceC0405l0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public x0 f1449p;

    public final void A(x0 x0Var) {
        this.f1449p = x0Var;
    }

    @Override // H5.X
    public void c() {
        z().t0(this);
    }

    @Override // H5.InterfaceC0405l0
    public boolean d() {
        return true;
    }

    @Override // H5.InterfaceC0405l0
    public C0 g() {
        return null;
    }

    @Override // M5.q
    public String toString() {
        return M.a(this) + '@' + M.b(this) + "[job@" + M.b(z()) + ']';
    }

    public final x0 z() {
        x0 x0Var = this.f1449p;
        if (x0Var != null) {
            return x0Var;
        }
        w5.k.t("job");
        return null;
    }
}
