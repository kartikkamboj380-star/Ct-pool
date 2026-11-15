package V3;

import V3.AbstractC0488p;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class J extends AbstractC0488p {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final AbstractC0488p f4050t = new J(null, new Object[0], 0);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final transient Object f4051q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final transient Object[] f4052r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final transient int f4053s;

    static class a extends r {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final transient AbstractC0488p f4054o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final transient Object[] f4055p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final transient int f4056q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final transient int f4057r;

        /* JADX INFO: renamed from: V3.J$a$a, reason: collision with other inner class name */
        class C0089a extends AbstractC0487o {
            C0089a() {
            }

            @Override // java.util.List
            /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
            public Map.Entry get(int i7) {
                U3.h.g(i7, a.this.f4057r);
                int i8 = i7 * 2;
                Object obj = a.this.f4055p[a.this.f4056q + i8];
                Objects.requireNonNull(obj);
                Object obj2 = a.this.f4055p[i8 + (a.this.f4056q ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            @Override // V3.AbstractC0486n
            public boolean k() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return a.this.f4057r;
            }
        }

        a(AbstractC0488p abstractC0488p, Object[] objArr, int i7, int i8) {
            this.f4054o = abstractC0488p;
            this.f4055p = objArr;
            this.f4056q = i7;
            this.f4057r = i8;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public S iterator() {
            return m().iterator();
        }

        @Override // V3.AbstractC0486n
        int c(Object[] objArr, int i7) {
            return m().c(objArr, i7);
        }

        @Override // V3.AbstractC0486n, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.f4054o.get(key));
        }

        @Override // V3.AbstractC0486n
        boolean k() {
            return true;
        }

        @Override // V3.r
        AbstractC0487o q() {
            return new C0089a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f4057r;
        }
    }

    static final class b extends r {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final transient AbstractC0488p f4059o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final transient AbstractC0487o f4060p;

        b(AbstractC0488p abstractC0488p, AbstractC0487o abstractC0487o) {
            this.f4059o = abstractC0488p;
            this.f4060p = abstractC0487o;
        }

        @Override // V3.AbstractC0486n
        int c(Object[] objArr, int i7) {
            return m().c(objArr, i7);
        }

        @Override // V3.AbstractC0486n, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f4059o.get(obj) != null;
        }

        @Override // V3.AbstractC0486n
        boolean k() {
            return true;
        }

        @Override // V3.r
        public AbstractC0487o m() {
            return this.f4060p;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f4059o.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public S iterator() {
            return m().iterator();
        }
    }

    static final class c extends AbstractC0487o {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final transient Object[] f4061o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final transient int f4062p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final transient int f4063q;

        c(Object[] objArr, int i7, int i8) {
            this.f4061o = objArr;
            this.f4062p = i7;
            this.f4063q = i8;
        }

        @Override // java.util.List
        public Object get(int i7) {
            U3.h.g(i7, this.f4063q);
            Object obj = this.f4061o[(i7 * 2) + this.f4062p];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // V3.AbstractC0486n
        boolean k() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f4063q;
        }
    }

    private J(Object obj, Object[] objArr, int i7) {
        this.f4051q = obj;
        this.f4052r = objArr;
        this.f4053s = i7;
    }

    static J i(int i7, Object[] objArr, AbstractC0488p.a aVar) {
        if (i7 == 0) {
            return (J) f4050t;
        }
        if (i7 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[1];
            Objects.requireNonNull(obj2);
            AbstractC0479g.a(obj, obj2);
            return new J(null, objArr, 1);
        }
        U3.h.k(i7, objArr.length >> 1);
        Object objJ = j(objArr, i7, r.n(i7), 0);
        if (objJ instanceof Object[]) {
            Object[] objArr2 = (Object[]) objJ;
            AbstractC0488p.a.C0092a c0092a = (AbstractC0488p.a.C0092a) objArr2[2];
            if (aVar == null) {
                throw c0092a.a();
            }
            aVar.f4134e = c0092a;
            Object obj3 = objArr2[0];
            int iIntValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, iIntValue * 2);
            objJ = obj3;
            i7 = iIntValue;
        }
        return new J(objJ, objArr, i7);
    }

    private static Object j(Object[] objArr, int i7, int i8, int i9) {
        AbstractC0488p.a.C0092a c0092a = null;
        if (i7 == 1) {
            Object obj = objArr[i9];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[i9 ^ 1];
            Objects.requireNonNull(obj2);
            AbstractC0479g.a(obj, obj2);
            return null;
        }
        int i10 = i8 - 1;
        int i11 = -1;
        if (i8 <= 128) {
            byte[] bArr = new byte[i8];
            Arrays.fill(bArr, (byte) -1);
            int i12 = 0;
            for (int i13 = 0; i13 < i7; i13++) {
                int i14 = (i13 * 2) + i9;
                int i15 = (i12 * 2) + i9;
                Object obj3 = objArr[i14];
                Objects.requireNonNull(obj3);
                Object obj4 = objArr[i14 ^ 1];
                Objects.requireNonNull(obj4);
                AbstractC0479g.a(obj3, obj4);
                int iB = AbstractC0485m.b(obj3.hashCode());
                while (true) {
                    int i16 = iB & i10;
                    int i17 = bArr[i16] & 255;
                    if (i17 == 255) {
                        bArr[i16] = (byte) i15;
                        if (i12 < i13) {
                            objArr[i15] = obj3;
                            objArr[i15 ^ 1] = obj4;
                        }
                        i12++;
                    } else {
                        if (obj3.equals(objArr[i17])) {
                            int i18 = i17 ^ 1;
                            Object obj5 = objArr[i18];
                            Objects.requireNonNull(obj5);
                            c0092a = new AbstractC0488p.a.C0092a(obj3, obj4, obj5);
                            objArr[i18] = obj4;
                            break;
                        }
                        iB = i16 + 1;
                    }
                }
            }
            return i12 == i7 ? bArr : new Object[]{bArr, Integer.valueOf(i12), c0092a};
        }
        if (i8 <= 32768) {
            short[] sArr = new short[i8];
            Arrays.fill(sArr, (short) -1);
            int i19 = 0;
            for (int i20 = 0; i20 < i7; i20++) {
                int i21 = (i20 * 2) + i9;
                int i22 = (i19 * 2) + i9;
                Object obj6 = objArr[i21];
                Objects.requireNonNull(obj6);
                Object obj7 = objArr[i21 ^ 1];
                Objects.requireNonNull(obj7);
                AbstractC0479g.a(obj6, obj7);
                int iB2 = AbstractC0485m.b(obj6.hashCode());
                while (true) {
                    int i23 = iB2 & i10;
                    int i24 = sArr[i23] & 65535;
                    if (i24 == 65535) {
                        sArr[i23] = (short) i22;
                        if (i19 < i20) {
                            objArr[i22] = obj6;
                            objArr[i22 ^ 1] = obj7;
                        }
                        i19++;
                    } else {
                        if (obj6.equals(objArr[i24])) {
                            int i25 = i24 ^ 1;
                            Object obj8 = objArr[i25];
                            Objects.requireNonNull(obj8);
                            c0092a = new AbstractC0488p.a.C0092a(obj6, obj7, obj8);
                            objArr[i25] = obj7;
                            break;
                        }
                        iB2 = i23 + 1;
                    }
                }
            }
            return i19 == i7 ? sArr : new Object[]{sArr, Integer.valueOf(i19), c0092a};
        }
        int[] iArr = new int[i8];
        Arrays.fill(iArr, -1);
        int i26 = 0;
        int i27 = 0;
        while (i26 < i7) {
            int i28 = (i26 * 2) + i9;
            int i29 = (i27 * 2) + i9;
            Object obj9 = objArr[i28];
            Objects.requireNonNull(obj9);
            Object obj10 = objArr[i28 ^ 1];
            Objects.requireNonNull(obj10);
            AbstractC0479g.a(obj9, obj10);
            int iB3 = AbstractC0485m.b(obj9.hashCode());
            while (true) {
                int i30 = iB3 & i10;
                int i31 = iArr[i30];
                if (i31 == i11) {
                    iArr[i30] = i29;
                    if (i27 < i26) {
                        objArr[i29] = obj9;
                        objArr[i29 ^ 1] = obj10;
                    }
                    i27++;
                } else {
                    if (obj9.equals(objArr[i31])) {
                        int i32 = i31 ^ 1;
                        Object obj11 = objArr[i32];
                        Objects.requireNonNull(obj11);
                        c0092a = new AbstractC0488p.a.C0092a(obj9, obj10, obj11);
                        objArr[i32] = obj10;
                        break;
                    }
                    iB3 = i30 + 1;
                    i11 = -1;
                }
            }
            i26++;
            i11 = -1;
        }
        return i27 == i7 ? iArr : new Object[]{iArr, Integer.valueOf(i27), c0092a};
    }

    static Object k(Object obj, Object[] objArr, int i7, int i8, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i7 == 1) {
            Object obj3 = objArr[i8];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i8 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int iB = AbstractC0485m.b(obj2.hashCode());
            while (true) {
                int i9 = iB & length;
                int i10 = bArr[i9] & 255;
                if (i10 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i10])) {
                    return objArr[i10 ^ 1];
                }
                iB = i9 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int iB2 = AbstractC0485m.b(obj2.hashCode());
            while (true) {
                int i11 = iB2 & length2;
                int i12 = sArr[i11] & 65535;
                if (i12 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i12])) {
                    return objArr[i12 ^ 1];
                }
                iB2 = i11 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int iB3 = AbstractC0485m.b(obj2.hashCode());
            while (true) {
                int i13 = iB3 & length3;
                int i14 = iArr[i13];
                if (i14 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i14])) {
                    return objArr[i14 ^ 1];
                }
                iB3 = i13 + 1;
            }
        }
    }

    @Override // V3.AbstractC0488p
    r a() {
        return new a(this, this.f4052r, 0, this.f4053s);
    }

    @Override // V3.AbstractC0488p
    r b() {
        return new b(this, new c(this.f4052r, 0, this.f4053s));
    }

    @Override // V3.AbstractC0488p
    AbstractC0486n d() {
        return new c(this.f4052r, 1, this.f4053s);
    }

    @Override // V3.AbstractC0488p, java.util.Map
    public Object get(Object obj) {
        Object objK = k(this.f4051q, this.f4052r, this.f4053s, 0, obj);
        if (objK == null) {
            return null;
        }
        return objK;
    }

    @Override // java.util.Map
    public int size() {
        return this.f4053s;
    }
}
