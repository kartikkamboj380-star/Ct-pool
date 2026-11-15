package e4;

import D4.a;
import androidx.appcompat.app.y;
import j4.n;

/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D4.a f19213a;

    public l(D4.a aVar) {
        this.f19213a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(C1627e c1627e, D4.b bVar) {
        y.a(bVar.get());
        throw null;
    }

    public void c(n nVar) {
        if (nVar == null) {
            C1629g.f().k("Didn't successfully register with UserMetadata for rollouts listener");
        } else {
            final C1627e c1627e = new C1627e(nVar);
            this.f19213a.a(new a.InterfaceC0014a() { // from class: e4.k
                @Override // D4.a.InterfaceC0014a
                public final void a(D4.b bVar) {
                    l.b(c1627e, bVar);
                }
            });
        }
    }
}
