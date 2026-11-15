package j6;

import i6.z;
import w5.k;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e {
    public static final int a(int[] iArr, int i7, int i8, int i9) {
        k.f(iArr, "$this$binarySearch");
        int i10 = i9 - 1;
        while (i8 <= i10) {
            int i11 = (i8 + i10) >>> 1;
            int i12 = iArr[i11];
            if (i12 < i7) {
                i8 = i11 + 1;
            } else {
                if (i12 <= i7) {
                    return i11;
                }
                i10 = i11 - 1;
            }
        }
        return (-i8) - 1;
    }

    public static final int b(z zVar, int i7) {
        k.f(zVar, "$this$segment");
        int iA = a(zVar.I(), i7 + 1, 0, zVar.J().length);
        return iA >= 0 ? iA : ~iA;
    }
}
