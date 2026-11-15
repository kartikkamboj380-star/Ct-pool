package q4;

import java.util.HashMap;

/* JADX INFO: renamed from: q4.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2000c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f21885a;

    public C2000c(int i7) {
        this.f21885a = i7;
    }

    private static boolean b(StackTraceElement[] stackTraceElementArr, int i7, int i8) {
        int i9 = i8 - i7;
        if (i8 + i9 > stackTraceElementArr.length) {
            return false;
        }
        for (int i10 = 0; i10 < i9; i10++) {
            if (!stackTraceElementArr[i7 + i10].equals(stackTraceElementArr[i8 + i10])) {
                return false;
            }
        }
        return true;
    }

    private static StackTraceElement[] c(StackTraceElement[] stackTraceElementArr, int i7) {
        int i8;
        HashMap map = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i9 = 0;
        int i10 = 0;
        int i11 = 1;
        while (i9 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i9];
            Integer num = (Integer) map.get(stackTraceElement);
            if (num == null || !b(stackTraceElementArr, num.intValue(), i9)) {
                stackTraceElementArr2[i10] = stackTraceElementArr[i9];
                i10++;
                i11 = 1;
                i8 = i9;
            } else {
                int iIntValue = i9 - num.intValue();
                if (i11 < i7) {
                    System.arraycopy(stackTraceElementArr, i9, stackTraceElementArr2, i10, iIntValue);
                    i10 += iIntValue;
                    i11++;
                }
                i8 = (iIntValue - 1) + i9;
            }
            map.put(stackTraceElement, Integer.valueOf(i9));
            i9 = i8 + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i10];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i10);
        return stackTraceElementArr3;
    }

    @Override // q4.d
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        StackTraceElement[] stackTraceElementArrC = c(stackTraceElementArr, this.f21885a);
        return stackTraceElementArrC.length < stackTraceElementArr.length ? stackTraceElementArrC : stackTraceElementArr;
    }
}
