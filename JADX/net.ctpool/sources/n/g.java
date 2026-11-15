package n;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static Object[] f21316p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static int f21317q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    static Object[] f21318r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static int f21319s;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    int[] f21320m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object[] f21321n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f21322o;

    public g() {
        this.f21320m = c.f21285a;
        this.f21321n = c.f21287c;
        this.f21322o = 0;
    }

    private void a(int i7) {
        if (i7 == 8) {
            synchronized (g.class) {
                try {
                    Object[] objArr = f21318r;
                    if (objArr != null) {
                        this.f21321n = objArr;
                        f21318r = (Object[]) objArr[0];
                        this.f21320m = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f21319s--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i7 == 4) {
            synchronized (g.class) {
                try {
                    Object[] objArr2 = f21316p;
                    if (objArr2 != null) {
                        this.f21321n = objArr2;
                        f21316p = (Object[]) objArr2[0];
                        this.f21320m = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f21317q--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f21320m = new int[i7];
        this.f21321n = new Object[i7 << 1];
    }

    private static int b(int[] iArr, int i7, int i8) {
        try {
            return c.a(iArr, i7, i8);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    private static void e(int[] iArr, Object[] objArr, int i7) {
        if (iArr.length == 8) {
            synchronized (g.class) {
                try {
                    if (f21319s < 10) {
                        objArr[0] = f21318r;
                        objArr[1] = iArr;
                        for (int i8 = (i7 << 1) - 1; i8 >= 2; i8--) {
                            objArr[i8] = null;
                        }
                        f21318r = objArr;
                        f21319s++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (g.class) {
                try {
                    if (f21317q < 10) {
                        objArr[0] = f21316p;
                        objArr[1] = iArr;
                        for (int i9 = (i7 << 1) - 1; i9 >= 2; i9--) {
                            objArr[i9] = null;
                        }
                        f21316p = objArr;
                        f21317q++;
                    }
                } finally {
                }
            }
        }
    }

    public void clear() {
        int i7 = this.f21322o;
        if (i7 > 0) {
            int[] iArr = this.f21320m;
            Object[] objArr = this.f21321n;
            this.f21320m = c.f21285a;
            this.f21321n = c.f21287c;
            this.f21322o = 0;
            e(iArr, objArr, i7);
        }
        if (this.f21322o > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return g(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return i(obj) >= 0;
    }

    public void d(int i7) {
        int i8 = this.f21322o;
        int[] iArr = this.f21320m;
        if (iArr.length < i7) {
            Object[] objArr = this.f21321n;
            a(i7);
            if (this.f21322o > 0) {
                System.arraycopy(iArr, 0, this.f21320m, 0, i8);
                System.arraycopy(objArr, 0, this.f21321n, 0, i8 << 1);
            }
            e(iArr, objArr, i8);
        }
        if (this.f21322o != i8) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (size() != gVar.size()) {
                return false;
            }
            for (int i7 = 0; i7 < this.f21322o; i7++) {
                try {
                    Object objJ = j(i7);
                    Object objN = n(i7);
                    Object obj2 = gVar.get(objJ);
                    if (objN == null) {
                        if (obj2 != null || !gVar.containsKey(objJ)) {
                            return false;
                        }
                    } else if (!objN.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i8 = 0; i8 < this.f21322o; i8++) {
                try {
                    Object objJ2 = j(i8);
                    Object objN2 = n(i8);
                    Object obj3 = map.get(objJ2);
                    if (objN2 == null) {
                        if (obj3 != null || !map.containsKey(objJ2)) {
                            return false;
                        }
                    } else if (!objN2.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    int f(Object obj, int i7) {
        int i8 = this.f21322o;
        if (i8 == 0) {
            return -1;
        }
        int iB = b(this.f21320m, i8, i7);
        if (iB < 0 || obj.equals(this.f21321n[iB << 1])) {
            return iB;
        }
        int i9 = iB + 1;
        while (i9 < i8 && this.f21320m[i9] == i7) {
            if (obj.equals(this.f21321n[i9 << 1])) {
                return i9;
            }
            i9++;
        }
        for (int i10 = iB - 1; i10 >= 0 && this.f21320m[i10] == i7; i10--) {
            if (obj.equals(this.f21321n[i10 << 1])) {
                return i10;
            }
        }
        return ~i9;
    }

    public int g(Object obj) {
        return obj == null ? h() : f(obj, obj.hashCode());
    }

    public Object get(Object obj) {
        return getOrDefault(obj, null);
    }

    public Object getOrDefault(Object obj, Object obj2) {
        int iG = g(obj);
        return iG >= 0 ? this.f21321n[(iG << 1) + 1] : obj2;
    }

    int h() {
        int i7 = this.f21322o;
        if (i7 == 0) {
            return -1;
        }
        int iB = b(this.f21320m, i7, 0);
        if (iB < 0 || this.f21321n[iB << 1] == null) {
            return iB;
        }
        int i8 = iB + 1;
        while (i8 < i7 && this.f21320m[i8] == 0) {
            if (this.f21321n[i8 << 1] == null) {
                return i8;
            }
            i8++;
        }
        for (int i9 = iB - 1; i9 >= 0 && this.f21320m[i9] == 0; i9--) {
            if (this.f21321n[i9 << 1] == null) {
                return i9;
            }
        }
        return ~i8;
    }

    public int hashCode() {
        int[] iArr = this.f21320m;
        Object[] objArr = this.f21321n;
        int i7 = this.f21322o;
        int i8 = 1;
        int i9 = 0;
        int iHashCode = 0;
        while (i9 < i7) {
            Object obj = objArr[i8];
            iHashCode += (obj == null ? 0 : obj.hashCode()) ^ iArr[i9];
            i9++;
            i8 += 2;
        }
        return iHashCode;
    }

    int i(Object obj) {
        int i7 = this.f21322o * 2;
        Object[] objArr = this.f21321n;
        if (obj == null) {
            for (int i8 = 1; i8 < i7; i8 += 2) {
                if (objArr[i8] == null) {
                    return i8 >> 1;
                }
            }
            return -1;
        }
        for (int i9 = 1; i9 < i7; i9 += 2) {
            if (obj.equals(objArr[i9])) {
                return i9 >> 1;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.f21322o <= 0;
    }

    public Object j(int i7) {
        return this.f21321n[i7 << 1];
    }

    public void k(g gVar) {
        int i7 = gVar.f21322o;
        d(this.f21322o + i7);
        if (this.f21322o != 0) {
            for (int i8 = 0; i8 < i7; i8++) {
                put(gVar.j(i8), gVar.n(i8));
            }
        } else if (i7 > 0) {
            System.arraycopy(gVar.f21320m, 0, this.f21320m, 0, i7);
            System.arraycopy(gVar.f21321n, 0, this.f21321n, 0, i7 << 1);
            this.f21322o = i7;
        }
    }

    public Object l(int i7) {
        Object[] objArr = this.f21321n;
        int i8 = i7 << 1;
        Object obj = objArr[i8 + 1];
        int i9 = this.f21322o;
        int i10 = 0;
        if (i9 <= 1) {
            e(this.f21320m, objArr, i9);
            this.f21320m = c.f21285a;
            this.f21321n = c.f21287c;
        } else {
            int i11 = i9 - 1;
            int[] iArr = this.f21320m;
            if (iArr.length <= 8 || i9 >= iArr.length / 3) {
                if (i7 < i11) {
                    int i12 = i7 + 1;
                    int i13 = i11 - i7;
                    System.arraycopy(iArr, i12, iArr, i7, i13);
                    Object[] objArr2 = this.f21321n;
                    System.arraycopy(objArr2, i12 << 1, objArr2, i8, i13 << 1);
                }
                Object[] objArr3 = this.f21321n;
                int i14 = i11 << 1;
                objArr3[i14] = null;
                objArr3[i14 + 1] = null;
            } else {
                a(i9 > 8 ? i9 + (i9 >> 1) : 8);
                if (i9 != this.f21322o) {
                    throw new ConcurrentModificationException();
                }
                if (i7 > 0) {
                    System.arraycopy(iArr, 0, this.f21320m, 0, i7);
                    System.arraycopy(objArr, 0, this.f21321n, 0, i8);
                }
                if (i7 < i11) {
                    int i15 = i7 + 1;
                    int i16 = i11 - i7;
                    System.arraycopy(iArr, i15, this.f21320m, i7, i16);
                    System.arraycopy(objArr, i15 << 1, this.f21321n, i8, i16 << 1);
                }
            }
            i10 = i11;
        }
        if (i9 != this.f21322o) {
            throw new ConcurrentModificationException();
        }
        this.f21322o = i10;
        return obj;
    }

    public Object m(int i7, Object obj) {
        int i8 = (i7 << 1) + 1;
        Object[] objArr = this.f21321n;
        Object obj2 = objArr[i8];
        objArr[i8] = obj;
        return obj2;
    }

    public Object n(int i7) {
        return this.f21321n[(i7 << 1) + 1];
    }

    public Object put(Object obj, Object obj2) {
        int i7;
        int iF;
        int i8 = this.f21322o;
        if (obj == null) {
            iF = h();
            i7 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i7 = iHashCode;
            iF = f(obj, iHashCode);
        }
        if (iF >= 0) {
            int i9 = (iF << 1) + 1;
            Object[] objArr = this.f21321n;
            Object obj3 = objArr[i9];
            objArr[i9] = obj2;
            return obj3;
        }
        int i10 = ~iF;
        int[] iArr = this.f21320m;
        if (i8 >= iArr.length) {
            int i11 = 8;
            if (i8 >= 8) {
                i11 = (i8 >> 1) + i8;
            } else if (i8 < 4) {
                i11 = 4;
            }
            Object[] objArr2 = this.f21321n;
            a(i11);
            if (i8 != this.f21322o) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f21320m;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f21321n, 0, objArr2.length);
            }
            e(iArr, objArr2, i8);
        }
        if (i10 < i8) {
            int[] iArr3 = this.f21320m;
            int i12 = i10 + 1;
            System.arraycopy(iArr3, i10, iArr3, i12, i8 - i10);
            Object[] objArr3 = this.f21321n;
            System.arraycopy(objArr3, i10 << 1, objArr3, i12 << 1, (this.f21322o - i10) << 1);
        }
        int i13 = this.f21322o;
        if (i8 == i13) {
            int[] iArr4 = this.f21320m;
            if (i10 < iArr4.length) {
                iArr4[i10] = i7;
                Object[] objArr4 = this.f21321n;
                int i14 = i10 << 1;
                objArr4[i14] = obj;
                objArr4[i14 + 1] = obj2;
                this.f21322o = i13 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int iG = g(obj);
        if (iG >= 0) {
            return l(iG);
        }
        return null;
    }

    public Object replace(Object obj, Object obj2) {
        int iG = g(obj);
        if (iG >= 0) {
            return m(iG, obj2);
        }
        return null;
    }

    public int size() {
        return this.f21322o;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f21322o * 28);
        sb.append('{');
        for (int i7 = 0; i7 < this.f21322o; i7++) {
            if (i7 > 0) {
                sb.append(", ");
            }
            Object objJ = j(i7);
            if (objJ != this) {
                sb.append(objJ);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objN = n(i7);
            if (objN != this) {
                sb.append(objN);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public g(int i7) {
        if (i7 == 0) {
            this.f21320m = c.f21285a;
            this.f21321n = c.f21287c;
        } else {
            a(i7);
        }
        this.f21322o = 0;
    }

    public boolean remove(Object obj, Object obj2) {
        int iG = g(obj);
        if (iG < 0) {
            return false;
        }
        Object objN = n(iG);
        if (obj2 != objN && (obj2 == null || !obj2.equals(objN))) {
            return false;
        }
        l(iG);
        return true;
    }

    public boolean replace(Object obj, Object obj2, Object obj3) {
        int iG = g(obj);
        if (iG < 0) {
            return false;
        }
        Object objN = n(iG);
        if (objN != obj2 && (obj2 == null || !obj2.equals(objN))) {
            return false;
        }
        m(iG, obj3);
        return true;
    }

    public g(g gVar) {
        this();
        if (gVar != null) {
            k(gVar);
        }
    }
}
