package com.google.android.gms.internal.measurement;

import android.content.Context;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.c3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1057c3 extends B3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f14536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final U3.k f14537b;

    C1057c3(Context context, U3.k kVar) {
        if (context == null) {
            throw new NullPointerException("Null context");
        }
        this.f14536a = context;
        this.f14537b = kVar;
    }

    @Override // com.google.android.gms.internal.measurement.B3
    final Context a() {
        return this.f14536a;
    }

    @Override // com.google.android.gms.internal.measurement.B3
    final U3.k b() {
        return this.f14537b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof B3) {
            B3 b32 = (B3) obj;
            if (this.f14536a.equals(b32.a())) {
                U3.k kVar = this.f14537b;
                U3.k kVarB = b32.b();
                if (kVar != null ? kVar.equals(kVarB) : kVarB == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f14536a.hashCode() ^ 1000003) * 1000003;
        U3.k kVar = this.f14537b;
        return iHashCode ^ (kVar == null ? 0 : kVar.hashCode());
    }

    public final String toString() {
        return "FlagsContext{context=" + String.valueOf(this.f14536a) + ", hermeticFileOverrides=" + String.valueOf(this.f14537b) + "}";
    }
}
