package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class G4 extends AbstractC1152n {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final C1062d f14201o;

    public G4(C1062d c1062d) {
        super("internal.eventLogger");
        this.f14201o = c1062d;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1152n
    public final InterfaceC1196s a(C1093g3 c1093g3, List list) {
        D2.g(this.f14745m, 3, list);
        String strC = c1093g3.b((InterfaceC1196s) list.get(0)).c();
        long jA = (long) D2.a(c1093g3.b((InterfaceC1196s) list.get(1)).b().doubleValue());
        InterfaceC1196s interfaceC1196sB = c1093g3.b((InterfaceC1196s) list.get(2));
        this.f14201o.c(strC, jA, interfaceC1196sB instanceof r ? D2.e((r) interfaceC1196sB) : new HashMap());
        return InterfaceC1196s.f14815d;
    }
}
