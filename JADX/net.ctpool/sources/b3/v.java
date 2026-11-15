package b3;

import c3.InterfaceC0717d;
import d3.b;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f9643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0717d f9644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x f9645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d3.b f9646d;

    v(Executor executor, InterfaceC0717d interfaceC0717d, x xVar, d3.b bVar) {
        this.f9643a = executor;
        this.f9644b = interfaceC0717d;
        this.f9645c = xVar;
        this.f9646d = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object d() {
        Iterator it = this.f9644b.V().iterator();
        while (it.hasNext()) {
            this.f9645c.b((U2.p) it.next(), 1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.f9646d.b(new b.a() { // from class: b3.u
            @Override // d3.b.a
            public final Object f() {
                return this.f9642a.d();
            }
        });
    }

    public void c() {
        this.f9643a.execute(new Runnable() { // from class: b3.t
            @Override // java.lang.Runnable
            public final void run() {
                this.f9641m.e();
            }
        });
    }
}
