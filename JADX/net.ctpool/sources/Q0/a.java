package Q0;

import F5.g;
import i5.q;
import j5.AbstractC1787F;
import java.util.Locale;
import java.util.Map;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f2740a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f2741b = AbstractC1787F.i(q.a("mkv", "video/x-matroska"), q.a("glb", "model/gltf-binary"));

    private a() {
    }

    private final String a(String str) {
        int iV = g.V(str, '.', 0, false, 6, null);
        if (iV < 0 || iV == str.length() - 1) {
            return null;
        }
        String strSubstring = str.substring(iV + 1);
        k.e(strSubstring, "this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    public static final String b(String str) {
        k.f(str, "path");
        String strA = f2740a.a(str);
        if (strA == null) {
            return null;
        }
        Locale locale = Locale.US;
        k.e(locale, "US");
        String lowerCase = strA.toLowerCase(locale);
        k.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        if (lowerCase == null) {
            return null;
        }
        String strA2 = b.a(lowerCase);
        return strA2 == null ? (String) f2741b.get(lowerCase) : strA2;
    }

    public static final boolean c(String str) {
        if (str != null) {
            return g.B(str, "video/", false, 2, null);
        }
        return false;
    }
}
