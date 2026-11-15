package H5;

/* JADX INFO: renamed from: H5.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0416s extends s0 implements r {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final InterfaceC0417t f1447q;

    public C0416s(InterfaceC0417t interfaceC0417t) {
        this.f1447q = interfaceC0417t;
    }

    @Override // H5.r
    public boolean a(Throwable th) {
        return z().H(th);
    }

    @Override // H5.r
    public InterfaceC0415q0 getParent() {
        return z();
    }

    @Override // v5.l
    public /* bridge */ /* synthetic */ Object i(Object obj) {
        y((Throwable) obj);
        return i5.u.f19985a;
    }

    @Override // H5.B
    public void y(Throwable th) {
        this.f1447q.n0(z());
    }
}
