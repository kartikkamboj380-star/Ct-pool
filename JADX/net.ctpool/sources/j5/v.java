package j5;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public abstract class v extends u {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int A(List list, int i7) {
        return AbstractC1809n.j(list) - i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int B(List list, int i7) {
        if (new C5.c(0, list.size()).j0(i7)) {
            return list.size() - i7;
        }
        throw new IndexOutOfBoundsException("Position index " + i7 + " must be in range [" + new C5.c(0, list.size()) + "].");
    }

    public static List y(List list) {
        w5.k.f(list, "<this>");
        return new C1793L(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int z(List list, int i7) {
        if (new C5.c(0, AbstractC1809n.j(list)).j0(i7)) {
            return AbstractC1809n.j(list) - i7;
        }
        throw new IndexOutOfBoundsException("Element index " + i7 + " must be in range [" + new C5.c(0, AbstractC1809n.j(list)) + "].");
    }
}
