package P;

import androidx.lifecycle.F;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import u5.AbstractC2147a;
import v5.l;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f2552a = new ArrayList();

    public final void a(D5.b bVar, l lVar) {
        k.f(bVar, "clazz");
        k.f(lVar, "initializer");
        this.f2552a.add(new f(AbstractC2147a.a(bVar), lVar));
    }

    public final F.b b() {
        Object[] array = this.f2552a.toArray(new f[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        f[] fVarArr = (f[]) array;
        return new b((f[]) Arrays.copyOf(fVarArr, fVarArr.length));
    }
}
