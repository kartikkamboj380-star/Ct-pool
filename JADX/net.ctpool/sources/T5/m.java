package T5;

import com.google.android.gms.common.internal.ImagesContract;
import j5.AbstractC1809n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f3578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f3579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f3580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f3581d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f3582e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f3583f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f3584g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f3585h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f3586i;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final b f3577n = new b(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Pattern f3573j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Pattern f3574k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Pattern f3575l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Pattern f3576m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f3587a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f3588b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f3590d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f3592f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f3593g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f3594h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f3595i;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f3589c = 253402300799999L;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f3591e = "/";

        private final a c(String str, boolean z6) {
            String strE = U5.a.e(str);
            if (strE != null) {
                this.f3590d = strE;
                this.f3595i = z6;
                return this;
            }
            throw new IllegalArgumentException("unexpected domain: " + str);
        }

        public final m a() {
            String str = this.f3587a;
            if (str == null) {
                throw new NullPointerException("builder.name == null");
            }
            String str2 = this.f3588b;
            if (str2 == null) {
                throw new NullPointerException("builder.value == null");
            }
            long j7 = this.f3589c;
            String str3 = this.f3590d;
            if (str3 != null) {
                return new m(str, str2, j7, str3, this.f3591e, this.f3592f, this.f3593g, this.f3594h, this.f3595i, null);
            }
            throw new NullPointerException("builder.domain == null");
        }

        public final a b(String str) {
            w5.k.f(str, "domain");
            return c(str, false);
        }

        public final a d(String str) {
            w5.k.f(str, "name");
            if (!w5.k.b(F5.g.C0(str).toString(), str)) {
                throw new IllegalArgumentException("name is not trimmed".toString());
            }
            this.f3587a = str;
            return this;
        }

        public final a e(String str) {
            w5.k.f(str, "value");
            if (!w5.k.b(F5.g.C0(str).toString(), str)) {
                throw new IllegalArgumentException("value is not trimmed".toString());
            }
            this.f3588b = str;
            return this;
        }
    }

    public static final class b {
        private b() {
        }

        private final int a(String str, int i7, int i8, boolean z6) {
            while (i7 < i8) {
                char cCharAt = str.charAt(i7);
                if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && '9' >= cCharAt) || (('a' <= cCharAt && 'z' >= cCharAt) || (('A' <= cCharAt && 'Z' >= cCharAt) || cCharAt == ':'))) == (!z6)) {
                    return i7;
                }
                i7++;
            }
            return i8;
        }

        private final boolean b(String str, String str2) {
            if (w5.k.b(str, str2)) {
                return true;
            }
            return F5.g.o(str, str2, false, 2, null) && str.charAt((str.length() - str2.length()) - 1) == '.' && !U5.c.f(str);
        }

        private final String f(String str) {
            if (!(!F5.g.o(str, ".", false, 2, null))) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            String strE = U5.a.e(F5.g.h0(str, "."));
            if (strE != null) {
                return strE;
            }
            throw new IllegalArgumentException();
        }

        private final long g(String str, int i7, int i8) {
            int iA = a(str, i7, i8, false);
            Matcher matcher = m.f3576m.matcher(str);
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            int iR = -1;
            int i12 = -1;
            int i13 = -1;
            while (iA < i8) {
                int iA2 = a(str, iA + 1, i8, true);
                matcher.region(iA, iA2);
                if (i10 == -1 && matcher.usePattern(m.f3576m).matches()) {
                    String strGroup = matcher.group(1);
                    w5.k.e(strGroup, "matcher.group(1)");
                    i10 = Integer.parseInt(strGroup);
                    String strGroup2 = matcher.group(2);
                    w5.k.e(strGroup2, "matcher.group(2)");
                    i12 = Integer.parseInt(strGroup2);
                    String strGroup3 = matcher.group(3);
                    w5.k.e(strGroup3, "matcher.group(3)");
                    i13 = Integer.parseInt(strGroup3);
                } else if (i11 == -1 && matcher.usePattern(m.f3575l).matches()) {
                    String strGroup4 = matcher.group(1);
                    w5.k.e(strGroup4, "matcher.group(1)");
                    i11 = Integer.parseInt(strGroup4);
                } else if (iR == -1 && matcher.usePattern(m.f3574k).matches()) {
                    String strGroup5 = matcher.group(1);
                    w5.k.e(strGroup5, "matcher.group(1)");
                    Locale locale = Locale.US;
                    w5.k.e(locale, "Locale.US");
                    if (strGroup5 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    String lowerCase = strGroup5.toLowerCase(locale);
                    w5.k.e(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    String strPattern = m.f3574k.pattern();
                    w5.k.e(strPattern, "MONTH_PATTERN.pattern()");
                    iR = F5.g.R(strPattern, lowerCase, 0, false, 6, null) / 4;
                } else if (i9 == -1 && matcher.usePattern(m.f3573j).matches()) {
                    String strGroup6 = matcher.group(1);
                    w5.k.e(strGroup6, "matcher.group(1)");
                    i9 = Integer.parseInt(strGroup6);
                }
                iA = a(str, iA2 + 1, i8, false);
            }
            if (70 <= i9 && 99 >= i9) {
                i9 += 1900;
            }
            if (i9 >= 0 && 69 >= i9) {
                i9 += 2000;
            }
            if (!(i9 >= 1601)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(iR != -1)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(1 <= i11 && 31 >= i11)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i10 >= 0 && 23 >= i10)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i12 >= 0 && 59 >= i12)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i13 >= 0 && 59 >= i13)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(U5.c.f3988f);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i9);
            gregorianCalendar.set(2, iR - 1);
            gregorianCalendar.set(5, i11);
            gregorianCalendar.set(11, i10);
            gregorianCalendar.set(12, i12);
            gregorianCalendar.set(13, i13);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }

        private final long h(String str) {
            try {
                long j7 = Long.parseLong(str);
                if (j7 <= 0) {
                    return Long.MIN_VALUE;
                }
                return j7;
            } catch (NumberFormatException e7) {
                if (new F5.f("-?\\d+").a(str)) {
                    return F5.g.B(str, "-", false, 2, null) ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                throw e7;
            }
        }

        public final m c(u uVar, String str) {
            w5.k.f(uVar, ImagesContract.URL);
            w5.k.f(str, "setCookie");
            return d(System.currentTimeMillis(), uVar, str);
        }

        /* JADX WARN: Removed duplicated region for block: B:43:0x00d7 A[PHI: r1
          0x00d7: PHI (r1v24 long) = (r1v7 long), (r1v11 long) binds: [B:42:0x00d5, B:53:0x00fd] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final m d(long j7, u uVar, String str) {
            long j8;
            long j9;
            m mVar;
            String str2;
            String str3;
            w5.k.f(uVar, ImagesContract.URL);
            w5.k.f(str, "setCookie");
            int iO = U5.c.o(str, ';', 0, 0, 6, null);
            int iO2 = U5.c.o(str, '=', 0, iO, 2, null);
            if (iO2 == iO) {
                return null;
            }
            String strW = U5.c.W(str, 0, iO2, 1, null);
            if (strW.length() == 0 || U5.c.v(strW) != -1) {
                return null;
            }
            String strV = U5.c.V(str, iO2 + 1, iO);
            if (U5.c.v(strV) != -1) {
                return null;
            }
            int i7 = iO + 1;
            int length = str.length();
            String strF = null;
            String str4 = null;
            boolean z6 = false;
            boolean z7 = false;
            boolean z8 = false;
            boolean z9 = true;
            long jH = -1;
            long jG = 253402300799999L;
            while (i7 < length) {
                int iM = U5.c.m(str, ';', i7, length);
                int iM2 = U5.c.m(str, '=', i7, iM);
                String strV2 = U5.c.V(str, i7, iM2);
                String strV3 = iM2 < iM ? U5.c.V(str, iM2 + 1, iM) : "";
                if (F5.g.p(strV2, "expires", true)) {
                    try {
                        jG = g(strV3, 0, strV3.length());
                        z8 = true;
                    } catch (NumberFormatException | IllegalArgumentException unused) {
                    }
                } else if (F5.g.p(strV2, "max-age", true)) {
                    jH = h(strV3);
                    z8 = true;
                } else if (F5.g.p(strV2, "domain", true)) {
                    strF = f(strV3);
                    z9 = false;
                } else if (F5.g.p(strV2, "path", true)) {
                    str4 = strV3;
                } else if (F5.g.p(strV2, "secure", true)) {
                    z6 = true;
                } else if (F5.g.p(strV2, "httponly", true)) {
                    z7 = true;
                }
                i7 = iM + 1;
            }
            long j10 = Long.MIN_VALUE;
            if (jH != Long.MIN_VALUE) {
                if (jH != -1) {
                    j10 = j7 + (jH <= 9223372036854775L ? jH * ((long) 1000) : Long.MAX_VALUE);
                    if (j10 >= j7) {
                        j9 = 253402300799999L;
                        if (j10 <= 253402300799999L) {
                            j8 = j10;
                        }
                    } else {
                        j9 = 253402300799999L;
                    }
                    j8 = j9;
                } else {
                    j8 = jG;
                }
            }
            String strH = uVar.h();
            if (strF == null) {
                str2 = strH;
                mVar = null;
            } else {
                if (!b(strH, strF)) {
                    return null;
                }
                mVar = null;
                str2 = strF;
            }
            if (strH.length() != str2.length() && PublicSuffixDatabase.f21500h.c().c(str2) == null) {
                return mVar;
            }
            String strSubstring = "/";
            String str5 = str4;
            if (str5 == null || !F5.g.B(str5, "/", false, 2, mVar)) {
                String strD = uVar.d();
                int iV = F5.g.V(strD, '/', 0, false, 6, null);
                if (iV != 0) {
                    if (strD == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    strSubstring = strD.substring(0, iV);
                    w5.k.e(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                }
                str3 = strSubstring;
            } else {
                str3 = str5;
            }
            return new m(strW, strV, j8, str2, str3, z6, z7, z8, z9, null);
        }

        public final List e(u uVar, t tVar) {
            w5.k.f(uVar, ImagesContract.URL);
            w5.k.f(tVar, "headers");
            List listN = tVar.n("Set-Cookie");
            int size = listN.size();
            ArrayList arrayList = null;
            for (int i7 = 0; i7 < size; i7++) {
                m mVarC = c(uVar, (String) listN.get(i7));
                if (mVarC != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(mVarC);
                }
            }
            if (arrayList == null) {
                return AbstractC1809n.i();
            }
            List listUnmodifiableList = Collections.unmodifiableList(arrayList);
            w5.k.e(listUnmodifiableList, "Collections.unmodifiableList(cookies)");
            return listUnmodifiableList;
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private m(String str, String str2, long j7, String str3, String str4, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.f3578a = str;
        this.f3579b = str2;
        this.f3580c = j7;
        this.f3581d = str3;
        this.f3582e = str4;
        this.f3583f = z6;
        this.f3584g = z7;
        this.f3585h = z8;
        this.f3586i = z9;
    }

    public final String e() {
        return this.f3578a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (w5.k.b(mVar.f3578a, this.f3578a) && w5.k.b(mVar.f3579b, this.f3579b) && mVar.f3580c == this.f3580c && w5.k.b(mVar.f3581d, this.f3581d) && w5.k.b(mVar.f3582e, this.f3582e) && mVar.f3583f == this.f3583f && mVar.f3584g == this.f3584g && mVar.f3585h == this.f3585h && mVar.f3586i == this.f3586i) {
                return true;
            }
        }
        return false;
    }

    public final String f(boolean z6) {
        String strB;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3578a);
        sb.append('=');
        sb.append(this.f3579b);
        if (this.f3585h) {
            if (this.f3580c == Long.MIN_VALUE) {
                strB = "; max-age=0";
            } else {
                sb.append("; expires=");
                strB = Z5.c.b(new Date(this.f3580c));
            }
            sb.append(strB);
        }
        if (!this.f3586i) {
            sb.append("; domain=");
            if (z6) {
                sb.append(".");
            }
            sb.append(this.f3581d);
        }
        sb.append("; path=");
        sb.append(this.f3582e);
        if (this.f3583f) {
            sb.append("; secure");
        }
        if (this.f3584g) {
            sb.append("; httponly");
        }
        String string = sb.toString();
        w5.k.e(string, "toString()");
        return string;
    }

    public final String g() {
        return this.f3579b;
    }

    public int hashCode() {
        return ((((((((((((((((527 + this.f3578a.hashCode()) * 31) + this.f3579b.hashCode()) * 31) + Long.hashCode(this.f3580c)) * 31) + this.f3581d.hashCode()) * 31) + this.f3582e.hashCode()) * 31) + Boolean.hashCode(this.f3583f)) * 31) + Boolean.hashCode(this.f3584g)) * 31) + Boolean.hashCode(this.f3585h)) * 31) + Boolean.hashCode(this.f3586i);
    }

    public String toString() {
        return f(false);
    }

    public /* synthetic */ m(String str, String str2, long j7, String str3, String str4, boolean z6, boolean z7, boolean z8, boolean z9, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j7, str3, str4, z6, z7, z8, z9);
    }
}
