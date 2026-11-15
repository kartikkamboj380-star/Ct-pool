package L4;

import android.content.Context;
import b4.C0688c;
import b4.C0702q;
import b4.InterfaceC0689d;
import b4.InterfaceC0692g;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    public interface a {
        String a(Object obj);
    }

    public static C0688c b(String str, String str2) {
        return C0688c.l(f.a(str, str2), f.class);
    }

    public static C0688c c(final String str, final a aVar) {
        return C0688c.m(f.class).b(C0702q.l(Context.class)).f(new InterfaceC0692g() { // from class: L4.g
            @Override // b4.InterfaceC0692g
            public final Object a(InterfaceC0689d interfaceC0689d) {
                return h.d(str, aVar, interfaceC0689d);
            }
        }).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f d(String str, a aVar, InterfaceC0689d interfaceC0689d) {
        return f.a(str, aVar.a((Context) interfaceC0689d.a(Context.class)));
    }
}
