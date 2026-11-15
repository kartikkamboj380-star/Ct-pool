package V1;

import T5.InterfaceC0459e;
import T5.z;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static void a(z zVar, Object obj) {
        for (InterfaceC0459e interfaceC0459e : zVar.q().i()) {
            if (obj.equals(interfaceC0459e.o().j())) {
                interfaceC0459e.cancel();
                return;
            }
        }
        for (InterfaceC0459e interfaceC0459e2 : zVar.q().j()) {
            if (obj.equals(interfaceC0459e2.o().j())) {
                interfaceC0459e2.cancel();
                return;
            }
        }
    }
}
