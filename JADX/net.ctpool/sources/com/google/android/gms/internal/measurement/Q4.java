package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.Api;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
final class Q4 extends L3 implements F4, InterfaceC1185q5, RandomAccess {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final long[] f14323p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Q4 f14324q;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long[] f14325n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f14326o;

    static {
        long[] jArr = new long[0];
        f14323p = jArr;
        f14324q = new Q4(jArr, 0, false);
    }

    private Q4(long[] jArr, int i7, boolean z6) {
        super(z6);
        this.f14325n = jArr;
        this.f14326o = i7;
    }

    public static Q4 h() {
        return f14324q;
    }

    private static int k(int i7) {
        return Math.max(((i7 * 3) / 2) + 1, 10);
    }

    private final String m(int i7) {
        return "Index:" + i7 + ", Size:" + this.f14326o;
    }

    private final void n(int i7) {
        if (i7 < 0 || i7 >= this.f14326o) {
            throw new IndexOutOfBoundsException(m(i7));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i7, Object obj) {
        int i8;
        long jLongValue = ((Long) obj).longValue();
        c();
        if (i7 < 0 || i7 > (i8 = this.f14326o)) {
            throw new IndexOutOfBoundsException(m(i7));
        }
        long[] jArr = this.f14325n;
        if (i8 < jArr.length) {
            System.arraycopy(jArr, i7, jArr, i7 + 1, i8 - i7);
        } else {
            long[] jArr2 = new long[k(jArr.length)];
            System.arraycopy(this.f14325n, 0, jArr2, 0, i7);
            System.arraycopy(this.f14325n, i7, jArr2, i7 + 1, this.f14326o - i7);
            this.f14325n = jArr2;
        }
        this.f14325n[i7] = jLongValue;
        this.f14326o++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.L3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        B4.e(collection);
        if (!(collection instanceof Q4)) {
            return super.addAll(collection);
        }
        Q4 q42 = (Q4) collection;
        int i7 = q42.f14326o;
        if (i7 == 0) {
            return false;
        }
        int i8 = this.f14326o;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i8 < i7) {
            throw new OutOfMemoryError();
        }
        int i9 = i8 + i7;
        long[] jArr = this.f14325n;
        if (i9 > jArr.length) {
            this.f14325n = Arrays.copyOf(jArr, i9);
        }
        System.arraycopy(q42.f14325n, 0, this.f14325n, this.f14326o, q42.f14326o);
        this.f14326o = i9;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.measurement.L3, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q4)) {
            return super.equals(obj);
        }
        Q4 q42 = (Q4) obj;
        if (this.f14326o != q42.f14326o) {
            return false;
        }
        long[] jArr = q42.f14325n;
        for (int i7 = 0; i7 < this.f14326o; i7++) {
            if (this.f14325n[i7] != jArr[i7]) {
                return false;
            }
        }
        return true;
    }

    public final void f(long j7) {
        c();
        int i7 = this.f14326o;
        long[] jArr = this.f14325n;
        if (i7 == jArr.length) {
            long[] jArr2 = new long[k(jArr.length)];
            System.arraycopy(this.f14325n, 0, jArr2, 0, this.f14326o);
            this.f14325n = jArr2;
        }
        long[] jArr3 = this.f14325n;
        int i8 = this.f14326o;
        this.f14326o = i8 + 1;
        jArr3[i8] = j7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i7) {
        return Long.valueOf(j(i7));
    }

    @Override // com.google.android.gms.internal.measurement.L3, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iB = 1;
        for (int i7 = 0; i7 < this.f14326o; i7++) {
            iB = (iB * 31) + B4.b(this.f14325n[i7]);
        }
        return iB;
    }

    final void i(int i7) {
        long[] jArr = this.f14325n;
        if (i7 <= jArr.length) {
            return;
        }
        if (jArr.length == 0) {
            this.f14325n = new long[Math.max(i7, 10)];
            return;
        }
        int length = jArr.length;
        while (length < i7) {
            length = k(length);
        }
        this.f14325n = Arrays.copyOf(this.f14325n, length);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            if (this.f14325n[i7] == jLongValue) {
                return i7;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.F4
    public final long j(int i7) {
        n(i7);
        return this.f14325n[i7];
    }

    @Override // com.google.android.gms.internal.measurement.J4
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final F4 d(int i7) {
        if (i7 >= this.f14326o) {
            return new Q4(i7 == 0 ? f14323p : Arrays.copyOf(this.f14325n, i7), this.f14326o, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.L3, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i7) {
        c();
        n(i7);
        long[] jArr = this.f14325n;
        long j7 = jArr[i7];
        if (i7 < this.f14326o - 1) {
            System.arraycopy(jArr, i7 + 1, jArr, i7, (r3 - i7) - 1);
        }
        this.f14326o--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j7);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i7, int i8) {
        c();
        if (i8 < i7) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f14325n;
        System.arraycopy(jArr, i8, jArr, i7, this.f14326o - i8);
        this.f14326o -= i8 - i7;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i7, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        c();
        n(i7);
        long[] jArr = this.f14325n;
        long j7 = jArr[i7];
        jArr[i7] = jLongValue;
        return Long.valueOf(j7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14326o;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        f(((Long) obj).longValue());
        return true;
    }
}
