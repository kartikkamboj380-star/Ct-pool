package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.w5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1237w5 extends AbstractMap {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Object[] f14950m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f14951n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Map f14952o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f14953p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private volatile D5 f14954q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Map f14955r;

    private AbstractC1237w5() {
        this.f14952o = Collections.emptyMap();
        this.f14955r = Collections.emptyMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int d(Comparable comparable) {
        int i7;
        int i8;
        int i9 = this.f14951n;
        int i10 = i9 - 1;
        if (i10 < 0) {
            i7 = 0;
            while (i7 <= i10) {
                int i11 = (i7 + i10) / 2;
                int iCompareTo = comparable.compareTo((Comparable) ((A5) this.f14950m[i11]).getKey());
                if (iCompareTo < 0) {
                    i10 = i11 - 1;
                } else {
                    if (iCompareTo <= 0) {
                        return i11;
                    }
                    i7 = i11 + 1;
                }
            }
            i8 = i7 + 1;
        } else {
            int iCompareTo2 = comparable.compareTo((Comparable) ((A5) this.f14950m[i10]).getKey());
            if (iCompareTo2 > 0) {
                i8 = i9 + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i10;
                }
                i7 = 0;
                while (i7 <= i10) {
                }
                i8 = i7 + 1;
            }
        }
        return -i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object i(int i7) {
        r();
        Object value = ((A5) this.f14950m[i7]).getValue();
        Object[] objArr = this.f14950m;
        System.arraycopy(objArr, i7 + 1, objArr, i7, (this.f14951n - i7) - 1);
        this.f14951n--;
        if (!this.f14952o.isEmpty()) {
            Iterator it = q().entrySet().iterator();
            this.f14950m[this.f14951n] = new A5(this, (Map.Entry) it.next());
            this.f14951n++;
            it.remove();
        }
        return value;
    }

    private final SortedMap q() {
        r();
        if (this.f14952o.isEmpty() && !(this.f14952o instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f14952o = treeMap;
            this.f14955r = treeMap.descendingMap();
        }
        return (SortedMap) this.f14952o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r() {
        if (this.f14953p) {
            throw new UnsupportedOperationException();
        }
    }

    public final int a() {
        return this.f14951n;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        r();
        if (this.f14951n != 0) {
            this.f14950m = null;
            this.f14951n = 0;
        }
        if (this.f14952o.isEmpty()) {
            return;
        }
        this.f14952o.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return d(comparable) >= 0 || this.f14952o.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.f14954q == null) {
            this.f14954q = new D5(this);
        }
        return this.f14954q;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        Object objEntrySet;
        Object objEntrySet2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC1237w5)) {
            return super.equals(obj);
        }
        AbstractC1237w5 abstractC1237w5 = (AbstractC1237w5) obj;
        int size = size();
        if (size != abstractC1237w5.size()) {
            return false;
        }
        int i7 = this.f14951n;
        if (i7 != abstractC1237w5.f14951n) {
            objEntrySet = entrySet();
            objEntrySet2 = abstractC1237w5.entrySet();
        } else {
            for (int i8 = 0; i8 < i7; i8++) {
                if (!g(i8).equals(abstractC1237w5.g(i8))) {
                    return false;
                }
            }
            if (i7 == size) {
                return true;
            }
            objEntrySet = this.f14952o;
            objEntrySet2 = abstractC1237w5.f14952o;
        }
        return objEntrySet.equals(objEntrySet2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        r();
        int iD = d(comparable);
        if (iD >= 0) {
            return ((A5) this.f14950m[iD]).setValue(obj);
        }
        r();
        if (this.f14950m == null) {
            this.f14950m = new Object[16];
        }
        int i7 = -(iD + 1);
        if (i7 >= 16) {
            return q().put(comparable, obj);
        }
        int i8 = this.f14951n;
        if (i8 == 16) {
            A5 a52 = (A5) this.f14950m[15];
            this.f14951n = i8 - 1;
            q().put((Comparable) a52.getKey(), a52.getValue());
        }
        Object[] objArr = this.f14950m;
        System.arraycopy(objArr, i7, objArr, i7 + 1, (objArr.length - i7) - 1);
        this.f14950m[i7] = new A5(this, comparable, obj);
        this.f14951n++;
        return null;
    }

    public final Map.Entry g(int i7) {
        if (i7 < this.f14951n) {
            return (A5) this.f14950m[i7];
        }
        throw new ArrayIndexOutOfBoundsException(i7);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iD = d(comparable);
        return iD >= 0 ? ((A5) this.f14950m[iD]).getValue() : this.f14952o.get(comparable);
    }

    public final Iterable h() {
        return this.f14952o.isEmpty() ? Collections.emptySet() : this.f14952o.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int i7 = this.f14951n;
        int iHashCode = 0;
        for (int i8 = 0; i8 < i7; i8++) {
            iHashCode += this.f14950m[i8].hashCode();
        }
        return this.f14952o.size() > 0 ? iHashCode + this.f14952o.hashCode() : iHashCode;
    }

    final Set l() {
        return new C5(this);
    }

    public void m() {
        if (this.f14953p) {
            return;
        }
        this.f14952o = this.f14952o.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f14952o);
        this.f14955r = this.f14955r.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f14955r);
        this.f14953p = true;
    }

    public final boolean o() {
        return this.f14953p;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        r();
        Comparable comparable = (Comparable) obj;
        int iD = d(comparable);
        if (iD >= 0) {
            return i(iD);
        }
        if (this.f14952o.isEmpty()) {
            return null;
        }
        return this.f14952o.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f14951n + this.f14952o.size();
    }
}
