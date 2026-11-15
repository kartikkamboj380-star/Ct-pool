package L4;

import b4.C0688c;
import b4.C0702q;
import b4.InterfaceC0689d;
import b4.InterfaceC0692g;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class c implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f1987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f1988b;

    c(Set set, d dVar) {
        this.f1987a = e(set);
        this.f1988b = dVar;
    }

    public static C0688c c() {
        return C0688c.e(i.class).b(C0702q.o(f.class)).f(new InterfaceC0692g() { // from class: L4.b
            @Override // b4.InterfaceC0692g
            public final Object a(InterfaceC0689d interfaceC0689d) {
                return c.d(interfaceC0689d);
            }
        }).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i d(InterfaceC0689d interfaceC0689d) {
        return new c(interfaceC0689d.g(f.class), d.a());
    }

    private static String e(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            sb.append(fVar.b());
            sb.append('/');
            sb.append(fVar.c());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // L4.i
    public String a() {
        if (this.f1988b.b().isEmpty()) {
            return this.f1987a;
        }
        return this.f1987a + ' ' + e(this.f1988b.b());
    }
}
