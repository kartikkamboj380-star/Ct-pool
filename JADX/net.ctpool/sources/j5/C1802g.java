package j5;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: j5.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1802g extends AbstractC1799d {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f20424p = new a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Object[] f20425q = new Object[0];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f20426m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Object[] f20427n = f20425q;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f20428o;

    /* JADX INFO: renamed from: j5.g$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final void m(int i7, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f20427n.length;
        while (i7 < length && it.hasNext()) {
            this.f20427n[i7] = it.next();
            i7++;
        }
        int i8 = this.f20426m;
        for (int i9 = 0; i9 < i8 && it.hasNext(); i9++) {
            this.f20427n[i9] = it.next();
        }
        this.f20428o = size() + collection.size();
    }

    private final void n(int i7) {
        Object[] objArr = new Object[i7];
        Object[] objArr2 = this.f20427n;
        AbstractC1803h.e(objArr2, objArr, 0, this.f20426m, objArr2.length);
        Object[] objArr3 = this.f20427n;
        int length = objArr3.length;
        int i8 = this.f20426m;
        AbstractC1803h.e(objArr3, objArr, length - i8, 0, i8);
        this.f20426m = 0;
        this.f20427n = objArr;
    }

    private final int o(int i7) {
        return i7 == 0 ? AbstractC1803h.v(this.f20427n) : i7 - 1;
    }

    private final void p(int i7) {
        if (i7 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f20427n;
        if (i7 <= objArr.length) {
            return;
        }
        if (objArr == f20425q) {
            this.f20427n = new Object[C5.g.c(i7, 10)];
        } else {
            n(AbstractC1797b.f20415m.d(objArr.length, i7));
        }
    }

    private final int q(int i7) {
        if (i7 == AbstractC1803h.v(this.f20427n)) {
            return 0;
        }
        return i7 + 1;
    }

    private final int r(int i7) {
        return i7 < 0 ? i7 + this.f20427n.length : i7;
    }

    private final int s(int i7) {
        Object[] objArr = this.f20427n;
        return i7 >= objArr.length ? i7 - objArr.length : i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i7, Object obj) {
        AbstractC1797b.f20415m.b(i7, size());
        if (i7 == size()) {
            k(obj);
            return;
        }
        if (i7 == 0) {
            i(obj);
            return;
        }
        p(size() + 1);
        int iS = s(this.f20426m + i7);
        if (i7 < ((size() + 1) >> 1)) {
            int iO = o(iS);
            int iO2 = o(this.f20426m);
            int i8 = this.f20426m;
            if (iO >= i8) {
                Object[] objArr = this.f20427n;
                objArr[iO2] = objArr[i8];
                AbstractC1803h.e(objArr, objArr, i8, i8 + 1, iO + 1);
            } else {
                Object[] objArr2 = this.f20427n;
                AbstractC1803h.e(objArr2, objArr2, i8 - 1, i8, objArr2.length);
                Object[] objArr3 = this.f20427n;
                objArr3[objArr3.length - 1] = objArr3[0];
                AbstractC1803h.e(objArr3, objArr3, 0, 1, iO + 1);
            }
            this.f20427n[iO] = obj;
            this.f20426m = iO2;
        } else {
            int iS2 = s(this.f20426m + size());
            Object[] objArr4 = this.f20427n;
            if (iS < iS2) {
                AbstractC1803h.e(objArr4, objArr4, iS + 1, iS, iS2);
            } else {
                AbstractC1803h.e(objArr4, objArr4, 1, 0, iS2);
                Object[] objArr5 = this.f20427n;
                objArr5[0] = objArr5[objArr5.length - 1];
                AbstractC1803h.e(objArr5, objArr5, iS + 1, iS, objArr5.length - 1);
            }
            this.f20427n[iS] = obj;
        }
        this.f20428o = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i7, Collection collection) {
        w5.k.f(collection, "elements");
        AbstractC1797b.f20415m.b(i7, size());
        if (collection.isEmpty()) {
            return false;
        }
        if (i7 == size()) {
            return addAll(collection);
        }
        p(size() + collection.size());
        int iS = s(this.f20426m + size());
        int iS2 = s(this.f20426m + i7);
        int size = collection.size();
        if (i7 < ((size() + 1) >> 1)) {
            int i8 = this.f20426m;
            int length = i8 - size;
            if (iS2 < i8) {
                Object[] objArr = this.f20427n;
                AbstractC1803h.e(objArr, objArr, length, i8, objArr.length);
                Object[] objArr2 = this.f20427n;
                if (size >= iS2) {
                    AbstractC1803h.e(objArr2, objArr2, objArr2.length - size, 0, iS2);
                } else {
                    AbstractC1803h.e(objArr2, objArr2, objArr2.length - size, 0, size);
                    Object[] objArr3 = this.f20427n;
                    AbstractC1803h.e(objArr3, objArr3, 0, size, iS2);
                }
            } else if (length >= 0) {
                Object[] objArr4 = this.f20427n;
                AbstractC1803h.e(objArr4, objArr4, length, i8, iS2);
            } else {
                Object[] objArr5 = this.f20427n;
                length += objArr5.length;
                int i9 = iS2 - i8;
                int length2 = objArr5.length - length;
                if (length2 >= i9) {
                    AbstractC1803h.e(objArr5, objArr5, length, i8, iS2);
                } else {
                    AbstractC1803h.e(objArr5, objArr5, length, i8, i8 + length2);
                    Object[] objArr6 = this.f20427n;
                    AbstractC1803h.e(objArr6, objArr6, 0, this.f20426m + length2, iS2);
                }
            }
            this.f20426m = length;
            m(r(iS2 - size), collection);
        } else {
            int length3 = iS2 + size;
            if (iS2 < iS) {
                int i10 = size + iS;
                Object[] objArr7 = this.f20427n;
                if (i10 <= objArr7.length) {
                    AbstractC1803h.e(objArr7, objArr7, length3, iS2, iS);
                } else if (length3 >= objArr7.length) {
                    length3 -= objArr7.length;
                    AbstractC1803h.e(objArr7, objArr7, length3, iS2, iS);
                } else {
                    int length4 = iS - (i10 - objArr7.length);
                    AbstractC1803h.e(objArr7, objArr7, 0, length4, iS);
                    Object[] objArr8 = this.f20427n;
                    AbstractC1803h.e(objArr8, objArr8, length3, iS2, length4);
                }
            } else {
                Object[] objArr9 = this.f20427n;
                AbstractC1803h.e(objArr9, objArr9, size, 0, iS);
                Object[] objArr10 = this.f20427n;
                if (length3 >= objArr10.length) {
                    AbstractC1803h.e(objArr10, objArr10, length3 - objArr10.length, iS2, objArr10.length);
                } else {
                    AbstractC1803h.e(objArr10, objArr10, 0, objArr10.length - size, objArr10.length);
                    Object[] objArr11 = this.f20427n;
                    AbstractC1803h.e(objArr11, objArr11, length3, iS2, objArr11.length - size);
                }
            }
            m(iS2, collection);
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        int iS = s(this.f20426m + size());
        int i7 = this.f20426m;
        if (i7 < iS) {
            AbstractC1803h.k(this.f20427n, null, i7, iS);
        } else if (!isEmpty()) {
            Object[] objArr = this.f20427n;
            AbstractC1803h.k(objArr, null, this.f20426m, objArr.length);
            AbstractC1803h.k(this.f20427n, null, 0, iS);
        }
        this.f20426m = 0;
        this.f20428o = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // j5.AbstractC1799d
    public int f() {
        return this.f20428o;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i7) {
        AbstractC1797b.f20415m.a(i7, size());
        return this.f20427n[s(this.f20426m + i7)];
    }

    @Override // j5.AbstractC1799d
    public Object h(int i7) {
        AbstractC1797b.f20415m.a(i7, size());
        if (i7 == AbstractC1809n.j(this)) {
            return v();
        }
        if (i7 == 0) {
            return t();
        }
        int iS = s(this.f20426m + i7);
        Object obj = this.f20427n[iS];
        if (i7 < (size() >> 1)) {
            int i8 = this.f20426m;
            if (iS >= i8) {
                Object[] objArr = this.f20427n;
                AbstractC1803h.e(objArr, objArr, i8 + 1, i8, iS);
            } else {
                Object[] objArr2 = this.f20427n;
                AbstractC1803h.e(objArr2, objArr2, 1, 0, iS);
                Object[] objArr3 = this.f20427n;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i9 = this.f20426m;
                AbstractC1803h.e(objArr3, objArr3, i9 + 1, i9, objArr3.length - 1);
            }
            Object[] objArr4 = this.f20427n;
            int i10 = this.f20426m;
            objArr4[i10] = null;
            this.f20426m = q(i10);
        } else {
            int iS2 = s(this.f20426m + AbstractC1809n.j(this));
            Object[] objArr5 = this.f20427n;
            if (iS <= iS2) {
                AbstractC1803h.e(objArr5, objArr5, iS, iS + 1, iS2 + 1);
            } else {
                AbstractC1803h.e(objArr5, objArr5, iS, iS + 1, objArr5.length);
                Object[] objArr6 = this.f20427n;
                objArr6[objArr6.length - 1] = objArr6[0];
                AbstractC1803h.e(objArr6, objArr6, 0, 1, iS2 + 1);
            }
            this.f20427n[iS2] = null;
        }
        this.f20428o = size() - 1;
        return obj;
    }

    public final void i(Object obj) {
        p(size() + 1);
        int iO = o(this.f20426m);
        this.f20426m = iO;
        this.f20427n[iO] = obj;
        this.f20428o = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int iS = s(this.f20426m + size());
        int length = this.f20426m;
        if (length < iS) {
            while (length < iS) {
                if (!w5.k.b(obj, this.f20427n[length])) {
                    length++;
                }
            }
            return -1;
        }
        if (length < iS) {
            return -1;
        }
        int length2 = this.f20427n.length;
        while (true) {
            if (length >= length2) {
                for (int i7 = 0; i7 < iS; i7++) {
                    if (w5.k.b(obj, this.f20427n[i7])) {
                        length = i7 + this.f20427n.length;
                    }
                }
                return -1;
            }
            if (w5.k.b(obj, this.f20427n[length])) {
                break;
            }
            length++;
        }
        return length - this.f20426m;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    public final void k(Object obj) {
        p(size() + 1);
        this.f20427n[s(this.f20426m + size())] = obj;
        this.f20428o = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int iV;
        int iS = s(this.f20426m + size());
        int i7 = this.f20426m;
        if (i7 < iS) {
            iV = iS - 1;
            if (i7 <= iV) {
                while (!w5.k.b(obj, this.f20427n[iV])) {
                    if (iV != i7) {
                        iV--;
                    }
                }
                return iV - this.f20426m;
            }
            return -1;
        }
        if (i7 > iS) {
            int i8 = iS - 1;
            while (true) {
                if (-1 >= i8) {
                    iV = AbstractC1803h.v(this.f20427n);
                    int i9 = this.f20426m;
                    if (i9 <= iV) {
                        while (!w5.k.b(obj, this.f20427n[iV])) {
                            if (iV != i9) {
                                iV--;
                            }
                        }
                    }
                } else {
                    if (w5.k.b(obj, this.f20427n[i8])) {
                        iV = i8 + this.f20427n.length;
                        break;
                    }
                    i8--;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection collection) {
        int iS;
        w5.k.f(collection, "elements");
        boolean z6 = false;
        z6 = false;
        z6 = false;
        if (!isEmpty() && this.f20427n.length != 0) {
            int iS2 = s(this.f20426m + size());
            int i7 = this.f20426m;
            if (i7 < iS2) {
                iS = i7;
                while (i7 < iS2) {
                    Object obj = this.f20427n[i7];
                    if (!collection.contains(obj)) {
                        this.f20427n[iS] = obj;
                        iS++;
                    } else {
                        z6 = true;
                    }
                    i7++;
                }
                AbstractC1803h.k(this.f20427n, null, iS, iS2);
            } else {
                int length = this.f20427n.length;
                boolean z7 = false;
                int i8 = i7;
                while (i7 < length) {
                    Object[] objArr = this.f20427n;
                    Object obj2 = objArr[i7];
                    objArr[i7] = null;
                    if (!collection.contains(obj2)) {
                        this.f20427n[i8] = obj2;
                        i8++;
                    } else {
                        z7 = true;
                    }
                    i7++;
                }
                iS = s(i8);
                for (int i9 = 0; i9 < iS2; i9++) {
                    Object[] objArr2 = this.f20427n;
                    Object obj3 = objArr2[i9];
                    objArr2[i9] = null;
                    if (!collection.contains(obj3)) {
                        this.f20427n[iS] = obj3;
                        iS = q(iS);
                    } else {
                        z7 = true;
                    }
                }
                z6 = z7;
            }
            if (z6) {
                this.f20428o = r(iS - this.f20426m);
            }
        }
        return z6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection collection) {
        int iS;
        w5.k.f(collection, "elements");
        boolean z6 = false;
        z6 = false;
        z6 = false;
        if (!isEmpty() && this.f20427n.length != 0) {
            int iS2 = s(this.f20426m + size());
            int i7 = this.f20426m;
            if (i7 < iS2) {
                iS = i7;
                while (i7 < iS2) {
                    Object obj = this.f20427n[i7];
                    if (collection.contains(obj)) {
                        this.f20427n[iS] = obj;
                        iS++;
                    } else {
                        z6 = true;
                    }
                    i7++;
                }
                AbstractC1803h.k(this.f20427n, null, iS, iS2);
            } else {
                int length = this.f20427n.length;
                boolean z7 = false;
                int i8 = i7;
                while (i7 < length) {
                    Object[] objArr = this.f20427n;
                    Object obj2 = objArr[i7];
                    objArr[i7] = null;
                    if (collection.contains(obj2)) {
                        this.f20427n[i8] = obj2;
                        i8++;
                    } else {
                        z7 = true;
                    }
                    i7++;
                }
                iS = s(i8);
                for (int i9 = 0; i9 < iS2; i9++) {
                    Object[] objArr2 = this.f20427n;
                    Object obj3 = objArr2[i9];
                    objArr2[i9] = null;
                    if (collection.contains(obj3)) {
                        this.f20427n[iS] = obj3;
                        iS = q(iS);
                    } else {
                        z7 = true;
                    }
                }
                z6 = z7;
            }
            if (z6) {
                this.f20428o = r(iS - this.f20426m);
            }
        }
        return z6;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i7, Object obj) {
        AbstractC1797b.f20415m.a(i7, size());
        int iS = s(this.f20426m + i7);
        Object[] objArr = this.f20427n;
        Object obj2 = objArr[iS];
        objArr[iS] = obj;
        return obj2;
    }

    public final Object t() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        Object[] objArr = this.f20427n;
        int i7 = this.f20426m;
        Object obj = objArr[i7];
        objArr[i7] = null;
        this.f20426m = q(i7);
        this.f20428o = size() - 1;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    public final Object u() {
        if (isEmpty()) {
            return null;
        }
        return t();
    }

    public final Object v() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        int iS = s(this.f20426m + AbstractC1809n.j(this));
        Object[] objArr = this.f20427n;
        Object obj = objArr[iS];
        objArr[iS] = null;
        this.f20428o = size() - 1;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        k(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        w5.k.f(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        p(size() + collection.size());
        m(s(this.f20426m + size()), collection);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] objArr) {
        w5.k.f(objArr, "array");
        if (objArr.length < size()) {
            objArr = AbstractC1804i.a(objArr, size());
        }
        int iS = s(this.f20426m + size());
        int i7 = this.f20426m;
        if (i7 < iS) {
            AbstractC1806k.g(this.f20427n, objArr, 0, i7, iS, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f20427n;
            AbstractC1803h.e(objArr2, objArr, 0, this.f20426m, objArr2.length);
            Object[] objArr3 = this.f20427n;
            AbstractC1803h.e(objArr3, objArr, objArr3.length - this.f20426m, 0, iS);
        }
        return AbstractC1809n.e(size(), objArr);
    }
}
