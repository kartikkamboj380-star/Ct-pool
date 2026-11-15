package H5;

import i5.m;

/* JADX INFO: loaded from: classes2.dex */
final class G0 extends w0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final C0406m f1388q;

    public G0(C0406m c0406m) {
        this.f1388q = c0406m;
    }

    @Override // v5.l
    public /* bridge */ /* synthetic */ Object i(Object obj) {
        y((Throwable) obj);
        return i5.u.f19985a;
    }

    @Override // H5.B
    public void y(Throwable th) {
        C0406m c0406m;
        Object objH;
        Object objV = z().V();
        if (objV instanceof C0423z) {
            c0406m = this.f1388q;
            m.a aVar = i5.m.f19973m;
            objH = i5.n.a(((C0423z) objV).f1476a);
        } else {
            c0406m = this.f1388q;
            m.a aVar2 = i5.m.f19973m;
            objH = y0.h(objV);
        }
        c0406m.h(i5.m.a(objH));
    }
}
