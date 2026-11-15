package com.facebook.hermes.intl;

import com.facebook.hermes.intl.b;
import com.facebook.hermes.intl.g;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import q1.AbstractC1987a;

/* JADX INFO: loaded from: classes.dex */
@R1.a
public class DateTimeFormat {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f10474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f10475e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f10476f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f10477g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Object f10478h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private b.g f10479i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private b.e f10480j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private b.m f10481k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private b.d f10482l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private b.n f10483m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private b.i f10484n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private b.c f10485o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private b.f f10486p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private b.h f10487q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private b.j f10488r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private b.l f10489s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private b.EnumC0200b f10490t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private b.k f10491u;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private q1.b f10472b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private q1.b f10473c = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Object f10492v = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    b f10471a = new i();

    @R1.a
    public DateTimeFormat(List<String> list, Map<String, Object> map) throws q1.e {
        c(list, map);
        this.f10471a.f(this.f10472b, this.f10474d ? "" : this.f10475e, this.f10476f ? "" : this.f10477g, this.f10480j, this.f10481k, this.f10482l, this.f10483m, this.f10484n, this.f10485o, this.f10486p, this.f10487q, this.f10488r, this.f10489s, this.f10479i, this.f10492v, this.f10490t, this.f10491u, this.f10478h);
    }

    private Object a() {
        return this.f10471a.h(this.f10472b);
    }

    private Object b(Object obj, String str, String str2) throws q1.e {
        if (!q1.d.l(obj)) {
            throw new q1.e("Invalid options object !");
        }
        boolean z6 = true;
        if (str.equals("date") || str.equals("any")) {
            String[] strArr = {"weekday", "year", "month", "day"};
            for (int i7 = 0; i7 < 4; i7++) {
                if (!q1.d.n(q1.d.a(obj, strArr[i7]))) {
                    z6 = false;
                }
            }
        }
        if (str.equals("time") || str.equals("any")) {
            String[] strArr2 = {"hour", "minute", "second"};
            for (int i8 = 0; i8 < 3; i8++) {
                if (!q1.d.n(q1.d.a(obj, strArr2[i8]))) {
                    z6 = false;
                }
            }
        }
        if (!q1.d.n(q1.d.a(obj, "dateStyle")) || !q1.d.n(q1.d.a(obj, "timeStyle"))) {
            z6 = false;
        }
        if (z6 && (str2.equals("date") || str2.equals("all"))) {
            String[] strArr3 = {"year", "month", "day"};
            for (int i9 = 0; i9 < 3; i9++) {
                q1.d.c(obj, strArr3[i9], "numeric");
            }
        }
        if (z6 && (str2.equals("time") || str2.equals("all"))) {
            String[] strArr4 = {"hour", "minute", "second"};
            for (int i10 = 0; i10 < 3; i10++) {
                q1.d.c(obj, strArr4[i10], "numeric");
            }
        }
        return obj;
    }

