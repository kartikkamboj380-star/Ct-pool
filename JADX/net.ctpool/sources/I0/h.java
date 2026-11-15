package I0;

/* JADX INFO: loaded from: classes.dex */
public class h implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static h f1510a;

    private h() {
    }

    public static synchronized h i() {
        try {
            if (f1510a == null) {
                f1510a = new h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f1510a;
    }

    @Override // I0.c
    public void d() {
    }

    @Override // I0.c
    public void a(b bVar) {
    }

    @Override // I0.c
    public void b(b bVar) {
    }

    @Override // I0.c
    public void c(b bVar) {
    }

    @Override // I0.c
    public void e(b bVar) {
    }

    @Override // I0.c
    public void f(b bVar) {
    }

    @Override // I0.c
    public void g(b bVar) {
    }

    @Override // I0.c
    public void h(b bVar) {
    }
}
