package T5;

import j5.AbstractC1803h;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f3646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f3647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f3648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String[] f3649d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f3645g = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Pattern f3643e = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Pattern f3644f = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    public static final class a {
        private a() {
        }

        public final x a(String str) {
            w5.k.f(str, "$this$toMediaType");
            Matcher matcher = x.f3643e.matcher(str);
            if (!matcher.lookingAt()) {
                throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
            }
            String strGroup = matcher.group(1);
            w5.k.e(strGroup, "typeSubtype.group(1)");
            Locale locale = Locale.US;
            w5.k.e(locale, "Locale.US");
            if (strGroup == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = strGroup.toLowerCase(locale);
            w5.k.e(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            String strGroup2 = matcher.group(2);
            w5.k.e(strGroup2, "typeSubtype.group(2)");
            w5.k.e(locale, "Locale.US");
            if (strGroup2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase2 = strGroup2.toLowerCase(locale);
            w5.k.e(lowerCase2, "(this as java.lang.String).toLowerCase(locale)");
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = x.f3644f.matcher(str);
            for (int iEnd = matcher.end(); iEnd < str.length(); iEnd = matcher2.end()) {
                matcher2.region(iEnd, str.length());
                if (!matcher2.lookingAt()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Parameter is not formatted correctly: \"");
                    String strSubstring = str.substring(iEnd);
                    w5.k.e(strSubstring, "(this as java.lang.String).substring(startIndex)");
                    sb.append(strSubstring);
                    sb.append("\" for: \"");
                    sb.append(str);
                    sb.append('\"');
                    throw new IllegalArgumentException(sb.toString().toString());
                }
                String strGroup3 = matcher2.group(1);
                if (strGroup3 != null) {
                    String strGroup4 = matcher2.group(2);
                    if (strGroup4 == null) {
                        strGroup4 = matcher2.group(3);
                    } else if (F5.g.B(strGroup4, "'", false, 2, null) && F5.g.o(strGroup4, "'", false, 2, null) && strGroup4.length() > 2) {
                        strGroup4 = strGroup4.substring(1, strGroup4.length() - 1);
                        w5.k.e(strGroup4, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    }
                    arrayList.add(strGroup3);
                    arrayList.add(strGroup4);
                }
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return new x(str, lowerCase, lowerCase2, (String[]) array, null);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }

        public final x b(String str) {
            w5.k.f(str, "$this$toMediaTypeOrNull");
            try {
                return a(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private x(String str, String str2, String str3, String[] strArr) {
        this.f3646a = str;
        this.f3647b = str2;
        this.f3648c = str3;
        this.f3649d = strArr;
    }

    public static /* synthetic */ Charset d(x xVar, Charset charset, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            charset = null;
        }
        return xVar.c(charset);
    }

    public static final x f(String str) {
        return f3645g.b(str);
    }

    public final Charset c(Charset charset) {
        String strE = e("charset");
        if (strE == null) {
            return charset;
        }
        try {
            return Charset.forName(strE);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public final String e(String str) {
        w5.k.f(str, "name");
        C5.a aVarK = C5.g.k(AbstractC1803h.t(this.f3649d), 2);
        int iF = aVarK.f();
        int iH = aVarK.h();
        int i7 = aVarK.i();
        if (i7 >= 0) {
            if (iF > iH) {
                return null;
            }
        } else if (iF < iH) {
            return null;
        }
        while (!F5.g.p(this.f3649d[iF], str, true)) {
            if (iF == iH) {
                return null;
            }
            iF += i7;
        }
        return this.f3649d[iF + 1];
    }

    public boolean equals(Object obj) {
        return (obj instanceof x) && w5.k.b(((x) obj).f3646a, this.f3646a);
    }

    public final String g() {
        return this.f3647b;
    }

    public int hashCode() {
        return this.f3646a.hashCode();
    }

    public String toString() {
        return this.f3646a;
    }

    public /* synthetic */ x(String str, String str2, String str3, String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, strArr);
    }
}
