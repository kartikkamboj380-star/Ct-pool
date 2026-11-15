package i6;

/* JADX INFO: renamed from: i6.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1751c {
    public static final boolean a(byte[] bArr, int i7, byte[] bArr2, int i8, int i9) {
        w5.k.f(bArr, "a");
        w5.k.f(bArr2, "b");
        for (int i10 = 0; i10 < i9; i10++) {
            if (bArr[i10 + i7] != bArr2[i10 + i8]) {
                return false;
            }
        }
        return true;
    }

    public static final void b(long j7, long j8, long j9) {
        if ((j8 | j9) < 0 || j8 > j7 || j7 - j8 < j9) {
            throw new ArrayIndexOutOfBoundsException("size=" + j7 + " offset=" + j8 + " byteCount=" + j9);
        }
    }

    public static final int c(int i7) {
        return ((i7 & 255) << 24) | (((-16777216) & i7) >>> 24) | ((16711680 & i7) >>> 8) | ((65280 & i7) << 8);
    }

    public static final short d(short s6) {
        return (short) (((s6 & 255) << 8) | ((65280 & s6) >>> 8));
    }

    public static final String e(byte b7) {
        return new String(new char[]{j6.b.h()[(b7 >> 4) & 15], j6.b.h()[b7 & 15]});
    }

    public static final String f(int i7) {
        int i8 = 0;
        if (i7 == 0) {
            return "0";
        }
        char[] cArr = {j6.b.h()[(i7 >> 28) & 15], j6.b.h()[(i7 >> 24) & 15], j6.b.h()[(i7 >> 20) & 15], j6.b.h()[(i7 >> 16) & 15], j6.b.h()[(i7 >> 12) & 15], j6.b.h()[(i7 >> 8) & 15], j6.b.h()[(i7 >> 4) & 15], j6.b.h()[i7 & 15]};
        while (i8 < 8 && cArr[i8] == '0') {
            i8++;
        }
        return new String(cArr, i8, 8 - i8);
    }
}
