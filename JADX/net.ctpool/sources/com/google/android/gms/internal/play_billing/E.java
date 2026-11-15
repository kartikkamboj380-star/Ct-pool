package com.google.android.gms.internal.play_billing;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes.dex */
abstract class E {
    static int a(byte[] bArr, int i7, D d7) {
        int iH = h(bArr, i7, d7);
        int i8 = d7.f15039a;
        if (i8 < 0) {
            throw B0.d();
        }
        if (i8 > bArr.length - iH) {
            throw B0.g();
        }
        if (i8 == 0) {
            d7.f15041c = S.f15105n;
            return iH;
        }
        d7.f15041c = S.r(bArr, iH, i8);
        return iH + i8;
    }

    static int b(byte[] bArr, int i7) {
        int i8 = bArr[i7] & 255;
        int i9 = bArr[i7 + 1] & 255;
        int i10 = bArr[i7 + 2] & 255;
        return ((bArr[i7 + 3] & 255) << 24) | (i9 << 8) | i8 | (i10 << 16);
    }

    static int c(InterfaceC1293h1 interfaceC1293h1, byte[] bArr, int i7, int i8, int i9, D d7) {
        Object objB = interfaceC1293h1.b();
        int iL = l(objB, interfaceC1293h1, bArr, i7, i8, i9, d7);
        interfaceC1293h1.f(objB);
        d7.f15041c = objB;
        return iL;
    }

    static int d(InterfaceC1293h1 interfaceC1293h1, byte[] bArr, int i7, int i8, D d7) {
        Object objB = interfaceC1293h1.b();
        int iM = m(objB, interfaceC1293h1, bArr, i7, i8, d7);
        interfaceC1293h1.f(objB);
        d7.f15041c = objB;
        return iM;
    }

    static int e(InterfaceC1293h1 interfaceC1293h1, int i7, byte[] bArr, int i8, int i9, InterfaceC1350y0 interfaceC1350y0, D d7) {
        int iD = d(interfaceC1293h1, bArr, i8, i9, d7);
        while (true) {
            interfaceC1350y0.add(d7.f15041c);
            if (iD >= i9) {
                break;
            }
            int iH = h(bArr, iD, d7);
            if (i7 != d7.f15039a) {
                break;
            }
            iD = d(interfaceC1293h1, bArr, iH, i9, d7);
        }
        return iD;
    }

    static int f(byte[] bArr, int i7, InterfaceC1350y0 interfaceC1350y0, D d7) {
        C1332s0 c1332s0 = (C1332s0) interfaceC1350y0;
        int iH = h(bArr, i7, d7);
        int i8 = d7.f15039a + iH;
        while (iH < i8) {
            iH = h(bArr, iH, d7);
            c1332s0.i(d7.f15039a);
        }
        if (iH == i8) {
            return iH;
        }
        throw B0.g();
    }

    static int g(int i7, byte[] bArr, int i8, int i9, C1351y1 c1351y1, D d7) {
        if ((i7 >>> 3) == 0) {
            throw B0.b();
        }
        int i10 = i7 & 7;
        if (i10 == 0) {
            int iK = k(bArr, i8, d7);
            c1351y1.j(i7, Long.valueOf(d7.f15040b));
            return iK;
        }
        if (i10 == 1) {
            c1351y1.j(i7, Long.valueOf(n(bArr, i8)));
            return i8 + 8;
        }
        if (i10 == 2) {
            int iH = h(bArr, i8, d7);
            int i11 = d7.f15039a;
            if (i11 < 0) {
                throw B0.d();
            }
            if (i11 > bArr.length - iH) {
                throw B0.g();
            }
            c1351y1.j(i7, i11 == 0 ? S.f15105n : S.r(bArr, iH, i11));
            return iH + i11;
        }
        if (i10 != 3) {
            if (i10 != 5) {
                throw B0.b();
            }
            c1351y1.j(i7, Integer.valueOf(b(bArr, i8)));
            return i8 + 4;
        }
        int i12 = (i7 & (-8)) | 4;
        C1351y1 c1351y1F = C1351y1.f();
        int i13 = 0;
        while (true) {
            if (i8 >= i9) {
                break;
            }
            int iH2 = h(bArr, i8, d7);
            int i14 = d7.f15039a;
            i13 = i14;
            if (i14 == i12) {
                i8 = iH2;
                break;
            }
            int iG = g(i13, bArr, iH2, i9, c1351y1F, d7);
            i13 = i14;
            i8 = iG;
        }
        if (i8 > i9 || i13 != i12) {
            throw B0.e();
        }
        c1351y1.j(i7, c1351y1F);
        return i8;
    }

