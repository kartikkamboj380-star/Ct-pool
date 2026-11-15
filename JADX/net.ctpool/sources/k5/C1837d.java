package k5;

import j5.AbstractC1784C;
import j5.AbstractC1797b;
import j5.AbstractC1803h;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.k;
import x5.InterfaceC2227a;

/* JADX INFO: renamed from: k5.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1837d implements Map, Serializable, InterfaceC2227a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final C1837d f20984A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final a f20985z = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Object[] f20986m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Object[] f20987n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int[] f20988o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int[] f20989p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f20990q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f20991r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f20992s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f20993t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f20994u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private C1839f f20995v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private C1840g f20996w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private C1838e f20997x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f20998y;

    /* JADX INFO: renamed from: k5.d$a */
    public static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int c(int i7) {
            return Integer.highestOneBit(C5.g.c(i7, 1) * 3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int d(int i7) {
            return Integer.numberOfLeadingZeros(i7) + 1;
        }

        public final C1837d e() {
            return C1837d.f20984A;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: k5.d$b */
    public static final class b extends C0297d implements Iterator, InterfaceC2227a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C1837d c1837d) {
            super(c1837d);
            k.f(c1837d, "map");
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public c next() {
            d();
            if (e() >= g().f20991r) {
                throw new NoSuchElementException();
            }
            int iE = e();
            i(iE + 1);
            j(iE);
            c cVar = new c(g(), f());
            h();
            return cVar;
        }

        public final void l(StringBuilder sb) {
            k.f(sb, "sb");
            if (e() >= g().f20991r) {
                throw new NoSuchElementException();
            }
            int iE = e();
            i(iE + 1);
            j(iE);
            Object obj = g().f20986m[f()];
            if (obj == g()) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = g().f20987n;
            k.c(objArr);
            Object obj2 = objArr[f()];
            if (obj2 == g()) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            h();
        }

        public final int m() {
            if (e() >= g().f20991r) {
                throw new NoSuchElementException();
            }
            int iE = e();
            i(iE + 1);
            j(iE);
            Object obj = g().f20986m[f()];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = g().f20987n;
            k.c(objArr);
            Object obj2 = objArr[f()];
            int iHashCode2 = iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
            h();
            return iHashCode2;
        }
    }

    /* JADX INFO: renamed from: k5.d$c */
    public static final class c implements Map.Entry, InterfaceC2227a {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final C1837d f20999m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f21000n;

        public c(C1837d c1837d, int i7) {
            k.f(c1837d, "map");
            this.f20999m = c1837d;
            this.f21000n = i7;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (k.b(entry.getKey(), getKey()) && k.b(entry.getValue(), getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f20999m.f20986m[this.f21000n];
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            Object[] objArr = this.f20999m.f20987n;
            k.c(objArr);
            return objArr[this.f21000n];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Object key = getKey();
            int iHashCode = key != null ? key.hashCode() : 0;
            Object value = getValue();
            return iHashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            this.f20999m.m();
            Object[] objArrK = this.f20999m.k();
            int i7 = this.f21000n;
            Object obj2 = objArrK[i7];
            objArrK[i7] = obj;
            return obj2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append('=');
            sb.append(getValue());
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: k5.d$d, reason: collision with other inner class name */
    public static class C0297d {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final C1837d f21001m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f21002n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f21003o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f21004p;

        public C0297d(C1837d c1837d) {
            k.f(c1837d, "map");
            this.f21001m = c1837d;
            this.f21003o = -1;
            this.f21004p = c1837d.f20993t;
            h();
        }

        public final void d() {
            if (this.f21001m.f20993t != this.f21004p) {
                throw new ConcurrentModificationException();
            }
        }

        public final int e() {
            return this.f21002n;
        }

        public final int f() {
            return this.f21003o;
        }

        public final C1837d g() {
            return this.f21001m;
        }

        public final void h() {
            while (this.f21002n < this.f21001m.f20991r) {
                int[] iArr = this.f21001m.f20988o;
                int i7 = this.f21002n;
                if (iArr[i7] >= 0) {
                    return;
                } else {
                    this.f21002n = i7 + 1;
                }
            }
        }

        public final boolean hasNext() {
            return this.f21002n < this.f21001m.f20991r;
        }

        public final void i(int i7) {
            this.f21002n = i7;
        }

        public final void j(int i7) {
            this.f21003o = i7;
        }

        public final void remove() {
            d();
            if (this.f21003o == -1) {
                throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
            }
            this.f21001m.m();
            this.f21001m.M(this.f21003o);
            this.f21003o = -1;
            this.f21004p = this.f21001m.f20993t;
        }
    }

    /* JADX INFO: renamed from: k5.d$e */
    public static final class e extends C0297d implements Iterator, InterfaceC2227a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C1837d c1837d) {
            super(c1837d);
            k.f(c1837d, "map");
        }

        @Override // java.util.Iterator
        public Object next() {
            d();
            if (e() >= g().f20991r) {
                throw new NoSuchElementException();
            }
            int iE = e();
            i(iE + 1);
            j(iE);
            Object obj = g().f20986m[f()];
            h();
            return obj;
        }
    }

    /* JADX INFO: renamed from: k5.d$f */
    public static final class f extends C0297d implements Iterator, InterfaceC2227a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C1837d c1837d) {
            super(c1837d);
            k.f(c1837d, "map");
        }

        @Override // java.util.Iterator
        public Object next() {
            d();
            if (e() >= g().f20991r) {
                throw new NoSuchElementException();
            }
            int iE = e();
            i(iE + 1);
            j(iE);
            Object[] objArr = g().f20987n;
            k.c(objArr);
            Object obj = objArr[f()];
            h();
            return obj;
        }
    }

    static {
        C1837d c1837d = new C1837d(0);
        c1837d.f20998y = true;
        f20984A = c1837d;
    }

    public C1837d() {
        this(8);
    }

    private final int C(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f20992s;
    }

    private final boolean E(Collection collection) {
        boolean z6 = false;
        if (collection.isEmpty()) {
            return false;
        }
        s(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (F((Map.Entry) it.next())) {
                z6 = true;
            }
        }
        return z6;
    }

    private final boolean F(Map.Entry entry) {
        int iJ = j(entry.getKey());
        Object[] objArrK = k();
        if (iJ >= 0) {
            objArrK[iJ] = entry.getValue();
            return true;
        }
        int i7 = (-iJ) - 1;
        if (k.b(entry.getValue(), objArrK[i7])) {
            return false;
        }
        objArrK[i7] = entry.getValue();
        return true;
    }

    private final boolean G(int i7) {
        int iC = C(this.f20986m[i7]);
        int i8 = this.f20990q;
        while (true) {
            int[] iArr = this.f20989p;
            if (iArr[iC] == 0) {
                iArr[iC] = i7 + 1;
                this.f20988o[i7] = iC;
                return true;
            }
            i8--;
            if (i8 < 0) {
                return false;
            }
            iC = iC == 0 ? y() - 1 : iC - 1;
        }
    }

    private final void H() {
        this.f20993t++;
    }

    private final void I(int i7) {
        H();
        if (this.f20991r > size()) {
            n();
        }
        int i8 = 0;
        if (i7 != y()) {
            this.f20989p = new int[i7];
            this.f20992s = f20985z.d(i7);
        } else {
            AbstractC1803h.j(this.f20989p, 0, 0, y());
        }
        while (i8 < this.f20991r) {
            int i9 = i8 + 1;
            if (!G(i8)) {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
            i8 = i9;
        }
    }

    private final void K(int i7) {
        int iF = C5.g.f(this.f20990q * 2, y() / 2);
        int i8 = 0;
        int i9 = i7;
        do {
            i7 = i7 == 0 ? y() - 1 : i7 - 1;
            i8++;
            if (i8 > this.f20990q) {
                this.f20989p[i9] = 0;
                return;
            }
            int[] iArr = this.f20989p;
            int i10 = iArr[i7];
            if (i10 == 0) {
                iArr[i9] = 0;
                return;
            }
            if (i10 < 0) {
                iArr[i9] = -1;
            } else {
                int i11 = i10 - 1;
                if (((C(this.f20986m[i11]) - i7) & (y() - 1)) >= i8) {
                    this.f20989p[i9] = i10;
                    this.f20988o[i11] = i9;
                }
                iF--;
            }
            i9 = i7;
            i8 = 0;
            iF--;
        } while (iF >= 0);
        this.f20989p[i9] = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(int i7) {
        AbstractC1836c.f(this.f20986m, i7);
        K(this.f20988o[i7]);
        this.f20988o[i7] = -1;
        this.f20994u = size() - 1;
        H();
    }

    private final boolean O(int i7) {
        int iW = w();
        int i8 = this.f20991r;
        int i9 = iW - i8;
        int size = i8 - size();
        return i9 < i7 && i9 + size >= i7 && size >= w() / 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] k() {
        Object[] objArr = this.f20987n;
        if (objArr != null) {
            return objArr;
        }
        Object[] objArrD = AbstractC1836c.d(w());
        this.f20987n = objArrD;
        return objArrD;
    }

    private final void n() {
        int i7;
        Object[] objArr = this.f20987n;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            i7 = this.f20991r;
            if (i8 >= i7) {
                break;
            }
            if (this.f20988o[i8] >= 0) {
                Object[] objArr2 = this.f20986m;
                objArr2[i9] = objArr2[i8];
                if (objArr != null) {
                    objArr[i9] = objArr[i8];
                }
                i9++;
            }
            i8++;
        }
        AbstractC1836c.g(this.f20986m, i9, i7);
        if (objArr != null) {
            AbstractC1836c.g(objArr, i9, this.f20991r);
        }
        this.f20991r = i9;
    }

    private final boolean q(Map map) {
        return size() == map.size() && o(map.entrySet());
    }

    private final void r(int i7) {
        if (i7 < 0) {
            throw new OutOfMemoryError();
        }
        if (i7 > w()) {
            int iD = AbstractC1797b.f20415m.d(w(), i7);
            this.f20986m = AbstractC1836c.e(this.f20986m, iD);
            Object[] objArr = this.f20987n;
            this.f20987n = objArr != null ? AbstractC1836c.e(objArr, iD) : null;
            int[] iArrCopyOf = Arrays.copyOf(this.f20988o, iD);
            k.e(iArrCopyOf, "copyOf(...)");
            this.f20988o = iArrCopyOf;
            int iC = f20985z.c(iD);
            if (iC > y()) {
                I(iC);
            }
        }
    }

    private final void s(int i7) {
        if (O(i7)) {
            I(y());
        } else {
            r(this.f20991r + i7);
        }
    }

    private final int u(Object obj) {
        int iC = C(obj);
        int i7 = this.f20990q;
        while (true) {
            int i8 = this.f20989p[iC];
            if (i8 == 0) {
                return -1;
            }
            if (i8 > 0) {
                int i9 = i8 - 1;
                if (k.b(this.f20986m[i9], obj)) {
                    return i9;
                }
            }
            i7--;
            if (i7 < 0) {
                return -1;
            }
            iC = iC == 0 ? y() - 1 : iC - 1;
        }
    }

    private final int v(Object obj) {
        int i7 = this.f20991r;
        while (true) {
            i7--;
            if (i7 < 0) {
                return -1;
            }
            if (this.f20988o[i7] >= 0) {
                Object[] objArr = this.f20987n;
                k.c(objArr);
                if (k.b(objArr[i7], obj)) {
                    return i7;
                }
            }
        }
    }

    private final int y() {
        return this.f20989p.length;
    }

    public int A() {
        return this.f20994u;
    }

    public Collection B() {
        C1840g c1840g = this.f20996w;
        if (c1840g != null) {
            return c1840g;
        }
        C1840g c1840g2 = new C1840g(this);
        this.f20996w = c1840g2;
        return c1840g2;
    }

    public final e D() {
        return new e(this);
    }

    public final boolean J(Map.Entry entry) {
        k.f(entry, "entry");
        m();
        int iU = u(entry.getKey());
        if (iU < 0) {
            return false;
        }
        Object[] objArr = this.f20987n;
        k.c(objArr);
        if (!k.b(objArr[iU], entry.getValue())) {
            return false;
        }
        M(iU);
        return true;
    }

    public final int L(Object obj) {
        m();
        int iU = u(obj);
        if (iU < 0) {
            return -1;
        }
        M(iU);
        return iU;
    }

    public final boolean N(Object obj) {
        m();
        int iV = v(obj);
        if (iV < 0) {
            return false;
        }
        M(iV);
        return true;
    }

    public final f P() {
        return new f(this);
    }

    @Override // java.util.Map
    public void clear() {
        m();
        AbstractC1784C it = new C5.c(0, this.f20991r - 1).iterator();
        while (it.hasNext()) {
            int iD = it.d();
            int[] iArr = this.f20988o;
            int i7 = iArr[iD];
            if (i7 >= 0) {
                this.f20989p[i7] = 0;
                iArr[iD] = -1;
            }
        }
        AbstractC1836c.g(this.f20986m, 0, this.f20991r);
        Object[] objArr = this.f20987n;
        if (objArr != null) {
            AbstractC1836c.g(objArr, 0, this.f20991r);
        }
        this.f20994u = 0;
        this.f20991r = 0;
        H();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return u(obj) >= 0;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return v(obj) >= 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return x();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof Map) && q((Map) obj));
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        int iU = u(obj);
        if (iU < 0) {
            return null;
        }
        Object[] objArr = this.f20987n;
        k.c(objArr);
        return objArr[iU];
    }

    @Override // java.util.Map
    public int hashCode() {
        b bVarT = t();
        int iM = 0;
        while (bVarT.hasNext()) {
            iM += bVarT.m();
        }
        return iM;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    public final int j(Object obj) {
        m();
        while (true) {
            int iC = C(obj);
            int iF = C5.g.f(this.f20990q * 2, y() / 2);
            int i7 = 0;
            while (true) {
                int i8 = this.f20989p[iC];
                if (i8 <= 0) {
                    if (this.f20991r < w()) {
                        int i9 = this.f20991r;
                        int i10 = i9 + 1;
                        this.f20991r = i10;
                        this.f20986m[i9] = obj;
                        this.f20988o[i9] = iC;
                        this.f20989p[iC] = i10;
                        this.f20994u = size() + 1;
                        H();
                        if (i7 > this.f20990q) {
                            this.f20990q = i7;
                        }
                        return i9;
                    }
                    s(1);
                } else {
                    if (k.b(this.f20986m[i8 - 1], obj)) {
                        return -i8;
                    }
                    i7++;
                    if (i7 > iF) {
                        I(y() * 2);
                        break;
                    }
                    iC = iC == 0 ? y() - 1 : iC - 1;
                }
            }
        }
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return z();
    }

    public final Map l() {
        m();
        this.f20998y = true;
        if (size() > 0) {
            return this;
        }
        C1837d c1837d = f20984A;
        k.d(c1837d, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return c1837d;
    }

    public final void m() {
        if (this.f20998y) {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean o(Collection collection) {
        k.f(collection, "m");
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!p((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean p(Map.Entry entry) {
        k.f(entry, "entry");
        int iU = u(entry.getKey());
        if (iU < 0) {
            return false;
        }
        Object[] objArr = this.f20987n;
        k.c(objArr);
        return k.b(objArr[iU], entry.getValue());
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        m();
        int iJ = j(obj);
        Object[] objArrK = k();
        if (iJ >= 0) {
            objArrK[iJ] = obj2;
            return null;
        }
        int i7 = (-iJ) - 1;
        Object obj3 = objArrK[i7];
        objArrK[i7] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        k.f(map, "from");
        m();
        E(map.entrySet());
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        int iL = L(obj);
        if (iL < 0) {
            return null;
        }
        Object[] objArr = this.f20987n;
        k.c(objArr);
        Object obj2 = objArr[iL];
        AbstractC1836c.f(objArr, iL);
        return obj2;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return A();
    }

    public final b t() {
        return new b(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((size() * 3) + 2);
        sb.append("{");
        b bVarT = t();
        int i7 = 0;
        while (bVarT.hasNext()) {
            if (i7 > 0) {
                sb.append(", ");
            }
            bVarT.l(sb);
            i7++;
        }
        sb.append("}");
        String string = sb.toString();
        k.e(string, "toString(...)");
        return string;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return B();
    }

    public final int w() {
        return this.f20986m.length;
    }

    public Set x() {
        C1838e c1838e = this.f20997x;
        if (c1838e != null) {
            return c1838e;
        }
        C1838e c1838e2 = new C1838e(this);
        this.f20997x = c1838e2;
        return c1838e2;
    }

    public Set z() {
        C1839f c1839f = this.f20995v;
        if (c1839f != null) {
            return c1839f;
        }
        C1839f c1839f2 = new C1839f(this);
        this.f20995v = c1839f2;
        return c1839f2;
    }

    public C1837d(int i7) {
        this(AbstractC1836c.d(i7), null, new int[i7], new int[f20985z.c(i7)], 2, 0);
    }

    private C1837d(Object[] objArr, Object[] objArr2, int[] iArr, int[] iArr2, int i7, int i8) {
        this.f20986m = objArr;
        this.f20987n = objArr2;
        this.f20988o = iArr;
        this.f20989p = iArr2;
        this.f20990q = i7;
        this.f20991r = i8;
        this.f20992s = f20985z.d(y());
    }
}
