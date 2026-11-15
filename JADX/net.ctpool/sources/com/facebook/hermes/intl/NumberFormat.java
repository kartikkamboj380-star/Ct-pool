package com.facebook.hermes.intl;

import com.facebook.hermes.intl.c;
import com.facebook.hermes.intl.g;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import q1.AbstractC1987a;

/* JADX INFO: loaded from: classes.dex */
@R1.a
public class NumberFormat {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static String[] f10493v = {"acre", "bit", "byte", "celsius", "centimeter", "day", "degree", "fahrenheit", "fluid-ounce", "foot", "gallon", "gigabit", "gigabyte", "gram", "hectare", "hour", "inch", "kilobit", "kilobyte", "kilogram", "kilometer", "liter", "megabit", "megabyte", "meter", "mile", "mile-scandinavian", "milliliter", "millimeter", "millisecond", "minute", "month", "ounce", "percent", "petabyte", "pound", "second", "stone", "terabit", "terabyte", "week", "yard", "year"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c.h f10494a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c.i f10499f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private c.f f10506m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f10509p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private c.b f10512s;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f10495b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c.EnumC0201c f10496c = c.EnumC0201c.SYMBOL;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c.d f10497d = c.d.STANDARD;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f10498e = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f10500g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f10501h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f10502i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f10503j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f10504k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f10505l = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private c.g f10507n = c.g.AUTO;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f10510q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private c.e f10511r = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private q1.b f10513t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private q1.b f10514u = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private c f10508o = new j();

    @R1.a
    public NumberFormat(List<String> list, Map<String, Object> map) throws q1.e {
        a(list, map);
        this.f10508o.l(this.f10513t, this.f10509p ? "" : this.f10510q, this.f10494a, this.f10497d, this.f10511r, this.f10512s).f(this.f10495b, this.f10496c).j(this.f10500g).i(this.f10501h).g(this.f10506m, this.f10504k, this.f10505l).k(this.f10506m, this.f10502i, this.f10503j).e(this.f10507n).d(this.f10498e, this.f10499f);
    }

    private void a(List list, Map map) throws q1.e {
        String strC;
        double dN;
        Object objP;
        Object objQ = q1.d.q();
        g.a aVar = g.a.STRING;
        q1.d.c(objQ, "localeMatcher", g.c(map, "localeMatcher", aVar, AbstractC1987a.f21846a, "best fit"));
        Object objC = g.c(map, "numberingSystem", aVar, q1.d.d(), q1.d.d());
        if (!q1.d.n(objC) && !b(q1.d.h(objC))) {
            throw new q1.e("Invalid numbering system !");
        }
        q1.d.c(objQ, "nu", objC);
        HashMap mapA = f.a(list, objQ, Collections.singletonList("nu"));
        q1.b bVar = (q1.b) q1.d.g(mapA).get("locale");
        this.f10513t = bVar;
        this.f10514u = bVar.e();
        Object objA = q1.d.a(mapA, "nu");
        if (q1.d.j(objA)) {
            this.f10509p = true;
            strC = this.f10508o.c(this.f10513t);
        } else {
            this.f10509p = false;
            strC = q1.d.h(objA);
        }
        this.f10510q = strC;
        h(map);
        if (this.f10494a == c.h.CURRENCY) {
            dN = j.n(this.f10495b);
            objP = q1.d.p(dN);
        } else {
            dN = 0.0d;
            objP = q1.d.p(0.0d);
            if (this.f10494a != c.h.PERCENT) {
                dN = 3.0d;
            }
        }
        Object objP2 = q1.d.p(dN);
        this.f10511r = (c.e) g.d(c.e.class, q1.d.h(g.c(map, "notation", aVar, new String[]{"standard", "scientific", "engineering", "compact"}, "standard")));
        g(map, objP, objP2);
        Object objC2 = g.c(map, "compactDisplay", aVar, new String[]{"short", "long"}, "short");
        if (this.f10511r == c.e.COMPACT) {
            this.f10512s = (c.b) g.d(c.b.class, q1.d.h(objC2));
        }
        this.f10500g = q1.d.e(g.c(map, "useGrouping", g.a.BOOLEAN, q1.d.d(), q1.d.o(true)));
        this.f10507n = (c.g) g.d(c.g.class, q1.d.h(g.c(map, "signDisplay", aVar, new String[]{"auto", "never", "always", "exceptZero"}, "auto")));
    }

    private boolean b(String str) {
        return q1.c.e(str, 0, str.length() - 1);
    }

    private boolean c(String str) {
        return Arrays.binarySearch(f10493v, str) >= 0;
    }

    private boolean d(String str) {
        return f(str).matches("^[A-Z][A-Z][A-Z]$");
    }

