package j5;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public abstract class O extends AbstractC1795N {
    public static Set d() {
        return C1783B.f20410m;
    }

    public static Set e(Object... objArr) {
        w5.k.f(objArr, "elements");
        return (Set) AbstractC1807l.E(objArr, new LinkedHashSet(AbstractC1787F.d(objArr.length)));
    }

    public static final Set f(Set set) {
        w5.k.f(set, "<this>");
        int size = set.size();
        return size != 0 ? size != 1 ? set : AbstractC1794M.c(set.iterator().next()) : AbstractC1794M.d();
    }
}
