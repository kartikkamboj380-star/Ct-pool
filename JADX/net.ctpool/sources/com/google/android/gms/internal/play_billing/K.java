package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
final class K extends O {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f15060r;

    K(byte[] bArr, int i7, int i8) {
        super(bArr);
        S.p(0, i8, bArr.length);
        this.f15060r = i8;
    }

    @Override // com.google.android.gms.internal.play_billing.O, com.google.android.gms.internal.play_billing.S
    public final byte c(int i7) {
        int i8 = this.f15060r;
        if (((i8 - (i7 + 1)) | i7) >= 0) {
            return this.f15088q[i7];
        }
        if (i7 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i7);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i7 + ", " + i8);
    }

    @Override // com.google.android.gms.internal.play_billing.O, com.google.android.gms.internal.play_billing.S
    final byte f(int i7) {
        return this.f15088q[i7];
    }

    @Override // com.google.android.gms.internal.play_billing.O, com.google.android.gms.internal.play_billing.S
    public final int h() {
        return this.f15060r;
    }

    @Override // com.google.android.gms.internal.play_billing.O
    protected final int t() {
        return 0;
    }
}
