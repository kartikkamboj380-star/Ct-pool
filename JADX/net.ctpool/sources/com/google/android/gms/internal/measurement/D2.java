package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class D2 {
    public static double a(double d7) {
        if (Double.isNaN(d7)) {
            return 0.0d;
        }
        if (Double.isInfinite(d7) || d7 == 0.0d || d7 == -0.0d) {
            return d7;
        }
        return ((double) (d7 > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d7));
    }

    public static int b(C1093g3 c1093g3) {
        int i7 = i(c1093g3.c("runtime.counter").b().doubleValue() + 1.0d);
        if (i7 > 1000000) {
            throw new IllegalStateException("Instructions allowed exceeded");
        }
        c1093g3.h("runtime.counter", new C1125k(Double.valueOf(i7)));
        return i7;
    }

    public static Z c(String str) {
        Z zE = (str == null || str.isEmpty()) ? null : Z.e(Integer.parseInt(str));
        if (zE != null) {
            return zE;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", str));
    }

    public static Object d(InterfaceC1196s interfaceC1196s) {
        if (InterfaceC1196s.f14816e.equals(interfaceC1196s)) {
            return null;
        }
        if (InterfaceC1196s.f14815d.equals(interfaceC1196s)) {
            return "";
        }
        if (interfaceC1196s instanceof r) {
            return e((r) interfaceC1196s);
        }
        if (!(interfaceC1196s instanceof C1089g)) {
            return !interfaceC1196s.b().isNaN() ? interfaceC1196s.b() : interfaceC1196s.c();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((C1089g) interfaceC1196s).iterator();
        while (it.hasNext()) {
            Object objD = d((InterfaceC1196s) it.next());
            if (objD != null) {
                arrayList.add(objD);
            }
        }
        return arrayList;
    }

    public static Map e(r rVar) {
        HashMap map = new HashMap();
        for (String str : rVar.a()) {
            Object objD = d(rVar.f(str));
            if (objD != null) {
                map.put(str, objD);
            }
        }
        return map;
    }

    public static void f(Z z6, int i7, List list) {
        g(z6.name(), i7, list);
    }

    public static void g(String str, int i7, List list) {
        if (list.size() != i7) {
            throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", str, Integer.valueOf(i7), Integer.valueOf(list.size())));
        }
    }

    public static boolean h(InterfaceC1196s interfaceC1196s, InterfaceC1196s interfaceC1196s2) {
        if (!interfaceC1196s.getClass().equals(interfaceC1196s2.getClass())) {
            return false;
        }
        if ((interfaceC1196s instanceof C1255z) || (interfaceC1196s instanceof C1179q)) {
            return true;
        }
        if (!(interfaceC1196s instanceof C1125k)) {
            return interfaceC1196s instanceof C1214u ? interfaceC1196s.c().equals(interfaceC1196s2.c()) : interfaceC1196s instanceof C1098h ? interfaceC1196s.zzd().equals(interfaceC1196s2.zzd()) : interfaceC1196s == interfaceC1196s2;
        }
        if (Double.isNaN(interfaceC1196s.b().doubleValue()) || Double.isNaN(interfaceC1196s2.b().doubleValue())) {
            return false;
        }
        return interfaceC1196s.b().equals(interfaceC1196s2.b());
    }

    public static int i(double d7) {
        if (Double.isNaN(d7) || Double.isInfinite(d7) || d7 == 0.0d) {
            return 0;
        }
        return (int) ((((double) (d7 > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d7))) % 4.294967296E9d);
    }

    public static void j(Z z6, int i7, List list) {
        k(z6.name(), i7, list);
    }

    public static void k(String str, int i7, List list) {
        if (list.size() < i7) {
            throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", str, Integer.valueOf(i7), Integer.valueOf(list.size())));
        }
    }

    public static boolean l(InterfaceC1196s interfaceC1196s) {
        if (interfaceC1196s == null) {
            return false;
        }
        Double dB = interfaceC1196s.b();
        return !dB.isNaN() && dB.doubleValue() >= 0.0d && dB.equals(Double.valueOf(Math.floor(dB.doubleValue())));
    }

    public static long m(double d7) {
        return ((long) i(d7)) & 4294967295L;
    }

    public static void n(String str, int i7, List list) {
        if (list.size() > i7) {
            throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", str, Integer.valueOf(i7), Integer.valueOf(list.size())));
        }
    }
}
