package com.google.android.gms.internal.auth;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.w1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1015w1 extends AbstractList implements RandomAccess, J0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final J0 f14045m;

    public C1015w1(J0 j02) {
        this.f14045m = j02;
    }

    @Override // com.google.android.gms.internal.auth.J0
    public final J0 b() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i7) {
        return ((I0) this.f14045m).get(i7);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C1012v1(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i7) {
        return new C1009u1(this, i7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14045m.size();
    }

    @Override // com.google.android.gms.internal.auth.J0
    public final List zzg() {
        return this.f14045m.zzg();
    }
}
