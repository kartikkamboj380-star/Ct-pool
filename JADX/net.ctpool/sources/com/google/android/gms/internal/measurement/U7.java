package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class U7 extends AbstractC1152n {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final C1068d5 f14386o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Map f14387p;

    public U7(C1068d5 c1068d5) {
        super("require");
        this.f14387p = new HashMap();
        this.f14386o = c1068d5;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1152n
    public final InterfaceC1196s a(C1093g3 c1093g3, List list) {
        D2.g("require", 1, list);
        String strC = c1093g3.b((InterfaceC1196s) list.get(0)).c();
        if (this.f14387p.containsKey(strC)) {
            return (InterfaceC1196s) this.f14387p.get(strC);
        }
        InterfaceC1196s interfaceC1196sA = this.f14386o.a(strC);
        if (interfaceC1196sA instanceof AbstractC1152n) {
            this.f14387p.put(strC, (AbstractC1152n) interfaceC1196sA);
        }
        return interfaceC1196sA;
    }
}
