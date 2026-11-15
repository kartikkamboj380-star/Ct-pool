package P;

import P.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class d extends a {
    /* JADX WARN: Multi-variable type inference failed */
    public d() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // P.a
    public Object a(a.b bVar) {
        k.f(bVar, "key");
        return b().get(bVar);
    }

    public final void c(a.b bVar, Object obj) {
        k.f(bVar, "key");
        b().put(bVar, obj);
    }

    public d(a aVar) {
        k.f(aVar, "initialExtras");
        b().putAll(aVar.b());
    }

    public /* synthetic */ d(a aVar, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? a.C0052a.f2550b : aVar);
    }
}
