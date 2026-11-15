package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
class O extends N {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected final byte[] f15088q;

    O(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.f15088q = bArr;
    }

    @Override // com.google.android.gms.internal.play_billing.S
    public byte c(int i7) {
        return this.f15088q[i7];
    }

    @Override // com.google.android.gms.internal.play_billing.S
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof S) || h() != ((S) obj).h()) {
            return false;
        }
        if (h() == 0) {
            return true;
        }
        if (!(obj instanceof O)) {
            return obj.equals(this);
        }
        O o6 = (O) obj;
        int iQ = q();
        int iQ2 = o6.q();
        if (iQ != 0 && iQ2 != 0 && iQ != iQ2) {
            return false;
        }
        int iH = h();
        if (iH > o6.h()) {
            throw new IllegalArgumentException("Length too large: " + iH + h());
        }
        if (iH > o6.h()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + iH + ", " + o6.h());
        }
        byte[] bArr = this.f15088q;
        byte[] bArr2 = o6.f15088q;
        o6.t();
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

    @Override // com.google.android.gms.internal.play_billing.S
    byte f(int i7) {
        return this.f15088q[i7];
    }

    @Override // com.google.android.gms.internal.play_billing.S
    public int h() {
        return this.f15088q.length;
    }

    @Override // com.google.android.gms.internal.play_billing.S
    protected final int i(int i7, int i8, int i9) {
        return AbstractC1353z0.b(i7, this.f15088q, 0, i9);
    }

    @Override // com.google.android.gms.internal.play_billing.S
    public final S k(int i7, int i8) {
        int iP = S.p(0, i8, h());
        return iP == 0 ? S.f15105n : new K(this.f15088q, 0, iP);
    }

    @Override // com.google.android.gms.internal.play_billing.S
    protected final String m(Charset charset) {
        return new String(this.f15088q, 0, h(), charset);
    }

    @Override // com.google.android.gms.internal.play_billing.S
    final void n(G g7) {
        ((X) g7).A(this.f15088q, 0, h());
    }

    @Override // com.google.android.gms.internal.play_billing.S
    public final boolean o() {
        return M1.e(this.f15088q, 0, h());
    }

    protected int t() {
        return 0;
    }
}
