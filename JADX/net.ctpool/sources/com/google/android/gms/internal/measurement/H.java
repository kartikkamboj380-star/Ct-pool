package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.ConnectionResult;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class H {
    private static C1089g a(C1089g c1089g, C1093g3 c1093g3, AbstractC1152n abstractC1152n) {
        return b(c1089g, c1093g3, abstractC1152n, null, null);
    }

    private static C1089g b(C1089g c1089g, C1093g3 c1093g3, AbstractC1152n abstractC1152n, Boolean bool, Boolean bool2) {
        C1089g c1089g2 = new C1089g();
        Iterator itV = c1089g.v();
        while (itV.hasNext()) {
            int iIntValue = ((Integer) itV.next()).intValue();
            if (c1089g.u(iIntValue)) {
                InterfaceC1196s interfaceC1196sA = abstractC1152n.a(c1093g3, Arrays.asList(c1089g.n(iIntValue), new C1125k(Double.valueOf(iIntValue)), c1089g));
                if (interfaceC1196sA.zzd().equals(bool)) {
                    return c1089g2;
                }
                if (bool2 == null || interfaceC1196sA.zzd().equals(bool2)) {
                    c1089g2.t(iIntValue, interfaceC1196sA);
                }
            }
        }
        return c1089g2;
    }

    private static InterfaceC1196s c(C1089g c1089g, C1093g3 c1093g3, List list, boolean z6) {
        InterfaceC1196s interfaceC1196sA;
        D2.k("reduce", 1, list);
        D2.n("reduce", 2, list);
        InterfaceC1196s interfaceC1196sB = c1093g3.b((InterfaceC1196s) list.get(0));
        if (!(interfaceC1196sB instanceof AbstractC1152n)) {
            throw new IllegalArgumentException("Callback should be a method");
        }
        if (list.size() == 2) {
            interfaceC1196sA = c1093g3.b((InterfaceC1196s) list.get(1));
            if (interfaceC1196sA instanceof C1134l) {
                throw new IllegalArgumentException("Failed to parse initial value");
            }
        } else {
            if (c1089g.q() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            interfaceC1196sA = null;
        }
        AbstractC1152n abstractC1152n = (AbstractC1152n) interfaceC1196sB;
        int iQ = c1089g.q();
        int i7 = z6 ? 0 : iQ - 1;
        int i8 = z6 ? iQ - 1 : 0;
        int i9 = z6 ? 1 : -1;
        if (interfaceC1196sA == null) {
            interfaceC1196sA = c1089g.n(i7);
            i7 += i9;
        }
        while ((i8 - i7) * i9 >= 0) {
            if (c1089g.u(i7)) {
                interfaceC1196sA = abstractC1152n.a(c1093g3, Arrays.asList(interfaceC1196sA, c1089g.n(i7), new C1125k(Double.valueOf(i7)), c1089g));
                if (interfaceC1196sA instanceof C1134l) {
                    throw new IllegalStateException("Reduce operation failed");
                }
                i7 += i9;
            } else {
                i7 += i9;
            }
        }
        return interfaceC1196sA;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static InterfaceC1196s d(String str, C1089g c1089g, C1093g3 c1093g3, List list) {
        String str2;
        byte b7;
        double d7;
        String strC;
        AbstractC1152n abstractC1152n;
        int i7;
        C1093g3 c1093g32;
        Double d8;
        double dA;
        str.hashCode();
        Double dValueOf = Double.valueOf(-1.0d);
        switch (str.hashCode()) {
            case -1776922004:
                str2 = "toString";
                b7 = str.equals(str2) ? (byte) 0 : (byte) -1;
                break;
            case -1354795244:
                if (str.equals("concat")) {
                    str2 = "toString";
                    b7 = 1;
                } else {
                    str2 = "toString";
                }
                break;
            case -1274492040:
                if (str.equals("filter")) {
                    b7 = 2;
                    str2 = "toString";
                } else {
                    str2 = "toString";
                }
                break;
            case -934873754:
                if (str.equals("reduce")) {
                    str2 = "toString";
                    b7 = 3;
                } else {
                    str2 = "toString";
                }
                break;
            case -895859076:
                if (str.equals("splice")) {
                    b7 = 4;
                    str2 = "toString";
                } else {
                    str2 = "toString";
                }
                break;
            case -678635926:
                if (str.equals("forEach")) {
                    b7 = 5;
                    str2 = "toString";
                } else {
                    str2 = "toString";
                }
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    b7 = 6;
                    str2 = "toString";
                } else {
                    str2 = "toString";
                }
                break;
            case -277637751:
                if (str.equals("unshift")) {
                    b7 = 7;
                    str2 = "toString";
                } else {
                    str2 = "toString";
                }
                break;
            case 107868:
                if (str.equals("map")) {
                    b7 = 8;
                    str2 = "toString";
                } else {
                    str2 = "toString";
                }
                break;
            case 111185:
                if (str.equals("pop")) {
                    b7 = 9;
                    str2 = "toString";
                } else {
                    str2 = "toString";
                }
                break;
            case 3267882:
                if (str.equals("join")) {
                    b7 = 10;
                    str2 = "toString";
                } else {
                    str2 = "toString";
                }
                break;
            case 3452698:
                if (str.equals("push")) {
                    b7 = 11;
                    str2 = "toString";
                } else {
                    str2 = "toString";
                }
                break;
            case 3536116:
                if (str.equals("some")) {
                    b7 = 12;
                    str2 = "toString";
                } else {
                    str2 = "toString";
                }
                break;
            case 3536286:
                if (str.equals("sort")) {
                    b7 = 13;
                    str2 = "toString";
                } else {
                    str2 = "toString";
                }
                break;
            case 96891675:
                if (str.equals("every")) {
                    b7 = 14;
                    str2 = "toString";
                } else {
                    str2 = "toString";
                }
                break;
            case 109407362:
                if (str.equals("shift")) {
                    b7 = 15;
                    str2 = "toString";
                } else {
                    str2 = "toString";
                }
                break;
            case 109526418:
                if (str.equals("slice")) {
                    b7 = 16;
                    str2 = "toString";
                } else {
                    str2 = "toString";
                }
                break;
            case 965561430:
                if (str.equals("reduceRight")) {
                    b7 = 17;
                    str2 = "toString";
                } else {
                    str2 = "toString";
                }
                break;
            case 1099846370:
                if (str.equals("reverse")) {
                    b7 = 18;
                    str2 = "toString";
                } else {
                    str2 = "toString";
                }
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    b7 = 19;
                    str2 = "toString";
                } else {
                    str2 = "toString";
                }
                break;
            default:
                str2 = "toString";
                break;
        }
        switch (b7) {
            case 0:
                D2.g(str2, 0, list);
                return new C1214u(c1089g.toString());
            case 1:
                C1089g c1089g2 = (C1089g) c1089g.zzc();
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        InterfaceC1196s interfaceC1196sB = c1093g3.b((InterfaceC1196s) it.next());
                        if (interfaceC1196sB instanceof C1134l) {
                            throw new IllegalStateException("Failed evaluation of arguments");
                        }
                        int iQ = c1089g2.q();
                        if (interfaceC1196sB instanceof C1089g) {
                            C1089g c1089g3 = (C1089g) interfaceC1196sB;
                            Iterator itV = c1089g3.v();
                            while (itV.hasNext()) {
                                Integer num = (Integer) itV.next();
                                c1089g2.t(num.intValue() + iQ, c1089g3.n(num.intValue()));
                            }
                        } else {
                            c1089g2.t(iQ, interfaceC1196sB);
                        }
                    }
                }
                return c1089g2;
            case 2:
                D2.g("filter", 1, list);
                InterfaceC1196s interfaceC1196sB2 = c1093g3.b((InterfaceC1196s) list.get(0));
                if (!(interfaceC1196sB2 instanceof C1205t)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (c1089g.m() == 0) {
                    return new C1089g();
                }
                C1089g c1089g4 = (C1089g) c1089g.zzc();
                C1089g c1089gB = b(c1089g, c1093g3, (C1205t) interfaceC1196sB2, null, Boolean.TRUE);
                C1089g c1089g5 = new C1089g();
                Iterator itV2 = c1089gB.v();
                while (itV2.hasNext()) {
                    c1089g5.p(c1089g4.n(((Integer) itV2.next()).intValue()));
                }
                return c1089g5;
            case 3:
                return c(c1089g, c1093g3, list, true);
            case 4:
                if (list.isEmpty()) {
                    return new C1089g();
                }
                int iA = (int) D2.a(c1093g3.b((InterfaceC1196s) list.get(0)).b().doubleValue());
                if (iA < 0) {
                    iA = Math.max(0, iA + c1089g.q());
                } else if (iA > c1089g.q()) {
                    iA = c1089g.q();
                }
                int iQ2 = c1089g.q();
                C1089g c1089g6 = new C1089g();
                if (list.size() <= 1) {
                    while (iA < iQ2) {
                        c1089g6.p(c1089g.n(iA));
                        c1089g.t(iA, null);
                        iA++;
                    }
                    return c1089g6;
                }
                int iMax = Math.max(0, (int) D2.a(c1093g3.b((InterfaceC1196s) list.get(1)).b().doubleValue()));
                if (iMax > 0) {
                    for (int i8 = iA; i8 < Math.min(iQ2, iA + iMax); i8++) {
                        c1089g6.p(c1089g.n(iA));
                        c1089g.s(iA);
                    }
                }
                if (list.size() > 2) {
                    for (int i9 = 2; i9 < list.size(); i9++) {
                        InterfaceC1196s interfaceC1196sB3 = c1093g3.b((InterfaceC1196s) list.get(i9));
                        if (interfaceC1196sB3 instanceof C1134l) {
                            throw new IllegalArgumentException("Failed to parse elements to add");
                        }
                        c1089g.o((iA + i9) - 2, interfaceC1196sB3);
                    }
                }
                return c1089g6;
            case 5:
                D2.g("forEach", 1, list);
                InterfaceC1196s interfaceC1196sB4 = c1093g3.b((InterfaceC1196s) list.get(0));
                if (!(interfaceC1196sB4 instanceof C1205t)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (c1089g.m() == 0) {
                    return InterfaceC1196s.f14815d;
                }
                a(c1089g, c1093g3, (C1205t) interfaceC1196sB4);
                return InterfaceC1196s.f14815d;
            case 6:
                D2.n("lastIndexOf", 2, list);
                InterfaceC1196s interfaceC1196sB5 = InterfaceC1196s.f14815d;
                if (!list.isEmpty()) {
                    interfaceC1196sB5 = c1093g3.b((InterfaceC1196s) list.get(0));
                }
                double dQ = c1089g.q() - 1;
                if (list.size() > 1) {
                    InterfaceC1196s interfaceC1196sB6 = c1093g3.b((InterfaceC1196s) list.get(1));
                    dQ = Double.isNaN(interfaceC1196sB6.b().doubleValue()) ? c1089g.q() - 1 : D2.a(interfaceC1196sB6.b().doubleValue());
                    d7 = 0.0d;
                    if (dQ < 0.0d) {
                        dQ += (double) c1089g.q();
                    }
                } else {
                    d7 = 0.0d;
                }
                if (dQ < d7) {
                    return new C1125k(dValueOf);
                }
                for (int iMin = (int) Math.min(c1089g.q(), dQ); iMin >= 0; iMin--) {
                    if (c1089g.u(iMin) && D2.h(c1089g.n(iMin), interfaceC1196sB5)) {
                        return new C1125k(Double.valueOf(iMin));
                    }
                }
                return new C1125k(dValueOf);
            case 7:
                if (!list.isEmpty()) {
                    C1089g c1089g7 = new C1089g();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        InterfaceC1196s interfaceC1196sB7 = c1093g3.b((InterfaceC1196s) it2.next());
                        if (interfaceC1196sB7 instanceof C1134l) {
                            throw new IllegalStateException("Argument evaluation failed");
                        }
                        c1089g7.p(interfaceC1196sB7);
                    }
                    int iQ3 = c1089g7.q();
                    Iterator itV3 = c1089g.v();
                    while (itV3.hasNext()) {
                        Integer num2 = (Integer) itV3.next();
                        c1089g7.t(num2.intValue() + iQ3, c1089g.n(num2.intValue()));
                    }
                    c1089g.x();
                    Iterator itV4 = c1089g7.v();
                    while (itV4.hasNext()) {
                        Integer num3 = (Integer) itV4.next();
                        c1089g.t(num3.intValue(), c1089g7.n(num3.intValue()));
                    }
                }
                return new C1125k(Double.valueOf(c1089g.q()));
            case 8:
                D2.g("map", 1, list);
                InterfaceC1196s interfaceC1196sB8 = c1093g3.b((InterfaceC1196s) list.get(0));
                if (interfaceC1196sB8 instanceof C1205t) {
                    return c1089g.q() == 0 ? new C1089g() : a(c1089g, c1093g3, (C1205t) interfaceC1196sB8);
                }
                throw new IllegalArgumentException("Callback should be a method");
            case ConnectionResult.SERVICE_INVALID /* 9 */:
                D2.g("pop", 0, list);
                int iQ4 = c1089g.q();
                if (iQ4 == 0) {
                    return InterfaceC1196s.f14815d;
                }
                int i10 = iQ4 - 1;
                InterfaceC1196s interfaceC1196sN = c1089g.n(i10);
                c1089g.s(i10);
                return interfaceC1196sN;
            case 10:
                D2.n("join", 1, list);
                if (c1089g.q() == 0) {
                    return InterfaceC1196s.f14822k;
                }
                if (list.isEmpty()) {
                    strC = ",";
                } else {
                    InterfaceC1196s interfaceC1196sB9 = c1093g3.b((InterfaceC1196s) list.get(0));
                    strC = ((interfaceC1196sB9 instanceof C1179q) || (interfaceC1196sB9 instanceof C1255z)) ? "" : interfaceC1196sB9.c();
                }
                return new C1214u(c1089g.r(strC));
            case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                if (!list.isEmpty()) {
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        c1089g.p(c1093g3.b((InterfaceC1196s) it3.next()));
                    }
                }
                return new C1125k(Double.valueOf(c1089g.q()));
            case 12:
                D2.g("some", 1, list);
                InterfaceC1196s interfaceC1196sB10 = c1093g3.b((InterfaceC1196s) list.get(0));
                if (!(interfaceC1196sB10 instanceof AbstractC1152n)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (c1089g.q() != 0) {
                    AbstractC1152n abstractC1152n2 = (AbstractC1152n) interfaceC1196sB10;
                    Iterator itV5 = c1089g.v();
                    while (itV5.hasNext()) {
                        int iIntValue = ((Integer) itV5.next()).intValue();
                        if (c1089g.u(iIntValue) && abstractC1152n2.a(c1093g3, Arrays.asList(c1089g.n(iIntValue), new C1125k(Double.valueOf(iIntValue)), c1089g)).zzd().booleanValue()) {
                            return InterfaceC1196s.f14820i;
                        }
                    }
                }
                return InterfaceC1196s.f14821j;
            case 13:
                D2.n("sort", 1, list);
                if (c1089g.q() >= 2) {
                    List listW = c1089g.w();
                    if (list.isEmpty()) {
                        abstractC1152n = null;
                    } else {
                        InterfaceC1196s interfaceC1196sB11 = c1093g3.b((InterfaceC1196s) list.get(0));
                        if (!(interfaceC1196sB11 instanceof AbstractC1152n)) {
                            throw new IllegalArgumentException("Comparator should be a method");
                        }
                        abstractC1152n = (AbstractC1152n) interfaceC1196sB11;
                    }
                    Collections.sort(listW, new K(abstractC1152n, c1093g3));
                    c1089g.x();
                    Iterator it4 = listW.iterator();
                    int i11 = 0;
                    while (it4.hasNext()) {
                        c1089g.t(i11, (InterfaceC1196s) it4.next());
                        i11++;
                    }
                }
                return c1089g;
            case 14:
                D2.g("every", 1, list);
                InterfaceC1196s interfaceC1196sB12 = c1093g3.b((InterfaceC1196s) list.get(0));
                if (interfaceC1196sB12 instanceof C1205t) {
                    return (c1089g.q() == 0 || b(c1089g, c1093g3, (C1205t) interfaceC1196sB12, Boolean.FALSE, Boolean.TRUE).q() == c1089g.q()) ? InterfaceC1196s.f14820i : InterfaceC1196s.f14821j;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 15:
                D2.g("shift", 0, list);
                if (c1089g.q() == 0) {
                    return InterfaceC1196s.f14815d;
                }
                InterfaceC1196s interfaceC1196sN2 = c1089g.n(0);
                c1089g.s(0);
                return interfaceC1196sN2;
            case 16:
                D2.n("slice", 2, list);
                if (list.isEmpty()) {
                    return c1089g.zzc();
                }
                double dQ2 = c1089g.q();
                double dA2 = D2.a(c1093g3.b((InterfaceC1196s) list.get(0)).b().doubleValue());
                double dMax = dA2 < 0.0d ? Math.max(dA2 + dQ2, 0.0d) : Math.min(dA2, dQ2);
                if (list.size() == 2) {
                    double dA3 = D2.a(c1093g3.b((InterfaceC1196s) list.get(1)).b().doubleValue());
                    dQ2 = dA3 < 0.0d ? Math.max(dQ2 + dA3, 0.0d) : Math.min(dQ2, dA3);
                }
                C1089g c1089g8 = new C1089g();
                for (int i12 = (int) dMax; i12 < dQ2; i12++) {
                    c1089g8.p(c1089g.n(i12));
                }
                return c1089g8;
            case 17:
                return c(c1089g, c1093g3, list, false);
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
                D2.g("reverse", 0, list);
                int iQ5 = c1089g.q();
                if (iQ5 != 0) {
                    int i13 = 0;
                    while (i13 < iQ5 / 2) {
                        if (c1089g.u(i13)) {
                            InterfaceC1196s interfaceC1196sN3 = c1089g.n(i13);
                            c1089g.t(i13, null);
                            i7 = 1;
                            int i14 = (iQ5 - 1) - i13;
                            if (c1089g.u(i14)) {
                                c1089g.t(i13, c1089g.n(i14));
                            }
                            c1089g.t(i14, interfaceC1196sN3);
                        } else {
                            i7 = 1;
                        }
                        i13 += i7;
                    }
                }
                return c1089g;
            case 19:
                D2.n("indexOf", 2, list);
                InterfaceC1196s interfaceC1196sB13 = InterfaceC1196s.f14815d;
                if (list.isEmpty()) {
                    c1093g32 = c1093g3;
                } else {
                    c1093g32 = c1093g3;
                    interfaceC1196sB13 = c1093g32.b((InterfaceC1196s) list.get(0));
                }
                if (list.size() > 1) {
                    dA = D2.a(c1093g32.b((InterfaceC1196s) list.get(1)).b().doubleValue());
                    if (dA >= c1089g.q()) {
                        return new C1125k(dValueOf);
                    }
                    d8 = dValueOf;
                    if (dA < 0.0d) {
                        dA += (double) c1089g.q();
                    }
                } else {
                    d8 = dValueOf;
                    dA = 0.0d;
                }
                Iterator itV6 = c1089g.v();
                while (itV6.hasNext()) {
                    int iIntValue2 = ((Integer) itV6.next()).intValue();
                    double d9 = iIntValue2;
                    if (d9 >= dA && D2.h(c1089g.n(iIntValue2), interfaceC1196sB13)) {
                        return new C1125k(Double.valueOf(d9));
                    }
                }
                return new C1125k(d8);
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }
}
