package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1170p {
    public static InterfaceC1196s a(InterfaceC1143m interfaceC1143m, InterfaceC1196s interfaceC1196s, C1093g3 c1093g3, List list) {
        if (interfaceC1143m.h(interfaceC1196s.c())) {
            InterfaceC1196s interfaceC1196sF = interfaceC1143m.f(interfaceC1196s.c());
            if (interfaceC1196sF instanceof AbstractC1152n) {
                return ((AbstractC1152n) interfaceC1196sF).a(c1093g3, list);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", interfaceC1196s.c()));
        }
        if (!"hasOwnProperty".equals(interfaceC1196s.c())) {
            throw new IllegalArgumentException(String.format("Object has no function %s", interfaceC1196s.c()));
        }
        D2.g("hasOwnProperty", 1, list);
        return interfaceC1143m.h(c1093g3.b((InterfaceC1196s) list.get(0)).c()) ? InterfaceC1196s.f14820i : InterfaceC1196s.f14821j;
    }

    public static Iterator b(Map map) {
        return new C1161o(map.keySet().iterator());
    }
}
