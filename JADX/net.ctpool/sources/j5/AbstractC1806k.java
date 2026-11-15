package j5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: j5.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1806k extends AbstractC1805j {
    public static List c(Object[] objArr) {
        w5.k.f(objArr, "<this>");
        List listA = AbstractC1808m.a(objArr);
        w5.k.e(listA, "asList(...)");
        return listA;
    }

    public static byte[] d(byte[] bArr, byte[] bArr2, int i7, int i8, int i9) {
        w5.k.f(bArr, "<this>");
        w5.k.f(bArr2, "destination");
        System.arraycopy(bArr, i8, bArr2, i7, i9 - i8);
        return bArr2;
    }

    public static Object[] e(Object[] objArr, Object[] objArr2, int i7, int i8, int i9) {
        w5.k.f(objArr, "<this>");
        w5.k.f(objArr2, "destination");
        System.arraycopy(objArr, i8, objArr2, i7, i9 - i8);
        return objArr2;
    }

    public static /* synthetic */ byte[] f(byte[] bArr, byte[] bArr2, int i7, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i7 = 0;
        }
        if ((i10 & 4) != 0) {
            i8 = 0;
        }
        if ((i10 & 8) != 0) {
            i9 = bArr.length;
        }
        return AbstractC1803h.d(bArr, bArr2, i7, i8, i9);
    }

    public static /* synthetic */ Object[] g(Object[] objArr, Object[] objArr2, int i7, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i7 = 0;
        }
        if ((i10 & 4) != 0) {
            i8 = 0;
        }
        if ((i10 & 8) != 0) {
            i9 = objArr.length;
        }
        return AbstractC1803h.e(objArr, objArr2, i7, i8, i9);
    }

    public static byte[] h(byte[] bArr, int i7, int i8) {
        w5.k.f(bArr, "<this>");
        AbstractC1804i.b(i8, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i7, i8);
        w5.k.e(bArrCopyOfRange, "copyOfRange(...)");
        return bArrCopyOfRange;
    }

    public static Object[] i(Object[] objArr, int i7, int i8) {
        w5.k.f(objArr, "<this>");
        AbstractC1804i.b(i8, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i7, i8);
        w5.k.e(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    public static void j(int[] iArr, int i7, int i8, int i9) {
        w5.k.f(iArr, "<this>");
        Arrays.fill(iArr, i8, i9, i7);
    }

    public static void k(Object[] objArr, Object obj, int i7, int i8) {
        w5.k.f(objArr, "<this>");
        Arrays.fill(objArr, i7, i8, obj);
    }

    public static /* synthetic */ void l(Object[] objArr, Object obj, int i7, int i8, int i9, Object obj2) {
        if ((i9 & 2) != 0) {
            i7 = 0;
        }
        if ((i9 & 4) != 0) {
            i8 = objArr.length;
        }
        AbstractC1803h.k(objArr, obj, i7, i8);
    }

    public static final void m(Object[] objArr) {
        w5.k.f(objArr, "<this>");
        if (objArr.length > 1) {
            Arrays.sort(objArr);
        }
    }

    public static final void n(Object[] objArr, Comparator comparator) {
        w5.k.f(objArr, "<this>");
        w5.k.f(comparator, "comparator");
        if (objArr.length > 1) {
            Arrays.sort(objArr, comparator);
        }
    }
}