    private boolean e(String str) {
        if (c(str)) {
            return true;
        }
        int iIndexOf = str.indexOf("-per-");
        return iIndexOf >= 0 && str.indexOf("-per-", iIndexOf + 1) < 0 && c(str.substring(0, iIndexOf)) && c(str.substring(iIndexOf + 5));
    }

    private String f(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        for (int i7 = 0; i7 < str.length(); i7++) {
            char cCharAt = str.charAt(i7);
            if (cCharAt >= 'a' && cCharAt <= 'z') {
                cCharAt = (char) (cCharAt - ' ');
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    private void g(Map map, Object obj, Object obj2) throws q1.e {
        double dF;
        int iFloor;
        Object objB = g.b(map, "minimumIntegerDigits", q1.d.p(1.0d), q1.d.p(21.0d), q1.d.p(1.0d));
        Object objA = q1.d.a(map, "minimumFractionDigits");
        Object objA2 = q1.d.a(map, "maximumFractionDigits");
        Object objA3 = q1.d.a(map, "minimumSignificantDigits");
        Object objA4 = q1.d.a(map, "maximumSignificantDigits");
        this.f10501h = (int) Math.floor(q1.d.f(objB));
        if (!q1.d.n(objA3) || !q1.d.n(objA4)) {
            this.f10506m = c.f.SIGNIFICANT_DIGITS;
            Object objA5 = g.a("minimumSignificantDigits", objA3, q1.d.p(1.0d), q1.d.p(21.0d), q1.d.p(1.0d));
            Object objA6 = g.a("maximumSignificantDigits", objA4, objA5, q1.d.p(21.0d), q1.d.p(21.0d));
            this.f10504k = (int) Math.floor(q1.d.f(objA5));
            this.f10505l = (int) Math.floor(q1.d.f(objA6));
            return;
        }
        if (q1.d.n(objA) && q1.d.n(objA2)) {
            c.e eVar = this.f10511r;
            if (eVar == c.e.COMPACT) {
                this.f10506m = c.f.COMPACT_ROUNDING;
                return;
            }
            if (eVar == c.e.ENGINEERING) {
                this.f10506m = c.f.FRACTION_DIGITS;
                iFloor = 5;
                this.f10503j = iFloor;
            } else {
                this.f10506m = c.f.FRACTION_DIGITS;
                this.f10502i = (int) Math.floor(q1.d.f(obj));
                dF = q1.d.f(obj2);
            }
        } else {
            this.f10506m = c.f.FRACTION_DIGITS;
            Object objA7 = g.a("minimumFractionDigits", objA, q1.d.p(0.0d), q1.d.p(20.0d), q1.d.d());
            Object objA8 = g.a("maximumFractionDigits", objA2, q1.d.p(0.0d), q1.d.p(20.0d), q1.d.d());
            if (q1.d.n(objA7)) {
                objA7 = q1.d.p(Math.min(q1.d.f(obj), q1.d.f(objA8)));
            } else if (q1.d.n(objA8)) {
                objA8 = q1.d.p(Math.max(q1.d.f(obj2), q1.d.f(objA7)));
            } else if (q1.d.f(objA7) > q1.d.f(objA8)) {
                throw new q1.e("minimumFractionDigits is greater than maximumFractionDigits");
            }
            this.f10502i = (int) Math.floor(q1.d.f(objA7));
            dF = q1.d.f(objA8);
        }
        iFloor = (int) Math.floor(dF);
        this.f10503j = iFloor;
    }

    private void h(Map map) throws q1.e {
        g.a aVar = g.a.STRING;
        this.f10494a = (c.h) g.d(c.h.class, q1.d.h(g.c(map, "style", aVar, new String[]{"decimal", "percent", "currency", "unit"}, "decimal")));
        Object objC = g.c(map, "currency", aVar, q1.d.d(), q1.d.d());
        if (q1.d.n(objC)) {
            if (this.f10494a == c.h.CURRENCY) {
                throw new q1.e("Expected currency style !");
            }
        } else if (!d(q1.d.h(objC))) {
            throw new q1.e("Malformed currency code !");
        }
        Object objC2 = g.c(map, "currencyDisplay", aVar, new String[]{"symbol", "narrowSymbol", "code", "name"}, "symbol");
        Object objC3 = g.c(map, "currencySign", aVar, new String[]{"accounting", "standard"}, "standard");
        Object objC4 = g.c(map, "unit", aVar, q1.d.d(), q1.d.d());
        if (q1.d.n(objC4)) {
            if (this.f10494a == c.h.UNIT) {
                throw new q1.e("Expected unit !");
            }
        } else if (!e(q1.d.h(objC4))) {
            throw new q1.e("Malformed unit identifier !");
        }
        Object objC5 = g.c(map, "unitDisplay", aVar, new String[]{"long", "short", "narrow"}, "short");
        c.h hVar = this.f10494a;
        if (hVar == c.h.CURRENCY) {
            this.f10495b = f(q1.d.h(objC));
            this.f10496c = (c.EnumC0201c) g.d(c.EnumC0201c.class, q1.d.h(objC2));
            this.f10497d = (c.d) g.d(c.d.class, q1.d.h(objC3));
        } else if (hVar == c.h.UNIT) {
            this.f10498e = q1.d.h(objC4);
            this.f10499f = (c.i) g.d(c.i.class, q1.d.h(objC5));
        }
    }

    @R1.a
    public static List<String> supportedLocalesOf(List<String> list, Map<String, Object> map) {
        String strH = q1.d.h(g.c(map, "localeMatcher", g.a.STRING, AbstractC1987a.f21846a, "best fit"));
        String[] strArr = new String[list.size()];
        boolean zEquals = strH.equals("best fit");
        String[] strArr2 = (String[]) list.toArray(strArr);
        return zEquals ? Arrays.asList(e.d(strArr2)) : Arrays.asList(e.h(strArr2));
    }

    @R1.a
    public String format(double d7) {
        return this.f10508o.b(d7);
    }

    @R1.a
    public List<Map<String, String>> formatToParts(double d7) {
        ArrayList arrayList = new ArrayList();
        AttributedCharacterIterator attributedCharacterIteratorA = this.f10508o.a(d7);
        StringBuilder sb = new StringBuilder();
        for (char cFirst = attributedCharacterIteratorA.first(); cFirst != 65535; cFirst = attributedCharacterIteratorA.next()) {
            sb.append(cFirst);
            if (attributedCharacterIteratorA.getIndex() + 1 == attributedCharacterIteratorA.getRunLimit()) {
                Iterator<AttributedCharacterIterator.Attribute> it = attributedCharacterIteratorA.getAttributes().keySet().iterator();
                String strH = it.hasNext() ? this.f10508o.h(it.next(), d7) : "literal";
                String string = sb.toString();
                sb.setLength(0);
                HashMap map = new HashMap();
                map.put("type", strH);
                map.put("value", string);
                arrayList.add(map);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c1  */
    @R1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Map<String, Object> resolvedOptions() {
        String string;
        String str;
        int i7;
        c.f fVar;
        Integer numValueOf;
        String str2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("locale", this.f10514u.a());
        linkedHashMap.put("numberingSystem", this.f10510q);
        linkedHashMap.put("style", this.f10494a.toString());
        c.h hVar = this.f10494a;
        if (hVar != c.h.CURRENCY) {
            if (hVar == c.h.UNIT) {
                linkedHashMap.put("unit", this.f10498e);
                string = this.f10499f.toString();
                str = "unitDisplay";
            }
            i7 = this.f10501h;
            if (i7 != -1) {
                linkedHashMap.put("minimumIntegerDigits", Integer.valueOf(i7));
            }
            fVar = this.f10506m;
            if (fVar != c.f.SIGNIFICANT_DIGITS) {
                int i8 = this.f10505l;
                if (i8 != -1) {
                    linkedHashMap.put("minimumSignificantDigits", Integer.valueOf(i8));
                }
                int i9 = this.f10504k;
                if (i9 != -1) {
                    numValueOf = Integer.valueOf(i9);
                    str2 = "maximumSignificantDigits";
                    linkedHashMap.put(str2, numValueOf);
                }
            } else if (fVar == c.f.FRACTION_DIGITS) {
                int i10 = this.f10502i;
                if (i10 != -1) {
                    linkedHashMap.put("minimumFractionDigits", Integer.valueOf(i10));
                }
                int i11 = this.f10503j;
                if (i11 != -1) {
                    numValueOf = Integer.valueOf(i11);
                    str2 = "maximumFractionDigits";
                    linkedHashMap.put(str2, numValueOf);
                }
            }
            linkedHashMap.put("useGrouping", Boolean.valueOf(this.f10500g));
            linkedHashMap.put("notation", this.f10511r.toString());
            if (this.f10511r == c.e.COMPACT) {
                linkedHashMap.put("compactDisplay", this.f10512s.toString());
            }
            linkedHashMap.put("signDisplay", this.f10507n.toString());
            return linkedHashMap;
        }
        linkedHashMap.put("currency", this.f10495b);
        linkedHashMap.put("currencyDisplay", this.f10496c.toString());
        string = this.f10497d.toString();
        str = "currencySign";
        linkedHashMap.put(str, string);
        i7 = this.f10501h;
        if (i7 != -1) {
        }
        fVar = this.f10506m;
        if (fVar != c.f.SIGNIFICANT_DIGITS) {
        }
        linkedHashMap.put("useGrouping", Boolean.valueOf(this.f10500g));
        linkedHashMap.put("notation", this.f10511r.toString());
        if (this.f10511r == c.e.COMPACT) {
        }
        linkedHashMap.put("signDisplay", this.f10507n.toString());
        return linkedHashMap;
    }
}
