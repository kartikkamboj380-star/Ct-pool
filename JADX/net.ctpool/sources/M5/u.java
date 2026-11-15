package M5;

import H5.B0;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;

/* JADX INFO: loaded from: classes2.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f2119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final B0 f2120b;

    static {
        u uVar = new u();
        f2119a = uVar;
        G.f("kotlinx.coroutines.fast.service.loader", true);
        f2120b = uVar.a();
    }

    private u() {
    }

    private final B0 a() {
        Object next;
        B0 b0E;
        try {
            List listI = E5.e.i(E5.e.a(ServiceLoader.load(t.class, t.class.getClassLoader()).iterator()));
            Iterator it = listI.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iC = ((t) next).c();
                    do {
                        Object next2 = it.next();
                        int iC2 = ((t) next2).c();
                        if (iC < iC2) {
                            next = next2;
                            iC = iC2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            t tVar = (t) next;
            if (tVar != null && (b0E = v.e(tVar, listI)) != null) {
                return b0E;
            }
            v.b(null, null, 3, null);
            return null;
        } catch (Throwable th) {
            v.b(th, null, 2, null);
            return null;
        }
    }
}
