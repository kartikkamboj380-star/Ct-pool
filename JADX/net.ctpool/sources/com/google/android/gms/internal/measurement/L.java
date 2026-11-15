package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class L extends A {
    protected L() {
        this.f14117a.add(Z.FOR_IN);
        this.f14117a.add(Z.FOR_IN_CONST);
        this.f14117a.add(Z.FOR_IN_LET);
        this.f14117a.add(Z.FOR_LET);
        this.f14117a.add(Z.FOR_OF);
        this.f14117a.add(Z.FOR_OF_CONST);
        this.f14117a.add(Z.FOR_OF_LET);
        this.f14117a.add(Z.WHILE);
    }

    private static InterfaceC1196s c(P p6, InterfaceC1196s interfaceC1196s, InterfaceC1196s interfaceC1196s2) {
        return d(p6, interfaceC1196s.e(), interfaceC1196s2);
    }

    private static InterfaceC1196s d(P p6, Iterator it, InterfaceC1196s interfaceC1196s) {
        if (it != null) {
            while (it.hasNext()) {
                InterfaceC1196s interfaceC1196sA = p6.a((InterfaceC1196s) it.next()).a((C1089g) interfaceC1196s);
                if (interfaceC1196sA instanceof C1134l) {
                    C1134l c1134l = (C1134l) interfaceC1196sA;
                    if ("break".equals(c1134l.d())) {
                        return InterfaceC1196s.f14815d;
                    }
                    if ("return".equals(c1134l.d())) {
                        return c1134l;
                    }
                }
            }
        }
        return InterfaceC1196s.f14815d;
    }

    private static InterfaceC1196s e(P p6, InterfaceC1196s interfaceC1196s, InterfaceC1196s interfaceC1196s2) {
        if (interfaceC1196s instanceof Iterable) {
            return d(p6, ((Iterable) interfaceC1196s).iterator(), interfaceC1196s2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.A
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC1196s b(String str, C1093g3 c1093g3, List list) {
        switch (O.f14297a[D2.c(str).ordinal()]) {
            case 1:
                D2.f(Z.FOR_IN, 3, list);
                if (!(list.get(0) instanceof C1214u)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                }
                return c(new T(c1093g3, ((InterfaceC1196s) list.get(0)).c()), c1093g3.b((InterfaceC1196s) list.get(1)), c1093g3.b((InterfaceC1196s) list.get(2)));
            case 2:
                D2.f(Z.FOR_IN_CONST, 3, list);
                if (!(list.get(0) instanceof C1214u)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                }
                return c(new N(c1093g3, ((InterfaceC1196s) list.get(0)).c()), c1093g3.b((InterfaceC1196s) list.get(1)), c1093g3.b((InterfaceC1196s) list.get(2)));
            case 3:
                D2.f(Z.FOR_IN_LET, 3, list);
                if (!(list.get(0) instanceof C1214u)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                }
                return c(new Q(c1093g3, ((InterfaceC1196s) list.get(0)).c()), c1093g3.b((InterfaceC1196s) list.get(1)), c1093g3.b((InterfaceC1196s) list.get(2)));
            case 4:
                D2.f(Z.FOR_LET, 4, list);
                InterfaceC1196s interfaceC1196sB = c1093g3.b((InterfaceC1196s) list.get(0));
                if (!(interfaceC1196sB instanceof C1089g)) {
                    throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                }
                C1089g c1089g = (C1089g) interfaceC1196sB;
                InterfaceC1196s interfaceC1196s = (InterfaceC1196s) list.get(1);
                InterfaceC1196s interfaceC1196s2 = (InterfaceC1196s) list.get(2);
                InterfaceC1196s interfaceC1196sB2 = c1093g3.b((InterfaceC1196s) list.get(3));
                C1093g3 c1093g3D = c1093g3.d();
                for (int i7 = 0; i7 < c1089g.q(); i7++) {
                    String strC = c1089g.n(i7).c();
                    c1093g3D.h(strC, c1093g3.c(strC));
                }
                while (c1093g3.b(interfaceC1196s).zzd().booleanValue()) {
                    InterfaceC1196s interfaceC1196sA = c1093g3.a((C1089g) interfaceC1196sB2);
                    if (interfaceC1196sA instanceof C1134l) {
                        C1134l c1134l = (C1134l) interfaceC1196sA;
                        if ("break".equals(c1134l.d())) {
                            return InterfaceC1196s.f14815d;
                        }
                        if ("return".equals(c1134l.d())) {
                            return c1134l;
                        }
                    }
                    C1093g3 c1093g3D2 = c1093g3.d();
                    for (int i8 = 0; i8 < c1089g.q(); i8++) {
                        String strC2 = c1089g.n(i8).c();
                        c1093g3D2.h(strC2, c1093g3D.c(strC2));
                    }
                    c1093g3D2.b(interfaceC1196s2);
                    c1093g3D = c1093g3D2;
                }
                return InterfaceC1196s.f14815d;
            case 5:
                D2.f(Z.FOR_OF, 3, list);
                if (!(list.get(0) instanceof C1214u)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                }
                return e(new T(c1093g3, ((InterfaceC1196s) list.get(0)).c()), c1093g3.b((InterfaceC1196s) list.get(1)), c1093g3.b((InterfaceC1196s) list.get(2)));
            case 6:
                D2.f(Z.FOR_OF_CONST, 3, list);
                if (!(list.get(0) instanceof C1214u)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                }
                return e(new N(c1093g3, ((InterfaceC1196s) list.get(0)).c()), c1093g3.b((InterfaceC1196s) list.get(1)), c1093g3.b((InterfaceC1196s) list.get(2)));
            case 7:
                D2.f(Z.FOR_OF_LET, 3, list);
                if (!(list.get(0) instanceof C1214u)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                }
                return e(new Q(c1093g3, ((InterfaceC1196s) list.get(0)).c()), c1093g3.b((InterfaceC1196s) list.get(1)), c1093g3.b((InterfaceC1196s) list.get(2)));
            case 8:
                D2.f(Z.WHILE, 4, list);
                InterfaceC1196s interfaceC1196s3 = (InterfaceC1196s) list.get(0);
                InterfaceC1196s interfaceC1196s4 = (InterfaceC1196s) list.get(1);
                InterfaceC1196s interfaceC1196s5 = (InterfaceC1196s) list.get(2);
                InterfaceC1196s interfaceC1196sB3 = c1093g3.b((InterfaceC1196s) list.get(3));
                if (c1093g3.b(interfaceC1196s5).zzd().booleanValue()) {
                    InterfaceC1196s interfaceC1196sA2 = c1093g3.a((C1089g) interfaceC1196sB3);
                    if (interfaceC1196sA2 instanceof C1134l) {
                        C1134l c1134l2 = (C1134l) interfaceC1196sA2;
                        if (!"break".equals(c1134l2.d())) {
                            if ("return".equals(c1134l2.d())) {
                                return c1134l2;
                            }
                            while (c1093g3.b(interfaceC1196s3).zzd().booleanValue()) {
                                InterfaceC1196s interfaceC1196sA3 = c1093g3.a((C1089g) interfaceC1196sB3);
                                if (interfaceC1196sA3 instanceof C1134l) {
                                    C1134l c1134l3 = (C1134l) interfaceC1196sA3;
                                    if (!"break".equals(c1134l3.d())) {
                                        if ("return".equals(c1134l3.d())) {
                                            return c1134l3;
                                        }
                                    }
                                }
                                c1093g3.b(interfaceC1196s4);
                            }
                        }
                    } else {
                        while (c1093g3.b(interfaceC1196s3).zzd().booleanValue()) {
                        }
                    }
                }
                return InterfaceC1196s.f14815d;
            default:
                return super.a(str);
        }
    }
}
