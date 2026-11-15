package H1;

import G1.F;
import G1.i;
import android.os.Build;
import java.nio.ByteBuffer;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f1356a = new g();

    private g() {
    }

    public static final f a(F f7, boolean z6, boolean z7, h hVar) {
        k.f(f7, "poolFactory");
        k.f(hVar, "platformDecoderOptions");
        if (Build.VERSION.SDK_INT >= 26) {
            i iVarB = f7.b();
            k.e(iVarB, "poolFactory.bitmapPool");
            return new e(iVarB, b(f7, z7), hVar);
        }
        i iVarB2 = f7.b();
        k.e(iVarB2, "poolFactory.bitmapPool");
        return new a(iVarB2, b(f7, z7), hVar);
    }

    public static final androidx.core.util.d b(F f7, boolean z6) {
        k.f(f7, "poolFactory");
        if (z6) {
            R0.b bVar = R0.b.f2825a;
            k.e(bVar, "INSTANCE");
            return bVar;
        }
        int iD = f7.d();
        androidx.core.util.e eVar = new androidx.core.util.e(iD);
        for (int i7 = 0; i7 < iD; i7++) {
            eVar.a(ByteBuffer.allocate(R0.b.e()));
        }
        return eVar;
    }
}
