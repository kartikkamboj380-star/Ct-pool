package v1;

import G1.F;
import G1.i;
import H1.f;
import w5.k;
import y1.C2238a;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f22579a = new c();

    private c() {
    }

    public static final b a(F f7, f fVar, C2238a c2238a) {
        k.f(f7, "poolFactory");
        k.f(fVar, "platformDecoder");
        k.f(c2238a, "closeableReferenceFactory");
        i iVarB = f7.b();
        k.e(iVarB, "poolFactory.bitmapPool");
        return new C2155a(iVarB, c2238a);
    }
}
