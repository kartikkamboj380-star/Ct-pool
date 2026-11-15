package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1044b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TreeMap f14514a = new TreeMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TreeMap f14515b = new TreeMap();

    private static int a(C1093g3 c1093g3, C1205t c1205t, InterfaceC1196s interfaceC1196s) {
        InterfaceC1196s interfaceC1196sA = c1205t.a(c1093g3, Collections.singletonList(interfaceC1196s));
        if (interfaceC1196sA instanceof C1125k) {
            return D2.i(interfaceC1196sA.b().doubleValue());
        }
        return -1;
    }

    public final void b(C1093g3 c1093g3, C1062d c1062d) {
        C1051b6 c1051b6 = new C1051b6(c1062d);
        for (Integer num : this.f14514a.keySet()) {
            C1071e c1071e = (C1071e) c1062d.d().clone();
            int iA = a(c1093g3, (C1205t) this.f14514a.get(num), c1051b6);
            if (iA == 2 || iA == -1) {
                c1062d.e(c1071e);
            }
        }
        Iterator it = this.f14515b.keySet().iterator();
        while (it.hasNext()) {
            a(c1093g3, (C1205t) this.f14515b.get((Integer) it.next()), c1051b6);
        }
    }

    public final void c(String str, int i7, C1205t c1205t, String str2) {
        TreeMap treeMap;
        if ("create".equals(str2)) {
            treeMap = this.f14515b;
        } else {
            if (!"edit".equals(str2)) {
                throw new IllegalStateException("Unknown callback type: " + str2);
            }
            treeMap = this.f14514a;
        }
        if (treeMap.containsKey(Integer.valueOf(i7))) {
            i7 = ((Integer) treeMap.lastKey()).intValue() + 1;
        }
        treeMap.put(Integer.valueOf(i7), c1205t);
    }
}
