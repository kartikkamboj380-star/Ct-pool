package com.google.android.gms.internal.play_billing;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.u1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1339u1 extends AbstractMap {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f15309m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f15312p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private volatile C1333s1 f15313q;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List f15310n = Collections.emptyList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Map f15311o = Collections.emptyMap();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Map f15314r = Collections.emptyMap();

    private final int l(Comparable comparable) {
        int size = this.f15310n.size();
        int i7 = size - 1;
        int i8 = 0;
        if (i7 >= 0) {
            int iCompareTo = comparable.compareTo(((C1321o1) this.f15310n.get(i7)).e());
            if (iCompareTo > 0) {
                return -(size + 1);
            }
            if (iCompareTo == 0) {
                return i7;
            }
        }
        while (i8 <= i7) {
            int i9 = (i8 + i7) / 2;
            int iCompareTo2 = comparable.compareTo(((C1321o1) this.f15310n.get(i9)).e());
            if (iCompareTo2 < 0) {
                i7 = i9 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i9;
                }
                i8 = i9 + 1;
            }
        }
        return -(i8 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object m(int i7) {
        o();
        Object value = ((C1321o1) this.f15310n.remove(i7)).getValue();
        if (!this.f15311o.isEmpty()) {
            Iterator it = n().entrySet().iterator();
            List list = this.f15310n;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C1321o1(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    private final SortedMap n() {
        o();
        if (this.f15311o.isEmpty() && !(this.f15311o instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f15311o = treeMap;
            this.f15314r = treeMap.descendingMap();
        }
        return (SortedMap) this.f15311o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        if (this.f15312p) {
            throw new UnsupportedOperationException();
        }
    }

    public void a() {
        if (this.f15312p) {
            return;
        }
        this.f15311o = this.f15311o.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f15311o);
        this.f15314r = this.f15314r.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f15314r);
        this.f15312p = true;
    }

    public final int b() {
        return this.f15310n.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        o();
        if (!this.f15310n.isEmpty()) {
            this.f15310n.clear();
        }
        if (this.f15311o.isEmpty()) {
            return;
        }
        this.f15311o.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return l(comparable) >= 0 || this.f15311o.containsKey(comparable);
    }

    public final Iterable d() {
        return this.f15311o.isEmpty() ? AbstractC1317n1.a() : this.f15311o.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f15313q == null) {
            this.f15313q = new C1333s1(this, null);
        }
        return this.f15313q;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        Object objEntrySet;
        Object objEntrySet2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC1339u1)) {
            return super.equals(obj);
        }
        AbstractC1339u1 abstractC1339u1 = (AbstractC1339u1) obj;
        int size = size();
        if (size != abstractC1339u1.size()) {
            return false;
        }
        int iB = b();
        if (iB == abstractC1339u1.b()) {
            for (int i7 = 0; i7 < iB; i7++) {
                if (!h(i7).equals(abstractC1339u1.h(i7))) {
                    return false;
                }
            }
            if (iB == size) {
                return true;
            }
            objEntrySet = this.f15311o;
            objEntrySet2 = abstractC1339u1.f15311o;
        } else {
            objEntrySet = entrySet();
            objEntrySet2 = abstractC1339u1.entrySet();
        }
        return objEntrySet.equals(objEntrySet2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        o();
        int iL = l(comparable);
        if (iL >= 0) {
            return ((C1321o1) this.f15310n.get(iL)).setValue(obj);
        }
        o();
        if (this.f15310n.isEmpty() && !(this.f15310n instanceof ArrayList)) {
            this.f15310n = new ArrayList(this.f15309m);
        }
        int i7 = -(iL + 1);
        if (i7 >= this.f15309m) {
            return n().put(comparable, obj);
        }
        int size = this.f15310n.size();
        int i8 = this.f15309m;
        if (size == i8) {
            C1321o1 c1321o1 = (C1321o1) this.f15310n.remove(i8 - 1);
            n().put(c1321o1.e(), c1321o1.getValue());
        }
        this.f15310n.add(i7, new C1321o1(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iL = l(comparable);
        return iL >= 0 ? ((C1321o1) this.f15310n.get(iL)).getValue() : this.f15311o.get(comparable);
    }

    public final Map.Entry h(int i7) {
        return (Map.Entry) this.f15310n.get(i7);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iB = b();
        int iHashCode = 0;
        for (int i7 = 0; i7 < iB; i7++) {
            iHashCode += ((C1321o1) this.f15310n.get(i7)).hashCode();
        }
        return this.f15311o.size() > 0 ? iHashCode + this.f15311o.hashCode() : iHashCode;
    }

    public final boolean k() {
        return this.f15312p;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        o();
        Comparable comparable = (Comparable) obj;
        int iL = l(comparable);
        if (iL >= 0) {
            return m(iL);
        }
        if (this.f15311o.isEmpty()) {
            return null;
        }
        return this.f15311o.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f15310n.size() + this.f15311o.size();
    }
}
