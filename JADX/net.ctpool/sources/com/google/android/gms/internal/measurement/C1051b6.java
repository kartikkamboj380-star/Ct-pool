package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.b6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1051b6 extends r {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final C1062d f14525n;

    public C1051b6(C1062d c1062d) {
        this.f14525n = c1062d;
    }

    @Override // com.google.android.gms.internal.measurement.r, com.google.android.gms.internal.measurement.InterfaceC1196s
    public final InterfaceC1196s i(String str, C1093g3 c1093g3, List list) {
        str.hashCode();
        switch (str) {
            case "getEventName":
                D2.g("getEventName", 0, list);
                return new C1214u(this.f14525n.d().e());
            case "getTimestamp":
                D2.g("getTimestamp", 0, list);
                return new C1125k(Double.valueOf(this.f14525n.d().a()));
            case "getParamValue":
                D2.g("getParamValue", 1, list);
                return AbstractC1103h4.b(this.f14525n.d().b(c1093g3.b((InterfaceC1196s) list.get(0)).c()));
            case "getParams":
                D2.g("getParams", 0, list);
                Map mapG = this.f14525n.d().g();
                r rVar = new r();
                for (String str2 : mapG.keySet()) {
                    rVar.k(str2, AbstractC1103h4.b(mapG.get(str2)));
                }
                return rVar;
            case "setParamValue":
                D2.g("setParamValue", 2, list);
                String strC = c1093g3.b((InterfaceC1196s) list.get(0)).c();
                InterfaceC1196s interfaceC1196sB = c1093g3.b((InterfaceC1196s) list.get(1));
                this.f14525n.d().d(strC, D2.d(interfaceC1196sB));
                return interfaceC1196sB;
            case "setEventName":
                D2.g("setEventName", 1, list);
                InterfaceC1196s interfaceC1196sB2 = c1093g3.b((InterfaceC1196s) list.get(0));
                if (InterfaceC1196s.f14815d.equals(interfaceC1196sB2) || InterfaceC1196s.f14816e.equals(interfaceC1196sB2)) {
                    throw new IllegalArgumentException("Illegal event name");
                }
                this.f14525n.d().f(interfaceC1196sB2.c());
                return new C1214u(interfaceC1196sB2.c());
            default:
                return super.i(str, c1093g3, list);
        }
    }
}
