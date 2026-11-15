package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1117j0 extends AbstractC1188r0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f14627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f14628d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final EnumC1206t0 f14629e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final EnumC1197s0 f14630f;

    private C1117j0(String str, boolean z6, EnumC1206t0 enumC1206t0, InterfaceC1099h0 interfaceC1099h0, InterfaceC1090g0 interfaceC1090g0, EnumC1197s0 enumC1197s0) {
        this.f14627c = str;
        this.f14628d = z6;
        this.f14629e = enumC1206t0;
        this.f14630f = enumC1197s0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1188r0
    public final InterfaceC1099h0 a() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1188r0
    public final InterfaceC1090g0 b() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1188r0
    public final EnumC1206t0 c() {
        return this.f14629e;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1188r0
    public final EnumC1197s0 d() {
        return this.f14630f;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1188r0
    public final String e() {
        return this.f14627c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1188r0) {
            AbstractC1188r0 abstractC1188r0 = (AbstractC1188r0) obj;
            if (this.f14627c.equals(abstractC1188r0.e()) && this.f14628d == abstractC1188r0.f() && this.f14629e.equals(abstractC1188r0.c())) {
                abstractC1188r0.a();
                abstractC1188r0.b();
                if (this.f14630f.equals(abstractC1188r0.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1188r0
    public final boolean f() {
        return this.f14628d;
    }

    public final int hashCode() {
        return ((((((this.f14627c.hashCode() ^ 1000003) * 1000003) ^ (this.f14628d ? 1231 : 1237)) * 1000003) ^ this.f14629e.hashCode()) * 583896283) ^ this.f14630f.hashCode();
    }

    public final String toString() {
        return "FileComplianceOptions{fileOwner=" + this.f14627c + ", hasDifferentDmaOwner=" + this.f14628d + ", fileChecks=" + String.valueOf(this.f14629e) + ", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=" + String.valueOf(this.f14630f) + "}";
    }
}
