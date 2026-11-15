package P;

import androidx.lifecycle.E;
import androidx.lifecycle.F;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class b implements F.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f[] f2551b;

    public b(f... fVarArr) {
        k.f(fVarArr, "initializers");
        this.f2551b = fVarArr;
    }

    @Override // androidx.lifecycle.F.b
    public E b(Class cls, a aVar) {
        k.f(cls, "modelClass");
        k.f(aVar, "extras");
        E e7 = null;
        for (f fVar : this.f2551b) {
            if (k.b(fVar.a(), cls)) {
                Object objI = fVar.b().i(aVar);
                e7 = objI instanceof E ? (E) objI : null;
            }
        }
        if (e7 != null) {
            return e7;
        }
        throw new IllegalArgumentException("No initializer set for given class " + cls.getName());
    }
}
