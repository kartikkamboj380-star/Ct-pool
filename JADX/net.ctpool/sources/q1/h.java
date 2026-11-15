package q1;

import android.icu.text.Collator;
import android.icu.text.NumberingSystem;
import android.icu.util.Calendar;
import android.icu.util.ULocale;
import com.tenjin.android.utils.adnetwork.TradPlusHelper;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f21856a = "calendar";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f21857b = "ca";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f21858c = "numbers";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f21859d = "nu";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f21860e = "hours";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static String f21861f = "hc";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static String f21862g = "collation";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static String f21863h = "co";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static String f21864i = "colnumeric";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static String f21865j = "kn";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static String f21866k = "colcasefirst";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static String f21867l = "kf";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static HashMap f21868m = new a();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static HashMap f21869n = new b();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Map f21870o = new c();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static Map f21871p = new d();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static Map f21872q = new e();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static Map f21873r = new f();

    class a extends HashMap {
        a() {
            put(h.f21857b, h.f21856a);
            put(h.f21859d, h.f21858c);
            put(h.f21861f, h.f21860e);
            put(h.f21863h, h.f21862g);
            put(h.f21865j, h.f21864i);
            put(h.f21867l, h.f21866k);
        }
    }

    class b extends HashMap {
        b() {
            put(h.f21856a, h.f21857b);
            put(h.f21858c, h.f21859d);
            put(h.f21860e, h.f21861f);
            put(h.f21862g, h.f21863h);
            put(h.f21864i, h.f21865j);
            put(h.f21866k, h.f21867l);
        }
    }

    class c extends HashMap {
        c() {
            put("dictionary", "dict");
            put("phonebook", "phonebk");
            put("traditional", "trad");
            put("gb2312han", "gb2312");
        }
    }

    class d extends HashMap {
        d() {
            put("gregorian", "gregory");
        }
    }

    class e extends HashMap {
        e() {
            put("traditional", "traditio");
        }
    }

    class f extends HashMap {
        f() {
            put("nu", new String[]{"adlm", "ahom", "arab", "arabext", "bali", "beng", "bhks", "brah", "cakm", "cham", "deva", "diak", "fullwide", "gong", "gonm", "gujr", "guru", "hanidec", "hmng", "hmnp", "java", "kali", "khmr", "knda", "lana", "lanatham", "laoo", "latn", "lepc", "limb", "mathbold", "mathdbl", "mathmono", "mathsanb", "mathsans", "mlym", "modi", "mong", "mroo", "mtei", "mymr", "mymrshan", "mymrtlng", "newa", "nkoo", "olck", "orya", "osma", "rohg", "saur", TradPlusHelper.KEY_SEGMENT, "shrd", "sind", "sinh", "sora", "sund", "takr", "talu", "tamldec", "telu", "thai", "tibt", "tirh", "vaii", "wara", "wcho"});
            put("co", new String[]{"big5han", "compat", "dict", "direct", "ducet", "emoji", "eor", "gb2312", "phonebk", "phonetic", "pinyin", "reformed", "searchjl", "stroke", "trad", "unihan", "zhuyin"});
            put("ca", new String[]{"buddhist", "chinese", "coptic", "dangi", "ethioaa", "ethiopic", "gregory", "hebrew", "indian", "islamic", "islamic-umalqura", "islamic-tbla", "islamic-civil", "islamic-rgsa", "iso8601", "japanese", "persian", "roc"});
        }
    }

    public static String a(String str) {
        return f21868m.containsKey(str) ? (String) f21868m.get(str) : str;
    }

    public static String b(String str) {
        return f21869n.containsKey(str) ? (String) f21869n.get(str) : str;
    }

    public static boolean c(String str, String str2, q1.b bVar) {
        ULocale uLocale = (ULocale) bVar.h();
        String[] availableNames = new String[0];
        if (str.equals("co")) {
            if (str2.equals("standard") || str2.equals("search")) {
                return false;
            }
            availableNames = Collator.getKeywordValuesForLocale("co", uLocale, false);
        } else if (str.equals("ca")) {
            availableNames = Calendar.getKeywordValuesForLocale("ca", uLocale, false);
        } else if (str.equals("nu")) {
            availableNames = NumberingSystem.getAvailableNames();
        }
        if (availableNames.length == 0) {
            return true;
        }
        return Arrays.asList(availableNames).contains(str2);
    }

    public static String d(String str) {
        return !f21871p.containsKey(str) ? str : (String) f21871p.get(str);
    }

    public static String e(String str) {
        Map map = f21870o;
        return !map.containsKey(str) ? str : (String) map.get(str);
    }

    public static Object f(String str, Object obj) {
        return (str.equals("ca") && q1.d.m(obj)) ? d((String) obj) : (str.equals("nu") && q1.d.m(obj)) ? g((String) obj) : (str.equals("co") && q1.d.m(obj)) ? e((String) obj) : (str.equals("kn") && q1.d.m(obj) && obj.equals("yes")) ? q1.d.r("true") : ((str.equals("kn") || str.equals("kf")) && q1.d.m(obj) && obj.equals("no")) ? q1.d.r("false") : obj;
    }

    public static String g(String str) {
        return !f21872q.containsKey(str) ? str : (String) f21872q.get(str);
    }
}
