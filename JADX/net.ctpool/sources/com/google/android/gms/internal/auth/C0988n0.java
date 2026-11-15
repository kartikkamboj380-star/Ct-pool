package com.google.android.gms.internal.auth;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C0988n0 extends AbstractC0985m0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected final byte[] f14005q;

    C0988n0(byte[] bArr) {
        bArr.getClass();
        this.f14005q = bArr;
    }

    @Override // com.google.android.gms.internal.auth.AbstractC0997q0
    public byte c(int i7) {
        return this.f14005q[i7];
    }

    @Override // com.google.android.gms.internal.auth.AbstractC0997q0
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0997q0) || h() != ((AbstractC0997q0) obj).h()) {
            return false;
        }
        if (h() == 0) {
            return true;
        }
        if (!(obj instanceof C0988n0)) {
            return obj.equals(this);
        }
        C0988n0 c0988n0 = (C0988n0) obj;
        int iP = p();
        int iP2 = c0988n0.p();
        if (iP != 0 && iP2 != 0 && iP != iP2) {
            return false;
        }
        int iH = h();
        if (iH > c0988n0.h()) {
            throw new IllegalArgumentException("Length too large: " + iH + h());
        }
        if (iH > c0988n0.h()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + iH + ", " + c0988n0.h());
        }
        byte[] bArr = this.f14005q;
        byte[] bArr2 = c0988n0.f14005q;
        c0988n0.s();
        int i7 = 0;
        int i8 = 0;
        while (i7 < iH) {
            if (bArr[i7] != bArr2[i8]) {
                return false;
            }
            i7++;
            i8++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.auth.AbstractC0997q0
    byte f(int i7) {
        return this.f14005q[i7];
    }

    @Override // com.google.android.gms.internal.auth.AbstractC0997q0
    public int h() {
        return this.f14005q.length;
    }

    @Override // com.google.android.gms.internal.auth.AbstractC0997q0
    protected final int i(int i7, int i8, int i9) {
        return G0.b(i7, this.f14005q, 0, i9);
    }

    @Override // com.google.android.gms.internal.auth.AbstractC0997q0
    public final AbstractC0997q0 k(int i7, int i8) {
        int iO = AbstractC0997q0.o(0, i8, h());
        return iO == 0 ? AbstractC0997q0.f14021n : new C0976j0(this.f14005q, 0, iO);
    }

    @Override // com.google.android.gms.internal.auth.AbstractC0997q0
    protected final String m(Charset charset) {
        return new String(this.f14005q, 0, h(), charset);
    }

    @Override // com.google.android.gms.internal.auth.AbstractC0997q0
    public final boolean n() {
        return F1.c(this.f14005q, 0, h());
    }

    protected int s() {
        return 0;
    }
}
