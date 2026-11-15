package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class R7 extends AbstractC1152n {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private C1044b f14332o;

    public R7(C1044b c1044b) {
        super("internal.registerCallback");
        this.f14332o = c1044b;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1152n
    public final InterfaceC1196s a(C1093g3 c1093g3, List list) {
        D2.g(this.f14745m, 3, list);
        String strC = c1093g3.b((InterfaceC1196s) list.get(0)).c();
        InterfaceC1196s interfaceC1196sB = c1093g3.b((InterfaceC1196s) list.get(1));
        if (!(interfaceC1196sB instanceof C1205t)) {
            throw new IllegalArgumentException("Invalid callback type");
        }
        InterfaceC1196s interfaceC1196sB2 = c1093g3.b((InterfaceC1196s) list.get(2));
        if (!(interfaceC1196sB2 instanceof r)) {
            throw new IllegalArgumentException("Invalid callback params");
        }
        r rVar = (r) interfaceC1196sB2;
        if (!rVar.h("type")) {
            throw new IllegalArgumentException("Undefined rule type");
        }
        this.f14332o.c(strC, rVar.h("priority") ? D2.i(rVar.f("priority").b().doubleValue()) : 1000, (C1205t) interfaceC1196sB, rVar.f("type").c());
        return InterfaceC1196s.f14815d;
    }
}
