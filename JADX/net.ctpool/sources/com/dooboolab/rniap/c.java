package com.dooboolab.rniap;

import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import j5.AbstractC1809n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f10437a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final HashMap f10438b = new HashMap();

    private c() {
    }

    public final void a(String str, Promise promise) {
        w5.k.f(str, "key");
        w5.k.f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        HashMap map = f10438b;
        Object arrayList = map.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map.put(str, arrayList);
        }
        ((List) arrayList).add(promise);
    }

    public final void b() {
        HashMap map = f10438b;
        ArrayList arrayList = new ArrayList();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            AbstractC1809n.t(arrayList, (List) ((Map.Entry) it.next()).getValue());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            d.c((Promise) it2.next(), "E_CONNECTION_CLOSED", "Connection has been closed", null);
        }
        f10438b.clear();
    }

    public final void c(String str, String str2, String str3, Exception exc) {
        w5.k.f(str, "key");
        List list = (List) f10438b.get(str);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                d.c((Promise) it.next(), str2, str3, exc);
            }
        }
        f10438b.remove(str);
    }

    public final void d(String str, Object obj) {
        w5.k.f(str, "key");
        List list = (List) f10438b.get(str);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                d.d((Promise) it.next(), obj);
            }
        }
        f10438b.remove(str);
    }
}