    static int h(byte[] bArr, int i7, D d7) {
        int i8 = i7 + 1;
        byte b7 = bArr[i7];
        if (b7 < 0) {
            return i(b7, bArr, i8, d7);
        }
        d7.f15039a = b7;
        return i8;
    }

    static int i(int i7, byte[] bArr, int i8, D d7) {
        int i9;
        byte b7 = bArr[i8];
        int i10 = i8 + 1;
        int i11 = i7 & ModuleDescriptor.MODULE_VERSION;
        if (b7 >= 0) {
            i9 = b7 << 7;
        } else {
            int i12 = i11 | ((b7 & 127) << 7);
            int i13 = i8 + 2;
            byte b8 = bArr[i10];
            if (b8 >= 0) {
                d7.f15039a = i12 | (b8 << 14);
                return i13;
            }
            i11 = i12 | ((b8 & 127) << 14);
            i10 = i8 + 3;
            byte b9 = bArr[i13];
            if (b9 >= 0) {
                i9 = b9 << 21;
            } else {
                int i14 = i11 | ((b9 & 127) << 21);
                int i15 = i8 + 4;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    d7.f15039a = i14 | (b10 << 28);
                    return i15;
                }
                int i16 = i14 | ((b10 & 127) << 28);
                while (true) {
                    int i17 = i15 + 1;
                    if (bArr[i15] >= 0) {
                        d7.f15039a = i16;
                        return i17;
                    }
                    i15 = i17;
                }
            }
        }
        d7.f15039a = i11 | i9;
        return i10;
    }

    static int j(int i7, byte[] bArr, int i8, int i9, InterfaceC1350y0 interfaceC1350y0, D d7) {
        C1332s0 c1332s0 = (C1332s0) interfaceC1350y0;
        int iH = h(bArr, i8, d7);
        while (true) {
            c1332s0.i(d7.f15039a);
            if (iH >= i9) {
                break;
            }
            int iH2 = h(bArr, iH, d7);
            if (i7 != d7.f15039a) {
                break;
            }
            iH = h(bArr, iH2, d7);
        }
        return iH;
    }

    static int k(byte[] bArr, int i7, D d7) {
        long j7 = bArr[i7];
        int i8 = i7 + 1;
        if (j7 >= 0) {
            d7.f15040b = j7;
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
        d7.f15040b = j8;
        return i9;
    }

    static int l(Object obj, InterfaceC1293h1 interfaceC1293h1, byte[] bArr, int i7, int i8, int i9, D d7) {
        int iY = ((Z0) interfaceC1293h1).y(obj, bArr, i7, i8, i9, d7);
        d7.f15041c = obj;
        return iY;
    }

    static int m(Object obj, InterfaceC1293h1 interfaceC1293h1, byte[] bArr, int i7, int i8, D d7) {
        int i9 = i7 + 1;
        int i10 = bArr[i7];
        if (i10 < 0) {
            i9 = i(i10, bArr, i9, d7);
            i10 = d7.f15039a;
        }
        int i11 = i9;
        if (i10 < 0 || i10 > i8 - i11) {
            throw B0.g();
        }
        int i12 = i10 + i11;
        interfaceC1293h1.d(obj, bArr, i11, i12, d7);
        d7.f15041c = obj;
        return i12;
    }

    static long n(byte[] bArr, int i7) {
        return (((long) bArr[i7]) & 255) | ((((long) bArr[i7 + 1]) & 255) << 8) | ((((long) bArr[i7 + 2]) & 255) << 16) | ((((long) bArr[i7 + 3]) & 255) << 24) | ((((long) bArr[i7 + 4]) & 255) << 32) | ((((long) bArr[i7 + 5]) & 255) << 40) | ((((long) bArr[i7 + 6]) & 255) << 48) | ((((long) bArr[i7 + 7]) & 255) << 56);
    }
}
