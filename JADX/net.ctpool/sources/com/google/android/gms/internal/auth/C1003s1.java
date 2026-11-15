package com.google.android.gms.internal.auth;

import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.s1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1003s1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final C1003s1 f14030e = new C1003s1(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f14031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f14032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f14033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f14034d;

    private C1003s1(int i7, int[] iArr, Object[] objArr, boolean z6) {
        this.f14031a = i7;
        this.f14032b = iArr;
        this.f14033c = objArr;
        this.f14034d = z6;
    }

    public static C1003s1 a() {
        return f14030e;
    }

    static C1003s1 c(C1003s1 c1003s1, C1003s1 c1003s12) {
        int i7 = c1003s1.f14031a + c1003s12.f14031a;
        int[] iArrCopyOf = Arrays.copyOf(c1003s1.f14032b, i7);
        System.arraycopy(c1003s12.f14032b, 0, iArrCopyOf, c1003s1.f14031a, c1003s12.f14031a);
        Object[] objArrCopyOf = Arrays.copyOf(c1003s1.f14033c, i7);
        System.arraycopy(c1003s12.f14033c, 0, objArrCopyOf, c1003s1.f14031a, c1003s12.f14031a);
        return new C1003s1(i7, iArrCopyOf, objArrCopyOf, true);
    }

    static C1003s1 d() {
        return new C1003s1(0, new int[8], new Object[8], true);
    }

    private final void i(int i7) {
        int[] iArr = this.f14032b;
        if (i7 > iArr.length) {
            int i8 = this.f14031a;
            int i9 = i8 + (i8 / 2);
            if (i9 >= i7) {
                i7 = i9;
            }
            if (i7 < 8) {
                i7 = 8;
            }
            this.f14032b = Arrays.copyOf(iArr, i7);
            this.f14033c = Arrays.copyOf(this.f14033c, i7);
        }
    }

    final C1003s1 b(C1003s1 c1003s1) {
        if (c1003s1.equals(f14030e)) {
            return this;
        }
        e();
        int i7 = this.f14031a + c1003s1.f14031a;
        i(i7);
        System.arraycopy(c1003s1.f14032b, 0, this.f14032b, this.f14031a, c1003s1.f14031a);
        System.arraycopy(c1003s1.f14033c, 0, this.f14033c, this.f14031a, c1003s1.f14031a);
        this.f14031a = i7;
        return this;
    }

    final void e() {
        if (!this.f14034d) {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1003s1)) {
            return false;
        }
        C1003s1 c1003s1 = (C1003s1) obj;
        int i7 = this.f14031a;
        if (i7 == c1003s1.f14031a) {
            int[] iArr = this.f14032b;
            int[] iArr2 = c1003s1.f14032b;
            int i8 = 0;
            while (true) {
                if (i8 >= i7) {
                    Object[] objArr = this.f14033c;
                    Object[] objArr2 = c1003s1.f14033c;
                    int i9 = this.f14031a;
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

    public final void f() {
        if (this.f14034d) {
            this.f14034d = false;
        }
    }

    final void g(StringBuilder sb, int i7) {
        for (int i8 = 0; i8 < this.f14031a; i8++) {
            AbstractC0953b1.b(sb, i7, String.valueOf(this.f14032b[i8] >>> 3), this.f14033c[i8]);
        }
    }

    final void h(int i7, Object obj) {
        e();
        i(this.f14031a + 1);
        int[] iArr = this.f14032b;
        int i8 = this.f14031a;
        iArr[i8] = i7;
        this.f14033c[i8] = obj;
        this.f14031a = i8 + 1;
    }

    public final int hashCode() {
        int i7 = this.f14031a;
        int i8 = i7 + 527;
        int[] iArr = this.f14032b;
        int iHashCode = 17;
        int i9 = 17;
        for (int i10 = 0; i10 < i7; i10++) {
            i9 = (i9 * 31) + iArr[i10];
        }
        int i11 = (i8 * 31) + i9;
        Object[] objArr = this.f14033c;
        int i12 = this.f14031a;
        for (int i13 = 0; i13 < i12; i13++) {
            iHashCode = (iHashCode * 31) + objArr[i13].hashCode();
        }
        return (i11 * 31) + iHashCode;
    }
}
