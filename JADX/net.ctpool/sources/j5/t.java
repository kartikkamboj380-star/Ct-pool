package j5;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public abstract class t extends s {
    public static void r(List list) {
        w5.k.f(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static final void s(List list, Comparator comparator) {
        w5.k.f(list, "<this>");
        w5.k.f(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
