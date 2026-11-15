package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
final class V3 extends C1058c4 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f14398q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f14399r;

    V3(byte[] bArr, int i7, int i8) {
        super(bArr);
        R3.i(i7, i7 + i8, bArr.length);
        this.f14398q = i7;
        this.f14399r = i8;
    }

    @Override // com.google.android.gms.internal.measurement.C1058c4, com.google.android.gms.internal.measurement.R3
    public final byte c(int i7) {
        int iR = r();
        if (((iR - (i7 + 1)) | i7) >= 0) {
            return this.f14538p[this.f14398q + i7];
        }
        if (i7 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i7);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i7 + ", " + iR);
    }

    @Override // com.google.android.gms.internal.measurement.C1058c4, com.google.android.gms.internal.measurement.R3
    final byte q(int i7) {
        return this.f14538p[this.f14398q + i7];
    }

    @Override // com.google.android.gms.internal.measurement.C1058c4, com.google.android.gms.internal.measurement.R3
    public final int r() {
        return this.f14399r;
    }

    @Override // com.google.android.gms.internal.measurement.C1058c4
    protected final int v() {
        return this.f14398q;
    }
}
