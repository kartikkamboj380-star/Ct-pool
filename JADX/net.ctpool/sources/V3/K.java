package V3;

/* JADX INFO: loaded from: classes.dex */
final class K extends r {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Object[] f4064t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    static final K f4065u;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final transient Object[] f4066o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final transient int f4067p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final transient Object[] f4068q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final transient int f4069r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final transient int f4070s;

    static {
        Object[] objArr = new Object[0];
        f4064t = objArr;
        f4065u = new K(objArr, 0, objArr, 0, 0);
    }

    K(Object[] objArr, int i7, Object[] objArr2, int i8, int i9) {
        this.f4066o = objArr;
        this.f4067p = i7;
        this.f4068q = objArr2;
        this.f4069r = i8;
        this.f4070s = i9;
    }

    @Override // V3.AbstractC0486n
    int c(Object[] objArr, int i7) {
        System.arraycopy(this.f4066o, 0, objArr, i7, this.f4070s);
        return i7 + this.f4070s;
    }

    @Override // V3.AbstractC0486n, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        Object[] objArr = this.f4068q;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int iC = AbstractC0485m.c(obj);
        while (true) {
            int i7 = iC & this.f4069r;
            Object obj2 = objArr[i7];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iC = i7 + 1;
        }
    }

    @Override // V3.AbstractC0486n
    Object[] f() {
        return this.f4066o;
    }

    @Override // V3.AbstractC0486n
    int h() {
        return this.f4070s;
    }

    @Override // V3.r, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f4067p;
    }

    @Override // V3.AbstractC0486n
    int i() {
        return 0;
    }

    @Override // V3.AbstractC0486n
    boolean k() {
        return false;
    }

    @Override // V3.r
    AbstractC0487o q() {
        return AbstractC0487o.n(this.f4066o, this.f4070s);
    }

    @Override // V3.r
    boolean r() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f4070s;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public S iterator() {
        return m().iterator();
    }
}
