package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class E0 extends B implements RandomAccess, F0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final E0 f15044o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final F0 f15045p;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f15046n;

    static {
        E0 e02 = new E0(false);
        f15044o = e02;
        f15045p = e02;
    }

    public E0(int i7) {
        ArrayList arrayList = new ArrayList(i7);
        super(true);
        this.f15046n = arrayList;
    }

    private static String h(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof S ? ((S) obj).s(AbstractC1353z0.f15322b) : AbstractC1353z0.d((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.play_billing.F0
    public final Object U(int i7) {
        return this.f15046n.get(i7);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i7, Object obj) {
        c();
        this.f15046n.add(i7, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.B, java.util.AbstractList, java.util.List
    public final boolean addAll(int i7, Collection collection) {
        c();
        if (collection instanceof F0) {
            collection = ((F0) collection).e();
        }
        boolean zAddAll = this.f15046n.addAll(i7, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.google.android.gms.internal.play_billing.F0
    public final F0 b() {
        return zzc() ? new C1(this) : this;
    }

    @Override // com.google.android.gms.internal.play_billing.B, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        c();
        this.f15046n.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.F0
    public final List e() {
        return Collections.unmodifiableList(this.f15046n);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final String get(int i7) {
        Object obj = this.f15046n.get(i7);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof S) {
            S s6 = (S) obj;
            String strS = s6.s(AbstractC1353z0.f15322b);
            if (s6.o()) {
                this.f15046n.set(i7, strS);
            }
            return strS;
        }
        byte[] bArr = (byte[]) obj;
        String strD = AbstractC1353z0.d(bArr);
        if (M1.d(bArr)) {
            this.f15046n.set(i7, strD);
        }
        return strD;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1350y0
    public final /* bridge */ /* synthetic */ InterfaceC1350y0 g(int i7) {
        if (i7 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i7);
        arrayList.addAll(this.f15046n);
        return new E0(arrayList);
    }

    @Override // com.google.android.gms.internal.play_billing.B, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i7) {
        c();
        Object objRemove = this.f15046n.remove(i7);
        ((AbstractList) this).modCount++;
        return h(objRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i7, Object obj) {
        c();
        return h(this.f15046n.set(i7, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15046n.size();
    }

    private E0(ArrayList arrayList) {
        super(true);
        this.f15046n = arrayList;
    }

    @Override // com.google.android.gms.internal.play_billing.B, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    private E0(boolean z6) {
        super(false);
        this.f15046n = Collections.emptyList();
    }
}
