package T4;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class h extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final Comparator f3247u = new a();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Comparator f3248m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f3249n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    e f3250o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    int f3251p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    int f3252q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final e f3253r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private b f3254s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private c f3255t;

    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    class b extends AbstractSet {

        class a extends d {
            a() {
                super();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Map.Entry next() {
                return c();
            }
        }

        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            h.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && h.this.d((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            e eVarD;
            if (!(obj instanceof Map.Entry) || (eVarD = h.this.d((Map.Entry) obj)) == null) {
                return false;
            }
            h.this.g(eVarD, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return h.this.f3251p;
        }
    }

    final class c extends AbstractSet {

        class a extends d {
            a() {
                super();
            }

            @Override // java.util.Iterator
            public Object next() {
                return c().f3269r;
            }
        }

        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            h.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return h.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return h.this.h(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return h.this.f3251p;
        }
    }

    private abstract class d implements Iterator {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        e f3260m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        e f3261n = null;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f3262o;

        d() {
            this.f3260m = h.this.f3253r.f3267p;
            this.f3262o = h.this.f3252q;
        }

        final e c() {
            e eVar = this.f3260m;
            h hVar = h.this;
            if (eVar == hVar.f3253r) {
                throw new NoSuchElementException();
            }
            if (hVar.f3252q != this.f3262o) {
                throw new ConcurrentModificationException();
            }
            this.f3260m = eVar.f3267p;
            this.f3261n = eVar;
            return eVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f3260m != h.this.f3253r;
        }

        @Override // java.util.Iterator
        public final void remove() {
            e eVar = this.f3261n;
            if (eVar == null) {
                throw new IllegalStateException();
            }
            h.this.g(eVar, true);
            this.f3261n = null;
            this.f3262o = h.this.f3252q;
        }
    }

    static final class e implements Map.Entry {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        e f3264m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        e f3265n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        e f3266o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        e f3267p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        e f3268q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final Object f3269r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final boolean f3270s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f3271t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f3272u;

        e(boolean z6) {
            this.f3269r = null;
            this.f3270s = z6;
            this.f3268q = this;
            this.f3267p = this;
        }

        public e a() {
            e eVar = this;
            for (e eVar2 = this.f3265n; eVar2 != null; eVar2 = eVar2.f3265n) {
                eVar = eVar2;
            }
            return eVar;
        }

        public e b() {
            e eVar = this;
            for (e eVar2 = this.f3266o; eVar2 != null; eVar2 = eVar2.f3266o) {
                eVar = eVar2;
            }
            return eVar;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f3269r;
            if (obj2 == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!obj2.equals(entry.getKey())) {
                return false;
            }
            Object obj3 = this.f3271t;
            Object value = entry.getValue();
            if (obj3 == null) {
                if (value != null) {
                    return false;
                }
            } else if (!obj3.equals(value)) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f3269r;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f3271t;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Object obj = this.f3269r;
            int iHashCode = obj == null ? 0 : obj.hashCode();
            Object obj2 = this.f3271t;
            return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj == null && !this.f3270s) {
                throw new NullPointerException("value == null");
            }
            Object obj2 = this.f3271t;
            this.f3271t = obj;
            return obj2;
        }

        public String toString() {
            return this.f3269r + "=" + this.f3271t;
        }

        e(boolean z6, e eVar, Object obj, e eVar2, e eVar3) {
            this.f3264m = eVar;
            this.f3269r = obj;
            this.f3270s = z6;
            this.f3272u = 1;
            this.f3267p = eVar2;
            this.f3268q = eVar3;
            eVar3.f3267p = this;
            eVar2.f3268q = this;
        }
    }

    public h() {
        this(f3247u, true);
    }

    private boolean a(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    private void f(e eVar, boolean z6) {
        while (eVar != null) {
            e eVar2 = eVar.f3265n;
            e eVar3 = eVar.f3266o;
            int i7 = eVar2 != null ? eVar2.f3272u : 0;
            int i8 = eVar3 != null ? eVar3.f3272u : 0;
            int i9 = i7 - i8;
            if (i9 == -2) {
                e eVar4 = eVar3.f3265n;
                e eVar5 = eVar3.f3266o;
                int i10 = (eVar4 != null ? eVar4.f3272u : 0) - (eVar5 != null ? eVar5.f3272u : 0);
                if (i10 != -1 && (i10 != 0 || z6)) {
                    k(eVar3);
                }
                j(eVar);
                if (z6) {
                    return;
                }
            } else if (i9 == 2) {
                e eVar6 = eVar2.f3265n;
                e eVar7 = eVar2.f3266o;
                int i11 = (eVar6 != null ? eVar6.f3272u : 0) - (eVar7 != null ? eVar7.f3272u : 0);
                if (i11 != 1 && (i11 != 0 || z6)) {
                    j(eVar2);
                }
                k(eVar);
                if (z6) {
                    return;
                }
            } else if (i9 == 0) {
                eVar.f3272u = i7 + 1;
                if (z6) {
                    return;
                }
            } else {
                eVar.f3272u = Math.max(i7, i8) + 1;
                if (!z6) {
                    return;
                }
            }
            eVar = eVar.f3264m;
        }
    }

    private void i(e eVar, e eVar2) {
        e eVar3 = eVar.f3264m;
        eVar.f3264m = null;
        if (eVar2 != null) {
            eVar2.f3264m = eVar3;
        }
        if (eVar3 == null) {
            this.f3250o = eVar2;
        } else if (eVar3.f3265n == eVar) {
            eVar3.f3265n = eVar2;
        } else {
            eVar3.f3266o = eVar2;
        }
    }

    private void j(e eVar) {
        e eVar2 = eVar.f3265n;
        e eVar3 = eVar.f3266o;
        e eVar4 = eVar3.f3265n;
        e eVar5 = eVar3.f3266o;
        eVar.f3266o = eVar4;
        if (eVar4 != null) {
            eVar4.f3264m = eVar;
        }
        i(eVar, eVar3);
        eVar3.f3265n = eVar;
        eVar.f3264m = eVar3;
        int iMax = Math.max(eVar2 != null ? eVar2.f3272u : 0, eVar4 != null ? eVar4.f3272u : 0) + 1;
        eVar.f3272u = iMax;
        eVar3.f3272u = Math.max(iMax, eVar5 != null ? eVar5.f3272u : 0) + 1;
    }

    private void k(e eVar) {
        e eVar2 = eVar.f3265n;
        e eVar3 = eVar.f3266o;
        e eVar4 = eVar2.f3265n;
        e eVar5 = eVar2.f3266o;
        eVar.f3265n = eVar5;
        if (eVar5 != null) {
            eVar5.f3264m = eVar;
        }
        i(eVar, eVar2);
        eVar2.f3266o = eVar;
        eVar.f3264m = eVar2;
        int iMax = Math.max(eVar3 != null ? eVar3.f3272u : 0, eVar5 != null ? eVar5.f3272u : 0) + 1;
        eVar.f3272u = iMax;
        eVar2.f3272u = Math.max(iMax, eVar4 != null ? eVar4.f3272u : 0) + 1;
    }

    e b(Object obj, boolean z6) {
        int iCompareTo;
        e eVar;
        Comparator comparator = this.f3248m;
        e eVar2 = this.f3250o;
        if (eVar2 != null) {
            Comparable comparable = comparator == f3247u ? (Comparable) obj : null;
            while (true) {
                Object obj2 = eVar2.f3269r;
                iCompareTo = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (iCompareTo == 0) {
                    return eVar2;
                }
                e eVar3 = iCompareTo < 0 ? eVar2.f3265n : eVar2.f3266o;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            iCompareTo = 0;
        }
        if (!z6) {
            return null;
        }
        e eVar4 = this.f3253r;
        if (eVar2 != null) {
            eVar = new e(this.f3249n, eVar2, obj, eVar4, eVar4.f3268q);
            if (iCompareTo < 0) {
                eVar2.f3265n = eVar;
            } else {
                eVar2.f3266o = eVar;
            }
            f(eVar2, true);
        } else {
            if (comparator == f3247u && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName() + " is not Comparable");
            }
            eVar = new e(this.f3249n, eVar2, obj, eVar4, eVar4.f3268q);
            this.f3250o = eVar;
        }
        this.f3251p++;
        this.f3252q++;
        return eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f3250o = null;
        this.f3251p = 0;
        this.f3252q++;
        e eVar = this.f3253r;
        eVar.f3268q = eVar;
        eVar.f3267p = eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return e(obj) != null;
    }

    e d(Map.Entry entry) {
        e eVarE = e(entry.getKey());
        if (eVarE == null || !a(eVarE.f3271t, entry.getValue())) {
            return null;
        }
        return eVarE;
    }

    e e(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return b(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        b bVar = this.f3254s;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b();
        this.f3254s = bVar2;
        return bVar2;
    }

    void g(e eVar, boolean z6) {
        int i7;
        if (z6) {
            e eVar2 = eVar.f3268q;
            eVar2.f3267p = eVar.f3267p;
            eVar.f3267p.f3268q = eVar2;
        }
        e eVar3 = eVar.f3265n;
        e eVar4 = eVar.f3266o;
        e eVar5 = eVar.f3264m;
        int i8 = 0;
        if (eVar3 == null || eVar4 == null) {
            if (eVar3 != null) {
                i(eVar, eVar3);
                eVar.f3265n = null;
            } else if (eVar4 != null) {
                i(eVar, eVar4);
                eVar.f3266o = null;
            } else {
                i(eVar, null);
            }
            f(eVar5, false);
            this.f3251p--;
            this.f3252q++;
            return;
        }
        e eVarB = eVar3.f3272u > eVar4.f3272u ? eVar3.b() : eVar4.a();
        g(eVarB, false);
        e eVar6 = eVar.f3265n;
        if (eVar6 != null) {
            i7 = eVar6.f3272u;
            eVarB.f3265n = eVar6;
            eVar6.f3264m = eVarB;
            eVar.f3265n = null;
        } else {
            i7 = 0;
        }
        e eVar7 = eVar.f3266o;
        if (eVar7 != null) {
            i8 = eVar7.f3272u;
            eVarB.f3266o = eVar7;
            eVar7.f3264m = eVarB;
            eVar.f3266o = null;
        }
        eVarB.f3272u = Math.max(i7, i8) + 1;
        i(eVar, eVarB);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        e eVarE = e(obj);
        if (eVarE != null) {
            return eVarE.f3271t;
        }
        return null;
    }

    e h(Object obj) {
        e eVarE = e(obj);
        if (eVarE != null) {
            g(eVarE, true);
        }
        return eVarE;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        c cVar = this.f3255t;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        this.f3255t = cVar2;
        return cVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.f3249n) {
            throw new NullPointerException("value == null");
        }
        e eVarB = b(obj, true);
        Object obj3 = eVarB.f3271t;
        eVarB.f3271t = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        e eVarH = h(obj);
        if (eVarH != null) {
            return eVarH.f3271t;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f3251p;
    }

    public h(Comparator comparator, boolean z6) {
        this.f3251p = 0;
        this.f3252q = 0;
        this.f3248m = comparator == null ? f3247u : comparator;
        this.f3249n = z6;
        this.f3253r = new e(z6);
    }

    public h(boolean z6) {
        this(f3247u, z6);
    }
}
