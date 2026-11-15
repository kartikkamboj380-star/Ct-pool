package V3;

import java.util.Comparator;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes.dex */
abstract class P {
    public static Comparator a(SortedSet sortedSet) {
        Comparator comparator = sortedSet.comparator();
        return comparator == null ? G.c() : comparator;
    }

    public static boolean b(Comparator comparator, Iterable iterable) {
        Comparator comparator2;
        U3.h.i(comparator);
        U3.h.i(iterable);
        if (iterable instanceof SortedSet) {
            comparator2 = a((SortedSet) iterable);
        } else {
            if (!(iterable instanceof O)) {
                return false;
            }
            comparator2 = ((O) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }
}
