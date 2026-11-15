package k;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: k.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1813b implements Iterable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    c f20437m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private c f20438n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private WeakHashMap f20439o = new WeakHashMap();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f20440p = 0;

    /* JADX INFO: renamed from: k.b$a */
    static class a extends e {
        a(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // k.C1813b.e
        c d(c cVar) {
            return cVar.f20444p;
        }

        @Override // k.C1813b.e
        c e(c cVar) {
            return cVar.f20443o;
        }
    }

    /* JADX INFO: renamed from: k.b$b, reason: collision with other inner class name */
    private static class C0275b extends e {
        C0275b(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // k.C1813b.e
        c d(c cVar) {
            return cVar.f20443o;
        }

        @Override // k.C1813b.e
        c e(c cVar) {
            return cVar.f20444p;
        }
    }

    /* JADX INFO: renamed from: k.b$c */
    static class c implements Map.Entry {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final Object f20441m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final Object f20442n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        c f20443o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        c f20444p;

        c(Object obj, Object obj2) {
            this.f20441m = obj;
            this.f20442n = obj2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f20441m.equals(cVar.f20441m) && this.f20442n.equals(cVar.f20442n);
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f20441m;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f20442n;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f20441m.hashCode() ^ this.f20442n.hashCode();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f20441m + "=" + this.f20442n;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k.b$d */
    public class d implements Iterator, f {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private c f20445m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f20446n = true;

        d() {
        }

        @Override // k.C1813b.f
        public void c(c cVar) {
            c cVar2 = this.f20445m;
            if (cVar == cVar2) {
                c cVar3 = cVar2.f20444p;
                this.f20445m = cVar3;
                this.f20446n = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            c cVar;
            if (this.f20446n) {
                this.f20446n = false;
                cVar = C1813b.this.f20437m;
            } else {
                c cVar2 = this.f20445m;
                cVar = cVar2 != null ? cVar2.f20443o : null;
            }
            this.f20445m = cVar;
            return this.f20445m;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f20446n) {
                return C1813b.this.f20437m != null;
            }
            c cVar = this.f20445m;
            return (cVar == null || cVar.f20443o == null) ? false : true;
        }
    }

    /* JADX INFO: renamed from: k.b$e */
    private static abstract class e implements Iterator, f {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        c f20448m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        c f20449n;

        e(c cVar, c cVar2) {
            this.f20448m = cVar2;
            this.f20449n = cVar;
        }

        private c g() {
            c cVar = this.f20449n;
            c cVar2 = this.f20448m;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return e(cVar);
        }

        @Override // k.C1813b.f
        public void c(c cVar) {
            if (this.f20448m == cVar && cVar == this.f20449n) {
                this.f20449n = null;
                this.f20448m = null;
            }
            c cVar2 = this.f20448m;
            if (cVar2 == cVar) {
                this.f20448m = d(cVar2);
            }
            if (this.f20449n == cVar) {
                this.f20449n = g();
            }
        }

        abstract c d(c cVar);

        abstract c e(c cVar);

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            c cVar = this.f20449n;
            this.f20449n = g();
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f20449n != null;
        }
    }

    /* JADX INFO: renamed from: k.b$f */
    interface f {
        void c(c cVar);
    }

    public Map.Entry c() {
        return this.f20437m;
    }

    public Iterator descendingIterator() {
        C0275b c0275b = new C0275b(this.f20438n, this.f20437m);
        this.f20439o.put(c0275b, Boolean.FALSE);
        return c0275b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1813b)) {
            return false;
        }
        C1813b c1813b = (C1813b) obj;
        if (size() != c1813b.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = c1813b.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    protected c f(Object obj) {
        c cVar = this.f20437m;
        while (cVar != null && !cVar.f20441m.equals(obj)) {
            cVar = cVar.f20443o;
        }
        return cVar;
    }

    public d h() {
        d dVar = new d();
        this.f20439o.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += ((Map.Entry) it.next()).hashCode();
        }
        return iHashCode;
    }

    public Map.Entry i() {
        return this.f20438n;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        a aVar = new a(this.f20437m, this.f20438n);
        this.f20439o.put(aVar, Boolean.FALSE);
        return aVar;
    }

    protected c k(Object obj, Object obj2) {
        c cVar = new c(obj, obj2);
        this.f20440p++;
        c cVar2 = this.f20438n;
        if (cVar2 == null) {
            this.f20437m = cVar;
        } else {
            cVar2.f20443o = cVar;
            cVar.f20444p = cVar2;
        }
        this.f20438n = cVar;
        return cVar;
    }

    public Object m(Object obj, Object obj2) {
        c cVarF = f(obj);
        if (cVarF != null) {
            return cVarF.f20442n;
        }
        k(obj, obj2);
        return null;
    }

    public Object n(Object obj) {
        c cVarF = f(obj);
        if (cVarF == null) {
            return null;
        }
        this.f20440p--;
        if (!this.f20439o.isEmpty()) {
            Iterator it = this.f20439o.keySet().iterator();
            while (it.hasNext()) {
                ((f) it.next()).c(cVarF);
            }
        }
        c cVar = cVarF.f20444p;
        c cVar2 = cVarF.f20443o;
        if (cVar != null) {
            cVar.f20443o = cVar2;
        } else {
            this.f20437m = cVar2;
        }
        c cVar3 = cVarF.f20443o;
        if (cVar3 != null) {
            cVar3.f20444p = cVar;
        } else {
            this.f20438n = cVar;
        }
        cVarF.f20443o = null;
        cVarF.f20444p = null;
        return cVarF.f20442n;
    }

    public int size() {
        return this.f20440p;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
