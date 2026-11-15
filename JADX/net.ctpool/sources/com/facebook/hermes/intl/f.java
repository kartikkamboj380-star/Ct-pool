package com.facebook.hermes.intl;

import com.facebook.hermes.intl.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static HashMap a(List list, Object obj, List list2) {
        HashMap map = new HashMap();
        e.a aVarF = q1.d.h(q1.d.a(obj, "localeMatcher")).equals("lookup") ? e.f((String[]) list.toArray(new String[list.size()])) : e.c((String[]) list.toArray(new String[list.size()]));
        HashSet<String> hashSet = new HashSet();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object objB = q1.d.b();
            Object obj2 = objB;
            if (!aVarF.f10652b.isEmpty()) {
                obj2 = objB;
                if (aVarF.f10652b.containsKey(str)) {
                    String str2 = (String) aVarF.f10652b.get(str);
                    boolean zIsEmpty = str2.isEmpty();
                    Object objR = str2;
                    if (zIsEmpty) {
                        objR = q1.d.r("true");
                    }
                    hashSet.add(str);
                    obj2 = objR;
                }
            }
            Object obj3 = obj2;
            if (q1.d.g(obj).containsKey(str)) {
                Object objA = q1.d.a(obj, str);
                boolean zM = q1.d.m(objA);
                Object objO = objA;
                if (zM) {
                    boolean zIsEmpty2 = q1.d.h(objA).isEmpty();
                    objO = objA;
                    if (zIsEmpty2) {
                        objO = q1.d.o(true);
                    }
                }
                obj3 = obj2;
                if (!q1.d.n(objO)) {
                    boolean zEquals = objO.equals(obj2);
                    obj3 = obj2;
                    if (!zEquals) {
                        hashSet.remove(str);
                        obj3 = objO;
                    }
                }
            }
            boolean zJ = q1.d.j(obj3);
            Object objB2 = obj3;
            if (!zJ) {
                objB2 = q1.h.f(str, obj3);
            }
            if (q1.d.m(objB2) && !q1.h.c(str, q1.d.h(objB2), aVarF.f10651a)) {
                objB2 = q1.d.b();
            }
            map.put(str, objB2);
        }
        for (String str3 : hashSet) {
            ArrayList arrayList = new ArrayList();
            String strH = q1.d.h(q1.h.f(str3, q1.d.r((String) aVarF.f10652b.get(str3))));
            if (!q1.d.m(strH) || q1.h.c(str3, q1.d.h(strH), aVarF.f10651a)) {
                arrayList.add(strH);
                aVarF.f10651a.g(str3, arrayList);
            }
        }
        map.put("locale", aVarF.f10651a);
        return map;
    }
}
