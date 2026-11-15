package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class J extends A {
    protected J() {
        this.f14117a.add(Z.AND);
        this.f14117a.add(Z.NOT);
        this.f14117a.add(Z.OR);
    }

    @Override // com.google.android.gms.internal.measurement.A
    public final InterfaceC1196s b(String str, C1093g3 c1093g3, List list) {
        int i7 = M.f14266a[D2.c(str).ordinal()];
        if (i7 == 1) {
            D2.f(Z.AND, 2, list);
            InterfaceC1196s interfaceC1196sB = c1093g3.b((InterfaceC1196s) list.get(0));
            if (!interfaceC1196sB.zzd().booleanValue()) {
                return interfaceC1196sB;
            }
        } else {
            if (i7 == 2) {
                D2.f(Z.NOT, 1, list);
                return new C1098h(Boolean.valueOf(!c1093g3.b((InterfaceC1196s) list.get(0)).zzd().booleanValue()));
            }
            if (i7 != 3) {
                return super.a(str);
            }
            D2.f(Z.OR, 2, list);
            InterfaceC1196s interfaceC1196sB2 = c1093g3.b((InterfaceC1196s) list.get(0));
            if (interfaceC1196sB2.zzd().booleanValue()) {
                return interfaceC1196sB2;
            }
        }
        return c1093g3.b((InterfaceC1196s) list.get(1));
    }
}
