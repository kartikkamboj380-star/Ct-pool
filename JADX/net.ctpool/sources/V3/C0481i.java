package V3;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: V3.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C0481i extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final Object f4091v = new Object();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private transient Object f4092m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    transient int[] f4093n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    transient Object[] f4094o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    transient Object[] f4095p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private transient int f4096q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private transient int f4097r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private transient Set f4098s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private transient Set f4099t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private transient Collection f4100u;

    /* JADX INFO: renamed from: V3.i$a */
    class a extends e {
        a() {
            super(C0481i.this, null);
        }

        @Override // V3.C0481i.e
        Object d(int i7) {
            return C0481i.this.H(i7);
        }
    }

    /* JADX INFO: renamed from: V3.i$b */
    class b extends e {
        b() {
            super(C0481i.this, null);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // V3.C0481i.e
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map.Entry d(int i7) {
            return C0481i.this.new g(i7);
        }
    }

    /* JADX INFO: renamed from: V3.i$c */
    class c extends e {
        c() {
            super(C0481i.this, null);
        }

        @Override // V3.C0481i.e
        Object d(int i7) {
            return C0481i.this.X(i7);
        }
    }

    /* JADX INFO: renamed from: V3.i$d */
    class d extends AbstractSet {
        d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C0481i.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map mapX = C0481i.this.x();
            if (mapX != null) {
                return mapX.entrySet().contains(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int iE = C0481i.this.E(entry.getKey());
            return iE != -1 && U3.f.a(C0481i.this.X(iE), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return C0481i.this.z();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map mapX = C0481i.this.x();
            if (mapX != null) {
                return mapX.entrySet().remove(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (C0481i.this.K()) {
                return false;
            }
            int iC = C0481i.this.C();
            int iF = AbstractC0482j.f(entry.getKey(), entry.getValue(), iC, C0481i.this.O(), C0481i.this.M(), C0481i.this.N(), C0481i.this.P());
            if (iF == -1) {
                return false;
            }
            C0481i.this.J(iF, iC);
            C0481i.f(C0481i.this);
            C0481i.this.D();
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C0481i.this.size();
        }
    }

    /* JADX INFO: renamed from: V3.i$e */
    private abstract class e implements Iterator {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f4105m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f4106n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f4107o;

        private e() {
            this.f4105m = C0481i.this.f4096q;
            this.f4106n = C0481i.this.A();
            this.f4107o = -1;
        }

        private void c() {
            if (C0481i.this.f4096q != this.f4105m) {
                throw new ConcurrentModificationException();
            }
        }

        abstract Object d(int i7);

        void e() {
            this.f4105m += 32;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f4106n >= 0;
        }

        @Override // java.util.Iterator
        public Object next() {
            c();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i7 = this.f4106n;
            this.f4107o = i7;
            Object objD = d(i7);
            this.f4106n = C0481i.this.B(this.f4106n);
            return objD;
        }

        @Override // java.util.Iterator
        public void remove() {
            c();
            AbstractC0479g.c(this.f4107o >= 0);
            e();
            C0481i c0481i = C0481i.this;
            c0481i.remove(c0481i.H(this.f4107o));
            this.f4106n = C0481i.this.p(this.f4106n, this.f4107o);
            this.f4107o = -1;
        }

        /* synthetic */ e(C0481i c0481i, a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: V3.i$f */
    class f extends AbstractSet {
        f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C0481i.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return C0481i.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return C0481i.this.I();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map mapX = C0481i.this.x();
            return mapX != null ? mapX.keySet().remove(obj) : C0481i.this.L(obj) != C0481i.f4091v;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C0481i.this.size();
        }
    }

    /* JADX INFO: renamed from: V3.i$g */
    final class g extends AbstractC0475c {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final Object f4110m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f4111n;

        g(int i7) {
            this.f4110m = C0481i.this.H(i7);
            this.f4111n = i7;
        }

        private void a() {
            int i7 = this.f4111n;
            if (i7 == -1 || i7 >= C0481i.this.size() || !U3.f.a(this.f4110m, C0481i.this.H(this.f4111n))) {
                this.f4111n = C0481i.this.E(this.f4110m);
            }
        }

        @Override // V3.AbstractC0475c, java.util.Map.Entry
        public Object getKey() {
            return this.f4110m;
        }

        @Override // V3.AbstractC0475c, java.util.Map.Entry
        public Object getValue() {
            Map mapX = C0481i.this.x();
            if (mapX != null) {
                return E.a(mapX.get(this.f4110m));
            }
            a();
            int i7 = this.f4111n;
            return i7 == -1 ? E.b() : C0481i.this.X(i7);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            Map mapX = C0481i.this.x();
            if (mapX != null) {
                return E.a(mapX.put(this.f4110m, obj));
            }
            a();
            int i7 = this.f4111n;
            if (i7 == -1) {
                C0481i.this.put(this.f4110m, obj);
                return E.b();
            }
            Object objX = C0481i.this.X(i7);
            C0481i.this.W(this.f4111n, obj);
            return objX;
        }
    }

    /* JADX INFO: renamed from: V3.i$h */
    class h extends AbstractCollection {
        h() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            C0481i.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return C0481i.this.Y();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return C0481i.this.size();
        }
    }

    C0481i() {
        F(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int C() {
        return (1 << (this.f4096q & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int E(Object obj) {
        if (K()) {
            return -1;
        }
        int iC = AbstractC0485m.c(obj);
        int iC2 = C();
        int iH = AbstractC0482j.h(O(), iC & iC2);
        if (iH == 0) {
            return -1;
        }
        int iB = AbstractC0482j.b(iC, iC2);
        do {
            int i7 = iH - 1;
            int iY = y(i7);
            if (AbstractC0482j.b(iY, iC2) == iB && U3.f.a(obj, H(i7))) {
                return i7;
            }
            iH = AbstractC0482j.c(iY, iC2);
        } while (iH != 0);
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object H(int i7) {
        return N()[i7];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object L(Object obj) {
        if (K()) {
            return f4091v;
        }
        int iC = C();
        int iF = AbstractC0482j.f(obj, null, iC, O(), M(), N(), null);
        if (iF == -1) {
            return f4091v;
        }
        Object objX = X(iF);
        J(iF, iC);
        this.f4097r--;
        D();
        return objX;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] M() {
        int[] iArr = this.f4093n;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] N() {
        Object[] objArr = this.f4094o;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object O() {
        Object obj = this.f4092m;
        Objects.requireNonNull(obj);
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] P() {
        Object[] objArr = this.f4095p;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    private void R(int i7) {
        int iMin;
        int length = M().length;
        if (i7 <= length || (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) == length) {
            return;
        }
        Q(iMin);
    }

    private int S(int i7, int i8, int i9, int i10) {
        Object objA = AbstractC0482j.a(i8);
        int i11 = i8 - 1;
        if (i10 != 0) {
            AbstractC0482j.i(objA, i9 & i11, i10 + 1);
        }
        Object objO = O();
        int[] iArrM = M();
        for (int i12 = 0; i12 <= i7; i12++) {
            int iH = AbstractC0482j.h(objO, i12);
            while (iH != 0) {
                int i13 = iH - 1;
                int i14 = iArrM[i13];
                int iB = AbstractC0482j.b(i14, i7) | i12;
                int i15 = iB & i11;
                int iH2 = AbstractC0482j.h(objA, i15);
                AbstractC0482j.i(objA, i15, iH);
                iArrM[i13] = AbstractC0482j.d(iB, iH2, i11);
                iH = AbstractC0482j.c(i14, i7);
            }
        }
        this.f4092m = objA;
        U(i11);
        return i11;
    }

    private void T(int i7, int i8) {
        M()[i7] = i8;
    }

    private void U(int i7) {
        this.f4096q = AbstractC0482j.d(this.f4096q, 32 - Integer.numberOfLeadingZeros(i7), 31);
    }

    private void V(int i7, Object obj) {
        N()[i7] = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W(int i7, Object obj) {
        P()[i7] = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object X(int i7) {
        return P()[i7];
    }

    static /* synthetic */ int f(C0481i c0481i) {
        int i7 = c0481i.f4097r;
        c0481i.f4097r = i7 - 1;
        return i7;
    }

    public static C0481i s() {
        return new C0481i();
    }

    private int y(int i7) {
        return M()[i7];
    }

    int A() {
        return isEmpty() ? -1 : 0;
    }

    int B(int i7) {
        int i8 = i7 + 1;
        if (i8 < this.f4097r) {
            return i8;
        }
        return -1;
    }

    void D() {
        this.f4096q += 32;
    }

    void F(int i7) {
        U3.h.e(i7 >= 0, "Expected size must be >= 0");
        this.f4096q = W3.a.a(i7, 1, 1073741823);
    }

    void G(int i7, Object obj, Object obj2, int i8, int i9) {
        T(i7, AbstractC0482j.d(i8, 0, i9));
        V(i7, obj);
        W(i7, obj2);
    }

    Iterator I() {
        Map mapX = x();
        return mapX != null ? mapX.keySet().iterator() : new a();
    }

    void J(int i7, int i8) {
        Object objO = O();
        int[] iArrM = M();
        Object[] objArrN = N();
        Object[] objArrP = P();
        int size = size();
        int i9 = size - 1;
        if (i7 >= i9) {
            objArrN[i7] = null;
            objArrP[i7] = null;
            iArrM[i7] = 0;
            return;
        }
        Object obj = objArrN[i9];
        objArrN[i7] = obj;
        objArrP[i7] = objArrP[i9];
        objArrN[i9] = null;
        objArrP[i9] = null;
        iArrM[i7] = iArrM[i9];
        iArrM[i9] = 0;
        int iC = AbstractC0485m.c(obj) & i8;
        int iH = AbstractC0482j.h(objO, iC);
        if (iH == size) {
            AbstractC0482j.i(objO, iC, i7 + 1);
            return;
        }
        while (true) {
            int i10 = iH - 1;
            int i11 = iArrM[i10];
            int iC2 = AbstractC0482j.c(i11, i8);
            if (iC2 == size) {
                iArrM[i10] = AbstractC0482j.d(i11, i7 + 1, i8);
                return;
            }
            iH = iC2;
        }
    }

    boolean K() {
        return this.f4092m == null;
    }

    void Q(int i7) {
        this.f4093n = Arrays.copyOf(M(), i7);
        this.f4094o = Arrays.copyOf(N(), i7);
        this.f4095p = Arrays.copyOf(P(), i7);
    }

    Iterator Y() {
        Map mapX = x();
        return mapX != null ? mapX.values().iterator() : new c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (K()) {
            return;
        }
        D();
        Map mapX = x();
        if (mapX != null) {
            this.f4096q = W3.a.a(size(), 3, 1073741823);
            mapX.clear();
            this.f4092m = null;
        } else {
            Arrays.fill(N(), 0, this.f4097r, (Object) null);
            Arrays.fill(P(), 0, this.f4097r, (Object) null);
            AbstractC0482j.g(O());
            Arrays.fill(M(), 0, this.f4097r, 0);
        }
        this.f4097r = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Map mapX = x();
        return mapX != null ? mapX.containsKey(obj) : E(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        Map mapX = x();
        if (mapX != null) {
            return mapX.containsValue(obj);
        }
        for (int i7 = 0; i7 < this.f4097r; i7++) {
            if (U3.f.a(obj, X(i7))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        Set set = this.f4099t;
        if (set != null) {
            return set;
        }
        Set setT = t();
        this.f4099t = setT;
        return setT;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Map mapX = x();
        if (mapX != null) {
            return mapX.get(obj);
        }
        int iE = E(obj);
        if (iE == -1) {
            return null;
        }
        o(iE);
        return X(iE);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set set = this.f4098s;
        if (set != null) {
            return set;
        }
        Set setV = v();
        this.f4098s = setV;
        return setV;
    }

    int p(int i7, int i8) {
        return i7 - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        int iS;
        if (K()) {
            q();
        }
        Map mapX = x();
        if (mapX != null) {
            return mapX.put(obj, obj2);
        }
        int[] iArrM = M();
        Object[] objArrN = N();
        Object[] objArrP = P();
        int i7 = this.f4097r;
        int i8 = i7 + 1;
        int iC = AbstractC0485m.c(obj);
        int iC2 = C();
        int i9 = iC & iC2;
        int iH = AbstractC0482j.h(O(), i9);
        if (iH == 0) {
            if (i8 <= iC2) {
                AbstractC0482j.i(O(), i9, i8);
                iS = iC2;
            }
            iS = S(iC2, AbstractC0482j.e(iC2), iC, i7);
        } else {
            int iB = AbstractC0482j.b(iC, iC2);
            int i10 = 0;
            while (true) {
                int i11 = iH - 1;
                int i12 = iArrM[i11];
                if (AbstractC0482j.b(i12, iC2) == iB && U3.f.a(obj, objArrN[i11])) {
                    Object obj3 = objArrP[i11];
                    objArrP[i11] = obj2;
                    o(i11);
                    return obj3;
                }
                int iC3 = AbstractC0482j.c(i12, iC2);
                i10++;
                if (iC3 != 0) {
                    iH = iC3;
                } else {
                    if (i10 >= 9) {
                        return r().put(obj, obj2);
                    }
                    if (i8 <= iC2) {
                        iArrM[i11] = AbstractC0482j.d(i12, i8, iC2);
                    }
                }
            }
            iS = iC2;
        }
        R(i8);
        G(i7, obj, obj2, iC, iS);
        this.f4097r = i8;
        D();
        return null;
    }

    int q() {
        U3.h.o(K(), "Arrays already allocated");
        int i7 = this.f4096q;
        int iJ = AbstractC0482j.j(i7);
        this.f4092m = AbstractC0482j.a(iJ);
        U(iJ - 1);
        this.f4093n = new int[i7];
        this.f4094o = new Object[i7];
        this.f4095p = new Object[i7];
        return i7;
    }

    Map r() {
        Map mapU = u(C() + 1);
        int iA = A();
        while (iA >= 0) {
            mapU.put(H(iA), X(iA));
            iA = B(iA);
        }
        this.f4092m = mapU;
        this.f4093n = null;
        this.f4094o = null;
        this.f4095p = null;
        D();
        return mapU;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        Map mapX = x();
        if (mapX != null) {
            return mapX.remove(obj);
        }
        Object objL = L(obj);
        if (objL == f4091v) {
            return null;
        }
        return objL;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        Map mapX = x();
        return mapX != null ? mapX.size() : this.f4097r;
    }

    Set t() {
        return new d();
    }

    Map u(int i7) {
        return new LinkedHashMap(i7, 1.0f);
    }

    Set v() {
        return new f();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection values() {
        Collection collection = this.f4100u;
        if (collection != null) {
            return collection;
        }
        Collection collectionW = w();
        this.f4100u = collectionW;
        return collectionW;
    }

    Collection w() {
        return new h();
    }

    Map x() {
        Object obj = this.f4092m;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    Iterator z() {
        Map mapX = x();
        return mapX != null ? mapX.entrySet().iterator() : new b();
    }

    void o(int i7) {
    }
}
