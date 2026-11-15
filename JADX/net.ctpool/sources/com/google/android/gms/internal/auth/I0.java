package com.google.android.gms.internal.auth;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class I0 extends AbstractC0955c0 implements RandomAccess, J0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final I0 f13807o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final J0 f13808p;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f13809n;

    static {
        I0 i02 = new I0(false);
        f13807o = i02;
        f13808p = i02;
    }

    public I0(int i7) {
        ArrayList arrayList = new ArrayList(i7);
        super(true);
        this.f13809n = arrayList;
    }

    private static String h(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof AbstractC0997q0 ? ((AbstractC0997q0) obj).r(G0.f13795b) : G0.d((byte[]) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i7, Object obj) {
        c();
        this.f13809n.add(i7, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.AbstractC0955c0, java.util.AbstractList, java.util.List
    public final boolean addAll(int i7, Collection collection) {
        c();
        if (collection instanceof J0) {
            collection = ((J0) collection).zzg();
        }
        boolean zAddAll = this.f13809n.addAll(i7, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.google.android.gms.internal.auth.J0
    public final J0 b() {
        return zzc() ? new C1015w1(this) : this;
    }

    @Override // com.google.android.gms.internal.auth.AbstractC0955c0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        c();
        this.f13809n.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final String get(int i7) {
        Object obj = this.f13809n.get(i7);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC0997q0) {
            AbstractC0997q0 abstractC0997q0 = (AbstractC0997q0) obj;
            String strR = abstractC0997q0.r(G0.f13795b);
            if (abstractC0997q0.n()) {
                this.f13809n.set(i7, strR);
            }
            return strR;
        }
        byte[] bArr = (byte[]) obj;
        String strD = G0.d(bArr);
        if (F1.b(bArr)) {
            this.f13809n.set(i7, strD);
        }
        return strD;
    }

    @Override // com.google.android.gms.internal.auth.E0
    public final /* bridge */ /* synthetic */ E0 g(int i7) {
        if (i7 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i7);
        arrayList.addAll(this.f13809n);
        return new I0(arrayList);
    }

    @Override // com.google.android.gms.internal.auth.AbstractC0955c0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i7) {
        c();
        Object objRemove = this.f13809n.remove(i7);
        ((AbstractList) this).modCount++;
        return h(objRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i7, Object obj) {
        c();
        return h(this.f13809n.set(i7, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13809n.size();
    }

    @Override // com.google.android.gms.internal.auth.J0
    public final List zzg() {
        return Collections.unmodifiableList(this.f13809n);
    }

    private I0(ArrayList arrayList) {
        super(true);
        this.f13809n = arrayList;
    }

    @Override // com.google.android.gms.internal.auth.AbstractC0955c0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    private I0(boolean z6) {
        super(false);
        this.f13809n = Collections.emptyList();
    }
}
