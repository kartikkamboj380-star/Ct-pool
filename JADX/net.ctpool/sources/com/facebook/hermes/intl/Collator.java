package com.facebook.hermes.intl;

import com.facebook.hermes.intl.a;
import com.facebook.hermes.intl.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import q1.AbstractC1987a;

/* JADX INFO: loaded from: classes.dex */
@R1.a
public class Collator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a.d f10462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a.c f10463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f10464c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f10466e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a.b f10467f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private q1.b f10468g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private q1.b f10469h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f10465d = "default";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private a f10470i = new h();

    @R1.a
    public Collator(List<String> list, Map<String, Object> map) throws q1.e {
        a(list, map);
        this.f10470i.c(this.f10468g).e(this.f10466e).d(this.f10467f).f(this.f10463b).g(this.f10464c);
    }

    private void a(List list, Map map) throws q1.e {
        g.a aVar = g.a.STRING;
        this.f10462a = (a.d) g.d(a.d.class, q1.d.h(g.c(map, "usage", aVar, AbstractC1987a.f21850e, "sort")));
        Object objQ = q1.d.q();
        q1.d.c(objQ, "localeMatcher", g.c(map, "localeMatcher", aVar, AbstractC1987a.f21846a, "best fit"));
        Object objC = g.c(map, "numeric", g.a.BOOLEAN, q1.d.d(), q1.d.d());
        if (!q1.d.n(objC)) {
            objC = q1.d.r(String.valueOf(q1.d.e(objC)));
        }
        q1.d.c(objQ, "kn", objC);
        q1.d.c(objQ, "kf", g.c(map, "caseFirst", aVar, AbstractC1987a.f21849d, q1.d.d()));
        HashMap mapA = f.a(list, objQ, Arrays.asList("co", "kf", "kn"));
        q1.b bVar = (q1.b) q1.d.g(mapA).get("locale");
        this.f10468g = bVar;
        this.f10469h = bVar.e();
        Object objA = q1.d.a(mapA, "co");
        if (q1.d.j(objA)) {
            objA = q1.d.r("default");
        }
        this.f10465d = q1.d.h(objA);
        Object objA2 = q1.d.a(mapA, "kn");
        this.f10466e = q1.d.j(objA2) ? false : Boolean.parseBoolean(q1.d.h(objA2));
        Object objA3 = q1.d.a(mapA, "kf");
        if (q1.d.j(objA3)) {
            objA3 = q1.d.r("false");
        }
        this.f10467f = (a.b) g.d(a.b.class, q1.d.h(objA3));
        if (this.f10462a == a.d.SEARCH) {
            ArrayList arrayListC = this.f10468g.c("collation");
            ArrayList arrayList = new ArrayList();
            Iterator it = arrayListC.iterator();
            while (it.hasNext()) {
                arrayList.add(q1.h.e((String) it.next()));
            }
            arrayList.add(q1.h.e("search"));
            this.f10468g.g("co", arrayList);
        }
        Object objC2 = g.c(map, "sensitivity", g.a.STRING, AbstractC1987a.f21848c, q1.d.d());
        this.f10463b = !q1.d.n(objC2) ? (a.c) g.d(a.c.class, q1.d.h(objC2)) : this.f10462a == a.d.SORT ? a.c.VARIANT : a.c.LOCALE;
        this.f10464c = q1.d.e(g.c(map, "ignorePunctuation", g.a.BOOLEAN, q1.d.d(), Boolean.FALSE));
    }

    @R1.a
    public static List<String> supportedLocalesOf(List<String> list, Map<String, Object> map) {
        return q1.d.h(g.c(map, "localeMatcher", g.a.STRING, AbstractC1987a.f21846a, "best fit")).equals("best fit") ? Arrays.asList(e.d((String[]) list.toArray(new String[list.size()]))) : Arrays.asList(e.h((String[]) list.toArray(new String[list.size()])));
    }

    @R1.a
    public double compare(String str, String str2) {
        return this.f10470i.a(str, str2);
    }

    @R1.a
    public Map<String, Object> resolvedOptions() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("locale", this.f10469h.a().replace("-kn-true", "-kn"));
        linkedHashMap.put("usage", this.f10462a.toString());
        a.c cVarB = this.f10463b;
        if (cVarB == a.c.LOCALE) {
            cVarB = this.f10470i.b();
        }
        linkedHashMap.put("sensitivity", cVarB.toString());
        linkedHashMap.put("ignorePunctuation", Boolean.valueOf(this.f10464c));
        linkedHashMap.put("collation", this.f10465d);
        linkedHashMap.put("numeric", Boolean.valueOf(this.f10466e));
        linkedHashMap.put("caseFirst", this.f10467f.toString());
        return linkedHashMap;
    }
}
