package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1098h implements InterfaceC1196s {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f14597m;

    public C1098h(Boolean bool) {
        this.f14597m = bool == null ? false : bool.booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1196s
    public final Double b() {
        return Double.valueOf(this.f14597m ? 1.0d : 0.0d);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1196s
    public final String c() {
        return Boolean.toString(this.f14597m);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1196s
    public final Iterator e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1098h) && this.f14597m == ((C1098h) obj).f14597m;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f14597m).hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1196s
    public final InterfaceC1196s i(String str, C1093g3 c1093g3, List list) {
        if ("toString".equals(str)) {
            return new C1214u(Boolean.toString(this.f14597m));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", Boolean.toString(this.f14597m), str));
    }

    public final String toString() {
        return String.valueOf(this.f14597m);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1196s
    public final InterfaceC1196s zzc() {
        return new C1098h(Boolean.valueOf(this.f14597m));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1196s
    public final Boolean zzd() {
        return Boolean.valueOf(this.f14597m);
    }
}
