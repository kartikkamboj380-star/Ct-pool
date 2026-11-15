package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1134l implements InterfaceC1196s {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final InterfaceC1196s f14726m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f14727n;

    public C1134l(String str) {
        this.f14726m = InterfaceC1196s.f14815d;
        this.f14727n = str;
    }

    public final InterfaceC1196s a() {
        return this.f14726m;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1196s
    public final Double b() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1196s
    public final String c() {
        throw new IllegalStateException("Control is not a String");
    }

    public final String d() {
        return this.f14727n;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1196s
    public final Iterator e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1134l)) {
            return false;
        }
        C1134l c1134l = (C1134l) obj;
        return this.f14727n.equals(c1134l.f14727n) && this.f14726m.equals(c1134l.f14726m);
    }

    public final int hashCode() {
        return (this.f14727n.hashCode() * 31) + this.f14726m.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1196s
    public final InterfaceC1196s i(String str, C1093g3 c1093g3, List list) {
        throw new IllegalStateException("Control does not have functions");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1196s
    public final InterfaceC1196s zzc() {
        return new C1134l(this.f14727n, this.f14726m.zzc());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1196s
    public final Boolean zzd() {
        throw new IllegalStateException("Control is not a boolean");
    }

    public C1134l(String str, InterfaceC1196s interfaceC1196s) {
        this.f14726m = interfaceC1196s;
        this.f14727n = str;
    }
}
