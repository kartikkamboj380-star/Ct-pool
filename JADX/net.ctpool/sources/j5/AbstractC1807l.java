package j5;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: j5.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1807l extends AbstractC1806k {
    public static /* synthetic */ String A(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i7, CharSequence charSequence4, v5.l lVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i8 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i8 & 4) == 0 ? charSequence3 : "";
        if ((i8 & 8) != 0) {
            i7 = -1;
        }
        int i9 = i7;
        if ((i8 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i8 & 32) != 0) {
            lVar = null;
        }
        return z(objArr, charSequence, charSequence5, charSequence6, i9, charSequence7, lVar);
    }

    public static Comparable B(Comparable[] comparableArr) {
        w5.k.f(comparableArr, "<this>");
        if (comparableArr.length == 0) {
            return null;
        }
        Comparable comparable = comparableArr[0];
        AbstractC1784C it = new C5.c(1, AbstractC1803h.v(comparableArr)).iterator();
        while (it.hasNext()) {
            Comparable comparable2 = comparableArr[it.d()];
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static char C(char[] cArr) {
        w5.k.f(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static Object D(Object[] objArr) {
        w5.k.f(objArr, "<this>");
        if (objArr.length == 1) {
            return objArr[0];
        }
        return null;
    }

    public static final Collection E(Object[] objArr, Collection collection) {
        w5.k.f(objArr, "<this>");
        w5.k.f(collection, "destination");
        for (Object obj : objArr) {
            collection.add(obj);
        }
        return collection;
    }

    public static List F(Object[] objArr) {
        w5.k.f(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? AbstractC1803h.G(objArr) : AbstractC1809n.d(objArr[0]) : AbstractC1809n.i();
    }

    public static List G(Object[] objArr) {
        w5.k.f(objArr, "<this>");
        return new ArrayList(AbstractC1811p.f(objArr));
    }

    public static final boolean o(Object[] objArr, Object obj) {
        w5.k.f(objArr, "<this>");
        return x(objArr, obj) >= 0;
    }

    public static List p(Object[] objArr) {
        w5.k.f(objArr, "<this>");
        return (List) q(objArr, new ArrayList());
    }

    public static final Collection q(Object[] objArr, Collection collection) {
        w5.k.f(objArr, "<this>");
        w5.k.f(collection, "destination");
        for (Object obj : objArr) {
            if (obj != null) {
                collection.add(obj);
            }
        }
        return collection;
    }

    public static Object r(Object[] objArr) {
        w5.k.f(objArr, "<this>");
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    public static C5.c s(byte[] bArr) {
        w5.k.f(bArr, "<this>");
        return new C5.c(0, u(bArr));
    }

    public static C5.c t(Object[] objArr) {
        w5.k.f(objArr, "<this>");
        return new C5.c(0, AbstractC1803h.v(objArr));
    }

    public static final int u(byte[] bArr) {
        w5.k.f(bArr, "<this>");
        return bArr.length - 1;
    }

    public static int v(Object[] objArr) {
        w5.k.f(objArr, "<this>");
        return objArr.length - 1;
    }

    public static Object w(Object[] objArr, int i7) {
        w5.k.f(objArr, "<this>");
        if (i7 < 0 || i7 > AbstractC1803h.v(objArr)) {
            return null;
        }
        return objArr[i7];
    }

    public static final int x(Object[] objArr, Object obj) {
        w5.k.f(objArr, "<this>");
        int i7 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i7 < length) {
                if (objArr[i7] == null) {
                    return i7;
                }
                i7++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i7 < length2) {
            if (w5.k.b(obj, objArr[i7])) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    public static final Appendable y(Object[] objArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i7, CharSequence charSequence4, v5.l lVar) throws IOException {
        w5.k.f(objArr, "<this>");
        w5.k.f(appendable, "buffer");
        w5.k.f(charSequence, "separator");
        w5.k.f(charSequence2, "prefix");
        w5.k.f(charSequence3, "postfix");
        w5.k.f(charSequence4, "truncated");
        appendable.append(charSequence2);
        int i8 = 0;
        for (Object obj : objArr) {
            i8++;
            if (i8 > 1) {
                appendable.append(charSequence);
            }
            if (i7 >= 0 && i8 > i7) {
                break;
            }
            F5.g.a(appendable, obj, lVar);
        }
        if (i7 >= 0 && i8 > i7) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    public static final String z(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i7, CharSequence charSequence4, v5.l lVar) {
        w5.k.f(objArr, "<this>");
        w5.k.f(charSequence, "separator");
        w5.k.f(charSequence2, "prefix");
        w5.k.f(charSequence3, "postfix");
        w5.k.f(charSequence4, "truncated");
        String string = ((StringBuilder) y(objArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i7, charSequence4, lVar)).toString();
        w5.k.e(string, "toString(...)");
        return string;
    }
}
