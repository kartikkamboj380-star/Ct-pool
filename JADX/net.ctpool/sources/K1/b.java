package K1;

import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f1841a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f1842b = new C0034b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static c f1843c;

    public interface a {
    }

    /* JADX INFO: renamed from: K1.b$b, reason: collision with other inner class name */
    private static final class C0034b implements a {
    }

    public interface c {
        void a(String str);

        void b();

        boolean isTracing();
    }

    private b() {
    }

    public static final void a(String str) {
        k.f(str, "name");
        f1841a.c().a(str);
    }

    public static final void b() {
        f1841a.c().b();
    }

    private final c c() {
        K1.a aVar;
        c cVar = f1843c;
        if (cVar != null) {
            return cVar;
        }
        synchronized (b.class) {
            aVar = new K1.a();
            f1843c = aVar;
        }
        return aVar;
    }

    public static final boolean d() {
        return f1841a.c().isTracing();
    }
}
