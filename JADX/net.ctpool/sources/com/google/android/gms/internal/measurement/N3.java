package com.google.android.gms.internal.measurement;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes.dex */
abstract class N3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile int f14288a = 100;

    static double a(byte[] bArr, int i7) {
        return Double.longBitsToDouble(t(bArr, i7));
    }

    static int b(int i7, byte[] bArr, int i8, int i9, J4 j42, Q3 q32) {
        C4 c42 = (C4) j42;
        int iR = r(bArr, i8, q32);
        while (true) {
            c42.i(q32.f14318a);
            if (iR >= i9) {
                break;
            }
            int iR2 = r(bArr, iR, q32);
            if (i7 != q32.f14318a) {
                break;
            }
            iR = r(bArr, iR2, q32);
        }
        return iR;
    }

    static int c(int i7, byte[] bArr, int i8, int i9, K5 k52, Q3 q32) {
        if ((i7 >>> 3) == 0) {
            throw I4.b();
        }
        int i10 = i7 & 7;
        if (i10 == 0) {
            int iS = s(bArr, i8, q32);
            k52.e(i7, Long.valueOf(q32.f14319b));
            return iS;
        }
        if (i10 == 1) {
            k52.e(i7, Long.valueOf(t(bArr, i8)));
            return i8 + 8;
        }
        if (i10 == 2) {
            int iR = r(bArr, i8, q32);
            int i11 = q32.f14318a;
            if (i11 < 0) {
                throw I4.d();
            }
            if (i11 > bArr.length - iR) {
                throw I4.g();
            }
            k52.e(i7, i11 == 0 ? R3.f14328n : R3.o(bArr, iR, i11));
            return iR + i11;
        }
        if (i10 != 3) {
            if (i10 != 5) {
                throw I4.b();
            }
            k52.e(i7, Integer.valueOf(q(bArr, i8)));
            return i8 + 4;
        }
        K5 k5L = K5.l();
        int i12 = (i7 & (-8)) | 4;
        int i13 = q32.f14322e + 1;
        q32.f14322e = i13;
        m(i13);
        int i14 = 0;
        while (true) {
            if (i8 >= i9) {
                break;
            }
            int iR2 = r(bArr, i8, q32);
            int i15 = q32.f14318a;
            i14 = i15;
            if (i15 == i12) {
                i8 = iR2;
                break;
            }
            int iC = c(i14, bArr, iR2, i9, k5L, q32);
            i14 = i15;
            i8 = iC;
        }
        q32.f14322e--;
        if (i8 > i9 || i14 != i12) {
            throw I4.e();
        }
        k52.e(i7, k5L);
        return i8;
    }

    static int d(int i7, byte[] bArr, int i8, int i9, Object obj, InterfaceC1095g5 interfaceC1095g5, L5 l52, Q3 q32) {
        q32.f14321d.b(interfaceC1095g5, i7 >>> 3);
        return c(i7, bArr, i8, i9, C1122j5.I(obj), q32);
    }

    static int e(int i7, byte[] bArr, int i8, Q3 q32) {
        int i9;
        int i10 = i7 & ModuleDescriptor.MODULE_VERSION;
        int i11 = i8 + 1;
        byte b7 = bArr[i8];
        if (b7 >= 0) {
            i9 = b7 << 7;
        } else {
            int i12 = i10 | ((b7 & 127) << 7);
            int i13 = i8 + 2;
            byte b8 = bArr[i11];
            if (b8 >= 0) {
                q32.f14318a = i12 | (b8 << 14);
                return i13;
            }
            i10 = i12 | ((b8 & 127) << 14);
            i11 = i8 + 3;
            byte b9 = bArr[i13];
            if (b9 >= 0) {
                i9 = b9 << 21;
            } else {
                int i14 = i10 | ((b9 & 127) << 21);
                int i15 = i8 + 4;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    q32.f14318a = i14 | (b10 << 28);
                    return i15;
                }
                int i16 = i14 | ((b10 & 127) << 28);
                while (true) {
                    int i17 = i15 + 1;
                    if (bArr[i15] >= 0) {
                        q32.f14318a = i16;
                        return i17;
                    }
                    i15 = i17;
                }
            }
        }
        q32.f14318a = i10 | i9;
        return i11;
    }

    static int f(InterfaceC1229v5 interfaceC1229v5, int i7, byte[] bArr, int i8, int i9, J4 j42, Q3 q32) {
        int i10 = (i7 & (-8)) | 4;
        int iG = g(interfaceC1229v5, bArr, i8, i9, i10, q32);
        while (true) {
            j42.add(q32.f14320c);
            if (iG >= i9) {
                break;
            }
            int iR = r(bArr, iG, q32);
            if (i7 != q32.f14318a) {
                break;
            }
            iG = g(interfaceC1229v5, bArr, iR, i9, i10, q32);
        }
        return iG;
    }

    private static int g(InterfaceC1229v5 interfaceC1229v5, byte[] bArr, int i7, int i8, int i9, Q3 q32) {
        Object objA = interfaceC1229v5.a();
        int i10 = i(objA, interfaceC1229v5, bArr, i7, i8, i9, q32);
        interfaceC1229v5.g(objA);
        q32.f14320c = objA;
        return i10;
    }

    static int h(InterfaceC1229v5 interfaceC1229v5, byte[] bArr, int i7, int i8, Q3 q32) {
        Object objA = interfaceC1229v5.a();
        int iJ = j(objA, interfaceC1229v5, bArr, i7, i8, q32);
        interfaceC1229v5.g(objA);
        q32.f14320c = objA;
        return iJ;
    }

    static int i(Object obj, InterfaceC1229v5 interfaceC1229v5, byte[] bArr, int i7, int i8, int i9, Q3 q32) {
        C1122j5 c1122j5 = (C1122j5) interfaceC1229v5;
        int i10 = q32.f14322e + 1;
        q32.f14322e = i10;
        m(i10);
        int iM = c1122j5.m(obj, bArr, i7, i8, i9, q32);
        q32.f14322e--;
        q32.f14320c = obj;
        return iM;
    }

    static int j(Object obj, InterfaceC1229v5 interfaceC1229v5, byte[] bArr, int i7, int i8, Q3 q32) {
        int iE = i7 + 1;
        int i9 = bArr[i7];
        if (i9 < 0) {
            iE = e(i9, bArr, iE, q32);
            i9 = q32.f14318a;
        }
        int i10 = iE;
        if (i9 < 0 || i9 > i8 - i10) {
            throw I4.g();
        }
        int i11 = q32.f14322e + 1;
        q32.f14322e = i11;
        m(i11);
        int i12 = i9 + i10;
        interfaceC1229v5.f(obj, bArr, i10, i12, q32);
        q32.f14322e--;
        q32.f14320c = obj;
        return i12;
    }

    static int k(byte[] bArr, int i7, Q3 q32) {
        int iR = r(bArr, i7, q32);
        int i8 = q32.f14318a;
        if (i8 < 0) {
            throw I4.d();
        }
        if (i8 > bArr.length - iR) {
            throw I4.g();
        }
        if (i8 == 0) {
            q32.f14320c = R3.f14328n;
            return iR;
        }
        q32.f14320c = R3.o(bArr, iR, i8);
        return iR + i8;
    }

    static int l(byte[] bArr, int i7, J4 j42, Q3 q32) {
        C4 c42 = (C4) j42;
        int iR = r(bArr, i7, q32);
        int i8 = q32.f14318a + iR;
        while (iR < i8) {
            iR = r(bArr, iR, q32);
            c42.i(q32.f14318a);
        }
        if (iR == i8) {
            return iR;
        }
        throw I4.g();
    }

    private static void m(int i7) throws I4 {
        if (i7 >= f14288a) {
            throw I4.f();
        }
    }

    static float n(byte[] bArr, int i7) {
        return Float.intBitsToFloat(q(bArr, i7));
    }

    static int o(InterfaceC1229v5 interfaceC1229v5, int i7, byte[] bArr, int i8, int i9, J4 j42, Q3 q32) {
        int iH = h(interfaceC1229v5, bArr, i8, i9, q32);
        while (true) {
            j42.add(q32.f14320c);
            if (iH >= i9) {
                break;
            }
            int iR = r(bArr, iH, q32);
            if (i7 != q32.f14318a) {
                break;
            }
            iH = h(interfaceC1229v5, bArr, iR, i9, q32);
        }
        return iH;
    }

    static int p(byte[] bArr, int i7, Q3 q32) {
        int iR = r(bArr, i7, q32);
        int i8 = q32.f14318a;
        if (i8 < 0) {
            throw I4.d();
        }
        if (i8 == 0) {
            q32.f14320c = "";
            return iR;
        }
        q32.f14320c = Q5.d(bArr, iR, i8);
        return iR + i8;
    }

    static int q(byte[] bArr, int i7) {
        return ((bArr[i7 + 3] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16);
    }

    static int r(byte[] bArr, int i7, Q3 q32) {
        int i8 = i7 + 1;
        byte b7 = bArr[i7];
        if (b7 < 0) {
            return e(b7, bArr, i8, q32);
        }
        q32.f14318a = b7;
        return i8;
    }

    static int s(byte[] bArr, int i7, Q3 q32) {
        int i8 = i7 + 1;
        long j7 = bArr[i7];
        if (j7 >= 0) {
            q32.f14319b = j7;
            return i8;
        }
        int i9 = i7 + 2;
        byte b7 = bArr[i8];
        long j8 = (j7 & 127) | (((long) (b7 & 127)) << 7);
        int i10 = 7;
        while (b7 < 0) {
            int i11 = i9 + 1;
            byte b8 = bArr[i9];
            i10 += 7;
            j8 |= ((long) (b8 & 127)) << i10;
            b7 = b8;
            i9 = i11;
        }
        q32.f14319b = j8;
        return i9;
    }

    static long t(byte[] bArr, int i7) {
        return ((((long) bArr[i7 + 7]) & 255) << 56) | (((long) bArr[i7]) & 255) | ((((long) bArr[i7 + 1]) & 255) << 8) | ((((long) bArr[i7 + 2]) & 255) << 16) | ((((long) bArr[i7 + 3]) & 255) << 24) | ((((long) bArr[i7 + 4]) & 255) << 32) | ((((long) bArr[i7 + 5]) & 255) << 40) | ((((long) bArr[i7 + 6]) & 255) << 48);
    }
}
