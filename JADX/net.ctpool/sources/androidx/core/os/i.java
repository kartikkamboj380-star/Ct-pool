package androidx.core.os;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final i f7164b = a(new Locale[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f7165a;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Locale[] f7166a = {new Locale("en", "XA"), new Locale("ar", "XB")};

        static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }

        private static boolean b(Locale locale) {
            for (Locale locale2 : f7166a) {
                if (locale2.equals(locale)) {
                    return true;
                }
            }
            return false;
        }

        static boolean c(Locale locale, Locale locale2) {
            if (locale.equals(locale2)) {
                return true;
            }
            if (!locale.getLanguage().equals(locale2.getLanguage()) || b(locale) || b(locale2)) {
                return false;
            }
            String strA = androidx.core.text.c.a(locale);
            if (!strA.isEmpty()) {
                return strA.equals(androidx.core.text.c.a(locale2));
            }
            String country = locale.getCountry();
            return country.isEmpty() || country.equals(locale2.getCountry());
        }
    }

    static class b {
        static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        static LocaleList b() {
            return LocaleList.getAdjustedDefault();
        }

        static LocaleList c() {
            return LocaleList.getDefault();
        }
    }

    private i(j jVar) {
        this.f7165a = jVar;
    }

    public static i a(Locale... localeArr) {
        return i(b.a(localeArr));
    }

    public static i b(String str) {
        if (str == null || str.isEmpty()) {
            return e();
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i7 = 0; i7 < length; i7++) {
            localeArr[i7] = a.a(strArrSplit[i7]);
        }
        return a(localeArr);
    }

    public static i d() {
        return i(b.c());
    }

    public static i e() {
        return f7164b;
    }

    public static i i(LocaleList localeList) {
        return new i(new k(localeList));
    }

    public Locale c(int i7) {
        return this.f7165a.get(i7);
    }

    public boolean equals(Object obj) {
        return (obj instanceof i) && this.f7165a.equals(((i) obj).f7165a);
    }

    public boolean f() {
        return this.f7165a.isEmpty();
    }

    public int g() {
        return this.f7165a.size();
    }

    public String h() {
        return this.f7165a.a();
    }

    public int hashCode() {
        return this.f7165a.hashCode();
    }

    public String toString() {
        return this.f7165a.toString();
    }
}
