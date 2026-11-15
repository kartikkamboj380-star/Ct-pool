package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class D extends A {
    public D() {
        this.f14117a.add(Z.EQUALS);
        this.f14117a.add(Z.GREATER_THAN);
        this.f14117a.add(Z.GREATER_THAN_EQUALS);
        this.f14117a.add(Z.IDENTITY_EQUALS);
        this.f14117a.add(Z.IDENTITY_NOT_EQUALS);
        this.f14117a.add(Z.LESS_THAN);
        this.f14117a.add(Z.LESS_THAN_EQUALS);
        this.f14117a.add(Z.NOT_EQUALS);
    }

    private static boolean c(InterfaceC1196s interfaceC1196s, InterfaceC1196s interfaceC1196s2) {
        InterfaceC1196s c1125k;
        InterfaceC1196s c1125k2;
        while (!interfaceC1196s.getClass().equals(interfaceC1196s2.getClass())) {
            if (((interfaceC1196s instanceof C1255z) || (interfaceC1196s instanceof C1179q)) && ((interfaceC1196s2 instanceof C1255z) || (interfaceC1196s2 instanceof C1179q))) {
                return true;
            }
            boolean z6 = interfaceC1196s instanceof C1125k;
            if (z6 && (interfaceC1196s2 instanceof C1214u)) {
                c1125k2 = new C1125k(interfaceC1196s2.b());
            } else {
                boolean z7 = interfaceC1196s instanceof C1214u;
                if (z7 && (interfaceC1196s2 instanceof C1125k)) {
                    c1125k = new C1125k(interfaceC1196s.b());
                } else if (interfaceC1196s instanceof C1098h) {
                    c1125k = new C1125k(interfaceC1196s.b());
                } else if (interfaceC1196s2 instanceof C1098h) {
                    c1125k2 = new C1125k(interfaceC1196s2.b());
                } else if ((z7 || z6) && (interfaceC1196s2 instanceof InterfaceC1143m)) {
                    c1125k2 = new C1214u(interfaceC1196s2.c());
                } else {
                    if (!(interfaceC1196s instanceof InterfaceC1143m) || (!(interfaceC1196s2 instanceof C1214u) && !(interfaceC1196s2 instanceof C1125k))) {
                        return false;
                    }
                    c1125k = new C1214u(interfaceC1196s.c());
                }
                interfaceC1196s = c1125k;
            }
            interfaceC1196s2 = c1125k2;
        }
        if ((interfaceC1196s instanceof C1255z) || (interfaceC1196s instanceof C1179q)) {
            return true;
        }
        return interfaceC1196s instanceof C1125k ? (Double.isNaN(interfaceC1196s.b().doubleValue()) || Double.isNaN(interfaceC1196s2.b().doubleValue()) || interfaceC1196s.b().doubleValue() != interfaceC1196s2.b().doubleValue()) ? false : true : interfaceC1196s instanceof C1214u ? interfaceC1196s.c().equals(interfaceC1196s2.c()) : interfaceC1196s instanceof C1098h ? interfaceC1196s.zzd().equals(interfaceC1196s2.zzd()) : interfaceC1196s == interfaceC1196s2;
    }

    private static boolean d(InterfaceC1196s interfaceC1196s, InterfaceC1196s interfaceC1196s2) {
        if (interfaceC1196s instanceof InterfaceC1143m) {
            interfaceC1196s = new C1214u(interfaceC1196s.c());
        }
        if (interfaceC1196s2 instanceof InterfaceC1143m) {
            interfaceC1196s2 = new C1214u(interfaceC1196s2.c());
        }
        if ((interfaceC1196s instanceof C1214u) && (interfaceC1196s2 instanceof C1214u)) {
            return interfaceC1196s.c().compareTo(interfaceC1196s2.c()) < 0;
        }
        double dDoubleValue = interfaceC1196s.b().doubleValue();
        double dDoubleValue2 = interfaceC1196s2.b().doubleValue();
        return (Double.isNaN(dDoubleValue) || Double.isNaN(dDoubleValue2) || (dDoubleValue == 0.0d && dDoubleValue2 == -0.0d) || ((dDoubleValue == -0.0d && dDoubleValue2 == 0.0d) || Double.compare(dDoubleValue, dDoubleValue2) >= 0)) ? false : true;
    }

    private static boolean e(InterfaceC1196s interfaceC1196s, InterfaceC1196s interfaceC1196s2) {
        if (interfaceC1196s instanceof InterfaceC1143m) {
            interfaceC1196s = new C1214u(interfaceC1196s.c());
        }
        if (interfaceC1196s2 instanceof InterfaceC1143m) {
            interfaceC1196s2 = new C1214u(interfaceC1196s2.c());
        }
        return (((interfaceC1196s instanceof C1214u) && (interfaceC1196s2 instanceof C1214u)) || !(Double.isNaN(interfaceC1196s.b().doubleValue()) || Double.isNaN(interfaceC1196s2.b().doubleValue()))) && !d(interfaceC1196s2, interfaceC1196s);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    @Override // com.google.android.gms.internal.measurement.A
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC1196s b(String str, C1093g3 c1093g3, List list) {
        boolean zC;
        boolean zH;
        D2.f(D2.c(str), 2, list);
        InterfaceC1196s interfaceC1196sB = c1093g3.b((InterfaceC1196s) list.get(0));
        InterfaceC1196s interfaceC1196sB2 = c1093g3.b((InterfaceC1196s) list.get(1));
        switch (G.f14197a[D2.c(str).ordinal()]) {
            case 1:
                zC = c(interfaceC1196sB, interfaceC1196sB2);
                return !zC ? InterfaceC1196s.f14820i : InterfaceC1196s.f14821j;
            case 2:
                zC = d(interfaceC1196sB2, interfaceC1196sB);
                if (!zC) {
                }
                break;
            case 3:
                zC = e(interfaceC1196sB2, interfaceC1196sB);
                if (!zC) {
                }
                break;
            case 4:
                zC = D2.h(interfaceC1196sB, interfaceC1196sB2);
                if (!zC) {
                }
                break;
            case 5:
                zH = D2.h(interfaceC1196sB, interfaceC1196sB2);
                zC = !zH;
                if (!zC) {
                }
                break;
            case 6:
                zC = d(interfaceC1196sB, interfaceC1196sB2);
                if (!zC) {
                }
                break;
            case 7:
                zC = e(interfaceC1196sB, interfaceC1196sB2);
                if (!zC) {
                }
                break;
            case 8:
                zH = c(interfaceC1196sB, interfaceC1196sB2);
                zC = !zH;
                if (!zC) {
                }
                break;
            default:
                return super.a(str);
        }
    }
}
