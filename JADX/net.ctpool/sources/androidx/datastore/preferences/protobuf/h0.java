package androidx.datastore.preferences.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
abstract class h0 extends AbstractMap {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f7618m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List f7619n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Map f7620o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f7621p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private volatile g f7622q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Map f7623r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private volatile c f7624s;

    static class a extends h0 {
        a(int i7) {
            super(i7, null);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            androidx.appcompat.app.y.a(obj);
            return super.s(null, obj2);
        }

        @Override // androidx.datastore.preferences.protobuf.h0
        public void q() {
            if (!p()) {
                if (l() > 0) {
                    androidx.appcompat.app.y.a(k(0).getKey());
                    throw null;
                }
                Iterator it = n().iterator();
                if (it.hasNext()) {
                    androidx.appcompat.app.y.a(((Map.Entry) it.next()).getKey());
                    throw null;
                }
            }
            super.q();
        }
    }

    private class b implements Iterator {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f7625m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Iterator f7626n;

        private b() {
            this.f7625m = h0.this.f7619n.size();
        }

        private Iterator c() {
            if (this.f7626n == null) {
                this.f7626n = h0.this.f7623r.entrySet().iterator();
            }
            return this.f7626n;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            Object next;
            if (c().hasNext()) {
                next = c().next();
            } else {
                List list = h0.this.f7619n;
                int i7 = this.f7625m - 1;
                this.f7625m = i7;
                next = list.get(i7);
            }
            return (Map.Entry) next;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i7 = this.f7625m;
            return (i7 > 0 && i7 <= h0.this.f7619n.size()) || c().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        /* synthetic */ b(h0 h0Var, a aVar) {
            this();
        }
    }

    private class c extends g {
        private c() {
            super(h0.this, null);
        }

        @Override // androidx.datastore.preferences.protobuf.h0.g, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new b(h0.this, null);
        }

