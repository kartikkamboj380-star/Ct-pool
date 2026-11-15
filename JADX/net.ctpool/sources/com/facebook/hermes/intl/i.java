package com.facebook.hermes.intl;

import android.icu.text.DateFormat;
import android.icu.text.NumberingSystem;
import android.icu.text.SimpleDateFormat;
import android.icu.util.Calendar;
import android.icu.util.TimeZone;
import android.icu.util.ULocale;
import com.facebook.hermes.intl.b;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class i implements com.facebook.hermes.intl.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DateFormat f10659a = null;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f10660a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f10661b;

        static {
            int[] iArr = new int[b.k.values().length];
            f10661b = iArr;
            try {
                iArr[b.k.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10661b[b.k.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10661b[b.k.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10661b[b.k.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10661b[b.k.UNDEFINED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[b.EnumC0200b.values().length];
            f10660a = iArr2;
            try {
                iArr2[b.EnumC0200b.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10660a[b.EnumC0200b.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f10660a[b.EnumC0200b.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f10660a[b.EnumC0200b.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f10660a[b.EnumC0200b.UNDEFINED.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    private static class b {
        public static String a(String str) {
            StringBuilder sb = new StringBuilder();
            boolean z6 = false;
            for (int i7 = 0; i7 < str.length(); i7++) {
                char cCharAt = str.charAt(i7);
                if (cCharAt == '\'') {
                    z6 = !z6;
                } else if (!z6 && ((cCharAt >= 'A' && cCharAt <= 'Z') || (cCharAt >= 'a' && cCharAt <= 'z'))) {
                    sb.append(str.charAt(i7));
                }
            }
            return sb.toString();
        }
    }

    i() {
    }

    private static String i(q1.b bVar, b.EnumC0200b enumC0200b, b.k kVar) throws q1.e {
        DateFormat dateInstance;
        if (enumC0200b == b.EnumC0200b.UNDEFINED) {
            dateInstance = DateFormat.getTimeInstance(m(kVar), (ULocale) bVar.h());
        } else {
            b.k kVar2 = b.k.UNDEFINED;
            int iL = l(enumC0200b);
            dateInstance = kVar == kVar2 ? DateFormat.getDateInstance(iL, (ULocale) bVar.h()) : DateFormat.getDateTimeInstance(iL, m(kVar), (ULocale) bVar.h());
        }
        return ((SimpleDateFormat) dateInstance).toLocalizedPattern();
    }

    private static String j(q1.b bVar, b.m mVar, b.d dVar, b.n nVar, b.i iVar, b.c cVar, b.f fVar, b.h hVar, b.j jVar, b.l lVar, b.g gVar, b.EnumC0200b enumC0200b, b.k kVar, Object obj) {
        StringBuilder sb = new StringBuilder();
        if (enumC0200b == b.EnumC0200b.UNDEFINED && kVar == b.k.UNDEFINED) {
            sb.append(mVar.h());
            sb.append(dVar.h());
            sb.append(nVar.h());
            sb.append(iVar.h());
            sb.append(cVar.h());
            sb.append((gVar == b.g.H11 || gVar == b.g.H12) ? fVar.h() : fVar.j());
            sb.append(hVar.h());
            sb.append(jVar.h());
            sb.append(lVar.h());
        } else {
            sb.append(i(bVar, enumC0200b, kVar));
            HashMap mapB = bVar.b();
            if (mapB.containsKey("hc")) {
                String str = (String) mapB.get("hc");
                if (str == "h11" || str == "h12") {
                    k(sb, new char[]{'H', 'K', 'k'}, 'h');
                } else if (str == "h23" || str == "h24") {
                    k(sb, new char[]{'h', 'H', 'K'}, 'k');
                }
            }
            if (gVar == b.g.H11 || gVar == b.g.H12) {
                k(sb, new char[]{'H', 'K', 'k'}, 'h');
            } else if (gVar == b.g.H23 || gVar == b.g.H24) {
                k(sb, new char[]{'h', 'H', 'K'}, 'k');
            }
            if (!q1.d.n(obj) && !q1.d.j(obj)) {
                if (q1.d.e(obj)) {
                    k(sb, new char[]{'H', 'K', 'k'}, 'h');
                } else {
                    k(sb, new char[]{'h', 'H', 'K'}, 'k');
                }
            }
        }
        return sb.toString();
    }

    private static void k(StringBuilder sb, char[] cArr, char c7) {
        for (int i7 = 0; i7 < sb.length(); i7++) {
            int length = cArr.length;
            int i8 = 0;
            while (true) {
                if (i8 < length) {
                    if (sb.charAt(i7) == cArr[i8]) {
                        sb.setCharAt(i7, c7);
                        break;
                    }
                    i8++;
                }
            }
        }
    }

    static int l(b.EnumC0200b enumC0200b) throws q1.e {
        int i7 = a.f10660a[enumC0200b.ordinal()];
        if (i7 == 1) {
            return 0;
        }
        if (i7 == 2) {
            return 1;
        }
        if (i7 == 3) {
            return 2;
        }
        if (i7 == 4) {
            return 3;
        }
        throw new q1.e("Invalid DateStyle: " + enumC0200b.toString());
    }

    static int m(b.k kVar) throws q1.e {
        int i7 = a.f10661b[kVar.ordinal()];
        if (i7 == 1) {
            return 0;
        }
        if (i7 == 2) {
            return 1;
        }
        if (i7 == 3) {
            return 2;
        }
        if (i7 == 4) {
            return 3;
        }
        throw new q1.e("Invalid DateStyle: " + kVar.toString());
    }

    @Override // com.facebook.hermes.intl.b
    public AttributedCharacterIterator a(double d7) {
        return this.f10659a.formatToCharacterIterator(Double.valueOf(d7));
    }

    @Override // com.facebook.hermes.intl.b
    public String b(double d7) {
        return this.f10659a.format(new Date((long) d7));
    }

    @Override // com.facebook.hermes.intl.b
    public String c(q1.b bVar) {
        return NumberingSystem.getInstance((ULocale) bVar.h()).getName();
    }

    @Override // com.facebook.hermes.intl.b
    public b.g d(q1.b bVar) {
        try {
            String strA = b.a(((SimpleDateFormat) DateFormat.getTimeInstance(0, (ULocale) bVar.h())).toPattern());
            return strA.contains(String.valueOf('h')) ? b.g.H12 : strA.contains(String.valueOf('K')) ? b.g.H11 : strA.contains(String.valueOf('H')) ? b.g.H23 : b.g.H24;
        } catch (ClassCastException unused) {
            return b.g.H24;
        }
    }

    @Override // com.facebook.hermes.intl.b
    public String e(q1.b bVar) {
        return q1.h.d(DateFormat.getDateInstance(3, (ULocale) bVar.h()).getCalendar().getType());
    }

    @Override // com.facebook.hermes.intl.b
    public void f(q1.b bVar, String str, String str2, b.e eVar, b.m mVar, b.d dVar, b.n nVar, b.i iVar, b.c cVar, b.f fVar, b.h hVar, b.j jVar, b.l lVar, b.g gVar, Object obj, b.EnumC0200b enumC0200b, b.k kVar, Object obj2) throws q1.e {
        Calendar calendar;
        String strJ = j(bVar, mVar, dVar, nVar, iVar, cVar, fVar, hVar, jVar, lVar, gVar, enumC0200b, kVar, obj2);
        if (str.isEmpty()) {
            calendar = null;
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(q1.d.h(str));
            q1.b bVarE = bVar.e();
            bVarE.g("ca", arrayList);
            calendar = Calendar.getInstance((ULocale) bVarE.h());
        }
        if (!str2.isEmpty()) {
            try {
                if (NumberingSystem.getInstanceByName(q1.d.h(str2)) == null) {
                    throw new q1.e("Invalid numbering system: " + str2);
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(q1.d.h(str2));
                bVar.g("nu", arrayList2);
            } catch (RuntimeException unused) {
                throw new q1.e("Invalid numbering system: " + str2);
            }
        }
        ULocale uLocale = (ULocale) bVar.h();
        this.f10659a = calendar != null ? DateFormat.getPatternInstance(calendar, strJ, uLocale) : DateFormat.getPatternInstance(strJ, uLocale);
        if (q1.d.n(obj) || q1.d.j(obj)) {
            return;
        }
        this.f10659a.setTimeZone(TimeZone.getTimeZone(q1.d.h(obj)));
    }

    @Override // com.facebook.hermes.intl.b
    public String g(AttributedCharacterIterator.Attribute attribute, String str) {
        if (attribute == DateFormat.Field.DAY_OF_WEEK) {
            return "weekday";
        }
        if (attribute == DateFormat.Field.ERA) {
            return "era";
        }
        if (attribute != DateFormat.Field.YEAR) {
            return attribute == DateFormat.Field.MONTH ? "month" : attribute == DateFormat.Field.DAY_OF_MONTH ? "day" : (attribute == DateFormat.Field.HOUR0 || attribute == DateFormat.Field.HOUR1 || attribute == DateFormat.Field.HOUR_OF_DAY0 || attribute == DateFormat.Field.HOUR_OF_DAY1) ? "hour" : attribute == DateFormat.Field.MINUTE ? "minute" : attribute == DateFormat.Field.SECOND ? "second" : attribute == DateFormat.Field.TIME_ZONE ? "timeZoneName" : attribute == DateFormat.Field.AM_PM ? "dayPeriod" : attribute.toString().equals("android.icu.text.DateFormat$Field(related year)") ? "relatedYear" : "literal";
        }
        try {
            Double.parseDouble(str);
            return "year";
        } catch (NumberFormatException unused) {
            return "yearName";
        }
    }

    @Override // com.facebook.hermes.intl.b
    public String h(q1.b bVar) {
        return Calendar.getInstance((ULocale) bVar.h()).getTimeZone().getID();
    }
}
