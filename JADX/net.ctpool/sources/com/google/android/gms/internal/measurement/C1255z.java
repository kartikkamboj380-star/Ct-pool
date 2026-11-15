package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1255z implements InterfaceC1196s {
    @Override // com.google.android.gms.internal.measurement.InterfaceC1196s
    public final Double b() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1196s
    public final String c() {
        return "undefined";
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1196s
    public final Iterator e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof C1255z;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1196s
    public final InterfaceC1196s i(String str, C1093g3 c1093g3, List list) {
        throw new IllegalStateException(String.format("Undefined has no function %s", str));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1196s
    public final InterfaceC1196s zzc() {
        return InterfaceC1196s.f14815d;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1196s
    public final Boolean zzd() {
        return Boolean.FALSE;
    }
}
