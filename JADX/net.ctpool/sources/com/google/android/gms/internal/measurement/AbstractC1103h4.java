package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.h4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1103h4 {
    public static InterfaceC1196s a(K2 k22) {
        if (k22 == null) {
            return InterfaceC1196s.f14815d;
        }
        int i7 = H3.f14213a[k22.F().ordinal()];
        if (i7 == 1) {
            return k22.N() ? new C1214u(k22.I()) : InterfaceC1196s.f14822k;
        }
        if (i7 == 2) {
            return k22.M() ? new C1125k(Double.valueOf(k22.E())) : new C1125k(null);
        }
        if (i7 == 3) {
            return k22.L() ? new C1098h(Boolean.valueOf(k22.K())) : new C1098h(null);
        }
        if (i7 != 4) {
            if (i7 == 5) {
                throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
            }
            throw new IllegalStateException("Invalid entity: " + String.valueOf(k22));
        }
        List listJ = k22.J();
        ArrayList arrayList = new ArrayList();
        Iterator it = listJ.iterator();
        while (it.hasNext()) {
            arrayList.add(a((K2) it.next()));
        }
        return new C1223v(k22.H(), arrayList);
    }

    public static InterfaceC1196s b(Object obj) {
        if (obj == null) {
            return InterfaceC1196s.f14816e;
        }
        if (obj instanceof String) {
            return new C1214u((String) obj);
        }
        if (obj instanceof Double) {
            return new C1125k((Double) obj);
        }
        if (obj instanceof Long) {
            return new C1125k(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new C1125k(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new C1098h((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            C1089g c1089g = new C1089g();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                c1089g.p(b(it.next()));
            }
            return c1089g;
        }
        r rVar = new r();
        Map map = (Map) obj;
        for (Object string : map.keySet()) {
            InterfaceC1196s interfaceC1196sB = b(map.get(string));
            if (string != null) {
                if (!(string instanceof String)) {
                    string = string.toString();
                }
                rVar.k((String) string, interfaceC1196sB);
            }
        }
        return rVar;
    }
}
