package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.ConnectionResult;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class X extends A {
    protected X() {
        this.f14117a.add(Z.ASSIGN);
        this.f14117a.add(Z.CONST);
        this.f14117a.add(Z.CREATE_ARRAY);
        this.f14117a.add(Z.CREATE_OBJECT);
        this.f14117a.add(Z.EXPRESSION_LIST);
        this.f14117a.add(Z.GET);
        this.f14117a.add(Z.GET_INDEX);
        this.f14117a.add(Z.GET_PROPERTY);
        this.f14117a.add(Z.NULL);
        this.f14117a.add(Z.SET_PROPERTY);
        this.f14117a.add(Z.TYPEOF);
        this.f14117a.add(Z.UNDEFINED);
        this.f14117a.add(Z.VAR);
    }

    @Override // com.google.android.gms.internal.measurement.A
    public final InterfaceC1196s b(String str, C1093g3 c1093g3, List list) {
        String str2;
        int i7 = 0;
        switch (W.f14402a[D2.c(str).ordinal()]) {
            case 1:
                D2.f(Z.ASSIGN, 2, list);
                InterfaceC1196s interfaceC1196sB = c1093g3.b((InterfaceC1196s) list.get(0));
                if (!(interfaceC1196sB instanceof C1214u)) {
                    throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", interfaceC1196sB.getClass().getCanonicalName()));
                }
                if (!c1093g3.g(interfaceC1196sB.c())) {
                    throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", interfaceC1196sB.c()));
                }
                InterfaceC1196s interfaceC1196sB2 = c1093g3.b((InterfaceC1196s) list.get(1));
                c1093g3.h(interfaceC1196sB.c(), interfaceC1196sB2);
                return interfaceC1196sB2;
            case 2:
                D2.j(Z.CONST, 2, list);
                if (list.size() % 2 != 0) {
                    throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", Integer.valueOf(list.size())));
                }
                while (i7 < list.size() - 1) {
                    InterfaceC1196s interfaceC1196sB3 = c1093g3.b((InterfaceC1196s) list.get(i7));
                    if (!(interfaceC1196sB3 instanceof C1214u)) {
                        throw new IllegalArgumentException(String.format("Expected string for const name. got %s", interfaceC1196sB3.getClass().getCanonicalName()));
                    }
                    c1093g3.f(interfaceC1196sB3.c(), c1093g3.b((InterfaceC1196s) list.get(i7 + 1)));
                    i7 += 2;
                }
                return InterfaceC1196s.f14815d;
            case 3:
                if (list.isEmpty()) {
                    return new C1089g();
                }
                C1089g c1089g = new C1089g();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    InterfaceC1196s interfaceC1196sB4 = c1093g3.b((InterfaceC1196s) it.next());
                    if (interfaceC1196sB4 instanceof C1134l) {
                        throw new IllegalStateException("Failed to evaluate array element");
                    }
                    c1089g.t(i7, interfaceC1196sB4);
                    i7++;
                }
                return c1089g;
            case 4:
                if (list.isEmpty()) {
                    return new r();
                }
                if (list.size() % 2 != 0) {
                    throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", Integer.valueOf(list.size())));
                }
                r rVar = new r();
                while (i7 < list.size() - 1) {
                    InterfaceC1196s interfaceC1196sB5 = c1093g3.b((InterfaceC1196s) list.get(i7));
                    InterfaceC1196s interfaceC1196sB6 = c1093g3.b((InterfaceC1196s) list.get(i7 + 1));
                    if ((interfaceC1196sB5 instanceof C1134l) || (interfaceC1196sB6 instanceof C1134l)) {
                        throw new IllegalStateException("Failed to evaluate map entry");
                    }
                    rVar.k(interfaceC1196sB5.c(), interfaceC1196sB6);
                    i7 += 2;
                }
                return rVar;
            case 5:
                D2.j(Z.EXPRESSION_LIST, 1, list);
                InterfaceC1196s interfaceC1196sB7 = InterfaceC1196s.f14815d;
                while (i7 < list.size()) {
                    interfaceC1196sB7 = c1093g3.b((InterfaceC1196s) list.get(i7));
                    if (interfaceC1196sB7 instanceof C1134l) {
                        throw new IllegalStateException("ControlValue cannot be in an expression list");
                    }
                    i7++;
                }
                return interfaceC1196sB7;
            case 6:
                D2.f(Z.GET, 1, list);
                InterfaceC1196s interfaceC1196sB8 = c1093g3.b((InterfaceC1196s) list.get(0));
                if (interfaceC1196sB8 instanceof C1214u) {
                    return c1093g3.c(interfaceC1196sB8.c());
                }
                throw new IllegalArgumentException(String.format("Expected string for get var. got %s", interfaceC1196sB8.getClass().getCanonicalName()));
            case 7:
            case 8:
                D2.f(Z.GET_PROPERTY, 2, list);
                InterfaceC1196s interfaceC1196sB9 = c1093g3.b((InterfaceC1196s) list.get(0));
                InterfaceC1196s interfaceC1196sB10 = c1093g3.b((InterfaceC1196s) list.get(1));
                if ((interfaceC1196sB9 instanceof C1089g) && D2.l(interfaceC1196sB10)) {
                    return ((C1089g) interfaceC1196sB9).n(interfaceC1196sB10.b().intValue());
                }
                if (interfaceC1196sB9 instanceof InterfaceC1143m) {
                    return ((InterfaceC1143m) interfaceC1196sB9).f(interfaceC1196sB10.c());
                }
                if (interfaceC1196sB9 instanceof C1214u) {
                    if ("length".equals(interfaceC1196sB10.c())) {
                        return new C1125k(Double.valueOf(interfaceC1196sB9.c().length()));
                    }
                    if (D2.l(interfaceC1196sB10) && interfaceC1196sB10.b().doubleValue() < interfaceC1196sB9.c().length()) {
                        return new C1214u(String.valueOf(interfaceC1196sB9.c().charAt(interfaceC1196sB10.b().intValue())));
                    }
                }
                return InterfaceC1196s.f14815d;
            case ConnectionResult.SERVICE_INVALID /* 9 */:
                D2.f(Z.NULL, 0, list);
                return InterfaceC1196s.f14816e;
            case 10:
                D2.f(Z.SET_PROPERTY, 3, list);
                InterfaceC1196s interfaceC1196sB11 = c1093g3.b((InterfaceC1196s) list.get(0));
                InterfaceC1196s interfaceC1196sB12 = c1093g3.b((InterfaceC1196s) list.get(1));
                InterfaceC1196s interfaceC1196sB13 = c1093g3.b((InterfaceC1196s) list.get(2));
                if (interfaceC1196sB11 == InterfaceC1196s.f14815d || interfaceC1196sB11 == InterfaceC1196s.f14816e) {
                    throw new IllegalStateException(String.format("Can't set property %s of %s", interfaceC1196sB12.c(), interfaceC1196sB11.c()));
                }
                if ((interfaceC1196sB11 instanceof C1089g) && (interfaceC1196sB12 instanceof C1125k)) {
                    ((C1089g) interfaceC1196sB11).t(interfaceC1196sB12.b().intValue(), interfaceC1196sB13);
                } else if (interfaceC1196sB11 instanceof InterfaceC1143m) {
                    ((InterfaceC1143m) interfaceC1196sB11).k(interfaceC1196sB12.c(), interfaceC1196sB13);
                }
                return interfaceC1196sB13;
            case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                D2.f(Z.TYPEOF, 1, list);
                InterfaceC1196s interfaceC1196sB14 = c1093g3.b((InterfaceC1196s) list.get(0));
                if (interfaceC1196sB14 instanceof C1255z) {
                    str2 = "undefined";
                } else if (interfaceC1196sB14 instanceof C1098h) {
                    str2 = "boolean";
                } else if (interfaceC1196sB14 instanceof C1125k) {
                    str2 = "number";
                } else if (interfaceC1196sB14 instanceof C1214u) {
                    str2 = "string";
                } else if (interfaceC1196sB14 instanceof C1205t) {
                    str2 = "function";
                } else {
                    if ((interfaceC1196sB14 instanceof C1223v) || (interfaceC1196sB14 instanceof C1134l)) {
                        throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", interfaceC1196sB14));
                    }
                    str2 = "object";
                }
                return new C1214u(str2);
            case 12:
                D2.f(Z.UNDEFINED, 0, list);
                return InterfaceC1196s.f14815d;
            case 13:
                D2.j(Z.VAR, 1, list);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    InterfaceC1196s interfaceC1196sB15 = c1093g3.b((InterfaceC1196s) it2.next());
                    if (!(interfaceC1196sB15 instanceof C1214u)) {
                        throw new IllegalArgumentException(String.format("Expected string for var name. got %s", interfaceC1196sB15.getClass().getCanonicalName()));
                    }
                    c1093g3.e(interfaceC1196sB15.c(), InterfaceC1196s.f14815d);
                }
                return InterfaceC1196s.f14815d;
            default:
                return super.a(str);
        }
    }
}
