package V3;

import V3.AbstractC0486n;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: V3.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0488p implements Map, Serializable {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static final Map.Entry[] f4126p = new Map.Entry[0];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private transient r f4127m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private transient r f4128n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private transient AbstractC0486n f4129o;

    /* JADX INFO: renamed from: V3.p$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Comparator f4130a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object[] f4131b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f4132c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f4133d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        C0092a f4134e;

        /* JADX INFO: renamed from: V3.p$a$a, reason: collision with other inner class name */
        static final class C0092a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Object f4135a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Object f4136b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final Object f4137c;

            C0092a(Object obj, Object obj2, Object obj3) {
                this.f4135a = obj;
                this.f4136b = obj2;
                this.f4137c = obj3;
            }

            IllegalArgumentException a() {
                String strValueOf = String.valueOf(this.f4135a);
                String strValueOf2 = String.valueOf(this.f4136b);
                String strValueOf3 = String.valueOf(this.f4135a);
                String strValueOf4 = String.valueOf(this.f4137c);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 39 + strValueOf2.length() + strValueOf3.length() + strValueOf4.length());
                sb.append("Multiple entries with same key: ");
                sb.append(strValueOf);
                sb.append("=");
                sb.append(strValueOf2);
                sb.append(" and ");
                sb.append(strValueOf3);
                sb.append("=");
                sb.append(strValueOf4);
                return new IllegalArgumentException(sb.toString());
            }
        }

        a(int i7) {
            this.f4131b = new Object[i7 * 2];
        }

        private AbstractC0488p a(boolean z6) {
            Object[] objArrD;
            C0092a c0092a;
            C0092a c0092a2;
            if (z6 && (c0092a2 = this.f4134e) != null) {
                throw c0092a2.a();
            }
            int length = this.f4132c;
            if (this.f4130a == null) {
                objArrD = this.f4131b;
            } else {
                if (this.f4133d) {
                    this.f4131b = Arrays.copyOf(this.f4131b, length * 2);
                }
                objArrD = this.f4131b;
                if (!z6) {
                    objArrD = d(objArrD, this.f4132c);
                    if (objArrD.length < this.f4131b.length) {
                        length = objArrD.length >>> 1;
                    }
                }
                f(objArrD, length, this.f4130a);
            }
            this.f4133d = true;
            J jI = J.i(length, objArrD, this);
            if (!z6 || (c0092a = this.f4134e) == null) {
                return jI;
            }
            throw c0092a.a();
        }

        private void c(int i7) {
            int i8 = i7 * 2;
            Object[] objArr = this.f4131b;
            if (i8 > objArr.length) {
                this.f4131b = Arrays.copyOf(objArr, AbstractC0486n.b.a(objArr.length, i8));
                this.f4133d = false;
            }
        }

        private Object[] d(Object[] objArr, int i7) {
            HashSet hashSet = new HashSet();
            BitSet bitSet = new BitSet();
            for (int i8 = i7 - 1; i8 >= 0; i8--) {
                Object obj = objArr[i8 * 2];
                Objects.requireNonNull(obj);
                if (!hashSet.add(obj)) {
                    bitSet.set(i8);
                }
            }
            if (bitSet.isEmpty()) {
                return objArr;
            }
            Object[] objArr2 = new Object[(i7 - bitSet.cardinality()) * 2];
            int i9 = 0;
            int i10 = 0;
            while (i9 < i7 * 2) {
                if (bitSet.get(i9 >>> 1)) {
                    i9 += 2;
                } else {
                    int i11 = i10 + 1;
                    int i12 = i9 + 1;
                    Object obj2 = objArr[i9];
                    Objects.requireNonNull(obj2);
                    objArr2[i10] = obj2;
                    i10 += 2;
                    i9 += 2;
                    Object obj3 = objArr[i12];
                    Objects.requireNonNull(obj3);
                    objArr2[i11] = obj3;
                }
            }
            return objArr2;
        }

        static void f(Object[] objArr, int i7, Comparator comparator) {
            Map.Entry[] entryArr = new Map.Entry[i7];
            for (int i8 = 0; i8 < i7; i8++) {
                int i9 = i8 * 2;
                Object obj = objArr[i9];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i9 + 1];
                Objects.requireNonNull(obj2);
                entryArr[i8] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            Arrays.sort(entryArr, 0, i7, G.a(comparator).e(z.d()));
            for (int i10 = 0; i10 < i7; i10++) {
                int i11 = i10 * 2;
                objArr[i11] = entryArr[i10].getKey();
                objArr[i11 + 1] = entryArr[i10].getValue();
            }
        }

        public AbstractC0488p b() {
            return a(true);
        }

        public a e(Object obj, Object obj2) {
            c(this.f4132c + 1);
            AbstractC0479g.a(obj, obj2);
            Object[] objArr = this.f4131b;
            int i7 = this.f4132c;
            objArr[i7 * 2] = obj;
            objArr[(i7 * 2) + 1] = obj2;
            this.f4132c = i7 + 1;
            return this;
        }
    }

    AbstractC0488p() {
    }

    public static AbstractC0488p g() {
        return J.f4050t;
    }

    abstract r a();

    abstract r b();

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    abstract AbstractC0486n d();

    @Override // java.util.Map
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public r entrySet() {
        r rVar = this.f4127m;
        if (rVar != null) {
            return rVar;
        }
        r rVarA = a();
        this.f4127m = rVarA;
        return rVarA;
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return z.a(this, obj);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public r keySet() {
        r rVar = this.f4128n;
        if (rVar != null) {
            return rVar;
        }
        r rVarB = b();
        this.f4128n = rVarB;
        return rVarB;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public AbstractC0486n values() {
        AbstractC0486n abstractC0486n = this.f4129o;
        if (abstractC0486n != null) {
            return abstractC0486n;
        }
        AbstractC0486n abstractC0486nD = d();
        this.f4129o = abstractC0486nD;
        return abstractC0486nD;
    }

    @Override // java.util.Map
    public int hashCode() {
        return M.b(entrySet());
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return z.c(this);
    }
}
