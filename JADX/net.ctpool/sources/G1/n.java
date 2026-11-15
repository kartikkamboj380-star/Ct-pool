package G1;

import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f1215a = new n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final SparseIntArray f1216b = new SparseIntArray(0);

    private n() {
    }

    public static final G a() {
        return new G(0, f1215a.b(), f1216b);
    }

    private final int b() {
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        return iMin > 16777216 ? (iMin / 4) * 3 : iMin / 2;
    }
}
