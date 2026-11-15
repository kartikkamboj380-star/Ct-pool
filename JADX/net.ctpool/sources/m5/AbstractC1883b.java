package m5;

import m5.InterfaceC1888g;
import v5.l;
import w5.k;

/* JADX INFO: renamed from: m5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1883b implements InterfaceC1888g.c {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final l f21259m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InterfaceC1888g.c f21260n;

    public AbstractC1883b(InterfaceC1888g.c cVar, l lVar) {
        k.f(cVar, "baseKey");
        k.f(lVar, "safeCast");
        this.f21259m = lVar;
        this.f21260n = cVar instanceof AbstractC1883b ? ((AbstractC1883b) cVar).f21260n : cVar;
    }

    public final boolean a(InterfaceC1888g.c cVar) {
        k.f(cVar, "key");
        return cVar == this || this.f21260n == cVar;
    }

    public final InterfaceC1888g.b b(InterfaceC1888g.b bVar) {
        k.f(bVar, "element");
        return (InterfaceC1888g.b) this.f21259m.i(bVar);
    }
}
