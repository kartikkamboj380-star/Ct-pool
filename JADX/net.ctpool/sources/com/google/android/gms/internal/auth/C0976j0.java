package com.google.android.gms.internal.auth;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0976j0 extends C0988n0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f13980r;

    C0976j0(byte[] bArr, int i7, int i8) {
        super(bArr);
        AbstractC0997q0.o(0, i8, bArr.length);
        this.f13980r = i8;
    }

    @Override // com.google.android.gms.internal.auth.C0988n0, com.google.android.gms.internal.auth.AbstractC0997q0
    public final byte c(int i7) {
        int i8 = this.f13980r;
        if (((i8 - (i7 + 1)) | i7) >= 0) {
            return this.f14005q[i7];
        }
        if (i7 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i7);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i7 + ", " + i8);
    }

    @Override // com.google.android.gms.internal.auth.C0988n0, com.google.android.gms.internal.auth.AbstractC0997q0
    final byte f(int i7) {
        return this.f14005q[i7];
    }

    @Override // com.google.android.gms.internal.auth.C0988n0, com.google.android.gms.internal.auth.AbstractC0997q0
    public final int h() {
        return this.f13980r;
    }

    @Override // com.google.android.gms.internal.auth.C0988n0
    protected final int s() {
        return 0;
    }
}
