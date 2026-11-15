package G5;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f1273a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ThreadLocal[] f1274b;

    static {
        ThreadLocal[] threadLocalArr = new ThreadLocal[4];
        for (int i7 = 0; i7 < 4; i7++) {
            threadLocalArr[i7] = new ThreadLocal();
        }
        f1274b = threadLocalArr;
    }

    public static final boolean a() {
        return f1273a;
    }
}
