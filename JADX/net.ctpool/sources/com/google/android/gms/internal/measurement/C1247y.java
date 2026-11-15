package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1247y extends A {
    public C1247y() {
        this.f14117a.add(Z.BITWISE_AND);
        this.f14117a.add(Z.BITWISE_LEFT_SHIFT);
        this.f14117a.add(Z.BITWISE_NOT);
        this.f14117a.add(Z.BITWISE_OR);
        this.f14117a.add(Z.BITWISE_RIGHT_SHIFT);
        this.f14117a.add(Z.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.f14117a.add(Z.BITWISE_XOR);
    }

    @Override // com.google.android.gms.internal.measurement.A
    public final InterfaceC1196s b(String str, C1093g3 c1093g3, List list) {
        switch (B.f14135a[D2.c(str).ordinal()]) {
            case 1:
                D2.f(Z.BITWISE_AND, 2, list);
                return new C1125k(Double.valueOf(D2.i(c1093g3.b((InterfaceC1196s) list.get(0)).b().doubleValue()) & D2.i(c1093g3.b((InterfaceC1196s) list.get(1)).b().doubleValue())));
            case 2:
                D2.f(Z.BITWISE_LEFT_SHIFT, 2, list);
                return new C1125k(Double.valueOf(D2.i(c1093g3.b((InterfaceC1196s) list.get(0)).b().doubleValue()) << ((int) (D2.m(c1093g3.b((InterfaceC1196s) list.get(1)).b().doubleValue()) & 31))));
            case 3:
                D2.f(Z.BITWISE_NOT, 1, list);
                return new C1125k(Double.valueOf(~D2.i(c1093g3.b((InterfaceC1196s) list.get(0)).b().doubleValue())));
            case 4:
                D2.f(Z.BITWISE_OR, 2, list);
                return new C1125k(Double.valueOf(D2.i(c1093g3.b((InterfaceC1196s) list.get(0)).b().doubleValue()) | D2.i(c1093g3.b((InterfaceC1196s) list.get(1)).b().doubleValue())));
            case 5:
                D2.f(Z.BITWISE_RIGHT_SHIFT, 2, list);
                return new C1125k(Double.valueOf(D2.i(c1093g3.b((InterfaceC1196s) list.get(0)).b().doubleValue()) >> ((int) (D2.m(c1093g3.b((InterfaceC1196s) list.get(1)).b().doubleValue()) & 31))));
            case 6:
                D2.f(Z.BITWISE_UNSIGNED_RIGHT_SHIFT, 2, list);
                return new C1125k(Double.valueOf(D2.m(c1093g3.b((InterfaceC1196s) list.get(0)).b().doubleValue()) >>> ((int) (D2.m(c1093g3.b((InterfaceC1196s) list.get(1)).b().doubleValue()) & 31))));
            case 7:
                D2.f(Z.BITWISE_XOR, 2, list);
                return new C1125k(Double.valueOf(D2.i(c1093g3.b((InterfaceC1196s) list.get(0)).b().doubleValue()) ^ D2.i(c1093g3.b((InterfaceC1196s) list.get(1)).b().doubleValue())));
            default:
                return super.a(str);
        }
    }
}