        /* synthetic */ c(h0 h0Var, a aVar) {
            this();
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Iterator f7629a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final Iterable f7630b = new b();

        static class a implements Iterator {
            a() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        static class b implements Iterable {
            b() {
            }

            @Override // java.lang.Iterable
            public Iterator iterator() {
                return d.f7629a;
            }
        }

        static Iterable b() {
            return f7630b;
        }
    }

    private class e implements Map.Entry, Comparable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final Comparable f7631m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Object f7632n;

        e(Comparable comparable, Object obj) {
            this.f7631m = comparable;
            this.f7632n = obj;
        }

        private boolean h(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public int compareTo(e eVar) {
            return getKey().compareTo(eVar.getKey());
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return h(this.f7631m, entry.getKey()) && h(this.f7632n, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f7632n;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Comparable comparable = this.f7631m;
            int iHashCode = comparable == null ? 0 : comparable.hashCode();
            Object obj = this.f7632n;
            return iHashCode ^ (obj != null ? obj.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Comparable getKey() {
            return this.f7631m;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            h0.this.h();
            Object obj2 = this.f7632n;
            this.f7632n = obj;
            return obj2;
        }

        public String toString() {
            return this.f7631m + "=" + this.f7632n;
        }

        e(h0 h0Var, Map.Entry entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }
    }

    private class f implements Iterator {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f7634m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f7635n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private Iterator f7636o;

        private f() {
            this.f7634m = -1;
        }

        private Iterator c() {
            if (this.f7636o == null) {
                this.f7636o = h0.this.f7620o.entrySet().iterator();
            }
            return this.f7636o;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            this.f7635n = true;
            int i7 = this.f7634m + 1;
            this.f7634m = i7;
            return (Map.Entry) (i7 < h0.this.f7619n.size() ? h0.this.f7619n.get(this.f7634m) : c().next());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f7634m + 1 >= h0.this.f7619n.size()) {
                return !h0.this.f7620o.isEmpty() && c().hasNext();
            }
            return true;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f7635n) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f7635n = false;
            h0.this.h();
            if (this.f7634m >= h0.this.f7619n.size()) {
                c().remove();
                return;
            }
            h0 h0Var = h0.this;
            int i7 = this.f7634m;
            this.f7634m = i7 - 1;
            h0Var.t(i7);
        }

        /* synthetic */ f(h0 h0Var, a aVar) {
            this();
        }
    }

    private class g extends AbstractSet {
        private g() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry entry) {
            if (contains(entry)) {
                return false;
            }
            h0.this.s((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            h0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = h0.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new f(h0.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            h0.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return h0.this.size();
        }

        /* synthetic */ g(h0 h0Var, a aVar) {
            this();
        }
    }

    private h0(int i7) {
        this.f7618m = i7;
        this.f7619n = Collections.emptyList();
        this.f7620o = Collections.emptyMap();
        this.f7623r = Collections.emptyMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int g(Comparable comparable) {
        int i7;
        int i8;
        int size = this.f7619n.size();
        int i9 = size - 1;
        if (i9 < 0) {
            i7 = 0;
            while (i7 <= i9) {
                int i10 = (i7 + i9) / 2;
                int iCompareTo = comparable.compareTo(((e) this.f7619n.get(i10)).getKey());
                if (iCompareTo < 0) {
                    i9 = i10 - 1;
                } else {
                    if (iCompareTo <= 0) {
                        return i10;
                    }
                    i7 = i10 + 1;
                }
            }
            i8 = i7 + 1;
        } else {
            int iCompareTo2 = comparable.compareTo(((e) this.f7619n.get(i9)).getKey());
            if (iCompareTo2 > 0) {
                i8 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i9;
                }
                i7 = 0;
                while (i7 <= i9) {
                }
                i8 = i7 + 1;
            }
        }
        return -i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (this.f7621p) {
            throw new UnsupportedOperationException();
        }
    }

    private void j() {
        h();
        if (!this.f7619n.isEmpty() || (this.f7619n instanceof ArrayList)) {
            return;
        }
        this.f7619n = new ArrayList(this.f7618m);
    }

    private SortedMap o() {
        h();
        if (this.f7620o.isEmpty() && !(this.f7620o instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f7620o = treeMap;
            this.f7623r = treeMap.descendingMap();
        }
        return (SortedMap) this.f7620o;
    }

    static h0 r(int i7) {
        return new a(i7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object t(int i7) {
        h();
        Object value = ((e) this.f7619n.remove(i7)).getValue();
        if (!this.f7620o.isEmpty()) {
            Iterator it = o().entrySet().iterator();
            this.f7619n.add(new e(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        h();
        if (!this.f7619n.isEmpty()) {
            this.f7619n.clear();
        }
        if (this.f7620o.isEmpty()) {
            return;
        }
        this.f7620o.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return g(comparable) >= 0 || this.f7620o.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.f7622q == null) {
            this.f7622q = new g(this, null);
        }
        return this.f7622q;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return super.equals(obj);
        }
        h0 h0Var = (h0) obj;
        int size = size();
        if (size != h0Var.size()) {
            return false;
        }
        int iL = l();
        if (iL != h0Var.l()) {
            return entrySet().equals(h0Var.entrySet());
        }
        for (int i7 = 0; i7 < iL; i7++) {
            if (!k(i7).equals(h0Var.k(i7))) {
                return false;
            }
        }
        if (iL != size) {
            return this.f7620o.equals(h0Var.f7620o);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iG = g(comparable);
        return iG >= 0 ? ((e) this.f7619n.get(iG)).getValue() : this.f7620o.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iL = l();
        int iHashCode = 0;
        for (int i7 = 0; i7 < iL; i7++) {
            iHashCode += ((e) this.f7619n.get(i7)).hashCode();
        }
        return m() > 0 ? iHashCode + this.f7620o.hashCode() : iHashCode;
    }

    Set i() {
        if (this.f7624s == null) {
            this.f7624s = new c(this, null);
        }
        return this.f7624s;
    }

    public Map.Entry k(int i7) {
        return (Map.Entry) this.f7619n.get(i7);
    }

    public int l() {
        return this.f7619n.size();
    }

    public int m() {
        return this.f7620o.size();
    }

    public Iterable n() {
        return this.f7620o.isEmpty() ? d.b() : this.f7620o.entrySet();
    }

    public boolean p() {
        return this.f7621p;
    }

    public void q() {
        if (this.f7621p) {
            return;
        }
        this.f7620o = this.f7620o.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f7620o);
        this.f7623r = this.f7623r.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f7623r);
        this.f7621p = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        h();
        Comparable comparable = (Comparable) obj;
        int iG = g(comparable);
        if (iG >= 0) {
            return t(iG);
        }
        if (this.f7620o.isEmpty()) {
            return null;
        }
        return this.f7620o.remove(comparable);
    }

    public Object s(Comparable comparable, Object obj) {
        h();
        int iG = g(comparable);
        if (iG >= 0) {
            return ((e) this.f7619n.get(iG)).setValue(obj);
        }
        j();
        int i7 = -(iG + 1);
        if (i7 >= this.f7618m) {
            return o().put(comparable, obj);
        }
        int size = this.f7619n.size();
        int i8 = this.f7618m;
        if (size == i8) {
            e eVar = (e) this.f7619n.remove(i8 - 1);
            o().put(eVar.getKey(), eVar.getValue());
        }
        this.f7619n.add(i7, new e(comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f7619n.size() + this.f7620o.size();
    }

    /* synthetic */ h0(int i7, a aVar) {
        this(i7);
    }
}
