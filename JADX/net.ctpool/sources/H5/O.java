package H5;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f1401a = M5.G.f("kotlinx.coroutines.main.delay", false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final S f1402b = b();

    public static final S a() {
        return f1402b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final S b() {
        if (!f1401a) {
            return N.f1398u;
        }
        B0 b0C = W.c();
        return (M5.v.c(b0C) || !(b0C instanceof S)) ? N.f1398u : (S) b0C;
    }
}
