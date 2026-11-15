package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.y1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1351y1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final C1351y1 f15315f = new C1351y1(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f15316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f15317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f15318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f15319d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f15320e;

    private C1351y1(int i7, int[] iArr, Object[] objArr, boolean z6) {
        this.f15316a = i7;
        this.f15317b = iArr;
        this.f15318c = objArr;
        this.f15320e = z6;
    }

    public static C1351y1 c() {
        return f15315f;
    }

    static C1351y1 e(C1351y1 c1351y1, C1351y1 c1351y12) {
        int i7 = c1351y1.f15316a + c1351y12.f15316a;
        int[] iArrCopyOf = Arrays.copyOf(c1351y1.f15317b, i7);
        System.arraycopy(c1351y12.f15317b, 0, iArrCopyOf, c1351y1.f15316a, c1351y12.f15316a);
        Object[] objArrCopyOf = Arrays.copyOf(c1351y1.f15318c, i7);
        System.arraycopy(c1351y12.f15318c, 0, objArrCopyOf, c1351y1.f15316a, c1351y12.f15316a);
        return new C1351y1(i7, iArrCopyOf, objArrCopyOf, true);
    }

    static C1351y1 f() {
        return new C1351y1(0, new int[8], new Object[8], true);
    }

    private final void m(int i7) {
        int[] iArr = this.f15317b;
        if (i7 > iArr.length) {
            int i8 = this.f15316a;
            int i9 = i8 + (i8 / 2);
            if (i9 >= i7) {
                i7 = i9;
            }
            if (i7 < 8) {
                i7 = 8;
            }
            this.f15317b = Arrays.copyOf(iArr, i7);
            this.f15318c = Arrays.copyOf(this.f15318c, i7);
        }
    }

    public final int a() {
        int iW;
        int iX;
        int iW2;
        int i7 = this.f15319d;
        if (i7 != -1) {
            return i7;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.f15316a; i9++) {
            int i10 = this.f15317b[i9];
            int i11 = i10 >>> 3;
            int i12 = i10 & 7;
            if (i12 != 0) {
                if (i12 == 1) {
                    ((Long) this.f15318c[i9]).longValue();
                    iW2 = AbstractC1264a0.w(i11 << 3) + 8;
                } else if (i12 == 2) {
                    int i13 = i11 << 3;
                    S s6 = (S) this.f15318c[i9];
                    int iW3 = AbstractC1264a0.w(i13);
                    int iH = s6.h();
                    iW2 = iW3 + AbstractC1264a0.w(iH) + iH;
                } else if (i12 == 3) {
                    int iW4 = AbstractC1264a0.w(i11 << 3);
                    iW = iW4 + iW4;
                    iX = ((C1351y1) this.f15318c[i9]).a();
                } else {
                    if (i12 != 5) {
                        throw new IllegalStateException(B0.a());
                    }
                    ((Integer) this.f15318c[i9]).intValue();
                    iW2 = AbstractC1264a0.w(i11 << 3) + 4;
                }
                i8 += iW2;
            } else {
                int i14 = i11 << 3;
                long jLongValue = ((Long) this.f15318c[i9]).longValue();
                iW = AbstractC1264a0.w(i14);
                iX = AbstractC1264a0.x(jLongValue);
            }
            iW2 = iW + iX;
            i8 += iW2;
        }
        this.f15319d = i8;
        return i8;
    }

    public final int b() {
        int i7 = this.f15319d;
        if (i7 != -1) {
            return i7;
        }
        int iW = 0;
        for (int i8 = 0; i8 < this.f15316a; i8++) {
            int i9 = this.f15317b[i8] >>> 3;
            S s6 = (S) this.f15318c[i8];
            int iW2 = AbstractC1264a0.w(8);
            int iW3 = AbstractC1264a0.w(16) + AbstractC1264a0.w(i9);
            int iW4 = AbstractC1264a0.w(24);
            int iH = s6.h();
            iW += iW2 + iW2 + iW3 + iW4 + AbstractC1264a0.w(iH) + iH;
        }
        this.f15319d = iW;
        return iW;
    }

    final C1351y1 d(C1351y1 c1351y1) {
        if (c1351y1.equals(f15315f)) {
            return this;
        }
        g();
        int i7 = this.f15316a + c1351y1.f15316a;
        m(i7);
        System.arraycopy(c1351y1.f15317b, 0, this.f15317b, this.f15316a, c1351y1.f15316a);
        System.arraycopy(c1351y1.f15318c, 0, this.f15318c, this.f15316a, c1351y1.f15316a);
        this.f15316a = i7;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1351y1)) {
            return false;
        }
        C1351y1 c1351y1 = (C1351y1) obj;
        int i7 = this.f15316a;
        if (i7 == c1351y1.f15316a) {
            int[] iArr = this.f15317b;
            int[] iArr2 = c1351y1.f15317b;
            int i8 = 0;
            while (true) {
                if (i8 >= i7) {
                    Object[] objArr = this.f15318c;
                    Object[] objArr2 = c1351y1.f15318c;
                    int i9 = this.f15316a;
                    for (int i10 = 0; i10 < i9; i10++) {
                        if (objArr[i10].equals(objArr2[i10])) {
                        }
                    }
                    return true;
                }
                if (iArr[i8] != iArr2[i8]) {
                    break;
                }
                i8++;
            }
        }
        return false;
    }

    final void g() {
        if (!this.f15320e) {
            throw new UnsupportedOperationException();
        }
    }

    public final void h() {
        if (this.f15320e) {
            this.f15320e = false;
        }
    }

    public final int hashCode() {
        int i7 = this.f15316a;
        int i8 = i7 + 527;
        int[] iArr = this.f15317b;
        int iHashCode = 17;
        int i9 = 17;
        for (int i10 = 0; i10 < i7; i10++) {
            i9 = (i9 * 31) + iArr[i10];
        }
        int i11 = ((i8 * 31) + i9) * 31;
        Object[] objArr = this.f15318c;
        int i12 = this.f15316a;
        for (int i13 = 0; i13 < i12; i13++) {
            iHashCode = (iHashCode * 31) + objArr[i13].hashCode();
        }
        return i11 + iHashCode;
    }

    final void i(StringBuilder sb, int i7) {
        for (int i8 = 0; i8 < this.f15316a; i8++) {
            Y0.b(sb, i7, String.valueOf(this.f15317b[i8] >>> 3), this.f15318c[i8]);
        }
    }

    final void j(int i7, Object obj) {
        g();
        m(this.f15316a + 1);
        int[] iArr = this.f15317b;
        int i8 = this.f15316a;
        iArr[i8] = i7;
        this.f15318c[i8] = obj;
        this.f15316a = i8 + 1;
    }

    final void k(P1 p12) {
        for (int i7 = 0; i7 < this.f15316a; i7++) {
            p12.A(this.f15317b[i7] >>> 3, this.f15318c[i7]);
        }
    }

    public final void l(P1 p12) {
        if (this.f15316a != 0) {
            for (int i7 = 0; i7 < this.f15316a; i7++) {
                int i8 = this.f15317b[i7];
                Object obj = this.f15318c[i7];
                int i9 = i8 & 7;
                int i10 = i8 >>> 3;
                if (i9 == 0) {
                    p12.n(i10, ((Long) obj).longValue());
                } else if (i9 == 1) {
                    p12.G(i10, ((Long) obj).longValue());
                } else if (i9 == 2) {
                    p12.m(i10, (S) obj);
                } else if (i9 == 3) {
                    p12.K(i10);
                    ((C1351y1) obj).l(p12);
                    p12.J(i10);
                } else {
                    if (i9 != 5) {
                        throw new RuntimeException(B0.a());
                    }
                    p12.k(i10, ((Integer) obj).intValue());
                }
            }
        }
    }
}
