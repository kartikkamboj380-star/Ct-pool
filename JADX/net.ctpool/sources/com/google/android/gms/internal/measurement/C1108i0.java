package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1108i0 extends AbstractC1180q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f14609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private EnumC1206t0 f14610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private EnumC1197s0 f14611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte f14612d;

    C1108i0() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1180q0
    public final AbstractC1180q0 a(EnumC1197s0 enumC1197s0) {
        if (enumC1197s0 == null) {
            throw new NullPointerException("Null filePurpose");
        }
        this.f14611c = enumC1197s0;
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1180q0
    final AbstractC1180q0 b(EnumC1206t0 enumC1206t0) {
        if (enumC1206t0 == null) {
            throw new NullPointerException("Null fileChecks");
        }
        this.f14610b = enumC1206t0;
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1180q0
    public final AbstractC1180q0 c(boolean z6) {
        this.f14612d = (byte) (this.f14612d | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1180q0
    public final AbstractC1188r0 d() {
        if (this.f14612d == 1 && this.f14609a != null && this.f14610b != null && this.f14611c != null) {
            return new C1117j0(this.f14609a, this.f14610b, this.f14611c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f14609a == null) {
            sb.append(" fileOwner");
        }
        if ((1 & this.f14612d) == 0) {
            sb.append(" hasDifferentDmaOwner");
        }
        if (this.f14610b == null) {
            sb.append(" fileChecks");
        }
        if (this.f14611c == null) {
            sb.append(" filePurpose");
        }
        throw new IllegalStateException("Missing required properties:" + String.valueOf(sb));
    }

    public final AbstractC1180q0 e(String str) {
        this.f14609a = str;
        return this;
    }
}
