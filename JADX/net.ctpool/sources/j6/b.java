package j6;

import i5.u;
import i6.f;
import i6.i;
import i6.z;
import w5.k;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f20433a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005b, code lost:
    
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int c(byte[] bArr, int i7) {
        byte b7;
        int i8;
        int length = bArr.length;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        loop0: while (i9 < length) {
            byte b8 = bArr[i9];
            if (b8 >= 0) {
                int i12 = i11 + 1;
                if (i11 == i7) {
                    return i10;
                }
                if ((b8 != 10 && b8 != 13 && ((b8 >= 0 && 31 >= b8) || (127 <= b8 && 159 >= b8))) || b8 == 65533) {
                    return -1;
                }
                i10 += b8 < 65536 ? 1 : 2;
                i9++;
                while (true) {
                    i11 = i12;
                    if (i9 < length && (b7 = bArr[i9]) >= 0) {
                        i9++;
                        i12 = i11 + 1;
                        if (i11 != i7) {
                            if ((b7 != 10 && b7 != 13 && ((b7 >= 0 && 31 >= b7) || (127 <= b7 && 159 >= b7))) || b7 == 65533) {
                                break loop0;
                            }
                            i10 += b7 < 65536 ? 1 : 2;
                        } else {
                            return i10;
                        }
                    } else {
                        break;
                    }
                }
            } else {
                if ((b8 >> 5) == -2) {
                    int i13 = i9 + 1;
                    if (length <= i13) {
                        if (i11 == i7) {
                            return i10;
                        }
                        return -1;
                    }
                    byte b9 = bArr[i13];
                    if ((b9 & 192) != 128) {
                        if (i11 == i7) {
                            return i10;
                        }
                        return -1;
                    }
                    int i14 = (b9 ^ 3968) ^ (b8 << 6);
                    if (i14 < 128) {
                        if (i11 == i7) {
                            return i10;
                        }
                        return -1;
                    }
                    i8 = i11 + 1;
                    if (i11 == i7) {
                        return i10;
                    }
                    if ((i14 != 10 && i14 != 13 && ((i14 >= 0 && 31 >= i14) || (127 <= i14 && 159 >= i14))) || i14 == 65533) {
                        return -1;
                    }
                    i10 += i14 < 65536 ? 1 : 2;
                    u uVar = u.f19985a;
                    i9 += 2;
                } else if ((b8 >> 4) == -2) {
                    int i15 = i9 + 2;
                    if (length <= i15) {
                        if (i11 == i7) {
                            return i10;
                        }
                        return -1;
                    }
                    byte b10 = bArr[i9 + 1];
                    if ((b10 & 192) != 128) {
                        if (i11 == i7) {
                            return i10;
                        }
                        return -1;
                    }
                    byte b11 = bArr[i15];
                    if ((b11 & 192) != 128) {
                        if (i11 == i7) {
                            return i10;
                        }
                        return -1;
                    }
                    int i16 = ((b10 << 6) ^ ((-123008) ^ b11)) ^ (b8 << 12);
                    if (i16 < 2048) {
                        if (i11 == i7) {
                            return i10;
                        }
                        return -1;
                    }
                    if (55296 <= i16 && 57343 >= i16) {
                        if (i11 == i7) {
                            return i10;
                        }
                        return -1;
                    }
                    i8 = i11 + 1;
                    if (i11 == i7) {
                        return i10;
                    }
                    if ((i16 != 10 && i16 != 13 && ((i16 >= 0 && 31 >= i16) || (127 <= i16 && 159 >= i16))) || i16 == 65533) {
                        return -1;
                    }
                    i10 += i16 < 65536 ? 1 : 2;
                    u uVar2 = u.f19985a;
                    i9 += 3;
                } else {
                    if ((b8 >> 3) != -2) {
                        if (i11 == i7) {
                            return i10;
                        }
                        return -1;
                    }
                    int i17 = i9 + 3;
                    if (length <= i17) {
                        if (i11 == i7) {
                            return i10;
                        }
                        return -1;
                    }
                    byte b12 = bArr[i9 + 1];
                    if ((b12 & 192) != 128) {
                        if (i11 == i7) {
                            return i10;
                        }
                        return -1;
                    }
                    byte b13 = bArr[i9 + 2];
                    if ((b13 & 192) != 128) {
                        if (i11 == i7) {
                            return i10;
                        }
                        return -1;
                    }
                    byte b14 = bArr[i17];
                    if ((b14 & 192) != 128) {
                        if (i11 == i7) {
                            return i10;
                        }
                        return -1;
                    }
                    int i18 = (((b14 ^ 3678080) ^ (b13 << 6)) ^ (b12 << 12)) ^ (b8 << 18);
                    if (i18 > 1114111) {
                        if (i11 == i7) {
                            return i10;
                        }
                        return -1;
                    }
                    if (55296 <= i18 && 57343 >= i18) {
                        if (i11 == i7) {
                            return i10;
                        }
                        return -1;
                    }
                    if (i18 < 65536) {
                        if (i11 == i7) {
                            return i10;
                        }
                        return -1;
                    }
                    i8 = i11 + 1;
                    if (i11 == i7) {
                        return i10;
                    }
                    if ((i18 != 10 && i18 != 13 && ((i18 >= 0 && 31 >= i18) || (127 <= i18 && 159 >= i18))) || i18 == 65533) {
                        return -1;
                    }
                    i10 += i18 < 65536 ? 1 : 2;
                    u uVar3 = u.f19985a;
                    i9 += 4;
                }
                i11 = i8;
            }
        }
        return i10;
    }

    public static final i d(i iVar, String str) {
        k.f(iVar, "$this$commonDigest");
        k.f(str, "algorithm");
        c cVarA = d.a(str);
        cVarA.b(iVar.n(), 0, iVar.C());
        return new i(cVarA.a());
    }

    public static final i e(z zVar, String str) {
        k.f(zVar, "$this$commonSegmentDigest");
        k.f(str, "algorithm");
        c cVarA = d.a(str);
        int length = zVar.J().length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            int i9 = zVar.I()[length + i7];
            int i10 = zVar.I()[i7];
            cVarA.b(zVar.J()[i7], i9, i10 - i8);
            i7++;
            i8 = i10;
        }
        return new i(cVarA.a());
    }

    public static final void f(i iVar, f fVar, int i7, int i8) {
        k.f(iVar, "$this$commonWrite");
        k.f(fVar, "buffer");
        fVar.r0(iVar.n(), i7, i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int g(char c7) {
        if ('0' <= c7 && '9' >= c7) {
            return c7 - '0';
        }
        if ('a' <= c7 && 'f' >= c7) {
            return c7 - 'W';
        }
        if ('A' <= c7 && 'F' >= c7) {
            return c7 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c7);
    }

    public static final char[] h() {
        return f20433a;
    }
}
