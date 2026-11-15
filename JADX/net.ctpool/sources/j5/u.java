package j5;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public abstract class u extends t {
    public static boolean t(Collection collection, Iterable iterable) {
        w5.k.f(collection, "<this>");
        w5.k.f(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        boolean z6 = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z6 = true;
            }
        }
        return z6;
    }

    public static boolean u(Collection collection, Object[] objArr) {
        w5.k.f(collection, "<this>");
        w5.k.f(objArr, "elements");
        return collection.addAll(AbstractC1803h.c(objArr));
    }
}
