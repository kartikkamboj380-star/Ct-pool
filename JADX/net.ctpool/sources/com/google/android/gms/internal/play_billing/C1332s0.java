package com.google.android.gms.internal.play_billing;

import com.google.android.gms.common.api.Api;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1332s0 extends B implements RandomAccess, InterfaceC1344w0, InterfaceC1277d1 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final C1332s0 f15297p = new C1332s0(new int[0], 0, false);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int[] f15298n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f15299o;

    private C1332s0(int[] iArr, int i7, boolean z6) {
        super(z6);
        this.f15298n = iArr;
        this.f15299o = i7;
    }

    public static C1332s0 h() {
        return f15297p;
    }

    private final String k(int i7) {
        return "Index:" + i7 + ", Size:" + this.f15299o;
    }

    private final void m(int i7) {
        if (i7 < 0 || i7 >= this.f15299o) {
            throw new IndexOutOfBoundsException(k(i7));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i7, Object obj) {
        int i8;
        int iIntValue = ((Integer) obj).intValue();
        c();
        if (i7 < 0 || i7 > (i8 = this.f15299o)) {
            throw new IndexOutOfBoundsException(k(i7));
        }
        int i9 = i7 + 1;
        int[] iArr = this.f15298n;
        if (i8 < iArr.length) {
            System.arraycopy(iArr, i7, iArr, i9, i8 - i7);
        } else {
            int[] iArr2 = new int[((i8 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i7);
            System.arraycopy(this.f15298n, i7, iArr2, i9, this.f15299o - i7);
            this.f15298n = iArr2;
        }
        this.f15298n[i7] = iIntValue;
        this.f15299o++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.B, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        byte[] bArr = AbstractC1353z0.f15324d;
        collection.getClass();
        if (!(collection instanceof C1332s0)) {
            return super.addAll(collection);
        }
        C1332s0 c1332s0 = (C1332s0) collection;
        int i7 = c1332s0.f15299o;
        if (i7 == 0) {
            return false;
        }
        int i8 = this.f15299o;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i8 < i7) {
            throw new OutOfMemoryError();
        }
        int i9 = i8 + i7;
        int[] iArr = this.f15298n;
        if (i9 > iArr.length) {
            this.f15298n = Arrays.copyOf(iArr, i9);
        }
        System.arraycopy(c1332s0.f15298n, 0, this.f15298n, this.f15299o, c1332s0.f15299o);
        this.f15299o = i9;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.play_billing.B, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1332s0)) {
            return super.equals(obj);
        }
        C1332s0 c1332s0 = (C1332s0) obj;
        if (this.f15299o != c1332s0.f15299o) {
            return false;
        }
        int[] iArr = c1332s0.f15298n;
        for (int i7 = 0; i7 < this.f15299o; i7++) {
            if (this.f15298n[i7] != iArr[i7]) {
                return false;
            }
        }
        return true;
    }

    public final int f(int i7) {
        m(i7);
        return this.f15298n[i7];
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1350y0
    public final /* bridge */ /* synthetic */ InterfaceC1350y0 g(int i7) {
        if (i7 >= this.f15299o) {
            return new C1332s0(Arrays.copyOf(this.f15298n, i7), this.f15299o, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i7) {
        m(i7);
        return Integer.valueOf(this.f15298n[i7]);
    }

    @Override // com.google.android.gms.internal.play_billing.B, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i7 = 1;
        for (int i8 = 0; i8 < this.f15299o; i8++) {
            i7 = (i7 * 31) + this.f15298n[i8];
        }
        return i7;
    }

    public final void i(int i7) {
        c();
        int i8 = this.f15299o;
        int[] iArr = this.f15298n;
        if (i8 == iArr.length) {
            int[] iArr2 = new int[((i8 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i8);
            this.f15298n = iArr2;
        }
        int[] iArr3 = this.f15298n;
        int i9 = this.f15299o;
        this.f15299o = i9 + 1;
        iArr3[i9] = i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i7 = this.f15299o;
        for (int i8 = 0; i8 < i7; i8++) {
            if (this.f15298n[i8] == iIntValue) {
                return i8;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.B, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i7) {
        c();
        m(i7);
        int[] iArr = this.f15298n;
        int i8 = iArr[i7];
        if (i7 < this.f15299o - 1) {
            System.arraycopy(iArr, i7 + 1, iArr, i7, (r2 - i7) - 1);
        }
        this.f15299o--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i8);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i7, int i8) {
        c();
        if (i8 < i7) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f15298n;
        System.arraycopy(iArr, i8, iArr, i7, this.f15299o - i8);
        this.f15299o -= i8 - i7;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i7, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        c();
        m(i7);
        int[] iArr = this.f15298n;
        int i8 = iArr[i7];
        iArr[i7] = iIntValue;
        return Integer.valueOf(i8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15299o;
    }

    @Override // com.google.android.gms.internal.play_billing.B, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        i(((Integer) obj).intValue());
        return true;
    }
}
