package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.r5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1193r5 extends L3 implements RandomAccess {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Object[] f14809p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final C1193r5 f14810q;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Object[] f14811n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f14812o;

    static {
        Object[] objArr = new Object[0];
        f14809p = objArr;
        f14810q = new C1193r5(objArr, 0, false);
    }

    private C1193r5(Object[] objArr, int i7, boolean z6) {
        super(z6);
        this.f14811n = objArr;
        this.f14812o = i7;
    }

    private static int h(int i7) {
        return Math.max(((i7 * 3) / 2) + 1, 10);
    }

    public static C1193r5 i() {
        return f14810q;
    }

    private final String k(int i7) {
        return "Index:" + i7 + ", Size:" + this.f14812o;
    }

    private final void m(int i7) {
        if (i7 < 0 || i7 >= this.f14812o) {
            throw new IndexOutOfBoundsException(k(i7));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        int i8;
        c();
        if (i7 < 0 || i7 > (i8 = this.f14812o)) {
            throw new IndexOutOfBoundsException(k(i7));
        }
        Object[] objArr = this.f14811n;
        if (i8 < objArr.length) {
            System.arraycopy(objArr, i7, objArr, i7 + 1, i8 - i7);
        } else {
            Object[] objArr2 = new Object[h(objArr.length)];
            System.arraycopy(this.f14811n, 0, objArr2, 0, i7);
            System.arraycopy(this.f14811n, i7, objArr2, i7 + 1, this.f14812o - i7);
            this.f14811n = objArr2;
        }
        this.f14811n[i7] = obj;
        this.f14812o++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.J4
    public final /* synthetic */ J4 d(int i7) {
        if (i7 >= this.f14812o) {
            return new C1193r5(i7 == 0 ? f14809p : Arrays.copyOf(this.f14811n, i7), this.f14812o, true);
        }
        throw new IllegalArgumentException();
    }

    final void f(int i7) {
        Object[] objArr = this.f14811n;
        if (i7 <= objArr.length) {
            return;
        }
        if (objArr.length == 0) {
            this.f14811n = new Object[Math.max(i7, 10)];
            return;
        }
        int length = objArr.length;
        while (length < i7) {
            length = h(length);
        }
        this.f14811n = Arrays.copyOf(this.f14811n, length);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        m(i7);
        return this.f14811n[i7];
    }

    @Override // com.google.android.gms.internal.measurement.L3, java.util.AbstractList, java.util.List
    public final Object remove(int i7) {
        c();
        m(i7);
        Object[] objArr = this.f14811n;
        Object obj = objArr[i7];
        if (i7 < this.f14812o - 1) {
            System.arraycopy(objArr, i7 + 1, objArr, i7, (r2 - i7) - 1);
        }
        this.f14812o--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        c();
        m(i7);
        Object[] objArr = this.f14811n;
        Object obj2 = objArr[i7];
        objArr[i7] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14812o;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        c();
        int i7 = this.f14812o;
        Object[] objArr = this.f14811n;
        if (i7 == objArr.length) {
            this.f14811n = Arrays.copyOf(this.f14811n, h(objArr.length));
        }
        Object[] objArr2 = this.f14811n;
        int i8 = this.f14812o;
        this.f14812o = i8 + 1;
        objArr2[i8] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
