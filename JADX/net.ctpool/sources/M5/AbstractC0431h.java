package M5;

import i5.AbstractC1744a;
import java.util.Iterator;
import m5.InterfaceC1888g;

/* JADX INFO: renamed from: M5.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0431h {
    public static final void a(InterfaceC1888g interfaceC1888g, Throwable th) {
        Iterator it = AbstractC0430g.a().iterator();
        while (it.hasNext()) {
            try {
                ((H5.G) it.next()).B(interfaceC1888g, th);
            } catch (Throwable th2) {
                AbstractC0430g.b(H5.H.b(th, th2));
            }
        }
        try {
            AbstractC1744a.a(th, new C0432i(interfaceC1888g));
        } catch (Throwable unused) {
        }
        AbstractC0430g.b(th);
    }
}
