package V3;

import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public abstract class v {
    private static Collection a(Iterable iterable) {
        return iterable instanceof Collection ? (Collection) iterable : x.g(iterable.iterator());
    }

    static Object[] b(Iterable iterable) {
        return a(iterable).toArray();
    }
}
