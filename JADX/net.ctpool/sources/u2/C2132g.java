package u2;

/* JADX INFO: renamed from: u2.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2132g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2131f f22534a = new C2131f();

    public C2131f a() {
        return this.f22534a;
    }

    public void b() {
        if (!e()) {
            throw new IllegalStateException("Cannot cancel a completed task.");
        }
    }

    public void c(Exception exc) {
        if (!f(exc)) {
            throw new IllegalStateException("Cannot set the error on a completed task.");
        }
    }

    public void d(Object obj) {
        if (!g(obj)) {
            throw new IllegalStateException("Cannot set the result of a completed task.");
        }
    }

    public boolean e() {
        return this.f22534a.x();
    }

    public boolean f(Exception exc) {
        return this.f22534a.y(exc);
    }

    public boolean g(Object obj) {
        return this.f22534a.z(obj);
    }
}
