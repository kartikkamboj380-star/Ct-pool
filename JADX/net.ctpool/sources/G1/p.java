package G1;

import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f1218a = new p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f1219b = Runtime.getRuntime().availableProcessors();

    private p() {
    }

    public static final SparseIntArray a(int i7, int i8, int i9) {
        SparseIntArray sparseIntArray = new SparseIntArray();
        while (i7 <= i8) {
            sparseIntArray.put(i7, i9);
            i7 *= 2;
        }
        return sparseIntArray;
    }

    public static final G b() {
        int i7 = f1219b;
        return new G(4194304, i7 * 4194304, a(131072, 4194304, i7), 131072, 4194304, i7);
    }
}
