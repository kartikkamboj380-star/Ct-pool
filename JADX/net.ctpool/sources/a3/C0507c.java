package a3;

import S2.k;
import U2.p;
import U2.u;
import V2.m;
import b3.x;
import c3.InterfaceC0717d;
import d3.b;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* JADX INFO: renamed from: a3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0507c implements InterfaceC0509e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Logger f4771f = Logger.getLogger(u.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x f4772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f4773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final V2.e f4774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC0717d f4775d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d3.b f4776e;

    public C0507c(Executor executor, V2.e eVar, x xVar, InterfaceC0717d interfaceC0717d, d3.b bVar) {
        this.f4773b = executor;
        this.f4774c = eVar;
        this.f4772a = xVar;
        this.f4775d = interfaceC0717d;
        this.f4776e = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object d(p pVar, U2.i iVar) {
        this.f4775d.S(pVar, iVar);
        this.f4772a.b(pVar, 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(final p pVar, k kVar, U2.i iVar) {
        try {
            m mVarA = this.f4774c.a(pVar.b());
            if (mVarA == null) {
                String str = String.format("Transport backend '%s' is not registered", pVar.b());
                f4771f.warning(str);
                kVar.a(new IllegalArgumentException(str));
            } else {
                final U2.i iVarA = mVarA.a(iVar);
                this.f4776e.b(new b.a() { // from class: a3.b
                    @Override // d3.b.a
                    public final Object f() {
                        return this.f4768a.d(pVar, iVarA);
                    }
                });
                kVar.a(null);
            }
        } catch (Exception e7) {
            f4771f.warning("Error scheduling event " + e7.getMessage());
            kVar.a(e7);
        }
    }

    @Override // a3.InterfaceC0509e
    public void a(final p pVar, final U2.i iVar, final k kVar) {
        this.f4773b.execute(new Runnable() { // from class: a3.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f4764m.e(pVar, kVar, iVar);
            }
        });
    }
}
