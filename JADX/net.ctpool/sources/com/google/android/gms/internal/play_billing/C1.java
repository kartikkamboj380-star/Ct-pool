package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class C1 extends AbstractList implements RandomAccess, F0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final F0 f15037m;

    public C1(F0 f02) {
        this.f15037m = f02;
    }

    @Override // com.google.android.gms.internal.play_billing.F0
    public final Object U(int i7) {
        return this.f15037m.U(i7);
    }

    @Override // com.google.android.gms.internal.play_billing.F0
    public final F0 b() {
        return this;
    }

    @Override // com.google.android.gms.internal.play_billing.F0
    public final List e() {
        return this.f15037m.e();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i7) {
        return ((E0) this.f15037m).get(i7);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new B1(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i7) {
        return new A1(this, i7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15037m.size();
    }
}
