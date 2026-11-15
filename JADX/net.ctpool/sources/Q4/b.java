package Q4;

import b4.C0688c;
import b4.InterfaceC0689d;
import b4.InterfaceC0692g;
import b4.InterfaceC0694i;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class b implements InterfaceC0694i {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object c(String str, C0688c c0688c, InterfaceC0689d interfaceC0689d) {
        try {
            c.b(str);
            return c0688c.h().a(interfaceC0689d);
        } finally {
            c.a();
        }
    }

    @Override // b4.InterfaceC0694i
    public List a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final C0688c c0688cT : componentRegistrar.getComponents()) {
            final String strI = c0688cT.i();
            if (strI != null) {
                c0688cT = c0688cT.t(new InterfaceC0692g() { // from class: Q4.a
                    @Override // b4.InterfaceC0692g
                    public final Object a(InterfaceC0689d interfaceC0689d) {
                        return b.c(strI, c0688cT, interfaceC0689d);
                    }
                });
            }
            arrayList.add(c0688cT);
        }
        return arrayList;
    }
}
