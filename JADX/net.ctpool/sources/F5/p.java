package F5;

import j5.AbstractC1784C;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import w5.y;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public abstract class p extends o {
    public static /* synthetic */ boolean A(String str, String str2, int i7, boolean z6, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            z6 = false;
        }
        return g.y(str, str2, i7, z6);
    }

    public static /* synthetic */ boolean B(String str, String str2, boolean z6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z6 = false;
        }
        return g.z(str, str2, z6);
    }

    public static byte[] m(String str) {
        w5.k.f(str, "<this>");
        byte[] bytes = str.getBytes(d.f1104b);
        w5.k.e(bytes, "getBytes(...)");
        return bytes;
    }

    public static final boolean n(String str, String str2, boolean z6) {
        w5.k.f(str, "<this>");
        w5.k.f(str2, "suffix");
        return !z6 ? str.endsWith(str2) : s(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    public static /* synthetic */ boolean o(String str, String str2, boolean z6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z6 = false;
        }
        return n(str, str2, z6);
    }

    public static boolean p(String str, String str2, boolean z6) {
        return str == null ? str2 == null : !z6 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static Comparator q(y yVar) {
        w5.k.f(yVar, "<this>");
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        w5.k.e(comparator, "CASE_INSENSITIVE_ORDER");
        return comparator;
    }

    public static boolean r(CharSequence charSequence) {
        w5.k.f(charSequence, "<this>");
        if (charSequence.length() != 0) {
            Iterable iterableK = q.K(charSequence);
            if (!(iterableK instanceof Collection) || !((Collection) iterableK).isEmpty()) {
                Iterator it = iterableK.iterator();
                while (it.hasNext()) {
                    if (!b.c(charSequence.charAt(((AbstractC1784C) it).d()))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static final boolean s(String str, int i7, String str2, int i8, int i9, boolean z6) {
        w5.k.f(str, "<this>");
        w5.k.f(str2, "other");
        return !z6 ? str.regionMatches(i7, str2, i8, i9) : str.regionMatches(z6, i7, str2, i8, i9);
    }

    public static String t(CharSequence charSequence, int i7) {
        w5.k.f(charSequence, "<this>");
        if (i7 < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i7 + '.').toString());
        }
        if (i7 == 0) {
            return "";
        }
        if (i7 == 1) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = charSequence.charAt(0);
            char[] cArr = new char[i7];
            for (int i8 = 0; i8 < i7; i8++) {
                cArr[i8] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb = new StringBuilder(charSequence.length() * i7);
        AbstractC1784C abstractC1784CK = new C5.c(1, i7).iterator();
        while (abstractC1784CK.hasNext()) {
            abstractC1784CK.d();
            sb.append(charSequence);
        }
        String string = sb.toString();
        w5.k.c(string);
        return string;
    }

    public static final String u(String str, char c7, char c8, boolean z6) {
        String string;
        String str2;
        w5.k.f(str, "<this>");
        if (z6) {
            StringBuilder sb = new StringBuilder(str.length());
            for (int i7 = 0; i7 < str.length(); i7++) {
                char cCharAt = str.charAt(i7);
                if (c.d(cCharAt, c7, z6)) {
                    cCharAt = c8;
                }
                sb.append(cCharAt);
            }
            string = sb.toString();
            str2 = "toString(...)";
        } else {
            string = str.replace(c7, c8);
            str2 = "replace(...)";
        }
        w5.k.e(string, str2);
        return string;
    }

    public static final String v(String str, String str2, String str3, boolean z6) {
        w5.k.f(str, "<this>");
        w5.k.f(str2, "oldValue");
        w5.k.f(str3, "newValue");
        int i7 = 0;
        int iN = q.N(str, str2, 0, z6);
        if (iN < 0) {
            return str;
        }
        int length = str2.length();
        int iC = C5.g.c(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        do {
            sb.append((CharSequence) str, i7, iN);
            sb.append(str3);
            i7 = iN + length;
            if (iN >= str.length()) {
                break;
            }
            iN = q.N(str, str2, iN + iC, z6);
        } while (iN > 0);
        sb.append((CharSequence) str, i7, str.length());
        String string = sb.toString();
        w5.k.e(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String w(String str, char c7, char c8, boolean z6, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            z6 = false;
        }
        return u(str, c7, c8, z6);
    }

    public static /* synthetic */ String x(String str, String str2, String str3, boolean z6, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            z6 = false;
        }
        return v(str, str2, str3, z6);
    }

    public static boolean y(String str, String str2, int i7, boolean z6) {
        w5.k.f(str, "<this>");
        w5.k.f(str2, "prefix");
        return !z6 ? str.startsWith(str2, i7) : s(str, i7, str2, 0, str2.length(), z6);
    }

    public static boolean z(String str, String str2, boolean z6) {
        w5.k.f(str, "<this>");
        w5.k.f(str2, "prefix");
        return !z6 ? str.startsWith(str2) : s(str, 0, str2, 0, str2.length(), z6);
    }
}
