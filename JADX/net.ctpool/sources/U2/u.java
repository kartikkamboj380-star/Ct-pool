package U2;

import U2.i;
import a3.InterfaceC0509e;
import android.content.Context;
import e3.InterfaceC1622a;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class u implements t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile v f3829e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1622a f3830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1622a f3831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC0509e f3832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b3.r f3833d;

    u(InterfaceC1622a interfaceC1622a, InterfaceC1622a interfaceC1622a2, InterfaceC0509e interfaceC0509e, b3.r rVar, b3.v vVar) {
        this.f3830a = interfaceC1622a;
        this.f3831b = interfaceC1622a2;
        this.f3832c = interfaceC0509e;
        this.f3833d = rVar;
        vVar.c();
    }

    private i b(o oVar) {
        i.a aVarG = i.a().i(this.f3830a.a()).o(this.f3831b.a()).n(oVar.g()).h(new h(oVar.b(), oVar.d())).g(oVar.c().a());
        if (oVar.c().e() != null && oVar.c().e().a() != null) {
            aVarG.l(oVar.c().e().a());
        }
        oVar.c().b();
        return aVarG.d();
    }

    public static u c() {
        v vVar = f3829e;
        if (vVar != null) {
            return vVar.b();
        }
        throw new IllegalStateException("Not initialized!");
    }

    private static Set d(f fVar) {
        return fVar instanceof g ? Collections.unmodifiableSet(((g) fVar).a()) : Collections.singleton(S2.c.b("proto"));
    }

    public static void f(Context context) {
        if (f3829e == null) {
            synchronized (u.class) {
                try {
                    if (f3829e == null) {
                        f3829e = e.a().b(context).a();
                    }
                } finally {
                }
            }
        }
    }

    @Override // U2.t
    public void a(o oVar, S2.k kVar) {
        this.f3832c.a(oVar.f().f(oVar.c().d()), b(oVar), kVar);
    }

    public b3.r e() {
        return this.f3833d;
    }

    public S2.j g(f fVar) {
        return new q(d(fVar), p.a().b(fVar.getName()).c(fVar.getExtras()).a(), this);
    }
}
