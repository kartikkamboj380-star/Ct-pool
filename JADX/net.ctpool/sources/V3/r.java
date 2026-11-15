package V3;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class r extends AbstractC0486n implements Set {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private transient AbstractC0487o f4143n;

    r() {
    }

    static int n(int i7) {
        int iMax = Math.max(i7, 2);
        if (iMax >= 751619276) {
            U3.h.e(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    private static r o(int i7, Object... objArr) {
        if (i7 == 0) {
            return s();
        }
        if (i7 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return t(obj);
        }
        int iN = n(i7);
        Object[] objArr2 = new Object[iN];
        int i8 = iN - 1;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < i7; i11++) {
            Object objA = F.a(objArr[i11], i11);
            int iHashCode = objA.hashCode();
            int iB = AbstractC0485m.b(iHashCode);
            while (true) {
                int i12 = iB & i8;
                Object obj2 = objArr2[i12];
                if (obj2 == null) {
                    objArr[i10] = objA;
                    objArr2[i12] = objA;
                    i9 += iHashCode;
                    i10++;
                    break;
                }
                if (obj2.equals(objA)) {
                    break;
                }
                iB++;
            }
        }
        Arrays.fill(objArr, i10, i7, (Object) null);
        if (i10 == 1) {
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            return new N(obj3);
        }
        if (n(i10) < iN / 2) {
            return o(i10, objArr);
        }
        if (w(i10, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i10);
        }
        return new K(objArr, i9, objArr2, i8, i10);
    }

    public static r p(Collection collection) {
        if ((collection instanceof r) && !(collection instanceof SortedSet)) {
            r rVar = (r) collection;
            if (!rVar.k()) {
                return rVar;
            }
        }
        Object[] array = collection.toArray();
        return o(array.length, array);
    }

    public static r s() {
        return K.f4065u;
    }

    public static r t(Object obj) {
        return new N(obj);
    }

    public static r u(Object obj, Object obj2, Object obj3) {
        return o(3, obj, obj2, obj3);
    }

    public static r v(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        U3.h.e(objArr.length <= 2147483641, "the total number of elements must fit in an int");
        int length = objArr.length + 6;
        Object[] objArr2 = new Object[length];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, objArr.length);
        return o(length, objArr2);
    }

    private static boolean w(int i7, int i8) {
        return i7 < (i8 >> 1) + (i8 >> 2);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof r) && r() && ((r) obj).r() && hashCode() != obj.hashCode()) {
            return false;
        }
        return M.a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return M.b(this);
    }

    public AbstractC0487o m() {
        AbstractC0487o abstractC0487o = this.f4143n;
        if (abstractC0487o != null) {
            return abstractC0487o;
        }
        AbstractC0487o abstractC0487oQ = q();
        this.f4143n = abstractC0487oQ;
        return abstractC0487oQ;
    }

    AbstractC0487o q() {
        return AbstractC0487o.m(toArray());
    }

    boolean r() {
        return false;
    }
}
