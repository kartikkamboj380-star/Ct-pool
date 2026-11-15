package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class F extends A {
    protected F() {
        this.f14117a.add(Z.APPLY);
        this.f14117a.add(Z.BLOCK);
        this.f14117a.add(Z.BREAK);
        this.f14117a.add(Z.CASE);
        this.f14117a.add(Z.DEFAULT);
        this.f14117a.add(Z.CONTINUE);
        this.f14117a.add(Z.DEFINE_FUNCTION);
        this.f14117a.add(Z.FN);
        this.f14117a.add(Z.IF);
        this.f14117a.add(Z.QUOTE);
        this.f14117a.add(Z.RETURN);
        this.f14117a.add(Z.SWITCH);
        this.f14117a.add(Z.TERNARY);
    }

    private static InterfaceC1196s c(C1093g3 c1093g3, List list) {
        D2.j(Z.FN, 2, list);
        InterfaceC1196s interfaceC1196sB = c1093g3.b((InterfaceC1196s) list.get(0));
        InterfaceC1196s interfaceC1196sB2 = c1093g3.b((InterfaceC1196s) list.get(1));
        if (!(interfaceC1196sB2 instanceof C1089g)) {
            throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", interfaceC1196sB2.getClass().getCanonicalName()));
        }
        List listW = ((C1089g) interfaceC1196sB2).w();
        List arrayList = new ArrayList();
        if (list.size() > 2) {
            arrayList = list.subList(2, list.size());
        }
        return new C1205t(interfaceC1196sB.c(), listW, arrayList, c1093g3);
    }

    @Override // com.google.android.gms.internal.measurement.A
    public final InterfaceC1196s b(String str, C1093g3 c1093g3, List list) {
        int i7 = 0;
        switch (I.f14217a[D2.c(str).ordinal()]) {
            case 1:
                D2.f(Z.APPLY, 3, list);
                InterfaceC1196s interfaceC1196sB = c1093g3.b((InterfaceC1196s) list.get(0));
                String strC = c1093g3.b((InterfaceC1196s) list.get(1)).c();
                InterfaceC1196s interfaceC1196sB2 = c1093g3.b((InterfaceC1196s) list.get(2));
                if (!(interfaceC1196sB2 instanceof C1089g)) {
                    throw new IllegalArgumentException(String.format("Function arguments for Apply are not a list found %s", interfaceC1196sB2.getClass().getCanonicalName()));
                }
                if (strC.isEmpty()) {
                    throw new IllegalArgumentException("Function name for apply is undefined");
                }
                return interfaceC1196sB.i(strC, c1093g3, ((C1089g) interfaceC1196sB2).w());
            case 2:
                return c1093g3.d().a(new C1089g(list));
            case 3:
                D2.f(Z.BREAK, 0, list);
                return InterfaceC1196s.f14818g;
            case 4:
            case 5:
                if (!list.isEmpty()) {
                    InterfaceC1196s interfaceC1196sB3 = c1093g3.b((InterfaceC1196s) list.get(0));
                    if (interfaceC1196sB3 instanceof C1089g) {
                        return c1093g3.a((C1089g) interfaceC1196sB3);
                    }
                }
                return InterfaceC1196s.f14815d;
            case 6:
                D2.f(Z.BREAK, 0, list);
                return InterfaceC1196s.f14817f;
            case 7:
                D2.j(Z.DEFINE_FUNCTION, 2, list);
                C1205t c1205t = (C1205t) c(c1093g3, list);
                c1093g3.h(c1205t.d() == null ? "" : c1205t.d(), c1205t);
                return c1205t;
            case 8:
                return c(c1093g3, list);
            case ConnectionResult.SERVICE_INVALID /* 9 */:
                D2.j(Z.IF, 2, list);
                InterfaceC1196s interfaceC1196sB4 = c1093g3.b((InterfaceC1196s) list.get(0));
                InterfaceC1196s interfaceC1196sB5 = c1093g3.b((InterfaceC1196s) list.get(1));
                InterfaceC1196s interfaceC1196sB6 = list.size() > 2 ? c1093g3.b((InterfaceC1196s) list.get(2)) : null;
                InterfaceC1196s interfaceC1196s = InterfaceC1196s.f14815d;
                InterfaceC1196s interfaceC1196sA = interfaceC1196sB4.zzd().booleanValue() ? c1093g3.a((C1089g) interfaceC1196sB5) : interfaceC1196sB6 != null ? c1093g3.a((C1089g) interfaceC1196sB6) : interfaceC1196s;
                return interfaceC1196sA instanceof C1134l ? interfaceC1196sA : interfaceC1196s;
            case 10:
                return new C1089g(list);
            case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                if (list.isEmpty()) {
                    return InterfaceC1196s.f14819h;
                }
                D2.f(Z.RETURN, 1, list);
                return new C1134l("return", c1093g3.b((InterfaceC1196s) list.get(0)));
            case 12:
                D2.f(Z.SWITCH, 3, list);
                InterfaceC1196s interfaceC1196sB7 = c1093g3.b((InterfaceC1196s) list.get(0));
                InterfaceC1196s interfaceC1196sB8 = c1093g3.b((InterfaceC1196s) list.get(1));
                InterfaceC1196s interfaceC1196sB9 = c1093g3.b((InterfaceC1196s) list.get(2));
                if (!(interfaceC1196sB8 instanceof C1089g)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
                }
                if (!(interfaceC1196sB9 instanceof C1089g)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
                }
                C1089g c1089g = (C1089g) interfaceC1196sB8;
                C1089g c1089g2 = (C1089g) interfaceC1196sB9;
                boolean z6 = false;
                while (true) {
                    if (i7 < c1089g.q()) {
                        if (z6 || interfaceC1196sB7.equals(c1093g3.b(c1089g.n(i7)))) {
                            InterfaceC1196s interfaceC1196sB10 = c1093g3.b(c1089g2.n(i7));
                            if (!(interfaceC1196sB10 instanceof C1134l)) {
                                z6 = true;
                            } else if (!((C1134l) interfaceC1196sB10).d().equals("break")) {
                                return interfaceC1196sB10;
                            }
                        }
                        i7++;
                    } else if (c1089g.q() + 1 == c1089g2.q()) {
                        InterfaceC1196s interfaceC1196sB11 = c1093g3.b(c1089g2.n(c1089g.q()));
                        if (interfaceC1196sB11 instanceof C1134l) {
                            String strD = ((C1134l) interfaceC1196sB11).d();
                            if (strD.equals("return") || strD.equals("continue")) {
                                return interfaceC1196sB11;
                            }
                        }
                    }
                }
                return InterfaceC1196s.f14815d;
            case 13:
                D2.f(Z.TERNARY, 3, list);
                return c1093g3.b((InterfaceC1196s) list.get(0)).zzd().booleanValue() ? c1093g3.b((InterfaceC1196s) list.get(1)) : c1093g3.b((InterfaceC1196s) list.get(2));
            default:
                return super.a(str);
        }
    }
}
