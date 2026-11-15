package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class K5 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final K5 f14253f = new K5(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f14254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f14255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f14256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f14257d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f14258e;

    private K5() {
        this(0, new int[8], new Object[8], true);
    }

    static K5 c(K5 k52, K5 k53) {
        int i7 = k52.f14254a + k53.f14254a;
        int[] iArrCopyOf = Arrays.copyOf(k52.f14255b, i7);
        System.arraycopy(k53.f14255b, 0, iArrCopyOf, k52.f14254a, k53.f14254a);
        Object[] objArrCopyOf = Arrays.copyOf(k52.f14256c, i7);
        System.arraycopy(k53.f14256c, 0, objArrCopyOf, k52.f14254a, k53.f14254a);
        return new K5(i7, iArrCopyOf, objArrCopyOf, true);
    }

    private final void d(int i7) {
        int[] iArr = this.f14255b;
        if (i7 > iArr.length) {
            int i8 = this.f14254a;
            int i9 = i8 + (i8 / 2);
            if (i9 >= i7) {
                i7 = i9;
            }
            if (i7 < 8) {
                i7 = 8;
            }
            this.f14255b = Arrays.copyOf(iArr, i7);
            this.f14256c = Arrays.copyOf(this.f14256c, i7);
        }
    }

    private static void f(int i7, Object obj, InterfaceC1069d6 interfaceC1069d6) {
        int i8 = i7 >>> 3;
        int i9 = i7 & 7;
        if (i9 == 0) {
            interfaceC1069d6.l(i8, ((Long) obj).longValue());
            return;
        }
        if (i9 == 1) {
            interfaceC1069d6.z(i8, ((Long) obj).longValue());
            return;
        }
        if (i9 == 2) {
            interfaceC1069d6.p(i8, (R3) obj);
            return;
        }
        if (i9 != 3) {
            if (i9 != 5) {
                throw new RuntimeException(I4.a());
            }
            interfaceC1069d6.n(i8, ((Integer) obj).intValue());
        } else if (interfaceC1069d6.a() == 1) {
            interfaceC1069d6.j(i8);
            ((K5) obj).j(interfaceC1069d6);
            interfaceC1069d6.d(i8);
        } else {
            interfaceC1069d6.d(i8);
            ((K5) obj).j(interfaceC1069d6);
            interfaceC1069d6.j(i8);
        }
    }

    public static K5 k() {
        return f14253f;
    }

    static K5 l() {
        return new K5();
    }

    private final void n() {
        if (!this.f14258e) {
            throw new UnsupportedOperationException();
        }
    }

    public final int a() {
        int iM0;
        int i7 = this.f14257d;
        if (i7 != -1) {
            return i7;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.f14254a; i9++) {
            int i10 = this.f14255b[i9];
            int i11 = i10 >>> 3;
            int i12 = i10 & 7;
            if (i12 == 0) {
                iM0 = AbstractC1112i4.m0(i11, ((Long) this.f14256c[i9]).longValue());
            } else if (i12 == 1) {
                iM0 = AbstractC1112i4.P(i11, ((Long) this.f14256c[i9]).longValue());
            } else if (i12 == 2) {
                iM0 = AbstractC1112i4.Q(i11, (R3) this.f14256c[i9]);
            } else if (i12 == 3) {
                iM0 = (AbstractC1112i4.s0(i11) << 1) + ((K5) this.f14256c[i9]).a();
            } else {
                if (i12 != 5) {
                    throw new IllegalStateException(I4.a());
                }
                iM0 = AbstractC1112i4.h0(i11, ((Integer) this.f14256c[i9]).intValue());
            }
            i8 += iM0;
        }
        this.f14257d = i8;
        return i8;
    }

    final K5 b(K5 k52) {
        if (k52.equals(f14253f)) {
            return this;
        }
        n();
        int i7 = this.f14254a + k52.f14254a;
        d(i7);
        System.arraycopy(k52.f14255b, 0, this.f14255b, this.f14254a, k52.f14254a);
        System.arraycopy(k52.f14256c, 0, this.f14256c, this.f14254a, k52.f14254a);
        this.f14254a = i7;
        return this;
    }

    final void e(int i7, Object obj) {
        n();
        d(this.f14254a + 1);
        int[] iArr = this.f14255b;
        int i8 = this.f14254a;
        iArr[i8] = i7;
        this.f14256c[i8] = obj;
        this.f14254a = i8 + 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof K5)) {
            return false;
        }
        K5 k52 = (K5) obj;
        int i7 = this.f14254a;
        if (i7 == k52.f14254a) {
            int[] iArr = this.f14255b;
            int[] iArr2 = k52.f14255b;
            int i8 = 0;
            while (true) {
                if (i8 >= i7) {
                    Object[] objArr = this.f14256c;
                    Object[] objArr2 = k52.f14256c;
                    int i9 = this.f14254a;
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

    final void g(InterfaceC1069d6 interfaceC1069d6) {
        if (interfaceC1069d6.a() == 2) {
            for (int i7 = this.f14254a - 1; i7 >= 0; i7--) {
                interfaceC1069d6.u(this.f14255b[i7] >>> 3, this.f14256c[i7]);
            }
            return;
        }
        for (int i8 = 0; i8 < this.f14254a; i8++) {
            interfaceC1069d6.u(this.f14255b[i8] >>> 3, this.f14256c[i8]);
        }
    }

    final void h(StringBuilder sb, int i7) {
        for (int i8 = 0; i8 < this.f14254a; i8++) {
            AbstractC1104h5.d(sb, i7, String.valueOf(this.f14255b[i8] >>> 3), this.f14256c[i8]);
        }
    }

    public final int hashCode() {
        int i7 = this.f14254a;
        int i8 = (i7 + 527) * 31;
        int[] iArr = this.f14255b;
        int iHashCode = 17;
        int i9 = 17;
        for (int i10 = 0; i10 < i7; i10++) {
            i9 = (i9 * 31) + iArr[i10];
        }
        int i11 = (i8 + i9) * 31;
        Object[] objArr = this.f14256c;
        int i12 = this.f14254a;
        for (int i13 = 0; i13 < i12; i13++) {
            iHashCode = (iHashCode * 31) + objArr[i13].hashCode();
        }
        return i11 + iHashCode;
    }

    public final int i() {
        int i7 = this.f14257d;
        if (i7 != -1) {
            return i7;
        }
        int iZ = 0;
        for (int i8 = 0; i8 < this.f14254a; i8++) {
            iZ += AbstractC1112i4.Z(this.f14255b[i8] >>> 3, (R3) this.f14256c[i8]);
        }
        this.f14257d = iZ;
        return iZ;
    }

    public final void j(InterfaceC1069d6 interfaceC1069d6) {
        if (this.f14254a == 0) {
            return;
        }
        if (interfaceC1069d6.a() == 1) {
            for (int i7 = 0; i7 < this.f14254a; i7++) {
                f(this.f14255b[i7], this.f14256c[i7], interfaceC1069d6);
            }
            return;
        }
        for (int i8 = this.f14254a - 1; i8 >= 0; i8--) {
            f(this.f14255b[i8], this.f14256c[i8], interfaceC1069d6);
        }
    }

    public final void m() {
        if (this.f14258e) {
            this.f14258e = false;
        }
    }

    private K5(int i7, int[] iArr, Object[] objArr, boolean z6) {
        this.f14257d = -1;
        this.f14254a = i7;
        this.f14255b = iArr;
        this.f14256c = objArr;
        this.f14258e = z6;
    }
}
