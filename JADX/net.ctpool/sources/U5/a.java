package U5;

import F5.g;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import i6.f;
import java.net.IDN;
import java.net.InetAddress;
import java.util.Locale;
import w5.k;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {
    private static final boolean a(String str) {
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            char cCharAt = str.charAt(i7);
            if (k.g(cCharAt, 31) <= 0 || k.g(cCharAt, ModuleDescriptor.MODULE_VERSION) >= 0 || g.Q(" #%/:?@[\\]", cCharAt, 0, false, 6, null) != -1) {
                return true;
            }
        }
        return false;
    }

    private static final boolean b(String str, int i7, int i8, byte[] bArr, int i9) {
        int i10 = i9;
        while (i7 < i8) {
            if (i10 == bArr.length) {
                return false;
            }
            if (i10 != i9) {
                if (str.charAt(i7) != '.') {
                    return false;
                }
                i7++;
            }
            int i11 = i7;
            int i12 = 0;
            while (i11 < i8) {
                char cCharAt = str.charAt(i11);
                if (k.g(cCharAt, 48) < 0 || k.g(cCharAt, 57) > 0) {
                    break;
                }
                if ((i12 == 0 && i7 != i11) || (i12 = ((i12 * 10) + cCharAt) - 48) > 255) {
                    return false;
                }
                i11++;
            }
            if (i11 - i7 == 0) {
                return false;
            }
            bArr[i10] = (byte) i12;
            i10++;
            i7 = i11;
        }
        return i10 == i9 + 4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0097, code lost:
    
        if (r13 == 16) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0099, code lost:
    
        if (r14 != (-1)) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009b, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009c, code lost:
    
        r0 = r13 - r14;
        java.lang.System.arraycopy(r9, r14, r9, 16 - r0, r0);
        java.util.Arrays.fill(r9, r14, (16 - r13) + r14, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ae, code lost:
    
        return java.net.InetAddress.getByAddress(r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final InetAddress c(String str, int i7, int i8) {
        int i9;
        byte[] bArr = new byte[16];
        int i10 = i7;
        int i11 = -1;
        int i12 = -1;
        int i13 = 0;
        while (true) {
            if (i10 < i8) {
                if (i13 != 16) {
                    int i14 = i10 + 2;
                    if (i14 <= i8 && g.A(str, "::", i10, false, 4, null)) {
                        if (i11 == -1) {
                            i13 += 2;
                            if (i14 != i8) {
                                i12 = i14;
                                i11 = i13;
                                i10 = i12;
                                int i15 = 0;
                                while (i10 < i8) {
                                }
                                i9 = i10 - i12;
                                if (i9 == 0) {
                                    break;
                                }
                                break;
                                break;
                            }
                            i11 = i13;
                            break;
                        }
                        return null;
                    }
                    if (i13 != 0) {
                        if (g.A(str, ":", i10, false, 4, null)) {
                            i10++;
                        } else {
                            if (!g.A(str, ".", i10, false, 4, null) || !b(str, i12, i8, bArr, i13 - 2)) {
                                return null;
                            }
                            i13 += 2;
                        }
                    }
                    i12 = i10;
                    i10 = i12;
                    int i152 = 0;
                    while (i10 < i8) {
                        int iF = c.F(str.charAt(i10));
                        if (iF == -1) {
                            break;
                        }
                        i152 = (i152 << 4) + iF;
                        i10++;
                    }
                    i9 = i10 - i12;
                    if (i9 == 0 || i9 > 4) {
                        break;
                    }
                    int i16 = i13 + 1;
                    bArr[i13] = (byte) ((i152 >>> 8) & 255);
                    i13 += 2;
                    bArr[i16] = (byte) (i152 & 255);
                } else {
                    return null;
                }
            } else {
                break;
            }
        }
        return null;
    }

    private static final String d(byte[] bArr) {
        int i7 = -1;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i9 < bArr.length) {
            int i11 = i9;
            while (i11 < 16 && bArr[i11] == 0 && bArr[i11 + 1] == 0) {
                i11 += 2;
            }
            int i12 = i11 - i9;
            if (i12 > i10 && i12 >= 4) {
                i7 = i9;
                i10 = i12;
            }
            i9 = i11 + 2;
        }
        f fVar = new f();
        while (i8 < bArr.length) {
            if (i8 == i7) {
                fVar.P(58);
                i8 += i10;
                if (i8 == 16) {
                    fVar.P(58);
                }
            } else {
                if (i8 > 0) {
                    fVar.P(58);
                }
                fVar.v0((c.b(bArr[i8], 255) << 8) | c.b(bArr[i8 + 1], 255));
                i8 += 2;
            }
        }
        return fVar.J0();
    }

    public static final String e(String str) {
        int length;
        k.f(str, "$this$toCanonicalHost");
        int i7 = 0;
        if (!g.G(str, ":", false, 2, null)) {
            try {
                String ascii = IDN.toASCII(str);
                k.e(ascii, "IDN.toASCII(host)");
                Locale locale = Locale.US;
                k.e(locale, "Locale.US");
                if (ascii == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                String lowerCase = ascii.toLowerCase(locale);
                k.e(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() != 0 && !a(lowerCase)) {
                    return lowerCase;
                }
                return null;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        if (g.B(str, "[", false, 2, null) && g.o(str, "]", false, 2, null)) {
            i7 = 1;
            length = str.length() - 1;
        } else {
            length = str.length();
        }
        InetAddress inetAddressC = c(str, i7, length);
        if (inetAddressC == null) {
            return null;
        }
        byte[] address = inetAddressC.getAddress();
        if (address.length == 16) {
            k.e(address, "address");
            return d(address);
        }
        if (address.length == 4) {
            return inetAddressC.getHostAddress();
        }
        throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
    }
}
