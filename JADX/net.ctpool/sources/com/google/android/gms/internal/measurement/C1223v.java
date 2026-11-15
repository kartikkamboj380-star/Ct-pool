package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1223v implements InterfaceC1196s {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f14928m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ArrayList f14929n;

    public C1223v(String str, List list) {
        this.f14928m = str;
        ArrayList arrayList = new ArrayList();
        this.f14929n = arrayList;
        arrayList.addAll(list);
    }

    public final String a() {
        return this.f14928m;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1196s
    public final Double b() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1196s
    public final String c() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    public final ArrayList d() {
        return this.f14929n;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1196s
    public final Iterator e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1223v)) {
            return false;
        }
        C1223v c1223v = (C1223v) obj;
        String str = this.f14928m;
        if (str == null ? c1223v.f14928m != null : !str.equals(c1223v.f14928m)) {
            return false;
        }
        ArrayList arrayList = this.f14929n;
        ArrayList arrayList2 = c1223v.f14929n;
        return arrayList != null ? arrayList.equals(arrayList2) : arrayList2 == null;
    }

    public final int hashCode() {
        String str = this.f14928m;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        ArrayList arrayList = this.f14929n;
        return iHashCode + (arrayList != null ? arrayList.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1196s
    public final InterfaceC1196s i(String str, C1093g3 c1093g3, List list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1196s
    public final InterfaceC1196s zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1196s
    public final Boolean zzd() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }
}
