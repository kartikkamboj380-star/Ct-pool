package G1;

/* JADX INFO: loaded from: classes.dex */
public class A implements H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static A f1149a;

    private A() {
    }

    public static synchronized A h() {
        try {
            if (f1149a == null) {
                f1149a = new A();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f1149a;
    }

    @Override // G1.H
    public void d() {
    }

    @Override // G1.H
    public void f() {
    }

    @Override // G1.H
    public void a(int i7) {
    }

    @Override // G1.H
    public void b(int i7) {
    }

    @Override // G1.H
    public void c(com.facebook.imagepipeline.memory.a aVar) {
    }

    @Override // G1.H
    public void e(int i7) {
    }

    @Override // G1.H
    public void g(int i7) {
    }
}
