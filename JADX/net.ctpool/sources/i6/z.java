package i6;

import j5.AbstractC1803h;

/* JADX INFO: loaded from: classes2.dex */
public final class z extends i {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final transient byte[][] f20067r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final transient int[] f20068s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(byte[][] bArr, int[] iArr) {
        super(i.f20018p.n());
        w5.k.f(bArr, "segments");
        w5.k.f(iArr, "directory");
        this.f20067r = bArr;
        this.f20068s = iArr;
    }

    private final i K() {
        return new i(F());
    }

    @Override // i6.i
    public i E() {
        return K().E();
    }

    @Override // i6.i
    public byte[] F() {
        byte[] bArr = new byte[C()];
        int length = J().length;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i7 < length) {
            int i10 = I()[length + i7];
            int i11 = I()[i7];
            int i12 = i11 - i8;
            AbstractC1803h.d(J()[i7], bArr, i9, i10, i10 + i12);
            i9 += i12;
            i7++;
            i8 = i11;
        }
        return bArr;
    }

    @Override // i6.i
    public void H(f fVar, int i7, int i8) {
        w5.k.f(fVar, "buffer");
        int i9 = i7 + i8;
        int iB = j6.e.b(this, i7);
        while (i7 < i9) {
            int i10 = iB == 0 ? 0 : I()[iB - 1];
            int i11 = I()[iB] - i10;
            int i12 = I()[J().length + iB];
            int iMin = Math.min(i9, i11 + i10) - i7;
            int i13 = i12 + (i7 - i10);
            x xVar = new x(J()[iB], i13, i13 + iMin, true, false);
            x xVar2 = fVar.f20007m;
            if (xVar2 == null) {
                xVar.f20061g = xVar;
                xVar.f20060f = xVar;
                fVar.f20007m = xVar;
            } else {
                w5.k.c(xVar2);
                x xVar3 = xVar2.f20061g;
                w5.k.c(xVar3);
                xVar3.c(xVar);
            }
            i7 += iMin;
            iB++;
        }
        fVar.l1(fVar.m1() + ((long) i8));
    }

    public final int[] I() {
        return this.f20068s;
    }

    public final byte[][] J() {
        return this.f20067r;
    }

    @Override // i6.i
    public String e() {
        return K().e();
    }

    @Override // i6.i
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.C() == C() && w(0, iVar, 0, C())) {
                return true;
            }
        }
        return false;
    }

    @Override // i6.i
    public int hashCode() {
        int iO = o();
        if (iO != 0) {
            return iO;
        }
        int length = J().length;
        int i7 = 0;
        int i8 = 1;
        int i9 = 0;
        while (i7 < length) {
            int i10 = I()[length + i7];
            int i11 = I()[i7];
            byte[] bArr = J()[i7];
            int i12 = (i11 - i9) + i10;
            while (i10 < i12) {
                i8 = (i8 * 31) + bArr[i10];
                i10++;
            }
            i7++;
            i9 = i11;
        }
        y(i8);
        return i8;
    }

    @Override // i6.i
    public i k(String str) {
        w5.k.f(str, "algorithm");
        return j6.b.e(this, str);
    }

    @Override // i6.i
    public int p() {
        return I()[J().length - 1];
    }

    @Override // i6.i
    public String r() {
        return K().r();
    }

    @Override // i6.i
    public byte[] s() {
        return F();
    }

    @Override // i6.i
    public byte t(int i7) {
        AbstractC1751c.b(I()[J().length - 1], i7, 1L);
        int iB = j6.e.b(this, i7);
        return J()[iB][(i7 - (iB == 0 ? 0 : I()[iB - 1])) + I()[J().length + iB]];
    }

    @Override // i6.i
    public String toString() {
        return K().toString();
    }

    @Override // i6.i
    public boolean w(int i7, i iVar, int i8, int i9) {
        w5.k.f(iVar, "other");
        if (i7 < 0 || i7 > C() - i9) {
            return false;
        }
        int i10 = i9 + i7;
        int iB = j6.e.b(this, i7);
        while (i7 < i10) {
            int i11 = iB == 0 ? 0 : I()[iB - 1];
            int i12 = I()[iB] - i11;
            int i13 = I()[J().length + iB];
            int iMin = Math.min(i10, i12 + i11) - i7;
            if (!iVar.x(i8, J()[iB], i13 + (i7 - i11), iMin)) {
                return false;
            }
            i8 += iMin;
            i7 += iMin;
            iB++;
        }
        return true;
    }

    @Override // i6.i
    public boolean x(int i7, byte[] bArr, int i8, int i9) {
        w5.k.f(bArr, "other");
        if (i7 < 0 || i7 > C() - i9 || i8 < 0 || i8 > bArr.length - i9) {
            return false;
        }
        int i10 = i9 + i7;
        int iB = j6.e.b(this, i7);
        while (i7 < i10) {
            int i11 = iB == 0 ? 0 : I()[iB - 1];
            int i12 = I()[iB] - i11;
            int i13 = I()[J().length + iB];
            int iMin = Math.min(i10, i12 + i11) - i7;
            if (!AbstractC1751c.a(J()[iB], i13 + (i7 - i11), bArr, i8, iMin)) {
                return false;
            }
            i8 += iMin;
            i7 += iMin;
            iB++;
        }
        return true;
    }
}
