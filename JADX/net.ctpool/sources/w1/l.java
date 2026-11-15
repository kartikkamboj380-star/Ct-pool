package w1;

import w1.n;
import w1.x;

/* JADX INFO: loaded from: classes.dex */
public class l implements InterfaceC2180a {

    class a implements D {
        a() {
        }

        @Override // w1.D
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int a(D1.d dVar) {
            return dVar.T0();
        }
    }

    @Override // w1.InterfaceC2180a
    public n a(O0.o oVar, R0.d dVar, x.a aVar, boolean z6, boolean z7, n.b bVar) {
        w wVar = new w(new a(), aVar, oVar, bVar, z6, z7);
        dVar.a(wVar);
        return wVar;
    }
}
