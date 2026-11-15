package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map f14172a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private U f14173b = new U();

    public E() {
        b(new C1247y());
        b(new D());
        b(new F());
        b(new J());
        b(new L());
        b(new S());
        b(new X());
    }

    private final void b(A a7) {
        Iterator it = a7.f14117a.iterator();
        while (it.hasNext()) {
            this.f14172a.put(((Z) it.next()).toString(), a7);
        }
    }

    public final InterfaceC1196s a(C1093g3 c1093g3, InterfaceC1196s interfaceC1196s) {
        D2.b(c1093g3);
        if (!(interfaceC1196s instanceof C1223v)) {
            return interfaceC1196s;
        }
        C1223v c1223v = (C1223v) interfaceC1196s;
        ArrayList arrayListD = c1223v.d();
        String strA = c1223v.a();
        return (this.f14172a.containsKey(strA) ? (A) this.f14172a.get(strA) : this.f14173b).b(strA, c1093g3, arrayListD);
    }
}
