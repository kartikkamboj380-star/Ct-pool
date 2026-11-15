package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1179q implements InterfaceC1196s {
    @Override // com.google.android.gms.internal.measurement.InterfaceC1196s
    public final Double b() {
        return Double.valueOf(0.0d);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1196s
    public final String c() {
        return "null";
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1196s
    public final Iterator e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof C1179q;
    }

    public final int hashCode() {
        return 1;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1196s
    public final InterfaceC1196s i(String str, C1093g3 c1093g3, List list) {
        throw new IllegalStateException(String.format("null has no function %s", str));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1196s
    public final InterfaceC1196s zzc() {
        return InterfaceC1196s.f14816e;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1196s
    public final Boolean zzd() {
        return Boolean.FALSE;
    }
}
