package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.c4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1058c4 extends Z3 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected final byte[] f14538p;

    C1058c4(byte[] bArr) {
        super();
        bArr.getClass();
        this.f14538p = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.R3
    public byte c(int i7) {
        return this.f14538p[i7];
    }

    @Override // com.google.android.gms.internal.measurement.R3
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof R3) || r() != ((R3) obj).r()) {
            return false;
        }
        if (r() == 0) {
            return true;
        }
        if (!(obj instanceof C1058c4)) {
            return obj.equals(this);
        }
        C1058c4 c1058c4 = (C1058c4) obj;
        int iF = f();
        int iF2 = c1058c4.f();
        if (iF == 0 || iF2 == 0 || iF == iF2) {
            return u(c1058c4, 0, r());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.R3
    public final R3 k(int i7, int i8) {
        int i9 = R3.i(0, i8, r());
        return i9 == 0 ? R3.f14328n : new V3(this.f14538p, v(), i9);
    }

    @Override // com.google.android.gms.internal.measurement.R3
    final void p(S3 s32) {
        s32.a(this.f14538p, v(), r());
    }

    @Override // com.google.android.gms.internal.measurement.R3
    byte q(int i7) {
        return this.f14538p[i7];
    }

    @Override // com.google.android.gms.internal.measurement.R3
    public int r() {
        return this.f14538p.length;
    }

    @Override // com.google.android.gms.internal.measurement.R3
    protected final int s(int i7, int i8, int i9) {
        return B4.a(i7, this.f14538p, v(), i9);
    }

    @Override // com.google.android.gms.internal.measurement.Z3
    final boolean u(R3 r32, int i7, int i8) {
        if (i8 > r32.r()) {
            throw new IllegalArgumentException("Length too large: " + i8 + r());
        }
        if (i8 > r32.r()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + i8 + ", " + r32.r());
        }
        if (!(r32 instanceof C1058c4)) {
            return r32.k(0, i8).equals(k(0, i8));
        }
        C1058c4 c1058c4 = (C1058c4) r32;
        byte[] bArr = this.f14538p;
        byte[] bArr2 = c1058c4.f14538p;
        int iV = v() + i8;
        int iV2 = v();
        int iV3 = c1058c4.v();
        while (iV2 < iV) {
            if (bArr[iV2] != bArr2[iV3]) {
                return false;
            }
            iV2++;
            iV3++;
        }
        return true;
    }

    protected int v() {
        return 0;
    }
}
