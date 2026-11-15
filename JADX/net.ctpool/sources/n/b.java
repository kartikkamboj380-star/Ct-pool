package n;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Collection, Set {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int[] f21274q = new int[0];

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Object[] f21275r = new Object[0];

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static Object[] f21276s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static int f21277t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static Object[] f21278u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static int f21279v;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int[] f21280m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object[] f21281n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f21282o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private f f21283p;

    class a extends f {
        a() {
        }

        @Override // n.f
        protected void a() {
            b.this.clear();
        }

        @Override // n.f
        protected Object b(int i7, int i8) {
            return b.this.f21281n[i7];
        }

        @Override // n.f
        protected Map c() {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // n.f
        protected int d() {
            return b.this.f21282o;
        }

        @Override // n.f
        protected int e(Object obj) {
            return b.this.indexOf(obj);
        }

        @Override // n.f
        protected int f(Object obj) {
            return b.this.indexOf(obj);
        }

        @Override // n.f
        protected void g(Object obj, Object obj2) {
            b.this.add(obj);
        }

        @Override // n.f
        protected void h(int i7) {
            b.this.n(i7);
        }

        @Override // n.f
        protected Object i(int i7, Object obj) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public b() {
        this(0);
    }

    private void c(int i7) {
        if (i7 == 8) {
            synchronized (b.class) {
                try {
                    Object[] objArr = f21278u;
                    if (objArr != null) {
                        this.f21281n = objArr;
                        f21278u = (Object[]) objArr[0];
                        this.f21280m = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f21279v--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i7 == 4) {
            synchronized (b.class) {
                try {
                    Object[] objArr2 = f21276s;
                    if (objArr2 != null) {
                        this.f21281n = objArr2;
                        f21276s = (Object[]) objArr2[0];
                        this.f21280m = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f21277t--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f21280m = new int[i7];
        this.f21281n = new Object[i7];
    }

    private static void h(int[] iArr, Object[] objArr, int i7) {
        if (iArr.length == 8) {
            synchronized (b.class) {
                try {
                    if (f21279v < 10) {
                        objArr[0] = f21278u;
                        objArr[1] = iArr;
                        for (int i8 = i7 - 1; i8 >= 2; i8--) {
                            objArr[i8] = null;
                        }
                        f21278u = objArr;
                        f21279v++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (b.class) {
                try {
                    if (f21277t < 10) {
                        objArr[0] = f21276s;
                        objArr[1] = iArr;
                        for (int i9 = i7 - 1; i9 >= 2; i9--) {
                            objArr[i9] = null;
                        }
                        f21276s = objArr;
                        f21277t++;
                    }
                } finally {
                }
            }
        }
    }

    private f i() {
        if (this.f21283p == null) {
            this.f21283p = new a();
        }
        return this.f21283p;
    }

    private int k(Object obj, int i7) {
        int i8 = this.f21282o;
        if (i8 == 0) {
            return -1;
        }
        int iA = c.a(this.f21280m, i8, i7);
        if (iA < 0 || obj.equals(this.f21281n[iA])) {
            return iA;
        }
        int i9 = iA + 1;
        while (i9 < i8 && this.f21280m[i9] == i7) {
            if (obj.equals(this.f21281n[i9])) {
                return i9;
            }
            i9++;
        }
        for (int i10 = iA - 1; i10 >= 0 && this.f21280m[i10] == i7; i10--) {
            if (obj.equals(this.f21281n[i10])) {
                return i10;
            }
        }
        return ~i9;
    }

    private int m() {
        int i7 = this.f21282o;
        if (i7 == 0) {
            return -1;
        }
        int iA = c.a(this.f21280m, i7, 0);
        if (iA < 0 || this.f21281n[iA] == null) {
            return iA;
        }
        int i8 = iA + 1;
        while (i8 < i7 && this.f21280m[i8] == 0) {
            if (this.f21281n[i8] == null) {
                return i8;
            }
            i8++;
        }
        for (int i9 = iA - 1; i9 >= 0 && this.f21280m[i9] == 0; i9--) {
            if (this.f21281n[i9] == null) {
                return i9;
            }
        }
        return ~i8;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        int i7;
        int iK;
        if (obj == null) {
            iK = m();
            i7 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i7 = iHashCode;
            iK = k(obj, iHashCode);
        }
        if (iK >= 0) {
            return false;
        }
        int i8 = ~iK;
        int i9 = this.f21282o;
        int[] iArr = this.f21280m;
        if (i9 >= iArr.length) {
            int i10 = 8;
            if (i9 >= 8) {
                i10 = (i9 >> 1) + i9;
            } else if (i9 < 4) {
                i10 = 4;
            }
            Object[] objArr = this.f21281n;
            c(i10);
            int[] iArr2 = this.f21280m;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f21281n, 0, objArr.length);
            }
            h(iArr, objArr, this.f21282o);
        }
        int i11 = this.f21282o;
        if (i8 < i11) {
            int[] iArr3 = this.f21280m;
            int i12 = i8 + 1;
            System.arraycopy(iArr3, i8, iArr3, i12, i11 - i8);
            Object[] objArr2 = this.f21281n;
            System.arraycopy(objArr2, i8, objArr2, i12, this.f21282o - i8);
        }
        this.f21280m[i8] = i7;
        this.f21281n[i8] = obj;
        this.f21282o++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        f(this.f21282o + collection.size());
        Iterator it = collection.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i7 = this.f21282o;
        if (i7 != 0) {
            h(this.f21280m, this.f21281n, i7);
            this.f21280m = f21274q;
            this.f21281n = f21275r;
            this.f21282o = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i7 = 0; i7 < this.f21282o; i7++) {
                try {
                    if (!set.contains(o(i7))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public void f(int i7) {
        int[] iArr = this.f21280m;
        if (iArr.length < i7) {
            Object[] objArr = this.f21281n;
            c(i7);
            int i8 = this.f21282o;
            if (i8 > 0) {
                System.arraycopy(iArr, 0, this.f21280m, 0, i8);
                System.arraycopy(objArr, 0, this.f21281n, 0, this.f21282o);
            }
            h(iArr, objArr, this.f21282o);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f21280m;
        int i7 = this.f21282o;
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            i8 += iArr[i9];
        }
        return i8;
    }

    public int indexOf(Object obj) {
        return obj == null ? m() : k(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f21282o <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return i().m().iterator();
    }

    public Object n(int i7) {
        Object[] objArr = this.f21281n;
        Object obj = objArr[i7];
        int i8 = this.f21282o;
        if (i8 <= 1) {
            h(this.f21280m, objArr, i8);
            this.f21280m = f21274q;
            this.f21281n = f21275r;
            this.f21282o = 0;
        } else {
            int[] iArr = this.f21280m;
            if (iArr.length <= 8 || i8 >= iArr.length / 3) {
                int i9 = i8 - 1;
                this.f21282o = i9;
                if (i7 < i9) {
                    int i10 = i7 + 1;
                    System.arraycopy(iArr, i10, iArr, i7, i9 - i7);
                    Object[] objArr2 = this.f21281n;
                    System.arraycopy(objArr2, i10, objArr2, i7, this.f21282o - i7);
                }
                this.f21281n[this.f21282o] = null;
            } else {
                c(i8 > 8 ? i8 + (i8 >> 1) : 8);
                this.f21282o--;
                if (i7 > 0) {
                    System.arraycopy(iArr, 0, this.f21280m, 0, i7);
                    System.arraycopy(objArr, 0, this.f21281n, 0, i7);
                }
                int i11 = this.f21282o;
                if (i7 < i11) {
                    int i12 = i7 + 1;
                    System.arraycopy(iArr, i12, this.f21280m, i7, i11 - i7);
                    System.arraycopy(objArr, i12, this.f21281n, i7, this.f21282o - i7);
                }
            }
        }
        return obj;
    }

    public Object o(int i7) {
        return this.f21281n[i7];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        n(iIndexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        boolean z6 = false;
        for (int i7 = this.f21282o - 1; i7 >= 0; i7--) {
            if (!collection.contains(this.f21281n[i7])) {
                n(i7);
                z6 = true;
            }
        }
        return z6;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f21282o;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i7 = this.f21282o;
        Object[] objArr = new Object[i7];
        System.arraycopy(this.f21281n, 0, objArr, 0, i7);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f21282o * 14);
        sb.append('{');
        for (int i7 = 0; i7 < this.f21282o; i7++) {
            if (i7 > 0) {
                sb.append(", ");
            }
            Object objO = o(i7);
            if (objO != this) {
                sb.append(objO);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public b(int i7) {
        if (i7 == 0) {
            this.f21280m = f21274q;
            this.f21281n = f21275r;
        } else {
            c(i7);
        }
        this.f21282o = 0;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray(Object[] objArr) {
        if (objArr.length < this.f21282o) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f21282o);
        }
        System.arraycopy(this.f21281n, 0, objArr, 0, this.f21282o);
        int length = objArr.length;
        int i7 = this.f21282o;
        if (length > i7) {
            objArr[i7] = null;
        }
        return objArr;
    }
}
