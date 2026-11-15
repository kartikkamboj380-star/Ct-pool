package j6;

import com.tenjin.android.utils.adnetwork.TradPlusHelper;
import i6.AbstractC1750b;
import i6.f;
import i6.t;
import i6.x;
import java.io.EOFException;
import w5.k;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f20432a = AbstractC1750b.a("0123456789abcdef");

    public static final byte[] a() {
        return f20432a;
    }

    public static final boolean b(x xVar, int i7, byte[] bArr, int i8, int i9) {
        k.f(xVar, TradPlusHelper.KEY_SEGMENT);
        k.f(bArr, "bytes");
        int i10 = xVar.f20057c;
        byte[] bArr2 = xVar.f20055a;
        while (i8 < i9) {
            if (i7 == i10) {
                xVar = xVar.f20060f;
                k.c(xVar);
                byte[] bArr3 = xVar.f20055a;
                bArr2 = bArr3;
                i7 = xVar.f20056b;
                i10 = xVar.f20057c;
            }
            if (bArr2[i7] != bArr[i8]) {
                return false;
            }
            i7++;
            i8++;
        }
        return true;
    }

    public static final String c(f fVar, long j7) throws EOFException {
        k.f(fVar, "$this$readUtf8Line");
        if (j7 > 0) {
            long j8 = j7 - 1;
            if (fVar.z(j8) == ((byte) 13)) {
                String strK1 = fVar.k1(j8);
                fVar.y0(2L);
                return strK1;
            }
        }
        String strK12 = fVar.k1(j7);
        fVar.y0(1L);
        return strK12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005d, code lost:
    
        if (r19 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
    
        return -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
    
        return r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int d(f fVar, t tVar, boolean z6) {
        int i7;
        int i8;
        x xVar;
        int i9;
        int i10;
        k.f(fVar, "$this$selectPrefix");
        k.f(tVar, "options");
        x xVar2 = fVar.f20007m;
        if (xVar2 == null) {
            return z6 ? -2 : -1;
        }
        byte[] bArr = xVar2.f20055a;
        int i11 = xVar2.f20056b;
        int i12 = xVar2.f20057c;
        int[] iArrM = tVar.m();
        x xVar3 = xVar2;
        int i13 = -1;
        int i14 = 0;
        loop0: while (true) {
            int i15 = i14 + 1;
            int i16 = iArrM[i14];
            int i17 = i14 + 2;
            int i18 = iArrM[i15];
            if (i18 != -1) {
                i13 = i18;
            }
            if (xVar3 == null) {
                break;
            }
            if (i16 >= 0) {
                i7 = i11 + 1;
                int i19 = bArr[i11] & 255;
                int i20 = i17 + i16;
                while (i17 != i20) {
                    if (i19 == iArrM[i17]) {
                        i8 = iArrM[i17 + i16];
                        if (i7 == i12) {
                            xVar3 = xVar3.f20060f;
                            k.c(xVar3);
                            i7 = xVar3.f20056b;
                            bArr = xVar3.f20055a;
                            i12 = xVar3.f20057c;
                            if (xVar3 == xVar2) {
                                xVar3 = null;
                            }
                        }
                    } else {
                        i17++;
                    }
                }
                return i13;
            }
            int i21 = i17 + (i16 * (-1));
            while (true) {
                int i22 = i11 + 1;
                int i23 = i17 + 1;
                if ((bArr[i11] & 255) != iArrM[i17]) {
                    return i13;
                }
                boolean z7 = i23 == i21;
                if (i22 == i12) {
                    k.c(xVar3);
                    x xVar4 = xVar3.f20060f;
                    k.c(xVar4);
                    i10 = xVar4.f20056b;
                    byte[] bArr2 = xVar4.f20055a;
                    i9 = xVar4.f20057c;
                    if (xVar4 != xVar2) {
                        xVar = xVar4;
                        bArr = bArr2;
                    } else {
                        if (!z7) {
                            break loop0;
                        }
                        bArr = bArr2;
                        xVar = null;
                    }
                } else {
                    xVar = xVar3;
                    i9 = i12;
                    i10 = i22;
                }
                if (z7) {
                    i8 = iArrM[i23];
                    i7 = i10;
                    i12 = i9;
                    xVar3 = xVar;
                    break;
                }
                i11 = i10;
                i12 = i9;
                xVar3 = xVar;
                i17 = i23;
            }
            if (i8 >= 0) {
                return i8;
            }
            i14 = -i8;
            i11 = i7;
        }
    }

    public static /* synthetic */ int e(f fVar, t tVar, boolean z6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z6 = false;
        }
        return d(fVar, tVar, z6);
    }
}
