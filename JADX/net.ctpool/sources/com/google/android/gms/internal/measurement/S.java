package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.ConnectionResult;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class S extends A {
    protected S() {
        this.f14117a.add(Z.ADD);
        this.f14117a.add(Z.DIVIDE);
        this.f14117a.add(Z.MODULUS);
        this.f14117a.add(Z.MULTIPLY);
        this.f14117a.add(Z.NEGATE);
        this.f14117a.add(Z.POST_DECREMENT);
        this.f14117a.add(Z.POST_INCREMENT);
        this.f14117a.add(Z.PRE_DECREMENT);
        this.f14117a.add(Z.PRE_INCREMENT);
        this.f14117a.add(Z.SUBTRACT);
    }

    @Override // com.google.android.gms.internal.measurement.A
    public final InterfaceC1196s b(String str, C1093g3 c1093g3, List list) {
        switch (V.f14388a[D2.c(str).ordinal()]) {
            case 1:
                D2.f(Z.ADD, 2, list);
                InterfaceC1196s interfaceC1196sB = c1093g3.b((InterfaceC1196s) list.get(0));
                InterfaceC1196s interfaceC1196sB2 = c1093g3.b((InterfaceC1196s) list.get(1));
                if (!(interfaceC1196sB instanceof InterfaceC1143m) && !(interfaceC1196sB instanceof C1214u) && !(interfaceC1196sB2 instanceof InterfaceC1143m) && !(interfaceC1196sB2 instanceof C1214u)) {
                    return new C1125k(Double.valueOf(interfaceC1196sB.b().doubleValue() + interfaceC1196sB2.b().doubleValue()));
                }
                return new C1214u(interfaceC1196sB.c() + interfaceC1196sB2.c());
            case 2:
                D2.f(Z.DIVIDE, 2, list);
                return new C1125k(Double.valueOf(c1093g3.b((InterfaceC1196s) list.get(0)).b().doubleValue() / c1093g3.b((InterfaceC1196s) list.get(1)).b().doubleValue()));
            case 3:
                D2.f(Z.MODULUS, 2, list);
                return new C1125k(Double.valueOf(c1093g3.b((InterfaceC1196s) list.get(0)).b().doubleValue() % c1093g3.b((InterfaceC1196s) list.get(1)).b().doubleValue()));
            case 4:
                D2.f(Z.MULTIPLY, 2, list);
                return new C1125k(Double.valueOf(c1093g3.b((InterfaceC1196s) list.get(0)).b().doubleValue() * c1093g3.b((InterfaceC1196s) list.get(1)).b().doubleValue()));
            case 5:
                D2.f(Z.NEGATE, 1, list);
                return new C1125k(Double.valueOf(c1093g3.b((InterfaceC1196s) list.get(0)).b().doubleValue() * (-1.0d)));
            case 6:
            case 7:
                D2.g(str, 2, list);
                InterfaceC1196s interfaceC1196sB3 = c1093g3.b((InterfaceC1196s) list.get(0));
                c1093g3.b((InterfaceC1196s) list.get(1));
                return interfaceC1196sB3;
            case 8:
            case ConnectionResult.SERVICE_INVALID /* 9 */:
                D2.g(str, 1, list);
                return c1093g3.b((InterfaceC1196s) list.get(0));
            case 10:
                D2.f(Z.SUBTRACT, 2, list);
                return new C1125k(Double.valueOf(c1093g3.b((InterfaceC1196s) list.get(0)).b().doubleValue() + new C1125k(Double.valueOf(c1093g3.b((InterfaceC1196s) list.get(1)).b().doubleValue() * (-1.0d))).b().doubleValue()));
            default:
                return super.a(str);
        }
    }
}