    private void c(List list, Map map) throws q1.e {
        String strE;
        String strC;
        b.g gVar;
        List listAsList = Arrays.asList("ca", "nu", "hc");
        Object objB = b(map, "any", "date");
        Object objQ = q1.d.q();
        g.a aVar = g.a.STRING;
        q1.d.c(objQ, "localeMatcher", g.c(objB, "localeMatcher", aVar, AbstractC1987a.f21846a, "best fit"));
        Object objC = g.c(objB, "calendar", aVar, q1.d.d(), q1.d.d());
        if (!q1.d.n(objC) && !d(q1.d.h(objC))) {
            throw new q1.e("Invalid calendar option !");
        }
        q1.d.c(objQ, "ca", objC);
        Object objC2 = g.c(objB, "numberingSystem", aVar, q1.d.d(), q1.d.d());
        if (!q1.d.n(objC2) && !d(q1.d.h(objC2))) {
            throw new q1.e("Invalid numbering system !");
        }
        q1.d.c(objQ, "nu", objC2);
        Object objC3 = g.c(objB, "hour12", g.a.BOOLEAN, q1.d.d(), q1.d.d());
        Object objC4 = g.c(objB, "hourCycle", aVar, new String[]{"h11", "h12", "h23", "h24"}, q1.d.d());
        if (!q1.d.n(objC3)) {
            objC4 = q1.d.b();
        }
        q1.d.c(objQ, "hc", objC4);
        HashMap mapA = f.a(list, objQ, listAsList);
        q1.b bVar = (q1.b) q1.d.g(mapA).get("locale");
        this.f10472b = bVar;
        this.f10473c = bVar.e();
        Object objA = q1.d.a(mapA, "ca");
        if (q1.d.j(objA)) {
            this.f10474d = true;
            strE = this.f10471a.e(this.f10472b);
        } else {
            this.f10474d = false;
            strE = q1.d.h(objA);
        }
        this.f10475e = strE;
        Object objA2 = q1.d.a(mapA, "nu");
        if (q1.d.j(objA2)) {
            this.f10476f = true;
            strC = this.f10471a.c(this.f10472b);
        } else {
            this.f10476f = false;
            strC = q1.d.h(objA2);
        }
        this.f10477g = strC;
        Object objA3 = q1.d.a(mapA, "hc");
        Object objA4 = q1.d.a(objB, "timeZone");
        this.f10492v = q1.d.n(objA4) ? a() : e(objA4.toString());
        this.f10480j = (b.e) g.d(b.e.class, q1.d.h(g.c(objB, "formatMatcher", aVar, new String[]{"basic", "best fit"}, "best fit")));
        this.f10481k = (b.m) g.d(b.m.class, g.c(objB, "weekday", aVar, new String[]{"long", "short", "narrow"}, q1.d.d()));
        this.f10482l = (b.d) g.d(b.d.class, g.c(objB, "era", aVar, new String[]{"long", "short", "narrow"}, q1.d.d()));
        this.f10483m = (b.n) g.d(b.n.class, g.c(objB, "year", aVar, new String[]{"numeric", "2-digit"}, q1.d.d()));
        this.f10484n = (b.i) g.d(b.i.class, g.c(objB, "month", aVar, new String[]{"numeric", "2-digit", "long", "short", "narrow"}, q1.d.d()));
        this.f10485o = (b.c) g.d(b.c.class, g.c(objB, "day", aVar, new String[]{"numeric", "2-digit"}, q1.d.d()));
        Object objC5 = g.c(objB, "hour", aVar, new String[]{"numeric", "2-digit"}, q1.d.d());
        this.f10486p = (b.f) g.d(b.f.class, objC5);
        this.f10487q = (b.h) g.d(b.h.class, g.c(objB, "minute", aVar, new String[]{"numeric", "2-digit"}, q1.d.d()));
        this.f10488r = (b.j) g.d(b.j.class, g.c(objB, "second", aVar, new String[]{"numeric", "2-digit"}, q1.d.d()));
        this.f10489s = (b.l) g.d(b.l.class, g.c(objB, "timeZoneName", aVar, new String[]{"long", "longOffset", "longGeneric", "short", "shortOffset", "shortGeneric"}, q1.d.d()));
        this.f10490t = (b.EnumC0200b) g.d(b.EnumC0200b.class, g.c(objB, "dateStyle", aVar, new String[]{"full", "long", "medium", "short"}, q1.d.d()));
        Object objC6 = g.c(objB, "timeStyle", aVar, new String[]{"full", "long", "medium", "short"}, q1.d.d());
        this.f10491u = (b.k) g.d(b.k.class, objC6);
        if (q1.d.n(objC5) && q1.d.n(objC6)) {
            gVar = b.g.UNDEFINED;
        } else {
            b.g gVarD = this.f10471a.d(this.f10472b);
            gVar = q1.d.j(objA3) ? gVarD : (b.g) g.d(b.g.class, objA3);
            if (!q1.d.n(objC3)) {
                if (q1.d.e(objC3)) {
                    gVar = b.g.H11;
                    if (gVarD != gVar && gVarD != b.g.H23) {
                        gVar = b.g.H12;
                    }
                } else {
                    gVar = (gVarD == b.g.H11 || gVarD == b.g.H23) ? b.g.H23 : b.g.H24;
                }
            }
        }
        this.f10479i = gVar;
        this.f10478h = objC3;
    }

    private boolean d(String str) {
        return q1.c.e(str, 0, str.length() - 1);
    }

    @R1.a
    public static List<String> supportedLocalesOf(List<String> list, Map<String, Object> map) {
        String strH = q1.d.h(g.c(map, "localeMatcher", g.a.STRING, AbstractC1987a.f21846a, "best fit"));
        String[] strArr = new String[list.size()];
        boolean zEquals = strH.equals("best fit");
        String[] strArr2 = (String[]) list.toArray(strArr);
        return zEquals ? Arrays.asList(e.d(strArr2)) : Arrays.asList(e.h(strArr2));
    }

