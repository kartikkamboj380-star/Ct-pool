package G1;

/* JADX INFO: renamed from: G1.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0381h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0381h f1200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f1201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f1202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile C0380g f1203d;

    static {
        C0381h c0381h = new C0381h();
        f1200a = c0381h;
        f1201b = c0381h.b();
        f1202c = 384;
    }

    private C0381h() {
    }

    public static final C0380g a() {
        if (f1203d == null) {
            synchronized (C0381h.class) {
                try {
                    if (f1203d == null) {
                        f1203d = new C0380g(f1202c, f1201b);
                    }
                    i5.u uVar = i5.u.f19985a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        C0380g c0380g = f1203d;
        w5.k.c(c0380g);
        return c0380g;
    }

    private final int b() {
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        return ((long) iMin) > 16777216 ? (iMin / 4) * 3 : iMin / 2;
    }
}
