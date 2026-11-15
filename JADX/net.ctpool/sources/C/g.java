package C;

import H5.I;
import j5.AbstractC1809n;
import java.util.List;
import v5.InterfaceC2171a;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f789a = new g();

    private g() {
    }

    public final f a(k kVar, D.b bVar, List list, I i7, InterfaceC2171a interfaceC2171a) {
        w5.k.f(kVar, "serializer");
        w5.k.f(list, "migrations");
        w5.k.f(i7, "scope");
        w5.k.f(interfaceC2171a, "produceFile");
        b aVar = bVar;
        if (bVar == null) {
            aVar = new D.a();
        }
        return new m(interfaceC2171a, kVar, AbstractC1809n.d(e.f772a.b(list)), aVar, i7);
    }
}
