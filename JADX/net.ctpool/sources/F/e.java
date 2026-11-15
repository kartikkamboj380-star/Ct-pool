package F;

import F.d;
import java.util.Arrays;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static final d a() {
        return new a(null, true, 1, null);
    }

    public static final a b(d.b... bVarArr) {
        k.f(bVarArr, "pairs");
        a aVar = new a(null, false, 1, null);
        aVar.g((d.b[]) Arrays.copyOf(bVarArr, bVarArr.length));
        return aVar;
    }
}
