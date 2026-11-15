package K5;

import i5.u;
import m5.InterfaceC1885d;
import n5.AbstractC1930b;
import v5.p;

/* JADX INFO: loaded from: classes2.dex */
final class l extends a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final p f1917m;

    public l(p pVar) {
        this.f1917m = pVar;
    }

    @Override // K5.a
    public Object b(c cVar, InterfaceC1885d interfaceC1885d) {
        Object objM = this.f1917m.m(cVar, interfaceC1885d);
        return objM == AbstractC1930b.c() ? objM : u.f19985a;
    }
}