    public String e(String str) throws q1.e {
        for (String str2 : TimeZone.getAvailableIDs()) {
            if (f(str2).equals(f(str))) {
                return str2;
            }
        }
        throw new q1.e("Invalid timezone name!");
    }

    public String f(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        for (int i7 = 0; i7 < str.length(); i7++) {
            char cCharAt = str.charAt(i7);
            if (cCharAt >= 'A' && cCharAt <= 'Z') {
                cCharAt = (char) (cCharAt + ' ');
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    @R1.a
    public String format(double d7) {
        return this.f10471a.b(d7);
    }

    @R1.a
    public List<Map<String, String>> formatToParts(double d7) {
        ArrayList arrayList = new ArrayList();
        AttributedCharacterIterator attributedCharacterIteratorA = this.f10471a.a(d7);
        StringBuilder sb = new StringBuilder();
        for (char cFirst = attributedCharacterIteratorA.first(); cFirst != 65535; cFirst = attributedCharacterIteratorA.next()) {
            sb.append(cFirst);
            if (attributedCharacterIteratorA.getIndex() + 1 == attributedCharacterIteratorA.getRunLimit()) {
                Iterator<AttributedCharacterIterator.Attribute> it = attributedCharacterIteratorA.getAttributes().keySet().iterator();
                String strG = it.hasNext() ? this.f10471a.g(it.next(), sb.toString()) : "literal";
                String string = sb.toString();
                sb.setLength(0);
                HashMap map = new HashMap();
                map.put("type", strG);
                map.put("value", string);
                arrayList.add(map);
            }
        }
        return arrayList;
    }

    @R1.a
    public Map<String, Object> resolvedOptions() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("locale", this.f10473c.a());
        linkedHashMap.put("numberingSystem", this.f10477g);
        linkedHashMap.put("calendar", this.f10475e);
        linkedHashMap.put("timeZone", this.f10492v);
        b.g gVar = this.f10479i;
        if (gVar != b.g.UNDEFINED) {
            linkedHashMap.put("hourCycle", gVar.toString());
            b.g gVar2 = this.f10479i;
            linkedHashMap.put("hour12", (gVar2 == b.g.H11 || gVar2 == b.g.H12) ? Boolean.TRUE : Boolean.FALSE);
        }
        b.m mVar = this.f10481k;
        if (mVar != b.m.UNDEFINED) {
            linkedHashMap.put("weekday", mVar.toString());
        }
        b.d dVar = this.f10482l;
        if (dVar != b.d.UNDEFINED) {
            linkedHashMap.put("era", dVar.toString());
        }
        b.n nVar = this.f10483m;
        if (nVar != b.n.UNDEFINED) {
            linkedHashMap.put("year", nVar.toString());
        }
        b.i iVar = this.f10484n;
        if (iVar != b.i.UNDEFINED) {
            linkedHashMap.put("month", iVar.toString());
        }
        b.c cVar = this.f10485o;
        if (cVar != b.c.UNDEFINED) {
            linkedHashMap.put("day", cVar.toString());
        }
        b.f fVar = this.f10486p;
        if (fVar != b.f.UNDEFINED) {
            linkedHashMap.put("hour", fVar.toString());
        }
        b.h hVar = this.f10487q;
        if (hVar != b.h.UNDEFINED) {
            linkedHashMap.put("minute", hVar.toString());
        }
        b.j jVar = this.f10488r;
        if (jVar != b.j.UNDEFINED) {
            linkedHashMap.put("second", jVar.toString());
        }
        b.l lVar = this.f10489s;
        if (lVar != b.l.UNDEFINED) {
            linkedHashMap.put("timeZoneName", lVar.toString());
        }
        b.EnumC0200b enumC0200b = this.f10490t;
        if (enumC0200b != b.EnumC0200b.UNDEFINED) {
            linkedHashMap.put("dateStyle", enumC0200b.toString());
        }
        b.k kVar = this.f10491u;
        if (kVar != b.k.UNDEFINED) {
            linkedHashMap.put("timeStyle", kVar.toString());
        }
        return linkedHashMap;
    }
}
