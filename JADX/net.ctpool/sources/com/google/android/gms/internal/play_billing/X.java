package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
final class X extends AbstractC1264a0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f15117d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f15118e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f15119f;

    X(byte[] bArr, int i7, int i8) {
        super(null);
        int length = bArr.length;
        if (((length - i8) | i8) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i8)));
        }
        this.f15117d = bArr;
        this.f15119f = 0;
        this.f15118e = i8;
    }

    public final void A(byte[] bArr, int i7, int i8) {
        try {
            System.arraycopy(bArr, 0, this.f15117d, this.f15119f, i8);
            this.f15119f += i8;
        } catch (IndexOutOfBoundsException e7) {
            throw new Y(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f15119f), Integer.valueOf(this.f15118e), Integer.valueOf(i8)), e7);
        }
    }

    public final void B(String str) throws Y {
        int i7 = this.f15119f;
        try {
            int iW = AbstractC1264a0.w(str.length() * 3);
            int iW2 = AbstractC1264a0.w(str.length());
            if (iW2 != iW) {
                q(M1.c(str));
                byte[] bArr = this.f15117d;
                int i8 = this.f15119f;
                this.f15119f = M1.b(str, bArr, i8, this.f15118e - i8);
                return;
            }
            int i9 = i7 + iW2;
            this.f15119f = i9;
            int iB = M1.b(str, this.f15117d, i9, this.f15118e - i9);
            this.f15119f = i7;
            q((iB - i7) - iW2);
            this.f15119f = iB;
        } catch (L1 e7) {
            this.f15119f = i7;
            a(str, e7);
        } catch (IndexOutOfBoundsException e8) {
            throw new Y(e8);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1264a0
    public final int c() {
        return this.f15118e - this.f15119f;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1264a0
    public final void d(byte b7) throws Y {
        try {
            byte[] bArr = this.f15117d;
            int i7 = this.f15119f;
            this.f15119f = i7 + 1;
            bArr[i7] = b7;
        } catch (IndexOutOfBoundsException e7) {
            throw new Y(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f15119f), Integer.valueOf(this.f15118e), 1), e7);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1264a0
    public final void e(int i7, boolean z6) throws Y {
        q(i7 << 3);
        d(z6 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1264a0
    public final void f(int i7, S s6) {
        q((i7 << 3) | 2);
        q(s6.h());
        s6.n(this);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1264a0
    public final void g(int i7, int i8) throws Y {
        q((i7 << 3) | 5);
        h(i8);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1264a0
    public final void h(int i7) throws Y {
        try {
            byte[] bArr = this.f15117d;
            int i8 = this.f15119f;
            bArr[i8] = (byte) (i7 & 255);
            bArr[i8 + 1] = (byte) ((i7 >> 8) & 255);
            bArr[i8 + 2] = (byte) ((i7 >> 16) & 255);
            this.f15119f = i8 + 4;
            bArr[i8 + 3] = (byte) ((i7 >> 24) & 255);
        } catch (IndexOutOfBoundsException e7) {
            throw new Y(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f15119f), Integer.valueOf(this.f15118e), 1), e7);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1264a0
    public final void i(int i7, long j7) throws Y {
        q((i7 << 3) | 1);
        j(j7);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1264a0
    public final void j(long j7) throws Y {
        try {
            byte[] bArr = this.f15117d;
            int i7 = this.f15119f;
            bArr[i7] = (byte) (((int) j7) & 255);
            bArr[i7 + 1] = (byte) (((int) (j7 >> 8)) & 255);
            bArr[i7 + 2] = (byte) (((int) (j7 >> 16)) & 255);
            bArr[i7 + 3] = (byte) (((int) (j7 >> 24)) & 255);
            bArr[i7 + 4] = (byte) (((int) (j7 >> 32)) & 255);
            bArr[i7 + 5] = (byte) (((int) (j7 >> 40)) & 255);
            bArr[i7 + 6] = (byte) (((int) (j7 >> 48)) & 255);
            this.f15119f = i7 + 8;
            bArr[i7 + 7] = (byte) (((int) (j7 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e7) {
            throw new Y(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f15119f), Integer.valueOf(this.f15118e), 1), e7);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1264a0
    public final void k(int i7, int i8) throws Y {
        q(i7 << 3);
        l(i8);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1264a0
    public final void l(int i7) throws Y {
        if (i7 >= 0) {
            q(i7);
        } else {
            s(i7);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1264a0
    public final void m(byte[] bArr, int i7, int i8) {
        A(bArr, 0, i8);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1264a0
    public final void n(int i7, String str) throws Y {
        q((i7 << 3) | 2);
        B(str);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1264a0
    public final void o(int i7, int i8) {
        q((i7 << 3) | i8);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1264a0
    public final void p(int i7, int i8) {
        q(i7 << 3);
        q(i8);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1264a0
    public final void q(int i7) {
        while ((i7 & (-128)) != 0) {
            try {
                byte[] bArr = this.f15117d;
                int i8 = this.f15119f;
                this.f15119f = i8 + 1;
                bArr[i8] = (byte) ((i7 | 128) & 255);
                i7 >>>= 7;
            } catch (IndexOutOfBoundsException e7) {
                throw new Y(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f15119f), Integer.valueOf(this.f15118e), 1), e7);
            }
        }
        byte[] bArr2 = this.f15117d;
        int i9 = this.f15119f;
        this.f15119f = i9 + 1;
        bArr2[i9] = (byte) i7;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1264a0
    public final void r(int i7, long j7) throws Y {
        q(i7 << 3);
        s(j7);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1264a0
    public final void s(long j7) throws Y {
        if (!AbstractC1264a0.f15156c || this.f15118e - this.f15119f < 10) {
            while ((j7 & (-128)) != 0) {
                try {
                    byte[] bArr = this.f15117d;
                    int i7 = this.f15119f;
                    this.f15119f = i7 + 1;
                    bArr[i7] = (byte) ((((int) j7) | 128) & 255);
                    j7 >>>= 7;
                } catch (IndexOutOfBoundsException e7) {
                    throw new Y(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f15119f), Integer.valueOf(this.f15118e), 1), e7);
                }
            }
            byte[] bArr2 = this.f15117d;
            int i8 = this.f15119f;
            this.f15119f = i8 + 1;
            bArr2[i8] = (byte) j7;
            return;
        }
        while (true) {
            int i9 = (int) j7;
            if ((j7 & (-128)) == 0) {
                byte[] bArr3 = this.f15117d;
                int i10 = this.f15119f;
                this.f15119f = i10 + 1;
                H1.s(bArr3, i10, (byte) i9);
                return;
            }
            byte[] bArr4 = this.f15117d;
            int i11 = this.f15119f;
            this.f15119f = i11 + 1;
            H1.s(bArr4, i11, (byte) ((i9 | 128) & 255));
            j7 >>>= 7;
        }
    }
}
