package j5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import l5.AbstractC1859a;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: j5.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1811p extends AbstractC1810o {
    public static final Collection f(Object[] objArr) {
        w5.k.f(objArr, "<this>");
        return new C1801f(objArr, false);
    }

    public static final int g(List list, Comparable comparable, int i7, int i8) {
        w5.k.f(list, "<this>");
        o(list.size(), i7, i8);
        int i9 = i8 - 1;
        while (i7 <= i9) {
            int i10 = (i7 + i9) >>> 1;
            int iA = AbstractC1859a.a((Comparable) list.get(i10), comparable);
            if (iA < 0) {
                i7 = i10 + 1;
            } else {
                if (iA <= 0) {
                    return i10;
                }
                i9 = i10 - 1;
            }
        }
        return -(i7 + 1);
    }

    public static /* synthetic */ int h(List list, Comparable comparable, int i7, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i7 = 0;
        }
        if ((i9 & 4) != 0) {
            i8 = list.size();
        }
        return g(list, comparable, i7, i8);
    }

    public static List i() {
        return z.f20431m;
    }

    public static int j(List list) {
        w5.k.f(list, "<this>");
        return list.size() - 1;
    }

    public static List k(Object... objArr) {
        w5.k.f(objArr, "elements");
        return objArr.length > 0 ? AbstractC1803h.c(objArr) : AbstractC1809n.i();
    }

    public static List l(Object... objArr) {
        w5.k.f(objArr, "elements");
        return AbstractC1803h.p(objArr);
    }

    public static List m(Object... objArr) {
        w5.k.f(objArr, "elements");
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new C1801f(objArr, true));
    }

    public static final List n(List list) {
        w5.k.f(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? list : AbstractC1809n.d(list.get(0)) : AbstractC1809n.i();
    }

    private static final void o(int i7, int i8, int i9) {
        if (i8 > i9) {
            throw new IllegalArgumentException("fromIndex (" + i8 + ") is greater than toIndex (" + i9 + ").");
        }
        if (i8 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i8 + ") is less than zero.");
        }
        if (i9 <= i7) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i9 + ") is greater than size (" + i7 + ").");
    }

    public static void p() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
