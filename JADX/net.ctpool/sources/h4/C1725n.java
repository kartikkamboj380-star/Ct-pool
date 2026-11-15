package h4;

import O4.b;
import e4.C1629g;
import n4.C1928g;

/* JADX INFO: renamed from: h4.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1725n implements O4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final G f19760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1724m f19761b;

    public C1725n(G g7, C1928g c1928g) {
        this.f19760a = g7;
        this.f19761b = new C1724m(c1928g);
    }

    @Override // O4.b
    public void a(b.C0050b c0050b) {
        C1629g.f().b("App Quality Sessions session changed: " + c0050b);
        this.f19761b.h(c0050b.a());
    }

    @Override // O4.b
    public boolean b() {
        return this.f19760a.d();
    }

    @Override // O4.b
    public b.a c() {
        return b.a.CRASHLYTICS;
    }

    public String d(String str) {
        return this.f19761b.c(str);
    }

    public void e(String str) {
        this.f19761b.i(str);
    }
}
