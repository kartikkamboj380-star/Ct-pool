package V3;

/* JADX INFO: renamed from: V3.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0485m {
    static int a(int i7, double d7) {
        int iMax = Math.max(i7, 2);
        int iHighestOneBit = Integer.highestOneBit(iMax);
        if (iMax <= ((int) (d7 * ((double) iHighestOneBit)))) {
            return iHighestOneBit;
        }
        int i8 = iHighestOneBit << 1;
        if (i8 > 0) {
            return i8;
        }
        return 1073741824;
    }

    static int b(int i7) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i7) * (-862048943)), 15)) * 461845907);
    }

    static int c(Object obj) {
        return b(obj == null ? 0 : obj.hashCode());
    }
}
