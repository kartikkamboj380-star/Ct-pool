package P3;

import android.os.RemoteException;
import z3.C2273m;

/* JADX INFO: loaded from: classes.dex */
final class r extends Q3.q {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ String f2615n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ C2273m f2616o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final /* synthetic */ u f2617p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(u uVar, C2273m c2273m, String str, C2273m c2273m2) {
        super(c2273m);
        this.f2617p = uVar;
        this.f2615n = str;
        this.f2616o = c2273m2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [Q3.k, android.os.IInterface] */
    @Override // Q3.q
    protected final void a() {
        try {
            ?? E6 = this.f2617p.f2625a.e();
            u uVar = this.f2617p;
            E6.u(uVar.f2626b, u.b(uVar, this.f2615n), new t(this.f2617p, this.f2616o, this.f2615n));
        } catch (RemoteException e7) {
            u.f2623e.b(e7, "requestUpdateInfo(%s)", this.f2615n);
            this.f2616o.d(new RuntimeException(e7));
        }
    }
}
