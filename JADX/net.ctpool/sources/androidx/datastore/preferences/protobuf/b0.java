package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
final class b0 extends AbstractC0608c implements RandomAccess {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final b0 f7572p;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Object[] f7573n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f7574o;

    static {
        b0 b0Var = new b0(new Object[0], 0);
        f7572p = b0Var;
        b0Var.z();
    }

    private b0(Object[] objArr, int i7) {
        this.f7573n = objArr;
        this.f7574o = i7;
    }

    private static Object[] f(int i7) {
        return new Object[i7];
    }

    public static b0 h() {
        return f7572p;
    }

    private void i(int i7) {
        if (i7 < 0 || i7 >= this.f7574o) {
            throw new IndexOutOfBoundsException(k(i7));
        }
    }

    private String k(int i7) {
        return "Index:" + i7 + ", Size:" + this.f7574o;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i7, Object obj) {
        int i8;
        c();
        if (i7 < 0 || i7 > (i8 = this.f7574o)) {
            throw new IndexOutOfBoundsException(k(i7));
        }
        Object[] objArr = this.f7573n;
        if (i8 < objArr.length) {
            System.arraycopy(objArr, i7, objArr, i7 + 1, i8 - i7);
        } else {
            Object[] objArrF = f(((i8 * 3) / 2) + 1);
            System.arraycopy(this.f7573n, 0, objArrF, 0, i7);
            System.arraycopy(this.f7573n, i7, objArrF, i7 + 1, this.f7574o - i7);
            this.f7573n = objArrF;
        }
        this.f7573n[i7] = obj;
        this.f7574o++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i7) {
        i(i7);
        return this.f7573n[i7];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0629y.b
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public b0 J(int i7) {
        if (i7 >= this.f7574o) {
            return new b0(Arrays.copyOf(this.f7573n, i7), this.f7574o);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public Object remove(int i7) {
        c();
        i(i7);
        Object[] objArr = this.f7573n;
        Object obj = objArr[i7];
        if (i7 < this.f7574o - 1) {
            System.arraycopy(objArr, i7 + 1, objArr, i7, (r2 - i7) - 1);
        }
        this.f7574o--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i7, Object obj) {
        c();
        i(i7);
        Object[] objArr = this.f7573n;
        Object obj2 = objArr[i7];
        objArr[i7] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f7574o;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0608c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        c();
        int i7 = this.f7574o;
        Object[] objArr = this.f7573n;
        if (i7 == objArr.length) {
            this.f7573n = Arrays.copyOf(objArr, ((i7 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f7573n;
        int i8 = this.f7574o;
        this.f7574o = i8 + 1;
        objArr2[i8] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
