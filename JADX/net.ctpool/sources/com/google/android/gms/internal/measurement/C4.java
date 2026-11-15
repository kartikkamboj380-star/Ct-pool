package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.Api;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
final class C4 extends L3 implements H4, InterfaceC1185q5, RandomAccess {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int[] f14152p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final C4 f14153q;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int[] f14154n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f14155o;

    static {
        int[] iArr = new int[0];
        f14152p = iArr;
        f14153q = new C4(iArr, 0, false);
    }

    private C4(int[] iArr, int i7, boolean z6) {
        super(z6);
        this.f14154n = iArr;
        this.f14155o = i7;
    }

    public static C4 h() {
        return f14153q;
    }

    private static int m(int i7) {
        return Math.max(((i7 * 3) / 2) + 1, 10);
    }

    private final String n(int i7) {
        return "Index:" + i7 + ", Size:" + this.f14155o;
    }

    private final void o(int i7) {
        if (i7 < 0 || i7 >= this.f14155o) {
            throw new IndexOutOfBoundsException(n(i7));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i7, Object obj) {
        int i8;
        int iIntValue = ((Integer) obj).intValue();
        c();
        if (i7 < 0 || i7 > (i8 = this.f14155o)) {
            throw new IndexOutOfBoundsException(n(i7));
        }
        int[] iArr = this.f14154n;
        if (i8 < iArr.length) {
            System.arraycopy(iArr, i7, iArr, i7 + 1, i8 - i7);
        } else {
            int[] iArr2 = new int[m(iArr.length)];
            System.arraycopy(this.f14154n, 0, iArr2, 0, i7);
            System.arraycopy(this.f14154n, i7, iArr2, i7 + 1, this.f14155o - i7);
            this.f14154n = iArr2;
        }
        this.f14154n[i7] = iIntValue;
        this.f14155o++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.L3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        B4.e(collection);
        if (!(collection instanceof C4)) {
            return super.addAll(collection);
        }
        C4 c42 = (C4) collection;
        int i7 = c42.f14155o;
        if (i7 == 0) {
            return false;
        }
        int i8 = this.f14155o;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i8 < i7) {
            throw new OutOfMemoryError();
        }
        int i9 = i8 + i7;
        int[] iArr = this.f14154n;
        if (i9 > iArr.length) {
            this.f14154n = Arrays.copyOf(iArr, i9);
        }
        System.arraycopy(c42.f14154n, 0, this.f14154n, this.f14155o, c42.f14155o);
        this.f14155o = i9;
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
        if (!(obj instanceof C4)) {
            return super.equals(obj);
        }
        C4 c42 = (C4) obj;
        if (this.f14155o != c42.f14155o) {
            return false;
        }
        int[] iArr = c42.f14154n;
        for (int i7 = 0; i7 < this.f14155o; i7++) {
            if (this.f14154n[i7] != iArr[i7]) {
                return false;
            }
        }
        return true;
    }

    public final int f(int i7) {
        o(i7);
        return this.f14154n[i7];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i7) {
        return Integer.valueOf(f(i7));
    }

    @Override // com.google.android.gms.internal.measurement.L3, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i7 = 1;
        for (int i8 = 0; i8 < this.f14155o; i8++) {
            i7 = (i7 * 31) + this.f14154n[i8];
        }
        return i7;
    }

    public final void i(int i7) {
        c();
        int i8 = this.f14155o;
        int[] iArr = this.f14154n;
        if (i8 == iArr.length) {
            int[] iArr2 = new int[m(iArr.length)];
            System.arraycopy(this.f14154n, 0, iArr2, 0, this.f14155o);
            this.f14154n = iArr2;
        }
        int[] iArr3 = this.f14154n;
        int i9 = this.f14155o;
        this.f14155o = i9 + 1;
        iArr3[i9] = i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            if (this.f14154n[i7] == iIntValue) {
                return i7;
            }
        }
        return -1;
    }

    final void k(int i7) {
        int[] iArr = this.f14154n;
        if (i7 <= iArr.length) {
            return;
        }
        if (iArr.length == 0) {
            this.f14154n = new int[Math.max(i7, 10)];
            return;
        }
        int length = iArr.length;
        while (length < i7) {
            length = m(length);
        }
        this.f14154n = Arrays.copyOf(this.f14154n, length);
    }

    @Override // com.google.android.gms.internal.measurement.J4
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final H4 d(int i7) {
        if (i7 >= this.f14155o) {
            return new C4(i7 == 0 ? f14152p : Arrays.copyOf(this.f14154n, i7), this.f14155o, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.L3, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i7) {
        c();
        o(i7);
        int[] iArr = this.f14154n;
        int i8 = iArr[i7];
        if (i7 < this.f14155o - 1) {
            System.arraycopy(iArr, i7 + 1, iArr, i7, (r2 - i7) - 1);
        }
        this.f14155o--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i8);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i7, int i8) {
        c();
        if (i8 < i7) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f14154n;
        System.arraycopy(iArr, i8, iArr, i7, this.f14155o - i8);
        this.f14155o -= i8 - i7;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i7, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        c();
        o(i7);
        int[] iArr = this.f14154n;
        int i8 = iArr[i7];
        iArr[i7] = iIntValue;
        return Integer.valueOf(i8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14155o;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        i(((Integer) obj).intValue());
        return true;
    }
}
