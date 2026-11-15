package com.facebook.hermes.intl;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    public enum a {
        BOOLEAN,
        STRING
    }

    public static Object a(String str, Object obj, Object obj2, Object obj3, Object obj4) throws q1.e {
        if (q1.d.n(obj)) {
            return obj4;
        }
        if (!q1.d.k(obj)) {
            throw new q1.e(str + " value is invalid.");
        }
        double dF = q1.d.f(obj);
        if (!Double.isNaN(dF) && dF <= q1.d.f(obj3) && dF >= q1.d.f(obj2)) {
            return obj;
        }
        throw new q1.e(str + " value is invalid.");
    }

    public static Object b(Object obj, String str, Object obj2, Object obj3, Object obj4) {
        return a(str, q1.d.a(obj, str), obj2, obj3, obj4);
    }

    public static Object c(Object obj, String str, a aVar, Object obj2, Object obj3) throws q1.e {
        Object objA = q1.d.a(obj, str);
        if (q1.d.n(objA)) {
            return obj3;
        }
        if (q1.d.j(objA)) {
            objA = "";
        }
        if (aVar == a.BOOLEAN && !q1.d.i(objA)) {
            throw new q1.e("Boolean option expected but not found");
        }
        if (aVar == a.STRING && !q1.d.m(objA)) {
            throw new q1.e("String option expected but not found");
        }
        if (q1.d.n(obj2) || Arrays.asList((Object[]) obj2).contains(objA)) {
            return objA;
        }
        throw new q1.e("String option expected but not found");
    }

    public static Enum d(Class cls, Object obj) {
        if (q1.d.n(obj)) {
            return Enum.valueOf(cls, "UNDEFINED");
        }
        if (q1.d.j(obj)) {
            return null;
        }
        String strH = q1.d.h(obj);
        if (strH.equals("2-digit")) {
            return Enum.valueOf(cls, "DIGIT2");
        }
        for (Enum r32 : (Enum[]) cls.getEnumConstants()) {
            if (r32.name().compareToIgnoreCase(strH) == 0) {
                return r32;
            }
        }
        return null;
    }
}
