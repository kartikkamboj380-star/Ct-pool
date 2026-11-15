package com.google.android.gms.internal.auth;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0964f0 {
    static int a(byte[] bArr, int i7, C0961e0 c0961e0) {
        int iH = h(bArr, i7, c0961e0);
        int i8 = c0961e0.f13899a;
        if (i8 < 0) {
            throw H0.c();
        }
        if (i8 > bArr.length - iH) {
            throw H0.f();
        }
        if (i8 == 0) {
            c0961e0.f13901c = AbstractC0997q0.f14021n;
            return iH;
        }
        c0961e0.f13901c = AbstractC0997q0.q(bArr, iH, i8);
        return iH + i8;
    }

    static int b(byte[] bArr, int i7) {
        int i8 = bArr[i7] & 255;
        int i9 = bArr[i7 + 1] & 255;
        int i10 = bArr[i7 + 2] & 255;
        return ((bArr[i7 + 3] & 255) << 24) | (i9 << 8) | i8 | (i10 << 16);
    }

    static int c(InterfaceC0983l1 interfaceC0983l1, byte[] bArr, int i7, int i8, int i9, C0961e0 c0961e0) {
        Object objZzd = interfaceC0983l1.zzd();
        int iL = l(objZzd, interfaceC0983l1, bArr, i7, i8, i9, c0961e0);
        interfaceC0983l1.d(objZzd);
        c0961e0.f13901c = objZzd;
        return iL;
    }

    static int d(InterfaceC0983l1 interfaceC0983l1, byte[] bArr, int i7, int i8, C0961e0 c0961e0) {
        Object objZzd = interfaceC0983l1.zzd();
        int iM = m(objZzd, interfaceC0983l1, bArr, i7, i8, c0961e0);
        interfaceC0983l1.d(objZzd);
        c0961e0.f13901c = objZzd;
        return iM;
    }

    static int e(InterfaceC0983l1 interfaceC0983l1, int i7, byte[] bArr, int i8, int i9, E0 e02, C0961e0 c0961e0) {
        int iD = d(interfaceC0983l1, bArr, i8, i9, c0961e0);
        while (true) {
            e02.add(c0961e0.f13901c);
            if (iD >= i9) {
                break;
            }
            int iH = h(bArr, iD, c0961e0);
            if (i7 != c0961e0.f13899a) {
                break;
            }
            iD = d(interfaceC0983l1, bArr, iH, i9, c0961e0);
        }
        return iD;
    }

    static int f(byte[] bArr, int i7, E0 e02, C0961e0 c0961e0) {
        androidx.appcompat.app.y.a(e02);
        int iH = h(bArr, i7, c0961e0);
        int i8 = c0961e0.f13899a + iH;
        if (iH < i8) {
            h(bArr, iH, c0961e0);
            throw null;
        }
        if (iH == i8) {
            return iH;
        }
        throw H0.f();
    }

    static int g(int i7, byte[] bArr, int i8, int i9, C1003s1 c1003s1, C0961e0 c0961e0) {
        if ((i7 >>> 3) == 0) {
            throw H0.a();
        }
        int i10 = i7 & 7;
        if (i10 == 0) {
            int iK = k(bArr, i8, c0961e0);
            c1003s1.h(i7, Long.valueOf(c0961e0.f13900b));
            return iK;
        }
        if (i10 == 1) {
            c1003s1.h(i7, Long.valueOf(n(bArr, i8)));
            return i8 + 8;
        }
        if (i10 == 2) {
            int iH = h(bArr, i8, c0961e0);
            int i11 = c0961e0.f13899a;
            if (i11 < 0) {
                throw H0.c();
            }
            if (i11 > bArr.length - iH) {
                throw H0.f();
            }
            c1003s1.h(i7, i11 == 0 ? AbstractC0997q0.f14021n : AbstractC0997q0.q(bArr, iH, i11));
            return iH + i11;
        }
        if (i10 != 3) {
            if (i10 != 5) {
                throw H0.a();
            }
            c1003s1.h(i7, Integer.valueOf(b(bArr, i8)));
            return i8 + 4;
        }
        int i12 = (i7 & (-8)) | 4;
        C1003s1 c1003s1D = C1003s1.d();
        int i13 = 0;
        while (true) {
            if (i8 >= i9) {
                break;
            }
            int iH2 = h(bArr, i8, c0961e0);
            int i14 = c0961e0.f13899a;
            i13 = i14;
            if (i14 == i12) {
                i8 = iH2;
                break;
            }
            int iG = g(i13, bArr, iH2, i9, c1003s1D, c0961e0);
            i13 = i14;
            i8 = iG;
        }
        if (i8 > i9 || i13 != i12) {
            throw H0.d();
        }
        c1003s1.h(i7, c1003s1D);
        return i8;
    }

    static int h(byte[] bArr, int i7, C0961e0 c0961e0) {
        int i8 = i7 + 1;
        byte b7 = bArr[i7];
        if (b7 < 0) {
            return i(b7, bArr, i8, c0961e0);
        }
        c0961e0.f13899a = b7;
        return i8;
    }

    static int i(int i7, byte[] bArr, int i8, C0961e0 c0961e0) {
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
                c0961e0.f13899a = i12 | (b8 << 14);
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
                    c0961e0.f13899a = i14 | (b10 << 28);
                    return i15;
                }
                int i16 = i14 | ((b10 & 127) << 28);
                while (true) {
                    int i17 = i15 + 1;
                    if (bArr[i15] >= 0) {
                        c0961e0.f13899a = i16;
                        return i17;
                    }
                    i15 = i17;
                }
            }
        }
        c0961e0.f13899a = i11 | i9;
        return i10;
    }

    static int j(int i7, byte[] bArr, int i8, int i9, E0 e02, C0961e0 c0961e0) {
        androidx.appcompat.app.y.a(e02);
        h(bArr, i8, c0961e0);
        int i10 = c0961e0.f13899a;
        throw null;
    }

    static int k(byte[] bArr, int i7, C0961e0 c0961e0) {
        long j7 = bArr[i7];
        int i8 = i7 + 1;
        if (j7 >= 0) {
            c0961e0.f13900b = j7;
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
        c0961e0.f13900b = j8;
        return i9;
    }

    static int l(Object obj, InterfaceC0983l1 interfaceC0983l1, byte[] bArr, int i7, int i8, int i9, C0961e0 c0961e0) {
        int iP = ((C0959d1) interfaceC0983l1).p(obj, bArr, i7, i8, i9, c0961e0);
        c0961e0.f13901c = obj;
        return iP;
    }

    static int m(Object obj, InterfaceC0983l1 interfaceC0983l1, byte[] bArr, int i7, int i8, C0961e0 c0961e0) {
        int i9 = i7 + 1;
        int i10 = bArr[i7];
        if (i10 < 0) {
            i9 = i(i10, bArr, i9, c0961e0);
            i10 = c0961e0.f13899a;
        }
        int i11 = i9;
        if (i10 < 0 || i10 > i8 - i11) {
            throw H0.f();
        }
        int i12 = i10 + i11;
        interfaceC0983l1.e(obj, bArr, i11, i12, c0961e0);
        c0961e0.f13901c = obj;
        return i12;
    }

    static long n(byte[] bArr, int i7) {
        return (((long) bArr[i7]) & 255) | ((((long) bArr[i7 + 1]) & 255) << 8) | ((((long) bArr[i7 + 2]) & 255) << 16) | ((((long) bArr[i7 + 3]) & 255) << 24) | ((((long) bArr[i7 + 4]) & 255) << 32) | ((((long) bArr[i7 + 5]) & 255) << 40) | ((((long) bArr[i7 + 6]) & 255) << 48) | ((((long) bArr[i7 + 7]) & 255) << 56);
    }
}
