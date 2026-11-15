package e1;

import p1.i;

/* JADX INFO: loaded from: classes.dex */
public class b extends F1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V0.b f19162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f19163b;

    public b(V0.b bVar, i iVar) {
        this.f19162a = bVar;
        this.f19163b = iVar;
    }

    @Override // F1.e
    public void d(J1.b bVar, String str, Throwable th, boolean z6) {
        this.f19163b.p(this.f19162a.now());
        this.f19163b.o(bVar);
        this.f19163b.v(str);
        this.f19163b.u(z6);
    }

    @Override // F1.e
    public void e(J1.b bVar, String str, boolean z6) {
        this.f19163b.p(this.f19162a.now());
        this.f19163b.o(bVar);
        this.f19163b.v(str);
        this.f19163b.u(z6);
    }

    @Override // F1.e
    public void f(J1.b bVar, Object obj, String str, boolean z6) {
        this.f19163b.q(this.f19162a.now());
        this.f19163b.o(bVar);
        this.f19163b.d(obj);
        this.f19163b.v(str);
        this.f19163b.u(z6);
    }

    @Override // F1.e
    public void k(String str) {
        this.f19163b.p(this.f19162a.now());
        this.f19163b.v(str);
    }
}
