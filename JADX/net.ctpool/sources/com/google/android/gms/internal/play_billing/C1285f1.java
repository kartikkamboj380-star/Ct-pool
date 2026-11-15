package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.f1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1285f1 extends B implements RandomAccess {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final C1285f1 f15177p = new C1285f1(new Object[0], 0, false);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Object[] f15178n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f15179o;

    private C1285f1(Object[] objArr, int i7, boolean z6) {
        super(z6);
        this.f15178n = objArr;
        this.f15179o = i7;
    }

    public static C1285f1 f() {
        return f15177p;
    }

    private final String h(int i7) {
        return "Index:" + i7 + ", Size:" + this.f15179o;
    }

    private final void i(int i7) {
        if (i7 < 0 || i7 >= this.f15179o) {
            throw new IndexOutOfBoundsException(h(i7));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        int i8;
        c();
        if (i7 < 0 || i7 > (i8 = this.f15179o)) {
            throw new IndexOutOfBoundsException(h(i7));
        }
        int i9 = i7 + 1;
        Object[] objArr = this.f15178n;
        if (i8 < objArr.length) {
            System.arraycopy(objArr, i7, objArr, i9, i8 - i7);
        } else {
            Object[] objArr2 = new Object[((i8 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i7);
            System.arraycopy(this.f15178n, i7, objArr2, i9, this.f15179o - i7);
            this.f15178n = objArr2;
        }
        this.f15178n[i7] = obj;
        this.f15179o++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1350y0
    public final /* bridge */ /* synthetic */ InterfaceC1350y0 g(int i7) {
        if (i7 >= this.f15179o) {
            return new C1285f1(Arrays.copyOf(this.f15178n, i7), this.f15179o, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        i(i7);
        return this.f15178n[i7];
    }

    @Override // com.google.android.gms.internal.play_billing.B, java.util.AbstractList, java.util.List
    public final Object remove(int i7) {
        c();
        i(i7);
        Object[] objArr = this.f15178n;
        Object obj = objArr[i7];
        if (i7 < this.f15179o - 1) {
            System.arraycopy(objArr, i7 + 1, objArr, i7, (r2 - i7) - 1);
        }
        this.f15179o--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        c();
        i(i7);
        Object[] objArr = this.f15178n;
        Object obj2 = objArr[i7];
        objArr[i7] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15179o;
    }

    @Override // com.google.android.gms.internal.play_billing.B, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        c();
        int i7 = this.f15179o;
        Object[] objArr = this.f15178n;
        if (i7 == objArr.length) {
            this.f15178n = Arrays.copyOf(objArr, ((i7 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f15178n;
        int i8 = this.f15179o;
        this.f15179o = i8 + 1;
        objArr2[i8] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
